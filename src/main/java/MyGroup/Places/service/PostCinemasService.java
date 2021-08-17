package MyGroup.Places.service;

import MyGroup.Places.models.PostCinemas;
import MyGroup.Places.repos.PostCinemasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostCinemasService {
    @Autowired
    private final PostCinemasRepository postCinemasRepository;

    public PostCinemasService(PostCinemasRepository postCinemasRepository) {
        this.postCinemasRepository = postCinemasRepository;
    }

    public List<PostCinemas> findAll(){
        return postCinemasRepository.findAll();
    }
}
