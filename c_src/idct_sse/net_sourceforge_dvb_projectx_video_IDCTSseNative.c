/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
#include "net_sourceforge_dvb_projectx_video_IDCTSseNative.h"
#include "idct_ref.h"
#include <stdio.h>
/* Header for class net_sourceforge_dvb_projectx_video_IDCTSseNative */

/*
 * Class:     net_sourceforge_dvb_projectx_video_IDCTSseNative
 * Method:    referenceIDCT
 * Signature: ([S)[[S
 */
JNIEXPORT void JNICALL Java_net_sourceforge_dvb_projectx_video_IDCTSseNative_referenceIDCT
  (JNIEnv *env, jobject obj, jshortArray arr)
{
	jshortArray ret;
	short *localArrayCopy;
	
	localArrayCopy =(short *)(*env)->GetShortArrayElements(env, arr, JNI_FALSE);

	idct_reference_sse(localArrayCopy);

	(*env)->ReleaseShortArrayElements(env, arr, localArrayCopy, 0);
}