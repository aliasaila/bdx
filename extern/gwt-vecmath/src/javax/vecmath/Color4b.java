/*
 * $RCSfile: Color4b.java,v $
 *
 * Copyright 1997-2008 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 *
 * $Revision: 1.6 $
 * $Date: 2008/02/28 20:18:50 $
 * $State: Exp $
 */

package javax.vecmath;

/**
 * A four-byte color value represented by byte x, y, z, and w values. The x, y,
 * z, and w values represent the red, green, blue, and alpha values,
 * respectively.
 * <p>
 * Note that Java defines a byte as a signed integer in the range [-128, 127].
 * However, colors are more typically represented by values in the range [0,
 * 255]. Java 3D recognizes this and for color treats the bytes as if the range
 * were [0, 255]---in other words, as if the bytes were unsigned.
 * <p>
 * Java 3D assumes that a linear (gamma-corrected) visual is used for all
 * colors.
 * 
 */
public class Color4b extends Tuple4b implements java.io.Serializable {

	// Compatible with 1.1
	static final long serialVersionUID = -105080578052502155L;

	/**
	 * Constructs and initializes a Color4b from the four specified values.
	 * 
	 * @param b1
	 *          the red color value
	 * @param b2
	 *          the green color value
	 * @param b3
	 *          the blue color value
	 * @param b4
	 *          the alpha value
	 */
	public Color4b(byte b1, byte b2, byte b3, byte b4) {
		super(b1, b2, b3, b4);
	}

	/**
	 * Constructs and initializes a Color4b from the array of length 4.
	 * 
	 * @param c
	 *          the array of length 4 containing r, g, b, and alpha in order
	 */
	public Color4b(byte[] c) {
		super(c);
	}

	/**
	 * Constructs and initializes a Color4b from the specified Color4b.
	 * 
	 * @param c1
	 *          the Color4b containing the initialization r,g,b,a data
	 */
	public Color4b(Color4b c1) {
		super(c1);
	}

	/**
	 * Constructs and initializes a Color4b from the specified Tuple4b.
	 * 
	 * @param t1
	 *          the Tuple4b containing the initialization r,g,b,a data
	 */
	public Color4b(Tuple4b t1) {
		super(t1);
	}

	/**
	 * Constructs and initializes a Color4b to (0,0,0,0).
	 */
	public Color4b() {
		super();
	}
}
