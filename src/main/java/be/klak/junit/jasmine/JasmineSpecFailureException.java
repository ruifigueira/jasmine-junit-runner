package be.klak.junit.jasmine;

import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptableObject;

class JasmineSpecFailureException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private final String message;
    private ScriptableObject trace;

	public JasmineSpecFailureException(NativeObject specResultItem) {
		this.trace = (ScriptableObject) specResultItem.get("trace", specResultItem);
		this.message = (String) specResultItem.get("message", specResultItem).toString();
	}

	@Override
	public String getMessage() {
	   return message;
	}
	
	@Override
	public StackTraceElement[] getStackTrace() {
	    return super.getStackTrace();
	}

}
