package Day1208.dao.test;

import Day1208.dao.impl.EmpDaoImpl;
import Day1208.domain.Emp;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @Author Frank
 * @Date: 2020/12/9 0009 上午 9:29
 */
public class EmpDaoImplTest {
    EmpDaoImpl e = new EmpDaoImpl();

    @Test
    public void update() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Emp emp = new Emp(null, "Frank", "13", 1.0, sdf.parse("2020-10-10"), 10.0, 10.0, 10);
            boolean add = e.update("insert into emp value(null,?,?,?,?,?,?,?)", emp.getEname(), emp.getJob(), emp.getMgr(), emp.getHiredate(), emp.getSal(), emp.getComm(), emp.getDeptno());
            Assert.assertTrue(add);
        } catch (ParseException parseException) {
            parseException.printStackTrace();
        }

    }

    @Test
    public void search() {
        List<Emp> emps = e.searchEmp("select * from emp");
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }


}