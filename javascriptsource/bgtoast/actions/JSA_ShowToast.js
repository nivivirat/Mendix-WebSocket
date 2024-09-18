// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import "mx-global";
import { Big } from "big.js";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * Triggers showing the toast. With your own message.
 * @param {string} message - The message you want to pass to the toast.
 * @param {Big} displayTime - Time the toast will display for. (in milliseconds)
 * @param {"BGToast.ENU_ToastLocation.TopLeft"|"BGToast.ENU_ToastLocation.TopCenter"|"BGToast.ENU_ToastLocation.TopRight"|"BGToast.ENU_ToastLocation.BottomRight"|"BGToast.ENU_ToastLocation.BottomCenter"|"BGToast.ENU_ToastLocation.BottomLeft"} renderLocation - Choose the render location where the toast will display.
 * @param {"BGToast.ENU_ToastStyle._Default"|"BGToast.ENU_ToastStyle.Inverse"|"BGToast.ENU_ToastStyle.Primary"|"BGToast.ENU_ToastStyle.Info"|"BGToast.ENU_ToastStyle.Success"|"BGToast.ENU_ToastStyle.Warning"|"BGToast.ENU_ToastStyle.Danger"} renderStyle - Choose one of the default styles to render your toast.
 * @param {string} customClassName - Provide a custom classname to apply your own custom styling.
 * @returns {Promise.<void>}
 */
export async function JSA_ShowToast(message, displayTime, renderLocation, renderStyle, customClassName) {
	// BEGIN USER CODE
    const event = new CustomEvent("showToast", { detail: { message: message, displayTime : displayTime, renderLocation : renderLocation, renderStyle : renderStyle, customClassName : customClassName } });
    window.dispatchEvent(event);
	// END USER CODE
}
