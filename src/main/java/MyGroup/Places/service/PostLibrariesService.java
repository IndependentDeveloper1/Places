package MyGroup.Places.service;

import MyGroup.Places.models.PostLibraries;
import MyGroup.Places.repos.PostLibrariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostLibrariesService {
    @Autowired
    private final PostLibrariesRepository postLibrariesRepository;

    public PostLibrariesService(PostLibrariesRepository postLibrariesRepository) {
        this.postLibrariesRepository = postLibrariesRepository;
    }

    public List<PostLibraries> findAll(){
        return postLibrariesRepository.findAll();
    }
}
