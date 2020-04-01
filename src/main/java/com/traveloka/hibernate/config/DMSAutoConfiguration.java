package com.traveloka.hibernate.config;

import com.traveloka.hibernate.dms.AwsS3DocumentManagement;
import com.traveloka.hibernate.dms.DocumentManagementSystem;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(DocumentManagementSystem.class)
@ConditionalOnProperty(prefix = "dms", name = "enabled", havingValue = "true")
public class DMSAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean(DocumentManagementSystem.class)
    public DocumentManagementSystem getDocumentManagementSystem() {
        return new AwsS3DocumentManagement();
    }
}
