package hibernate.day.detached.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoWater extends JpaRepository<WaterBottle, Integer>
{

}
