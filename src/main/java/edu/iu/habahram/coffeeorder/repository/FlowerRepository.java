package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.RealFlowers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository
        extends CrudRepository<RealFlowers, String> {
}
