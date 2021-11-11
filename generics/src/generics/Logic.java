package generics;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, String> p=new Pair<>("sowji","435");
		System.out.println(p.toString());
		p.setKey("kusu");
		p.setValue("435");
		System.out.println(p.toString());
		Pair<String,java.util.Date> p1=new Pair<>("today is",(new java.util.Date()));
		System.out.println(p1.toString());
	}

}
