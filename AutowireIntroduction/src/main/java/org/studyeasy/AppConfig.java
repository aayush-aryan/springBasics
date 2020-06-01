package org.studyeasy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration     //spring initilized itself by configuration annotation
@ComponentScan("org.studyeasy")

//it will scan the org.studyeasy packages for different type of annotations and configuration;
// and spring will boot load and spring will come and boot life;
public class AppConfig {

}
