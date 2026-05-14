package com.java.Exception.Voter;

import java.time.LocalDate;

public class VoteApplication {
    public static void main(String[] args){
        VoterService voterservice = new VoterService(); 
        Person person1 = new Person(1L, "Elliot", Gender.M, LocalDate.of(2002, 10, 13), "1234567890");
        Person person2 = new Person(2L, "Darlene", Gender.F, LocalDate.of(2001, 2, 15), "0987654321");
        try{
            voterservice.register(person1, "Phnom Penh", "PP001");
            voterservice.register(person2, "Siem Reap", "SR001");
            voterservice.display();
        }catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Completed");
    }
}
