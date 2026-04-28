package atd.bc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.onCompletion;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;

    private static String $$g(short s7, int i11, short s8) {
        int i12 = s7 * 3;
        int i13 = 4 - (s8 * 4);
        int i14 = i11 + 68;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i12];
        int i15 = 0 - i12;
        int i16 = -1;
        if (bArr == null) {
            i14 += -i15;
            i13++;
        }
        while (true) {
            i16++;
            bArr2[i16] = (byte) i14;
            if (i16 == i15) {
                return new String(bArr2, 0);
            }
            i14 += -bArr[i13];
            i13++;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getDeviceData = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKAppID();
        getSDKReferenceNumber = 711855262;
    }

    private static void a(int i11, String str, String str2, String str3, char c3, Object[] objArr) throws Throwable {
        long j9;
        int i12;
        int i13;
        char c7;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        onCompletion oncompletion = new onCompletion();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        int i14 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c3);
        int i15 = 2;
        cArr2[2] = (char) (cArr2[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    j9 = 0;
                    byte b8 = (byte) i14;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2070 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', i14) + 44658), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32, -397560981, false, $$g(b8, (byte) (b8 | 49), b8), new Class[]{Object.class});
                } else {
                    j9 = 0;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b11 = (byte) i14;
                    i12 = i15;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getJumpTapTimeout() >> 16) + 3095, (char) (14367 - (KeyEvent.getMaxKeyCode() >> 16)), 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1211924053, false, $$g(b11, (byte) (b11 | 50), b11), new Class[]{Object.class});
                } else {
                    i12 = i15;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i16 = cArr[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr2[iIntValue]);
                objArr4[1] = Integer.valueOf(i16);
                objArr4[i14] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    c7 = 1;
                    byte b12 = (byte) i14;
                    i13 = i14;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1428 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)) + 29, -1183253656, false, $$g(b12, (byte) (b12 | 51), b12), new Class[]{Object.class, cls, cls});
                } else {
                    i13 = i14;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i17 = cArr[iIntValue2] * 32718;
                int i18 = i12;
                Object[] objArr5 = new Object[i18];
                objArr5[c7] = Integer.valueOf(cArr2[iIntValue]);
                objArr5[i13] = Integer.valueOf(i17);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    int i19 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2773;
                    int i21 = i13;
                    char cCombineMeasuredStates = (char) (13060 - View.combineMeasuredStates(i21, i21));
                    int iIndexOf = 24 - TextUtils.indexOf((CharSequence) "", '0', i21, i21);
                    byte b13 = (byte) i21;
                    byte b14 = b13;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(i19, cCombineMeasuredStates, iIndexOf, -320602145, false, $$g(b13, b14, b14), new Class[]{cls, cls});
                }
                cArr2[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i22 = oncompletion.getDeviceData;
                cArr3[i22] = (char) (((((long) (r6 ^ charArray2[i22])) ^ (getSDKAppID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKTransactionID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i22 + 1;
                i15 = i18;
                i14 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 18
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r1 = atd.bc.getMessageVersion.$$d
            int r6 = r6 * 6
            int r6 = 103 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 17
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r1[r5]
        L28:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getMessageVersion.b(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(boolean r26, int r27, java.lang.String r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getMessageVersion.c(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 104
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = atd.bc.getMessageVersion.$$a
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-2)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getMessageVersion.d(byte, short, int, java.lang.Object[]):void");
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static Signature[] getDeviceData(Context context) throws Throwable {
        Signature[] signingCertificateHistory;
        ArrayList arrayList = new ArrayList();
        getSDKEphemeralPublicKey = (getDeviceData + 93) % 128;
        try {
            byte[] bArr = $$d;
            Object[] objArr = new Object[1];
            b(bArr[29], bArr[54], (byte) (-bArr[45]), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((byte) (bArr[23] - 1), bArr[29], bArr[54], objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], List.class).invoke(null, arrayList)).intValue();
            if (iIntValue != 0) {
                try {
                    Object[] objArr3 = {Long.valueOf(8652141214688083968L ^ ((long) iIntValue)), 2014483609L};
                    Object[] objArr4 = new Object[1];
                    b((byte) 23, bArr[54], bArr[29], objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    b((byte) (bArr[23] - 1), bArr[29], bArr[54], objArr5);
                    String str = (String) objArr5[0];
                    Class cls3 = Long.TYPE;
                    cls2.getMethod(str, cls3, cls3).invoke(null, objArr3);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                getSDKEphemeralPublicKey = (getDeviceData + 39) % 128;
                return null;
            }
            Signature[] signatureArr = new Signature[0];
            try {
                int i11 = Build.VERSION.SDK_INT;
                Class cls4 = Integer.TYPE;
                if (i11 >= 28) {
                    String packageName = context.getPackageName();
                    getDeviceData = (getSDKEphemeralPublicKey + 69) % 128;
                    try {
                        Object[] objArr6 = {packageName, 134217728};
                        Object[] objArr7 = new Object[1];
                        a(View.MeasureSpec.getMode(0) + 722820174, "临ᕜ\ue12b\ua97d", "\uf4e5䝀椕渶\uf079嗯獸\u001bཱྀꂴ恎棧\uefe5㦕♚鐿\ue527ᝋ㕁\ue3a0乪䞿鞓⛎㯕檁\ue27e瞉䪛\ue3ca⧜윇凱", "瑾ᒺ䏉硶", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), objArr7);
                        Class<?> cls5 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        a(ViewConfiguration.getEdgeSlop() >> 16, "돞쪗깷⏦", "쪉ᆉ骈\uf809읔㓏\ued1a㿯쥉㓤Ւ앝悖蕴", "瑾ᒺ䏉硶", (char) (59054 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr8);
                        SigningInfo signingInfo = ((PackageInfo) cls5.getMethod((String) objArr8[0], String.class, cls4).invoke(packageManager, objArr6)).signingInfo;
                        if (signingInfo.hasMultipleSigners()) {
                            int i12 = getSDKEphemeralPublicKey + 87;
                            getDeviceData = i12 % 128;
                            if (i12 % 2 != 0) {
                                signingCertificateHistory = signingInfo.getApkContentsSigners();
                                int i13 = 28 / 0;
                            } else {
                                signingCertificateHistory = signingInfo.getApkContentsSigners();
                            }
                        } else {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        }
                        signatureArr = signingCertificateHistory;
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                } else {
                    String packageName2 = context.getPackageName();
                    getDeviceData = (getSDKEphemeralPublicKey + 19) % 128;
                    try {
                        Object[] objArr9 = {packageName2, 64};
                        Object[] objArr10 = new Object[1];
                        a((ViewConfiguration.getTapTimeout() >> 16) + 722820174, "临ᕜ\ue12b\ua97d", "\uf4e5䝀椕渶\uf079嗯獸\u001bཱྀꂴ恎棧\uefe5㦕♚鐿\ue527ᝋ㕁\ue3a0乪䞿鞓⛎㯕檁\ue27e瞉䪛\ue3ca⧜윇凱", "瑾ᒺ䏉硶", (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr10);
                        Class<?> cls6 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        a(KeyEvent.getMaxKeyCode() >> 16, "돞쪗깷⏦", "쪉ᆉ骈\uf809읔㓏\ued1a㿯쥉㓤Ւ앝悖蕴", "瑾ᒺ䏉硶", (char) (59054 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr11);
                        signatureArr = ((PackageInfo) cls6.getMethod((String) objArr11[0], String.class, cls4).invoke(packageManager, objArr9)).signatures;
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th4;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            getDeviceData = (getSDKEphemeralPublicKey + 117) % 128;
            return signatureArr;
        } catch (Throwable th5) {
            Throwable cause4 = th5.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th5;
        }
    }

    public static boolean getSDKAppID(Context context, Collection<String> collection) throws Throwable {
        int i11;
        getSDKEphemeralPublicKey = (getDeviceData + 31) % 128;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                Object[] objArr = {context.getPackageName()};
                Object[] objArr2 = new Object[1];
                a(722820174 - Color.blue(0), "临ᕜ\ue12b\ua97d", "\uf4e5䝀椕渶\uf079嗯獸\u001bཱྀꂴ恎棧\uefe5㦕♚鐿\ue527ᝋ㕁\ue3a0乪䞿鞓⛎㯕檁\ue27e瞉䪛\ue3ca⧜윇凱", "瑾ᒺ䏉硶", (char) Color.red(0), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1602659884, "ⷒ蚦ꡟ\ue438", "秊Ღ籫拝\ue77f鰮눌瘃\udc6c譙罡멓埵栚揳\ue2ceࠕՅ᚜篛⯯쒬킿", "瑾ᒺ䏉硶", (char) Drawable.resolveOpacity(0, 0), objArr3);
                String str = (String) cls.getMethod((String) objArr3[0], String.class).invoke(packageManager, objArr);
                if (str != null) {
                    int i12 = getSDKEphemeralPublicKey + 19;
                    getDeviceData = i12 % 128;
                    if (i12 % 2 != 0) {
                        str.isEmpty();
                        throw null;
                    }
                    if (!str.isEmpty()) {
                        Iterator<String> it = collection.iterator();
                        while (it.hasNext()) {
                            if (it.next().equals(str)) {
                                getDeviceData = (getSDKEphemeralPublicKey + 11) % 128;
                                return true;
                            }
                        }
                        i11 = getDeviceData + 9;
                    }
                }
                return false;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        i11 = getDeviceData + 95;
        getSDKEphemeralPublicKey = i11 % 128;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0475 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] getSDKTransactionID(int r37, int r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getMessageVersion.getSDKTransactionID(int, int):java.lang.Object[]");
    }

    public static void init$0() {
        $$a = new byte[]{76, -80, -40, -9, 3, -3, 3};
        $$b = 251;
    }

    public static void init$1() {
        $$d = new byte[]{66, -81, 60, 85, 19, -16, -54, 73, -73, 20, 51, -12, 3, -8, -33, 44, -1, -8, 3, -2, -67, 67, -2, 15, -33, -15, 7, -10, 47, 0, -39, -5, -2, 15, -33, -15, 7, 9, 30, -17, 13, 5, -18, 2, 17, -11, 6, -1, -37, -5, 19, -16, -54, 51, 1, -52, 57, -2, 15, -33, -15, 7, -10, 47, 0, -39, -5};
        $$e = 116;
    }

    public static void init$2() {
        $$c = new byte[]{27, 20, 100, 39};
        $$f = 95;
    }

    public static void getSDKAppID() {
        getSDKAppID = 7062908553472198969L;
        AuthenticationRequestParameters = -2038612665;
        getSDKTransactionID = (char) 15687;
    }
}
