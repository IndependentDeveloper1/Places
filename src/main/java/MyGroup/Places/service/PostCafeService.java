package MyGroup.Places.service;

import MyGroup.Places.models.PostCafe;
import MyGroup.Places.repos.PostCafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostCafeService {
    @Autowired
    private final PostCafeRepository postCafeRepository;

    public PostCafeService(PostCafeRepository postCafeRepository) {
        this.postCafeRepository = postCafeRepository;
    }

    public List<PostCafe> findAll(){
        return postCafeRepository.findAll();
    }
}
