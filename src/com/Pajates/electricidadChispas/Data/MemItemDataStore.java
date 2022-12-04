package com.Pajates.electricidadChispas.Data;

import com.Pajates.electricidadChispas.Domain.models.Products_Service;
import java.util.List;
import java.util.TreeMap;

public class MemItemDataStore implements ItemDataStore{

    private TreeMap<Integer, Products_Service> dataStore = new TreeMap<>();


    @Override
    public void saveItem(Products_Service productsService) {

    }

    @Override
    public void deleteItem(Products_Service productsService) {

    }

    @Override
    public void updateItem(Products_Service productsService) {

    }

    @Override
    public List<Products_Service> getAllItems() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Products_Service findById(Integer codItem) {
        return dataStore.get(codItem);
    }
}
