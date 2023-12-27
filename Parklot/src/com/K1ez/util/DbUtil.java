package com.K1ez.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 物联网2101张奕辰,韩子旭，杨丰赫
 * 此类的作用是连接本机的MySQL数据库，其中需要JDBC插件。
 * 类中包括登录所需的启动url、用户名、密码和JDBC（连接四件套）。
 * 本类已进行必要注明。
 */
public class DbUtil {
    private String dbUrl = "jdbc:mysql://localhost:3306/parklot?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
    private String dbUserName = "root";
    private String dbPassWord = "Zyc030915"; //账号密码是本机的localhost密码，在其他位置需要替换，包括dbUrl。
    private String jdbcName = "com.mysql.cj.jdbc.Driver"; //MySQL8.0版本之后需要的新JDBC配置。
    /*
    好兄弟Oracle数据库的连接方法暂不清楚，网上应该有，而且基本类似
     */

    public Connection getCon() {
        /**
         * @author 物联网2101张奕辰
         * 本类已进行必要注明
         * 此方法的作用是集合连接数据库共用的代码便于使用。
         */
        try{
            Class.forName(jdbcName);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        Connection con = null;

        try {
            con = DriverManager.getConnection(dbUrl,dbUserName,dbPassWord);//输入所需数据连接本机数据库。
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public void closeCon(Connection con) throws Exception{
        /**
         * @author 物联网2101韩子旭
         * 此方法为关闭数据库连接的方法
         */
        if(con != null){
            con.close();
        }
    }

    public static void main(String[] args) {
        /**
         * @author 物联网2101杨丰赫
         * 此类的主函数为测试函数，在程序封装后应当删除或注释掉。
         */
        DbUtil dbUtil = new DbUtil();
        try {
            dbUtil.getCon();
            System.out.println("数据库连接成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
