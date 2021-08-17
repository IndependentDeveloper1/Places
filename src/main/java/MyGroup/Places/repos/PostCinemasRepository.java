package MyGroup.Places.repos;

import MyGroup.Places.models.PostCinemas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostCinemasRepository extends JpaRepository<PostCinemas, Long> {

    @Query(value = "SELECT * FROM public.\"cinemas\"", nativeQuery = true)
    List<PostCinemas> findAll();
}
