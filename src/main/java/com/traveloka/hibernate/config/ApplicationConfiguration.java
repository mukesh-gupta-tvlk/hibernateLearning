package com.traveloka.hibernate.config;

import com.traveloka.hibernate.dms.AwsS3DocumentManagement;
import com.traveloka.hibernate.dms.DocumentManagementSystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public DocumentManagementSystem getDms(){
        return new AwsS3DocumentManagement();
    }

}
