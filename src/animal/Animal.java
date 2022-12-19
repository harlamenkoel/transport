package animal;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private String environment;

    public Animal(String name,
                  int age,
                  String environment) {
        setName(name);
        setAge(age);
        setEnvironment(environment);
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (StringUtils.isNullOrEmpty(name)) {
            name = "Животное";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        if (StringUtils.isNullOrEmpty(environment)) {
            name = "Не определенно";
        } else {
            this.environment = environment;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(environment, animal.environment);
    }

    @Override
    public String toString() {
        return "Название: " + name  +
                ", Максимальный возраст: " + age +
                ", Место обитания: " + environment;
    }
}
