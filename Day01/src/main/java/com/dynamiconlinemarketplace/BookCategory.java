package com.dynamiconlinemarketplace;

//Create the class name BokkCategory which implements the ProductCategory
public class BookCategory implements ProductCategory {

       //Override the get CategoryName method
        @Override
        public String getCategoryName() {
            return "Books";
        }

}
