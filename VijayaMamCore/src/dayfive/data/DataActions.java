package dayfive.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class DataActions 
{
	private DataSource dataSource;
	private JdbcTemplate template;

	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		template=new JdbcTemplate(dataSource);
	}
	public void createTable()
	{
		String qry=
"create table vijayamam (day int not null AUTO_INCREMENT ,org varchar(50) NOT NULL , skill varchar(50) not null, lpa double not null, PRIMARY KEY ( day ))";
		template.execute(qry);
		System.out.println("Table has been created");
	}
	public void insert(Recruitment req)
	{
		String qry="insert into vijayamam(org, skill, lpa) values(?,?,?)";
		template.update(qry, new Object[]{req.getOrg(),req.getSkill(),req.getLpa()});
		System.out.println(req+" inserted into table");
	}
	public int getRowStatus()
	{
		return template.queryForObject("select count(*) from vijayamam", Integer.class);
	}
	public String getCompany(int day)
	{
		return template.queryForObject("select org from vijayamam where day="+day, String.class);
	}
	public List<Recruitment> getCompanies(double d1, double d2)
	{
		return template.query("select * from vijayamam where lpa between "+d1+" and  "+d2, new MyMapper());
	}
	public List<Recruitment> getCAll()
	{
		return template.query("select * from vijayamam", new MyMapper());
	}
	public Recruitment getOne(String com)
	{
		return template.queryForObject("select * from vijayamam where org='"+com+"'", new MyMapper());
	}
	public int deleteReq(int day)
	{
		return template.update("delete from vijayamam where day="+day);
	}
	private static final class MyMapper implements RowMapper<Recruitment>
	{
		@Override
		public Recruitment mapRow(ResultSet set, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			Recruitment req=new Recruitment();req.setDay(set.getInt("day"));req.setOrg(set.getString("org"));
			req.setSkill(set.getString("skill"));req.setLpa(set.getDouble("lpa"));
			return req;
		}
	}
}
