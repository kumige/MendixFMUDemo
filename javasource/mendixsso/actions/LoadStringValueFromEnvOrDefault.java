// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mendixsso.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class LoadStringValueFromEnvOrDefault extends CustomJavaAction<java.lang.String>
{
	private final java.lang.String envVarName;
	private final java.lang.String defaultValue;

	public LoadStringValueFromEnvOrDefault(
		IContext context,
		java.lang.String _envVarName,
		java.lang.String _defaultValue
	)
	{
		super(context);
		this.envVarName = _envVarName;
		this.defaultValue = _defaultValue;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "LoadStringValueFromEnvOrDefault";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
