package atd.al;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.aj.getSDKEphemeralPublicKey;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import b3.i;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static char ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKReferenceNumber;
    private getSDKAppID getDeviceData;
    private AuthenticationRequestParameters getSDKAppID;
    private getDeviceData getSDKTransactionID;

    private static String $$c(short s7, short s8, int i11) {
        int i12 = (s8 * 4) + 4;
        byte[] bArr = $$a;
        int i13 = s7 * 2;
        int i14 = 119 - i11;
        byte[] bArr2 = new byte[1 - i13];
        int i15 = 0 - i13;
        int i16 = -1;
        if (bArr == null) {
            i12++;
            i14 = i12 + (-i14);
        }
        while (true) {
            int i17 = i14;
            int i18 = i12;
            i16++;
            bArr2[i16] = (byte) i17;
            if (i16 == i15) {
                return new String(bArr2, 0);
            }
            i12 = i18 + 1;
            i14 = i17 + (-bArr[i18]);
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getMessageVersion = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKTransactionID();
        SystemClock.elapsedRealtime();
        TextUtils.lastIndexOf("", '0');
        int i11 = BuildConfig + 39;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getSDKReferenceNumber(AuthenticationRequestParameters authenticationRequestParameters, getDeviceData getdevicedata, getSDKAppID getsdkappid) {
        this.getSDKAppID = authenticationRequestParameters;
        this.getSDKTransactionID = getdevicedata;
        this.getDeviceData = getsdkappid;
    }

    public static getSDKReferenceNumber AuthenticationRequestParameters(String str, List<atd.ai.getSDKAppID> list) throws Throwable {
        getMessageVersion = (getSDKEphemeralPublicKey + 111) % 128;
        Object[] objArr = new Object[1];
        a("幙쓸駜푪", "譃絡ﳁര", "鉌ᙋ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 12540), objArr);
        String[] strArrSplit = str.split(((String) objArr[0]).intern());
        if (strArrSplit.length != 3) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
        }
        getSDKReferenceNumber getsdkreferencenumber = new getSDKReferenceNumber(new AuthenticationRequestParameters(strArrSplit[0], list), new getDeviceData(strArrSplit[1]), new getSDKAppID(strArrSplit[2]));
        int i11 = getMessageVersion + 9;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        char[] charArray3;
        int i12;
        int i13;
        char[] cArr;
        char c7;
        if (str3 != null) {
            $11 = ($10 + 25) % 128;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr2 = charArray;
        if (str2 != null) {
            $11 = ($10 + 37) % 128;
            charArray2 = str2.toCharArray();
        } else {
            charArray2 = str2;
        }
        char[] cArr3 = charArray2;
        Object obj = null;
        int i14 = 2;
        if (str != null) {
            int i15 = $11 + 95;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray3 = str.toCharArray();
        } else {
            charArray3 = str;
        }
        char[] cArr4 = charArray3;
        onCompletion oncompletion = new onCompletion();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        int i16 = 0;
        System.arraycopy(cArr3, 0, cArr5, 0, length);
        System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c3);
        cArr6[2] = (char) (cArr6[2] + ((char) i11));
        int length3 = cArr2.length;
        char[] cArr7 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $10 = ($11 + 65) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) i16;
                    i12 = i14;
                    byte b11 = b8;
                    sDKTransactionID = ChallengeResult.getDeviceData((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2069, (char) (44656 - TextUtils.lastIndexOf("", '0')), Color.red(i16) + 32, -397560981, false, $$c(b8, b11, (byte) (b11 + 2)), new Class[]{Object.class});
                } else {
                    i12 = i14;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) i16;
                    byte b13 = b12;
                    i13 = i16;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(ExpandableListView.getPackedPositionChild(0L) + 3096, (char) (14367 - ExpandableListView.getPackedPositionGroup(0L)), 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1211924053, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class});
                } else {
                    i13 = i16;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i17 = cArr5[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr6[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int edgeSlop = 1428 - (ViewConfiguration.getEdgeSlop() >> 16);
                    c7 = 1;
                    int i18 = i13;
                    char c8 = (char) (TypedValue.complexToFraction(i18, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i18, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iLastIndexOf = 29 - TextUtils.lastIndexOf("", '0', i18);
                    byte b14 = (byte) i18;
                    byte b15 = b14;
                    cArr = cArr2;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(edgeSlop, c8, iLastIndexOf, -1183253656, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, cls});
                } else {
                    cArr = cArr2;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i19 = cArr5[iIntValue2] * 32718;
                char c11 = cArr6[iIntValue];
                i14 = i12;
                Object[] objArr5 = new Object[i14];
                objArr5[c7] = Integer.valueOf(c11);
                objArr5[0] = Integer.valueOf(i19);
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(2774 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (13060 - TextUtils.indexOf("", "")), 24 - TextUtils.lastIndexOf("", '0', 0), -320602145, false, $$c(b16, b17, (byte) (b17 | 51)), new Class[]{cls, cls});
                }
                obj = null;
                cArr6[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr5[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i21 = oncompletion.getDeviceData;
                cArr7[i21] = (char) (((((long) (r0 ^ cArr[i21])) ^ (getSDKReferenceNumber ^ 1905653906042338631L)) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) ChallengeResult) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i21 + 1;
                cArr2 = cArr;
                i16 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr7);
    }

    private static byte[] getDeviceData(String str, String str2) throws Throwable {
        StringBuilder sbO = i.o(str);
        Object[] objArr = new Object[1];
        a("幙쓸駜푪", "햀氈\uebf2ᚑ", "름", TextUtils.indexOf((CharSequence) "", '0', 0) - 227800874, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 37356), objArr);
        sbO.append(((String) objArr[0]).intern());
        sbO.append(str2);
        byte[] bytes = sbO.toString().getBytes(atd.e.getSDKAppID.getSDKAppID);
        int i11 = getMessageVersion + 27;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return bytes;
        }
        throw null;
    }

    public static void init$0() {
        $$a = new byte[]{65, 100, 30, 30};
        $$b = 57;
    }

    public final void getSDKAppID(X509Certificate x509Certificate) throws Throwable {
        getMessageVersion = (getSDKEphemeralPublicKey + 13) % 128;
        getSDKEphemeralPublicKey.getDeviceData(x509Certificate, this.getSDKAppID.getDeviceData());
        byte[] deviceData = getDeviceData(this.getSDKAppID.getSDKAppID(), this.getSDKTransactionID.getSDKAppID());
        try {
            if (this.getSDKAppID.AuthenticationRequestParameters().getDeviceData(this.getDeviceData.BuildConfig(), deviceData, this.getSDKAppID.getDeviceData().get(0).getPublicKey())) {
                getMessageVersion = (getSDKEphemeralPublicKey + 89) % 128;
            } else {
                getSDKEphemeralPublicKey = (getMessageVersion + 15) % 128;
                throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
            }
        } catch (GeneralSecurityException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    public final void getSDKTransactionID(List<X509Certificate> list) throws Throwable {
        int size;
        int i11 = getMessageVersion + 109;
        getSDKEphemeralPublicKey = i11 % 128;
        int i12 = i11 % 2;
        AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        if (i12 == 0) {
            Collections.disjoint(list, authenticationRequestParameters.getDeviceData());
            throw null;
        }
        List<X509Certificate> deviceData = authenticationRequestParameters.getDeviceData();
        if (!Collections.disjoint(list, deviceData)) {
            int i13 = getSDKEphemeralPublicKey + 45;
            getMessageVersion = i13 % 128;
            if (i13 % 2 != 0) {
                deviceData.size();
                size = 0;
            } else {
                size = deviceData.size() - 1;
            }
            try {
                getSDKAppID(deviceData.get(size));
                return;
            } catch (SDKRuntimeException unused) {
            }
        }
        Iterator<X509Certificate> it = list.iterator();
        while (it.hasNext()) {
            getMessageVersion = (getSDKEphemeralPublicKey + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
            try {
                getSDKAppID(it.next());
                return;
            } catch (SDKRuntimeException unused2) {
            }
        }
        throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
    }

    public final void getDeviceData() {
        int i11 = getMessageVersion + 45;
        getSDKEphemeralPublicKey = i11 % 128;
        int i12 = i11 % 2;
        AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        if (i12 != 0) {
            if (authenticationRequestParameters != null) {
                authenticationRequestParameters.getSDKReferenceNumber();
                this.getSDKAppID = null;
                getSDKEphemeralPublicKey = (getMessageVersion + 59) % 128;
            }
            getDeviceData getdevicedata = this.getSDKTransactionID;
            if (getdevicedata != null) {
                getdevicedata.getSDKReferenceNumber();
                this.getSDKTransactionID = null;
                getSDKEphemeralPublicKey = (getMessageVersion + 7) % 128;
            }
            getSDKAppID getsdkappid = this.getDeviceData;
            if (getsdkappid != null) {
                getSDKEphemeralPublicKey = (getMessageVersion + 29) % 128;
                getsdkappid.getSDKReferenceNumber();
                this.getDeviceData = null;
                return;
            }
            return;
        }
        throw null;
    }

    public final getDeviceData getSDKAppID() {
        int i11 = getMessageVersion;
        getDeviceData getdevicedata = this.getSDKTransactionID;
        int i12 = i11 + 69;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 != 0) {
            return getdevicedata;
        }
        throw null;
    }

    public static void getSDKTransactionID() {
        getSDKReferenceNumber = -3595939596270738658L;
        AuthenticationRequestParameters = -2038612665;
        ChallengeResult = (char) 15687;
    }
}
