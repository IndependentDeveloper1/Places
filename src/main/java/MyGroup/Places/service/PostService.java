package MyGroup.Places.service;

import MyGroup.Places.models.Post;
import MyGroup.Places.repos.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAllByTypeOf(String typeOf){
        return postRepository.findAllByTypeOf(typeOf);
    }
}
