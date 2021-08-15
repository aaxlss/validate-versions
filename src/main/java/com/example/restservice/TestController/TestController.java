package com.example.restservice.TestController;

import org.springframework.web.bind.annotation.*;
@CrossOrigin(maxAge = 3600)
@RestController
public class TestController {

    @PostMapping(path = "/versions")
    public Integer comparingVersions(@RequestParam String v1,@RequestParam String v2 ){

        if(v1.equals(v2)){
            return 0;
        } else {
            String[] version1 = v1.split("\\.");
            String[] version2 = v2.split("\\.");

            if(version1.length > version2.length){
                for (int i = 0; i < version1.length; i++) {
                    if(!version1[i].equals(version2[i])){
                        return Integer.parseInt(version1[i]) > Integer.parseInt(version2[i])? 1:-1;
                    }

                }
            } else {
                for (int i = 0; i < version2.length; i++) {
                    if(!version1[i].equals(version2[i])){
                        return Integer.parseInt(version1[i]) > Integer.parseInt(version2[i])? 1:-1;
                    }
                }
            }
        }
        return 0;
    }
}
