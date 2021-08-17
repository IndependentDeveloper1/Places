package MyGroup.Places.service;

import MyGroup.Places.models.Post;
import MyGroup.Places.models.PostMuseums;
import MyGroup.Places.repos.PostMuseumsRepository;
import MyGroup.Places.repos.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostMuseumsService {
    @Autowired
    private final PostMuseumsRepository postMuseumsRepository;

    public PostMuseumsService(PostMuseumsRepository postRepository) {
        this.postMuseumsRepository = postRepository;
    }

    public List<PostMuseums> findAll(){
        return postMuseumsRepository.findAll();
    }
}
