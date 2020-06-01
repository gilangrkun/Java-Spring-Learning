import java.util.Optional;

public class OptionalJavaDemo {
    public static void main(String[] args) {

        Product product1 = new Product(184992822, "Esprit", "Pablo", "Shirt", 10);

        long id = product1.getId();
        String brand = product1.getBrand();
        String name = product1.getName().orElse("the product's name is not given");
        String category = product1.getCategory().orElse("category is unknown");
        int quantity = product1.getQuantity().orElse(0);

        System.out.print("\n\tDetails product:");
        System.out.printf("\n\tID          %d\n\tBrand       %s\n\tName        %s\n\tCategory    %s\n\tAvailable   %d",
                id, brand, name, category, quantity);
        System.out.println();

        Product product2 = new Product(692052048, "Burberry", null, null, null);

        long id2 = product2.getId();
        String brand2 = product2.getBrand();
        String name2 = product2.getName().orElse("the product's name is not given");
        String category2 = product2.getCategory().orElse("category is unknown");
        Integer quantity2 = product2.getQuantity().orElse(0);

        System.out.print("\n\tDetails product:");
        System.out.printf("\n\tID          %d\n\tBrand       %s\n\tName        %s\n\tCategory    %s\n\tAvailable   %d",
                id2, brand2, name2, category2, quantity2);
        System.out.println();

    }
}

class Product {
    private long id;
    private String brand;
    private String name;
    private String category;
    private Integer quantity;

    public Product(long id, String brand, String name, String category, Integer quantity) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(category);
    }

    public Optional<Integer> getQuantity() {
        return Optional.ofNullable(quantity);
    }
}