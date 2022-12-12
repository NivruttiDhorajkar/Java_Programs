import java.sql.*;

class Database 
{
    public static void main (String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:/ppa41";
        String Username = "root" ;
        String Password = "1234";
        String Query = "select * from student where city ='pune'";   // operation query.

        Connection cobj =DriverManager.getConnection(URL, Username, Password);

        Statement sobj = cobj.createStatement();

        ResultSet robj = sobj.executeQuery(Query) ;

        while(robj.next())
        {
            System.out.println("RID:"+robj.getInt("Rid"));
            System.out.println("Name:"+robj.getString("Name"));
            System.out.println("City:"+robj.getString("City"));
            System.out.println("Marks:"+robj.getInt("Marks"));
        }
    }
}
