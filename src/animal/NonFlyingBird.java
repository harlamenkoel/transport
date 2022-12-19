package animal;

public class NonFlyingBird extends Bird {



    public NonFlyingBird(String name,
                         int age,
                         String environment,
                         String movement) {
        super(name, age, environment,movement);
    }

    @Override
    public void eat() {
        System.out.println("Нелетающая птица ест на земле");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающая птица спит ночью");
    }

    @Override
    public void go() {
        System.out.println("Нелетающая птица перемещаеться по "+ getMovement());
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающая птица охотиться на земле");
    }

    @Override
    public String toString() {
        return super.toString()+", Под тип: нелетающие птицы ";
    }
}
