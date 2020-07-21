package pl.sda;

public class CarOption {

    private String name; //nazwa wyposazenia
    private double price;
    private boolean chosenOne;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isChosenOne() {
        return chosenOne;
    }

    public void setChosenOne(boolean chosenOne) {
        this.chosenOne = chosenOne;
    }
}
