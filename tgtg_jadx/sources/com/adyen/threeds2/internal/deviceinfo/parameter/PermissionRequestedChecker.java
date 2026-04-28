package com.adyen.threeds2.internal.deviceinfo.parameter;

import android.app.Application;
import android.graphics.ImageFormat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import atd.bb.completed;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: renamed from: com.adyen.threeds2.internal.deviceinfo.parameter.getSDKReferenceNumber, reason: from Kotlin metadata */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionRequestedChecker;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "checkPermission", "", "permission", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionRequestedChecker implements PermissionChecker {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static long getDeviceData;
    private static long getSDKAppID;
    private static long getSDKTransactionID;

    @NotNull
    private final Application getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r6 = r6 + 97
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r6 = r7
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r8]
        L25:
            int r6 = r6 + r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.$$g(int, byte, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID();
        AuthenticationRequestParameters = new char[]{62575, 5624, 14170, 20660, 29185, 37791, 48634, 57096, 63661, 6713, 15248, 17906, 26443, 32984, 41514, 50120, 60926, 3963, 10384, 18966, 27535, 29973, 38773, 45255, 53801, 62387, 7475, 16231, 22720, 31319, 39865, 42243, 51068, 26009, 33795, 42682, 49510, 58367, 613, 11269, 20151, 26969, 35779, 43591, 54296, 63160, 4393, 62575, 5624, 14170, 20660, 29185, 37791, 48634, 57096, 63663, 6694, 15246, 17832, 26479, 32966, 41518, 50058, 60903, 3957, 10463, 18994, 27527, 29977, 38768, 45302, 53807, 62389, 7445, 16231, 22729, 31315, 39827, 42247, 51040, 57591, 601, 9123, 19740, 41000, 16827, 25348, 1259, 9740, 51158, 59827, 35588, 44261, 20020, 28608, 4527, 13060, 54422, 63095, 38857, 47542, 23412, 31935, 7791, 16342, 8530, 49981, 58510, 62564, 5623, 14152, 20647, 29248, 37786, 48639, 57160, 63657, 6776, 15244, 17891, 26440, 32986, 41531, 50053, 60922, 3896, 10483, 18985, 27530, 29983, 38776, 45263, 53803, 62372, 62567, 5605, 14192, 20647, 29210, 37791, 48616, 57155};
        getDeviceData = -8512339040438053482L;
        getSDKAppID = 670348383477841367L;
    }

    public PermissionRequestedChecker(@NotNull Application application) {
        application.getClass();
        this.getSDKReferenceNumber = application;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r32, char r33, int r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.a(int, char, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 122 - r6
            int r0 = 19 - r8
            byte[] r1 = com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.$$a
            int r7 = 24 - r7
            byte[] r0 = new byte[r0]
            int r8 = 18 - r8
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r7]
            r5 = r1
            r1 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r1
            r1 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.b(int, short, short, java.lang.Object[]):void");
    }

    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $11 = ($10 + 63) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getSDKAppID ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKAppID)};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int mode = 2774 - View.MeasureSpec.getMode(0);
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 13060);
                    int i14 = 25 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b8 = (byte) 0;
                    String str$$g = $$g((byte) 23, b8, (byte) (b8 - 1));
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(mode, offsetBefore, i14, -1416626223, false, str$$g, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = ChallengeResult.getDeviceData(408 - TextUtils.getOffsetAfter("", 0), (char) KeyEvent.getDeadChar(0, 0), 29 - ExpandableListView.getPackedPositionChild(0L), 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
                $11 = ($10 + 25) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 26 - r6
            int r8 = 64 - r8
            byte[] r0 = com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.$$d
            int r7 = r7 * 6
            int r7 = r7 + 97
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r5 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
        L25:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-5)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.d(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.e(java.lang.String, int, java.lang.Object[]):void");
    }

    private static void getSDKTransactionID() throws Throwable {
        BuildConfig = (ChallengeResultCancelled + 77) % 128;
        byte[] bArr = $$d;
        byte b8 = bArr[20];
        byte b11 = b8;
        Object[] objArr = new Object[1];
        d(b8, b11, (byte) (b11 | 25), objArr);
        a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
        ChallengeResultCancelled = (BuildConfig + 77) % 128;
        try {
            byte b12 = bArr[20];
            byte b13 = b12;
            Object[] objArr2 = new Object[1];
            d(b12, b13, (byte) (b13 | 25), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b14 = (byte) (bArr[26] + 1);
            Object[] objArr3 = new Object[1];
            d(b14, (byte) (b14 & 1), bArr[20], objArr3);
            Method method = cls.getMethod((String) objArr3[0], null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            Object[] objArr4 = {atd.as.AuthenticationRequestParameters.class.getField("getSDKAppID").get(null)};
            Object[] objArr5 = new Object[1];
            c("侻俚鴄♥鋩\ue487Ὲ", -ImageFormat.getBitsPerPixel(0), objArr5);
            Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
            method2.setAccessible(true);
            int i11 = ChallengeResultCancelled + 17;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 84 / 0;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void init$0() {
        $$a = new byte[]{39, 64, -52, -10, -9, -26, 22, 4, -18, -20, -41, 6, -24, -16, 7, -13, -28, 0, -17, -10, 26, -6, 32, -34, 41, 0, -18, -19};
        $$b = 2;
    }

    public static void init$1() {
        $$d = new byte[]{39, 8, -31, -31, 24, -11, -49, 56, 6, -47, 62, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
        $$e = 112;
    }

    public static void init$2() {
        $$c = new byte[]{63, -107, 81, -105};
        $$f = 214;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x063c  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getSDKAppID(@org.jetbrains.annotations.NotNull java.lang.String r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker.getSDKAppID(java.lang.String):boolean");
    }

    public static void getSDKAppID() {
        getSDKTransactionID = -670681294497532876L;
    }
}
