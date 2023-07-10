package com.isbc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired //injecting dependencies for EmpRepository
	EmpRepository empR;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception{
		//unique ids, no duplicate in sets
		Random numbers = new Random();
		HashSet<Integer> hash = new HashSet<>();
		for (int count = 1; count <= 10; count++) {
    	hash.add(1 + coins.nextInt(100));
		}
		}
		//converitng set to array becasue cannot retreive data from set by index
		String [] Ids = hash.toArray(new String[hash.size()]);

		Employee emp1 = new Employee(1, "Tanvir1", Ids[0], "Mohammadpur", "1234567890", employee1BankAccount);
		Employee emp2 = new Employee(2, "Tanvir2", Ids[1], "Dmd", "9876543210", employee2BankAccount);
		Employee emp3 = new Employee(3, "Farhan1", Ids[2], "Dmd", "9876543210", employee2BankAccount);
		Employee emp4 = new Employee(3, "Farhan2", Ids[3], "Dmd", "9876543210", employee2BankAccount);
		Employee emp5 = new Employee(5, "Jesy1", Ids[4], "Dmd", "9876543210", employee2BankAccount);
		Employee emp6 = new Employee(5, "Jesy2", Ids[5], "Dmd", "9876543210", employee2BankAccount);
		Employee emp7 = new Employee(4, "Azrin1", Ids[6], "Dmd", "9876543210", employee2BankAccount);
		Employee emp8 = new Employee(4, "Azrin2", Ids[7], "Dmd", "9876543210", employee2BankAccount);
		Employee emp9 = new Employee(6, "Tanjiro1", Ids[8], "Dmd", "9876543210", employee2BankAccount);
		Employee emp10 = new Employee(6, "Tanjiro2", Ids[9], "Dmd", "9876543210", employee2BankAccount);
		//initiating list from main class
		EmpRepository.employee.addAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));
	}

}
