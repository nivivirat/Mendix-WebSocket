// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package ezwebsocket.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import ezwebsocket.WebsocketManager;

/**
 * Use this for a simple websocket server + Configure a microflow to be executed when a client disconnects
 * 
 * >Example usecase: you want a user to be displayed as "offline" after they close the browser
 * 
 * - Session timeout 60 seconds
 * - Keepalive enabled
 *     - Pings client every 30 seconds
 *     - Timeout after 10 seconds
 * 
 * > Configure the microflow to be called on disconnect (must have a string parameter)
 * > Configure the name of this string parameter
 * > Pass the parameter using the Websocket Close Behaviour tab on the client widget
 */
public class JA_AddWebsocketEndpoint_EZ_CallMicroflowOnDisconnect extends CustomJavaAction<java.lang.Boolean>
{
	private final java.lang.String websocketIdentifier;
	private final java.lang.String onCloseMicroflow;
	private final java.lang.String onCloseMicroflowParameterKey;

	public JA_AddWebsocketEndpoint_EZ_CallMicroflowOnDisconnect(
		IContext context,
		java.lang.String _websocketIdentifier,
		java.lang.String _onCloseMicroflow,
		java.lang.String _onCloseMicroflowParameterKey
	)
	{
		super(context);
		this.websocketIdentifier = _websocketIdentifier;
		this.onCloseMicroflow = _onCloseMicroflow;
		this.onCloseMicroflowParameterKey = _onCloseMicroflowParameterKey;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return WebsocketManager.addWebsocketEndpointWithOnCloseMicroflow(websocketIdentifier, 60L, 30L, 10L,
				onCloseMicroflow,
				onCloseMicroflowParameterKey);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_AddWebsocketEndpoint_EZ_CallMicroflowOnDisconnect";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
