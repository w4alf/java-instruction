package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Stuffy;

public class StuffyDB {

	
	private Connection getConnection() throws SQLException {
		String dbURL="jdbc:mysql://localhost:3306/stuffy_db?useSSL=false&allowPublicKeyRetrieval=true";
		String username= "stuffy_db_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}
	
	
	public Stuffy get(int id) {
		
		String sql =  "Select * from stuffy where id=" + id;
		
		Stuffy s = null;
		
		try (Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);){
			
			boolean stuffyExists = rs.next();
			
			if(stuffyExists) {
				//result set has a stuffy
				//process the result set
				int id2 = rs.getInt(1);
				String type = rs.getString(2);
				String color = rs.getString(3);
				String size = rs.getString(4);
				int limbs = rs.getInt(5);
				
				s = new Stuffy(id2,type,color,size, limbs);
				
					
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return s;	
		
	
	}
	
	public int add(Stuffy s) {
        int rowCount = 0;
        String sql = "INSERT INTO stuffy (Type, Color, Size, Limbs) " +
                     "VALUES (?,?,?,?)";
        try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
            ps.setString(1, s.getType());
            ps.setString(2, s.getColor());
            ps.setString(3, s.getSize());
            ps.setInt(4, s.getLimbs());
            rowCount = ps.executeUpdate();
        }
        catch (SQLException se) {
            System.out.println(se);
        }
        
        return rowCount; 
 
	}	// add stuffy ending bracket  
	
	
     public List<Stuffy> getAll() {
    	 String sql = "SELECT id, type, color, size, limbs FROM stuffy ORDER BY type";
    	 List<Stuffy> stuffies = new ArrayList<>();
		
    	 try (PreparedStatement ps = getConnection().prepareStatement(sql); ResultSet rs = ps.executeQuery();) {
    		 
    		 while (rs.next()) {
    			 
    			 int id = rs.getInt("id");
    			 String type = rs.getString("type");
    			 String color = rs.getString("color");
    			 String size = rs.getString("size");
    			 int limbs =  rs.getInt("limbs");
    			 
    			 Stuffy s = new Stuffy(id,type,color,size,limbs);
    			 stuffies.add(s);
    		 }
    		 
    		 return stuffies;
    	 } catch (SQLException e){
    		 System.out.println(e);
    		 return null;
    	 }
    	 
     }
        
     public int delete(Stuffy s) {
    	 
 		int rowCount = 0;
    	 if (!(s==null)) {

	
			String sql = "DELETE FROM stuffy WHERE id = ?";
			try (Connection connection = getConnection(); PreparedStatement ps = connection.prepareStatement(sql)) {

				ps.setInt(1, s.getId());
				rowCount = ps.executeUpdate();

			} catch (SQLException e) {
				System.err.println(e);

			}
			
		
    	 } 
    	 
    	 return rowCount;
		
    	 
     }     
        
     public int update(Stuffy s ) {
    	 

    	 int rowCount = 0;
       	 if (!(s==null)) {
       		 
       		String sql = "UPDATE  stuffy SET type = ?, color = ?, size = ?, limbs = ? WHERE id= ?"; 
       		
       		try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
       			
       			ps.setString(1, s.getType());
       			ps.setString(2, s.getColor());
       			ps.setString(3, s.getSize());
       			ps.setInt(4, s.getLimbs());
       			ps.setInt(5, s.getId());
       			
				rowCount = ps.executeUpdate();
       			
       			
       		} catch (SQLException e) {
       			
       			System.err.println(e);
       			
       		}
    		  
       		 
       		
       		 
       	 }
    	 
    	 
       	return rowCount; 
    	 
     }
 
	
	
	
	
} // stuffyDB class ending bracket
