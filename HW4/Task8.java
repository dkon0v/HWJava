import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private String grade;

    public Product(String name, double price, String grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getGrade() {
        return grade;
    }
}

public class Task8 {
    public static void main(String[] args) {
        
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 10.5, "Высший сорт"));
        products.add(new Product("Product 2", 15.2, "Второй сорт"));
        products.add(new Product("Product 3", 20.1, "Высший сорт"));
        products.add(new Product("Product 4", 12.7, "Первый сорт"));
        products.add(new Product("Product 5", 18.9, "Высший сорт"));

        double maxPrice = 0;

        // Проходим по всем товарам и находим наибольшую цену среди товаров 1го или 2го сорта с названием "высший"
        for (Product product : products) {
            if ((product.getGrade().equals("Высший сорт") || product.getGrade().equals("Второй сорт"))
                    && product.getName().contains("высший")) {
                if (product.getPrice() > maxPrice) {
                    maxPrice = product.getPrice();
                }
            }
        }

        System.out.println("Наибольшая цена товаров 1го или 2го сорта с названием 'высший': " + maxPrice);
    }
}