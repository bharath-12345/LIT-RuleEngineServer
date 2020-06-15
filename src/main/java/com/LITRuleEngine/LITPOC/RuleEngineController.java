package com.LITRuleEngine.LITPOC;

import com.LITRuleEngine.LITPOC.RuleEngines.CMRatingRuleEngine;
import com.LITRuleEngine.LITPOC.RuleEngines.DoJRuleEngine;
import com.LITRuleEngine.LITPOC.models.CMRatings;
import com.LITRuleEngine.LITPOC.models.Employee;
import com.LITRuleEngine.LITPOC.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RuleEngineController {

    @Autowired
    CMRatingRuleEngine cmRatingRuleEngine;

    @Autowired
    DoJRuleEngine dojRuleEngine;

    @RequestMapping(method = RequestMethod.POST, value = "/doj")
    public ResponseEntity<Event> handleDoJRules(@RequestBody Employee emp) {
        try {
            return new ResponseEntity<>(dojRuleEngine.runRules(emp), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Hi");
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cmratings")
    public ResponseEntity<Event> handleCMRatingRules(@RequestBody CMRatings cm) {
        try {
            return new ResponseEntity<>(cmRatingRuleEngine.runRules(cm), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Error");
            return null;
        }
    }
}
