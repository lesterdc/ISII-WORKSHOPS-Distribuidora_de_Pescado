package ec.edu.espol.workshops;

public class CarInsurance {
	public int age;
	public char sex;
	public boolean matital_status;
	public int base_premium = 500;
	
	public int Premium() {
		int total=0;
		if(sex=='M'&&matital_status==false&&age<25) {
			base_premium+=1500;
			total+=1;
		}else if(sex=='F'&&matital_status==true) {
			base_premium-=200;
			total+=1;
		}else if(age>=45 && age<65) {
			base_premium-=100;
			total+=1;
		}
		else {
			total-=1;
		}
		return total;
	}
	
	public boolean Policies(String numero) {
		if(age>80 && driving_license(numero)==false) {
			return false;
		}
		return true;
	}
	
	private static boolean driving_license(String numero) {
		if(numero==null) {
			return false;
		}try {
			double d = Double.parseDouble(numero);
		}catch(NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setSex(char sex) {
		this.sex=sex;
	}
	
	public void setMatital_status(boolean matital_status) {
		this.matital_status=matital_status;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getSex() {
		return this.sex;
	}
	
	public boolean getMatital_status() {
		return this.matital_status;
	}
	
	public int getBase_premium() {
		return this.base_premium;
	}
	
	public static void main(String[] args) {
		
		CarInsurance mio = new CarInsurance();
		mio.setAge(10);
		mio.setMatital_status(false);
		mio.setSex('M');
		mio.Premium();
		System.out.println(mio.getBase_premium());
	}

}
