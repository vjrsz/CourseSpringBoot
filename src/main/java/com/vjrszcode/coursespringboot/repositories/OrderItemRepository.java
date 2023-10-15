package com.vjrszcode.coursespringboot.repositories;

import com.vjrszcode.coursespringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // não precisa por que o JpaRepository ja tem ele
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
