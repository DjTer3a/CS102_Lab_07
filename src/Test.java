public class Test {
    public static void main(String[] args) {
        
        SimpleLinkedList linkedList= new SimpleLinkedList();
        
        linkedList.addToHead("6");
        System.out.println(linkedList);
        linkedList.addToHead("1");
        System.out.println(linkedList);
        linkedList.addToTail("2");
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
        System.out.println(linkedList.get(8).getNode());


        SimpleQueue2 queue = new SimpleQueue2();
        SimpleQueue2 queue2 = new SimpleQueue2();
        
        queue.enqueue("1");
        System.out.println(queue.toString());
        queue.enqueue("2");
        System.out.println(queue.toString());
        queue.enqueue("3");
        System.out.println(queue.toString());
        queue.enqueue("4");
        System.out.println(queue.toString());
        queue.enqueue("5");
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());System.out.println("Is queue empty? "+ queue.isEmpty());
        System.out.println("Is queue empty? "+ queue2.isEmpty());
        System.out.println(queue.toString());
        System.out.println(queue2.toString());


        SimpleStackWithQueue stack1=new SimpleStackWithQueue();
        System.out.println("The following value is added : "+stack1.push("1"));
        System.out.println("The following value is added : "+stack1.push("2"));
        System.out.println("The following value is added : "+stack1.push("3"));
        System.out.println("The following value is added : "+stack1.push("4"));
        System.out.println("The following value is added : "+stack1.push("5"));
        System.out.println("The following value is added : "+stack1.push("6"));
        System.out.println("The following value is added : "+stack1.push("7"));
        System.out.println("The following value is added : "+stack1.push("8"));
        System.out.println("The following value is added : "+stack1.push("9"));
        System.out.println("The following value is added : "+stack1.push("10"));
        System.out.println(stack1.toString());
        System.out.println("The following value is removed : "+stack1.pop());
        System.out.println("The following value is removed : "+stack1.pop());
        System.out.println("The following value is removed : "+stack1.pop());
        System.out.println("The following value is removed : "+stack1.pop());
        System.out.println("The following value is removed : "+stack1.pop());
        System.out.println("The following value is removed : "+stack1.pop());
        System.out.println(stack1.toString());

        
    }
}
