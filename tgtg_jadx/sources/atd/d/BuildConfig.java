package atd.d;

import a40.q;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import atd.d.getTransactionStatus;
import atd.n.getSDKTransactionID;
import atd.y.timedout;
import atd.z.getErrorDetails;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import r8.k;
import w.a0;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class BuildConfig extends getDeviceData {
    private static int ChallengeResult = 1;
    private static int getSDKEphemeralPublicKey = 0;
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;
    private final Executor AuthenticationRequestParameters = Executors.newFixedThreadPool(2);
    private static final int getSDKAppID = (int) 15000;
    private static final int getDeviceData = (int) TimeConstants.ONE_MINUTE_DIFFERENCE;

    static {
        int i11 = 1 & 41;
        int i12 = -(-((1 ^ 41) | i11));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        BuildConfig buildConfig = (BuildConfig) objArr[0];
        ImageView imageView = (ImageView) objArr[1];
        atd.c.getMessageVersion getmessageversion = (atd.c.getMessageVersion) objArr[2];
        int i11 = getSDKReferenceNumber;
        int i12 = i11 & 31;
        int i13 = (((~i12) & (i11 | 31)) - (~(-(-(i12 << 1))))) - 1;
        getSDKTransactionID = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (imageView != null) {
            int i14 = i11 & 29;
            int i15 = ((i11 ^ 29) | i14) << 1;
            int i16 = -((i11 | 29) & (~i14));
            int i17 = (i15 & i16) + (i16 | i15);
            getSDKTransactionID = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
            if (getmessageversion != null) {
                int i18 = Resources.getSystem().getDisplayMetrics().densityDpi;
                if (i18 <= 320) {
                    if (i18 <= 240) {
                        int iAuthenticationRequestParameters = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                        int iAuthenticationRequestParameters2 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                        int iAuthenticationRequestParameters3 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                        Object[] objArr2 = {buildConfig, imageView, new String[]{(String) atd.c.getMessageVersion.getSDKReferenceNumber(getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), new Object[]{getmessageversion}, 998203758, iAuthenticationRequestParameters2, iAuthenticationRequestParameters, -998203758, iAuthenticationRequestParameters3), getmessageversion.getSDKAppID(), getmessageversion.AuthenticationRequestParameters()}};
                        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
                        getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), 253704431, objArr2, -253704427, getSDKTransactionID.getSDKAppID.getSDKAppID(), sDKAppID, getSDKTransactionID.getSDKAppID.getSDKAppID());
                        int i19 = getSDKReferenceNumber;
                        int i21 = i19 ^ 93;
                        int i22 = (i19 & 93) << 1;
                        getSDKTransactionID = ((i21 & i22) + (i22 | i21)) % 128;
                        return null;
                    }
                    getSDKReferenceNumber = (getSDKTransactionID + 3) % 128;
                    String sDKAppID2 = getmessageversion.getSDKAppID();
                    int iAuthenticationRequestParameters4 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    int iAuthenticationRequestParameters5 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    int iAuthenticationRequestParameters6 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    Object[] objArr3 = {buildConfig, imageView, new String[]{sDKAppID2, (String) atd.c.getMessageVersion.getSDKReferenceNumber(getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), new Object[]{getmessageversion}, 998203758, iAuthenticationRequestParameters5, iAuthenticationRequestParameters4, -998203758, iAuthenticationRequestParameters6), getmessageversion.AuthenticationRequestParameters()}};
                    int sDKAppID3 = getSDKTransactionID.getSDKAppID.getSDKAppID();
                    getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), 253704431, objArr3, -253704427, getSDKTransactionID.getSDKAppID.getSDKAppID(), sDKAppID3, getSDKTransactionID.getSDKAppID.getSDKAppID());
                    int i23 = getSDKTransactionID + 9;
                    getSDKReferenceNumber = i23 % 128;
                    if (i23 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i24 = getSDKTransactionID;
                int i25 = i24 & 77;
                int i26 = (i24 | 77) & (~i25);
                int i27 = -(-(i25 << 1));
                int i28 = (i26 & i27) + (i27 | i26);
                getSDKReferenceNumber = i28 % 128;
                if (i28 % 2 == 0) {
                    String[] strArr = new String[5];
                    strArr[0] = getmessageversion.AuthenticationRequestParameters();
                    strArr[0] = getmessageversion.getSDKAppID();
                    int iAuthenticationRequestParameters7 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    int iAuthenticationRequestParameters8 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    int iAuthenticationRequestParameters9 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    strArr[4] = (String) atd.c.getMessageVersion.getSDKReferenceNumber(getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), new Object[]{getmessageversion}, 998203758, iAuthenticationRequestParameters8, iAuthenticationRequestParameters7, -998203758, iAuthenticationRequestParameters9);
                    int sDKAppID4 = getSDKTransactionID.getSDKAppID.getSDKAppID();
                    int sDKAppID5 = getSDKTransactionID.getSDKAppID.getSDKAppID();
                    getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), 253704431, new Object[]{buildConfig, imageView, strArr}, -253704427, sDKAppID5, sDKAppID4, getSDKTransactionID.getSDKAppID.getSDKAppID());
                } else {
                    String strAuthenticationRequestParameters = getmessageversion.AuthenticationRequestParameters();
                    String sDKAppID6 = getmessageversion.getSDKAppID();
                    int iAuthenticationRequestParameters10 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    int iAuthenticationRequestParameters11 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    int iAuthenticationRequestParameters12 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
                    Object[] objArr4 = {buildConfig, imageView, new String[]{strAuthenticationRequestParameters, sDKAppID6, (String) atd.c.getMessageVersion.getSDKReferenceNumber(getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), new Object[]{getmessageversion}, 998203758, iAuthenticationRequestParameters11, iAuthenticationRequestParameters10, -998203758, iAuthenticationRequestParameters12)}};
                    int sDKAppID7 = getSDKTransactionID.getSDKAppID.getSDKAppID();
                    getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), 253704431, objArr4, -253704427, getSDKTransactionID.getSDKAppID.getSDKAppID(), sDKAppID7, getSDKTransactionID.getSDKAppID.getSDKAppID());
                }
                return null;
            }
        }
        int i29 = getSDKTransactionID + 116;
        int i31 = (i29 ^ (-1)) + (i29 << 1);
        getSDKReferenceNumber = i31 % 128;
        if (i31 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        BuildConfig buildConfig = (BuildConfig) objArr[0];
        WeakReference weakReference = (WeakReference) objArr[1];
        String str = (String) objArr[2];
        int i11 = getSDKTransactionID;
        getSDKReferenceNumber = ((i11 & 1) + (i11 | 1)) % 128;
        try {
            ((ImageView) weakReference.get()).setTag(str);
            int i12 = getSDKReferenceNumber;
            int i13 = i12 & 13;
            int i14 = -(-((i12 ^ 13) | i13));
            getSDKTransactionID = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
            buildConfig.AuthenticationRequestParameters.execute(new q(buildConfig, str, weakReference, 3));
            int i15 = getSDKTransactionID + 31;
            getSDKReferenceNumber = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
        } catch (NullPointerException unused) {
        }
        return null;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = ~i13;
        int i18 = (~(i17 | i15)) | i12;
        int i19 = i15 | i12 | i17;
        int i21 = (2111832064 * i16) + (1488977920 * i11) + ((-18874368) * i14) + (953110385 * i17) + ((-953110385) * i19) + (i18 * (-953110385)) + (934236018 * i13) + ((i12 * 934236018) - 2089811968);
        int iC = a0.c(i16, -617157175, (1159740906 * i11) + i12 + i13 + i14);
        switch (a0.e(iC, 298844160, (i16 * 1125239651) + (i11 * (-135083378)) + (i14 * (-824977973)) + (i17 * 923) + (i19 * (-923)) + (i18 * (-923)) + (i13 * (-824977050)) + (i12 * (-824977050)) + 1921657099, 2098200576, (2070937600 * iC) + i21)) {
            case 1:
                return AuthenticationRequestParameters(objArr);
            case 2:
                int i22 = getSDKTransactionID;
                int i23 = i22 ^ 119;
                int i24 = -(-((i22 & 119) << 1));
                int i25 = (((i23 | i24) << 1) - (i24 ^ i23)) % 128;
                getSDKReferenceNumber = i25;
                int i26 = getDeviceData;
                getSDKTransactionID = a0.d(((i25 ^ 19) | (i25 & 19)) << 1, ~(-(((~i25) & 19) | (i25 & (-20)))), 1, 128);
                return Integer.valueOf(i26);
            case 3:
                int i27 = getSDKTransactionID;
                int i28 = i27 & 17;
                int i29 = (i27 ^ 17) | i28;
                int i31 = ((i28 & i29) + (i29 | i28)) % 128;
                getSDKReferenceNumber = i31;
                int i32 = getSDKAppID;
                int i33 = i31 & 33;
                getSDKTransactionID = (((i31 | 33) & (~i33)) + (i33 << 1)) % 128;
                return Integer.valueOf(i32);
            case 4:
                return getSDKReferenceNumber(objArr);
            case 5:
                return getSDKTransactionID(objArr);
            case 6:
                return getSDKAppID(objArr);
            default:
                ImageView imageView = (ImageView) objArr[0];
                Bitmap bitmap = (Bitmap) objArr[1];
                int i34 = getSDKReferenceNumber;
                int i35 = i34 | 93;
                getSDKTransactionID = ((i35 << 1) - ((~(i34 & 93)) & i35)) % 128;
                imageView.setImageBitmap(bitmap);
                int i36 = getSDKReferenceNumber;
                int i37 = i36 ^ 13;
                int i38 = -(-((i36 & 13) << 1));
                getSDKTransactionID = (((i37 | i38) << 1) - (i38 ^ i37)) % 128;
                return null;
        }
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        BuildConfig buildConfig = (BuildConfig) objArr[0];
        String str = (String) objArr[1];
        WeakReference weakReference = (WeakReference) objArr[2];
        try {
            Object[] objArr2 = {buildConfig.getSDKTransactionID(new getTransactionStatus.getDeviceData().AuthenticationRequestParameters(str).getSDKAppID().AuthenticationRequestParameters())};
            byte[] bArr = (byte[]) getAdditionalDetails.getSDKTransactionID(timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), objArr2, 580301817, -580301817);
            ImageView imageView = (ImageView) weakReference.get();
            if (imageView != null) {
                int i11 = getSDKReferenceNumber;
                int i12 = i11 | 27;
                getSDKTransactionID = a0.d(i12 << 1, ~(-((~(i11 & 27)) & i12)), 1, 128);
                if (imageView.getTag().equals(str)) {
                    getSDKTransactionID = (getSDKReferenceNumber + 109) % 128;
                    imageView.post(new a(imageView, BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    int i13 = getSDKTransactionID;
                    getSDKReferenceNumber = a0.d((i13 & (-36)) | ((~i13) & 35), ~((i13 & 35) << 1), 1, 128);
                }
            }
            int iIdentityHashCode = System.identityHashCode(buildConfig);
            int i14 = ~iIdentityHashCode;
            int i15 = 1578405759 & i14;
            int i16 = (iIdentityHashCode & (-1578405760)) | i15;
            int i17 = 1578405759 & iIdentityHashCode;
            int i18 = ~((i16 & i17) | (i16 ^ i17));
            int i19 = ((i18 & (-1595265024)) | ((~i18) & (-1595265024)) | (1595265023 & i18)) * (-280);
            int i21 = (-2111651806) & i19;
            int i22 = (i21 - (~((i19 ^ (-2111651806)) | i21))) - 1;
            int i23 = (~i17) & (1578405759 | iIdentityHashCode);
            int i24 = ~((i23 & i17) | (i23 ^ i17));
            int i25 = (-51724507) ^ iIdentityHashCode;
            int i26 = (-51724507) & iIdentityHashCode;
            int i27 = ~((i25 & i26) | (i25 ^ i26));
            int i28 = (-2) - ((i22 - (~(((i24 & i27) | (i24 ^ i27)) * 140))) ^ (-1));
            int i29 = ~((iIdentityHashCode & (-16859265)) | ((-16859265) ^ iIdentityHashCode));
            int i31 = ((1578405759 | i14) & (~i15)) | i15;
            int i32 = ~((i31 & 51724506) | (i31 ^ 51724506));
            int i33 = i29 & i32;
            int i34 = (i29 | i32) & (~i33);
            int i35 = (i34 & i33) | (i34 ^ i33);
            int i36 = i14 | (-51724507);
            int i37 = ~((i36 & (-1578405760)) | (i36 ^ (-1578405760)));
            int i38 = i35 & i37;
            int i39 = (i35 | i37) & (~i38);
            int i41 = ((i39 & i38) | (i39 ^ i38)) * 140;
            int i42 = ((~i41) & i28) | ((~i28) & i41);
            int i43 = -(-((i41 & i28) << 1));
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            int i45 = ~getSDKTransactionID.getSDKAppID.getSDKAppID();
            int i46 = ~(((-554574613) & i45) | ((-554574613) ^ i45));
            int i47 = -(-(((i46 & 1972561065) | (1972561065 ^ i46)) * (-933)));
            int i48 = ((((-1537444384) ^ i47) | ((-1537444384) & i47)) << 1) - ((i47 & 1537444383) | ((-1537444384) & (~i47)));
            int i49 = 1972561065 & i45;
            int i51 = (i45 | 1972561065) & (~i49);
            int i52 = ~((i51 & i49) | (i51 ^ i49));
            int i53 = ((i52 & (-1973348286)) | (1973348285 & i52) | ((~i52) & (-1973348286))) * 933;
            int i54 = ((~i53) & i48) | ((~i48) & i53);
            int i55 = (i53 & i48) << 1;
            int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
            int i57 = i56 & 865909741;
            int i58 = -(-(865909741 | i56));
            if (i44 > (i57 & i58) + (i58 | i57)) {
                throw null;
            }
        } catch (IOException unused) {
        }
        return null;
    }

    private void getSDKAppID(WeakReference<ImageView> weakReference, String str) {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        int sDKAppID2 = getSDKTransactionID.getSDKAppID.getSDKAppID();
        getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), -1845532748, new Object[]{this, weakReference, str}, 1845532754, sDKAppID2, sDKAppID, getSDKTransactionID.getSDKAppID.getSDKAppID());
    }

    @Override // atd.d.getDeviceData
    public final int getSDKAppID() {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        int sDKAppID2 = getSDKTransactionID.getSDKAppID.getSDKAppID();
        return ((Integer) getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), 1813389096, new Object[]{this}, -1813389093, sDKAppID2, sDKAppID, getSDKTransactionID.getSDKAppID.getSDKAppID())).intValue();
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        BuildConfig buildConfig = (BuildConfig) objArr[0];
        ImageView imageView = (ImageView) objArr[1];
        String[] strArr = (String[]) objArr[2];
        int i11 = getSDKReferenceNumber;
        getSDKTransactionID = ((-2) - (((i11 ^ 112) + ((i11 & 112) << 1)) ^ (-1))) % 128;
        int length = strArr.length;
        getSDKTransactionID.getSDKAppID.getSDKAppID();
        getSDKTransactionID.getSDKAppID.getSDKAppID();
        int i12 = 0;
        while (i12 < 3) {
            int i13 = getSDKTransactionID;
            getSDKReferenceNumber = k.c(i13 ^ 22, (i13 & 22) << 1, 1, 128);
            String str = strArr[i12];
            if (str != null) {
                getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), -1845532748, new Object[]{buildConfig, new WeakReference(imageView), str}, 1845532754, getSDKTransactionID.getSDKAppID.getSDKAppID(), getSDKTransactionID.getSDKAppID.getSDKAppID(), getSDKTransactionID.getSDKAppID.getSDKAppID());
                int i14 = getSDKReferenceNumber;
                getSDKTransactionID = a0.d(i14 & 5, ~(i14 | 5), 1, 128);
                return null;
            }
            int i15 = i12 & 1;
            int i16 = (i12 | 1) & (~i15);
            int i17 = i15 << 1;
            i12 = ((i16 & i17) << 1) + (i16 ^ i17);
            getSDKReferenceNumber = (((i13 | 103) << 1) - (i13 ^ 103)) % 128;
        }
        int i18 = getSDKReferenceNumber;
        int i19 = ((i18 ^ 77) - (~((i18 & 77) << 1))) - 1;
        getSDKTransactionID = i19 % 128;
        if (i19 % 2 != 0) {
            int i21 = 88 / 0;
        }
        return null;
    }

    private void getSDKReferenceNumber(ImageView imageView, String... strArr) {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        int sDKAppID2 = getSDKTransactionID.getSDKAppID.getSDKAppID();
        getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), 253704431, new Object[]{this, imageView, strArr}, -253704427, sDKAppID2, sDKAppID, getSDKTransactionID.getSDKAppID.getSDKAppID());
    }

    @Override // atd.d.getDeviceData
    public final int getSDKReferenceNumber() {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        int sDKAppID2 = getSDKTransactionID.getSDKAppID.getSDKAppID();
        return ((Integer) getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), 1924310321, new Object[]{this}, -1924310319, sDKAppID2, sDKAppID, getSDKTransactionID.getSDKAppID.getSDKAppID())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getSDKTransactionID(String str, WeakReference weakReference) {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        int sDKAppID2 = getSDKTransactionID.getSDKAppID.getSDKAppID();
        getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), -300254323, new Object[]{this, str, weakReference}, 300254328, sDKAppID2, sDKAppID, getSDKTransactionID.getSDKAppID.getSDKAppID());
    }

    public final void getSDKTransactionID(ImageView imageView, atd.c.getMessageVersion getmessageversion) {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        int sDKAppID2 = getSDKTransactionID.getSDKAppID.getSDKAppID();
        getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), 1714904638, new Object[]{this, imageView, getmessageversion}, -1714904637, sDKAppID2, sDKAppID, getSDKTransactionID.getSDKAppID.getSDKAppID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AuthenticationRequestParameters(ImageView imageView, Bitmap bitmap) {
        int sDKAppID = getSDKTransactionID.getSDKAppID.getSDKAppID();
        int sDKAppID2 = getSDKTransactionID.getSDKAppID.getSDKAppID();
        getSDKReferenceNumber(getSDKTransactionID.getSDKAppID.getSDKAppID(), -2011955503, new Object[]{imageView, bitmap}, 2011955503, sDKAppID2, sDKAppID, getSDKTransactionID.getSDKAppID.getSDKAppID());
    }
}
