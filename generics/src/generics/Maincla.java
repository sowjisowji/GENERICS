package generics;

public class Maincla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {10,20,30,40};
		int p=2;
		int q=3;
		Exchange<Integer> x =new Exchange<>(arr);
		Integer[] arr2= x.getArr();
		System.out.println("swap between index"+p +"and" +q);
		System.out.println("..before swap..");
		x.printElements(arr);
		x.swap(arr,p,q);
		System.out.println("...after swap...");
		x.printElements(arr);
		
	}

}
