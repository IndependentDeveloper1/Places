package MyGroup.Places.repos;

import MyGroup.Places.models.PostMuseums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostMuseumsRepository extends JpaRepository<PostMuseums, Long> {

    @Query(value = "SELECT * FROM public.\"museums\"", nativeQuery = true)
    List<PostMuseums> findAll();
}
