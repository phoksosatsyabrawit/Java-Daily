package com.java.Exception.Voter;
import java.util.Set;
import java.io.File;
import java.io.Writer;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

public class VoterService {
    private Set<Voter> voters = new HashSet<>();
    private static int count = 1;

    public void validate(Person person){
        if(person == null){
            throw new RuntimeException("Person cannot be null");
        }
        if(person.getIdCard() == null){
            throw new RuntimeException("Person ID cannot be null");
        }
        Period period = Period.between(person.getDateOfBirth(), LocalDate.now());
        if(period.getYears() < 18){
            throw new RuntimeException("Person must be at least 18 years old to vote");
        }
    }

    public void register(Person person, String location, String code){
        validate(person);
        Voter voter = new Voter();
        voter.setId(count++);
        voter.setPerson(person);
        voter.setLocation(location);
        voter.setCode(code);
        voters.add(voter);
        FileService.save(voters.toString());
    }

    public void display(){
        for(Voter voter : voters){
            System.out.println(voter.toString());
        }
    }
}
