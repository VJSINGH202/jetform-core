package form.builder.models;

import com.adjecti.jetform.annotation.Checkbox;
import com.adjecti.jetform.annotation.DataProvider;
import com.adjecti.jetform.annotation.FormField;
import com.adjecti.jetform.annotation.Radio;
import com.adjecti.jetform.annotation.Validation;
import com.adjecti.jetform.annotation.Validations;
import com.adjecti.jetform.enums.FieldType;
import com.adjecti.jetform.enums.LoadType;
import com.adjecti.jetform.enums.ResourceType;
import com.adjecti.jetform.enums.SelectionType;
import com.adjecti.jetform.enums.ValidationType;

public class Employee {

	@FormField(fieldType = FieldType.NUMBER)
	Long id;

	@FormField(validations = @Validations(validations = { @Validation(type = ValidationType.SIZE, value = "20"),
			@Validation(type = ValidationType.MAX, value = "1") }))
	String employeeName;

	@FormField(fieldType = FieldType.RADIO, radio = @Radio(dataProvider = @DataProvider(loadType = LoadType.LAZY, path = "/gender/list", resource = ResourceType.WEB)))
	String gender;

	/*
	 * @FormField(fieldType = FieldType.CHECKBOX,checkbox = @Checkbox(selectionType
	 * =SelectionType.Single)) boolean married;
	 */

}
