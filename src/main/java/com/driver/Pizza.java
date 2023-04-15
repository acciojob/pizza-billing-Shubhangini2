package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
   boolean isExtraCheeseAdded;
   boolean isExtraToppingAdded;
   boolean isAddedTakeAway;
    int vegBasePrice = 300;
    int nonVegBasePrice  = 400;
    int extraCheesePrice = 80;
   int  extraToppingsVeg  = 70;
   int extraToppingsNonveg = 120;
   int paperBagPrice = 20;
   int basePrice;
   int extraToppingPrice;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.isVeg = isVeg;
        basePrice=getBasePrice();
        price = basePrice;
        isExtraCheeseAdded=false;
        isExtraToppingAdded=false;
        isAddedTakeAway=false;
    }
    //writing a method for baseprice
    public int getBasePrice(){
        if(isVeg){
            return vegBasePrice;
        }
        else{
           return nonVegBasePrice;
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            isExtraCheeseAdded= true;
            price+= extraCheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded){
            isExtraToppingAdded=true;
            if(isVeg){
                extraToppingPrice= extraToppingsVeg;
                price+=extraToppingsVeg;
            }
            else{
                extraToppingPrice= extraToppingsNonveg;
                price+=extraToppingsNonveg;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isAddedTakeAway){
            isAddedTakeAway=true;
            price+=paperBagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String var="";
        var+= "Base Price Of The Pizza: " + basePrice+ "\n";
        if(isExtraCheeseAdded) {
            var+= "Extra Cheese Added: " + extraCheesePrice+ "\n";
        }
        if(isExtraCheeseAdded){
            var+= "Extra Toppings Added: " + extraToppingPrice+ "\n";
        }
        if(isAddedTakeAway){
            var+= "Paperbag Added: " + paperBagPrice+ "\n";
        }
            var+= "Total Price: " + price+ "\n";
        this.bill=var;
        return this.bill;
    }
}
