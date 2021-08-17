package MyGroup.Places.repos;

import MyGroup.Places.models.PostParks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostParksRepository extends JpaRepository<PostParks, Long> {

    @Query(value = "SELECT * FROM public.\"parks\"", nativeQuery = true)
    List<PostParks> findAll();
}
