package com.harsh.springbootJDBC.repo;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.harsh.springbootJDBC.model.Mobile;

@Repository
public class MobileRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Mobile mobile) {
        System.out.println("MobileRepo: Saving Mobile into the DataBase....");
        // String yahSQLKiQueryHai = "insert into mobile(name,simname) values(?,?)";
        String yahSQLKiQueryHai = "insert into mobile(name, simname) values(?,?)";


        // But ye query jo hai vo tabhi chalegi jab apna jo bhi user hai usko saari permissions hongi like CRUD tables in the DB aur to aur bhaisahab apni table schema atleast pahle se present honi chahiye tabhi ye chalegi nahin to ye error aayega org.springframework.jdbc.BadSqlGrammarException: PreparedStatementCallback; bad SQL grammar [insert into mobile(name, simname) values(?,?)] samjhe
        System.out.println("MobileRepo: Query to DB is: " + yahSQLKiQueryHai + " " + mobile.getMobileName() + " " + mobile.getSimName());

        int yahLijiyeKitniRowsAffectedHuyinHainUnkaNumber = jdbc.update(yahSQLKiQueryHai, mobile.getMobileName(), mobile.getSimName());
        System.out.println(yahLijiyeKitniRowsAffectedHuyinHainUnkaNumber + " rows affected....");

        System.out.println("MobileRepo: Saved Mobile into the DataBase....");

    }

    public List<Mobile> findAll() {
        System.out.println("MobileRepo: Getting All Mobiles from the DataBase....");
        RowMapper<Mobile> yahRowMapperHaiIskaKaamDataKoFormatKarnaHaiKiKisTarahDataKoPresentKarnaHaiUskaMapperFunctionSamjhe = (yahResultSetRahega, yahRowNumberRahegi) -> {
            Mobile m= new Mobile();
			// Ye dummy operations hain just to understand isliye sim ko set nahin kar rahe hain but kar sakte hain like "BSNL" string mili to BSNL sim ka object create kar diya samjhe
            m.setMobileName(yahResultSetRahega.getString("name"));
		    return m; 
        };
        List<Mobile> allMobiles = jdbc.query("select * from mobile", yahRowMapperHaiIskaKaamDataKoFormatKarnaHaiKiKisTarahDataKoPresentKarnaHaiUskaMapperFunctionSamjhe);
        System.out.println("MobileRepo: Got All Mobiles from the DataBase....");
        return allMobiles;
    }

}