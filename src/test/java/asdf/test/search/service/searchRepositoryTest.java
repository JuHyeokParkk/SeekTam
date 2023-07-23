package asdf.test.search.service;

import asdf.test.search.entity.Food;
import asdf.test.search.repository.SearchRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class searchRepositoryTest {

    @Autowired
    private SearchRepository searchRepository;

    private Long foodId;

    @BeforeEach
    public void init() {
        foodId = 1234L;
    }

    @Test
    public void searchTestFromDB() {
        Food targetFood = searchRepository.searchByFoodId(foodId);

        Assertions.assertNotNull(targetFood);
        Assertions.assertTrue(targetFood.getFoodId() == 1234L);
        Assertions.assertEquals(targetFood.getFoodType(), "가공식품");


    }

}