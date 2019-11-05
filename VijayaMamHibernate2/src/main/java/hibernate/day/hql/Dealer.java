package hibernate.day.hql;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dealer
{
	@Autowired
	RepoMachine repo;
	
	@PersistenceContext
	EntityManager entity;
	public void list()
	{
		List<Machine> all=new ArrayList<Machine>();
		repo.findAll().forEach(all::add);
		System.out.println(all);
	}
	public void testById()
	{
		Machine mac=repo.findById(1).orElse(new Machine());
		System.out.println(mac);
	}
	public void testByModel()
	{
		Machine mac=repo.findByModel("Compaq");
		System.out.println(mac);
	}
	public void testPriceByModel()
	{
		double amount=repo.findPriceByModel("MacBook");
		System.out.println(amount);
	}
	public void testAllPrice()
	{
		List<Double> all=new ArrayList<Double>();
		repo.findAllPrice().forEach(all::add);
		System.out.println(all);
	}
	public void testCriteriaNRestrictions()
	{
		List<Machine> all=new ArrayList<Machine>();
		CriteriaBuilder build=entity.getCriteriaBuilder();
		CriteriaQuery<Machine> qry=build.createQuery(Machine.class);
		Root<Machine>root=qry.from(Machine.class);
		ParameterExpression<Double> price1=build.parameter(Double.class);
		ParameterExpression<Double> price2=build.parameter(Double.class);
		qry.select(root).where(build.between(root.get("macPrice"), price1, price2));
		TypedQuery<Machine> exact=entity.createQuery(qry);
		exact.setParameter(price1, 30000.6);exact.setParameter(price2, 40000.0);
		exact.getResultList().forEach(all::add);
		System.out.println(all);
	}
}