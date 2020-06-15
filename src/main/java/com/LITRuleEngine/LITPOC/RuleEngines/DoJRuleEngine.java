package com.LITRuleEngine.LITPOC.RuleEngines;

import com.LITRuleEngine.LITPOC.models.DateKeeper;
import com.LITRuleEngine.LITPOC.models.Employee;
import com.LITRuleEngine.LITPOC.models.Event;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Service
public class DoJRuleEngine {

    public Event runRules(Employee emp) throws Exception {

        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        System.out.println(kc.verify().getMessages().toString());
        KieSession ksession = kc.newKieSession("dojRulesKS");

        Event event = new Event(-1, "No course to be assigned");
        DateKeeper datekeeper = new DateKeeper(new Date(), emp.getDoJ());


        ksession.insert(event);
        ksession.insert(datekeeper);

        ksession.fireAllRules();

        ksession.dispose();

        return event;
    }
}
