
public class Department {
	public Department(final int anId, final String name) {
		department_id = anId;
		department_name = name;
	}
	
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	private int department_id;
	private String department_name;
	
}
