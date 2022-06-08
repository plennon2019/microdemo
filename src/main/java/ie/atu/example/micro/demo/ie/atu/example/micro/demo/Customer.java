package ie.atu.example.micro.demo.ie.atu.example.micro.demo;

public class Customer {
    private final String name;
    private final Long Id;

    public Customer(String name, Long id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return Id;
    }
}
