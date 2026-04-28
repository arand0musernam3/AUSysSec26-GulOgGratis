package atd.ag;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import atd.ae.ChallengeResultCancelled;
import java.security.NoSuchAlgorithmException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class ChallengeResult extends getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static final OAEPParameterSpec AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKReferenceNumber;
    private static long getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 + 97
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = atd.ag.ChallengeResult.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.ChallengeResult.$$g(byte, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getDeviceData = 0;
        getSDKEphemeralPublicKey = 1;
        getDeviceData();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getEdgeSlop();
        Object[] objArr = new Object[1];
        b((char) KeyEvent.keyCodeFromString(""), 7 - (ViewConfiguration.getTapTimeout() >> 16), 80 - TextUtils.lastIndexOf("", '0'), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((char) ((Process.getThreadPriority(0) + 20) >> 6), (KeyEvent.getMaxKeyCode() >> 16) + 4, TextUtils.indexOf("", "", 0) + 88, objArr2);
        AuthenticationRequestParameters = new OAEPParameterSpec(strIntern, ((String) objArr2[0]).intern(), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
        BuildConfig = (ChallengeResultCancelled + 47) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.ChallengeResult.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r30, int r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.ChallengeResult.b(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r0 = r6 + 2
            byte[] r1 = atd.ag.ChallengeResult.$$a
            int r8 = r8 + 101
            byte[] r0 = new byte[r0]
            int r6 = r6 + 1
            r2 = 0
            if (r1 != 0) goto L14
            r8 = r7
            r3 = r1
            r4 = r2
            r1 = r6
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2c:
            int r7 = -r7
            int r1 = r1 + r7
            int r7 = r1 + (-11)
            int r8 = r8 + 1
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.ChallengeResult.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 49
            int r6 = r6 + 4
            int r5 = r5 * 19
            int r0 = 50 - r5
            int r7 = r7 * 32
            int r7 = r7 + 65
            byte[] r1 = atd.ag.ChallengeResult.$$d
            byte[] r0 = new byte[r0]
            int r5 = 49 - r5
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r5
            r7 = r6
            r3 = r2
            goto L2e
        L19:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2e:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.ChallengeResult.d(byte, short, short, java.lang.Object[]):void");
    }

    public static void getDeviceData() {
        getSDKTransactionID = 8237235226916945552L;
        getSDKAppID = new char[]{62564, 20694, 48394, 6724, 26308, 50175, 10297, 30063, 53665, 16033, 39783, 59268, 19665, 43295, 63093, 21172, 6362, 48238, 20900, 63222, 35363, 12103, 50321, 39365, 15667, 53843, 30714, 2856, 41052, 17849, 6857, 48641, 62564, 20694, 48394, 6724, 26258, 50109, 10299, 30067, 53695, 16127, 39744, 59282, 19596, 43304, 63097, 21161, 49142, 1058, 24958, 62569, 20690, 48392, 6775, 26255, 50151, 10285, 30067, 53672, 16091, 39757, 59277, 19655, 62569, 20690, 48392, 6773, 26251, 50145, 10297, 30060, 53667, 16123, 39761, 59279, 19702, 43282, 63072, 21180, 49133, 62557, 20735, 48445, 6664, 26328, 50086, 10350, 62531, 20720, 48442, 6676};
        getSDKReferenceNumber = 919579494246863031L;
    }

    public static void init$0() {
        $$a = new byte[]{28, -116, 103, -92, -9, -26, 22, 4, -18, -20, -41, 6, -24, -16, 7, -13, -28, 0, -17, -10, 26, -6, 32, -34, 41, 0, -18, -19};
        $$b = 34;
    }

    public static void init$1() {
        $$d = new byte[]{69, 55, 70, -102, 19, -16, -54, 76, -76, 65, -1, -43, 44, -2, 3, -4, -7, 15, -11, 6, -1, -74, 29, 52, -1, -12, -3, 9, 6, -11, -6, -2, 19, -11, 6, -1, -28, 19, 12, 4, -16, 14, 1, -36, 17, 17, -17, 12, -8, 15, -15, 13, 1, 52, -1, -12, -3, 9, 6, -11, -6, -2, 19, -11, 6, -1, -28, 19, 12, 4, -16, 14, 1, -36, 17, 17, -17, 12, -8, 15, -15, 13, 1};
        $$e = 156;
    }

    public static void init$2() {
        $$c = new byte[]{95, 116, 104, 93};
        $$f = 10;
    }

    @Override // atd.ad.AuthenticationRequestParameters
    public final String AuthenticationRequestParameters() throws Throwable {
        getDeviceData = (getSDKEphemeralPublicKey + 67) % 128;
        Object[] objArr = new Object[1];
        a("\ue72a灰즏⅄멛\u13fe欟쑕嶍땹ໃ枧", 38747 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getSDKEphemeralPublicKey + 43;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x02ad, code lost:
    
        r0 = atd.e.ChallengeResult.getSDKTransactionID(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x02b1, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02b3, code lost:
    
        r0 = 2775 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
        r3 = (char) (13060 - android.widget.ExpandableListView.getPackedPositionType(0));
        r28 = 24 - android.graphics.ImageFormat.getBitsPerPixel(0);
        r5 = atd.ag.ChallengeResult.$$a;
        r7 = (byte) (-r5[r23]);
        r5 = r5[r16];
        r10 = new java.lang.Object[1];
        c(r7, r5, (byte) (r5 + 2), r10);
        r0 = atd.e.ChallengeResult.getDeviceData(r0, r3, r28, 1289043809, false, (java.lang.String) r10[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02f2, code lost:
    
        ((java.lang.reflect.Field) r0).set(null, r15);
        r0 = atd.e.ChallengeResult.getSDKTransactionID(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02fc, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02fe, code lost:
    
        r0 = (android.os.Process.myTid() >> 22) + 2774;
        r3 = (char) (13060 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
        r28 = 24 - android.text.TextUtils.lastIndexOf("", '0', 0, 0);
        r5 = atd.ag.ChallengeResult.$$a;
        r7 = (byte) (-r5[r23]);
        r5 = r5[r16];
        r10 = new java.lang.Object[1];
        c(r7, r5, (byte) (r5 + 2), r10);
        r0 = atd.e.ChallengeResult.getDeviceData(r0, r3, r28, 1289043809, false, (java.lang.String) r10[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0348, code lost:
    
        r3 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
        r0 = atd.e.ChallengeResult.getSDKTransactionID(1314787788);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x035b, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x035d, code lost:
    
        r0 = (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2774;
        r5 = (char) (android.view.MotionEvent.axisFromString("") + 13061);
        r28 = 25 - android.text.TextUtils.getCapsMode("", 0, 0);
        r7 = atd.ag.ChallengeResult.$$a;
        r9 = (byte) (r7[r16] + 1);
        r7 = (byte) (-r7[r19]);
        r12 = new java.lang.Object[1];
        c(r9, r7, (byte) (r7 + 3), r12);
        r0 = atd.e.ChallengeResult.getDeviceData(r0, r5, r28, -1841948708, false, (java.lang.String) r12[0], new java.lang.Class[]{r4, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x03a1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03a4, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r3)).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x065e, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0662, code lost:
    
        if (r1 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0664, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0665, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05b7  */
    @Override // atd.ag.getDeviceData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] getSDKReferenceNumber(atd.ah.AuthenticationRequestParameters r34, java.security.interfaces.RSAPublicKey r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.ChallengeResult.getSDKReferenceNumber(atd.ah.AuthenticationRequestParameters, java.security.interfaces.RSAPublicKey):byte[]");
    }

    private static atd.ah.AuthenticationRequestParameters getDeviceData(atd.ah.getDeviceData getdevicedata) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(getdevicedata.getSDKAppID());
            keyGenerator.init(getdevicedata.getSDKReferenceNumber());
            atd.ah.AuthenticationRequestParameters authenticationRequestParameters = new atd.ah.AuthenticationRequestParameters(keyGenerator.generateKey(), getdevicedata);
            getSDKEphemeralPublicKey = (getDeviceData + 89) % 128;
            return authenticationRequestParameters;
        } catch (NoSuchAlgorithmException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    @Override // atd.ag.BuildConfig
    public final atd.ah.AuthenticationRequestParameters AuthenticationRequestParameters(ChallengeResultCancelled challengeResultCancelled, atd.af.getSDKReferenceNumber getsdkreferencenumber) {
        int i11 = getSDKEphemeralPublicKey + 35;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            atd.af.getSDKReferenceNumber.getSDKReferenceNumber(getsdkreferencenumber, atd.af.getDeviceData.class);
            int i12 = 6 / 0;
            return getDeviceData(challengeResultCancelled.getDeviceData());
        }
        atd.af.getSDKReferenceNumber.getSDKReferenceNumber(getsdkreferencenumber, atd.af.getDeviceData.class);
        return getDeviceData(challengeResultCancelled.getDeviceData());
    }
}
