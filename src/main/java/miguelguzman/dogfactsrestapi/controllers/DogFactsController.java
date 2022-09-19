package miguelguzman.dogfactsrestapi.controllers;


import miguelguzman.dogfactsrestapi.data.DogFact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/dogfacts", produces = "application/json")
public class DogFactsController {
    @GetMapping("")
    private List<DogFact> fetchAllFacts() {
        //return some fake dogfacts because the db is not yet setup
        Dogfact fact = new DogFact("Dogs smell funny");
        List<Dogfacts> facts = new ArrayList<>();
        facts.add(fact);
        return facts;
    }

    @GetMapping("/{id}")
    private void updateDogFact(@RequestBody DogFact updatedDogFact, @PathVariable Long)
}
