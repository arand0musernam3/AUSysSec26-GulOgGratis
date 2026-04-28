package atd.ab;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.as.getSDKEphemeralPublicKey;
import atd.bb.ChallengeResultKt;
import atd.e.ChallengeResult;
import com.adyen.threeds2.ErrorMessage;
import com.adyen.threeds2.ProtocolErrorEvent;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/event/ProtocolErrorEventImpl;", "Lcom/adyen/threeds2/ProtocolErrorEvent;", "sdkTransactionID", "", "errorMessage", "Lcom/adyen/threeds2/ErrorMessage;", "additionalDetails", "<init>", "(Ljava/lang/String;Lcom/adyen/threeds2/ErrorMessage;Ljava/lang/String;)V", "toString", "getSDKTransactionID", "getErrorMessage", "getAdditionalDetails", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID implements ProtocolErrorEvent {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static char getSDKAppID;
    private static char[] getSDKReferenceNumber;

    @Nullable
    private final String AuthenticationRequestParameters;

    @NotNull
    private final String getDeviceData;

    @NotNull
    private final ErrorMessage getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r6, int r7, int r8) {
        /*
            int r6 = r6 + 65
            byte[] r0 = atd.ab.getSDKAppID.$$c
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r4 = r2
            r0 = r8
            r8 = r7
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r0
            r0 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ab.getSDKAppID.$$e(short, int, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ChallengeResult = 0;
        BuildConfig = 1;
        getSDKReferenceNumber = new char[]{19802, 19807, 30888, 30950, 19800, 30898, 30883, 30893, 30889, 30859, 30900, 30887, 19805, 30924, 30866, 30863, 19803, 30972, 30895, 19801, 30901, 19806, 30885, 30882, 30881};
        getSDKAppID = (char) 19801;
    }

    public getSDKAppID(@Nullable String str, @NotNull ErrorMessage errorMessage, @NotNull String str2) {
        errorMessage.getClass();
        str2.getClass();
        this.AuthenticationRequestParameters = str;
        this.getSDKTransactionID = errorMessage;
        this.getDeviceData = str2;
    }

    private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
        int i12;
        char c3;
        char c7;
        char c8;
        char c11;
        char c12;
        long j9;
        int i13;
        int i14 = $10 + 15;
        $11 = i14 % 128;
        char c13 = 2;
        if (i14 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        char[] cArr = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        long j11 = 0;
        int i15 = -317146529;
        int i16 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i17])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(i15);
                    if (sDKTransactionID == null) {
                        c12 = c13;
                        j9 = j11;
                        byte b11 = (byte) i16;
                        i13 = i15;
                        byte b12 = b11;
                        sDKTransactionID = ChallengeResult.getDeviceData(2159 - (SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1)), (char) View.MeasureSpec.getSize(i16), TextUtils.indexOf("", "", i16) + 36, 829471823, false, $$e(b11, b12, b12), new Class[]{cls});
                    } else {
                        c12 = c13;
                        j9 = j11;
                        i13 = i15;
                    }
                    cArr2[i17] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i17++;
                    i15 = i13;
                    c13 = c12;
                    j11 = j9;
                    i16 = 0;
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
        char c14 = c13;
        long j12 = j11;
        int i18 = i15;
        Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i18);
        if (sDKTransactionID2 == null) {
            byte b13 = (byte) 0;
            byte b14 = b13;
            sDKTransactionID2 = ChallengeResult.getDeviceData(2157 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 37 - (Process.getElapsedCpuTime() > j12 ? 1 : (Process.getElapsedCpuTime() == j12 ? 0 : -1)), 829471823, false, $$e(b13, b14, b14), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr3[i12] = (char) (charArray[i12] - b8);
            $10 = ($11 + 77) % 128;
        } else {
            i12 = i11;
        }
        char c15 = 3;
        if (i12 > 1) {
            $10 = ($11 + 81) % 128;
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i19 = challengeResultKt.getSDKReferenceNumber;
                if (i19 >= i12) {
                    break;
                }
                char c16 = charArray[i19];
                challengeResultKt.getDeviceData = c16;
                char c17 = charArray[i19 + 1];
                challengeResultKt.getSDKAppID = c17;
                if (c16 == c17) {
                    $11 = ($10 + 33) % 128;
                    cArr3[i19] = (char) (c16 - b8);
                    cArr3[i19 + 1] = (char) (c17 - b8);
                    c3 = c15;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[6] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[c15] = challengeResultKt;
                    objArr4[c14] = Integer.valueOf(cCharValue);
                    objArr4[1] = challengeResultKt;
                    objArr4[0] = challengeResultKt;
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c3 = c15;
                        int i21 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1258;
                        char maximumFlingVelocity = (char) (34414 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int iMyPid = 41 - (Process.myPid() >> 22);
                        c7 = '\n';
                        byte b15 = (byte) ($$d & 2);
                        c8 = '\t';
                        byte b16 = (byte) (b15 - 2);
                        c11 = 7;
                        String str$$e = $$e(b15, b16, b16);
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = ChallengeResult.getDeviceData(i21, maximumFlingVelocity, iMyPid, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c3 = c15;
                        c7 = '\n';
                        c8 = '\t';
                        c11 = 7;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i22 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i22) {
                        Object[] objArr5 = new Object[11];
                        objArr5[c7] = challengeResultKt;
                        objArr5[c8] = Integer.valueOf(cCharValue);
                        objArr5[8] = challengeResultKt;
                        objArr5[c11] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[c3] = Integer.valueOf(cCharValue);
                        objArr5[c14] = Integer.valueOf(cCharValue);
                        objArr5[1] = challengeResultKt;
                        objArr5[0] = challengeResultKt;
                        Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int doubleTapTimeout = 2223 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            char c18 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 53070);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 21;
                            byte b17 = (byte) 0;
                            String str$$e2 = $$e((byte) ($$c[c3] + 1), b17, b17);
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = ChallengeResult.getDeviceData(doubleTapTimeout, c18, threadPriority, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i23 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i24 = challengeResultKt.getSDKReferenceNumber;
                        cArr3[i24] = cArr[iIntValue2];
                        cArr3[i24 + 1] = cArr[i23];
                    } else {
                        int i25 = challengeResultKt.AuthenticationRequestParameters;
                        int i26 = challengeResultKt.getSDKTransactionID;
                        if (i25 == i26) {
                            int i27 = ($10 + 13) % 128;
                            $11 = i27;
                            int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, 1, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i22, cCharValue, 1, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i28 = (i26 * cCharValue) + iC2;
                            int i29 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i29] = cArr[(i25 * cCharValue) + iC];
                            cArr3[i29 + 1] = cArr[i28];
                            $10 = (i27 + 87) % 128;
                        } else {
                            int i31 = (i25 * cCharValue) + i22;
                            int i32 = (i26 * cCharValue) + challengeResultKt.getMessageVersion;
                            int i33 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i33] = cArr[i31];
                            cArr3[i33 + 1] = cArr[i32];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                c15 = c3;
            }
        }
        int i34 = 0;
        while (i34 < i11) {
            cArr3[i34] = (char) (cArr3[i34] ^ 13722);
            i34++;
            $10 = ($11 + 3) % 128;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 25
            int r7 = 28 - r7
            int r9 = r9 * 15
            int r9 = 26 - r9
            int r8 = r8 * 6
            int r8 = 103 - r8
            byte[] r0 = atd.ab.getSDKAppID.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r4 = r2
            r0 = r8
            r8 = r7
            goto L31
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L31:
            int r0 = r0 + r7
            int r7 = r0 + (-5)
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ab.getSDKAppID.b(int, int, short, java.lang.Object[]):void");
    }

    public static void getSDKTransactionID(long j9, long j11) throws Throwable {
        int i11 = ChallengeResult + 57;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            byte b8 = (byte) ($$b & 3);
            Object[] objArr = new Object[1];
            b(b8, b8, $$a[28], objArr);
            a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
            throw null;
        }
        int i12 = $$b;
        byte b11 = (byte) (i12 & 3);
        byte[] bArr = $$a;
        Object[] objArr2 = new Object[1];
        b(b11, b11, bArr[28], objArr2);
        a0.B(null, (String) objArr2[0], "AuthenticationRequestParameters");
        BuildConfig = (ChallengeResult + 19) % 128;
        byte b12 = (byte) (i12 & 3);
        try {
            Object[] objArr3 = new Object[1];
            b(b12, b12, bArr[28], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b13 = bArr[28];
            byte b14 = b13;
            Object[] objArr4 = new Object[1];
            b(b13, b14, (byte) (b14 + 1), objArr4);
            Method method = cls.getMethod((String) objArr4[0], null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            Object[] objArr5 = {getSDKEphemeralPublicKey.class.getField("getDeviceData").get(null)};
            Object[] objArr6 = new Object[1];
            a("\r\u0015㘋", 2 - ImageFormat.getBitsPerPixel(0), (byte) (13 - KeyEvent.getDeadChar(0, 0)), objArr6);
            Method method2 = Set.class.getMethod(((String) objArr6[0]).intern(), Object.class);
            method2.setAccessible(true);
            int i13 = BuildConfig + 33;
            ChallengeResult = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
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
        $$a = new byte[]{43, -52, -24, 121, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
        $$b = 101;
    }

    public static void init$1() {
        $$c = new byte[]{94, 121, 122, 56};
        $$d = 159;
    }

    @Override // com.adyen.threeds2.ProtocolErrorEvent
    @NotNull
    public final String getAdditionalDetails() {
        int i11 = ChallengeResult + 95;
        BuildConfig = i11 % 128;
        int i12 = i11 % 2;
        String str = this.getDeviceData;
        if (i12 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.ProtocolErrorEvent
    @NotNull
    public final ErrorMessage getErrorMessage() {
        int i11 = BuildConfig + 81;
        ChallengeResult = i11 % 128;
        int i12 = i11 % 2;
        ErrorMessage errorMessage = this.getSDKTransactionID;
        if (i12 != 0) {
            int i13 = 79 / 0;
        }
        return errorMessage;
    }

    @NotNull
    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("\u0012\b㘬㘬㘬㘬㘬㘬㘬㘬㘬㘬\b\u0012㘬㘬㘬㘬㘬㘬㘬㘬㘬㘬㘬㘬\u0015\u0018\t\f\u000b\f\u0000\u0016\f\u0015\b\u000f\u0007\u0003\u0012\u0014\u0012\u0002", 44 - (Process.myTid() >> 22), (byte) (114 - TextUtils.indexOf("", "", 0)), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.AuthenticationRequestParameters);
        Object[] objArr2 = new Object[1];
        a("\u0012\b㗳㗳㗳㗳㗳㗳㗳㗳㗳㗳\u0001\b㘡㘡\u0005\r\u0005\u0007㘢㘢\u000e\u0015\u0007\u0010㗳", 27 - TextUtils.getOffsetBefore("", 0), (byte) (57 - View.resolveSizeAndState(0, 0, 0)), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(this.getSDKTransactionID);
        Object[] objArr3 = new Object[1];
        a("\u0012\b㘈㘈㘈㘈㘈㘈㘈㘈㘈㘈㘈", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 78), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        String strC = s.c(sb2.toString());
        int i11 = ChallengeResult + 121;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 83 / 0;
        }
        return strC;
    }

    @Override // com.adyen.threeds2.ProtocolErrorEvent
    @Nullable
    public final String getSDKTransactionID() {
        int i11 = ChallengeResult;
        String str = this.AuthenticationRequestParameters;
        BuildConfig = (i11 + 25) % 128;
        return str;
    }
}
