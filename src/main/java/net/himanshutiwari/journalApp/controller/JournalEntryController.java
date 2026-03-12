//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.JournalApplication;
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryController {
//
//    //to store data without mongodb databases
//    private Map<Long, JournalEntry> journalEntries=new HashMap<>();
//
//
//    @GetMapping //localhost:8080/journal GET
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//
//
//    @PostMapping //localhost:8080/journal POST
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalEntries.put(myEntry.getId(),myEntry);
//        return true;
//    }
//
//    //finding data by id
//    @GetMapping("/id/{myId}")
//    public JournalEntry getJournalEntryBtId(@PathVariable long myId){
//        return journalEntries.get(myId);
//    }
//
//    //deleting the data
//    @DeleteMapping("id/{myId}")
//    public boolean deleteJournalEntryById(@PathVariable Long myId){
//        journalEntries.remove(myId);
//        return true;
//    }
//
//    //updating the data
//    @PutMapping("/id/{myId}")
//    public JournalEntry updateJournalEntryById(@PathVariable Long myId,@RequestBody JournalEntry myEntry){
//        return journalEntries.put(myId,myEntry);
//    }
//}
