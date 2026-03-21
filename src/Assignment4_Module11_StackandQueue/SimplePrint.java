package Assignment4_Module11_StackandQueue;

import java.util.LinkedList;
import java.util.Queue;

class PrintJob {
    String documentName;
    int pages;

    PrintJob(String name, int pages) {
        this.documentName = name;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "'" + documentName + "' (" + pages + " pages)";
    }
}

class PrinterSystem {
    private Queue<PrintJob> queue;

    public PrinterSystem() {
        // LinkedList implements the Queue interface in Java
        this.queue = new LinkedList<>();
    }

    // Add a job to the queue
    public void sendToPrinter(String name, int pages) {
        PrintJob job = new PrintJob(name, pages);
        queue.add(job);
        System.out.println("Queued: " + job);
    }

    // Process the next job in line
    public void printNext() {
        if (queue.isEmpty()) {
            System.out.println("Printer Idle: No jobs in queue.");
            return;
        }

        PrintJob currentJob = queue.poll(); // Removes from the front
        System.out.println(">> Currently Printing: " + currentJob);
        System.out.println("Done!");
    }

    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Current Waiting Jobs: " + queue);
        }
    }
}

public class SimplePrint {
    public static void main(String[] args) {
        PrinterSystem myPrinter = new PrinterSystem();

        // Simulating users sending documents
        myPrinter.sendToPrinter("Resume_Final.pdf", 2);
        myPrinter.sendToPrinter("Holiday_Photos.jpg", 15);
        myPrinter.sendToPrinter("Project_Report.docx", 45);

        System.out.println("--- Status Check ---");
        myPrinter.showQueue();

        System.out.println("--- Starting Print Tasks ---");
        myPrinter.printNext(); // Prints Resume
        myPrinter.printNext(); // Prints Photos

        System.out.println("--- Final Status ---");
        myPrinter.showQueue();
    }
}