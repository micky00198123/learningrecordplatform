package com.cslg.lrp.dao;

import com.cslg.lrp.domain.LoginData;
import com.cslg.lrp.domain.User;
import com.cslg.lrp.util.CipherProcessing;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
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
    public void getList() {

    }
    @Override
    public boolean getNewsTitle(String id) {

        con = JDBCUtil.getConnection();
        String sql = " select*from user where username=? ";

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
        CipherProcessing processing = new CipherProcessing();
        try {
            String newpassword = processing.encoderByMd5(password);
            con = JDBCUtil.getConnection();
            String sql = "select * from users where `id` =? and `password` =?";
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.setString(2,newpassword);
            rs = ps.executeQuery();
            if(rs.next()) {
                System.out.println("登录成功");
                return true;
            }else {
                System.out.println("登录失败");
                return false;
            }
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            JDBCUtil.release(con, ps, rs);
        }
    }

    @Override
    public boolean add(User users) {
        con= JDBCUtil.getConnection();
        String sql=" insert into user(userID,userName,userSex,userGrade,userDept,userTech,userSingle,userNum,userPassword) values(?,?,?,?,?,?,?,?,?) ";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, users.getUserId());
            ps.setString(2, users.getUserName());
            ps.setString(3, users.getUserSex());
            ps.setInt(4,  users.getUserGrade());
            ps.setString(5, users.getUserDept());
            ps.setString(6, users.getUserTech());
            ps.setString(7, users.getUserSingle());
            ps.setString(8, users.getUserNum());
            ps.setString(9, users.getUserPassword());
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


    @Override
    public boolean delete(User users) {
        return false;
    }

    @Override
    public boolean update(User users) {
        return false;
    }
}
