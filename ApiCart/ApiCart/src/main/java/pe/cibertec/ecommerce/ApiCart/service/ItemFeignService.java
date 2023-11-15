/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCart.service;

import java.util.List;
import pe.cibertec.ecommerce.ApiCart.entity.ItemFeign;

/**
 *
 * @author jmvil
 */
public interface ItemFeignService {
        public List<ItemFeign> findAll();
        public ItemFeign findById (Long id);
}
