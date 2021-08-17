package MyGroup.Places.repos;

import MyGroup.Places.models.PostTheatres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostTheatresRepository extends JpaRepository<PostTheatres, Long> {

    @Query(value = "SELECT * FROM public.\"theatres\"", nativeQuery = true)
    List<PostTheatres> findAll();
}
