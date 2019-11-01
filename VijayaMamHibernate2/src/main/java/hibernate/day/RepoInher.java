package hibernate.day;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoInher extends CrudRepository<Resource, Integer>
{

}
