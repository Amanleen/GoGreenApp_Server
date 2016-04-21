package driver;

import java.io.IOException;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import database.DatabaseConnector;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseConnector dc = new DatabaseConnector();
		try {
			java.sql.Connection conn = dc.getConnection();
			dc.createDB(conn);
			dc.createTables(conn, "INTEREST_AREA_TABLE_CREATION");
			dc.createTables(conn, "USER_TABLE_CREATION");
			dc.createTables(conn, "GR_ENTRY_TABLE_CREATION"); 
			dc.createTables(conn, "QA_REL_TABLE_CREATION");
			dc.createTables(conn, "EVENT_TABLE_CREATION");
			dc.createTables(conn, "NOTIFICATION_TABLE_CREATION");
			dc.createTables(conn, "FOLLOWING_TABLE_CREATION");
			dc.createTables(conn, "SHARE_TABLE_CREATION");
			dc.createTables(conn, "PLANT_TABLE_CREATION");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
