package com.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Frangel Rodriguez
 * Date: 1/9/22
 * Time: 1:09 PM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto  implements Serializable {




    @JsonProperty("itemId")
    private Long itemId;
    @NotNull
    @JsonProperty("itemName")
    private String itemName;

    @JsonProperty("itemEnteredDate")
    private Date itemEnteredDate;

    @JsonProperty("itemEnteredByUser")
    private String itemEnteredByUser;

    @NotNull
    @JsonProperty("itemBuyingPrice")
    private Double itemBuyingPrice;
    @NotNull
    @JsonProperty("itemSellingPrice")
    private Double itemSellingPrice;

    @JsonProperty("itemLastModifiedDate")
    private Date itemLastModifiedDate;

    @JsonProperty("itemLastModifiedByUser")
    private String itemLastModifiedByUser;

    @JsonProperty("itemStatus")
    private String itemStatus;


/*    public ItemDto() {
    }



    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getItemEnteredDate() {
        return itemEnteredDate;
    }

    public void setItemEnteredDate(Date itemEnteredDate) {
        this.itemEnteredDate = itemEnteredDate;
    }

    public Double getItemBuyingPrice() {
        return itemBuyingPrice;
    }

    public void setItemBuyingPrice(Double itemBuyingPrice) {
        this.itemBuyingPrice = itemBuyingPrice;
    }

    public Double getItemSellingPrice() {
        return itemSellingPrice;
    }

    public void setItemSellingPrice(Double itemSellingPrice) {
        this.itemSellingPrice = itemSellingPrice;
    }

    public Date getItemLastModifiedDate() {
        return itemLastModifiedDate;
    }

    public void setItemLastModifiedDate(Date itemLastModifiedDate) {
        this.itemLastModifiedDate = itemLastModifiedDate;
    }

    public String getItemLastModifiedByUser() {
        return itemLastModifiedByUser;
    }

    public void setItemLastModifiedByUser(String itemLastModifiedByUser) {
        this.itemLastModifiedByUser = itemLastModifiedByUser;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemEnteredByUser() {
        return itemEnteredByUser;
    }

    public void setItemEnteredByUser(String itemEnteredByUser) {
        this.itemEnteredByUser = itemEnteredByUser;
    }*/
}
