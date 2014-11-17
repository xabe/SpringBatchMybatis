package es.spring.batch;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.spring.batch.persistence.PruebaMapper;

public class MainMybatis {
	private static final Logger LOGGER = LoggerFactory.getLogger(MainMybatis.class);

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
		PruebaMapper mapper = context.getBean(PruebaMapper.class);
		verTabla(mapper);
		context.close();
	}

	private static void verTabla(PruebaMapper mapper) {
		List<?> list = mapper.selectByExample();
		for (Object object : list) {
			LOGGER.info(object.toString());
		}
	}
}