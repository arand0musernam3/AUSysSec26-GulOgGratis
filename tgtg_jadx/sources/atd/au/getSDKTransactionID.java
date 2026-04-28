package atd.au;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultKt;
import com.adyen.threeds2.R;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import kotlin.jvm.internal.ByteCompanionObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKTransactionID extends getDeviceData<atd.c.ChallengeResult, atd.ax.AuthenticationRequestParameters> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    static final Charset getSDKReferenceNumber;
    private static long getSDKTransactionID;
    private final WebView getSDKAppID;

    private static String $$c(byte b8, short s7, short s8) {
        byte[] bArr = $$a;
        int i11 = 99 - (s8 * 2);
        int i12 = b8 * 4;
        int i13 = 4 - (s7 * 2);
        byte[] bArr2 = new byte[1 - i12];
        int i14 = 0 - i12;
        int i15 = -1;
        if (bArr == null) {
            i11 = (-i13) + i11;
            i13++;
            bArr = bArr;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr2[i16] = (byte) i11;
            if (i16 == i14) {
                return new String(bArr2, 0);
            }
            int i17 = i11;
            byte[] bArr3 = bArr;
            i11 = (-bArr[i13]) + i17;
            i13++;
            bArr = bArr3;
            i15 = i16;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getTouchSlop();
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        MotionEvent.axisFromString("");
        Process.myPid();
        getSDKReferenceNumber = atd.e.getSDKAppID.getSDKAppID;
        getSDKEphemeralPublicKey = (getMessageVersion + 59) % 128;
    }

    public getSDKTransactionID(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        WebView webView = (WebView) findViewById(R.id.webView_htmlChallengeContainer);
        this.getSDKAppID = webView;
        webView.getSettings().setJavaScriptEnabled(false);
        webView.setWebViewClient(new C0002getSDKTransactionID());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKTransactionID.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getDeviceData(java.lang.String r14) throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = atd.au.getSDKTransactionID.AuthenticationRequestParameters
            int r0 = r0 + 91
            int r1 = r0 % 128
            atd.au.getSDKTransactionID.getDeviceData = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L17
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r2 = 39
            int r2 = r2 / r1
            if (r0 != 0) goto Lb8
            goto L1d
        L17:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto Lb8
        L1d:
            int r0 = atd.au.getSDKTransactionID.AuthenticationRequestParameters
            int r0 = r0 + 61
            int r2 = r0 % 128
            atd.au.getSDKTransactionID.getDeviceData = r2
            int r0 = r0 % 2
            r2 = 1
            r3 = 0
            java.lang.String r5 = "\uec19쓝붿陦伖\u202cᣧ\uf1d3ꪩ茫琟\u2d29\u05f9ﻝힹ补慘娼㊪\uebd7\udcbd땲渎䝶"
            if (r0 != 0) goto L79
            atd.bc.getSDKReferenceNumber r0 = atd.bc.getSDKReferenceNumber.getSDKTransactionID()
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r14}
            int r9 = atd.n.getSDKAppID.getSDKReferenceNumber.getDeviceData()
            int r8 = atd.n.getSDKAppID.getSDKReferenceNumber.getDeviceData()
            int r10 = atd.n.getSDKAppID.getSDKReferenceNumber.getDeviceData()
            int r11 = atd.n.getSDKAppID.getSDKReferenceNumber.getDeviceData()
            r6 = 106455532(0x65861ec, float:4.0697026E-35)
            r12 = -106455530(0xfffffffff9a79e16, float:-1.0878999E35)
            java.lang.Object r14 = atd.bc.getSDKReferenceNumber.getSDKReferenceNumber(r6, r7, r8, r9, r10, r11, r12)
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            android.webkit.WebView r6 = r13.getSDKAppID
            long r9 = android.os.Process.getElapsedCpuTime()
            int r14 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r0 = 5159(0x1427, float:7.229E-42)
            int r14 = r0 >>> r14
            java.lang.Object[] r0 = new java.lang.Object[r2]
            a(r5, r14, r0)
            r14 = r0[r1]
        L66:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r9 = r14.intern()
            java.nio.charset.Charset r14 = atd.au.getSDKTransactionID.getSDKReferenceNumber
            java.lang.String r10 = r14.toString()
            r11 = 0
            java.lang.String r7 = ""
            r6.loadDataWithBaseURL(r7, r8, r9, r10, r11)
            goto Lb0
        L79:
            atd.bc.getSDKReferenceNumber r0 = atd.bc.getSDKReferenceNumber.getSDKTransactionID()
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r14}
            int r9 = atd.n.getSDKAppID.getSDKReferenceNumber.getDeviceData()
            int r8 = atd.n.getSDKAppID.getSDKReferenceNumber.getDeviceData()
            int r10 = atd.n.getSDKAppID.getSDKReferenceNumber.getDeviceData()
            int r11 = atd.n.getSDKAppID.getSDKReferenceNumber.getDeviceData()
            r6 = 106455532(0x65861ec, float:4.0697026E-35)
            r12 = -106455530(0xfffffffff9a79e16, float:-1.0878999E35)
            java.lang.Object r14 = atd.bc.getSDKReferenceNumber.getSDKReferenceNumber(r6, r7, r8, r9, r10, r11, r12)
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            android.webkit.WebView r6 = r13.getSDKAppID
            long r9 = android.os.Process.getElapsedCpuTime()
            int r14 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            int r14 = r14 + 10452
            java.lang.Object[] r0 = new java.lang.Object[r2]
            a(r5, r14, r0)
            r14 = r0[r1]
            goto L66
        Lb0:
            int r14 = atd.au.getSDKTransactionID.AuthenticationRequestParameters
            int r14 = r14 + 83
            int r14 = r14 % 128
            atd.au.getSDKTransactionID.getDeviceData = r14
        Lb8:
            int r14 = atd.au.getSDKTransactionID.AuthenticationRequestParameters
            int r14 = r14 + 89
            int r0 = r14 % 128
            atd.au.getSDKTransactionID.getDeviceData = r0
            int r14 = r14 % 2
            if (r14 == 0) goto Lc5
            return
        Lc5:
            r14 = 0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKTransactionID.getDeviceData(java.lang.String):void");
    }

    public static void init$0() {
        $$a = new byte[]{126, 54, -127, -24};
        $$b = 101;
    }

    @Override // atd.au.getDeviceData
    public final int AuthenticationRequestParameters() {
        int i11;
        int i12 = getDeviceData + 69;
        int i13 = i12 % 128;
        AuthenticationRequestParameters = i13;
        if (i12 % 2 != 0) {
            i11 = R.layout.a3ds2_view_challenge_html_container;
            int i14 = 90 / 0;
        } else {
            i11 = R.layout.a3ds2_view_challenge_html_container;
        }
        int i15 = i13 + 43;
        getDeviceData = i15 % 128;
        if (i15 % 2 != 0) {
            return i11;
        }
        throw null;
    }

    public final void getSDKAppID(atd.c.ChallengeResult challengeResult) {
        AuthenticationRequestParameters = (getDeviceData + 113) % 128;
        getDeviceData(challengeResult.getSDKAppID());
        int i11 = AuthenticationRequestParameters + 67;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 84 / 0;
        }
    }

    public final void getSDKReferenceNumber(atd.c.ChallengeResult challengeResult) {
        int i11 = AuthenticationRequestParameters + 97;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            getDeviceData(challengeResult.getSDKReferenceNumber());
        } else {
            getDeviceData(challengeResult.getSDKReferenceNumber());
            int i12 = 36 / 0;
        }
    }

    public getSDKTransactionID(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getSDKTransactionID(Context context) {
        this(context, null);
    }

    public static void getSDKReferenceNumber() {
        getSDKTransactionID = 3318408916102804869L;
    }

    /* JADX INFO: renamed from: atd.au.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public final class C0002getSDKTransactionID extends WebViewClient {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static short[] BuildConfig;
        private static int ChallengeResult;
        private static char ChallengeResultCancelled;
        private static byte[] getDeviceData;
        private static int getMessageVersion;
        private static int getSDKAppID;
        private static char[] getSDKEphemeralPublicKey;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r7, byte r8, short r9) {
            /*
                int r7 = r7 + 65
                byte[] r0 = atd.au.getSDKTransactionID.C0002getSDKTransactionID.$$c
                int r8 = r8 + 4
                int r9 = r9 * 4
                int r9 = 1 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L13
                r7 = r8
                r3 = r9
                r5 = r2
                goto L28
            L13:
                r3 = r2
            L14:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r6
            L28:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKTransactionID.C0002getSDKTransactionID.$$e(short, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            ChallengeResult = 0;
            getMessageVersion = 1;
            getSDKAppID = -1238111999;
            AuthenticationRequestParameters = 829166694;
            getSDKTransactionID = 1610018052;
            getDeviceData = new byte[]{-13, -30, -12, -56, -57, 31, 9, -64, -77, -93, -61, 98, 22, -81, -77, 116, 6, -54, -3, -84, -106, -100, 18, 120, 98, -26, 100, 101, -43, 101, -34, -41, 101, 33, 50, -60, 65, 121, 109, 100, -34, 120, -92, 106, 121, 31, 102, 103, 30, 32, -69, 28, 96, -39, -82, 118, 16, 32, -76, -37, 73, 114, 100, 44, -77, 30, 118, 107, 20, 112, 107, 22, -36, 115, -74, 98, 103, 102, 11, -16, 21, 81, 126, 73, 4, 91, 25, 126, 19, 99, 75, 23, -51, 119, 89, 73, 75, 24, 11, -123, 72, 29, 67, -19, -80, -66, 30, -73, -72, 13, -80, 97, 94, 2, -73, 13, -125, 28, -78, 110, 94, 11, -24, 109, -116, 106, 94, -111, 36, -125, -2, 117, 100, 101, 106, -71, 113, -70, -64, 16, 15, 15, 114, 67, 24, 118, 11, 20, 126, 13, 64, 31, 57, 85, 68, 8, 11, 15, 114, 67, -56, 85, ByteCompanionObject.MAX_VALUE, 30, 64, 12, 56, 78, 10, 122, 65, 16, 71, 1, -127, 71, 11, -55, -7, -27, -17, -8, -9, -31, -1, -20, -24, -16, -16, -107, -28, -12, -35, -79, -19, -99, -22, -5, -24, 42, -86, -24, -20, 50, -70, -30, -21, -16, 55};
            getSDKEphemeralPublicKey = new char[]{19796, 30882, 19806, 19805, 30900, 30897, 30881, 30887, 30890, 30848, 30850, 19800, 30898, 19803, 30883, 30891, 30894, 30884, 30953, 30902, 30965, 30893, 30895, 19801, 19802, 30967, 30901, 19797, 30911, 30885, 19807, 30888, 30896, 30899, 30889, 30873};
            ChallengeResultCancelled = (char) 19802;
        }

        public C0002getSDKTransactionID() {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01b2 A[PHI: r7
          0x01b2: PHI (r7v7 int) = (r7v6 int), (r7v15 int) binds: [B:45:0x01b0, B:42:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01b5 A[PHI: r7
          0x01b5: PHI (r7v12 int) = (r7v6 int), (r7v15 int) binds: [B:45:0x01b0, B:42:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r31, int r32, int r33, byte r34, short r35, java.lang.Object[] r36) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 682
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKTransactionID.C0002getSDKTransactionID.a(int, int, int, byte, short, java.lang.Object[]):void");
        }

        private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
            int i12;
            int i13;
            char c3;
            char c7;
            char c8;
            char c11;
            int i14;
            char[] charArray = str != null ? str.toCharArray() : str;
            ChallengeResultKt challengeResultKt = new ChallengeResultKt();
            char[] cArr = getSDKEphemeralPublicKey;
            Class cls = Integer.TYPE;
            int i15 = -317146529;
            int i16 = -1;
            int i17 = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i15);
                        if (sDKTransactionID == null) {
                            byte b11 = (byte) 0;
                            i14 = i15;
                            byte b12 = (byte) (b11 - 1);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2158 - Color.blue(0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + i16), 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 829471823, false, $$e(b11, b12, (byte) (b12 + 1)), new Class[]{cls});
                        } else {
                            i14 = i15;
                        }
                        cArr2[i18] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i18++;
                        i15 = i14;
                        i16 = -1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            int i19 = i15;
            Object[] objArr3 = {Integer.valueOf(ChallengeResultCancelled)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i19);
            char c12 = '\b';
            if (sDKTransactionID2 == null) {
                byte b13 = (byte) 0;
                byte b14 = (byte) (b13 - 1);
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2158 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36, 829471823, false, $$e(b13, b14, (byte) (b14 + 1)), new Class[]{cls});
            }
            char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i11];
            if (i11 % 2 != 0) {
                $11 = ($10 + 87) % 128;
                i12 = i11 - 1;
                cArr3[i12] = (char) (charArray[i12] - b8);
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                challengeResultKt.getSDKReferenceNumber = 0;
                while (true) {
                    int i21 = challengeResultKt.getSDKReferenceNumber;
                    if (i21 >= i12) {
                        break;
                    }
                    char c13 = charArray[i21];
                    challengeResultKt.getDeviceData = c13;
                    char c14 = charArray[i21 + 1];
                    challengeResultKt.getSDKAppID = c14;
                    if (c13 == c14) {
                        $11 = ($10 + 23) % 128;
                        cArr3[i21] = (char) (c13 - b8);
                        cArr3[i21 + 1] = (char) (c14 - b8);
                        i13 = i17;
                        c3 = c12;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = challengeResultKt;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = challengeResultKt;
                        objArr4[9] = challengeResultKt;
                        objArr4[c12] = Integer.valueOf(cCharValue);
                        objArr4[7] = challengeResultKt;
                        objArr4[6] = challengeResultKt;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = challengeResultKt;
                        objArr4[3] = challengeResultKt;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = challengeResultKt;
                        objArr4[i17] = challengeResultKt;
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                        if (sDKTransactionID3 == null) {
                            i13 = i17;
                            int iRed = Color.red(i13) + 1258;
                            c3 = c12;
                            char gidForName = (char) (Process.getGidForName("") + 34415);
                            int iGreen = 41 - Color.green(i13);
                            c7 = '\n';
                            byte b15 = (byte) ($$d & 3);
                            c8 = 2;
                            byte b16 = (byte) (b15 - 3);
                            c11 = '\t';
                            String str$$e = $$e(b15, b16, (byte) (b16 + 1));
                            Class cls2 = Integer.TYPE;
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iRed, gidForName, iGreen, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            i13 = i17;
                            c3 = c12;
                            c7 = '\n';
                            c8 = 2;
                            c11 = '\t';
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                        int i22 = challengeResultKt.ChallengeResultCancelled;
                        if (iIntValue == i22) {
                            Object[] objArr5 = new Object[11];
                            objArr5[c7] = challengeResultKt;
                            objArr5[c11] = Integer.valueOf(cCharValue);
                            objArr5[c3] = challengeResultKt;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = challengeResultKt;
                            objArr5[4] = challengeResultKt;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[c8] = Integer.valueOf(cCharValue);
                            objArr5[1] = challengeResultKt;
                            objArr5[i13] = challengeResultKt;
                            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                            if (sDKTransactionID4 == null) {
                                int jumpTapTimeout = 2223 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                char fadingEdgeLength = (char) (53070 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                int size = 21 - View.MeasureSpec.getSize(i13);
                                byte b17 = (byte) (-1);
                                String str$$e2 = $$e((byte) 57, b17, (byte) (b17 + 1));
                                Class cls3 = Integer.TYPE;
                                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(jumpTapTimeout, fadingEdgeLength, size, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                            int i23 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                            int i24 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i24] = cArr[iIntValue2];
                            cArr3[i24 + 1] = cArr[i23];
                        } else {
                            int i25 = challengeResultKt.AuthenticationRequestParameters;
                            int i26 = challengeResultKt.getSDKTransactionID;
                            int i27 = challengeResultKt.getMessageVersion;
                            if (i25 == i26) {
                                int iC = k.c(i27, cCharValue, 1, cCharValue);
                                challengeResultKt.getMessageVersion = iC;
                                int iC2 = k.c(i22, cCharValue, 1, cCharValue);
                                challengeResultKt.ChallengeResultCancelled = iC2;
                                int i28 = (i26 * cCharValue) + iC2;
                                int i29 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i29] = cArr[(i25 * cCharValue) + iC];
                                cArr3[i29 + 1] = cArr[i28];
                            } else {
                                int i31 = (i25 * cCharValue) + i22;
                                int i32 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i32] = cArr[i31];
                                cArr3[i32 + 1] = cArr[(i26 * cCharValue) + i27];
                            }
                        }
                    }
                    challengeResultKt.getSDKReferenceNumber += 2;
                    $10 = ($11 + 49) % 128;
                    i17 = i13;
                    c12 = c3;
                }
            }
            int i33 = i17;
            for (int i34 = i33; i34 < i11; i34++) {
                cArr3[i34] = (char) (cArr3[i34] ^ 13722);
            }
            objArr[i33] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(int r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 3
                int r5 = 4 - r5
                int r7 = r7 * 4
                int r7 = 104 - r7
                int r6 = r6 * 4
                int r6 = r6 + 4
                byte[] r0 = atd.au.getSDKTransactionID.C0002getSDKTransactionID.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                r4 = r0[r5]
            L28:
                int r4 = -r4
                int r5 = r5 + 1
                int r7 = r7 + r4
                int r7 = r7 + (-2)
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKTransactionID.C0002getSDKTransactionID.c(int, int, int, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(int r34, int r35) {
            /*
                Method dump skipped, instruction units count: 1523
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKTransactionID.C0002getSDKTransactionID.getDeviceData(int, int):java.lang.Object[]");
        }

        private static WebResourceResponse getSDKReferenceNumber(String str) throws Throwable {
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.getMode(0) - 1855649971, (-70) - ExpandableListView.getPackedPositionGroup(0L), 2023752492 - ImageFormat.getBitsPerPixel(0), (byte) (98 - View.resolveSizeAndState(0, 0, 0)), (short) (51 - Color.red(0)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Charset charset = getSDKTransactionID.getSDKReferenceNumber;
            WebResourceResponse webResourceResponse = new WebResourceResponse(strIntern, charset.toString(), new ByteArrayInputStream(str.getBytes(charset)));
            int i11 = ChallengeResult + 3;
            getMessageVersion = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 49 / 0;
            }
            return webResourceResponse;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private android.webkit.WebResourceResponse getSDKTransactionID(android.net.Uri r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKTransactionID.C0002getSDKTransactionID.getSDKTransactionID(android.net.Uri):android.webkit.WebResourceResponse");
        }

        public static void init$0() {
            $$a = new byte[]{27, 20, 100, 39, -3, 3, -3};
            $$b = 88;
        }

        public static void init$1() {
            $$c = new byte[]{35, 23, 10, 49};
            $$d = 78;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) throws Throwable {
            int i11 = ChallengeResult + 51;
            getMessageVersion = i11 % 128;
            try {
                if (i11 % 2 == 0) {
                    getSDKTransactionID(Uri.parse(str));
                    throw null;
                }
                WebResourceResponse sDKTransactionID = getSDKTransactionID(Uri.parse(str));
                getMessageVersion = (ChallengeResult + 125) % 128;
                return sDKTransactionID;
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr = new Object[1];
                a(MotionEvent.axisFromString("") - 1855650019, Process.getGidForName("") - 69, (ViewConfiguration.getWindowTouchSlop() >> 8) + 2023752414, (byte) (84 - ((byte) KeyEvent.getModifierMetaStateMask())), (short) ((-60) - Gravity.getAbsoluteGravity(0, 0)), objArr);
                sb2.append(((String) objArr[0]).intern());
                sb2.append(str);
                return getSDKReferenceNumber(sb2.toString());
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws Throwable {
            ChallengeResult = (getMessageVersion + 41) % 128;
            WebResourceResponse sDKTransactionID = getSDKTransactionID(webResourceRequest.getUrl());
            int i11 = ChallengeResult + 31;
            getMessageVersion = i11 % 128;
            if (i11 % 2 != 0) {
                return sDKTransactionID;
            }
            throw null;
        }
    }
}
