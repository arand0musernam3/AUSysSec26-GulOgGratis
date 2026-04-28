package com.adyen.threeds2.parameters;

import android.content.Context;
import androidx.annotation.NonNull;
import atd.bc.BuildConfig;
import atd.j.getDeviceData;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeParameters {
    private String mAcsRefNumber;
    private String mAcsSignedContent;
    private String mAcsTransactionID;
    private String mThreeDSRequestorAppURL;
    private String mThreeDSServerTransactionID;

    @NonNull
    @d
    public static String getEmbeddedRequestorAppURL(Context context) {
        return "adyen3ds2://" + context.getPackageName();
    }

    public final String get3DSServerTransactionID() {
        return this.mThreeDSServerTransactionID;
    }

    public final String getAcsRefNumber() {
        return this.mAcsRefNumber;
    }

    public final String getAcsSignedContent() {
        return this.mAcsSignedContent;
    }

    public final String getAcsTransactionID() {
        return this.mAcsTransactionID;
    }

    public final String getThreeDSRequestorAppURL() {
        return this.mThreeDSRequestorAppURL;
    }

    public final void set3DSServerTransactionID(String str) {
        this.mThreeDSServerTransactionID = str;
    }

    public final void setAcsRefNumber(String str) {
        this.mAcsRefNumber = str;
    }

    public final void setAcsSignedContent(String str) {
        this.mAcsSignedContent = str;
    }

    public final void setAcsTransactionID(String str) {
        this.mAcsTransactionID = str;
    }

    public final void setThreeDSRequestorAppURL(String str) {
        if (str != null && !getDeviceData.getSDKTransactionID(str)) {
            BuildConfig.getSDKReferenceNumber.getSDKAppID("ChallengeParameters", "Provided threeDSRequestorAppURL is not complete URL.");
            return;
        }
        if (!getDeviceData.getSDKAppID(str)) {
            BuildConfig.getSDKReferenceNumber.getSDKTransactionID("ChallengeParameters", "Provided threeDSRequestorAppURL is not an Android App Link. This may negatively impact your 3DS2 challenge performance. For better performance it is strongly recommended to provide threeDSRequestorAppUrl in Android App Link format.");
        }
        this.mThreeDSRequestorAppURL = str;
    }
}
