package com.crud.service.impl;

import com.crud.dto.ItemDto;
import com.crud.entity.Item;
import com.crud.repository.ItemRepository;
import com.crud.service.ItemService;
import com.crud.utils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Frangel Rodriguez
 * Date: 1/9/22
 * Time: 12:55 PM
 */

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;


    @Override
    public List<ItemDto> findAll() {


        List<Item> allItems = itemRepository.findAll();
        List<ItemDto> itemDtoList= new ArrayList<>();

        if(allItems.size()>0){

            allItems.forEach(e ->{
                ItemDto itemDto = new ItemDto();

                itemDto.setItemId(e.getId());
                itemDto.setItemName(e.getName());
                itemDto.setItemSellingPrice(e.getItemSellingPrice());
                itemDto.setItemBuyingPrice(e.getItemBuyingPrice());
                itemDto.setItemEnteredByUser(e.getItemEnteredByUser());
                itemDto.setItemLastModifiedByUser(e.getItemLastModifiedByUser());
                itemDto.setItemLastModifiedDate(e.getItemLastModifiedDate());
                itemDto.setItemEnteredDate(e.getItemEnteredDate());
                itemDto.setItemStatus(e.getItemStatus());


                itemDtoList.add(itemDto);


            });

           return itemDtoList;


        }else {
            return itemDtoList;
        }

    }

    @Override
    public ItemDto findOne(Long id) {

        Item foundItem;

        ItemDto itemDto = new ItemDto();
       foundItem = itemRepository.findOne(id);
        if(foundItem!=null){


            itemDto.setItemId(foundItem.getId());
            itemDto.setItemName(foundItem.getName());
            itemDto.setItemBuyingPrice(foundItem.getItemBuyingPrice());
            itemDto.setItemSellingPrice(foundItem.getItemSellingPrice());
            itemDto.setItemLastModifiedByUser(foundItem.getItemLastModifiedByUser());
            itemDto.setItemLastModifiedDate(foundItem.getItemLastModifiedDate());
            itemDto.setItemEnteredByUser(foundItem.getItemEnteredByUser());
            itemDto.setItemEnteredDate(foundItem.getItemEnteredDate());
            itemDto.setItemStatus(foundItem.getItemStatus());
        }


        return itemDto ;
    }

    @Override
    public Item save(ItemDto itemDto) {

        Item item = new Item();

        item.setName(itemDto.getItemName());
        item.setItemSellingPrice(itemDto.getItemSellingPrice());
        item.setItemBuyingPrice(itemDto.getItemBuyingPrice());
        item.setItemLastModifiedByUser(itemDto.getItemLastModifiedByUser());
        item.setItemLastModifiedDate(Calendar.getInstance().getTime());
        item.setItemEnteredByUser(itemDto.getItemEnteredByUser());
        item.setItemEnteredDate(Calendar.getInstance().getTime());
        item.setItemStatus(Status.AVAILABLE);

        return itemRepository.save(item);
    }

    @Override
    public List<ItemDto> findByItemStatusAndName(String status, String itemName) {

        List<Item> allItems = itemRepository.findByItemStatusAndName(status,itemName);

        List<ItemDto> foundItems= new ArrayList<>();

        if(allItems.size()>0){

            allItems.forEach(e ->{
                ItemDto itemDto = new ItemDto();

                itemDto.setItemId(e.getId());
                itemDto.setItemName(e.getName());
                itemDto.setItemSellingPrice(e.getItemSellingPrice());
                itemDto.setItemBuyingPrice(e.getItemBuyingPrice());
                itemDto.setItemEnteredByUser(e.getItemEnteredByUser());
                itemDto.setItemLastModifiedByUser(e.getItemLastModifiedByUser());
                itemDto.setItemLastModifiedDate(e.getItemLastModifiedDate());
                itemDto.setItemEnteredDate(e.getItemEnteredDate());
                itemDto.setItemStatus(e.getItemStatus());


                foundItems.add(itemDto);


            });

            return foundItems;


        }else {
            return foundItems;
        }

    }
}
