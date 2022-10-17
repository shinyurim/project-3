package com.zerobase.fastlms.admin.service;

import com.zerobase.fastlms.admin.dto.CategoryDto;
import com.zerobase.fastlms.admin.entity.Category;
import com.zerobase.fastlms.admin.model.CategoryInput;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> list();

    boolean add(String categoryName);
    boolean update(CategoryInput parameter);
    boolean del(long id);

    List<CategoryDto> frontList(CategoryDto parameter);

}
