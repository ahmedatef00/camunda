package com.noodles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@Repository
@NoRepositoryBean
public interface OrderRepository extends JpaRepository<Long, OrderEntity> {
}
