package MyGroup.Places.service;

import MyGroup.Places.models.PostRestaurants;
import MyGroup.Places.repos.PostRestaurantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostRestaurantsService {
    @Autowired
    private final PostRestaurantsRepository postRestaurantsRepository;

    public PostRestaurantsService(PostRestaurantsRepository postRestaurantsRepository) {
        this.postRestaurantsRepository = postRestaurantsRepository;
    }

    public List<PostRestaurants> findAll(){
        return postRestaurantsRepository.findAll();
    }
}
