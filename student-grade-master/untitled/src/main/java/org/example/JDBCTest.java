package org.example;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCTest {
    //1、加载驱动，固定写法!
//  private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";//早期写法
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    //2、数据库连接信息
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/student_mis?useUnicode=true&characterEncoding=UTF-8&useSSL=true";
    //用户名,更换成你自己的用户名，此处为root用户
    private static final String USER_NAME = "root";
    //密码，更换成你自己设定的密码，此处为:admin
    private static final String PASSWORD = "123456";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName(DRIVER_NAME);//加载mysql的驱动类

        //3、数据库连接
        connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

        //4、生成一个真正执行SQL语句的对象：Statement
        Statement statement = connection.createStatement();

        //5、执行sql命令，获得返回结果
        String sql = "SELECT * FROM jhk_admin";
        ResultSet rs = statement.executeQuery(sql);//rs是查询出来的结果集，结果集封装了所有查询出来的东西
        while (rs.next()) {//输出结果
            System.out.println("--->:" + rs.getObject("username"));
            System.out.println("--->:" + rs.getObject("real_name"));
        }

        //6、关闭连接
        rs.close();
        statement.close();
        connection.close();
    }
}
