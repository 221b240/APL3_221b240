/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Le01
{
    int age;
    String name;
    
    void setName(String name) {
        this.name = name;
    }
    
    void setAge(int age) {
        this.age = age;
    }
    
    int getAge() {
        return this.age;
    }
    
    String getName() {
        return this.name;
    }
    
	public static void main(String[] args) {
		Le01 m1 = new Le01();
		m1.setName("Mohit");
		m1.setAge(20);
		System.out.println("Name is " + m1.getName() + " And age is " + m1.getAge());
	}
}