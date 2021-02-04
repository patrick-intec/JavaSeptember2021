package be.infernalwhale.service;

import be.infernalwhale.model.Donut;
import be.infernalwhale.model.Stock;
import be.infernalwhale.persistence.StockDAO;

public class StockService {
    private Stock stock;
    private StockDAO stockDAO;

    public int amountInStock(Donut donut) {
        return stockDAO.getStockAmount(donut);
    }

    public void updateStock(Donut donut) {

    }
}
