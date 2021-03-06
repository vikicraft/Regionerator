package com.github.jikoo.regionerator;

/**
 * Tiny enum representing when a chunk was last visited.
 *
 * @author Jikoo
 */
public enum VisitStatus {

	UNKNOWN,
	UNVISITED,
	GENERATED,
	VISITED,
	PERMANENTLY_FLAGGED,
	PROTECTED

}
