package com.K1ez.conn;
import com.K1ez.model.CarInf;
import com.K1ez.model.Record;
import com.K1ez.util.StringUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据库的查询方法集合类，其中包括查询停车场空位、查询停车场当前数据、停车记录数据集合。
 * @author 物联网2101张奕辰、韩子旭、杨丰赫
 */

public class QueryDao extends BaseDao{
    /**
     * 查询停车场空余车位号的方法，返回值为遍历表格的第一个返回车位。
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
     * 返回停车场目前的列表，遍历存储到List中并返回，用于存储到JTable中。
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
     * 返回停车记录的列表，遍历存储到List中并返回，用于存储到JTable中。
     * 本类已进行必要注明。
     * @param record
     * @return List
     */
    public List<Record> getRecordList(Record record){
        List<Record> retList = new ArrayList<>(); //用于存放遍历结果并返回的List
        String sqlString = "select * from record";
        if(!StringUtil.isEmpty(record.getCarId())){ //如果不作任何输入就查询那么返回所有停车记录
            sqlString += " where carid like '%"+record.getCarId()+"%'";
        } //sql语句的设置

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlString);//设置语句输入
            ResultSet executeQuery = preparedStatement.executeQuery();

            while (executeQuery.next()){ //遍历结果集并存入上面定义好的retList
                Record rec = new Record();
                rec.setCarId(executeQuery.getString("CarId"));
                rec.setColor(executeQuery.getString("Color"));
                rec.setLotId(executeQuery.getInt("LotId"));
                rec.setDriver(executeQuery.getString("Driver"));
                rec.setEntrydate(executeQuery.getString("Entrydate"));
                rec.setEntrytime(executeQuery.getString("Entrytime"));
                retList.add(rec);
            }
            con.close(); //关闭数据库连接
        }catch (Exception e){
            e.printStackTrace();
        }

        return retList; //返回停车记录的遍历集合
    }

}
