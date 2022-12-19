import transport.Bus;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Train lastochka = new Train(
                "Ласточка",
                "B-901",
                2011,
                "Россия",
                null,
                301,
                "Дизель",
                60,
                3500,
                3,
                "Белорусский вокзал",
                "Минск - Пассажирский",
                11
        );
        Train leningrad = new Train(
                "Ленинград",
                "В-125",
                2019,
                "Россия",
                null,
                270,
                "Дизель",
                88.5,
                1700,
                5,
                "Ленинградский вокзал",
                "Ленинград - Пассажирский",
                8
        );
        Bus mercedes = new Bus(
                "Mercedes-Benz",
                "Connect",
                2022,
                "Германия",
                "Белый",
                100,
                "Дизель",
                45.8,
                45,
                150);

        Bus liaz = new Bus(
                "ЛиАЗ",
                "6274",
                2015,
                "Россия",
                "Зеленый",
                100,
                "Бензин",
                50,
                20,
                90);

        Bus olimp = new Bus(
                "Олимп",
                "4252",
                2012,
                "Россия",
                "Серый",
                90,
                "Дизель",
                90,
                27,
                116);

        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println(mercedes);
        System.out.println(liaz);
        System.out.println(olimp);
    }
}