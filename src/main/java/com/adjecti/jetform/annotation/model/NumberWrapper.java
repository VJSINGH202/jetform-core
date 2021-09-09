package com.adjecti.jetform.annotation.model;

import com.adjecti.jetform.annotation.FormField;

public class NumberWrapper extends FormFieldBase{
	private String format;
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public NumberWrapper() {
		super();
	}
	
	public NumberWrapper(FormField formField) {
		
		setId(formField.id());
		setLabel(formField.label());
		setPlaceHolder(formField.placeHolder());
		setName(formField.name());
		setReadOnly(formField.readOnly());
		setDisabled(formField.disabled());
		setRequired(formField.required());
		setErrorMessage(formField.errorMessage());
		setValue(formField.value());
		setFieldType(formField.fieldType().name());
		setListable(formField.listable());
		setFormat(formField.number().format());
	}
}
