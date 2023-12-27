package com.K1ez.conn;
import com.K1ez.util.DbUtil;
import java.sql.Connection;

/**
 * @author 物联网2101张奕辰
 * 此类的作用是被继承，用于更加便捷的连接和退出数据库
 * 具体的方法存在于DbUtil类中
 */
public class BaseDao {
    public Connection con = new DbUtil().getCon();//创建数据库连接
}
