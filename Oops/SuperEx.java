

class Animal{

    String color="Brown";

    Animal(){
    System.out.println("the Animal constructor is called...");
    }

}




class Horse extends Animal{
    Horse(){
        super();
        super.color="Brown";
        System.out.println("Horse constructor is called...");
    }
}





class SuperEx{
    public static void main(String[] args) {
        Horse h = new  Horse();
  System.out.println(h.color);
    }
}