package com.dynamiconlinemarketplace;

//Create the method name GadgetsCategory which implements the ProductCategory
public class GadgetsCategory implements ProductCategory {

      //Override the get CategoryName method
        @Override
        public String getCategoryName(){
            return "Gadgets";
        }

}
