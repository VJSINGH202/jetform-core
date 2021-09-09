package com.adjecti.jetform.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.adjecti.jetform.enums.LoadType;
import com.adjecti.jetform.enums.ResourceType;
import com.adjecti.jetform.enums.SelectionType;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * Checkbox Annotation helps to genrate
 * ckeckbox type input field elements in Html
 *
 * @author Sumant Chaubey
 * @see Text
 * @see Date
 * @see File
 * @see Hidden
 * @see Select
 * @see Radio
 * @see Email
 * @see Password
 * @see Telephone
 */
@Retention(RUNTIME)
@Target(FIELD)
@EnableFormBuilder
public @interface Checkbox {
	
	SelectionType selectionType() default SelectionType.Single;
	DataProvider dataProvider() default @DataProvider(loadType = LoadType.LAZY,path = "",resource = ResourceType.WEB);


}
