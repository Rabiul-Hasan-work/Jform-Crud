/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
class User {
  
    private int id, price, qty;
    private String pname;

    public User(int id, int price, int qty, String pname) {
     
        this.id = id;
        this.price = price;
        this.qty = qty;
        this.pname = pname;
    }

  

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getPname() {
        return pname;
    }
    
    
}
