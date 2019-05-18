package exercises;

/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor(String getName) {
		if (name.equals("papa")) {
			return "Papa Smurf wears a red hat";
		} else {
		   return "This Smurf wears a yellow hat";
		}
	
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy(String getName) {
		if (name.equals("Smurfette")) {
			return "Girl";
		} else 
			return "Boy";
		
	}
	public static void main(String[] args) {
		Smurf handySmurf = new Smurf("handy");
		System.out.println(handySmurf.getName());
		handySmurf.eat();
		Smurf papaSmurf = new Smurf("papa");
		System.out.println(papaSmurf.getName());
		papaSmurf.eat();
		System.out.println(papaSmurf.getHatColor(papaSmurf.getName()));
		System.out.println(papaSmurf.isGirlOrBoy(papaSmurf.getName()));
		Smurf smurfette = new Smurf ("Smurfette");
		System.out.println(smurfette.getName());
		smurfette.eat();
		System.out.println(smurfette.getHatColor(smurfette.getName()));
		System.out.println(smurfette.isGirlOrBoy(smurfette.getName()));
		
	}

}



