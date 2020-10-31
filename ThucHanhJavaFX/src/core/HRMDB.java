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

// Viết contructor cho phép tạo đối tượng với các tham số cần thiết
	public HRMDB(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	@Override
	public boolean addStudent(Student student) {
// Tạo kết nối database với 3 tham số truyền vào
		conn = DBConnection.create(jdbcURL, jdbcUsername, jdbcPassword);
// Tạo câu truy vấn kiểu prepare
		String sqlCommand = "INSERT INTO tblstudent VALUES(?, ?, ?)";
		PreparedStatement pst = null;

		boolean result = false;
		try {
// Tạo đối tượng truy vấn kiểu Prepare
			pst = conn.prepareStatement(sqlCommand);
// Đưa dữ liệu vào các vị trí dấu hỏi (?)
			pst.setString(1, student.getCode());
			pst.setString(2, student.getFullname());
			pst.setString(3, student.getClass_());
// Thực hiện chạy câu truy vấn
			int i = pst.executeUpdate();
// Nếu thành công, 1 bản ghi được thêm vào
			if (i == 1) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Đóng kết nối trong khối finally (bắt buộc chạy)
			DBConnection.closePreparedStatement(pst);
			DBConnection.closeConnect(conn);
		}
		return result;
	}

	@Override
	public boolean updateStudent(Student student) {
		conn = DBConnection.create(jdbcURL, jdbcUsername, jdbcPassword);
		String sqlCommand = "UPDATE tblstudent SET fullname = ?, class = ? " +

				"WHERE studentCode = ?";

		PreparedStatement pst = null;
		boolean result = false;
		try {
			pst = conn.prepareStatement(sqlCommand);
			pst.setString(1, student.getFullname());
			pst.setString(2, student.getClass_());
			pst.setString(3, student.getCode());
			int i = pst.executeUpdate();
			if (i == 1) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closePreparedStatement(pst);
			DBConnection.closeConnect(conn);
		}
		return result;
	}

	@Override
	public boolean deleteStudent(String studentCode) {
		conn = DBConnection.create(jdbcURL, jdbcUsername, jdbcPassword);
		String sqlCommand = "DELETE FROM tblstudent WHERE studentCode = ?";
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
			e.printStackTrace();
		} finally {
			DBConnection.closePreparedStatement(pst);
			DBConnection.closeConnect(conn);
		}
		return result;
	}

	@Override
	public List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		Statement statement = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.create(jdbcURL, jdbcUsername, jdbcPassword);
			statement = conn.createStatement();
			rs = statement.executeQuery("Select * from tblstudent");
			String studentCode;
			String fullname;
			String class_;
// Duyệt qua danh sách các bản thi nhận được trong đối tượng ResultSet

			while (rs.next()) {
				studentCode = rs.getString(1);
				fullname = rs.getString(2);
				class_ = rs.getString(3);
// Thêm vào list
				studentList.add(new Student(studentCode, fullname,

						class_));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeResultSet(rs);
			DBConnection.closeStatement(statement);
			DBConnection.closeConnect(conn);
		}
		return studentList;
	}
}