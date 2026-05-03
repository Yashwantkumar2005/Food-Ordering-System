package com.ordermunch.ordermunchloginui;

public class CartMenuTableModel {
    String foodName, quantity, amount;

    public CartMenuTableModel(String foodName, String quantity, String amount){
        this.foodName = foodName;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getFoodName(){
        return foodName;
    }
    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public String getAmount(){
        return amount;
    }
    public void setAmount(String amount){
        this.amount = amount;
    }

    public String getQuantity(){
        return quantity;
    }
    public void setQuantity(String foodName){
        this.quantity = quantity;
    }
}
