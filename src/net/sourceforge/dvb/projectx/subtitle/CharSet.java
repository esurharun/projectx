/*
 * @(#)CharSet.java - constants of teletext System B
 *
 * Copyright (c) 2004-2006 by dvb.matt, All Rights Reserved. 
 * 
 * This file is part of ProjectX, a free Java based demux utility.
 * By the authors, ProjectX is intended for educational purposes only, 
 * as a non-commercial test project.
 * 
 *
 * This program is free software; you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package net.sourceforge.dvb.projectx.subtitle;

//DM06082004 081.7 int07 introduced
public final class CharSet extends Object {

	private CharSet()
	{}

	private final static short G0_sets[][] = {
		{
			//0 = latin
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0021, 0x0022, 0x0023, 0x00a4, 0x0025, 0x0026, 0x0027, 0x0028, 0x0029, 0x002a, 0x002b, 0x002c, 0x002d, 0x002e, 0x002f,
			0x0030, 0x0031, 0x0032, 0x0033, 0x0034, 0x0035, 0x0036, 0x0037, 0x0038, 0x0039, 0x003a, 0x003b, 0x003c, 0x003d, 0x003e, 0x003f,
			0x0040, 0x0041, 0x0042, 0x0043, 0x0044, 0x0045, 0x0046, 0x0047, 0x0048, 0x0049, 0x004a, 0x004b, 0x004c, 0x004d, 0x004e, 0x004f,
			0x0050, 0x0051, 0x0052, 0x0053, 0x0054, 0x0055, 0x0056, 0x0057, 0x0058, 0x0059, 0x005a, 0x005b, 0x005c, 0x005d, 0x005e, 0x005f,
			0x0060, 0x0061, 0x0062, 0x0063, 0x0064, 0x0065, 0x0066, 0x0067, 0x0068, 0x0069, 0x006a, 0x006b, 0x006c, 0x006d, 0x006e, 0x006f,
			0x0070, 0x0071, 0x0072, 0x0073, 0x0074, 0x0075, 0x0076, 0x0077, 0x0078, 0x0079, 0x007a, 0x007b, 0x007c, 0x007d, 0x007e, 0x0020
		},{
			//1 = cyrillic-1, //DM08082004 081.7 int08 changed
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0021, 0x0022, 0x0023, 0x00a4, 0x0025, 0x0026, 0x0027, 0x0028, 0x0029, 0x002a, 0x002b, 0x002c, 0x002d, 0x002e, 0x002f,
			0x0030, 0x0031, 0x0032, 0x0033, 0x0034, 0x0035, 0x0036, 0x0037, 0x0038, 0x0039, 0x003a, 0x003b, 0x003c, 0x003d, 0x003e, 0x003f,
			0x0427, 0x0410, 0x0411, 0x0426, 0x0414, 0x0415, 0x0424, 0x0413, 0x0425, 0x0418, 0x0408, 0x041a, 0x041b, 0x041c, 0x041d, 0x041e,
			0x041f, 0x040c, 0x0420, 0x0421, 0x0422, 0x0423, 0x0412, 0x0403, 0x0409, 0x040a, 0x0417, 0x040b, 0x0416, 0x0402, 0x0428, 0x040f,
			0x0447, 0x0430, 0x0431, 0x0446, 0x0434, 0x0435, 0x0444, 0x0433, 0x0445, 0x0438, 0x0458, 0x043a, 0x043b, 0x043c, 0x043d, 0x043e,
			0x043f, 0x045c, 0x0440, 0x0441, 0x0442, 0x0443, 0x0432, 0x0453, 0x0459, 0x045a, 0x044d, 0x045b, 0x0436, 0x0452, 0x0448, 0x0020
		},{
			//2 = cyrillic-2, //DM08082004 081.7 int08 changed
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0021, 0x0022, 0x0023, 0x00a4, 0x0025, 0x044b, 0x0027, 0x0028, 0x0029, 0x002a, 0x002b, 0x002c, 0x002d, 0x002e, 0x002f,
			0x0030, 0x0031, 0x0032, 0x0033, 0x0034, 0x0035, 0x0036, 0x0037, 0x0038, 0x0039, 0x003a, 0x003b, 0x003c, 0x003d, 0x003e, 0x003f,
			0x042e, 0x0410, 0x0411, 0x0426, 0x0414, 0x0415, 0x0424, 0x0413, 0x0425, 0x0418, 0x0419, 0x041a, 0x041b, 0x041c, 0x041d, 0x041e,
			0x041f, 0x042f, 0x0420, 0x0421, 0x0422, 0x0423, 0x0416, 0x0412, 0x042c, 0x042a, 0x0417, 0x0428, 0x042d, 0x0429, 0x0427, 0x042b,
			0x044e, 0x0430, 0x0431, 0x0446, 0x0434, 0x0435, 0x0444, 0x0433, 0x0445, 0x0438, 0x0439, 0x043a, 0x043b, 0x043c, 0x043d, 0x043e,
			0x043f, 0x044f, 0x0440, 0x0441, 0x0442, 0x0443, 0x0436, 0x0432, 0x044c, 0x044a, 0x0437, 0x0448, 0x044d, 0x0449, 0x0447, 0x0020
		},{
			//3 = cyrillic-3, //DM08082004 081.7 int08 changed
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0021, 0x0022, 0x0023, 0x00a4, 0x0025, 0x0457, 0x0027, 0x0028, 0x0029, 0x002a, 0x002b, 0x002c, 0x002d, 0x002e, 0x002f,
			0x0030, 0x0031, 0x0032, 0x0033, 0x0034, 0x0035, 0x0036, 0x0037, 0x0038, 0x0039, 0x003a, 0x003b, 0x003c, 0x003d, 0x003e, 0x003f,
			0x042e, 0x0410, 0x0411, 0x0426, 0x0414, 0x0415, 0x0424, 0x0413, 0x0425, 0x0418, 0x0419, 0x041a, 0x041b, 0x041c, 0x041d, 0x041e,
			0x041f, 0x042f, 0x0420, 0x0421, 0x0422, 0x0423, 0x0416, 0x0412, 0x042c, 0x0406, 0x0417, 0x0428, 0x0404, 0x0429, 0x0427, 0x0407,
			0x044e, 0x0430, 0x0431, 0x0446, 0x0434, 0x0435, 0x0444, 0x0433, 0x0445, 0x0438, 0x0439, 0x043a, 0x043b, 0x043c, 0x043d, 0x043e,
			0x043f, 0x044f, 0x0440, 0x0441, 0x0442, 0x0443, 0x0436, 0x0432, 0x044c, 0x0456, 0x0437, 0x0448, 0x0454, 0x0449, 0x0447, 0x0020
		},{
			//4 = greek, //DM08082004 081.7 int08 changed
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0021, 0x0022, 0x0023, 0x00a4, 0x0025, 0x0026, 0x0027, 0x0028, 0x0029, 0x002a, 0x002b, 0x002c, 0x002d, 0x002e, 0x002f,
			0x0030, 0x0031, 0x0032, 0x0033, 0x0034, 0x0035, 0x0036, 0x0037, 0x0038, 0x0039, 0x003a, 0x003b, 0x00ab, 0x003d, 0x00bb, 0x003f,
			0x0390, 0x0391, 0x0392, 0x0393, 0x0394, 0x0395, 0x0396, 0x0397, 0x0398, 0x0399, 0x039a, 0x039b, 0x039c, 0x039d, 0x039e, 0x039f,
			0x03a0, 0x03a1, 0x0384, 0x03a3, 0x03a4, 0x03a5, 0x03a6, 0x03a7, 0x03a8, 0x03a9, 0x03aa, 0x03ab, 0x03ac, 0x03ad, 0x03ae, 0x03af,
			0x03b0, 0x03b1, 0x03b2, 0x03b3, 0x03b4, 0x03b5, 0x03b6, 0x03b7, 0x03b8, 0x03b9, 0x03ba, 0x03bb, 0x03bc, 0x03bd, 0x03be, 0x03bf,
			0x03c0, 0x03c1, 0x03c2, 0x03c3, 0x03c4, 0x03c5, 0x03c6, 0x03c7, 0x03c8, 0x03c9, 0x03ca, 0x03cb, 0x03cc, 0x03cd, 0x03ce, 0x0020
		},{
			//5 = arabic, still a copy of latin!
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0021, 0x0022, 0x0023, 0x00a4, 0x0025, 0x0026, 0x0027, 0x0028, 0x0029, 0x002a, 0x002b, 0x002c, 0x002d, 0x002e, 0x002f,
			0x0030, 0x0031, 0x0032, 0x0033, 0x0034, 0x0035, 0x0036, 0x0037, 0x0038, 0x0039, 0x003a, 0x003b, 0x003c, 0x003d, 0x003e, 0x061f,
			0x0040, 0x0041, 0x0042, 0x0043, 0x0044, 0x0045, 0x0046, 0x0047, 0x0048, 0x0049, 0x004a, 0x004b, 0x004c, 0x004d, 0x004e, 0x004f,
			0x0050, 0x0051, 0x0052, 0x0053, 0x0054, 0x0055, 0x0056, 0x0057, 0x0058, 0x0059, 0x005a, 0x005b, 0x005c, 0x005d, 0x005e, 0x005f,
			0x0060, 0x0061, 0x0062, 0x0063, 0x0064, 0x0065, 0x0066, 0x0067, 0x0068, 0x0069, 0x006a, 0x006b, 0x006c, 0x006d, 0x006e, 0x006f,
			0x0070, 0x0071, 0x0072, 0x0073, 0x0074, 0x0075, 0x0076, 0x0077, 0x0078, 0x0079, 0x007a, 0x007b, 0x007c, 0x007d, 0x007e, 0x0020
		},{
			//6 = hebrew, //DM08082004 081.7 int08 changed
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0021, 0x0022, 0x0023, 0x00a4, 0x0025, 0x0026, 0x0027, 0x0028, 0x0029, 0x002a, 0x002b, 0x002c, 0x002d, 0x002e, 0x002f,
			0x0030, 0x0031, 0x0032, 0x0033, 0x0034, 0x0035, 0x0036, 0x0037, 0x0038, 0x0039, 0x003a, 0x003b, 0x003c, 0x003d, 0x003e, 0x003f,
			0x0040, 0x0041, 0x0042, 0x0043, 0x0044, 0x0045, 0x0046, 0x0047, 0x0048, 0x0049, 0x004a, 0x004b, 0x004c, 0x004d, 0x004e, 0x004f,
			0x0050, 0x0051, 0x0052, 0x0053, 0x0054, 0x0055, 0x0056, 0x0057, 0x0058, 0x0059, 0x005a, 0x2190, 0x00bd, 0x2192, 0x2191, 0x0023,
			0x05d0, 0x05d1, 0x05d2, 0x05d3, 0x05d4, 0x05d5, 0x05d6, 0x05d7, 0x05d8, 0x05d9, 0x05da, 0x05db, 0x05dc, 0x05dd, 0x05de, 0x05df,
			0x05e0, 0x05e1, 0x05e2, 0x05e3, 0x05e4, 0x05e5, 0x05e6, 0x05e7, 0x05e8, 0x05e9, 0x05ea, 0x0020, 0x05f0, 0x00bc, 0x00f7, 0x0020
		}
	};

	//DM10082004 081.7 int08 changed
	private final static short G2_sets[][] = {
		{
			//0 = latin
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x00a1, 0x00a2, 0x00a3, 0x0024, 0x00a5, 0x0023, 0x00a7, 0x00a4, 0x00b4, 0x0022, 0x00ab, 0x003c, 0x005e, 0x003d, 0x0076,
			0x00b0, 0x00b1, 0x00b2, 0x00b3, 0x00d7, 0x00b5, 0x00b6, 0x00b7, 0x00f7, 0x00b4, 0x0022, 0x00bb, 0x00bc, 0x00bd, 0x00be, 0x00bf,
			0x0020, 0x0060, 0x00b4, 0x02c6, 0x007e, 0x02c9, 0x02d8, 0x02d9, 0x0308, 0x002e, 0x02da, 0x0020, 0x005f, 0x0022, 0x0020, 0x02d8,
			0x002d, 0x00b9, 0x00ae, 0x00a9, 0x2122, 0x002a, 0x20ac, 0x2030, 0x03b1, 0x0020, 0x0020, 0x0020, 0x002a, 0x002a, 0x002a, 0x002a,
			0x03a9, 0x00c6, 0x0110, 0x0061, 0x0126, 0x0020, 0x0132, 0x013f, 0x0141, 0x00d8, 0x0152, 0x006f, 0x00de, 0x0166, 0x014a, 0x0149,
			0x0138, 0x00e6, 0x0111, 0x010f, 0x0127, 0x0131, 0x0133, 0x0140, 0x0142, 0x00f8, 0x0153, 0x00df, 0x00fe, 0x0167, 0x014b, 0x0020,
		},{
			//1 = cyrillic, //DM08082004 081.7 int08 changed
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x00a1, 0x00a2, 0x00a3, 0x0024, 0x00a5, 0x0020, 0x00a7, 0x0020, 0x00b4, 0x0022, 0x00ab, 0x003c, 0x005e, 0x003d, 0x0076,
			0x00b0, 0x00b1, 0x00b2, 0x00b3, 0x00d7, 0x00b5, 0x00b6, 0x00b7, 0x00f7, 0x00b4, 0x0022, 0x00bb, 0x00bc, 0x00bd, 0x00be, 0x00bf,
			0x0020, 0x0060, 0x00b4, 0x02c6, 0x007e, 0x02c9, 0x02d8, 0x02d9, 0x0308, 0x002e, 0x02da, 0x0020, 0x005f, 0x0022, 0x0020, 0x02d8,
			0x002d, 0x00b9, 0x00ae, 0x00a9, 0x2122, 0x002a, 0x20ac, 0x2030, 0x03b1, 0x0141, 0x0142, 0x00df, 0x002a, 0x002a, 0x002a, 0x002a,
			0x0044, 0x0045, 0x0046, 0x0047, 0x0049, 0x004a, 0x004b, 0x004c, 0x004e, 0x0051, 0x0052, 0x0053, 0x0055, 0x0056, 0x0057, 0x005a,
			0x0064, 0x0065, 0x0066, 0x0067, 0x0069, 0x006a, 0x006b, 0x006c, 0x006e, 0x0071, 0x0072, 0x0073, 0x0075, 0x0076, 0x0077, 0x007a,
		},{
			//2 = greek, //DM08082004 081.7 int08 changed
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0061, 0x0062, 0x00a3, 0x0065, 0x0068, 0x0069, 0x00a7, 0x003a, 0x00b4, 0x0022, 0x006b, 0x003c, 0x005e, 0x003d, 0x0076,
			0x00b0, 0x00b1, 0x00b2, 0x00b3, 0x00d7, 0x006d, 0x006e, 0x0070, 0x00f7, 0x00b4, 0x0022, 0x0074, 0x00bc, 0x00bd, 0x00be, 0x0078,
			0x0020, 0x0060, 0x00b4, 0x02c6, 0x007e, 0x02c9, 0x02d8, 0x02d9, 0x0308, 0x002e, 0x02da, 0x0020, 0x005f, 0x0022, 0x0020, 0x02d8,
			0x003f, 0x00b9, 0x00ae, 0x00a9, 0x2122, 0x002a, 0x20ac, 0x2030, 0x03b1, 0x038a, 0x038e, 0x038f, 0x002a, 0x002a, 0x002a, 0x002a,
			0x0043, 0x0044, 0x0046, 0x0047, 0x004a, 0x004c, 0x0051, 0x0052, 0x0053, 0x0055, 0x0056, 0x0057, 0x0059, 0x005a, 0x0386, 0x0389,
			0x0063, 0x0064, 0x0066, 0x0067, 0x006a, 0x006c, 0x0071, 0x0072, 0x0073, 0x0075, 0x0076, 0x0077, 0x0079, 0x007a, 0x0388, 0x0020,
		},{
			//3 = arabic, still a copy of latin!
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020, 0x0020,
			0x0020, 0x00a1, 0x00a2, 0x00a3, 0x0024, 0x00a5, 0x0023, 0x00a7, 0x00a4, 0x00b4, 0x0022, 0x00ab, 0x003c, 0x005e, 0x003d, 0x0076,
			0x00b0, 0x00b1, 0x00b2, 0x00b3, 0x00d7, 0x00b5, 0x00b6, 0x00b7, 0x00f7, 0x00b4, 0x0022, 0x00bb, 0x00bc, 0x00bd, 0x00be, 0x00bf,
			0x0020, 0x0060, 0x00b4, 0x02c6, 0x007e, 0x02c9, 0x02d8, 0x02d9, 0x0308, 0x002e, 0x02da, 0x0020, 0x005f, 0x0022, 0x0020, 0x02d8,
			0x002d, 0x00b9, 0x00ae, 0x00a9, 0x2122, 0x002a, 0x20ac, 0x2030, 0x0020, 0x0020, 0x0020, 0x0020, 0x002a, 0x002a, 0x002a, 0x002a,
			0x03a9, 0x00c6, 0x0110, 0x0061, 0x0126, 0x0020, 0x0132, 0x013f, 0x0141, 0x00d8, 0x0152, 0x006f, 0x00de, 0x0166, 0x014a, 0x0149,
			0x0138, 0x00e6, 0x0111, 0x010f, 0x0127, 0x0131, 0x0133, 0x0140, 0x0142, 0x00f8, 0x0153, 0x00df, 0x00fe, 0x0167, 0x014b, 0x0020,
		}
	};

	private final static short national_subsets[][] = {
		{ 0x00a3, 0x0024, 0x0040, 0x00ab, 0x00bd, 0x00bb, 0x005e, 0x0023, 0x002d, 0x00bc, 0x00a6, 0x00be, 0x00f7 }, // english ,000
		{ 0x00e9, 0x00ef, 0x00e0, 0x00eb, 0x00ea, 0x00f9, 0x00ee, 0x0023, 0x00e8, 0x00e2, 0x00f4, 0x00fb, 0x00e7 }, // french  ,001
		{ 0x0023, 0x00a4, 0x00c9, 0x00c4, 0x00d6, 0x00c5, 0x00dc, 0x005f, 0x00e9, 0x00e4, 0x00f6, 0x00e5, 0x00fc }, // swedish,finnish,hungarian ,010
		{ 0x0023, 0x016f, 0x010d, 0x0165, 0x017e, 0x00fd, 0x00ed, 0x0159, 0x00e9, 0x00e1, 0x011b, 0x00fa, 0x0161 }, // czech,slovak  ,011
		{ 0x0023, 0x0024, 0x00a7, 0x00c4, 0x00d6, 0x00dc, 0x005e, 0x005f, 0x00b0, 0x00e4, 0x00f6, 0x00fc, 0x00df }, // german ,100
		{ 0x00e7, 0x0024, 0x00a1, 0x00e1, 0x00e9, 0x00ed, 0x00f3, 0x00fa, 0x00bf, 0x00fc, 0x00f1, 0x00e8, 0x00e0 }, // portuguese,spanish ,101
		{ 0x00a3, 0x0024, 0x00e9, 0x00b0, 0x00e7, 0x00bb, 0x005e, 0x0023, 0x00f9, 0x00e0, 0x00f2, 0x00e8, 0x00ec }, // italian  ,110
		{ 0x0023, 0x00a4, 0x0162, 0x00c2, 0x015e, 0x0102, 0x00ce, 0x0131, 0x0163, 0x00e2, 0x015f, 0x0103, 0x00ee }, // rumanian ,111
		{ 0x0023, 0x0024, 0x0160, 0x0117, 0x0119, 0x017d, 0x010d, 0x016b, 0x0161, 0x0105, 0x0173, 0x017e, 0x012f }, // lettish,lithuanian ,1000
		{ 0x0023, 0x0144, 0x0105, 0x017b, 0x015a, 0x0141, 0x0107, 0x00f3, 0x0119, 0x017c, 0x015b, 0x0142, 0x017a }, // polish,  1001
		{ 0x0023, 0x00cb, 0x010c, 0x0106, 0x017d, 0x0110, 0x0160, 0x00eb, 0x010d, 0x0107, 0x017e, 0x0111, 0x0161 }, // serbian,croatian,slovenian, 1010
		{ 0x0023, 0x00f5, 0x0160, 0x00c4, 0x00d6, 0x017e, 0x00dc, 0x00d5, 0x0161, 0x00e4, 0x00f6, 0x017e, 0x00fc }, // estonian  ,1011
		{ 0x0054, 0x011f, 0x0130, 0x015e, 0x00d6, 0x00c7, 0x00dc, 0x011e, 0x0131, 0x015f, 0x00f6, 0x00e7, 0x00fc }, // turkish  ,1100
		null  //res.
	};

	//4 bits main triple + 3 bits character_set
	private final static int G0_set_mapping[][] = {
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //0, latin
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //1, latin
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //2, latin
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //3, latin
		{ 1, 2, 0, 0, 0, 3, 0, 0 }, //4, cy-1,cy-2,la,la,la,cy-3,la,la
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //5, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 4 }, //6, res,res,res,la,res,res,res,gre
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //7, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 5 }, //8, la,la,res,res,res,res,res,ara
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //9, all res.
		{ 0, 0, 0, 0, 0, 6, 0, 5 }, //10, res,res,res,res,res,heb,res,ara
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //11, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //12, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //13, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //14, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //15, all res.
	};

	//4 bits main triple + 3 bits character_set
	private final static int G2_set_mapping[][] = {
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //0, latin
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //1, latin
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //2, latin
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //3, latin
		{ 1, 1, 0, 0, 0, 1, 0, 0 }, //4, cy,cy,la,la,la,cy,la,res
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //5, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 2 }, //6, res,res,res,la,res,res,res,gre
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //7, all res.
		{ 3, 3, 0, 0, 0, 0, 0, 3 }, //8, ara,ara,res,res,res,res,res,ara
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //9, all res.
		{ 0, 0, 0, 0, 0, 3, 0, 3 }, //10, res,res,res,res,res,ara,res,ara
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //11, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //12, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //13, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //14, all res.
		{ 0, 0, 0, 0, 0, 0, 0, 0 }, //15, all res.
	};

	//DM10082004 081.7 int08 changed
	//4 bits main tripl + 3 bits character_set
	private final static int national_subset_mapping[][] = {
		{ 0, 1, 2, 3, 4, 5, 6, 7 },  //0, en,fr,se,cz,de,es,it,ro
		{ 9, 1, 2, 3, 4, 5, 6, 7 },  //1, pl,fr,se,cz,de,es,it,ro
		{ 0, 1, 2, 12, 4, 5, 6, 7 }, //2, en,fr,se,tr,de,es,it,ro
		{ 13, 13, 13, 13, 13, 10, 13, 7 }, //3, en,fr,se,cz,de,cr,it,ro
		{ 13, 13, 11, 3, 4, 13, 8, 13 }, //4, et,cz,de,cr
		{ 13, 13, 13, 13, 13, 13, 13, 13 },  //5, res!
		{ 13, 13, 13, 12, 13, 13, 13, 13 }, //6, res,res,res,tr,res,res,res,(gr)
		{ 13, 13, 13, 13, 13, 13, 13, 13 },  //7, res!
		{ 0, 1, 13, 13, 13, 13, 13, 13 },  //8, en,fr,res,res,res,res,res,(ar)
		{ 13, 13, 13, 13, 13, 13, 13, 13 },  //9, res!
		{ 13, 13, 13, 13, 13, 13, 13, 13 },  //10, res,res,res,res,res,(he),res,(ar)
		{ 13, 13, 13, 13, 13, 13, 13, 13 },  //11, res!
		{ 13, 13, 13, 13, 13, 13, 13, 13 },  //12, res!
		{ 13, 13, 13, 13, 13, 13, 13, 13 },  //13, res!
		{ 13, 13, 13, 13, 13, 13, 13, 13 },  //14, res!
		{ 13, 13, 13, 13, 13, 13, 13, 13 },  //15, res!
	};

	//DM10082004 081.7 int08 changed
	//A=65 .. Z=90
	private final static short diacritical_uppercase_char_map[][] = {
		{ 0, 192, 193, 194, 195, 256, 258, 0, 196, 0, 197, 0, 0, 0, 260, 258 }, //A
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //B
		{ 0, 0, 262, 264, 0, 0, 268, 266, 0, 0, 0, 199, 0, 0, 0, 268 }, //C
		{ 0, 0, 0, 0, 0, 0, 270, 0, 0, 0, 0, 0, 0, 0, 0, 270 }, //D
		{ 0, 200, 201, 202, 0, 274, 276, 278, 203, 0, 0, 0, 0, 0, 280, 282 }, //E
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //F
		{ 0, 0, 0, 284, 0, 0, 286, 288, 0, 0, 0, 290, 0, 0, 0, 0 }, //G
		{ 0, 0, 0, 292, 0, 294, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //H
		{ 0, 204, 205, 206, 296, 298, 300, 304, 207, 0, 0, 0, 0, 0, 302, 300 }, //I
		{ 0, 0, 0, 308, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //J
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 310, 0, 0, 0, 0 }, //K
		{ 0, 0, 313, 0, 0, 0, 0, 319, 0, 0, 0, 315, 0, 0, 0, 317 }, //L
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //M
		{ 0, 0, 323, 0, 209, 0, 0, 0, 0, 0, 0, 325, 0, 0, 0, 327 }, //N
		{ 0, 210, 211, 212, 213, 332, 334, 0, 214, 0, 0, 0, 0, 336, 0, 334 }, //O
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //P
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //Q
		{ 0, 0, 340, 0, 0, 0, 0, 0, 0, 0, 0, 342, 0, 0, 0, 344 }, //R
		{ 0, 0, 346, 348, 0, 0, 0, 0, 0, 0, 0, 350, 0, 0, 0, 352 }, //S
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 354, 0, 0, 0, 356 }, //T
		{ 0, 217, 218, 219, 360, 362, 364, 0, 220, 0, 366, 0, 0, 368, 370, 364 }, //U
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //V
		{ 0, 0, 0, 372, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //W
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //X
		{ 0, 0, 221, 374, 0, 0, 0, 0, 376, 0, 0, 0, 0, 0, 0, 0 }, //Y
		{ 0, 0, 377, 0, 0, 0, 0, 379, 0, 0, 0, 0, 0, 0, 0, 381 }, //Z
	};

	//DM10082004 081.7 int08 changed
	//a=97 .. z=122
	private final static short diacritical_lowercase_char_map[][] = {
		{ 0, 224, 225, 226, 227, 257, 259, 0, 228, 0, 229, 0, 0, 0, 261, 259 }, //a
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //b
		{ 0, 0, 263, 265, 0, 0, 269, 267, 0, 0, 0, 231, 0, 0, 0, 269 }, //c
		{ 0, 0, 0, 0, 0, 0, 271, 0, 0, 0, 0, 0, 0, 0, 0, 271 }, //d
		{ 0, 232, 233, 234, 0, 275, 277, 279, 235, 0, 0, 0, 0, 0, 281, 283 }, //e
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //f
		{ 0, 0, 0, 285, 0, 0, 287, 289, 0, 0, 0, 291, 0, 0, 0, 0 }, //g
		{ 0, 0, 0, 293, 0, 295, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //h
		{ 0, 236, 237, 238, 297, 299, 301, 305, 239, 0, 0, 0, 0, 0, 303, 301 }, //i
		{ 0, 0, 0, 309, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //j
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 311, 0, 0, 0, 0 }, //k
		{ 0, 0, 314, 0, 0, 0, 0, 320, 0, 0, 0, 316, 0, 0, 0, 318 }, //l
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //m
		{ 0, 0, 324, 0, 241, 0, 0, 0, 0, 0, 0, 326, 0, 0, 0, 328 }, //n
		{ 0, 242, 243, 244, 245, 333, 335, 0, 246, 0, 0, 0, 0, 337, 0, 335 }, //o
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //p
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //q
		{ 0, 0, 341, 0, 0, 0, 0, 0, 0, 0, 0, 343, 0, 0, 0, 345 }, //r
		{ 0, 0, 347, 349, 0, 0, 0, 0, 0, 0, 0, 351, 0, 0, 0, 353 }, //s
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 355, 0, 0, 0, 357 }, //t
		{ 0, 249, 250, 251, 361, 363, 365, 0, 252, 0, 367, 0, 0, 369, 371, 365 }, //u
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //v
		{ 0, 0, 0, 373, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //w
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //x
		{ 0, 0, 253, 375, 0, 0, 0, 0, 255, 0, 0, 0, 0, 0, 0, 0 }, //y
		{ 0, 0, 378, 0, 0, 0, 0, 380, 0, 0, 0, 0, 0, 0, 0, 382 }, //z
	};

	public static short[] getActive_G0_Set(int mapping, int character_set, int row)
	{
		if (row < 26)
			return G0_sets[G0_set_mapping[mapping][character_set]];

		else
			return G0_sets[G0_set_mapping[0][0]];
	}

	public static short[] getActive_G2_Set(int mapping, int character_set, int row)
	{
		if (row < 26)
			return G2_sets[G2_set_mapping[mapping][character_set]];

		else
			return G2_sets[G2_set_mapping[0][0]];
	}

	public static short[] getActiveNationalSubset(int mapping, int character_set, int row)
	{
		if (row < 26)
			return national_subsets[national_subset_mapping[mapping][character_set]];

		else
			return national_subsets[national_subset_mapping[0][0]];
	}

	public static short getCombinedCharacter(int basic_char, int combine_char)
	{
		short val = 0;

		if (basic_char >= 65 && basic_char <= 90)
			val = diacritical_uppercase_char_map[basic_char - 65][combine_char];

		else if (basic_char >= 97 && basic_char <= 122)
			val = diacritical_lowercase_char_map[basic_char - 97][combine_char];


		if (val == 0)
			return (short)basic_char;

		else
			return val;
	}
}