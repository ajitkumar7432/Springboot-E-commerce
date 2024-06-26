package com.sheryians.major.service;

import com.sheryians.major.model.Category;
import com.sheryians.major.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Category>getAllCategory(){
        return categoryRepository.findAll();

    }
    public void addCategory(Category category){
        categoryRepository.save(category);

    }
    public void removeCategoryById(int id)
    {
        categoryRespository.deleteById(id);
    }
}
