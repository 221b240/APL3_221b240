abstract class Bharatvanshi {
    	public abstract void fight();

    	public abstract void obey();

    	public boolean isFighter() {
        	return true;
    	}
}

class Pandav extends Bharatvanshi {
    	private String name;
    	private boolean kindness;

    	public Pandav(String name, boolean kindness) {
        	this.name = name;
        	this.kindness = kindness;
    	}

    	@Override
    	public void fight() {
        	System.out.println(name + " was a fighter");
    	}

    	@Override
    	public void obey() {
        	System.out.println(name + " was obedient");
    	}

    	public void isKind() {
        	if(kindness) {
			System.out.println(name + " was kind");
		}
		else {
			System.out.println(name + " was not kind");
		}
    	}
}

class Kaurav extends Bharatvanshi {
    	private String name;

    	public Kaurav(String name) {
        	this.name = name;
    	}

    	@Override
    	public void fight() {
        	System.out.println(name + " was a fighter");
    	}

    	@Override
    	public void obey() {
        	System.out.println(name + " was disobedient");
    	}
}

class Vikarn extends Kaurav {
    	public Vikarn() {
        	super("Vikarn");
    	}

    	@Override
    	public void fight() {
        	System.out.println("Vikarn was a noble fighter");
    	}

    	@Override
    	public void obey() {
        	System.out.println("Vikarn was obedient");
    	}
}

public class Main {
    	public static void main(String[] args) {
        	Pandav arjun = new Pandav("Arjun", true);
        	Pandav bheem = new Pandav("Bheem", false);
        	Kaurav duryodhan = new Kaurav("Duryodhan");
        	Vikarn vikarn = new Vikarn();

        	arjun.fight();
        	arjun.obey();
        	arjun.isKind();

        	bheem.fight();
        	bheem.obey();
        	bheem.isKind();

        	duryodhan.fight();
        	duryodhan.obey();

        	vikarn.fight();
        	vikarn.obey();
    	}
}
