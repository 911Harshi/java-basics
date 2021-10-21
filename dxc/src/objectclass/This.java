package objectclass;

public class This {
	int rollno;  
	String name;  
	float fee;  
	This(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	}  
	  
	class TestThis2{  
	public static void main(String args[]){  
	This s1=new This(111,"ankit",5000f);  
	This s2=new This(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	}
	}  

