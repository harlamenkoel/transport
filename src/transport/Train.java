package transport;

public class Train extends Transport {

    private int cost;
    private int time;
    private String departureStation;
    private String arrivalStation;
    private int wagons;


    public Train(String brand,
                 String model,
                 int productionYear,
                 String country,
                 String color,
                 int maxSpeed,
                 String fuel,
                 double percentageFuel,
                 int cost,
                 int time,
                 String departureStation,
                 String arrivalStation,
                 int wagons) {
        super(brand, model, productionYear, country, color, maxSpeed, fuel, percentageFuel);
        this.cost = cost;
        this.time = time;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.wagons = wagons;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public int getWagons() {
        return wagons;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    @Override
    public void refill() {
        System.out.println("Поезд заправлен топливом "+getFuel()+ " %");
        setPercentageFuel(100);

    }

    @Override
    public String toString() {
        return "Поезд( " +
                "Цена: " + cost +
                ", Время в пути: " + time +
                ", Станция отправления: '" + departureStation + '\'' +
                ", Станция прибытия: '" + arrivalStation + '\'' +
                ", Вагонов: " + wagons +
                super.toString() + ")";
    }

}
