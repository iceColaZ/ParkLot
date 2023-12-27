package com.K1ez.conn;
import com.K1ez.model.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 物联网2101张奕辰
 * 管理员的登录类继承BaseDao，用于连接数据库。
 */
public class AdminDao extends BaseDao{
    /**
     *这个类中只包括login方法，返回值为Admin类（后续的程序会检测返回值是否为空来判断数据库是否有查询结果）
     *本类已进行注释工作。
     * @param admin
     * @return Admin
     */
    public Admin login(Admin admin){
        String sql = "select * from admin where userName=? and passWord=?";//sql语句存放于字符串sql中，方便存储和调用
        Admin adminRst = null;//定义一个新的Admin用于储存返回值

        try {
            PreparedStatement prst = con.prepareStatement(sql);// 创建数据库接口并输入sql语句准备进行连接
            prst.setString(1, admin.getUserName());//setString函数用于替换sql语句中的'?'，第一个参数为问号的次序（从前往后）
            prst.setString(2, admin.getPassWord());

            ResultSet executeQuery = prst.executeQuery();//ResultSet为结果集类，用结果集来储存select的返回结果。

            if(executeQuery.next()){//.next()方法用于把结果集的指针向下移动一位（结果集的初始指针在0）
                adminRst = new Admin();//将查询到的结果存储到定义好的adminRst中用于返回
                adminRst.setUserName(executeQuery.getString("userName"));
                adminRst.setPassWord(executeQuery.getString("passWord"));
            }

        }catch (Exception e){
            e.printStackTrace();//连接失败的结构集合
        }

        try {
            con.close();//关闭数据库连接
        }catch (SQLException e){
            e.printStackTrace();//打印数据库返回其他情况的说明
        }

        return adminRst;//返回刚刚存入值的Admin类，程序结束
    }
}
