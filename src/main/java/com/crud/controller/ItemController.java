package com.crud.controller;

import com.crud.dto.ItemDto;
import com.crud.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Frangel Rodriguez
 * Date: 1/9/22
 * Time: 12:42 PM
 */


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("app/api/v1/item")
public class ItemController {

    private final ItemService itemService;


    public ItemController(ItemService itemService) {
        this.itemService = itemService;

    }



    @GetMapping
    public ResponseEntity<List<ItemDto>> findAll(){

        List<ItemDto> itemDtoList = itemService.findAll();
             if(itemDtoList.size()>0){

                 itemDtoList = itemService.findAll();
                 return new ResponseEntity<>(itemDtoList,HttpStatus.OK);
             }
          return new ResponseEntity<>(itemDtoList,HttpStatus.NO_CONTENT);
    }


    @PostMapping
    public ResponseEntity<ItemDto> create(@RequestBody ItemDto itemDto){

         itemService.save(itemDto);

         return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(path = {"/{itemId}"})
    public ResponseEntity<ItemDto> findOne(@PathVariable(value = "itemId",required = true) long id){

        ItemDto foundItem = itemService.findOne(id);
        if(foundItem.getItemId()!= null){
             return new ResponseEntity<> (foundItem,HttpStatus.OK);
        }

        return new ResponseEntity<> (foundItem,HttpStatus.NOT_FOUND);
    }


    @GetMapping(path = {"/items"})
    public ResponseEntity<List<ItemDto>>  findByStatusAndName(
                                             @RequestParam(value = "itemStatus")String itemStatus,
                                             @RequestParam(value = "itemName",required = false) String itemName){

        List<ItemDto> itemDtoList =  itemService.findByItemStatusAndName(itemStatus,itemName);
        if(itemDtoList.size()>0){
            return new ResponseEntity<>(itemDtoList,HttpStatus.OK);
        }
        return new ResponseEntity<>(itemDtoList,HttpStatus.NO_CONTENT);

    }


}
