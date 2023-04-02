package com.shop.admin.brand;

import com.shop.common.entity.Brand;
import com.shop.common.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Long> {

    @Query("select b from Brand b left join fetch b.brandsCategories")
//            " +
//            "left join fetch c.category")
    public List<Brand> findJoinBrand();
}
