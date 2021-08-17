package MyGroup.Places.service;

import MyGroup.Places.models.PostTheatres;
import MyGroup.Places.repos.PostTheatresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostTheatresService {
    @Autowired
    private final PostTheatresRepository postTheatresRepository;

    public PostTheatresService(PostTheatresRepository postTheatresRepository) {
        this.postTheatresRepository = postTheatresRepository;
    }

    public List<PostTheatres> findAll(){
        return postTheatresRepository.findAll();
    }
}
