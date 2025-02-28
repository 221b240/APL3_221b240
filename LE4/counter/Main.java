// lazy solution

class Singleton{
    static int cnt = 0;
    public Singleton(){
        cnt++;
        System.out.println("Object " + cnt + " created!");
    }
}


public class Main{
	public static void main(String[] args) {
		Singleton s1 = new Singleton();
		Singleton s2 = new Singleton();
		
	}
}
