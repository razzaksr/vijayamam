package dayfive.data;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DaoActions 
{
	private DataSource dataSource;
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public int update(int id, double pack)
	{
		try {
			PreparedStatement ps=dataSource.getConnection().prepareStatement("update vijayamam set lpa=? where day=?");
			ps.setDouble(1, pack);ps.setInt(2, id);
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
