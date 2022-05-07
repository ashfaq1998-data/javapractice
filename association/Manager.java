class Employee {
	protected String name;

	public void setName(String name){
		this.name = name;
	}
}

class Manager extends Employee{
	

	public void showName(){
		System.out.println("Manager name is " + name);
	}
}

class HelloWorld {
    public static void main(String[] args) {
        Manager M = new Manager();
	M.setName("Nimal");
	M.showName();
    }
}