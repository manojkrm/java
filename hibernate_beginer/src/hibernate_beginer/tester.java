 package hibernate_beginer;

public class tester {

	public static void main(String[] args) {

		Sports_dto dto = new Sports_dto();
		dto.setId(1);
		dto.setName("Cricket");
		dto.setNo_of_players(11);
		dto.setSportd_type("outdoor");
		dto.setSports_time(9.00);
		Sportd_dao sports_dto = new Sportd_dao();
		sports_dto.insertssports(dto);
	}

}
