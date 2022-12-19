package animal;

public class Predator extends Mammal {
    public Predator(String name,
                    int age,
                    String environment,
                    int speed,
                    String food) {
        super(name, age, environment, speed, food);
    }
    public void hunt(){
        System.out.println("Хищники охотяться");
    }

    @Override
    public void eat() {
        System.out.println("Хищники питаються "+ getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Хищники спят ночью и днем");
    }

    @Override
    public void go() {
        System.out.println("Хищники ходят в лесу");
    }
    @Override
    public void walk() {
        System.out.println("Хищники гуляет в лесу");
    }
    @Override
    public String toString() {
        return super.toString() + ", Подтип: хищник ";
    }
}
