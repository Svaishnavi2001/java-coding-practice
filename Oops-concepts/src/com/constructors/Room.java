package com.constructors;

 class Room {
    int noOfWindow;
    int nuOfDoors;
    String doorName;
    String socketName;

     public Room(int noOfWindow, int nuOfDoors, String doorName, String socketName) {
         this.noOfWindow = noOfWindow;
         this.nuOfDoors = nuOfDoors;
         this.doorName = doorName;
         this.socketName = socketName;
     }
     public int getNoOfWindow() {
         return noOfWindow;
     }

     public void setNoOfWindow(int noOfWindow) {
         this.noOfWindow = noOfWindow;
     }

     public int getNuOfDoors() {
         return nuOfDoors;
     }

     public void setNuOfDoors(int nuOfDoors) {
         this.nuOfDoors = nuOfDoors;
     }

     public String getDoorName() {
         return doorName;
     }

     public void setDoorName(String doorName) {
         this.doorName = doorName;
     }

     public String getSocketName() {
         return socketName;
     }

     public void setSocketName(String socketName) {
         this.socketName = socketName;
     }
 }
