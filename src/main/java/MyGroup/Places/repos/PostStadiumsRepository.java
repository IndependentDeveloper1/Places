package MyGroup.Places.repos;

import MyGroup.Places.models.PostStadiums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostStadiumsRepository extends JpaRepository<PostStadiums, Long> {

    @Query(value = "SELECT * FROM public.\"stadiums\"", nativeQuery = true)
    List<PostStadiums> findAll();
}
