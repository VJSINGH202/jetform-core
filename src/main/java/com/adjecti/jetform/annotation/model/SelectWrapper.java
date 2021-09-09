package com.adjecti.jetform.annotation.model;

import com.adjecti.jetform.annotation.FormField;
import com.adjecti.jetform.enums.SelectionType;

public class SelectWrapper extends FormFieldBase {
	private String callBackUrl;
	private SelectionType selectionType;

	public SelectWrapper() {
		// TODO Auto-generated constructor stub
	}

	public SelectWrapper(FormField formField) {
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
		setCallBackUrl(formField.select().callBackUrl());
		setSelectionType(formField.select().selectionType());
	}

	public String getCallBackUrl() {
		return callBackUrl;
	}

	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}

	public SelectionType getSelectionType() {
		return selectionType;
	}

	public void setSelectionType(SelectionType selectionType) {
		this.selectionType = selectionType;
	}

	@Override
	public String toString() {
		return "SelectWrapper [callBackUrl=" + callBackUrl + ", selectionType=" + selectionType + ", id=" + id
				+ ", name=" + name + ", label=" + label + ", value=" + value + ", placeHolder=" + placeHolder
				+ ", errorMessage=" + errorMessage + ", required=" + required + ", readOnly=" + readOnly + ", disabled="
				+ disabled + ", listable=" + listable + ", fieldType=" + fieldType + "]";
	}

	
}
