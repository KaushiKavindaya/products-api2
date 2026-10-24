package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it represents a tangible item sold in the catalogue.
// A ShoppingCart is NOT a Product because it represents a container that holds products (HAS-A relationship).

public class PhysicalProduct extends Product{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
