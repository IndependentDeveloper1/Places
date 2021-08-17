package MyGroup.Places.repos;

import MyGroup.Places.models.PostLibraries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostLibrariesRepository extends JpaRepository<PostLibraries, Long> {

    @Query(value = "SELECT * FROM public.\"libraries\"", nativeQuery = true)
    List<PostLibraries> findAll();
}
