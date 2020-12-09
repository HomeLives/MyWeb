package Day1208.dao;

import Day1208.domain.Emp;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author Frank
 * @Date: 2020/12/9 0009 上午 9:29
 */
public class EmpDaoImplTest {
    EmpDaoImpl e = new EmpDaoImpl();

    @Test
    public void update() {
        System.out.println(e.update("delete from emp where empno = ?", 57));
    }

    @Test
    public void search() {
        List<Emp> emps = e.searchEmp("select * from emp");
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }


}