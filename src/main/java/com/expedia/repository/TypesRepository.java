package com.expedia.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.expedia.model.Types;


@Repository
public interface TypesRepository extends CrudRepository<Types, Long> {

    public Types save(Types type);

}
