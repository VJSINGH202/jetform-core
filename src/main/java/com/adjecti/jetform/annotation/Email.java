package com.adjecti.jetform.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * Email Annotation helps to genrate
 * Email type input field elements in Html
 * @author  Sumant Chaubey
 * @see Text
 * @see Date
 * @see Hidden
 * @see Number
 * @see Telephone
 * @see Select
 * @see File
 * @see Password
 * @see Checkbox
 * @see Radio
 * 
 */
@Retention(RUNTIME)
@Target(FIELD)
@EnableFormBuilder
public @interface Email {
    String label()  default "";
	
	String placeHolder() default "Enter Email Id...";
	
    boolean required() default false;
	
	String errorMessage() default "";

	String pattern() default "";
	
	

}
