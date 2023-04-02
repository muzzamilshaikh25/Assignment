package Assignment;
//Problem1
import java.util.Scanner;
public class Circle {
private float radius;
static float pi=3.5f;
Circle(){
	radius=1.5f;
	
}
Circle(float radius){
	this.radius=radius;
}

//method1
static float calculateCircleArea(float radius) {
	return pi*radius*radius;
}
//method2
static float calculateCircumference(float radius) {
	return 2*pi*radius;
	
	
}
	public static void main(String[] args) {
		Circle obj=new Circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		float radius=sc.nextFloat();
		System.out.println("This area is:"+calculateCircleArea(radius));

System.out.println("The circumference is:"+calculateCircumference(radius));
	}

}




