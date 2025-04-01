import java.util.ArrayList;
/* This is a stub for the House class */
public class House extends Building{
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  
  public House(String name, String address, int nFloors,boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents=new ArrayList<String>();
    this.hasDiningRoom=hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
  public int nResidents(){
    return this.residents.size();
  }
  public void moveIn(String name){
    if(this.residents.contains(name)){
      System.out.println(name+"already in the house");
    }else{
      this.residents.add(name);
      System.out.println("successfully moved in"+name);
    }
  }
  public String moveOut (String name){ 
    if(this.residents.contains(name)){
      this.residents.remove(name);
      System.out.println(name+"moved out");
      return name;
    }else{
      System.out.println(name+"not in the house");
      return name;
    }
  }
  public boolean isResident(String person){
    return this.residents.contains(name);
  }

  public static void main(String[] args) {
    new House("lamont","Elm street",4,true);
  }

}