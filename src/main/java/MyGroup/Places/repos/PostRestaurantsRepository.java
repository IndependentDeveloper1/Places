package MyGroup.Places.repos;

import MyGroup.Places.models.PostRestaurants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRestaurantsRepository extends JpaRepository<PostRestaurants, Long> {

    @Query(value = "SELECT * FROM public.\"restaurants\"", nativeQuery = true)
    List<PostRestaurants> findAll();
}
