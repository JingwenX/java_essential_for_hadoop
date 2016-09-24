package ex_static_variable_property;
public class class3 {
	void fun(){
		class2 ob1 = new class2(); //line1
		System.out.println(ob1.count); //line2
		ob1.count = 100; //line3
		// when running class3.java:
		/* when only line1, print "10"
		 * when line1 and line2, print "10/n10"
		 * when line1, 2, and line3, print "10/n100" why???
		 */
	} 

}