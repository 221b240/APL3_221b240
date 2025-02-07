
class RubberDuck extends Duck {
    public RubberDuck() {
        swimBehavior = new Swim();
        flyBehavior = null;
        quackBehavior = null;
        specialBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}
