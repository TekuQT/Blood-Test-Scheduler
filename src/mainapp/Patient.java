/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Patient {
    // define a comparator for request priorities
    private static class RequestComparator implements Comparator<Requests> {
        @Override
        public int compare(Requests r1, Requests r2) {
            // first compare by priority
            int priorityComparison = comparePriority(r1.getPriority(), r2.getPriority());
            if (priorityComparison != 0) {
                return priorityComparison;
            }
            
            // if same priority, compare by age (older first)
            int ageComparison = Integer.compare(r2.getAge(), r1.getAge());
            if (ageComparison != 0) {
                return ageComparison;
            }
            
            // if same age, existing patients first
            return Boolean.compare(r2.isPatient(), r1.isPatient());
        }
        
        // helper method to compare priority strings
        private int comparePriority(String p1, String p2) {
            int p1Value = getPriorityValue(p1);
            int p2Value = getPriorityValue(p2);
            return Integer.compare(p1Value, p2Value);
        }
        
        // convert priority string to numeric value (lower is higher priority)
        private int getPriorityValue(String priority) {
            switch (priority.toLowerCase()) {
                case "high": return 1;
                case "medium": return 2;
                case "low": return 3;
                default: return 4;
            }
        }
    }
    
    // method to get the next highest priority patient from the Requests list
    public static Requests getHighestPriorityRequest(Requests head) {
        if (head == null) {
            return null;
        }
        
        // create a priority queue
        PriorityQueue<Requests> priorityQueue = new PriorityQueue<>(new RequestComparator());
        
        // add all requests to the priority queue
        Requests current = head;
        while (current != null) {
            priorityQueue.add(current);
            current = current.getNext();
        }
        
        // return the highest priority request
        return priorityQueue.peek();
    }
}
