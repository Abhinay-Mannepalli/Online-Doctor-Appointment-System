import java.sql.*;  
  
public class doctorloginsql {  
public static boolean validate(String name,String pass){  
boolean status=false;  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521/xe","system","sathwik123");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from doctor where name=? and pwd=?");  
ps.setString(1,name);  
ps.setString(2,pass); 
      
ResultSet rs=ps.executeQuery();
status=rs.next();
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  