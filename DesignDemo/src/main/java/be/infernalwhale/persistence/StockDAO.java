package be.infernalwhale.persistence;

import be.infernalwhale.model.Donut;

public class StockDAO {
    public int getStockAmount(Donut donut) {
        return Integer.MAX_VALUE; // Effectieve communication met een persistent resource (DBMS, File op disk, whatever...)
    }
}
