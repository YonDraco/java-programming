package core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HRMDB {
	/*
	 * Các tham số để kết nối database sẽ được truyền từ lớp ở tầng Controller (để
	 * link động có thể đổi database)
	 */
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;

	private Connection conn;

	// Viết constructor cho phép tạo đối tượng với các tham số cần thiết
	public HRMDB(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	public boolean addStudent(Student student) {
		// Tạo kết nối với database với 3 tham số truyền vào
		conn = DBConnection.create(jdbcURL, jdbcUsername, jdbcPassword);

		// Tạo câu truy vấn kiểu prepare
		String sqlCommand = "INSERT INTO tblStudent VALUES(?, ?, ?)";
		PreparedStatement pst = null;
		boolean result = false;
		try {
			// Tạo đối tượng truy vấn kiểu prepare
			pst = conn.prepareStatement(sqlCommand);

			// Đưa dữ liệu vào các vị trí dấu (?)
			pst.setString(1, student.getCode());
			pst.setString(2, student.getFullname());
			pst.setString(3, student.getClass_());

			// Thực hiện chạy câu truy vấn
			int i = pst.executeUpdate();

			// Nếu thành công 1 bản ghi được thêm vào
			if (i == 1) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {// Đóng kết nối trong khối finally (chạy bắt buộc)
			DBConnection.closePreparedStatement(pst);
			DBConnection.closeConnect(conn);
		}
		return result;
	}

	public boolean updateStudent(Student student) {
		conn = DBConnection.create(jdbcURL, jdbcUsername, jdbcPassword);
		String sqlCommand = "UPDATE tblStudent SET fullname = ?, class = ? " + "WHERE studentCode = ?";
		PreparedStatement pst = null;
		boolean result = false;
		try {
			pst = conn.prepareStatement(sqlCommand);
			pst.setString(1, jdbcURL);
			pst.setString(2, jdbcUsername);
			pst.setString(3, jdbcPassword);
			int i = pst.executeUpdate();
			if (i == 1) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			DBConnection.closePreparedStatement(pst);
			DBConnection.closeConnect(conn);
		}
		return result;
	}

	public boolean deleteStudent(String studentCode) {
		conn = DBConnection.create(jdbcURL, jdbcUsername, jdbcPassword);
		String sqlCommand = "DELETE FROM tblStudent WHERE studentCode = ?";
		PreparedStatement pst = null;
		boolean result = false;
		try {
			pst = conn.prepareStatement(sqlCommand);
			pst.setString(1, studentCode);
			int i = pst.executeUpdate();
			if (i == 1) {
				result = true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBConnection.closePreparedStatement(pst);
			DBConnection.closeConnect(conn);
		}
		return result;
	}

	public List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		Statement statement = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.create(jdbcURL, jdbcUsername, jdbcPassword);
			statement = conn.createStatement();
			rs = statement.executeQuery("Select * from tblStudent");
			String studentCode;
			String fullname;
			String class_;

			// Duyệt qua danh sách các bản ghi nhận được trong đối tượng ResultSet
			while (rs.next()) {
				studentCode = rs.getString(1);
				fullname = rs.getString(2);
				class_ = rs.getString(3);

				// Thêm vào list
				studentList.add(new Student(studentCode, fullname, class_));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(statement);
			DBConnection.closeConnect(conn);
		}
		return studentList;
	}
}
