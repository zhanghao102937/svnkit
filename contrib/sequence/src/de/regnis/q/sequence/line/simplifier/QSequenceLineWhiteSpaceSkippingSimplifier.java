/*
 * ====================================================================
 * Copyright (c) 2000-2008 SyntEvo GmbH, info@syntevo.com
 * All rights reserved.
 *
 * This software is licensed as described in the file SEQUENCE-LICENSE,
 * which you should have received as part of this distribution. Use is
 * subject to license terms.
 * ====================================================================
 */

package de.regnis.q.sequence.line.simplifier;

/**
 * @author Marc Strapetz
 */
public class QSequenceLineWhiteSpaceSkippingSimplifier implements QSequenceLineSimplifier {

	// Static =================================================================

	public static String removeWhiteSpaces(String text) {
		final StringBuffer buffer = new StringBuffer();
		for (int index = 0; index < text.length(); index++) {
			final char ch = text.charAt(index);
			if (ch != '\n' && ch != '\r' && Character.isWhitespace(ch)) {
				continue;
			}

			buffer.append(ch);
		}

		return buffer.toString();
	}

	// Implemented ============================================================

	public byte[] simplify(byte[] bytes) {
		return removeWhiteSpaces(new String(bytes)).getBytes();
	}
}
