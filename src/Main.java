import queues.ArrayQueue;
import stacks.ArrayStack;
//import stacks.Employee;
import queues.Employee;
import stacks.LinkedStack;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
//        //Stack impl with Array
//        ArrayStack stack = new ArrayStack(10);
//
//        stack.push(new Employee("Jane", "Jones", 123));
//        stack.push(new Employee("John", "Doe", 4567));
//        stack.push(new Employee("Mary", "Smith", 22));
//        stack.push(new Employee("Mike", "Wilson", 3245));
//        stack.push(new Employee("Bill", "End", 78));
//
//        //stack.printStack();
//
//        System.out.println(stack.peek());
//        //stack.printStack();
//
//        System.out.println("Popped: " + stack.pop());
//        System.out.println(stack.peek());
//
//
//
//
//        //Stack impl with LinkedList
//        Employee janeJones = new Employee("Jane", "Jones", 123);
//        Employee johnDoe = new Employee("John", "Doe", 4567);
//        Employee marySmith = new Employee("Mary", "Smith", 22);
//        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
//        Employee billEnd = new Employee("Bill", "End", 78);
//
//        LinkedStack linkedStack = new LinkedStack();
//        linkedStack.push(janeJones);
//        linkedStack.push(johnDoe);
//        linkedStack.push(marySmith);
//        linkedStack.push(mikeWilson);
//        linkedStack.push(billEnd);
//
//        //stack.printStack();
//
//        //System.out.println(stack.peek());
//        //stack.printStack();
//
//        System.out.println("Popped: " + linkedStack.pop());
//        System.out.println(linkedStack.peek());


        //Queue impl with Array
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue =  new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);


//        queue.printQueue();
        queue.remove();
//        queue.printQueue();
        System.out.println(queue.peek());
        queue.printQueue();

    }
}