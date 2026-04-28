package atd.h;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import atd.am.getSDKEphemeralPublicKey;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getMessageVersion[] $VALUES;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static String INVALID_TRANS_STATUS_MSG;
    private static getMessageVersion N;
    public static final getMessageVersion Y;
    private static long getDeviceData;
    private static int getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final String mValue;

    private static String $$c(short s7, int i11, byte b8) {
        int i12 = s7 + 103;
        int i13 = b8 * 2;
        byte[] bArr = $$a;
        int i14 = i11 + 4;
        byte[] bArr2 = new byte[i13 + 1];
        int i15 = -1;
        if (bArr == null) {
            i12 += i14;
            i14 = i14;
            bArr = bArr;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            int i17 = i14 + 1;
            bArr2[i16] = (byte) i12;
            if (i16 == i13) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i12 += bArr[i17];
            i14 = i17;
            bArr = bArr3;
            i15 = i16;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        BuildConfig = 1;
        getSDKTransactionID = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getScrollBarFadeDuration();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getPressedStateDuration();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9477), 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(26 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (9479 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        Y = new getMessageVersion(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51199), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 28, (char) (TextUtils.lastIndexOf("", '0') + 51200), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr4);
        N = new getMessageVersion(strIntern2, 1, ((String) objArr4[0]).intern());
        $VALUES = getDeviceData();
        getSDKAppID = (BuildConfig + 103) % 128;
    }

    private getMessageVersion(String str, int i11, String str2) {
        this.mValue = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x030b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r31, char r32, int r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getMessageVersion.a(int, char, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ getMessageVersion[] getDeviceData() {
        getMessageVersion[] getmessageversionArr;
        int i11 = getSDKTransactionID;
        int i12 = i11 + 23;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            getmessageversionArr = new getMessageVersion[2];
            getmessageversionArr[0] = Y;
            getmessageversionArr[0] = N;
        } else {
            getmessageversionArr = new getMessageVersion[]{Y, N};
        }
        AuthenticationRequestParameters = (i11 + 75) % 128;
        return getmessageversionArr;
    }

    public static getMessageVersion getSDKReferenceNumber(String str) throws Throwable {
        if (str == null || str.isEmpty()) {
            int i11 = AuthenticationRequestParameters + 25;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 23 / 0;
            }
            return null;
        }
        getMessageVersion[] getmessageversionArrValues = values();
        AuthenticationRequestParameters = (getSDKTransactionID + 23) % 128;
        for (getMessageVersion getmessageversion : getmessageversionArrValues) {
            AuthenticationRequestParameters = (getSDKTransactionID + 99) % 128;
            if (str.equalsIgnoreCase(getmessageversion.mValue)) {
                int i13 = AuthenticationRequestParameters + 77;
                getSDKTransactionID = i13 % 128;
                if (i13 % 2 == 0) {
                    return getmessageversion;
                }
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getScrollBarSize() >> 8, (char) (42001 - Color.alpha(0)), Process.getGidForName("") + 28, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(str);
        throw new atd.ac.getSDKAppID(sb2.toString(), getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, getSDKEphemeralPublicKey.INVALID_TRANSACTION_STATUS);
    }

    public static void init$0() {
        $$a = new byte[]{57, -81, -39, 15};
        $$b = 89;
    }

    public static getMessageVersion valueOf(String str) {
        getSDKTransactionID = (AuthenticationRequestParameters + 63) % 128;
        getMessageVersion getmessageversion = (getMessageVersion) Enum.valueOf(getMessageVersion.class, str);
        AuthenticationRequestParameters = (getSDKTransactionID + 79) % 128;
        return getmessageversion;
    }

    public static getMessageVersion[] values() throws CloneNotSupportedException {
        int i11 = getSDKTransactionID + 61;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return (getMessageVersion[]) $VALUES.clone();
        }
        $VALUES.clone();
        throw null;
    }

    public final String getSDKAppID() {
        int i11 = (AuthenticationRequestParameters + 49) % 128;
        getSDKTransactionID = i11;
        String str = this.mValue;
        AuthenticationRequestParameters = (i11 + 33) % 128;
        return str;
    }

    public static void getSDKReferenceNumber() {
        getSDKReferenceNumber = new char[]{20566, 62981, 7297, 41762, 51619, 4146, 46787, 56595, 25547, 35449, 53494, 30349, 40220, 9128, 18995, 37042, 14123, 24030, 58436, 2723, 20857, 63482, 7563, 41990, 51866, 4465, 47095, 53585, 13247};
        getDeviceData = -7792092440773569926L;
    }
}
