// lazy solution

class Singleton{
    private static Singleton uniqueInstance;
    private Singleton(){
        System.out.println("Object created!");
    }
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}


public class Main{
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
	}
}
