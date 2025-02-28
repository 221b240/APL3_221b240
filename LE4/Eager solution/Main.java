// eager solution

 class Singleton{
    private static Singleton uniqueInstance = new Singleton();
    private Singleton(){
        System.out.println("Object Created!");
    }
    
    public static Singleton getInstance(){
        return uniqueInstance;
    }
}


public class Main{
	public static void main(String[] args) {
		 
		 Singleton s1 = Singleton.getInstance();
		
	}
}
