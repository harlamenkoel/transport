package animal;

public class FlyingBird extends Bird {



    public FlyingBird(String name,
                      int age,
                      String environment,
                      String movement) {
        super(name, age, environment,movement);
    }

    @Override
    public void eat() {
        System.out.println("Летающая птица ест на земле и в воздухе");
    }

    @Override
    public void sleep() {
        System.out.println("Летающая птица спит ночью или днем");
    }

    @Override
    public void go() {
        System.out.println("Летающая птица перемещаеться по "+ getMovement());
    }

    @Override
    public void hunt() {
        System.out.println("Летающая птица охотиться на земле и в воздухе");
    }

    @Override
    public String toString() {
        return super.toString()+", Под тип: летающие птицы ";
    }
}
