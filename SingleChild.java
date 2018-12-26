package inheritance;

public class SingleChild extends Single{
	public void greenAdayar() {
		System.out.println("ADAYAR");
	}
	public void greenOmr() {
		System.out.println("OMR");
	}
public static void main(String[] args) {
	SingleChild sc=new SingleChild();
	sc.javaCourse();
	sc.oracleCourse();
	sc.greenAdayar();
	sc.greenOmr();
}
}
