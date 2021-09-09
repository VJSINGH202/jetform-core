package com.adjecti.jetform.annotation.helperclasses;

import java.util.ArrayList;
import java.util.List;

import com.adjecti.jetform.annotation.FormField;
import com.adjecti.jetform.annotation.Validation;

public class FormBuilderUtils {

	public static List<com.adjecti.jetform.annotation.model.Validation> getValidation(FormField formField){
		List<com.adjecti.jetform.annotation.model.Validation> validations = new ArrayList<>();
		for(Validation validation:formField.validations().validations()) 
			validations.add(new com.adjecti.jetform.annotation.model.Validation(validation.type().name(), validation.value()));
		
		return validations;
	}
}
