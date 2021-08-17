package MyGroup.Places.service;

import MyGroup.Places.models.PostParks;
import MyGroup.Places.repos.PostParksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostParksService {
    @Autowired
    private final PostParksRepository postParksRepository;

    public PostParksService(PostParksRepository postParksRepository) {
        this.postParksRepository = postParksRepository;
    }

    public List<PostParks> findAll(){
        return postParksRepository.findAll();
    }
}
