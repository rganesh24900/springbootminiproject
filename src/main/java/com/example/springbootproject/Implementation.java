package com.example.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Service
public class Implementation implements BloodGroup {


    List<Entities> list;
    Entities e;


    public Implementation() {
        list = new ArrayList<>();
        list.add(new Entities(1, "A+ve", "Ganesh", "Tirupati Balaji"));
        list.add(new Entities(2, "A-ve", "Mohammed", "HajiAli"));
        list.add(new Entities(3, "B+ve", "Shubham", "Barc Colony"));
    }

    @Override


    public List<Entities> getBlood() {
        return list;

    }

    public Entities getBloodGroup(int id) {

        Entities l = null;

        for (Entities e :
                list) {
            if (e.getId() == id) {
                l = e;
            }
        }
        return l;
    }

    public Entities addBlood(Entities BloodGroup) {


        list.add(BloodGroup);
        return BloodGroup;


    }


    public Entities updateBloodGroup(Entities BloodGroup) {
        for (
                Entities a :
                list) {
            if (a.getId() == BloodGroup.getId()) {
                a.setId(BloodGroup.getId());
                a.setAddress(BloodGroup.getAddress());
                a.setName(BloodGroup.getName());
            }

        }
        return BloodGroup;
    }

    public void deleteBloodGroup(int courseId) {
        list = list.stream().filter(entities -> entities.getId() != courseId).collect(Collectors.toList());

    }





}



