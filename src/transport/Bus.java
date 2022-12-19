package transport;

public class Bus extends Transport {

    private final int seatsNumber;
    private final int passengerCapacity;


    public Bus(String brand,
               String model,
               int productionYear,
               String country,
               String color,
               int maxSpeed,
               String fuel,
               double percentageFuel,
               int seatsNumber,
               int passengerCapacity) {
        super(brand, model, productionYear, country, color, maxSpeed, fuel, percentageFuel);
        this.seatsNumber = seatsNumber;
        this.passengerCapacity = passengerCapacity;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void refill() {
        System.out.println("Автобус заправлен топливом " + getFuel() + " %");
        setPercentageFuel(100);
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + " " + super.toString() +
                " Количество мест: " + getSeatsNumber() +
                ", Пассажировместимость: " + getPassengerCapacity() +
                " )";
    }
}
