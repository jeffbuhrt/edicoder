/**
 * 
 */
package com.googlecode.edicoder.edifact;

/**
 * @author idle
 *
 */
public enum Code {
	
	UNA ("UNA", "Service String Advice"),
	UNB ("UNB", "Interchange Header"),
	UNZ ("UNZ", "Interchange Trailer"),
	UNG ("UNG", "Functional Group Header"),
	UNE ("UNE", "Functional Group Trailer"),
	UNH ("UNH", "Message Header"),
	UNT ("UNT", "Message Trailer"),
	;
	
	private String name = null;
	private String description = null;
	
	private Code(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

}
