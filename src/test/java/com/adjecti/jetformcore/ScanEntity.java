package com.adjecti.jetformcore;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.adjecti.jetform.annotation.FormField;
import com.adjecti.jetform.annotation.model.CheckBoxWrapper;
import com.adjecti.jetform.annotation.model.FormFieldBase;
import com.adjecti.jetform.annotation.model.FormFieldWrapper;
import com.adjecti.jetform.annotation.model.RadioWrapper;
import com.adjecti.jetform.annotation.model.SelectWrapper;
import com.adjecti.jetform.annotation.model.TextWrapper;
import com.adjecti.jetform.enums.FieldType;
import com.google.gson.Gson;

public class ScanEntity {
	//static Gson gson = new Gson();
	//String json = gson.toJson(someInstanceOfStaff);
	public static void main(String[] args) {
		Gson gson = new Gson();
		List<FormFieldWrapper> readEntity = readEntity("form.builder.models.Employee");
		String json = gson.toJson(readEntity);
		System.out.println(json);
		/*
		 * readEntity.forEach(a -> { String json = gson.toJson(a); System.out.prin });
		 */

	}

	static List<FormFieldWrapper> readEntity(String className) {
		List<FormFieldWrapper> fieldWrappers = new ArrayList<>();
		Class<?> clazz;
		try {
			clazz = Class.forName(className);
			Field[] declaredFields = clazz.getDeclaredFields();
			for (Field field : declaredFields) {
				if (field.isAnnotationPresent(FormField.class)) {
					FormField formField = field.getAnnotation(FormField.class);

					if (formField.fieldType() == FieldType.TEXT) {
						populateFields(new TextWrapper(formField), fieldWrappers, formField, field);
					} else if (formField.fieldType() == FieldType.RADIO) {
						populateFields(new RadioWrapper(formField), fieldWrappers, formField, field);
					} else if (formField.fieldType() == FieldType.CHECKBOX) {
						populateFields(new CheckBoxWrapper(formField), fieldWrappers, formField, field);
					} else if (formField.fieldType() == FieldType.SELECT) {
						populateFields(new SelectWrapper(formField), fieldWrappers, formField, field);
					}

				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return fieldWrappers;

	}

	static void populateFields(FormFieldBase form, List<FormFieldWrapper> fieldWrappers, FormField formField,
			Field field) {
		// TextWrapper wrapper = new TextWrapper(formField);
		if (formField.id().equals("")) {
			form.setId(field.getName().toLowerCase());
		}
		if (formField.placeHolder().equals("Enter Some Text  ")) {
			form.setPlaceHolder("Enter the " + createLabel(field.getName()));
		}
		if (formField.label().equals("")) {
			form.setLabel(createLabel(field.getName()));
		}
		if (formField.name().equals("")) {
			form.setName(field.getName().toLowerCase());
		}

		fieldWrappers.add(form);

	}

	static String createLabel(String label) {

		String[] words = label.split("(?=\\p{Upper})");
		StringBuilder stringBuilder = new StringBuilder();

		for(String str:words) 
			stringBuilder.append(str.substring(0, 1).toUpperCase()).append(str.substring(1,str.length())).append(" ");	
		
		return stringBuilder.toString().trim();
	}
}
