package stream.pipeline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import stream.pipeline.entities.Employee;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> employees = new ArrayList<>();
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			
			List<Employee> newEmployees = employees.stream()
					.filter(emp -> emp.getSalary() > salary)
					.collect(Collectors.toList());
			
			newEmployees.sort((emp1, emp2) -> emp1.getEmail().compareTo(emp2.getEmail()));
			
			for(Employee emp : newEmployees) {
				System.out.println(emp.getEmail());
			}
			
			double sum = employees.stream()
					.filter(emp -> emp.getName().toUpperCase().charAt(0) == 'M')
					.map(emp -> emp.getSalary())
					.reduce(0.0, (sal1, sal2) -> sal1 + sal2);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
