package hibernate.day.hql;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoMachine extends JpaRepository<Machine, Integer>
{
	@Query("from Machine where macModel= :model")// select * from machine where mac_model=?
	public Machine findByModel(String model);
	@Query("select macPrice from Machine where macModel= :model")
	public Double findPriceByModel(String model);
	@Query("select macPrice from Machine")
	public List<Double> findAllPrice();
}
