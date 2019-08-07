import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        Car [] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {

            System.out.println("podaj nazwę");
            input.nextLine();
            System.out.println("podaj limit prędkości");
            input.nextInt();
            input.nextLine();

        }
    //    Car car1 = new Car("Opel", 100);
    //    Car car2 = new Car("Volvo", 150);
//
    //    Car[] cars = {car1, car2};
//
    //    Car testCar1 = new Car("Opel", 110);
    //    Car testCar2 = new Car("Opel", 100);
//
    //    Car[] newCars1 = testCar1.addCar(cars);
    //    System.out.println(newCars1[0]);
   //     System.out.println(newCars1[1]);
    //    System.out.println(newCars1[2]);
    //    Car[] newCars2 = testCar2.addCar(cars);
     //   System.out.println(newCars2[1]);
    }
}
