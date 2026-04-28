package atd.e;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultTimeout;
import com.braze.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/SdkIdentifier;", "", "Landroid/content/Context;", "context", "Lcom/adyen/threeds2/internal/persistence/PersistenceManager;", "persistenceManager", "<init>", "(Landroid/content/Context;Lcom/adyen/threeds2/internal/persistence/PersistenceManager;)V", "", "generateSdkAppId", "()Ljava/lang/String;", "Lcom/adyen/threeds2/internal/persistence/PersistenceManager;", "getSdkReferenceNumber", "sdkReferenceNumber", "getSdkAppId", "sdkAppId", "applicationContext", "Landroid/content/Context;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSdkIdentifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkIdentifier.kt\ncom/adyen/threeds2/internal/SdkIdentifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static final int BuildConfig = 0;
    private static final byte[] ChallengeResult = null;
    private static char[] ChallengeResultCancelled;
    private static int ChallengeResultTimeout;
    private static long getDeviceData;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKTransactionID;
    private static int getTransactionStatus;

    @NotNull
    private final Context getSDKAppID;

    @NotNull
    private final atd.an.getSDKTransactionID getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r7, int r8, int r9) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r9 = 110 - r9
            byte[] r0 = atd.e.getDeviceData.$$c
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r7
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L29:
            int r9 = -r9
            int r8 = r8 + 1
            int r9 = r9 + r0
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.$$e(byte, int, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getTransactionStatus = 0;
        ChallengeResultTimeout = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        ChallengeResult();
        getSDKAppID();
        getSDKTransactionID();
        getDeviceData();
        new getSDKAppID((byte) 0);
        int i11 = ChallengeResultTimeout + 99;
        getTransactionStatus = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public getDeviceData(@NotNull Context context, @NotNull atd.an.getSDKTransactionID getsdktransactionid) {
        context.getClass();
        getsdktransactionid.getClass();
        this.getSDKReferenceNumber = getsdktransactionid;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.getSDKAppID = applicationContext;
    }

    public static void ChallengeResult() {
        ChallengeResult = new byte[]{45, 58, -109, -84, -45, 50, 16, -64, 46, 21, 0, -3, 14, -9, 15, -2, -5, -4, -53, 54, 13, 0, 7, -14, 10, 7, -69, 69, -12, 15, PSSSigner.TRAILER_IMPLICIT, 20, 51, 1, -13, 16, -38, 21, 14, -12, 7, -1, 14, 2, -10, 10};
        BuildConfig = 115;
    }

    private final String ChallengeResultCancelled() throws Throwable {
        String strAuthenticationRequestParameters;
        atd.an.getSDKTransactionID getsdktransactionid;
        Context context;
        Object obj;
        int i11 = getSDKEphemeralPublicKey + 75;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            strAuthenticationRequestParameters = atd.bc.ChallengeResultCancelled.AuthenticationRequestParameters(UUID.randomUUID().toString());
            getsdktransactionid = this.getSDKReferenceNumber;
            context = this.getSDKAppID;
            Object[] objArr = new Object[1];
            d("\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true, new int[]{0, 31, 117, 0}, objArr);
            obj = objArr[0];
        } else {
            strAuthenticationRequestParameters = atd.bc.ChallengeResultCancelled.AuthenticationRequestParameters(UUID.randomUUID().toString());
            getsdktransactionid = this.getSDKReferenceNumber;
            context = this.getSDKAppID;
            Object[] objArr2 = new Object[1];
            d("\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 31, 117, 0}, objArr2);
            obj = objArr2[0];
        }
        getsdktransactionid.getSDKTransactionID(context, ((String) obj).intern(), strAuthenticationRequestParameters);
        strAuthenticationRequestParameters.getClass();
        int i12 = getMessageVersion + 31;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            return strAuthenticationRequestParameters;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r24, char r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.a(int, char, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 19
            byte[] r0 = atd.e.getDeviceData.$$a
            int r7 = r7 * 2
            int r7 = r7 + 65
            int r9 = 120 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-1)
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.b(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.e.getDeviceData.ChallengeResult
            int r8 = r8 * 14
            int r8 = r8 + 97
            int r1 = 32 - r6
            int r7 = 43 - r7
            byte[] r1 = new byte[r1]
            int r6 = 31 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r8 = r7
            r3 = r0
            r4 = r2
            r0 = r6
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r5
        L2d:
            int r0 = r0 + r7
            int r7 = r0 + (-1)
            int r8 = r8 + 1
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
    
        r0 = r0[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        r1 = new java.lang.Object[r17];
        r1[1] = java.lang.Integer.valueOf(r4);
        r1[0] = java.lang.Integer.valueOf(r0);
        r0 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0113, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0115, code lost:
    
        r12 = android.graphics.Color.red(0) + 3095;
        r13 = (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14367);
        r14 = 18 - android.view.View.MeasureSpec.getMode(0);
        r0 = (byte) (atd.e.getDeviceData.$$d - 1);
        r2 = r0;
        r0 = atd.e.ChallengeResult.getDeviceData(r12, r13, r14, -210991631, false, $$e(r0, r2, (byte) (r2 + 2)), new java.lang.Class[]{r11, r11});
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0151, code lost:
    
        r3[r5] = ((java.lang.Character) ((java.lang.reflect.Method) r0).invoke(null, r1)).charValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0153, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(java.lang.String r27, boolean r28, int[] r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.d(java.lang.String, boolean, int[], java.lang.Object[]):void");
    }

    public static void getDeviceData() {
        int i11 = getSDKEphemeralPublicKey;
        getDeviceData = -3604649219049779368L;
        getMessageVersion = (i11 + 91) % 128;
    }

    public static void getSDKAppID() {
        ChallengeResultCancelled = new char[]{63467, 63287, 63307, 63319, 63300, 63289, 63274, 63285, 63303, 63281, 63307, 63306, 63308, 63309, 63309, 63311, 63311, 63287, 63287, 63306, 63299, 63301, 63280, 63282, 63282, 63305, 63318, 63316, 63301, 63323, 63322};
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[PHI: r1
      0x003a: PHI (r1v6 int[]) = (r1v2 int[]), (r1v8 int[]) binds: [B:8:0x0035, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r1
      0x0037: PHI (r1v3 int[]) = (r1v2 int[]), (r1v8 int[]) binds: [B:8:0x0035, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.InputStream getSDKTransactionID(java.io.InputStream r11, int r12, int r13, int r14, byte[] r15) throws java.io.IOException {
        /*
            r10 = this;
            int r0 = atd.e.getDeviceData.getSDKEphemeralPublicKey
            int r1 = r0 + 95
            int r2 = r1 % 128
            atd.e.getDeviceData.getMessageVersion = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 1
            r5 = 0
            if (r1 != 0) goto L24
            r1 = 3
            int[] r1 = new int[r1]
            long r6 = atd.e.getDeviceData.getDeviceData
            r2 = 96
            long r8 = r6 >>> r2
            int r2 = (int) r8
            r2 = r2 ^ r14
            r1[r5] = r2
            int r2 = (int) r6
            r2 = r2 ^ r14
            r1[r5] = r2
            r2 = 19
            if (r12 > r2) goto L3a
            goto L37
        L24:
            int[] r1 = new int[r2]
            long r6 = atd.e.getDeviceData.getDeviceData
            r2 = 32
            long r8 = r6 >>> r2
            int r2 = (int) r8
            r2 = r2 ^ r14
            r1[r5] = r2
            int r2 = (int) r6
            r2 = r2 ^ r14
            r1[r3] = r2
            r2 = 6
            if (r12 > r2) goto L3a
        L37:
            r5 = r3
        L38:
            r2 = r1
            goto L41
        L3a:
            int r0 = r0 + 27
            int r0 = r0 % 128
            atd.e.getDeviceData.getMessageVersion = r0
            goto L38
        L41:
            atd.bb.BuildConfig r7 = new atd.bb.BuildConfig
            atd.bb.AuthenticationRequestParameters r0 = new atd.bb.AuthenticationRequestParameters
            r1 = r11
            r4 = r12
            r6 = r13
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.getSDKTransactionID(java.io.InputStream, int, int, int, byte[]):java.io.InputStream");
    }

    public static void init$0() {
        $$a = new byte[]{77, -47, 38, 84, -20, 15, 53, -76, 74, -20, -53, 0, 11, 2, -10, -7, 10, 5, 1, -20, 10, -7, 0, 27, -20, -13, -5, 15, -15, -2, 35, -18, -18, 16, -13, 7, -16, 14, -14, -2, 78, PSSSigner.TRAILER_IMPLICIT, 1, -16, 47, -34, -18, 12, 5, -3, 32, -30, -20, 18, 1, -16, 32, 14, -8, -10, -31, 16, -14, -6, 17, -3, -18, 10, -7, 0, 36, 4, -20, 15, 53, -77, 75, -66, 0, 42, -45, 1, -4, 3, 6, -16, 10, -7, 0, 73, -30, -53, 0, 11, 2, -10, -7, 10, 5, 1, -20, 10, -7, 0, 27, -20, -13, -5, 15, -15, -2, 35, -18, -18, 16, -13, 7, -16, 14, -14, -2, -53, 0, 11, 2, -10, -7, 10, 5, 1, -20, 10, -7, 0, 27, -20, -13, -5, 15, -15, -2, 35, -18, -18, 16, -13, 7, -16, 14, -14, -2};
        $$b = BERTags.PRIVATE;
    }

    public static void init$1() {
        $$c = new byte[]{33, -9, 12, -125};
        $$d = 1;
    }

    @NotNull
    public final String AuthenticationRequestParameters() throws Throwable {
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 16 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(16 - Color.green(0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 16198), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, objArr2);
        int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Object.class).invoke(null, this)).intValue();
        try {
            Object[] objArr3 = {new ArrayList()};
            byte[] bArr = $$a;
            byte b8 = bArr[33];
            byte b11 = bArr[50];
            Object[] objArr4 = new Object[1];
            b(b8, b11, (byte) (b11 | 85), objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            byte b12 = (byte) (bArr[53] + 1);
            byte b13 = bArr[11];
            Object[] objArr5 = new Object[1];
            b(b12, b13, (byte) (b13 | 67), objArr5);
            int iIntValue2 = ((Integer) cls2.getMethod((String) objArr5[0], List.class).invoke(null, objArr3)).intValue();
            int i11 = iIntValue2 ^ iIntValue;
            if (iIntValue2 != 0) {
                long j9 = ((long) (iIntValue ^ i11)) ^ 7070689227863752704L;
                getSDKEphemeralPublicKey = (getMessageVersion + 113) % 128;
                try {
                    Object[] objArr6 = {Long.valueOf(j9), 1646273125L};
                    Object[] objArr7 = new Object[1];
                    b(bArr[33], (byte) (-bArr[60]), (byte) 49, objArr7);
                    Class<?> cls3 = Class.forName((String) objArr7[0]);
                    byte b14 = bArr[11];
                    Object[] objArr8 = new Object[1];
                    b(b14, bArr[47], b14, objArr8);
                    String str = (String) objArr8[0];
                    Class cls4 = Long.TYPE;
                    cls3.getMethod(str, cls4, cls4).invoke(null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            AssetManager assets = this.getSDKAppID.getAssets();
            byte[] bArr2 = ChallengeResult;
            Object[] objArr9 = new Object[1];
            c((byte) 23, (byte) 39, bArr2[10], objArr9);
            String str2 = (String) objArr9[0];
            getMessageVersion = (getSDKEphemeralPublicKey + 125) % 128;
            try {
                byte b15 = bArr2[10];
                byte b16 = b15;
                Object[] objArr10 = new Object[1];
                c(b16, (byte) (b16 | 31), b15, objArr10);
                Class<?> cls5 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c((byte) (BuildConfig >>> 2), bArr2[10], bArr2[33], objArr11);
                InputStream sDKTransactionID = getSDKTransactionID((InputStream) cls5.getMethod((String) objArr11[0], String.class).invoke(assets, str2), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, 2 - TextUtils.getTrimmedLength(""), Gravity.getAbsoluteGravity(0, 0) - 540208982, new byte[]{95, -43, 109, 14, 8, -79, -96, 36});
                sDKTransactionID.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(sDKTransactionID, Charsets.UTF_8), 8192);
                try {
                    String strD = n.D(bufferedReader);
                    bufferedReader.close();
                    int i12 = getMessageVersion + 93;
                    getSDKEphemeralPublicKey = i12 % 128;
                    if (i12 % 2 == 0) {
                        return strD;
                    }
                    throw null;
                } finally {
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = atd.e.getDeviceData.getSDKEphemeralPublicKey
            int r0 = r0 + 65
            int r1 = r0 % 128
            atd.e.getDeviceData.getMessageVersion = r1
            int r0 = r0 % 2
            atd.an.getSDKTransactionID r1 = r7.getSDKReferenceNumber
            r2 = 117(0x75, float:1.64E-43)
            r3 = 31
            java.lang.String r4 = "\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001"
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L30
            android.content.Context r0 = r7.getSDKAppID
            int[] r2 = new int[]{r6, r3, r2, r6}
            java.lang.Object[] r3 = new java.lang.Object[r5]
            d(r4, r5, r2, r3)
            r2 = r3[r6]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r0 = r1.getSDKReferenceNumber(r0, r2)
            if (r0 != 0) goto L55
            goto L49
        L30:
            android.content.Context r0 = r7.getSDKAppID
            int[] r2 = new int[]{r6, r3, r2, r6}
            java.lang.Object[] r3 = new java.lang.Object[r5]
            d(r4, r6, r2, r3)
            r2 = r3[r6]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r0 = r1.getSDKReferenceNumber(r0, r2)
            if (r0 != 0) goto L55
        L49:
            int r0 = atd.e.getDeviceData.getSDKEphemeralPublicKey
            int r0 = r0 + 95
            int r0 = r0 % 128
            atd.e.getDeviceData.getMessageVersion = r0
            java.lang.String r0 = r7.ChallengeResultCancelled()
        L55:
            java.lang.String r0 = atd.bc.ChallengeResultCancelled.getSDKAppID(r0)
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.getSDKReferenceNumber():java.lang.String");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/adyen/threeds2/internal/SdkIdentifier$Companion;", "", "<init>", "()V", "SDK_APP_ID_KEY", "", "SDK_REFERENCE_NUMBER_FILE_NAME", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static boolean getDeviceData;
        private static boolean getSDKAppID;
        private static int getSDKEphemeralPublicKey;
        private static int getSDKReferenceNumber;
        private static char[] getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r6, int r7, int r8) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r6 = r6 * 3
                int r6 = 1 - r6
                int r8 = r8 * 4
                int r8 = r8 + 111
                byte[] r0 = atd.e.getDeviceData.getSDKAppID.$$c
                byte[] r1 = new byte[r6]
                r2 = 0
                r3 = r8
                if (r0 != 0) goto L17
                r5 = r2
                r8 = r7
                goto L29
            L17:
                r8 = r7
                r7 = r3
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                r3 = r0[r8]
            L29:
                int r3 = -r3
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.getSDKAppID.$$e(byte, int, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKReferenceNumber = 0;
            getSDKEphemeralPublicKey = 1;
            getSDKTransactionID = new char[]{21679, 21720, 21714, 21724, 21721, 21719, 21656, 21677, 21698, 21715, 21645, 21702, 21713, 21647, 21726, 21722, 21687, 21712, 21723, 21725, 21657, 21717, 21659, 21676, 21699, 21663};
            AuthenticationRequestParameters = 1286296654;
            getDeviceData = true;
            getSDKAppID = true;
        }

        private getSDKAppID() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] AuthenticationRequestParameters(android.content.Context r34, int r35, int r36, int r37) {
            /*
                Method dump skipped, instruction units count: 2144
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.getSDKAppID.AuthenticationRequestParameters(android.content.Context, int, int, int):java.lang.Object[]");
        }

        private static void a(String str, int i11, int[] iArr, String str2, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            String str3 = str2;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr = (byte[]) bytes;
            if (str != null) {
                int i13 = $10 + 21;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
            char[] cArr2 = getSDKTransactionID;
            Class cls = Integer.TYPE;
            int i14 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                $10 = ($11 + 5) % 128;
                int i15 = 0;
                while (i15 < length) {
                    $11 = ($10 + 67) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i15])};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            byte b8 = (byte) i14;
                            byte b11 = b8;
                            sDKTransactionID = ChallengeResult.getDeviceData(Color.red(i14) + 2555, (char) (Color.blue(i14) + 48598), Color.alpha(i14) + 31, -390605202, false, $$e(b8, b11, b11), new Class[]{cls});
                        }
                        cArr3[i15] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i15++;
                        i14 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
            Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1144184369);
            float f11 = 0.0f;
            if (sDKTransactionID2 == null) {
                sDKTransactionID2 = ChallengeResult.getDeviceData((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 146, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 32 - (ViewConfiguration.getTouchSlop() >> 8), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
            int i16 = 1124287645;
            if (getSDKAppID) {
                int length2 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length2;
                char[] cArr4 = new char[length2];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i17 = challengeResultTimeout.getSDKAppID;
                    int i18 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i17 >= i18) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i17] = (char) (cArr2[bArr[(i18 - 1) - i17] + i11] - iIntValue);
                    Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(i16);
                    if (sDKTransactionID3 == null) {
                        i12 = i16;
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        sDKTransactionID3 = ChallengeResult.getDeviceData((TypedValue.complexToFloat(0) > f11 ? 1 : (TypedValue.complexToFloat(0) == f11 ? 0 : -1)) + 1697, (char) ExpandableListView.getPackedPositionGroup(0L), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, -1620360563, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                    } else {
                        i12 = i16;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    i16 = i12;
                    f11 = 0.0f;
                }
            } else if (getDeviceData) {
                int length3 = cArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                char[] cArr5 = new char[length3];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i19 = challengeResultTimeout.getSDKAppID;
                    int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i19 >= i21) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    cArr5[i19] = (char) (cArr2[cArr[(i21 - 1) - i19] - i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        sDKTransactionID4 = ChallengeResult.getDeviceData(1697 - View.MeasureSpec.getMode(0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 29, -1620360563, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                }
            } else {
                int length4 = iArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                char[] cArr6 = new char[length4];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i22 = challengeResultTimeout.getSDKAppID;
                    int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i22 >= i23) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[i22] = (char) (cArr2[iArr[(i23 - 1) - i22] - i11] - iIntValue);
                        challengeResultTimeout.getSDKAppID = i22 + 1;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = 34 - r6
                byte[] r0 = atd.e.getDeviceData.getSDKAppID.$$a
                int r8 = r8 + 101
                int r7 = r7 + 2
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r8 = r6
                r3 = r0
                r4 = r2
                r0 = r7
                goto L2c
            L12:
                r3 = r2
            L13:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r0
                r0 = r5
            L2c:
                int r0 = r0 + r6
                int r6 = r0 + (-2)
                r0 = r8
                r8 = r6
                r6 = r0
                r0 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.e.getDeviceData.getSDKAppID.b(byte, byte, byte, java.lang.Object[]):void");
        }

        public static void init$0() {
            $$a = new byte[]{5, 67, -107, -2, 0, 17, -31, -13, 9, -8, 49, 2, -37, -3, 0, 17, -31, -13, 9, 11, 32, -15, 15, 7, -16, 4, 19, -9, 8, 1, -35, -3, 3, -3, 3, -50};
            $$b = 161;
        }

        public static void init$1() {
            $$c = new byte[]{63, -107, 81, -105};
            $$d = 100;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public static void getSDKTransactionID() {
        int i11 = getMessageVersion;
        AuthenticationRequestParameters = new char[]{62564, 57989, 55724, 45265, 44936, 34544, 32019, 21510, 17209, 14874, 4473, 2169, 59013, 56728, 46247, 41941, 52001, 56774, 59129, 36760, 37012, 47539, 16960, 27479, 31824, 1299, 11807, 14126, 55795, 58053, 35808, 40091};
        getSDKTransactionID = -7522445908211211548L;
        int i12 = i11 + 73;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }
}
