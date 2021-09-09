package com.adjecti.jetform.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * Radio Annotation helps to take
 * Single or multitype radioBox value HTML elements
 * @author  Sumant Chaubey
 * @see Text
 * @see Date
 * @see File
 * @see Hidden
 * @see Telephone
 * @see Select
 * @see Email
 * @see Password
 * @see Checkbox
 * 
 */

@Retention(RUNTIME)
@Target(FIELD)
@EnableFormBuilder
public @interface Radio {
	DataProvider dataProvider();
}
