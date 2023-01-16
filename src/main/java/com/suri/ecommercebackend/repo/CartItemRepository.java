package com.suri.ecommercebackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.suri.ecommercebackend.model.cart.CartItem;
import com.suri.ecommercebackend.model.cart.CartItemPK;

public interface CartItemRepository extends JpaRepository <CartItem, CartItemPK> {
}
