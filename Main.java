class Product{
    private String name;
    private double price;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
class Book extends Product{
    private String author ;
    private int pages ;
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages(){
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
}
class Electronics extends Product {
    private String brand;
    private String model;
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
class Smartphone extends Electronics{
    private String OperatingSystem;
    public String getOperatingSystem(){
        return OperatingSystem;
    }
    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }
}
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("chair");
        p1.setPrice(500.0);

        System.out.println("Product Name : " + p1.getName());
        System.out.println("Product Price : " + p1.getPrice());
        System.out.println("*************************");

        Product p2 = new Product();
        p2.setName("Television");
        p2.setPrice(20000.0);
        Electronics p2e = new Electronics();
        p2e.setBrand("Samsung");
        p2e.setModel("Neo QLED");

        System.out.println("Product Name : " + p2.getName());
        System.out.println("Product Price : " + p2.getPrice());
        System.out.println("Brand : " + p2e.getBrand());
        System.out.println("Model : " + p2e.getModel());
        System.out.println("*************************");
    
        Product p3 = new Product();
        p3.setName("Iphone");
        p3.setPrice(40000.0);
        Electronics p3e = new Electronics();
        p3e.setBrand("Apple");
        p3e.setModel("Iphone 99");
        Smartphone p3p = new Smartphone();
        p3p.setOperatingSystem("ios");

        System.out.println("Product Name : " + p3.getName());
        System.out.println("Product Price : " + p3.getPrice());
        System.out.println("Brand : " + p3e.getBrand());
        System.out.println("Model : " + p3e.getModel());
        System.out.println("OperatingSystem : " + p3p.getOperatingSystem());
        System.out.println("*************************");
        
        Product p4 = new Product();
        p4.setName("OOP programming");
        p4.setPrice(250.0);
        Book p4b = new Book();
        p4b.setAuthor("John doe");
        p4b.setPages(300);

        System.out.println("Product Name : " + p4.getName());
        System.out.println("Product Price : " + p4.getPrice());
        System.out.println("Author : " + p4b.getAuthor());
        System.out.println("Number of Pages : " + p4b.getPages());
    }
}