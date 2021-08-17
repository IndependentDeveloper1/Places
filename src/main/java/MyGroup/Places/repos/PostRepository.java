package MyGroup.Places.repos;

import MyGroup.Places.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(value = "SELECT * FROM samara WHERE \"type_of\" = ?1", nativeQuery = true)
    List<Post> findAllByTypeOf(String typeOf);
}
