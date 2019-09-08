package in.bonakula.jcore.service;

import java.util.Arrays;

class Car implements Comparable{
	private String make;
	private int year;
	private int mileage;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Car(String make, int year,int mileage ){
		this.make=make;
		this.year=year;
		this.mileage=mileage;		
	}
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Car){
			Car car=(Car)obj;
			
			if(this.mileage>car.getMileage())
				return 1;
			else if(this.mileage<car.getMileage())
				return -1;
					
		}
		return 0;
	}
	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		buffer.append("Make : "+make+"\n");
		buffer.append("Year : "+year+"\n");
		buffer.append("Mileage : "+mileage+"\n");
		
		return buffer.toString();
	}
}

class CarTest{
	public void comparableExample(){
		Car car1=new Car("Toyota",2005,18);
		Car car2=new Car("BMW",2008,12);
		Car car3=new Car("Tata",2009,25);
		
		System.out.println("Car 1 equals Car 2: " + car1.compareTo(car2));
        System.out.println("Car 1 equals Car 3: " + car1.compareTo(car3));
        System.out.println("Car 2 equals Car 3: " + car2.compareTo(car3));
        
        Car[] carArray=new Car[]{car1,car2,car3};
        
        Arrays.sort(carArray);
        
        //print out the sorted array
        
        for(Car car:carArray){
        	System.out.println(car.toString());
        }
	}
}

public class SortingByComparable {
public static void main(String[] args) {
		new CarTest().comparableExample();

	}

}
