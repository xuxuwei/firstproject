package com.tiedao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tiedao.pojo.TbUser;
import com.tiedao.pojo.Tbgrade;
import com.tiedao.util.DBUtil;

/**
 * 对数据库表tb_user的操作
 * 
 * @author yangming
 * 
 */
public class TbUserDao {
	/**
	 * 登录
	 * 
	 * @return
	 */
	public TbUser login(TbUser user) {
		TbUser result = null;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "select * from tb_user where uname=? and pass=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setString(1, user.getUname());
			pstmt.setString(2, user.getPass());

			// 3、执行SQL语句
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = new TbUser(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	
	public TbUser selectById(TbUser user) {
		TbUser result = null;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "select * from tb_user where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setInt(1, user.getId());

			// 3、执行SQL语句
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = new TbUser(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public TbUser selectByuname(TbUser user) {
		TbUser result = null;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "select * from tb_user where uname=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setString(1, user.getUname());

			// 3、执行SQL语句
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = new TbUser(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public Tbgrade selectgradeById(Tbgrade grade) {
		Tbgrade result = null;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "select * from tb_grade where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setInt(1, grade.getId());

			// 3、执行SQL语句
			rs = pstmt.executeQuery();

			if (rs.next()) {
				 result = new Tbgrade(rs.getInt(1), rs.getInt(2),
						rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<TbUser> findAll() {
		List<TbUser> userList = new ArrayList<TbUser>();
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "select * from tb_user";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 3、执行SQL语句
			rs = pstmt.executeQuery();

			while (rs.next()) {
				TbUser result = new TbUser(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));
				userList.add(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}
	
	public List<TbUser> findAllstudent() {
		List<TbUser> userList = new ArrayList<TbUser>();
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "select * from tb_user where roleid=0";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 3、执行SQL语句
			rs = pstmt.executeQuery();

			while (rs.next()) {
				TbUser result = new TbUser(rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8));
				userList.add(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userList;
	}
	
	public List<Tbgrade> findAllgrade() {
		List<Tbgrade> gradeList = new ArrayList<Tbgrade>();
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "select * from tb_grade";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 3、执行SQL语句
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Tbgrade result = new Tbgrade(rs.getInt(1), rs.getInt(2),
						rs.getInt(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getInt(8));
				gradeList.add(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return gradeList;
	}
	

	/**
	 * 保存用户信息
	 * 
	 * @param tbUser
	 */
	public boolean save(TbUser tbUser) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "insert into tb_user values(null,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setString(1, tbUser.getUname());
			pstmt.setString(2, tbUser.getPass());
			pstmt.setString(3, tbUser.getSex());
			pstmt.setString(4, tbUser.getEducation());
			pstmt.setString(5, tbUser.getHobbies());
			pstmt.setString(6, tbUser.getDemo());
			pstmt.setInt(7, tbUser.getRoleid());

			// 3、执行SQL语句
			int i = pstmt.executeUpdate();

			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	/**
	 * 修改
	 * 
	 * @param tbUser
	 * @return
	 */
	public boolean update(TbUser tbUser) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "update tb_user set uname=?,pass=?,sex=?,education=?,hobbies=?,demo=?,roleid=? where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setString(1, tbUser.getUname());
			pstmt.setString(2, tbUser.getPass());
			pstmt.setString(3, tbUser.getSex());
			pstmt.setString(4, tbUser.getEducation());
			pstmt.setString(5, tbUser.getHobbies());
			pstmt.setString(6, tbUser.getDemo());
			pstmt.setInt(7, tbUser.getRoleid());
			pstmt.setInt(8, tbUser.getId());

			// 3、执行SQL语句
			int i = pstmt.executeUpdate();

			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean updategrade(Tbgrade grade) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "update tb_grade set rid=?, studentid=?, name=?, rname=?, english=?, math=?,chinese=? where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setInt(1, grade.getRid());
			pstmt.setInt(2, grade.getStudentid());
			pstmt.setString(3, grade.getName());
			pstmt.setString(4, grade.getRname());
			pstmt.setInt(5, grade.getEnglish());
			pstmt.setInt(6, grade.getMath());
			pstmt.setInt(7, grade.getChinese());
			pstmt.setInt(8, grade.getId());

			// 3、执行SQL语句
			int i = pstmt.executeUpdate();

			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean savegrade(Tbgrade grade) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "insert into tb_grade values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setInt(1, grade.getId());
			pstmt.setInt(2, grade.getRid());
			pstmt.setInt(3, grade.getStudentid());
			pstmt.setString(4, grade.getName());
			pstmt.setString(5, grade.getRname());
			pstmt.setInt(6, grade.getEnglish());
			pstmt.setInt(7, grade.getMath());
			pstmt.setInt(8, grade.getChinese());
		

			// 3、执行SQL语句
			int i = pstmt.executeUpdate();

			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	public boolean power(TbUser tbUser) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "update tb_user set roleid=? where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			
			pstmt.setInt(1, tbUser.getRoleid());
			pstmt.setInt(2, tbUser.getId());

			// 3、执行SQL语句
			int i = pstmt.executeUpdate();

			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	/**
	 * 删除
	 * 
	 * @param tbUser
	 * @return
	 */
	public boolean delete(TbUser tbUser) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "delete from tb_user where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setInt(1, tbUser.getId());

			// 3、执行SQL语句
			int i = pstmt.executeUpdate();

			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	public boolean deletegrade(Tbgrade grade) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "delete from tb_grade where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setInt(1, grade.getId());

			// 3、执行SQL语句
			int i = pstmt.executeUpdate();

			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		TbUserDao dao = new TbUserDao();
		TbUser user = new TbUser();
		user.setUname("admin");
		user.setPass("admin");
		TbUser result = dao.login(user);
		System.out.println(result);
	}
}
