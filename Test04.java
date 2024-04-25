class Test04 {
   public static void main(String[] args) {

	Example e1 = new Example();

	System.out.println(e1); //Example@2f92e0f4

	//Reading class Example values from the object e1
	System.out.println(e1.i1); //5
	System.out.println(e1.d1); //6.7
	System.out.println(e1.ch); //a
	System.out.println(e1.la); //[J@28a418fc
	System.out.println(e1.la[0]); //8
	System.out.println(e1.la[1]); //9
	System.out.println(e1.s1); //Hari
   }
}
