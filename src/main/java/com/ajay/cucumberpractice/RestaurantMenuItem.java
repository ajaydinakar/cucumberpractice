package com.ajay.cucumberpractice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantMenuItem {
    private String Item;
    private String Description;
    private int price;
}
