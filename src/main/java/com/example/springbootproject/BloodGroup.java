package com.example.springbootproject;

import java.util.List;

public interface BloodGroup {
    List<Entities> getBlood();

    Entities getBloodGroup(int id);

    Entities addBlood(Entities BloodGroup);

    Entities updateBloodGroup(Entities BloodGroup);

    void deleteBloodGroup(int courseId);

//     String postApiCaller(Entities a);


}
