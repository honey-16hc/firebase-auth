package com.test.postgresql.springbootpostgresql.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.test.postgresql.springbootpostgresql.controller.model.SecurityProperties;

@Configuration
public class FirebaseConfig {

	 @Autowired
	    SecurityProperties secProps;

	    @Primary
	    @Bean
	    public void firebaseInit() {
	        InputStream inputStream = null;
	        try {
	            inputStream = new ClassPathResource("firebase_config.json").getInputStream();
	        } catch (IOException e3) {
	            e3.printStackTrace();
	        }
	        try {

	            FirebaseOptions options = new FirebaseOptions.Builder()
	                    .setCredentials(GoogleCredentials.fromStream(inputStream))
	                    .build();

	            if (FirebaseApp.getApps().isEmpty()) {
	                FirebaseApp.initializeApp(options);
	            }
	            System.out.println("Firebase Initialize");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
