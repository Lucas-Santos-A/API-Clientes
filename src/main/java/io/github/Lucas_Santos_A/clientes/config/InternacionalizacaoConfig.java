package io.github.Lucas_Santos_A.clientes.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Locale;

@Configuration
public class InternacionalizacaoConfig {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        messageSource.setDefaultEncoding("ISO-8859-1");
        messageSource.setDefaultLocale(Locale.getDefault());
        return messageSource;
        //ReloadableResource... serve para importar um arquivo de properties
        //setBasename define o nome do arquivo
        //setEncoding define a codificação, tipo UTF8
        //setDefaultLocale obtém a localização configurada no SO do user
        //classpath: diz que o arquivo está na raiz
    }

    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean(){
        //Faz a integração das mensagens de erro do validador
        // com as especificações definidas na classe
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        //Define o messageSource que faz a interpolação
        bean.setValidationMessageSource(messageSource());
        return bean;
    }
}
