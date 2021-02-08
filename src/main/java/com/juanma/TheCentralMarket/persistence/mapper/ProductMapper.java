package com.juanma.TheCentralMarket.persistence.mapper;

import com.juanma.TheCentralMarket.domain.Product;
import com.juanma.TheCentralMarket.persistence.crud.ProductoCrudRepository;
import com.juanma.TheCentralMarket.persistence.entity.Producto;
import org.mapstruct.*;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@Mapper(componentModel = "spring", uses={CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source="idProducto", target="productId"),
            @Mapping(source="nombre", target="name"),
            @Mapping(source="idCategoria", target="categoryId"),
            @Mapping(source="precioVenta", target="price"),
            @Mapping(source="cantidadStock", target="stock"),
            @Mapping(source="estado", target="active"),
            @Mapping(source="categoria", target="category"),
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto>productos);
    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true )
    Producto toProducto(Product product);
}
