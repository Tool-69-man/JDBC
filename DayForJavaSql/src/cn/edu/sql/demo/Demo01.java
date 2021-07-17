package cn.edu.sql.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo01 {
    private static final String DBDRIVER="com.mysql.cj.jdbc.Driver";
    private static final String DBURL="jdbc:mysql://localhost:3306/guitext";
    private static final String USER="root";
    private static final String PASSWORD="man69";




    public static void main(String[] args) throws Exception {
        Class.forName(DBDRIVER);//加载数据库驱动程序，不需实例化

        //根据连接协议，用户名，密码连接数据库
        Connection conn=DriverManager.getConnection(    DBURL,USER,PASSWORD);
        System.out.println(conn);

        PreparedStatement   stmt= (PreparedStatement) conn.createStatement();

        String sql="INSERT INTO tablejavaText(id,name,sex) VALUES (1212,'C.C.','female')";

        int len=stmt.executeUpdate(sql);

        System.out.println(len);
        conn.close();


    }

}
