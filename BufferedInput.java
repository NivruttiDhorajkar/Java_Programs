import java.io.BufferedReader;
import java.io.InputStreamReader;

class BufferedInput 
{
    public static void main(String arg[])
    {
        InputStreamReader iobj= new InputStreamReader(System.in);
        BufferedReader bobj= new BufferedReader(iobj);

        System.out.println("Enter ur name:");
        String name = bobj.readLine();
    }    
}
