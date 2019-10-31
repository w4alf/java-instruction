package business;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import db.BaseDB;

public class ActorDB extends BaseDB {

	public List<Actor> list() {
		
		List<Actor> actorList = new ArrayList<>();
		String sql = "SELECT * FROM actor";
		try (PreparedStatement ps = getConnection().prepareStatement(sql); ResultSet rs = ps.executeQuery(sql)){
			
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				actorList.add(a);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return actorList;
	}
	
	
	public Actor get(int id) {

		Actor actor = null;
		String sql = "SELECT * FROM actor WHERE id = ? ";
		try (PreparedStatement ps = getConnection().prepareStatement(sql);) {

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				actor = getActorFromResultSet(rs);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return actor;
	}
	
	public int add(Actor a) {

		int rowCount = 0;
		String sql = " INSERT INTO actor (firstName,lastName,gender,birthday) VALUES (?,?,?,?)";

		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getGender());
			ps.setObject(4, a.getBirthday());

			rowCount = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rowCount;
	}
	
	
	public int update(Actor a) {
		
		int rowCount = 0;
		String sql= " UPDATE actor SET firstName =? WHERE id=?";
		
		try (PreparedStatement ps = getConnection().prepareStatement(sql)){
			
			ps.setString(1, a.getFirstName());
			ps.setInt(2, a.getId());
			
			rowCount = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return rowCount;
	}
	
	
	
	public int delete(Actor a) {
		
		int rowCount = 0;
		String sql= " DELETE FROM actor WHERE id=?";
		
		try (PreparedStatement ps = getConnection().prepareStatement(sql)){
			
			ps.setInt(1, a.getId());
			
			rowCount = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return rowCount;
	}
	
	
	

	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		//get a actor from the result set
		int id = rs.getInt(1);
		String firstName = rs.getString(2);
		String  lastName = rs.getString(3);
		String gender = rs.getString(4);
		LocalDate ld = rs.getDate(5).toLocalDate();
		Actor a  = new Actor(id,firstName,lastName,gender,ld);
		return a;
	}
	
	
}
