package asdf.test.search.service;

import asdf.test.search.entity.Food;
import asdf.test.search.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchService {

    private final SearchRepository searchRepository;

    public Food searchByFoodId(Long foodId) {
        return searchRepository.searchByFoodId(foodId);
    }


}
