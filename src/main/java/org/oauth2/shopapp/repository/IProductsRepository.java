package org.oauth2.shopapp.repository;

import org.oauth2.shopapp.dto.response.ProductResponse;
import org.oauth2.shopapp.entity.Products;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductsRepository extends MongoRepository<Products, String> {
//    Pageable<ProductResponse> find

    List<Products> findProductsByNameContainingIgnoreCase(String name);
}
