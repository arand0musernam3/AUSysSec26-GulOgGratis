package atd.e;

import android.view.ViewConfiguration;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    public static final Charset getSDKAppID;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    private static String $$c(int i11, short s7, byte b8) {
        byte[] bArr = $$a;
        int i12 = 99 - (i11 * 2);
        int i13 = b8 + 4;
        int i14 = s7 * 2;
        byte[] bArr2 = new byte[1 - i14];
        int i15 = 0 - i14;
        int i16 = -1;
        if (bArr == null) {
            i12 += i13;
            i13 = i13;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i12;
            int i18 = i13 + 1;
            if (i17 == i15) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i12 += bArr[i18];
            i13 = i18;
            bArr = bArr3;
            i16 = i17;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        getSDKReferenceNumber();
        Object[] objArr = new Object[1];
        a("\uf1fbဍ㈆呦癊", 57847 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        getSDKAppID = Charset.forName(((String) objArr[0]).intern());
        getSDKTransactionID = (getDeviceData + 93) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
    
        r4[r7] = (char) r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        r0 = new java.lang.Object[]{r3, r3};
        r2 = atd.e.ChallengeResult.getSDKTransactionID(1456884118);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0128, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012a, code lost:
    
        r13 = 3096 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
        r14 = (char) (14366 - android.os.Process.getGidForName(""));
        r15 = android.text.TextUtils.lastIndexOf("", '0', 0) + 19;
        r2 = (byte) (atd.e.getSDKAppID.$$b & 3);
        r3 = (byte) (r2 - 1);
        r2 = atd.e.ChallengeResult.getDeviceData(r13, r14, r15, -1967239290, false, $$c(r2, r3, (byte) (r3 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015b, code lost:
    
        ((java.lang.reflect.Method) r2).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0160, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKAppID.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void getSDKReferenceNumber() {
        getSDKReferenceNumber = 6401910712933869638L;
    }

    public static void init$0() {
        $$a = new byte[]{61, 123, 18, -31};
        $$b = 245;
    }
}
