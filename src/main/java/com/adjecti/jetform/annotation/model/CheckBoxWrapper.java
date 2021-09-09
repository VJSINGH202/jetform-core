package com.adjecti.jetform.annotation.model;

import com.adjecti.jetform.annotation.DataProvider;
import com.adjecti.jetform.annotation.FormField;
import com.adjecti.jetform.enums.SelectionType;

public class CheckBoxWrapper extends FormFieldBase {

	private SelectionType selectionType;
	private DataProvider dataProvider;
	
	public CheckBoxWrapper() {

	}

	public CheckBoxWrapper(FormField formField) {
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
		setSelectionType(formField.select().selectionType());
		setDataProvider(formField.checkbox().dataProvider());
	}

	public DataProvider getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}

	public SelectionType getSelectionType() {
		return selectionType;
	}

	public void setSelectionType(SelectionType selectionType) {
		this.selectionType = selectionType;
	}

	@Override
	public String toString() {
		return "CheckBoxWrapper [selectionType=" + selectionType + ", dataProvider=" + dataProvider + ", id=" + id
				+ ", name=" + name + ", label=" + label + ", value=" + value + ", placeHolder=" + placeHolder
				+ ", errorMessage=" + errorMessage + ", required=" + required + ", readOnly=" + readOnly + ", disabled="
				+ disabled + ", listable=" + listable + ", fieldType=" + fieldType + "]";
	}
	
	

	/*
	 * @Override public String toString() { return "CheckBoxWrapper [selectionType="
	 * + selectionType + ", dataProvider=" + dataProvider + ", getId()=" + getId() +
	 * ", getName()=" + getName() + ", getLabel()=" + getLabel() + ", getValue()=" +
	 * getValue() + ", getPlaceHolder()=" + getPlaceHolder() +
	 * ", getErrorMessage()=" + getErrorMessage() + ", isRequired()=" + isRequired()
	 * + ", isReadOnly()=" + isReadOnly() + ", isDisabled()=" + isDisabled() +
	 * ", isListable()=" + isListable() + ", getFieldType()=" + getFieldType() +
	 * ", toString()=" + super.toString() + ", getClass()=" + getClass() +
	 * ", hashCode()=" + hashCode() + "]"; }
	 */

	
	
}
