package cn.edu.sql.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo02 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aa","root","man69");
            PreparedStatement statement = connection.prepareStatement("select * from xxx");
//            PreparedStatement statement = connection.prepareStatement("insert  into xxx(id,name)values(1212,'asd');"  );
              ResultSet res = statement.executeQuery();

              while (res.next()){
                  System.out.print(res.getInt("id")+"     ");
                  System.out.println(res.getString("name"));
              }


        }
        catch (Exception e) {
            System.out.println("errro");
        }

    }
}
