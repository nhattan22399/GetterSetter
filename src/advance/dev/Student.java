package advance.dev;

public class Student {
	
	String name;
	private int age;
	private String address;
	private String phone;
	private  double dtb;
	
	
	public Student(String name, int age, String address, String phone, double dtb) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.dtb = dtb;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 public int getAge() {
	        if (Integer.valueOf(age) >0) {
	            // Tuổi hợp lệ
	            return age;
	        } else {
	            return 000000000000;
	        }
	    }
	 
	    public void setAge(int age) {
	  
	        this.age = age;
	    }
	public String getAddress() {
		return address;
	}
	public void setAdress(String adress) {
		this.address = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		this.dtb = dtb;
	}
	public String toString() {
		return name+" "+age+" "+address+" "+phone+" "+dtb;
}
}

