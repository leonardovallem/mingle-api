package com.valj.mingleapi.repository;

import com.valj.mingleapi.model.Receita;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends MongoRepository<Receita, String> {

}
