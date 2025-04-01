/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {
    private Hashtable<String, Boolean> collection;
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection=new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
    public void addTitle(String title){
      collection.put(title,true);
    }
    public String removeTitle(String title){
      if (collection.containsKey(title)) {
        collection.remove(title);
        System.out.println(title+"removed from the collection");
        return title;
      }else{
        System.out.println(title+"not found");
        return title;
      }}

    public void checkOut(String title){
        if (collection.containsKey(title)){
          if(collection.get(title)){
            collection.replace(title,false);
            System.out.println(title+"checked out");

          }else{
            System.out.println(title+"not found");
          }}
        else{
          System.out.println(title+"not found");
          }
      }
    public void returnBook(String title){
      if (collection.containsKey(title)){
        if(collection.get(title)){
          System.out.println("already returned");

        }else{
          collection.replace(title,true);
          System.out.println(title+"returned");
        }}
      else{
        System.out.println(title+"not found");
        }
      }
    public boolean containsTitle(String title){
      return collection.containsKey(title);

    }
    public boolean isAvailable(String title){
      return collection.get(title);
    } 
    public void printCollection(){
    }
    public static void main(String[] args) {
      new Library("neilson","center",4);
    }
  
  }