/**
 *	Debug.java
 */
package com.fidelis.util

public class Debug {
    private static boolean verbose;
    private static boolean trace;

    /**
     * Sets the verbose operating mode.
     * The value {@code true} enables verbose mode while the value 
     * {@code false} disables it.
     *
     * @param verbose {@code true} enables verbose mode
     */
    public static void setVerbose (boolean verbose) {
    	this.verbose = verbose;
    }

    /**
     * Returns the state of the verbose operating mode.
     * If verbose mode is enabled, the value {@code true} is returned while
     * the value {@code false} indicates that verbose mode is disabled.
     *
     * @return {@code true} if verbose mode is enabled
     */
    public static boolean isVerbose () {
    	return verbose;
    }

    public static void setTrace (boolean trace) {
    	this.trace = trace;
    }

    public static boolean isTrace () {
    	return trace;
    }

    public static void verbose (String text) {
    	if (verbose) {
    	    System.out.println(text);
	}
    }

    public static void trace (String text) {
    	if (trace) {
    	    System.out.println(text);
	}
    }

}
