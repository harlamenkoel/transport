package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String country;
    private String color;
    private int maxSpeed;
    private String fuel;
    private double percentageFuel;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String country,
                     String color,
                     int maxSpeed,
                     String fuel,
                     double percentageFuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.country = country;
        this.fuel = fuel;
        this.percentageFuel=percentageFuel;

        setColor(color);
        setMaxSpeed(maxSpeed);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "Белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getPercentageFuel() {
        return percentageFuel;
    }

    public void setPercentageFuel(double percentageFuel) {
        this.percentageFuel = percentageFuel;
    }

    public abstract  void refill();

    @Override
    public String toString() {
        return "Характеристики транспорта (" +
                "Производитель: '" + brand + '\'' +
                ", Модель: '" + model + '\'' +
                ", Год производства: " + productionYear +
                ", Страна производитель: '" + country + '\'' +
                ", Цвет: '" + color + '\'' +
                ", Максимальная скорость: " + maxSpeed+
                ", Тип топлива: '" + fuel + '\'' +
                ", Процент топлива: " + percentageFuel +
                "%";
    }
}
