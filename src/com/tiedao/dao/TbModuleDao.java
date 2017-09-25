package com.tiedao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tiedao.pojo.TbModule;
import com.tiedao.util.DBUtil;

/**
 * 对数据库表tb_module的操作
 * 
 * @author yangming
 * 
 */
public class TbModuleDao {
	public TbModule selectById(TbModule module) {
		TbModule result = null;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();
		String sql = "select * from tb_module where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);
			// 赋值
			pstmt.setInt(1, module.getId());
			// 3、执行SQL语句
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = new TbModule(rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getString(4), rs.getString(5));
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
	public List<TbModule> findAll() {
		List<TbModule> moduleList = new ArrayList<TbModule>();
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "select * from tb_module";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 3、执行SQL语句
			rs = pstmt.executeQuery();

			while (rs.next()) {
				TbModule result = new TbModule(rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getString(4), rs.getString(5));
				moduleList.add(result);
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
		return moduleList;
	}

	/**
	 * 保存用户信息
	 * 
	 * @param tbModule
	 */
	public boolean save(TbModule tbModule) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "insert into tb_module values(null,?,?,?,?)";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setString(1, tbModule.getMname());
			pstmt.setInt(2, tbModule.getUpid());
			pstmt.setString(3, tbModule.getUrl());
			pstmt.setString(4, tbModule.getDemo());

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
	 * @param tbModule
	 * @return
	 */
	public boolean update(TbModule tbModule) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "update tb_module set mname=?,upid=?,url=?,demo=? where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setString(1, tbModule.getMname());
			pstmt.setInt(2, tbModule.getUpid());
			pstmt.setString(3, tbModule.getUrl());
			pstmt.setString(4, tbModule.getDemo());
			pstmt.setInt(5, tbModule.getId());

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
	 * @param tbModule
	 * @return
	 */
	public boolean delete(TbModule tbModule) {
		boolean flag = false;
		// 1、获取数据库连接
		Connection conn = DBUtil.getConnection();

		String sql = "delete from tb_module where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {// 2、获取语句集对象
			pstmt = conn.prepareStatement(sql);

			// 赋值
			pstmt.setInt(1, tbModule.getId());

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
}
