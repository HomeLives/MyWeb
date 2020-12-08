package Day1207.dao;

import Util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author Frank
 * @Date: 2020/12/7 0007 下午 3:04
 */
public class UserDao {
    public boolean hasUser(String name, String password) {
        Connection connection = JDBCUtil.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement("select * from user where name = ? and password = ?");
            statement.setString(1, name);
            statement.setString(2, password);
            resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtil.close(resultSet, statement, connection);
        }
        return false;
    }
}
