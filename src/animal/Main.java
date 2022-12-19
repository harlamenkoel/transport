package animal;

public class Main {
    public static void main(String[] args) {
        Animal gazelle = new Herbivore("Газель", 8, "земля", 95, "трава");
        Animal giraffe = new Herbivore("Жираф", 25, "земля", 60, "деревья");
        Animal horse = new Herbivore("Лошадь", 25, "земля", 88, "сено");
        Animal hyena = new Predator("Гиена", 12, "земля", 64, "мясо");
        Animal tiger = new Predator("Тигр", 4, "земля", 35, "мясо");
        Animal bear = new Predator("Медведь", 4, "земля", 25, "мясо");
        Animal frog = new Amphibian("Лягушка", 1, "вода");
        Animal snake = new Amphibian("Уж", 2, "земля");
        Animal peacock = new NonFlyingBird("Павлин", 15, "лед", "лапы");
        Animal penguin = new NonFlyingBird("Пингвин", 15, "лед", "лапы");
        Animal doDo = new NonFlyingBird("Птица ДоДо", 15, "земля", "лапы");
        Animal seagull = new FlyingBird("Чайка", 20, "воздух", "крылья");
        Animal albatross = new FlyingBird("Альбатрос", 42, "воздух", "крылья");
        Animal falcon = new FlyingBird("Сокол", 18, "воздух", "крылья");

        horse.go();
        tiger.go();
        frog.go();
        falcon.go();
        penguin.go();
        System.out.println();
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(tiger);
        System.out.println(hyena);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(snake);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(doDo);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}
