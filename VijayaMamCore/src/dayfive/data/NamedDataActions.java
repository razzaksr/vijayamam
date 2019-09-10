package dayfive.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
//@Component
public class NamedDataActions 
{
	private DataSource dataSource;
	private NamedParameterJdbcTemplate named;
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		named=new NamedParameterJdbcTemplate(dataSource);
	}
	public Recruitment getFetch(int sk)
	{
		String qry="select * from vijayamam where day=:a";
		SqlParameterSource sql=new MapSqlParameterSource("a", sk);
		return named.queryForObject(qry,sql,new MyMapper());
	}
	public Recruitment getFetch(double sk)
	{
		String qry="select * from vijayamam where lpa=:a";
		SqlParameterSource sql=new MapSqlParameterSource("a", sk);
		return named.queryForObject(qry,sql,new MyMapper());
	}
	public List<Recruitment> getFetch(String sk)
	{
		String qry="select * from vijayamam where skill like :a";
		SqlParameterSource sql=new MapSqlParameterSource("a", sk);
		return named.query(qry,sql,new MyMapper());
	}
	private static final class MyMapper implements RowMapper<Recruitment>
	{
		@Override
		public Recruitment mapRow(ResultSet set, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			Recruitment req=new Recruitment();req.setDay(set.getInt("day"));req.setOrg(set.getString("org"));
			req.setSkill(set.getString("skill"));req.setLpa(set.getDouble("lpa"));//System.out.println(req);
			return req;
		}
	}
}
