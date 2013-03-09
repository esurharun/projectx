
 ProjectX - a free Java based demux utility
==============================================================================

Copyright (C) 2001-2011 dvb.matt, All Rights Reserved

Copyright (C) 2013 esur.harun All Rights Reserved

 For a compilation, you need a Java SDK, which is available for various platforms.

 All classes should work at least with Sun's JDK/J2RE 1.2.2 (from year 2000) and higher.
 Note: under special circumstances, some graphic drivers/locales cause big troubles with 
 some versions of JRE's on different OS's.


 Extract all files from the received archive to a separate directory.
 Note:  dependent on the used JDK/JRE, ensure that the directory does not start with a '!'-sign or similars,
 otherwise you'll get an error like 'main class not found'

   /**
    * sample of a compilation (may differ on your system) :
    */
   (A) open "build.bat" with an editor and check/correct the entry/path of JAVA_HOME 
       of your installed JDK 

   (B) execute the "build.bat" on its place.
       that will compile all sources, 
       build the .jar file and
       copies the resource files from the resource folder into the new .jar,

       Notes:
       [i]   now, we made a package for the sources,
             the file sources.lst points to every required sourcefile and its location
       [ii]  the following libraries are required on this place from the V 0.82.0,
             related to the executed .jar:
             - lib/commons-net-1.3.0.jar  (compiled with JDK 1.2.2) *)
             - lib/jakarta-oro-2.0.8.jar  (compiled with JDK 1.2.2) *)
       [iii] the following libraries are optional from the V 0.82.0 :
             - lib/idct*.dll  (win32 / os/2 optimized lib's for a faster preview)
             copy one of them to the systems folder or where the compiled .jar is located
       [iv]  dependent on the used JDK, you'll encounter some 'warnings' about 'using a deprecated API'
             that's not critical, as long as an actual JDK still supports these older methods

       *)
       further informations and newer versions (mostly compiled with JDK 1.4.2) you'll find at:
       'jakarta.apache.org/site/binindex.cgi', look for 'Commons Net' and  'ORO'
       - using newer lib's possibly requires an update of the 'build.bat' and 'MANIFEST.MF' !


   (C) additional received resource files (e.g. other language files) can be added 
       to the root directory inside the .jar file, later, 
       or you put them into the same folder where the compiled .jar is executed.


   (D) new with version 0.90 and later:
       it is possible to compile and run this program without the gui (means all source files in /gui/..).
       so there is no requirement of running a X server or similars anymore, calling it from the commandline.

       if you can't start the non-gui version without a X server, try to call pjx with the 'headless' option
       java -Djava.awt.headless=true -jar ProjectX.jar [options] <file>
       
   (E) if you encounter frequently "OutOfMemory" Errors, define more RAM for the Java instance:
       java -Xms128m -Xmx128m -jar ProjectX.jar [options] <files>
       that reserves 128MB, instead of 64MB as default value.

   the compiling process doesn't take more than about 30 seconds.


 For lazy beginners, a pre-compiled version (ProjectX.jar) suitable to JRE 1.2.2
 and higher is included. 
 Possibly, this won't give the best performance with all OS.

  the 2 official ProjectX sites:

  Project + D/L, only @ sourceforge.net/projects/project-x/

  Support for the official version, only @ forum.dvbtechnics.info


 CREDITS

  -  thanx to all the people, who gave hints, files and other things to this project:

	dvb.matt - father of Project-X
	Lucike - forum hoster, documentation
	TheHorse - keyboardcontrol of preview
	java.lang - conditional patch of H-resolution
	R-One - DTS support
	ghost - dreambox file segment completion
	roehrist - CVS, X-input
	pstorch - i18n support
	chrisg - Topfield disk access (AddOn)
	jazzydane - danish translation
	Kano / RoEn - Unix buils script
	Eric Albert - BrowserLauncher
	catapult,Bonni - Topfield 5x00 export
	MartinR - Gui-BaseOutputFileName
	...and all other supporters...

/===============================================================================/
