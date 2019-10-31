package hibernate.day.thirteen;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface RepoProduct extends CrudRepository<Product, Integer>
{
	Product findByPname(String name);
}
