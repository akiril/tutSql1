
public class Employee {
	public Employee(final int anId, final int chf_id, final int dep_id, final String aFName, final String aLName, final double aSalary ) {
		id = anId;
		chief_id = chf_id;
		department_id = dep_id;
		fName = aFName;
		lName = aLName;
		salary = aSalary;
	}

	Public Employee() {
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getChief_id() {
		return chief_id;
	}
	public void setChief_id(int chief_id) {
		this.chief_id = chief_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private int id;
	private int chief_id;
	private int department_id;
	private String fName;
	private String lName;
	private double salary;
	

}
