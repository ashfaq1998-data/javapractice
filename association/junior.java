class Student{
	public void show(){
		System.out.println("I am a student");
	}

	public void test(){
		System.out.println("I am a testing");
	}
	
	public Student(){
		System.out.println("I am a super");
	}
}

class Junior extends Student{
	public Junior(){
		System.out.println("I am a sub");
	}
	
}
class HelloWorld {
    public static void main(String[] args) {
        Junior jun = new Junior();
	jun.show();
	jun.test();
    }
}