package org.example.zajecia.zadanie2;

import org.example.zajecia.zadanie2.Database;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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