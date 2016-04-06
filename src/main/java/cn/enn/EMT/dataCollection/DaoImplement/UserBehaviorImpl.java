package cn.enn.EMT.dataCollection.DaoImplement;

//import java.sql.ResultSet;

//import java.sql.SQLException;

//import org.springframework.jdbc.core.RowCallbackHandler;
//import org.springframework.stereotype.Repository;

//import cn.enn.EMT.dataCollection.UserBehaviorDao;
//import cn.enn.EMT.dataCollection.po.UserBehavior;

/*
@Repository
public class UserBehaviorImpl extends BaseDaoImpl implements UserBehaviorDao {
	
	@Override
	public UserBehavior getLatestUserBehaviorInformation() {
		// TODO Auto-generated method stub
		String sql = "select top 1 * from userbehavior";

		final UserBehavior userBehavior = new UserBehavior();

		this.getJdbcTemplate().query(sql, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {

				userBehavior.setId(rs.getInt("id"));
				userBehavior.setUserID(rs.getString("ub_userID"));
				userBehavior.setTime(rs.getDate("ub_time"));
				userBehavior.setTemperature(rs.getInt("ub_temperature"));
				userBehavior.setSpeed(rs.getString("ub_speed"));
				userBehavior.setMode(rs.getString("ub_mode"));
			}
		});

		return userBehavior;
		
	}	
}
*/