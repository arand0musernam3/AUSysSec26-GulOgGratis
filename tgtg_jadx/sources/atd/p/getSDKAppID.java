package atd.p;

import android.app.Application;
import android.graphics.PointF;
import android.media.AudioManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/ApplyRampingRinger;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApplyRampingRinger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplyRampingRinger.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/ApplyRampingRinger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
public final class getSDKAppID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int getMessageVersion;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    @NotNull
    private final Application getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r7, short r8, short r9) {
        /*
            byte[] r0 = atd.p.getSDKAppID.$$a
            int r8 = r8 + 65
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = r9 * 3
            int r9 = 3 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r9
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2c:
            int r8 = -r8
            int r8 = r8 + r9
            r9 = r0
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getSDKAppID.$$d(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getLongPressTimeout();
        new getSDKReferenceNumber((byte) 0);
        ChallengeResult = (getMessageVersion + 43) % 128;
    }

    private getSDKAppID(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = application;
        this.getDeviceData = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{30889, 31580, 30963, 30881, 30884, 30902, 30855, 30888, 30880, 30890, 30967, 30900, 30895, 31581, 30911, 30899, 30891, 30886, 30882, 30883, 30887, 30885, 30964, 31582, 30873};
        getSDKReferenceNumber = (char) 19801;
    }

    private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
        char c3;
        int i12;
        int i13;
        char c7;
        char c8;
        char c11;
        char c12;
        int length;
        char[] cArr;
        int i14;
        char c13;
        char c14;
        int i15 = $11 + 85;
        $10 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i16 = -317146529;
        char c15 = '\b';
        char c16 = '0';
        int i17 = 0;
        if (cArr2 != null) {
            int i18 = $10 + 39;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            c3 = 2;
            int i19 = 0;
            while (i19 < length) {
                $10 = ($11 + 47) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i19])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i16);
                    if (sDKTransactionID == null) {
                        i14 = i16;
                        c13 = c15;
                        byte b11 = (byte) i17;
                        c14 = c16;
                        byte b12 = b11;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", c16) + 2159, (char) (ViewConfiguration.getScrollBarSize() >> 8), 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 829471823, false, $$d(b11, b12, b12), new Class[]{cls});
                    } else {
                        i14 = i16;
                        c13 = c15;
                        c14 = c16;
                    }
                    cArr[i19] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i19++;
                    i16 = i14;
                    c15 = c13;
                    c16 = c14;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        } else {
            c3 = 2;
        }
        int i21 = i16;
        char c17 = c15;
        char c18 = c16;
        Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i21);
        if (sDKTransactionID2 == null) {
            byte b13 = (byte) 0;
            byte b14 = b13;
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2158 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ('0' - AndroidCharacter.getMirror(c18)), (ViewConfiguration.getTouchSlop() >> 8) + 36, 829471823, false, $$d(b13, b14, b14), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            int i22 = $10 + 25;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                i12 = i11 + 39;
                cArr3[i12] = (char) (charArray[i12] * b8);
            } else {
                i12 = i11 - 1;
                cArr3[i12] = (char) (charArray[i12] - b8);
            }
        } else {
            i12 = i11;
        }
        int i23 = 1;
        if (i12 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i24 = challengeResultKt.getSDKReferenceNumber;
                if (i24 >= i12) {
                    break;
                }
                char c19 = charArray[i24];
                challengeResultKt.getDeviceData = c19;
                char c21 = charArray[i24 + 1];
                challengeResultKt.getSDKAppID = c21;
                if (c19 == c21) {
                    cArr3[i24] = (char) (c19 - b8);
                    cArr3[i24 + 1] = (char) (c21 - b8);
                    i13 = i23;
                    c12 = c18;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[c17] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[6] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[3] = challengeResultKt;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[i23] = challengeResultKt;
                    objArr4[0] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c7 = '\t';
                        int iAxisFromString = MotionEvent.axisFromString("") + 1259;
                        c8 = 7;
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 34414);
                        c11 = 6;
                        int i25 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41;
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 2);
                        i13 = i23;
                        String str$$d = $$d(b15, b16, (byte) (b16 - 2));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iAxisFromString, cNormalizeMetaState, i25, -307955329, false, str$$d, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i13 = i23;
                        c7 = '\t';
                        c8 = 7;
                        c11 = 6;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i26 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i26) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = challengeResultKt;
                        objArr5[c7] = Integer.valueOf(cCharValue);
                        objArr5[c17] = challengeResultKt;
                        objArr5[c8] = Integer.valueOf(cCharValue);
                        objArr5[c11] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c3] = Integer.valueOf(cCharValue);
                        objArr5[i13] = challengeResultKt;
                        objArr5[0] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            c12 = c18;
                            int iIndexOf = TextUtils.indexOf("", c12, 0, 0) + 2224;
                            char c22 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 53069);
                            int offsetAfter = 21 - TextUtils.getOffsetAfter("", 0);
                            byte b17 = (byte) 0;
                            String str$$d2 = $$d(b17, (byte) (b17 | 57), b17);
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iIndexOf, c22, offsetAfter, 246098488, false, str$$d2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        } else {
                            c12 = c18;
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i27 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i28 = challengeResultKt.getSDKReferenceNumber;
                        cArr3[i28] = cArr2[iIntValue2];
                        cArr3[i28 + 1] = cArr2[i27];
                    } else {
                        c12 = c18;
                        int i29 = challengeResultKt.AuthenticationRequestParameters;
                        int i31 = challengeResultKt.getSDKTransactionID;
                        int i32 = challengeResultKt.getMessageVersion;
                        if (i29 == i31) {
                            int i33 = i13;
                            int iC = k.c(i32, cCharValue, i33, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i26, cCharValue, i33, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i34 = (i31 * cCharValue) + iC2;
                            int i35 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i35] = cArr2[(i29 * cCharValue) + iC];
                            cArr3[i35 + i33] = cArr2[i34];
                            $11 = ($10 + 101) % 128;
                            i13 = 1;
                        } else {
                            int i36 = (i29 * cCharValue) + i26;
                            int i37 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i37] = cArr2[i36];
                            i13 = 1;
                            cArr3[i37 + 1] = cArr2[(i31 * cCharValue) + i32];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                c18 = c12;
                i23 = i13;
            }
        }
        int i38 = 0;
        while (i38 < i11) {
            cArr3[i38] = (char) (cArr3[i38] ^ 13722);
            i38++;
            $10 = ($11 + 107) % 128;
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{47, -93, 7, 60};
        $$b = 16;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Boolean sDKTransactionID;
        AudioManager audioManager;
        int i11 = AuthenticationRequestParameters + 63;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0 ? Build.VERSION.SDK_INT < 29 : Build.VERSION.SDK_INT < 87) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        if (Build.VERSION.SDK_INT > 32) {
            Application application = this.getSDKTransactionID;
            Object[] objArr = new Object[1];
            b(4 - TextUtils.lastIndexOf("", '0', 0), (byte) (72 - View.MeasureSpec.getMode(0)), "\u0000\u0014\u0011\r㘽", objArr);
            Object systemService = application.getSystemService(((String) objArr[0]).intern());
            if (systemService instanceof AudioManager) {
                getSDKEphemeralPublicKey = (AuthenticationRequestParameters + 17) % 128;
                audioManager = (AudioManager) systemService;
            } else {
                audioManager = null;
            }
            return audioManager != null ? DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(audioManager.isRampingRingerEnabled())) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getDeviceData;
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, (byte) (7 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u0000\n\u0006\u0005\u0013\u0004\n\u0015\u000f\u0006\u0011\f\u0004\u0017\f\r\b\u0002\u0010\u000e", objArr2);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr2[0]).intern());
        if (strAuthenticationRequestParameters != null && (sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters)) != null) {
            return a0.h(sDKTransactionID);
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        AuthenticationRequestParameters = (getSDKEphemeralPublicKey + 69) % 128;
        return failure;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/ApplyRampingRinger$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKAppID(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
