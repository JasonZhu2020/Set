import java.util.ArrayList;

public class LinkedlistSet implements Set {

    private LinkedList list;

    public LinkedlistSet(){
        list = new LinkedList();
    }

    @Override
    public int getSize(){
        return list.getSize();
    }
    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public boolean contains(int e){
        return list.contains(e);
    }
    @Override
    public void add(int e){
        if(!list.contains(e))
            list.addFirst(e);
    }
    @Override
    public void remove(int e){
        list.removeElement(e);
    }

//    public static void main(String[] args){
//        System.out.println();
//        System.out.println("Pride and Prejudice");
//        ArrayList<String> words1 = new ArrayList<>();
//        if(FileOperation.readFile("PRIDE-AND-PREJUDICE", words1)){
//            System.out.println("Total words: " + words1.size());
//            LinkedlistSet<String> set1 = new LinkedlistSet()
//        }
//
//    }

}
