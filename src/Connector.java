import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class Connector {
	
	Connection con=null;
	public static Connection dbconnector()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Acer PC\\Desktop\\Ads.sqlite");
			//JOptionPane.showMessageDialog(null, "successfully connected!");
			return conn;
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}

}
