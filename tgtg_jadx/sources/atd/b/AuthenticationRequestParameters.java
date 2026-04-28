package atd.b;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters extends getDeviceData<String> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    private static String $$c(int i11, int i12, short s7) {
        byte[] bArr = $$a;
        int i13 = i12 * 2;
        int i14 = (i11 * 4) + 4;
        int i15 = 106 - s7;
        byte[] bArr2 = new byte[1 - i13];
        int i16 = 0 - i13;
        int i17 = -1;
        if (bArr == null) {
            i15 = i14 + i16;
            i14++;
            bArr = bArr;
            i17 = -1;
        }
        while (true) {
            int i18 = i17 + 1;
            bArr2[i18] = (byte) i15;
            if (i18 == i16) {
                return new String(bArr2, 0);
            }
            int i19 = i15;
            byte[] bArr3 = bArr;
            i15 = bArr[i14] + i19;
            i14++;
            bArr = bArr3;
            i17 = i18;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getDeviceData = 1;
        getSDKTransactionID = new char[]{62573, 3825, 321, 7079, 7742, 4248, 11242, 11848, 8403, 15113, 15804, 12350, 19286, 19937, 16429, 23203, 23839, 20556, 27390, 27983, 26544, 31252};
        getSDKAppID = -4960437341559255399L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthenticationRequestParameters(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a(Color.argb(0, 0, 0, 0), (char) Color.argb(0, 0, 0, 0), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        super(((String) objArr[0]).intern(), str);
    }

    private static boolean AuthenticationRequestParameters(String str) {
        int i11 = getDeviceData + 29;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i12 = getSDKReferenceNumber + 69;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r31, char r32, int r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.AuthenticationRequestParameters.a(int, char, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{36, 103, 52, 113};
        $$b = 149;
    }

    @Override // atd.b.getDeviceData
    public final /* synthetic */ boolean getSDKReferenceNumber(String str) {
        getSDKReferenceNumber = (getDeviceData + 117) % 128;
        boolean zAuthenticationRequestParameters = AuthenticationRequestParameters(str);
        int i11 = getSDKReferenceNumber + 17;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return zAuthenticationRequestParameters;
        }
        throw null;
    }
}
