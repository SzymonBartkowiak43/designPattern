package org.example.zajecia.zadanie2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionManagerImplTest {

    @Test
    public void instanceTest() {
        //given
        ConnectionManager connectionManage = ConnectionManagerImpl.getInstance();
        //when
        ConnectionManager instance = ConnectionManagerImpl.getInstance();

        //then
        assertEquals(instance.hashCode(), connectionManage.hashCode());
    }

    @Test
    public void getConnectionDifferentDatabases() {
        //given
        ConnectionManager connectionManage = ConnectionManagerImpl.getInstance();
        String key1= "DB1";
        String key2= "DB2";
        //when
        DatabaseConnection connection1 = connectionManage.getConnection(key1);
        DatabaseConnection connection2 = connectionManage.getConnection(key2);

        connection1.addRecord("Jan", 1);
        connection2.addRecord("Marek", 2);
        //then
        assertNotEquals(connection1.hashCode(), connection2.hashCode());
        assertEquals(connection1.getRecord(1).get().getName(), "Jan");
        assertEquals(connection2.getRecord(1).get().getName(), "Marek");
    }

    @Test
    public void getConnectionTheSameDatabases() {
        //given
        ConnectionManager connectionManage = ConnectionManagerImpl.getInstance();
        String key1= "DB1";
        DatabaseConnection connection1 = connectionManage.getConnection(key1);
        DatabaseConnection connection2 = connectionManage.getConnection(key1);
        DatabaseConnection connection3 = connectionManage.getConnection(key1);
        DatabaseConnection connection4 = connectionManage.getConnection(key1);

        //when
        connection1.addRecord("Jan",1);
        connection1.addRecord("Adam",1);
        connection3.addRecord("Paweł",1);
        connection4.addRecord("Kuba",1);

        //then

        assertNotEquals(connection1.hashCode(), connection2.hashCode());
        assertEquals(connection1.hashCode(), connection4.hashCode());
        assertEquals(connection1.getRecord(4).get().getName(), "Kuba");

    }


}