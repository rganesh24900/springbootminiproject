package com.example.springbootproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@Slf4j
public class Controller {
    @Autowired
    Implementation imp;

    @GetMapping("/bloodgroups")
    public List<Entities> getBlood() {
        return this.imp.getBlood();

    }

    @GetMapping("/bloodgroups/{bloodgroupId}")
    public Entities getBloodGroup(@PathVariable String bloodgroupId) {
        return this.imp.getBloodGroup(Integer.parseInt(bloodgroupId));
    }

    //Requesting the header
    @GetMapping("/headers")
    public ResponseEntity<Map<String, String>> getHeader(@RequestHeader Map<String, String> mapHeaderValues) {
        try {

            log.info("The values are {}", mapHeaderValues);


            return ResponseEntity.status(HttpStatus.OK).body(mapHeaderValues);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/bloodgroups")
    public Entities addBlood(@RequestBody Entities BloodGroup) {


//            Map<String,String> m = new HashMap<>();
//            m.put("Name",this.imp.addBlood(BloodGroup).getName());
//            m.put("Name",this.imp.addBlood(BloodGroup).getName());

        return this.imp.addBlood(BloodGroup);


    }

    @PutMapping("/bloodgroups")
    public Entities updateBloodGroup(@RequestBody Entities BloodGroup) {
        return this.imp.updateBloodGroup(BloodGroup);

    }

    @DeleteMapping("/bloodgroups/{courseId}")
    public ResponseEntity<HttpStatus> deleteBloodGroup(@PathVariable String courseId) {
        try {
            this.imp.deleteBloodGroup(Integer.parseInt(courseId));
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}


