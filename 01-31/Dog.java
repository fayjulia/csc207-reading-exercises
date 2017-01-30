public class Dog {
    public String name;
    public String breed;
    public int years;
    public String color;
    public int numberOfDeadVarmintsRolledIn; 

    public Dog(String name, String breed, int years, String color,
	       int numberOfDeadVarmintsRolledIn) {
	this.name = name;
	this.breed = breed;
	this.years = years;
	this.color = color;
	this.numberOfDeadVarmintsRolledIn = numberOfDeadVarmintsRolledIn;
    }

    public void rollsInDeadVarmint () {
	this.numberOfDeadVarmintsRolledIn += 1;
	System.out.println("oh no! someone give the dog another bath!");
    }
    /*This was my winter break*/
    public static void main (String[] args) {
	Dog dog1 = new Dog("juniper", "mutt", 6, "brown", 3);
	dog1.rollsInDeadVarmint();
	System.out.println("Dead varmints rolled in so far:"+dog1.numberOfDeadVarmintsRolledIn);
    }
}
