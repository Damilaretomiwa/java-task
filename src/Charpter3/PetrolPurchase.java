package Charpter3;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double literPrice;
    private double discountPercentage;

    public PetrolPurchase(String location, String petrolType, int quantity, double discountPercentage, double literPrice) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.literPrice = literPrice;
        this.discountPercentage = discountPercentage;


    }

}
