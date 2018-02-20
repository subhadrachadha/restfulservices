package com.expedia.repository;


import com.expedia.model.LatLong;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LatLongRepository extends CrudRepository<LatLong, Long> {

    public LatLong save(LatLong latLong);

}
