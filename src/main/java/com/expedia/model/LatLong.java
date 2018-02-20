package com.expedia.model;



import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="latlong")
public class LatLong {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String latlong;
    private Double radius;
    private long types_id_fk;

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLatlong() {
        return latlong;
    }

    public void setLatlong(String latlong) {
        this.latlong = latlong;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public long getTypes_id_fk() {
        return types_id_fk;
    }

    public void setTypes_id_fk(long types_id_fk) {
        this.types_id_fk = types_id_fk;
    }

    public LatLong(String latlong, Double radius, long types_id_fk) {
        this.latlong = latlong;
        this.radius = radius;
        this.types_id_fk = types_id_fk;
    }

    public LatLong() {
        super();
    }
}

