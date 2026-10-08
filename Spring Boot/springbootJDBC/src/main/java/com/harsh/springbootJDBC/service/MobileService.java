package com.harsh.springbootJDBC.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.harsh.springbootJDBC.repo.MobileRepo;
import com.harsh.springbootJDBC.model.Mobile;



@Service
public class MobileService {

    private MobileRepo yahMobileRepoHai;

    public MobileRepo getYahMobileRepoHai() {
        return yahMobileRepoHai;
    }

    @Autowired
    public void setYahMobileRepoHai(MobileRepo yahMobileRepoHai) {
        this.yahMobileRepoHai = yahMobileRepoHai;
    }

    public void saveMobile(Mobile mobile) {
        System.out.println("MobileService: Saving Mobile into the DataBase....");
        yahMobileRepoHai.save(mobile);
        System.out.println("MobileService: Saved Mobile into the DataBase....");
    }

    public List<Mobile> getAllMobiles() {
        System.out.println("MobileService: Getting All Mobiles from the DataBase....");
        List<Mobile> mobiles = yahMobileRepoHai.findAll();
        System.out.println("MobileService: Got All Mobiles from the DataBase....");
        return mobiles;
    }
    
}