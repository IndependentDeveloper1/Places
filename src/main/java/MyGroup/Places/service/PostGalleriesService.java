package MyGroup.Places.service;

import MyGroup.Places.models.PostCafe;
import MyGroup.Places.models.PostGalleries;
import MyGroup.Places.repos.PostCafeRepository;
import MyGroup.Places.repos.PostGalleriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostGalleriesService {
    @Autowired
    private final PostGalleriesRepository postGalleriesRepository;

    public PostGalleriesService(PostGalleriesRepository postGalleriesRepository) {
        this.postGalleriesRepository = postGalleriesRepository;
    }

    public List<PostGalleries> findAll(){
        return postGalleriesRepository.findAll();
    }
}
