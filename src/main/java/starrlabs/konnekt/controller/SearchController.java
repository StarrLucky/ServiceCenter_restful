package starrlabs.konnekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import starrlabs.konnekt.domain.Repair;
import starrlabs.konnekt.repos.RepairRepo;
import starrlabs.konnekt.Search;
import starrlabs.konnekt.Search1;
import java.util.Map;

@RestController

public class SearchController {
    @Autowired
    private RepairRepo repairRepo;


    @PostMapping("/search")
    public Search search(@RequestBody Search data) {

   int   kv = data.getKv();
   String username = data.getUsername();

        Repair repairfound;
        Search baseresponce = null;             //   hz?


        try {

            if (kv != 0 && kv > 1 && kv < 99999 && username.isEmpty() != true && username.length() > 2 && username.length() < 20) {

                if (kv > 2000 && kv < 3000) {
                    kv = kv + 2;
                } else if (kv > 3000 && kv < 4000) {
                    kv = kv + 3;
                } else if (kv > 4000 && kv < 5000) {
                    kv = kv + 4;
                }//original software database index bug correction  PIDAR

                repairfound = repairRepo.findByKvAndUsernameContainingIgnoreCase(kv, username);   // not safe "containing"

                if (repairfound != null) {
                    baseresponce = new Search(1, kv, username, repairfound.getRepairstatus());

                }
                else {

                    baseresponce = new Search(0,  kv, username, "нет данных") ;
                }
            }


        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        System.out.println("Found kvitan " +  kv);
   return baseresponce;

    }




    @GetMapping("/search111")

    public Search search1(@RequestParam(value = "kv", required =true )int kv,  @RequestParam(value = "username", required = true)String username) {


        Repair repairfound;
        Search baseresponce = null;             //   hz?


        try {

            if (kv != 0 && kv > 1 && kv < 99999 && username.isEmpty() != true && username.length() > 2 && username.length() < 20) {
                if (kv > 2000 && kv < 3000) {
                    kv = kv + 2;
                } else if (kv > 3000 && kv < 4000) {
                    kv = kv + 3;
                } else if (kv > 4000 && kv < 5000) {
                    kv = kv + 4;
                }//original software database index bug correction  PIDAR

                repairfound = repairRepo.findByKvAndUsernameContainingIgnoreCase(kv, username);   // not safe "containing"
                if (repairfound != null) {
                    baseresponce = new Search(1, kv, username, repairfound.getRepairstatus());

                }
                else {
                    baseresponce = new Search(0,  kv, username, "нет данных") ;
                }
            }


        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        return baseresponce;
    }






}







