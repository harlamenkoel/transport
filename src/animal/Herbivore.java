package animal;

public class Herbivore extends Mammal {

    public Herbivore(String name,
                     int age,
                     String environment,
                     int speed,
                     String food) {
        super(name, age, environment, speed, food);
    }

    public void graze() {
        System.out.println("Млекопитающие пасуться");
    }

    @Override
    public void eat() {
        System.out.println("Млекопитающие питаються " + getFood());

    }

    @Override
    public void sleep() {
        System.out.println("Млекопитающие спят ночью");
    }

    @Override
    public void go() {
        System.out.println("Млекопитающие гуляют по траве");
    }

    @Override
    public void walk() {
        System.out.println("Млекопитабщие гуляют по траве");
    }

    @Override
    public String toString() {
        return super.toString() + ", Подтип: травоядное ";
    }
}
