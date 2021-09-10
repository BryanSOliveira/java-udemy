package exercicios.poo.entities;

public class Employee {

	public String name;
	public double grossSalary, tax;
	
	public double nextSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", nextSalary());
	}
}