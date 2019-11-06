package hibernate.day;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LapRepository extends JpaRepository<Machine, Integer> {
	@Query("from Machine where macModel= :model")
	public List<Machine> findByModel(String model);
	@Query("from Machine where macPrice between :price1 and :price2")
	public List<Machine> findByBetween(double price1,double price2);
}
