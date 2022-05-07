class Animal {

	public void animalsound(){
		System.out.println("Animal sound");
	}
}

class Pig extends Animal{
	public void animalsound(){
		System.out.println("Pig sound");
	}
}


// Your First Program

class HelloWorld {
    public static void main(String[] args) {
        Pig P = new Pig();
	P.animalsound();
    }
}
