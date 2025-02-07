
abstract class Duck {
    SwimBehavior swimBehavior;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SpecialBehavior specialBehavior;

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        } else {
            System.out.println("This duck can't fly.");
        }
    }

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        } else {
            System.out.println("This duck is silent.");
        }
    }

    public void performSpecialSound() {
        if (specialBehavior != null) {
            specialBehavior.specialSound();
        }
    }

    public void display() {
       
    }
}
