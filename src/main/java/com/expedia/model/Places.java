package com.expedia.model;



import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="places")
public class Places {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long latlong_id;

    private String places;

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getLatlong_id() {
        return latlong_id;
    }

    public void setLatlong_id(long latlong_id) {
        this.latlong_id = latlong_id;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public Places(long latlong_id, String places) {
        this.latlong_id = latlong_id;
        this.places = places;
    }

    public Places() {
        super();
    }
}

