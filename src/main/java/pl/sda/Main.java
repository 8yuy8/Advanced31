package pl.sda;

public class Main {
    public static void main(String[] args) {

        createCarsBasic();

    }

    private static void createCarsBasic(){
        Car car = new Car();
        car.setModel("Dodge");
        car.setManufacturer("Bułka");
        car.setVin("123");
        String modelAndManufacturer = car.getModelAndManufacturer();
        System.out.println(modelAndManufacturer);

        Car car2 = new Car();
        car2.setModel("Makaron");
        car2.setManufacturer("Audi");
        System.out.println(car2.getModelAndManufacturer());

        Car car3 = car2;
        car3.setModel("A4");
        System.out.println(car3.getModelAndManufacturer());
        System.out.println(car3);

        Car car4 = new Car();
        car4.setModel("Dodge");
        car4.setManufacturer("Bułka");
        car4.setVin("123");
        System.out.println("Samochody takie same: " + car4.equals(car));


        System.out.println("Samochody te same: " + (car4 == car));

        System.out.println(car4.equals("123"));

    }

}
