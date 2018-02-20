package com.expedia.model;



import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="types")
public class Types {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String types;

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Types(String types) {
        super();
        this.types = types;
    }

    public Types() {
        super();
    }
}

