package MyGroup.Places.service;

import MyGroup.Places.models.PostMonuments;
import MyGroup.Places.repos.PostMonumentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostMonumentsService {
    @Autowired
    private final PostMonumentsRepository postMonumentsRepository;

    public PostMonumentsService(PostMonumentsRepository postMonumentsRepository) {
        this.postMonumentsRepository = postMonumentsRepository;
    }

    public List<PostMonuments> findAll(){
        return postMonumentsRepository.findAll();
    }
}
