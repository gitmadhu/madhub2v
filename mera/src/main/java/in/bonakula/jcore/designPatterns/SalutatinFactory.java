// Factory Design Pattern
package in.bonakula.jcore.designPatterns;

 class Person{
	private String name;
	private String gender;
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
}
 
 class Male extends Person{
	 public Male(String fullName){
		 System.out.println("Hello Mr. " + fullName);
	 }
 }
 
 class Female extends Person{
	 public Female(String fullName){
		 System.out.println("Hello Ms. "+fullName);
	 }
 }

 class SalutationFactory {

	/**
	 * @author Raghavender. V
	 */
	public static void main(String[] args) {
		SalutationFactory factory=new SalutationFactory();
		factory.getPerson(args[0],args[1]);
	}
	public  Person getPerson(String name, String gender){
		if(gender.equals("M"))
			return new Male(name);
		else
			if(gender.equals("F"))
				return new Female(name);
		return null;
	}

}
