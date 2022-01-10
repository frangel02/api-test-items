package com.crud.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Frangel Rodriguez
 * Date: 1/9/22
 * Time: 12:42 PM
 */
@Getter
@Setter
@Entity
@Data
public class Item implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull
    private String name;

    @Temporal(TemporalType.DATE)
    private Date itemEnteredDate;

    private String itemEnteredByUser;

    private Double itemBuyingPrice;

    private Double itemSellingPrice;

    @Temporal(TemporalType.DATE)
    private Date itemLastModifiedDate;

    private String itemLastModifiedByUser;

    private String itemStatus;

}
