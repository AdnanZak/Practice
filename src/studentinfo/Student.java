package studentinfo;

public class Student {
	private String Name;
	private String ssn;
	private int phone;
	private String City;
	private String email;
	private java.lang.String stdid;
	private static int id =10;
	Student(String Name,String ssn)
	{
		this.Name=Name;
		this.ssn=ssn;
		id++;
		int random=(int) (Math.random()*1000);
		this.stdid=id+random+ssn;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

	public static void main(String[] args, int setPhone) {
		setPhone=145645456;
		
		Student std=new Student("Adnan","54564654");
		System.out.println(std.Name+"\n"+std.ssn+"\n"+std.stdid);
		
	}
	}
