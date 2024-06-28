package inheritanceAndInterfaces.inventoryManagementSystem.service;

import inheritanceAndInterfaces.inventoryManagementSystem.enums.Category;

public interface Categorizable {

    String getCategory();
    void setCategory(Category category);
}
