package Inheritance;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder_lab extends Arithmetic {
    public static void main(String[] args) {
    	Adder_lab adder = new Adder_lab(); 
        System.out.println("Addition is :"+adder.add(10, 20));
    }
}