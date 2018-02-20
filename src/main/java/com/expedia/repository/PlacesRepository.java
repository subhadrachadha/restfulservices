package com.expedia.repository;


import com.expedia.model.Places;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlacesRepository extends CrudRepository<Places, Long> {

    public Places save(Places places);

}
