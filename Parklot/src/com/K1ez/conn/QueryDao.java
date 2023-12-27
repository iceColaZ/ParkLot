package com.K1ez.conn;
import com.K1ez.model.CarInf;
import com.K1ez.model.Record;
import com.K1ez.util.StringUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ���ݿ�Ĳ�ѯ���������࣬���а�����ѯͣ������λ����ѯͣ������ǰ���ݡ�ͣ����¼���ݼ��ϡ�
 * @author ������2101���ȳ�������������
 */

public class QueryDao extends BaseDao{
    /**
     * ��ѯͣ�������೵λ�ŵķ���������ֵΪ�������ĵ�һ�����س�λ��
     * @return String
     */
    public String Lotqry(){
        String sql = "select lotid from lot where IsEmpty=0;";
        try{
            PreparedStatement prst = con.prepareStatement(sql);
            ResultSet executeQuery = prst.executeQuery();

            if(executeQuery.next()){
                return executeQuery.getString(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    /**
     * ����ͣ����Ŀǰ���б������洢��List�в����أ����ڴ洢��JTable�С�
     * @param carInf
     * @return List
     */

    public List<CarInf> getCarList(CarInf carInf){
        List<CarInf> retList = new  ArrayList<CarInf>();
        String sqlString = "select * from parklot";
        if(!StringUtil.isEmpty(carInf.getCarId())){
            sqlString += " where carid like '%"+carInf.getCarId()+"%'";
        }

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString);
            ResultSet executeQuery = preparedStatement.executeQuery();

            while (executeQuery.next()){
                CarInf ci = new CarInf();
                ci.setCarId(executeQuery.getString("CarId"));
                ci.setColor(executeQuery.getString("Color"));
                ci.setLotid(executeQuery.getInt("LotId"));
                retList.add(ci);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return retList;
    }

    /**
     * ����ͣ����¼���б������洢��List�в����أ����ڴ洢��JTable�С�
     * �����ѽ��б�Ҫע����
     * @param record
     * @return List
     */
    public List<Record> getRecordList(Record record){
        List<Record> retList = new ArrayList<>(); //���ڴ�ű�����������ص�List
        String sqlString = "select * from record";
        if(!StringUtil.isEmpty(record.getCarId())){ //��������κ�����Ͳ�ѯ��ô��������ͣ����¼
            sqlString += " where carid like '%"+record.getCarId()+"%'";
        } //sql��������

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString);//�����������
            ResultSet executeQuery = preparedStatement.executeQuery();

            while (executeQuery.next()){ //������������������涨��õ�retList
                Record rec = new Record();
                rec.setCarId(executeQuery.getString("CarId"));
                rec.setColor(executeQuery.getString("Color"));
                rec.setLotId(executeQuery.getInt("LotId"));
                rec.setDriver(executeQuery.getString("Driver"));
                rec.setEntrydate(executeQuery.getString("Entrydate"));
                rec.setEntrytime(executeQuery.getString("Entrytime"));
                retList.add(rec);
            }
            con.close(); //�ر����ݿ�����
        }catch (Exception e){
            e.printStackTrace();
        }

        return retList; //����ͣ����¼�ı�������
    }

}
