package hibernate.day.twelve;

import org.springframework.data.repository.CrudRepository;

public interface PersonRemote extends CrudRepository<Org, Person> 
{
}
