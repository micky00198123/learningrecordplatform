package com.cslg.lrp.dao.impl;

import com.cslg.lrp.dao.NewsDao;
import com.cslg.lrp.domain.LoginData;
import com.cslg.lrp.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class NewsDaoImpl implements NewsDao {

    private static final Logger logger = Logger.getLogger(String.valueOf(NewsDaoImpl.class));
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public boolean getNewsTitle(String id) {
        con = JDBCUtil.getConnection();
        String sql = " select*from user where userName=? ";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            JDBCUtil.release(con, ps, rs);
        }
    }
    @Override
    public boolean getOldsTitle(LoginData user1) {
        String id=user1.getUserId();
        String password=user1.getPassword();
        try {
            con = JDBCUtil.getConnection();
            String sql = "select * from user where `userId` =? and `userPassword` =?";
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if(rs.next()) {
                System.out.println("登录成功");
                return true;
            }else {
                System.out.println("登录失败");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            JDBCUtil.release(con, ps, rs);
        }
    }

    @Override
    public boolean add(User users,LoginData user) {
        con= JDBCUtil.getConnection();
        String sql=" insert into user(userId,userName,userSex,userGrade,userTech,userSingle) values(?,?,?,?,?,?) ";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1, users.getUserId());
            ps.setString(2, users.getUserName());
            ps.setString(3, users.getUserSex());
            ps.setInt(4,  users.getUserGrade());
            ps.setString(5, users.getUserTech());
            ps.setString(6, users.getUserSingle());
            int ud=ps.executeUpdate();
            if(ud>0) {
                return true;
            }else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
