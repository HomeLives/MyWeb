package Day1208.dao.test;

import Day1208.dao.BaseDao;
import Day1208.domain.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: Frank
 * @Date: 2020/12/8 19:41
 */
public class BaseDaoTest {

    @Test
    public void update() {
        BaseDao baseDao = new BaseDao();
        boolean flag = baseDao.update( "delete from user where id = ?", 5);
        Assert.assertTrue(flag);
    }

    @Test
    public void search() {
        BaseDao baseDao = new BaseDao();
        List<User> list = baseDao.search(User.class, "select * from user where name = ?", "Tom");
        Assert.assertTrue(list.size() != 0);
    }
}