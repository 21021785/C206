
public class qnatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = 4;
		int d = 4;
		int e = 5;
		average ave = new average();
		
		//Act
		double actual = ave.averageOf(a, b, c, d, e);
		
		//Assert
		double expected = 3.2;
		System.out.println(actual);
		System.out.println((1.0+2.0+4.0+4.0+5.0)/5.0);
		
		if (expected == actual) {
			System.out.println("ok");
		} else {
			System.out.println("not ok");
		}

	}

}
