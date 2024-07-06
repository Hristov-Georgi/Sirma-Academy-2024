package com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.service;

import com.sirmaacademy.professionalprogram.inheritanceandinterfaces.inventoryManagementSystem.enums.Category;

public interface Categorizable {

    String getCategory();
    void setCategory(Category category);
}
