package com.crud.repository;

import com.crud.dto.ItemDto;
import com.crud.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Frangel Rodriguez
 * Date: 1/9/22
 * Time: 12:43 PM
 */
@Repository
public interface ItemRepository  extends JpaRepository<Item, Long> {


    List<Item> findByItemStatusAndName(String status, String itemName);
}
