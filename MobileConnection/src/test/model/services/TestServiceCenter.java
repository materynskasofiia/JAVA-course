package test.model.services;

import model.services.ServiceCenter;
import model.tariffs.MobileTariff;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestServiceCenter {
    private ServiceCenter sc;

    @Before
    public void createServiceCenter(){
        sc = new ServiceCenter();
    }

    @After
    public void nullServiceCenter(){
        sc=null;
    }

    @Test
    public void checkUserDataBase(){
        assertEquals(sc.userDataBase(), (MobileTariff.numberOfUsers - sc.getList().size()));
    }
/*
    @Test
    public void testFilter(){
        sc.filterByMinutesTextsAndInternetWithStandardFilters(ServiceCenter.filter1);
    }*/
}
