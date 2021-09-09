package com.adjecti.jetform.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.adjecti.jetform.enums.SelectionType;

/**
 * Select Annotation helps to take
 * Single or multitype select value HTML elements
 * @author  Sumant Chaubey
 * @see Text
 * @see Date
 * @see File
 * @see Hidden
 * @see Telephone
 * @see Radio
 * @see Email
 * @see Password
 * @see Checkbox
 * 
 */
@Retention(RUNTIME)
@Target(FIELD)
@EnableFormBuilder
public @interface Select {
	
	SelectionType selectionType() default SelectionType.Single;
	String callBackUrl() default "";
}
