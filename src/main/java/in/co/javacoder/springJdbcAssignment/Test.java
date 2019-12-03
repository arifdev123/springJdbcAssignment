package in.co.javacoder.springJdbcAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.co.javacoder.springJdbcAssignment.dao.PassengerDAO;
import in.co.javacoder.springJdbcAssignment.dto.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PassengerDAO passengerDAO = (PassengerDAO) context.getBean("passengerDAOImpl");
		
		
		/*
		 * System.out.println("Number of records created : " + (
		 * passengerDAO.create((Passenger)context.getBean("p1")) +
		 * passengerDAO.create((Passenger)context.getBean("p2")) +
		 * passengerDAO.create((Passenger)context.getBean("p3")) ) );
		 * System.out.println("Showing all the records : " + passengerDAO.read());
		 */
		
		/*
		 * System.out.println("Number of records updated : " +
		 * passengerDAO.update((Passenger)context.getBean("p2u")) );
		 * System.out.println("Showing all the records : " + passengerDAO.read());
		 */
		
		/*
		 * System.out.println("Number of records deleted : " + passengerDAO.delete(2));
		 * System.out.println("Showing all the records : " + passengerDAO.read());
		 */
		System.out.println("Showing all the records : " + passengerDAO.read());
		

	}

}
