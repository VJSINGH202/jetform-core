package com.adjecti.jetform.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.adjecti.jetform.enums.FieldType;
import com.adjecti.jetform.enums.LoadType;
import com.adjecti.jetform.enums.ResourceType;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface FormField {
	String id() default "";
	String name() default "";
	String label() default "";
	String value() default "";
	String placeHolder() default "Enter Some Text  ";
	String errorMessage() default "";
	
	boolean required() default false;
	boolean readOnly() default false;
	boolean disabled() default false;
	boolean listable() default false;
	
	FieldType fieldType() default FieldType.TEXT;
	
	Text text() default @Text();
	Select select() default @Select();
	Number number() default @Number();
	Radio radio() default @Radio(dataProvider = @DataProvider(loadType = LoadType.LAZY,path = "",resource = ResourceType.WEB));	
	Checkbox checkbox() default @Checkbox(dataProvider = @DataProvider(loadType = LoadType.LAZY,path = "",resource = ResourceType.WEB));
	Validations validations() default @Validations();
}
