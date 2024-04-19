
public class Staff extends User {
	private int salary;

	public Staff() {
		super("", "", "");
	}

	public Staff(String id, String pw, String name, int salary) {
		super(id, pw, name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "\t\t월급:" + salary;
	}

	@Override
	public void showInfo() {
		System.out.println(toString());
	}
}
