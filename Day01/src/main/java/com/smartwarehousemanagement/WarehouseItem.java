package com.smartwarehousemanagement;

public abstract class WarehouseItem {
        String name ;
        public WarehouseItem(String name){
            this.name = name ;
        }
        public String getName(){
            return name ;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + ": " + name;
        }


}
