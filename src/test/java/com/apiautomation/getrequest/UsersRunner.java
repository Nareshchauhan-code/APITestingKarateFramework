package com.apiautomation.getrequest;

import com.intuit.karate.junit5.Karate;

class UsersRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("GetRequest").relativeTo(getClass());
    }    

}
