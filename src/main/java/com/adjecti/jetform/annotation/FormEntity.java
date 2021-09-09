package com.adjecti.jetform.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * FormElement annotation help to generate form fields in angular
 * use on class level and property level.
 * 
 * 
 * @author Sumant Chaubey
 *
 */
@Retention(RUNTIME)
@java.lang.annotation.Target(TYPE)
@Component
public @interface FormEntity {
    FormActions formActions();
}
