/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCart.client.ProductoFeignClient;
import pe.cibertec.ecommerce.ApiCart.entity.ItemFeign;
import pe.cibertec.ecommerce.ApiCart.entity.Product;

/**
 *
 * @author jmvil
 */
@Service
public class ItemFeignServiceFeignImpl  implements ItemFeignService{
    
    @Autowired
    private ProductoFeignClient clientFeign;
    

    @Override
    public List<ItemFeign> findAll() {
        return clientFeign.ListProduct();
    }

    
    public ItemFeign findById(Long idItem , Long quantity) {
           Product product = clientFeign.findById(idItem);
    ItemFeign item = new ItemFeign(product, quantity);
    return item;
    }

   
    
    
}
