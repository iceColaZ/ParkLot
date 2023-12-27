package com.K1ez.conn;
import com.K1ez.model.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ������2101���ȳ�
 * ����Ա�ĵ�¼��̳�BaseDao�������������ݿ⡣
 */
public class AdminDao extends BaseDao{
    /**
     *�������ֻ����login����������ֵΪAdmin�ࣨ�����ĳ�����ⷵ��ֵ�Ƿ�Ϊ�����ж����ݿ��Ƿ��в�ѯ�����
     *�����ѽ���ע�͹�����
     * @param admin
     * @return Admin
     */
    public Admin login(Admin admin){
        String sql = "select * from admin where userName=? and passWord=?";//sql��������ַ���sql�У�����洢�͵���
        Admin adminRst = null;//����һ���µ�Admin���ڴ��淵��ֵ

        try {
            PreparedStatement prst = con.prepareStatement(sql);// �������ݿ�ӿڲ�����sql���׼����������
            prst.setString(1, admin.getUserName());//setString���������滻sql����е�'?'����һ������Ϊ�ʺŵĴ��򣨴�ǰ����
            prst.setString(2, admin.getPassWord());

            ResultSet executeQuery = prst.executeQuery();//ResultSetΪ������࣬�ý����������select�ķ��ؽ����

            if(executeQuery.next()){//.next()�������ڰѽ������ָ�������ƶ�һλ��������ĳ�ʼָ����0��
                adminRst = new Admin();//����ѯ���Ľ���洢������õ�adminRst�����ڷ���
                adminRst.setUserName(executeQuery.getString("userName"));
                adminRst.setPassWord(executeQuery.getString("passWord"));
            }

        }catch (Exception e){
            e.printStackTrace();//����ʧ�ܵĽṹ����
        }

        try {
            con.close();//�ر����ݿ�����
        }catch (SQLException e){
            e.printStackTrace();//��ӡ���ݿⷵ�����������˵��
        }

        return adminRst;//���ظոմ���ֵ��Admin�࣬�������
    }
}
