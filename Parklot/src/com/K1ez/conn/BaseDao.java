package com.K1ez.conn;
import com.K1ez.util.DbUtil;
import java.sql.Connection;

/**
 * @author ������2101���ȳ�
 * ����������Ǳ��̳У����ڸ��ӱ�ݵ����Ӻ��˳����ݿ�
 * ����ķ���������DbUtil����
 */
public class BaseDao {
    public Connection con = new DbUtil().getCon();//�������ݿ�����
}
