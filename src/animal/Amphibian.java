package animal;

public class Amphibian extends Animal {
    public Amphibian(String name,
                     int age,
                     String environment) {
        super(name, age, environment);
    }

    public void hunt() {
        System.out.println("Земноводное охотиться");
    }

    @Override
    public void eat() {
        System.out.println("Земноводное охотиться насекомыми или рыбой");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное спит ночью");
    }

    @Override
    public void go() {
        System.out.println("Земноводное ходит по земле или плавает");
    }

    @Override
    public String toString() {
        return super.toString() + ", Подтип: земноводное";
    }
}
