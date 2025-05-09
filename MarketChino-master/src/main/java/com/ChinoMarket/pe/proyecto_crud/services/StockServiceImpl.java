package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Stock;
import com.ChinoMarket.pe.proyecto_crud.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public Stock crearStock(Stock stock) {
        int entradas = stock.getEntradas() != null ? stock.getEntradas() : 0;
        int salidas = stock.getSalidas() != null ? stock.getSalidas() : 0;
        stock.setBalance(entradas - salidas);
        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> obtenerTodosLosStocks() {
        return stockRepository.findAll();
    }

    @Override
    public List<Stock> obtenerStockPorProductoId(Long productoIdPro) {
        return stockRepository.findByProductoIdPro(productoIdPro);
    }

    @Override
    public void eliminarStock(Long id) {
        stockRepository.deleteById(id);
    }
}
