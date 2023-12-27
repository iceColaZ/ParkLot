package com.K1ez.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ������2101���ȳ�,����������
 * ��������������ӱ�����MySQL���ݿ⣬������ҪJDBC�����
 * ���а�����¼���������url���û����������JDBC�������ļ��ף���
 * �����ѽ��б�Ҫע����
 */
public class DbUtil {
    private String dbUrl = "jdbc:mysql://localhost:3306/parklot?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
    private String dbUserName = "root";
    private String dbPassWord = "Zyc030915"; //�˺������Ǳ�����localhost���룬������λ����Ҫ�滻������dbUrl��
    private String jdbcName = "com.mysql.cj.jdbc.Driver"; //MySQL8.0�汾֮����Ҫ����JDBC���á�
    /*
    ���ֵ�Oracle���ݿ�����ӷ����ݲ����������Ӧ���У����һ�������
     */

    public Connection getCon() {
        /**
         * @author ������2101���ȳ�
         * �����ѽ��б�Ҫע��
         * �˷����������Ǽ����������ݿ⹲�õĴ������ʹ�á�
         */
        try{
            Class.forName(jdbcName);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        Connection con = null;

        try {
            con = DriverManager.getConnection(dbUrl,dbUserName,dbPassWord);//���������������ӱ������ݿ⡣
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public void closeCon(Connection con) throws Exception{
        /**
         * @author ������2101������
         * �˷���Ϊ�ر����ݿ����ӵķ���
         */
        if(con != null){
            con.close();
        }
    }

    public static void main(String[] args) {
        /**
         * @author ������2101����
         * �����������Ϊ���Ժ������ڳ����װ��Ӧ��ɾ����ע�͵���
         */
        DbUtil dbUtil = new DbUtil();
        try {
            dbUtil.getCon();
            System.out.println("���ݿ����ӳɹ�");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("���ݿ�����ʧ��");
        }
    }
}
