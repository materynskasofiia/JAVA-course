package test.model.user;

import model.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestUser {
    @Test
    public void testNumberOfUsersForNull(){
        int a=0;
        for(int i=0; i<10000; i++){
            if(User.getNumberOfUsersToAdd()==0) {
                a++;
            }
        }
        assertTrue(a>0);
    }

    @Test
    public void testNumberOfUsersForMaximum(){
        int a=0;
        for(int i=0; i<10000; i++){
            if(User.getNumberOfUsersToAdd()==User.MAX_NUMBER_OF_USERS) {
                a++;
            }
        }
        assertTrue(a>0);
    }
}
