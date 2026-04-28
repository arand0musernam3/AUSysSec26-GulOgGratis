package atd.h;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.am.getSDKEphemeralPublicKey;
import atd.bb.completed;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getDeviceData[] $VALUES;
    private static int AuthenticationRequestParameters;
    private static getDeviceData N;
    public static final getDeviceData Y;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final String mValue;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 120
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = atd.h.getDeviceData.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getDeviceData.$$c(byte, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKTransactionID = 1;
        getSDKReferenceNumber = 0;
        getDeviceData = 1;
        getDeviceData();
        Object[] objArr = new Object[1];
        a("搦摿흾襵䗭", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("搦摿흾襵䗭", 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        Y = new getDeviceData(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("\uec1b\uec55᠌쮳뵏", 1 - View.getDefaultSize(0, 0), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("\uec1b\uec55᠌쮳뵏", 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
        N = new getDeviceData(strIntern2, 1, ((String) objArr4[0]).intern());
        $VALUES = getSDKReferenceNumber();
        int i11 = AuthenticationRequestParameters + 75;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getDeviceData(String str, int i11, String str2) {
        this.mValue = str2;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        int i12 = $10 + 43;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getSDKAppID ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        $10 = ($11 + 43) % 128;
        while (true) {
            int i13 = completedVar.getSDKTransactionID;
            if (i13 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            int i14 = i13 - 4;
            completedVar.getSDKAppID = i14;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i13] ^ sDKTransactionID[i13 % 4]), Long.valueOf(i14), Long.valueOf(getSDKAppID)};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int iRgb = Color.rgb(0, 0, 0) + 16779990;
                    char cResolveOpacity = (char) (13060 - Drawable.resolveOpacity(0, 0));
                    int iRgb2 = Color.rgb(0, 0, 0) + 16777241;
                    byte b8 = (byte) ($$a[3] - 1);
                    byte b11 = b8;
                    String str$$c = $$c(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(iRgb, cResolveOpacity, iRgb2, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i13] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = ChallengeResult.getDeviceData(408 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void getDeviceData() {
        getSDKAppID = -4453942600111719729L;
    }

    public static getDeviceData getSDKReferenceNumber(String str) throws CloneNotSupportedException {
        if (str == null) {
            return N;
        }
        getDeviceData[] getdevicedataArrValues = values();
        int length = getdevicedataArrValues.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = getDeviceData + 13;
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 != 0) {
                getDeviceData getdevicedata = getdevicedataArrValues[i11];
                int i13 = 77 / 0;
                if (str.equalsIgnoreCase(getdevicedata.mValue)) {
                    return getdevicedata;
                }
            } else {
                getDeviceData getdevicedata2 = getdevicedataArrValues[i11];
                if (str.equalsIgnoreCase(getdevicedata2.mValue)) {
                    return getdevicedata2;
                }
            }
        }
        getDeviceData = (getSDKReferenceNumber + 15) % 128;
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{36, -24, 120, 1};
        $$b = 145;
    }

    public static getDeviceData valueOf(String str) {
        getSDKReferenceNumber = (getDeviceData + 63) % 128;
        getDeviceData getdevicedata = (getDeviceData) Enum.valueOf(getDeviceData.class, str);
        int i11 = getDeviceData + 95;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return getdevicedata;
        }
        throw null;
    }

    public static getDeviceData[] values() throws CloneNotSupportedException {
        int i11 = getDeviceData + 103;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return (getDeviceData[]) $VALUES.clone();
        }
        $VALUES.clone();
        throw null;
    }

    public final boolean getSDKAppID() throws Throwable {
        Object obj;
        int i11 = getSDKReferenceNumber + 121;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a("搦摿흾襵䗭", -TextUtils.lastIndexOf("", ';', 1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("搦摿흾襵䗭", -TextUtils.lastIndexOf("", '0', 0), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern().equals(this.mValue);
    }

    public final boolean getSDKTransactionID() throws Throwable {
        Object obj;
        int i11 = getDeviceData + 63;
        getSDKReferenceNumber = i11 % 128;
        int i12 = i11 % 2;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        if (i12 != 0) {
            Object[] objArr = new Object[1];
            a("\uec1b\uec55᠌쮳뵏", (globalActionKeyTimeout > 1L ? 1 : (globalActionKeyTimeout == 1L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("\uec1b\uec55᠌쮳뵏", (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        boolean zEquals = ((String) obj).intern().equals(this.mValue);
        int i13 = getDeviceData + 33;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    public static getDeviceData getSDKReferenceNumber(String str, atd.am.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        getSDKReferenceNumber = (getDeviceData + 27) % 128;
        getDeviceData sDKReferenceNumber = getSDKReferenceNumber(str);
        if (sDKReferenceNumber == null) {
            Object[] objArr = new Object[1];
            a("ϚΓՔⴝ⯏蠟핑\udff9\uf3c2\ue9ac엗켤\ue350\ud83e\uf450ﺜ틣졌\ue4e5\uee5c쉼룘靻鶝뇻", KeyEvent.normalizeMetaState(0) + 1, objArr);
            throw new atd.ac.getSDKAppID(((String) objArr[0]).intern(), getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT, getsdkreferencenumber);
        }
        int i11 = getSDKReferenceNumber + 87;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 95 / 0;
        }
        return sDKReferenceNumber;
    }

    private static /* synthetic */ getDeviceData[] getSDKReferenceNumber() {
        getDeviceData[] getdevicedataArr;
        int i11 = getDeviceData;
        int i12 = i11 + 117;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            getdevicedataArr = new getDeviceData[2];
            getdevicedataArr[0] = Y;
            getdevicedataArr[0] = N;
        } else {
            getdevicedataArr = new getDeviceData[]{Y, N};
        }
        int i13 = i11 + 79;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 == 0) {
            return getdevicedataArr;
        }
        throw null;
    }
}
