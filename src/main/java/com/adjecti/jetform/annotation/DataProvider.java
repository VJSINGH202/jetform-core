package com.adjecti.jetform.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.adjecti.jetform.enums.LoadType;
import com.adjecti.jetform.enums.ResourceType;

@Retention(RUNTIME)
@Target(FIELD)
public @interface DataProvider {
	
	String path() default "";
	ResourceType resource();
	LoadType loadType() default LoadType.EAGER;
}
