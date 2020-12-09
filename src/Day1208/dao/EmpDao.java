package Day1208.dao;

import Day1208.domain.Emp;

import java.util.List;

/**
 * @Author Frank
 * @Date: 2020/12/9 0009 上午 9:23
 */
public interface EmpDao {
    /**
     * 更改
     *
     * @param sql
     * @param obj
     * @return
     */
    boolean updateEmp(String sql, Object... obj);

    /**
     * 查找
     *
     * @param sql
     * @param obj
     * @return
     */
    List<Emp> searchEmp(String sql, Object... obj);
}
