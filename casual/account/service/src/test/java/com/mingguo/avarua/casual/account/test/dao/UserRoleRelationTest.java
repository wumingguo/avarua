package com.mingguo.avarua.casual.account.test.dao;

import com.mingguo.avarua.casual.account.model.UserRoleRelation;
import com.mingguo.avarua.casual.account.service.repository.dao.UserRoleRelationDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wumingguo on 2015/9/21.
 */
public class UserRoleRelationTest extends BaseDaoTest{

    @Autowired
    private UserRoleRelationDao userRoleRelationDao;

    @Test
    public void testAddRelation() {
        UserRoleRelation userRoleRelation = new UserRoleRelation();
        userRoleRelation.setRoleId(1);
        userRoleRelation.setUserId(2);
        System.out.println("addUserRoleRelation:-------->>>>>>" + userRoleRelationDao.addRelation(userRoleRelation));

    }

    @Test
    public void testGetRelations() {

        //print result
        System.out.println("getCountByRoleId(1):----->>>>> " + userRoleRelationDao.getRelationCountByRoleId(1));
//        System.out.println("getRelationById(1):------>>>>> " + JSON.toJSONString(userRoleRelationDao.getRelationById(1)));
//        System.out.println("getRelationByUserIdAndRoleId(1,1):------->>>>>>" + JSON.toJSONString(userRoleRelationDao.getRelationByUserIdAndRoleId(1, 1)));
//
//        System.out.println("getRelationsByRoleId(1, 1, 10):-------->>>>>>> " + JSON.toJSONString(userRoleRelationDao.getRelationsByRoleId(1, 1, 10)));
//        System.out.println("getRelationsByUserId(1):----------->>>>>>>> " + JSON.toJSONString(userRoleRelationDao.getRelationsByUserId(1)));
//
//        System.out.println("getRelationsByUserIds(1,2):-------->>>>>>>>>>>  " + JSON.toJSONString(userRoleRelationDao.getRelationsByUserIds(Arrays.asList(1, 2))));
    }

    @Test
    public void testUpdateRelation(){

    }
}
