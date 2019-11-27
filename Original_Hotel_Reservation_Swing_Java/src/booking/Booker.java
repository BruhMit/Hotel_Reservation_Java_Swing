/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.util.Date;

/**
 *
 * @author Mis Dess
 */
class Booker {
    private Double price;
    private String id,bed_type,gender,country,address;
    private int room_no,total_dates,phone;
    private Date check_in,check_out;
 public Booker(Date check_in,int room_no,Double price,String address,String country ,String geneder,Date check_out,String bed_type,int total_dates,int phone,String id){
     this.bed_type=bed_type;
     this.check_in=check_in;
     this.check_out=check_out;
     this.country=country;
     this.gender=gender;
     this.id=id;
     this.phone=phone;
     this.price=price;
     this.room_no=room_no;
     this.total_dates=total_dates;
 }
 public Double getprice(){
     return price;
 }
 public String getid(){
     return id;
 }
  public String getbetype(){
     return bed_type;
 }
   public String getgender(){
     return gender;
 }
    public String getcountry(){
     return country;
 }
     public int getroomno(){
     return room_no;
 }
      public int getdates(){
     return total_dates;
 }
       public int getphone(){
     return phone;
 }
       public String getaddress(){
           return address;
       }
     
   }
