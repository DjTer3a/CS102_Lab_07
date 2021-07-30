public class Test {
    public static void main(String[] args) {
        
        SimpleLinkedList linkedList= new SimpleLinkedList();
        
        linkedList.addToTail("6");
        System.out.println(linkedList);
        linkedList.addToHead("1");
        System.out.println(linkedList);
        linkedList.addToHead("2");
        System.out.println(linkedList);
        linkedList.addToHead("3");
        System.out.println(linkedList);
        linkedList.addToHead("4");
        System.out.println(linkedList);
        linkedList.addToHead("5");
        System.out.println(linkedList);
        
        linkedList.removeFromHead();
        System.out.println(linkedList);

        System.out.println(linkedList.get(0).getNode());
        System.out.println(linkedList.get(1).getNode());
        System.out.println(linkedList.get(2).getNode());
        System.out.println(linkedList.get(3).getNode());
        System.out.println();
        linkedList.removeFromHead();
        System.out.println(linkedList);
        System.out.println(linkedList.get(0).getNode());
        System.out.println(linkedList.get(1).getNode());
        System.out.println(linkedList.get(2).getNode());
        System.out.println(linkedList.get(3).getNode());
        System.out.println(linkedList.get(6).getNode());
        
        
    }
}
