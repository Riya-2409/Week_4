package com.dynamiconlinemarketplace;

//Create the method name ClothingCategory which implements the ProductCategory
public class ClothingCategory implements ProductCategory {

       //Override the get CategoryName method
        @Override
        public String getCategoryName() {
            return "Clothing";
        }

}
