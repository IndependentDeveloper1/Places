package MyGroup.Places.service;

import MyGroup.Places.models.PostStadiums;
import MyGroup.Places.repos.PostStadiumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostStadiumsService {
    @Autowired
    private final PostStadiumsRepository postStadiumsRepository;

    public PostStadiumsService(PostStadiumsRepository postStadiumsRepository) {
        this.postStadiumsRepository = postStadiumsRepository;
    }

    public List<PostStadiums> findAll(){
        return postStadiumsRepository.findAll();
    }
}
