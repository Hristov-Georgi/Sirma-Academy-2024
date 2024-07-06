package com.sirmaacademy.entrycourse.stackAndQueue.factorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Robot {

    private String model;
    private int processingTime;
    private int nextProcessing = 0;
    private List<FactorioProduct> productList;

    public Robot(String model, int processingTime) {
        this.model = model;
        this.processingTime = processingTime;
        this.productList = new ArrayList<>();
    }

    public boolean isFree(int processingStartTime) {

        if (nextProcessing <= processingStartTime) {
            this.nextProcessing = processingStartTime + this.processingTime;
            return true;
        }

        return false;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(int processingTime) {
        this.processingTime = processingTime;
    }

    public List<FactorioProduct> getProductList() {
        return Collections.unmodifiableList(this.productList);
    }

    public void setProductList(FactorioProduct product) {
        this.productList.add(product);
    }
}
