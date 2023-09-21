/**
 * TestNode.java
 * Author: Luke O’Drobinak
 * Date: 09/21/2023
 * Collaborators: Franklin Young, Ethan Ayers, Hugh Karmozyn
 * Citations: Google, Oracle Java Docs, GitHub Documentation, Stack Overflow
 **/
import java.awt.Point;
import java.util.Scanner;

public class TestNode {
    public static void main(String[] args) {
        //Testing all constructors
        Node<Integer> node1 = new Node<>();
        Node<Integer> node2 = new Node<>(1);
        Node<Integer> node3 = new Node<>(2, node1, node2);
        Node<String> node4 = new Node<>("Hello");
        Node<String> node5 = new Node<>("World");
        Node<String> node6 = new Node<>("Hello", node4, node5);
        Node<Double> node7 = new Node<>(198.2);
        Node<Point> node8 = new Node<>(new Point(1, 2));
        Node<Scanner> node9 = new Node<>(new Scanner(System.in));

        //Testing all setters
        node1.setChildNode(node2);
        node2.setChildNode(node3);
        node3.setParentNode(node2);
        node2.setParentNode(node1);
        node7.setValue(198.3);


        //Testing all toString and equals methods
        System.out.println(node1.toString());
        System.out.println(node3.toString());
        System.out.println(node5.toString());

        System.out.println(node1.getChildNode().equals(node4));
        System.out.println(node2.equals(node5));
        System.out.println(node4.equals(node6));


        //Testing all accessors and printing out to console, checking against test cases
        System.out.println(node1.getValue());
        System.out.println(node1.getParentNode());
        System.out.println(node1.getChildNode());
        System.out.println(node2.getValue());
        System.out.println(node2.getParentNode());
        System.out.println(node2.getChildNode());
        System.out.println(node3.getValue());
        System.out.println(node3.getParentNode());
        System.out.println(node3.getChildNode());
        System.out.println(node4.getValue());
        System.out.println(node4.getParentNode());
        System.out.println(node4.getChildNode());
        System.out.println(node5.getValue());
        System.out.println(node5.getParentNode());
        System.out.println(node5.getChildNode());
        System.out.println(node6.getValue());
        System.out.println(node6.getParentNode());
        System.out.println(node6.getChildNode());
        System.out.println(node7.getValue());
        System.out.println(node7.getParentNode());
        System.out.println(node7.getChildNode());
        System.out.println(node8.getValue());
        System.out.println(node8.getParentNode());
        System.out.println(node8.getChildNode());
        System.out.println(node9.getValue());
        System.out.println(node9.getParentNode());
        System.out.println(node9.getChildNode());

    }
}
