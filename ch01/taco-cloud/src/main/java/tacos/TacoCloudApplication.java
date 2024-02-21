package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootApplication = составная аннотацыя
	// @SpringBootConfiguration – определяет этот класс как класс конфигурации. В  данный момент в  этом классе не определяется
//никаких конфигурационных параметров, но если понадобится, в него можно добавить настройки Spring Framework.
// Эта аннотаия, по сути, является специализированной формой аннотации  - @Configuration;
	// @EnableAutoConfiguration – включает автоконфигурацию Spring
//Boot. Подробнее об автоконфигурации мы поговорим позже,  а пока просто имейте в виду, что эта аннотация сообщает Spring
//Boot о  необходимости автоматически настраивать любые компоненты, которые могут вам понадобиться;
	//ComponentScan  – включает сканирование компонентов. Механизм сканирования позволяет объявлять другие классы с
// аннотациями, такими как @Component, @Controller и @Service, чтобы  фреймворк Spring автоматически обнаруживал и регистрировал
//их как компоненты в контексте приложения Spring.

public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
