package Inheritance;
class reptiles1 {
	public void eat() {
        System.out.println("Turtle is Eating Food");
    }
}
class tur extends reptiles1 {
    public void wal() {
        System.out.println("Turtle start Walking");
    }
}

class Star_tur extends tur {
    public void star() {
        System.out.println("Turtle Stopped in between");
    }
}
public class reptiles {
    public static void main(String[] args) {
    	Star_tur star = new Star_tur();
    	star.eat();  
    	star.wal(); 
    	star.star();
    }
}
