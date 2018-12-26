package inheritance;

public class Multi extends MultiLevel{
	public void employeeName() {
		String s="Yashwanth";
		System.out.println(s);
	}
	public void employeeId() {
		int x=12;
		System.out.println(x);
	}
public static void main(String[] args) {
	Multi pa=new Multi();
	pa.CompanyName();
	pa.CompanyAdress();
	pa.employeeName();
	pa.employeeId();
	
}
}
