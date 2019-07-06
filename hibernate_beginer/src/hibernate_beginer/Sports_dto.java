  package hibernate_beginer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="sports")
public class Sports_dto {

	@Id
	@Column(name="sport_id")
	private int id;
	@Column(name = "sports_name")
	private String name;
	@Column(name = "no_of_players")
	private int no_of_players;
	@Column(name = "sports_type")
	private String sportd_type;
	@Column(name = "sports_time")

	private double sports_time;

	
	public Sports_dto(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
	 	return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo_of_players() {
		return no_of_players;
	}
	public void setNo_of_players(int no_of_players) {
		this.no_of_players = no_of_players;
	}
	public String getSportd_type() {
		return sportd_type;
	}
	public void setSportd_type(String sportd_type) {
		this.sportd_type = sportd_type;
	}
	public double getSports_time() {
		return sports_time;
	}
	public void setSports_time(double sports_time) {
		this.sports_time = sports_time;
	}
	

}
