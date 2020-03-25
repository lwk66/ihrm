package com.ihrm.company;

import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.Company;
import org.apache.logging.log4j.util.PropertySource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

/**
 * @author liuwk@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2020/3/20 23:35
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CompanyDaoTest {
    @Autowired
    private CompanyDao companyDao;
    @Test
    public void test(){
        Company company = companyDao.findById("1").get();
        System.out.println(company);
    }
}
