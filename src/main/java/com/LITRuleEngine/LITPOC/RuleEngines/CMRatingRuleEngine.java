package com.LITRuleEngine.LITPOC.RuleEngines;

import com.LITRuleEngine.LITPOC.models.CMRatings;
import com.LITRuleEngine.LITPOC.models.Event;
import com.LITRuleEngine.LITPOC.utils.KsessionGenerator;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class CMRatingRuleEngine {

    public Event runRules(CMRatings cm) throws Exception {
        KieSession ksession = KsessionGenerator.getKsession("cmRatingRules");

        Event event = new Event(cm.getEmpId(), "CM", -1, "No course to be assigned");

        ksession.insert(event);
        ksession.insert(cm);

        ksession.fireAllRules();

        ksession.dispose();

        return event;
    }

}
