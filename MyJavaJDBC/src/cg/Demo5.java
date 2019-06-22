package cg;
import java.sql.*;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthStyle;
public class Demo5 {
	private static Scanner sc;

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		PreparedStatement updateSt=null;
		PreparedStatement selectSt=null;
        
		// TODO Auto-generated method stub
try {
	//Class.forName("oracle.jdbc.driver.OracleDriver");
	//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="hr";
	String pass="hr";
//String url="jdbc:oracle:thin:@localhost:1521:xe";  String user="hr";  String pass="hr";
con=DriverManager.getConnection(url,  user,  pass);
System.out.println("Connected");
//Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
con.setAutoCommit(false);
Scanner sc=new Scanner(System.in);
System.out.println("Enter account id");
int id=sc.nextInt();
selectSt=con.prepareStatement("select * from account where aid =?");
selectSt.setInt(1, id);
ResultSet rs1=selectSt.executeQuery();
double bal1=0.0;
long mb1=0L;
String ah1="";
if(rs1!=null) {
	if(rs1.next())
		{
		mb1=rs1.getLong("mobile no");
		ah1=rs1.getString(3);
		System.out.println(ah1);
		bal1=rs1.getDouble("balance");
	
		System.out.println("your BALANCE IS" +bal1);
		}
}
System.out.println("enter another acc id");
int id1=sc.nextInt();
selectSt=setInt(1,id1);
ResultSet rs2=selectSt.executeQuery();
double bal2=0.0;
long mb2=0L;
String ah2="";

if(rs2!=null) {
	if(rs2.next())
	{
		mb2=rs2.getLong("mobile no");
	ah2=rs2.getString(3);
	System.out.println(ah2);
		System.out.println(rs2.getNString(3));
		bal2=rs2.getDouble("balance");
		System.out.println("your balance is" + bal2);
	}
}


System.out.println("Enter the amt to tnsfr");
double amount=sc.nextDouble();
updateSt=con.prepareStatement("update account set mobileno=?,accountholder=?,balance=?where aid=?");
updateSt=setLong(1,rs1.getLong("mobileno"));
updateSt=setString(2,rs1.getString("accountno"));
updateSt=setDouble(3,bal1-amount);

updateSt=setInt(4,rs1.getInt("aid"));
int i1=updateSt.executeUpdate();
System.out.println("Account updated"+i1);
updateSt.setLong(1, rs2.getLong("mobilenbo"));
updateSt.setString(2, rs2.getString("accountholder"));
updateSt.setDouble(3, bal2+amount);
updateSt.setInt(4, rs2.getInt("aid"));
i1+=updateSt.executeUpdate();
System.out.println("account updated"+i1);
con.commit();
}
catch(SQLException e)
{
	con.rollback();
	System.out.println(e.getMessage()+""+e.getErrorCode()+""+e.getSQLState());
	





		}
finally {
	System.out.println("closing connection");
	if(con!=null) con.close();
}
}

	private static PreparedStatement setString(int i, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static PreparedStatement setDouble(int i, double d) {
		// TODO Auto-generated method stub
		return null;
	}

	private static PreparedStatement setInt(int i, int int1) {
		// TODO Auto-generated method stub
		return null;
	}

	private static PreparedStatement setLong(int i, long long1) {
		// TODO Auto-generated method stub
		return null;
	}

}
/*System.out.println("Enter mobile no");
long mb=sc.nextInt();


System.out.println("enter accountholder no");
String ah=sc.next();
System.out.println("Enter initial balance");
double bal=sc.nextDouble();
String sqlQuery="insert into account values(?,?,?,?)";
PreparedStatement st=con.prepareStatement(sqlQuery);
st.setInt(1,id);
st.setLong(2,mb);
st.setString(3, ah);
st.setDouble(4, bal);

int insertedRec=st.executeUpdate();
System.out.println("Inserted Records" +insertedRec);
con.commit();
con.close();
}
catch(SQLException e) {
	System.out.println(e.getMessage()+" " +e.getErrorCode()+" "+e.getSQLState());
	e.printStackTrace();
}
	}
}
*/
	
	