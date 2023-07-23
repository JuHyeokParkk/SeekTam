package asdf.test.search.repository;

import asdf.test.search.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository<Food, Long> {

    Food searchByFoodId(Long foodId);

}
