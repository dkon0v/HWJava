import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    private String name;
    private String country;
    private double weight;
    private double price;
    private String grade;

    public Product(String name, String country, double weight, double price, String grade) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public double getPrice() {
        return price;
    }
}

public class Task9 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product A", "Country A", 100, 10.99, "Grade 1"));
        products.add(new Product("Product B", "Country B", 200, 8.99, "Grade 2"));
        products.add(new Product("Product C", "Country C", 150, 12.99, "Grade 1"));
        products.add(new Product("Product D", "Country D", 120, 9.99, "Grade 2"));

        String desiredGrade = "Grade 1";

        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getGrade().equals(desiredGrade)) {
                filteredProducts.add(product);
            }
        }

        Collections.sort(filteredProducts, Comparator.comparing(Product::getPrice));

        if (!filteredProducts.isEmpty()) {
            Product cheapestProduct = filteredProducts.get(0);
            System.out.println("Cheapest product of grade " + desiredGrade + ": " + cheapestProduct.getName());
        } else {
            System.out.println("No products found for grade " + desiredGrade);
        }
    }
}