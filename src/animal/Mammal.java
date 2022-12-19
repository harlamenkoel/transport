package animal;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private int speed;
    private String food;

    public Mammal(String name,
                  int age,
                  String environment,
                  int speed,
                  String food) {
        super(name, age, environment);
        this.speed = speed;
        this.food = food;
    }

    public abstract void walk();


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(food, mammal.food);
    }

    @Override
    public String toString() {
        return super.toString() + " Тип: млекопитающее " +
                ", Максимальная скорость: " + speed + " км/ч " +
                ", Тип пищи: " + food;
    }
}

