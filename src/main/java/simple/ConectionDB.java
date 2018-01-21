package simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectionDB 
{
	String URL = "jdbc:mysql://localhost/universidad";
	
	
	public void check()
	{
	
		try {
			String sql = "SELECT * FROM universidad.estudiantes;";
			//System.out.println("intentando conectar");
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(URL, "root", "");
			//System.out.println("conectadoooo"+con);
			
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
			}
			
			st.close();
		} catch (SQLException e) {
			System.out.println("Error MYSQL");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void insert(String documento,String nombre,String correo, String telefono)
	{
	
		try {
			String sql = "INSERT INTO estudiantes (documento,nombre,correo,telefono)VALUES(?,?,?,?)";
			//System.out.println("intentando conectar");
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(URL, "root", "");
			//System.out.println("conectadoooo"+con);
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, documento);
			st.setString(2, nombre);
			st.setString(3, correo);
			st.setString(4, telefono);
			
			System.out.println(st);
			
			st.executeUpdate();

			st.close();
			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}


}
