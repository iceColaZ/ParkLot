package com.K1ez.conn;
import com.K1ez.model.CarInf;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ParkDao extends BaseDao{
    /**
     * Park主要用于进行数据库的操作，用于增加停车信息，如果添加成功则返回为true，否则为false
     * 本类已进行必要注明。
     * @param carInf
     * @return
     * @author 物联网2101杨丰赫
     */
    public boolean Park(CarInf carInf){
        String sql_insert = "insert into Parklot (CarId, Color, LotId) values (?,?,?);";//插入停车数据的sql语句
        String sql_checklot = "update lot set IsEmpty = 1 where LotId = ?;";
        CarInf carRst = null;
        try {
            PreparedStatement prst = con.prepareStatement(sql_insert);//创建statement对象prst，用于传输sql语句
            prst.setString(1, carInf.getCarId());
            prst.setString(2, carInf.getColor());
            prst.setInt(3,carInf.getLotid());//以上三条用于编辑sql语句中替换'?'所占的位置，方便灵活输入

            int executeUpdate = prst.executeUpdate();

            if(executeUpdate != 0){
                PreparedStatement temp = con.prepareStatement(sql_checklot);
                temp.setInt(1,carInf.getLotid());
                int executeUpdate1 = temp.executeUpdate();
                try{
                    con.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }

    public boolean Out(int Lotid){
        String sql_out1 = "DELETE FROM parklot.parklot WHERE LotId = ?;";
        String sql_out2 = "update lot set IsEmpty = 0 where LotId = ?;";
        try {
            PreparedStatement prst = con.prepareStatement(sql_out1);
            prst.setInt(1,Lotid);

            int executeUpdate = prst.executeUpdate();

            if(executeUpdate != 0){
                PreparedStatement temp = con.prepareStatement(sql_out2);
                temp.setInt(1,Lotid);

                int executeUpdate1 = temp.executeUpdate();

                try{
                    con.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean Record(CarInf carInf){
        String sql_insert = "insert into record (Driver, LotId, Entrytime, Entrydate, Color, CarId) values (?,?,NOW(),NOW(),?,?);";
        CarInf carRst = null;
        try {
            PreparedStatement prst = con.prepareStatement(sql_insert);
            prst.setString(1, carInf.getDriver());
            prst.setInt(2, carInf.getLotid());
            prst.setString(3,carInf.getColor());
            prst.setString(4,carInf.getCarId());

            int executeUpdate = prst.executeUpdate();

            if(executeUpdate != 0){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }
}
