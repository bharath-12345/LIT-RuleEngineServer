package com.LITRuleEngine.LITPOC.RuleEngines;

import com.LITRuleEngine.LITPOC.models.CMRatings;
import com.LITRuleEngine.LITPOC.models.Event;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;


@Service
public class CMRatingRuleEngine {

    public Event runRules(CMRatings cm) {
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        System.out.println(kc.verify().getMessages().toString());
        KieSession ksession = kc.newKieSession("cmRatingRulesKS");

        Event event = new Event(-1, "No course to be assigned");

        ksession.insert(event);
        ksession.insert(cm);

        ksession.fireAllRules();

        ksession.dispose();

        return event;
    }

}
