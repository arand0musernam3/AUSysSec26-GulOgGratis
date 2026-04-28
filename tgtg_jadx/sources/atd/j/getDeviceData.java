package atd.j;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"SCHEME_HTTPS", "", "SCHEME_HTTP", "isCompleteUrl", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "isWebLink", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, int r6, byte r7) {
        /*
            int r7 = r7 + 68
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = atd.j.getDeviceData.$$a
            int r5 = r5 * 3
            int r5 = 3 - r5
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r5]
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.j.getDeviceData.$$c(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getMessageVersion = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        getSDKTransactionID();
        Process.myTid();
        ExpandableListView.getPackedPositionForGroup(0);
        Process.getGidForName("");
        TextUtils.indexOf("", "", 0, 0);
        getMessageVersion = (ChallengeResult + 89) % 128;
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        char[] cArr;
        char c7;
        if (str3 != null) {
            charArray = str3.toCharArray();
            $10 = ($11 + 59) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr2 = charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        onCompletion oncompletion = new onCompletion();
        int length = charArray2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        int i14 = 0;
        System.arraycopy(charArray2, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        int i15 = 2;
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) i14;
                    i12 = i15;
                    sDKTransactionID = ChallengeResult.getDeviceData(2069 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44657), TextUtils.indexOf("", "", i14, i14) + 32, -397560981, false, $$c(b8, b8, $$a[i14]), new Class[]{Object.class});
                } else {
                    i12 = i15;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b11 = (byte) i14;
                    i13 = i14;
                    byte b12 = b11;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(TextUtils.indexOf("", "", i14, i14) + 3095, (char) (14367 - TextUtils.getCapsMode("", i14, i14)), 18 - TextUtils.indexOf("", ""), -1211924053, false, $$c(b11, b12, (byte) (b12 | 50)), new Class[]{Object.class});
                } else {
                    i13 = i14;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i16 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i16);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int i17 = i13;
                    c7 = 1;
                    byte b13 = (byte) i17;
                    byte b14 = b13;
                    cArr = cArr2;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(1428 - TextUtils.getCapsMode("", i17, i17), (char) Color.blue(i17), (KeyEvent.getMaxKeyCode() >> 16) + 30, -1183253656, false, $$c(b13, b14, (byte) (b14 | 51)), new Class[]{Object.class, cls, cls});
                } else {
                    cArr = cArr2;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i18 = cArr3[iIntValue2] * 32718;
                int i19 = i12;
                Object[] objArr5 = new Object[i19];
                objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[0] = Integer.valueOf(i18);
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(TextUtils.getTrimmedLength("") + 2774, (char) (13060 - KeyEvent.normalizeMetaState(0)), 26 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -320602145, false, $$c(b15, b16, b16), new Class[]{cls, cls});
                }
                cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i21 = oncompletion.getDeviceData;
                cArr5[i21] = (char) (((((long) (r0 ^ cArr[i21])) ^ (AuthenticationRequestParameters ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getDeviceData) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKAppID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i21 + 1;
                i15 = i19;
                cArr2 = cArr;
                i14 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr5);
        $10 = ($11 + 29) % 128;
        objArr[0] = str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        if (r2 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        if (r10 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        r10 = atd.j.getDeviceData.getSDKTransactionID + 105;
        atd.j.getDeviceData.getSDKReferenceNumber = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        if ((r10 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r10 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        r10 = android.net.Uri.parse(r10).getScheme();
        r8 = new java.lang.Object[1];
        a("욠\ue049賮₫", "谅즱〦꘨", "㣒ᗇ쑍蒩ŧ", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 650752396, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 10288), r8);
        r2 = kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.String) r8[0]).intern(), r10);
        r9 = new java.lang.Object[1];
        a("욠\ue049賮₫", "䋔㚷镀쁆", "ﲔ赅\ue0f7ᒪ", android.view.KeyEvent.getMaxKeyCode() >> 16, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 18068), r9);
        r10 = kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.String) r9[0]).intern(), r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean getSDKAppID(@org.jetbrains.annotations.Nullable java.lang.String r10) throws java.lang.Throwable {
        /*
            int r0 = atd.j.getDeviceData.getSDKReferenceNumber
            int r0 = r0 + 87
            int r1 = r0 % 128
            atd.j.getDeviceData.getSDKTransactionID = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L13
            r0 = 10
            int r0 = r0 / r1
            if (r10 != 0) goto L16
            goto L15
        L13:
            if (r10 != 0) goto L16
        L15:
            return r1
        L16:
            android.net.Uri r10 = android.net.Uri.parse(r10)
            java.lang.String r10 = r10.getScheme()
            int r0 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r0 = r0 >> 16
            r2 = 650752396(0x26c9b18c, float:1.3995301E-15)
            int r6 = r0 + r2
            int r0 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r0 = r0 >> 8
            int r0 = r0 + 10288
            char r7 = (char) r0
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r3 = "욠\ue049賮₫"
            java.lang.String r4 = "谅즱〦꘨"
            java.lang.String r5 = "㣒ᗇ쑍蒩ŧ"
            a(r3, r4, r5, r6, r7, r8)
            r2 = r8[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r10)
            int r3 = android.view.KeyEvent.getMaxKeyCode()
            int r7 = r3 >> 16
            long r3 = android.view.ViewConfiguration.getZoomControlsTimeout()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = r3 + 18068
            char r8 = (char) r3
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r4 = "욠\ue049賮₫"
            java.lang.String r5 = "䋔㚷镀쁆"
            java.lang.String r6 = "ﲔ赅\ue0f7ᒪ"
            a(r4, r5, r6, r7, r8, r9)
            r3 = r9[r1]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.intern()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r10)
            if (r2 != 0) goto L86
            if (r10 == 0) goto L77
            goto L86
        L77:
            int r10 = atd.j.getDeviceData.getSDKTransactionID
            int r10 = r10 + 105
            int r0 = r10 % 128
            atd.j.getDeviceData.getSDKReferenceNumber = r0
            int r10 = r10 % 2
            if (r10 == 0) goto L84
            return r1
        L84:
            r10 = 0
            throw r10
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.j.getDeviceData.getSDKAppID(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (kotlin.text.StringsKt.H(r0) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r2 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (kotlin.text.StringsKt.H(r2) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        atd.j.getDeviceData.getSDKTransactionID = (atd.j.getDeviceData.getSDKReferenceNumber + 107) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        r2 = android.net.Uri.parse(r2);
        r0 = r2.getScheme();
        r2 = r2.getHost();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean getSDKTransactionID(@org.jetbrains.annotations.Nullable java.lang.String r2) {
        /*
            int r0 = atd.j.getDeviceData.getSDKReferenceNumber
            int r0 = r0 + 65
            int r1 = r0 % 128
            atd.j.getDeviceData.getSDKTransactionID = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L13
            r0 = 77
            int r0 = r0 / r1
            if (r2 != 0) goto L16
            goto L15
        L13:
            if (r2 != 0) goto L16
        L15:
            return r1
        L16:
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r0 = r2.getScheme()
            java.lang.String r2 = r2.getHost()
            if (r0 == 0) goto L36
            boolean r0 = kotlin.text.StringsKt.H(r0)
            if (r0 == 0) goto L2b
            goto L36
        L2b:
            if (r2 == 0) goto L36
            boolean r2 = kotlin.text.StringsKt.H(r2)
            if (r2 == 0) goto L34
            goto L36
        L34:
            r2 = 1
            return r2
        L36:
            int r2 = atd.j.getDeviceData.getSDKReferenceNumber
            int r2 = r2 + 107
            int r2 = r2 % 128
            atd.j.getDeviceData.getSDKTransactionID = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.j.getDeviceData.getSDKTransactionID(java.lang.String):boolean");
    }

    public static void init$0() {
        $$a = new byte[]{49, 92, 68, -39};
        $$b = 161;
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = 4240617127988755431L;
        getDeviceData = -2038612665;
        getSDKAppID = (char) 15687;
    }
}
