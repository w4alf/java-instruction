package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import business.DndCharacter;


//Dungeons and Dragons character sheet
public class DndDB {

	
	private Connection getConnection() throws SQLException {
		String dbURL="jdbc:mysql://localhost:3306/dnd_db?useSSL=false&allowPublicKeyRetrieval=true";
		String username= "dnd_db_user";
		String password = "sesame";
		
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;
	}
	
	
	public DndCharacter get(int id) {
		
		String sql =  "Select * from dndcharacter where id=" + id;
		
		DndCharacter c = null;
		
		try (Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);){
			
			boolean charExists = rs.next();
			
			if(charExists) {
				//result set has a dnd character
				//process the result set
				
				int id2= rs.getInt(1);
				String name= rs.getString(2);
				String dndClass= rs.getString(3);
				int level= rs.getInt(4);
				int strength= rs.getInt(5);
				int intelligence= rs.getInt(6);
				int wisdom= rs.getInt(7);
				int dexterity= rs.getInt(8);
				int constitution= rs.getInt(9);
				int charisma= rs.getInt(10);
				int goldPieces= rs.getInt(11);
				int expPoints= rs.getInt(12);
				int armorClass= rs.getInt(13);
				String armor= rs.getString(14);
				int hitPoints = rs.getInt(15);
				
						
				c = new DndCharacter(id2, name, dndClass, level, strength, intelligence, wisdom, 
						dexterity, constitution, charisma, goldPieces, expPoints, armorClass, armor,hitPoints);
				
					
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return c;	
		
	
	}
	
	public int add(DndCharacter c) {
        int rowCount = 0;
        String sql = "INSERT INTO dndcharacter (name, dndClass, level, strength, intelligence, wisdom, dexterity, constitution, charisma, goldPieces, expPoints, armorClass, armor, hitPoints) " +
                     "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
            ps.setString(1, c.getName());
            ps.setString(2, c.getDndClass());
            ps.setInt(3, c.getLevel());
            ps.setInt(4, c.getStrength());
            ps.setInt(5, c.getIntelligence());
            ps.setInt(6, c.getWisdom());
            ps.setInt(7, c.getDexterity());
            ps.setInt(8, c.getConstitution());
            ps.setInt(9, c.getCharisma());
            ps.setInt(10, c.getGoldPieces());
            ps.setInt(11, c.getExpPoints());
            ps.setInt(12, c.getArmorClass());
            ps.setString(13, c.getArmor());
            ps.setInt(14, c.getHitPoints());
            
	       rowCount = ps.executeUpdate();
        }
        catch (SQLException se) {
            System.out.println(se);
        }
        
        return rowCount; 
 
	}	// add DndCharacter ending bracket  
	
	
     public List<DndCharacter> getAll() {
    	 String sql = "SELECT * FROM dndCharacter";
    	 List<DndCharacter> characters = new ArrayList<>();
		
    	 try (PreparedStatement ps = getConnection().prepareStatement(sql); ResultSet rs = ps.executeQuery();) {
    		 
    		 while (rs.next()) {
    			 
 				int id= rs.getInt(1);
 				String name= rs.getString(2);
 				String dndClass= rs.getString(3);
 				int level= rs.getInt(4);
 				int strength= rs.getInt(5);
 				int intelligence= rs.getInt(6);
 				int wisdom= rs.getInt(7);
 				int dexterity= rs.getInt(8);
 				int constitution= rs.getInt(9);
 				int charisma= rs.getInt(10);
 				int goldPieces= rs.getInt(11);
 				int expPoints= rs.getInt(12);
 				int armorClass= rs.getInt(13);
 				String armor= rs.getString(14);
 				int hitPoints = rs.getInt(15);
 				
    			 
    			 DndCharacter c = new DndCharacter(id, name, dndClass, level, strength, intelligence, wisdom, 
 						dexterity, constitution, charisma, goldPieces, expPoints, armorClass, armor,hitPoints);
    			 characters.add(c);
    		 }
    		 
    		 return characters;
    	 } catch (SQLException e){
    		 System.out.println(e);
    		 return null;
    	 }
    	 
     }
        
     public int delete(DndCharacter c) {
    	 
 		int rowCount = 0;
    	 if (!(c==null)) {

	
			String sql = "DELETE FROM dndcharacter WHERE id = ?";
			try (Connection connection = getConnection(); PreparedStatement ps = connection.prepareStatement(sql)) {

				ps.setInt(1, c.getId());
				rowCount = ps.executeUpdate();

			} catch (SQLException e) {
				System.err.println(e);

			}
			
		
    	 } 
    	 
    	 return rowCount;
		
    	 
     }     
        
     public int update(DndCharacter c ) {
    	 

    	 int rowCount = 0;
       	 if (!(c==null)) {
       		 
       		String sql = "UPDATE  dndcharacter SET name = ?, dndClass = ?, level = ?, strength = ?, intelligence = ?, wisdom = ?, dexterity = ?, constitution = ?,"
       				+" charisma =?, goldPieces = ?, expPoints = ?, armorClass = ?, armor=?, hitPoints=? WHERE id= ?"; 
       		
       		try (PreparedStatement ps = getConnection().prepareStatement(sql);) {
       			
                ps.setString(1, c.getName());
                ps.setString(2, c.getDndClass());
                ps.setInt(3, c.getLevel());
                ps.setInt(4, c.getStrength());
                ps.setInt(5, c.getIntelligence());
                ps.setInt(6, c.getWisdom());
                ps.setInt(7, c.getDexterity());
                ps.setInt(8, c.getConstitution());
                ps.setInt(9, c.getCharisma());
                ps.setInt(10, c.getGoldPieces());
                ps.setInt(11, c.getExpPoints());
                ps.setInt(12, c.getArmorClass());
                ps.setString(13, c.getArmor());
                ps.setInt(14, c.getHitPoints());
                ps.setInt(15, c.getId());
                
                
				rowCount = ps.executeUpdate();
       			
       			
       		} catch (SQLException e) {
       			
       			System.err.println(e);
       			
       		}
    		  
       		 
       		
       		 
       	 }
    	 
    	 
       	return rowCount; 
    	 
     }
	
	
	
	
	
	
}
