package com.LITRuleEngine.LITPOC.utils;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;

public class KsessionGenerator {

    public static KieSession getKsession(String droolFile) throws Exception {
        HttpClient hc = new HttpClient();
        String dojRules = hc.getDroolFile(droolFile);

        KieServices ks = KieServices.Factory.get();
        KieFileSystem kfs = ks.newKieFileSystem();

        kfs.write( "src/main/resources/rules/" + droolFile + ".drl", dojRules );
        KieBuilder kbuilder = ks.newKieBuilder( kfs );
        kbuilder.buildAll();
        KieBase kbase = ks.newKieContainer( kbuilder.getKieModule().getReleaseId() ).getKieBase();
        KieSession ksession = kbase.newKieSession();

        return ksession;
    }
}
