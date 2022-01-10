package com.crud.service;

import com.crud.dto.ItemDto;
import com.crud.entity.Item;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Frangel Rodriguez
 * Date: 1/9/22
 * Time: 12:52 PM
 */
public interface ItemService {


    List<ItemDto> findAll();


    ItemDto findOne(Long id);


    Item save(ItemDto item);


    List<ItemDto> findByItemStatusAndName(String status,String itemName);
}
