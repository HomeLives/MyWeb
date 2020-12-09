package Day1208.dao.impl;

import Day1208.dao.BaseDao;
import Day1208.dao.EmpDao;
import Day1208.domain.Emp;

import java.util.List;

/**
 * @Author Frank
 * @Date: 2020/12/9 0009 上午 9:26
 */
public class EmpDaoImpl extends BaseDao implements EmpDao {
    @Override
    public boolean updateEmp(String sql, Object... obj) {
        return update(sql, obj);
    }

    @Override
    public List<Emp> searchEmp(String sql, Object... obj) {
        return search(Emp.class, sql, obj);
    }
}
