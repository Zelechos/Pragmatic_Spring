package projectservice.project.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "technologies", nullable = false)
    private List<String> technologies;
    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "deployed", nullable = false)
    private boolean deployed;

    public Project() {
    }

    public Project(Long id, String name, List<String> technologies, Double price, boolean deployed) {
        this.id = id;
        this.name = name;
        this.technologies = technologies;
        this.price = price;
        this.deployed = deployed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isDeployed() {
        return deployed;
    }

    public void setDeployed(boolean deployed) {
        this.deployed = deployed;
    }
}
