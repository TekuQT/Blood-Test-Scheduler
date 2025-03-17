/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Patient {
    private String name;
    private int age;
    private String priority;
    private boolean isPatient;
    private String gpDetails;
    
    // Static priority queue to store patients
    private static PriorityQueue<Patient> patientQueue = new PriorityQueue<>(new PatientComparator());
    
    // Static queue for absent patients
    private static PriorityQueue<Patient> absentPatients = new PriorityQueue<>(new PatientComparator());
    
    // Constructor
    public Patient(String name, int age, String priority, boolean isPatient, String gpDetails) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.isPatient = isPatient;
        this.gpDetails = gpDetails;
    }
    
    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPriority() { return priority; }
    public boolean isPatient() { return isPatient; }
    public String getGpDetails() { return gpDetails; }
    
    // Add a patient to the queue
    public static void addPatient(String name, int age, String priority, boolean isPatient, String gpDetails) {
        Patient patient = new Patient(name, age, priority, isPatient, gpDetails);
        patientQueue.add(patient);
    }
    
    // Get the next patient without removing
    public static Patient peekNextPatient() {
        return patientQueue.peek();
    }
    
    // Get and remove the next patient
    public static Patient getNextPatient() {
        return patientQueue.poll();
    }
    
    // Mark a patient as absent
    public static void markNextPatientAbsent() {
        Patient absent = patientQueue.poll();
        if (absent != null) {
            absentPatients.add(absent);
        }
    }
    
    // Get all patients as a string
    public static String getAllPatientsAsString() {
        if (patientQueue.isEmpty()) {
            return "No blood test requests.";
        }
        
        StringBuilder sb = new StringBuilder();
        // Create a copy of the queue to avoid modifying the original
        PriorityQueue<Patient> tempQueue = new PriorityQueue<>(patientQueue);
        
        int count = 1;
        while (!tempQueue.isEmpty()) {
            Patient p = tempQueue.poll();
            sb.append(count).append(". ").append(p.toString()).append("\n");
            count++;
        }
        
        return sb.toString();
    }
    
    // Get all absent patients as a string
    public static String getAbsentPatientsAsString() {
        if (absentPatients.isEmpty()) {
            return "No absent patients.";
        }
        
        StringBuilder sb = new StringBuilder();
        // Create a copy of the queue to avoid modifying the original
        PriorityQueue<Patient> tempQueue = new PriorityQueue<>(absentPatients);
        
        int count = 1;
        while (!tempQueue.isEmpty()) {
            Patient p = tempQueue.poll();
            sb.append(count).append(". ").append(p.toString()).append("\n");
            count++;
        }
        
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Priority: " + priority + 
               ", Patient: " + (isPatient ? "Yes" : "No") + ", GP: " + gpDetails;
    }
    
    // Comparator for the priority queue
    private static class PatientComparator implements Comparator<Patient> {
        @Override
        public int compare(Patient p1, Patient p2) {
            // First compare by priority
            int priorityComparison = comparePriority(p1.getPriority(), p2.getPriority());
            if (priorityComparison != 0) {
                return priorityComparison;
            }
            
            // If same priority, compare by age (older first)
            int ageComparison = Integer.compare(p2.getAge(), p1.getAge());
            if (ageComparison != 0) {
                return ageComparison;
            }
            
            // If same age, existing patients first
            return Boolean.compare(p2.isPatient(), p1.isPatient());
        }
        
        // Helper method to compare priority strings
        private int comparePriority(String p1, String p2) {
            int p1Value = getPriorityValue(p1);
            int p2Value = getPriorityValue(p2);
            return Integer.compare(p1Value, p2Value);
        }
        
        // Convert priority string to numeric value (lower is higher priority)
        private int getPriorityValue(String priority) {
            switch (priority.toLowerCase()) {
                case "high": return 1;
                case "medium": return 2;
                case "low": return 3;
                default: return 4; // Unknown priorities go last
            }
        }
    }
}
