package in.co.javacoder.springJdbcAssignment.dao;

import java.util.List;

import in.co.javacoder.springJdbcAssignment.dto.Passenger;

public interface PassengerDAO {
	
	int create(Passenger passenger);
	int update(Passenger passenger);
	List<Passenger> read();
	int delete(int id);
	

}
