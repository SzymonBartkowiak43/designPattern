package org.example.flyweight.teslatank;

import lombok.Getter;

public class UnitStatsRepository {
    @Getter
    private static UnitStats destroyerUnitStats = new UnitStats("Destroyer",10,10,10,10,100);
    @Getter
    private static UnitStats teslaTankUnitStats = new UnitStats("TeslaTank",10,10,10,10,100);

    private UnitStatsRepository() {
    }
}
