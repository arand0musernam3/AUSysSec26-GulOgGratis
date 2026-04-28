package com.adyen.threeds2.internal.ui.activity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import atd.e.ChallengeResultError;
import atd.y.BuildConfig;
import com.adyen.threeds2.customization.UiCustomization;
import h7.o;
import k.h;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
abstract class getSDKTransactionID extends h {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKReferenceNumber = 1;

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        ChallengeResultError challengeResultError = (ChallengeResultError) objArr[1];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 65;
        int i13 = -(-((i11 ^ 65) | i12));
        getSDKReferenceNumber = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        UiCustomization sDKAppID = challengeResultError.getSDKAppID();
        if (sDKAppID != null) {
            atd.aw.getSDKAppID getsdkappid = new atd.aw.getSDKAppID(getsdktransactionid.getWindow(), new atd.aw.getDeviceData(sDKAppID));
            int i14 = AuthenticationRequestParameters;
            getSDKReferenceNumber = ((i14 & 55) + (i14 | 55)) % 128;
            return getsdkappid;
        }
        int i15 = getSDKReferenceNumber;
        int i16 = (i15 ^ 41) + ((i15 & 41) << 1);
        AuthenticationRequestParameters = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 17 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = ((i11 & (-122)) | ((~i11) & 121)) + ((i11 & 121) << 1);
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 != 0) {
            getsdktransactionid.getWindow().setFlags(20128, 21034);
        } else {
            getsdktransactionid.getWindow().setFlags(8192, 8192);
        }
        int i13 = AuthenticationRequestParameters + 97;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = ((i11 | 18) << 1) - (i11 ^ 18);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 == 0 ? Build.VERSION.SDK_INT >= 31 : Build.VERSION.SDK_INT >= 72) {
            int i14 = getSDKReferenceNumber;
            int i15 = i14 & 15;
            int i16 = (i14 | 15) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            AuthenticationRequestParameters = i18 % 128;
            if (i18 % 2 != 0) {
                getsdktransactionid.getWindow().setHideOverlayWindows(false);
            } else {
                getsdktransactionid.getWindow().setHideOverlayWindows(true);
            }
            int i19 = AuthenticationRequestParameters;
            getSDKReferenceNumber = ((i19 ^ 69) + ((i19 & 69) << 1)) % 128;
        }
        int i21 = AuthenticationRequestParameters;
        int i22 = (i21 | 125) << 1;
        int i23 = -(i21 ^ 125);
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        getSDKReferenceNumber = i24 % 128;
        if (i24 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKTransactionID(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = ~i13;
        int i18 = ~(i17 | i14 | i15);
        int i19 = (~((~i15) | i14)) | (~(i14 | i13));
        int i21 = ((-131989504) * i11) + ((-154927104) * i16) + ((-1810235392) * i12) + (1806788795 * i19) + ((-1806788795) * i17) + (i18 * 1806788795) + (677943110 * i13) + (((-3446596) * i14) - 528416768);
        int iC = a0.c(i11, 238734613, (32217706 * i16) + i14 + i13 + i12);
        int i22 = i17 * (-839);
        int i23 = i19 * 839;
        int i24 = i12 * 1127136485;
        int i25 = i16 * 976419026;
        int i26 = i11 * 1106960329;
        int iE = a0.e(iC, 279773184, i26 + i25 + i24 + i23 + i22 + (i18 * 839) + (i13 * 1127135646) + ((i14 * 1127137324) - 440746823), -1943076864, ((-1876361216) * iC) + i21);
        if (iE == 1) {
            return AuthenticationRequestParameters(objArr);
        }
        if (iE == 2) {
            return getSDKReferenceNumber(objArr);
        }
        if (iE == 3) {
            return getDeviceData(objArr);
        }
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        atd.aw.getSDKAppID getsdkappid = (atd.aw.getSDKAppID) objArr[1];
        getSDKReferenceNumber = (AuthenticationRequestParameters + 73) % 128;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getsdktransactionid);
        if (layoutInflaterFrom.getFactory() == null) {
            AuthenticationRequestParameters = (getSDKReferenceNumber + 55) % 128;
            o.a(layoutInflaterFrom, getsdkappid);
            int i27 = getSDKReferenceNumber;
            int i28 = i27 & 97;
            int i29 = (i27 ^ 97) | i28;
            AuthenticationRequestParameters = ((i28 & i29) + (i29 | i28)) % 128;
        }
        int i31 = AuthenticationRequestParameters;
        getSDKReferenceNumber = ((i31 & 121) + (i31 | 121)) % 128;
        return null;
    }

    @Override // k.h, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public abstract ChallengeResultError getDeviceData();

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 79) % 128;
        atd.aw.getSDKAppID getsdkappid = (atd.aw.getSDKAppID) getSDKTransactionID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this, getDeviceData()}, -2077114417, 2077114418, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber());
        if (getsdkappid != null) {
            int i11 = AuthenticationRequestParameters;
            int i12 = (((i11 | 115) << 1) - (~(-(((~i11) & 115) | (i11 & (-116)))))) - 1;
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 == 0) {
                int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
                getSDKTransactionID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this, getsdkappid}, -2133039132, 2133039132, sDKReferenceNumber, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber());
                int i13 = 23 / 0;
            } else {
                int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
                getSDKTransactionID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this, getsdkappid}, -2133039132, 2133039132, sDKReferenceNumber2, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber());
            }
        }
        super.onCreate(bundle);
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        getSDKTransactionID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this}, -610681492, 610681495, sDKReferenceNumber3, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber());
        int sDKReferenceNumber4 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        getSDKTransactionID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this}, 759485553, -759485551, sDKReferenceNumber4, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber());
        int i14 = AuthenticationRequestParameters;
        int i15 = (i14 | 27) << 1;
        int i16 = -(((~i14) & 27) | (i14 & (-28)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        getSDKReferenceNumber = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private void getSDKReferenceNumber() {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        getSDKTransactionID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), sDKReferenceNumber2, new Object[]{this}, 759485553, -759485551, sDKReferenceNumber, sDKReferenceNumber3);
    }

    private void getSDKTransactionID() {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        getSDKTransactionID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), sDKReferenceNumber2, new Object[]{this}, -610681492, 610681495, sDKReferenceNumber, sDKReferenceNumber3);
    }

    private void getSDKTransactionID(atd.aw.getSDKAppID getsdkappid) {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        getSDKTransactionID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), sDKReferenceNumber2, new Object[]{this, getsdkappid}, -2133039132, 2133039132, sDKReferenceNumber, sDKReferenceNumber3);
    }

    private atd.aw.getSDKAppID getSDKTransactionID(ChallengeResultError challengeResultError) {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        return (atd.aw.getSDKAppID) getSDKTransactionID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), sDKReferenceNumber2, new Object[]{this, challengeResultError}, -2077114417, 2077114418, sDKReferenceNumber, sDKReferenceNumber3);
    }
}
