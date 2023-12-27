package com.K1ez.conn;
import com.K1ez.model.CarInf;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ParkDao extends BaseDao{
    /**
     * Park��Ҫ���ڽ������ݿ�Ĳ�������������ͣ����Ϣ�������ӳɹ��򷵻�Ϊtrue������Ϊfalse
     * �����ѽ��б�Ҫע����
     * @param carInf
     * @return
     * @author ������2101����
     */
    public boolean Park(CarInf carInf){
        String sql_insert = "insert into Parklot (CarId, Color, LotId) values (?,?,?);";//����ͣ�����ݵ�sql���
        String sql_checklot = "update lot set IsEmpty = 1 where LotId = ?;";
        CarInf carRst = null;
        try {
            PreparedStatement prst = con.prepareStatement(sql_insert);//����statement����prst�����ڴ���sql���
            prst.setString(1, carInf.getCarId());
            prst.setString(2, carInf.getColor());
            prst.setInt(3,carInf.getLotid());//�����������ڱ༭sql������滻'?'��ռ��λ�ã������������

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
