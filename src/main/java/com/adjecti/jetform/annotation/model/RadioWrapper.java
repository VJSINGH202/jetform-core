package com.adjecti.jetform.annotation.model;


import com.adjecti.jetform.annotation.FormField;

public class RadioWrapper extends FormFieldBase {
	private DataProvider dataProvider;
	
	public RadioWrapper() {
	}

	public RadioWrapper(FormField formField) {
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
		setDataProvider(new DataProvider(formField));
	}
	public DataProvider getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}
	
	/*
	 * @Override public String toString() { return "RadioWrapper [dataProvider=" +
	 * dataProvider + ", getId()=" + getId() + ", getName()=" + getName() +
	 * ", getLabel()=" + getLabel() + ", getValue()=" + getValue() +
	 * ", getPlaceHolder()=" + getPlaceHolder() + ", getErrorMessage()=" +
	 * getErrorMessage() + ", isRequired()=" + isRequired() + ", isReadOnly()=" +
	 * isReadOnly() + ", isDisabled()=" + isDisabled() + ", isListable()=" +
	 * isListable() + ", getFieldType()=" + getFieldType() + ", toString()=" +
	 * super.toString() + ", getClass()=" + getClass() + ", hashCode()=" +
	 * hashCode() + "]"; }
	 */
	
	
}
