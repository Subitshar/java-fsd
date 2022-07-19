
public class EmpDetails_pc {
	int Id;
	String Name;
	EmpDetails_pc(int Id,String Name){
		this.Id=Id;
		this.Name=Name;
	}
	
	public void display() {
		System.out.println("The Employee id:"+this.Id);
		System.out.println("The employee name:"+this.Name);
	}

}
