package es.spring.batch;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import es.spring.batch.provider.ApplicationContextProvider;



public class MainBatch {
	
	public static void main(String[] args) {
		//Activar perfil si programar
		//-Dspring.profiles.active="mybatis"
		
		//Activar perfil programando
		
		
		//System.setProperty("spring.profiles.active", "mybatis");
		 
		//Vamos a carga el perfil
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
	    ConfigurableEnvironment env = context.getEnvironment();
	    env.setActiveProfiles("mybatis");
	    context.load("META-INF/spring/applicationContext.xml");
	    context.refresh();
		
	    
	    
		JobLauncher jobLauncher = (JobLauncher) ApplicationContextProvider.getApplicationContext().getBean("jobLauncher");
		Job job = (Job) ApplicationContextProvider.getApplicationContext().getBean("testJob");
	 
		try {
	 
			JobParameters param = new JobParametersBuilder().toJobParameters();
	 
			JobExecution execution = jobLauncher.run(job, param);
			System.out.println("Exit Status : " + execution.getStatus());
			System.out.println("Exit Status : " + execution.getAllFailureExceptions());
	 
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done");
		context.close();
	}

}
