package MyGroup.Places.repos;

import MyGroup.Places.models.PostMonuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostMonumentsRepository extends JpaRepository<PostMonuments, Long> {

    @Query(value = "SELECT * FROM public.\"monuments\"", nativeQuery = true)
    List<PostMonuments> findAll();
}
