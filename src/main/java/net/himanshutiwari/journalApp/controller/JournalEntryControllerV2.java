//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import net.engineeringdigest.journalApp.service.JournalEntryService;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDateTime;
//import java.util.*;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryControllerV2 {
//
//    //to store data with mongodb databases
//    @Autowired
//    private JournalEntryService journalEntryService;//instance injected in class
//
//
//
//    @GetMapping //localhost:8080/journal GET
//    public ResponseEntity<?> getAll(){
//        List<JournalEntry> all= journalEntryService.getAll();//from entry service
//        if(all!=null && !all.isEmpty()){
//            return new ResponseEntity<>(all,HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//
//    @PostMapping //localhost:8080/journal POST
//    public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry myEntry){
//        try {
//            myEntry.setDate(LocalDateTime.now());
//            journalEntryService.saveEntry(myEntry);//from entry service
//            return new  ResponseEntity<>(myEntry, HttpStatus.CREATED);
//        }catch (Exception e){
//            return new  ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    //finding data by id
//    @GetMapping("/id/{myId}")
//    public ResponseEntity<JournalEntry> getJournalEntryBtId(@PathVariable ObjectId myId){
//        Optional<JournalEntry> journalEntry=journalEntryService.findById(myId);
//        if(journalEntry.isPresent()){
//            return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    //deleting the data
//    @DeleteMapping("id/{myId}")
//    public ResponseEntity<?> deleteJournalEntryById(@PathVariable ObjectId myId){
//        journalEntryService.deleteById(myId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    //updating the data
//    @PutMapping("/id/{myId}")
//    public ResponseEntity<?> updateJournalEntryById(@PathVariable ObjectId myId,@RequestBody JournalEntry newEntry){
//        JournalEntry old=journalEntryService.findById(myId).orElse(null);
//        if(old!=null){
//            old.setTitle(newEntry.getTitle()!=null && !newEntry.getTitle().equals("")? newEntry.getTitle() : old.getTitle());
//            old.setContent(newEntry.getContent()!=null && !newEntry.getContent().equals("")? newEntry.getContent() : old.getContent());
//            journalEntryService.saveEntry(old);//from entry service
//            return new ResponseEntity<>(old,HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//}
