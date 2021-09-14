import java.sql.*;  
  
public class adminloginsql {  
public static boolean validate(String name,String pass){  
boolean status=false;  
try{  
System.out.println("In Sql class");
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521/xe","system","sathwik123");  
    System.out.println("Afte connect statement");  
PreparedStatement ps=con.prepareStatement(  
"select * from admin where name=? and pwd=?");  
ps.setString(1,name);  
ps.setString(2,pass);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  