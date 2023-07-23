package asdf.test.search.controller;

import asdf.test.search.entity.Food;
import asdf.test.search.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food/search")
@RequiredArgsConstructor
public class TestController {


    private final SearchService searchService;

    @GetMapping("/{foodId}")
    public Food searchFoodInfo(@PathVariable Long foodId) {
        System.out.println(foodId == 1234L);
        Food targetFood = searchService.searchByFoodId(foodId);


        return targetFood;
    }

}
