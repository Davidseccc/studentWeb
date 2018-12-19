package cz.secda1.studentWeb.db.repositories;


import cz.secda1.studentWeb.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    List<Category> getRootCategories();

    List<Category> getCategoriesWithParent(String parentName);

    Category findById(long id);

    List<Category>getAllCategoriesWithRoot();


}
