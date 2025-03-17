/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import java.util.LinkedList;

/**
 *
 * @author tekuboii
 */
public class Requests {
    //data members
    private String name;
    private int age;
    private String priority;
    private boolean patient;
    private String gpDetails;
    private Requests next;
    
    private static Requests head = null; //head of my linked list
    //constructor
    public Requests(String name, int age, String priority, boolean patient, String gpDetails) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.patient = patient;
        this.gpDetails = gpDetails;
        this.next = null;
    }
    
    // add requests at the end of the list
        public static void addRequest(String name, int age, String priority, boolean patient, String gpDetails) {
            Requests newRequest = new Requests (name, age, priority, patient, gpDetails);

            if (head == null) {
                head = newRequest;
            } else {
                Requests current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newRequest;
            }
        }
        //to display requests in order
        //And if there is no requests it will diplay a different message
        public static void displayRequestsToStringBuilder(StringBuilder sb) {
            if (head == null) {
            sb.append("No blood test requests.");
                return;
            }
    
            Requests current = head;
            while (current != null) {
                sb.append(current.toString()).append("\n");
                current = current.next;
            }
        }
        
    @Override
    public String toString() {
        return "Name: " + name + ", Age:" + age + ", Priority: "+ priority + ", " +(patient ? "Yes" : "No")+ ", GP: " + gpDetails;
    }
}
