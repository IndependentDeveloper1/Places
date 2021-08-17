package MyGroup.Places.repos;

import MyGroup.Places.models.PostGalleries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostGalleriesRepository extends JpaRepository<PostGalleries, Long> {

    @Query(value = "SELECT * FROM public.\"galleries\"", nativeQuery = true)
    List<PostGalleries> findAll();
}
