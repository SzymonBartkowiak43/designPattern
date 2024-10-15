package org.example.Singelton.zadanie2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    private Database database;
    @BeforeAll
    public void init() {
        database = new Database();
    }

    @Test
    public void getInstanceTest() {
        //given
        String key = "DB1";
        //when
//        DatabaseConnection connection = database.getInstance(key);
//

        //then
    }

}