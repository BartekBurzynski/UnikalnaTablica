public class Car {

    private String name;

    private int maxSpeed;

    Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (maxSpeed != car.maxSpeed) return false;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }



    private boolean checkIfUnique(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (equals(cars[i])) {
                return false;
            }
        }
        return true;
    }

    Car[] addCar(Car[] cars) {
        if (checkIfUnique(cars)) {
            Car[] newCars = new Car[cars.length + 1];
            for (int i = 0; i < cars.length; i++) {
                newCars[i] = cars[i];
            }
            newCars[cars.length] = this;
            return newCars;
        } else {
            return null;
        }

    }
}
