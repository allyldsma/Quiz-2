/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author Enubs
 */
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person [] person = new Person[5];
        
       person[0] = new Person("Aldrin", "Wabingga", "Panacan,");
       person[1] = new Person("Aldrin", "Wabingga", "Panacan,");
       person[2] = new Person("Aldrin", "Wabingga", "Panacan,");
        
        
   
        DList<DNode> Dlist = new DList<>();
        Dlist.addFirst(node1);
        Dlist.addFirst(node2);
        Dlist.addLast (node3);
        
        System.out.println("Before Remove");
        Dlist.showList();
        
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + Dlist.removeFirst().getElement());
        Dlist.showList();
        
        System.out.println("\nAfter Remove Last");
        System.out.println("Removed: " + Dlist.removeLast().getElement());
        Dlist.showList();
        
        System.out.println("\nAfter Remove Last");
        System.out.println("Removed: " + Dlist.removeLast().getElement());
        Dlist.showList();
        
     
    }
    
}
