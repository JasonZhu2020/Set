public class BSTSet implements Set{
    private BST bst;
    public BSTSet(){
        bst = new BST();
    }

    @Override
    public int getSize(){
        return bst.size();
    }

    @Override
    public boolean isEmpty(){
        return bst.isEmpty();
    }

    @Override
    public void add(int e){
        bst.add(e);
    }

    @Override
    public boolean contains(int e){
        return bst.contains(e);
    }

    @Override
    public void remove(int e){
        bst.remove(e);
    }

    public static void main(String[] args) {
        BST bst1 = new BST();
        System.out.println(bst1.getClass().toString());
    }
}
