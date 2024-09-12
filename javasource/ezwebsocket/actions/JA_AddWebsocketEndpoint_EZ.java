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
 * Use this for a simple websocket server
 * - Session timeout 60 seconds
 * - Keepalive enabled
 *     - Pings client every 30 seconds
 *     - Timeout after 10 seconds
 */
public class JA_AddWebsocketEndpoint_EZ extends CustomJavaAction<java.lang.Boolean>
{
	private final java.lang.String websocketIdentifier;

	public JA_AddWebsocketEndpoint_EZ(
		IContext context,
		java.lang.String _websocketIdentifier
	)
	{
		super(context);
		this.websocketIdentifier = _websocketIdentifier;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return WebsocketManager.addWebsocketEndpoint(websocketIdentifier, 60L, 30L, 10L);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_AddWebsocketEndpoint_EZ";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
