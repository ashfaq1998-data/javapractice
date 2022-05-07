class Office{
	private int officeid;
	private int countno;
	public void setdata(int x, int y){
		officeid = x;
		countno = y;
	}

	public void getdata(){
		System.out.println(officeid);
		System.out.println(countno);
	}
	
}

class Employee{
	private String name;
	public int x =20;
	public int y =10;

	public void setName(String c){
		name = c;
	}

	public void getName(){
		System.out.println(name);
	}

	public void viewdata(Office hr){
		hr.setdata(10,20);
		hr.getdata();
	}

}


class HelloWorld {
    public static void main(String[] args) {
	Office hrc = new Office();
        Employee E = new Employee();
	E.setName("Ashfaq");
	E.getName();
	E.viewdata(hrc);
    }
}