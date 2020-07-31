/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueQ {
    public static void main(String[] args) {
        
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Ahmad");
        waitingQueue.add("Aqib");
        waitingQueue.add("Umer");
        waitingQueue.add("Basit");
        waitingQueue.add("Saad");

        System.out.println("WaitingQueue : " + waitingQueue);

       
        String name = waitingQueue.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

        name = waitingQueue.poll();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);
    }
}