package com.ou7.devs.controller;


import com.ou7.devs.model.Call;
import com.ou7.devs.reposotory.CallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/call")
public class CallController {

    @Autowired
    private CallRepo callRepo;

    @GetMapping
    public List<Call> findCallsList() {
        return callRepo.findAll();
    }

    @PostMapping
    public List<Call> saveCall(@RequestBody List<Call> calls) {
        return callRepo.saveAll(calls);
    }

    @DeleteMapping
    public void deleteCall(@RequestBody Call call) {
        callRepo.delete(call);
    }

}
