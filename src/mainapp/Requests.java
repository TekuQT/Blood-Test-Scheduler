/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import java.util.LinkedList;

/**
 *
 * @author temuulen
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
    //getters
    public String getName() { 
        return name; 
    }
    public int getAge() { 
        return age; 
    }
    public String getPriority() { 
        return priority; 
    }
    public boolean isPatient() { 
        return patient; 
    }
    public String getGpDetails() { 
        return gpDetails; 
    }
    public Requests getNext() { 
        return next; 
    }
    public static Requests getHead() {
    return head;
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
    //and if there is no requests it will diplay a different message
    public static void displayRequestsToStringBuilder(StringBuilder sb) {
        //if there is no data it will show this message
        if (head == null) {
        sb.append("No blood test requests.");
            return;
        }
        //if not 
        Requests current = head;
        while (current != null) {
            sb.append(current.toString()).append("\n");
            current = current.next;
        }
    }
    public static boolean removeRequest(Requests requestToRemove) {
        if (head == null || requestToRemove == null) {
            return false;
        }

        // if head is the one to remove
        if (head == requestToRemove) {
            head = head.next;
            return true;
        }

        // search for the request in the list
        Requests current = head;
        while (current.next != null && current.next != requestToRemove) {
            current = current.next;
        }

        // if found, remove it
        if (current.next == requestToRemove) {
            current.next = requestToRemove.next;
            return true;
        }

        return false;
    }

    // static list for absent patients
    private static Requests absentHead = null;

    private static final int MAX_ABSENT_HISTORY = 5; // Only keep track of the last 5 absences
    private static Requests[] absentStack = new Requests[MAX_ABSENT_HISTORY];
    private static int absentStackTop = -1; // Initialize stack pointer

    //a absent list that implements STACK
    public static void addToAbsentList(Requests request) {
        if (request == null) {
            return;
        }

        // create a copy of the request
        Requests absentRequest = new Requests(
            request.getName(), 
            request.getAge(), 
            request.getPriority(), 
            request.isPatient(), 
            request.getGpDetails()
        );

        // if the stack is full, shift everything down to make room
        if (absentStackTop == MAX_ABSENT_HISTORY - 1) {
            // Remove oldest entry
            for (int i = 0; i < MAX_ABSENT_HISTORY - 1; i++) {
                absentStack[i] = absentStack[i + 1];
            }
            absentStackTop--; // Decrease top since we removed one
        }

        // push new entry onto the stack
        absentStackTop++;
        absentStack[absentStackTop] = absentRequest;
    }
        //to show the absent patients
        public static void displayAbsentRequests() {
        if (absentHead == null) {
            System.out.println("No absent patients.");
            return;
        }

        Requests current = absentHead;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
    
    public static String getAbsentRequestsAsString() {
        StringBuilder sb = new StringBuilder();

        if (absentStackTop == -1) {
            return "No absent patients.";
        }

       // show most recent absences first (stack order - LIFO)
        for (int i = absentStackTop; i >= 0; i--) {
            sb.append(absentStack[i].toString()).append("\n");
       }
    
        return sb.toString();
    }   
    @Override
    public String toString() {
        return "Name: " + name + ", Age:" + age + ", Priority: "+ priority + ", " +(patient ? "Yes" : "No")+ ", GP: " + gpDetails;
    }
}
