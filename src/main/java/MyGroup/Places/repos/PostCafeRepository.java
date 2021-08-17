package MyGroup.Places.repos;

import MyGroup.Places.models.PostCafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostCafeRepository extends JpaRepository<PostCafe, Long> {

    @Query(value = "SELECT * FROM public.\"cafe\"", nativeQuery = true)
    List<PostCafe> findAll();
}
