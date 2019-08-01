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
    private String Name,LandlordName,Type,DoorNo,Landmark,Location;
    private int No_of_Rooms,Price,Landlord_PhoneNo;
    public User(String Name,String LandlordName,String Type,int No_of_Rooms,int Price,String DoorNo,String Landmark,String Location,int Landlord_PhoneNo){
        this.Name=Name;
        this.Landmark=Landmark;
        this.DoorNo=DoorNo;
        this.Landlord_PhoneNo=Landlord_PhoneNo;
        this.LandlordName=LandlordName;
        this.Location=Location;
        this.No_of_Rooms=No_of_Rooms;
        this.Price=Price;
        this.Type=Type;
    }
    public int getRooms(){
        return No_of_Rooms;
    }
    public int getPrice(){
        return Price;
    }
    public int getLandlord_PhoneNo(){
      return Landlord_PhoneNo;
    }
    public String getName(){
        return Name;
    }
    public String getLandlordName(){
        return LandlordName;
    }
    public String getType(){
        return Type;
    }
    public String getDoorNo(){
        return DoorNo;
    }
    public String getLandmark(){
        return Landmark;
    }
    public String getLocation(){
        return Location;
    }
    
}
