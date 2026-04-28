package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/VibrateOn;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVibrateOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateOn.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/VibrateOn\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class runtimeError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r7, short r8, int r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = 69 - r7
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r0 = atd.y.runtimeError.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r5 = r2
            r0 = r8
            r8 = r9
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2d:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.runtimeError.$$d(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        getSDKEphemeralPublicKey = 1;
        ChallengeResult = 0;
        BuildConfig = 1;
        getSDKTransactionID();
        Gravity.getAbsoluteGravity(0, 0);
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getMessageVersion + 101;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 74 / 0;
        }
    }

    private runtimeError(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKAppID = getsdkreferencenumber;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c3;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
        char[] cArr = new char[charArray.length];
        int i14 = 0;
        challengeResultCompleted.getDeviceData = 0;
        int i15 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i16 = challengeResultCompleted.getDeviceData;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            $11 = ($10 + 93) % 128;
            cArr2[i14] = charArray[i16];
            char c7 = 1;
            cArr2[1] = charArray[i16 + 1];
            int i17 = 58224;
            int i18 = i14;
            while (i18 < 16) {
                $10 = ($11 + 79) % 128;
                char c8 = cArr2[c7];
                char c11 = cArr2[i14];
                char c12 = c7;
                int i19 = i15;
                char[] cArr3 = cArr2;
                int i21 = (c11 + i17) ^ ((c11 << 4) + ((char) (((long) AuthenticationRequestParameters) ^ 5320350835299930193L)));
                int i22 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getDeviceData);
                    objArr2[i19] = Integer.valueOf(i22);
                    objArr2[c12] = Integer.valueOf(i21);
                    objArr2[i14] = Integer.valueOf(c8);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        int iResolveSize = View.resolveSize(i14, i14) + 2828;
                        char cResolveOpacity = (char) Drawable.resolveOpacity(i14, i14);
                        int iMyTid = 27 - (Process.myTid() >> 22);
                        i13 = 906025703;
                        byte b8 = (byte) ($$b & 5);
                        c3 = 3;
                        byte b11 = (byte) (-b8);
                        i12 = i14;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iResolveSize, cResolveOpacity, iMyTid, -362226441, false, $$d(b8, b11, (byte) (b11 + 1)), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = i14;
                        i13 = 906025703;
                        c3 = 3;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c12] = cCharValue;
                    char c13 = cArr3[i12];
                    int i23 = (cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) getSDKReferenceNumber) ^ 5320350835299930193L)));
                    int i24 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[c3] = Integer.valueOf(getSDKTransactionID);
                    objArr3[i19] = Integer.valueOf(i24);
                    objArr3[c12] = Integer.valueOf(i23);
                    objArr3[i12] = Integer.valueOf(c13);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i13);
                    if (sDKTransactionID2 == null) {
                        int i25 = i12;
                        int iIndexOf = TextUtils.indexOf("", "", i25, i25) + 2828;
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int i26 = 27 - (TypedValue.complexToFloat(i25) > 0.0f ? 1 : (TypedValue.complexToFloat(i25) == 0.0f ? 0 : -1));
                        byte b12 = (byte) ($$b & 5);
                        byte b13 = (byte) (-b12);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iIndexOf, cIndexOf, i26, -362226441, false, $$d(b12, b13, (byte) (b13 + 1)), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i17 -= 40503;
                    i18++;
                    c7 = c12;
                    i15 = i19;
                    cArr2 = cArr3;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i27 = i15;
            char[] cArr4 = cArr2;
            char c14 = c7;
            int i28 = challengeResultCompleted.getDeviceData;
            cArr[i28] = cArr4[0];
            cArr[i28 + 1] = cArr4[c14];
            Object[] objArr4 = new Object[i27];
            objArr4[c14] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(3157 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25797), 27 - Color.red(0), 1296942946, false, $$d(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            $10 = ($11 + 21) % 128;
            i15 = i27;
            cArr2 = cArr4;
            i14 = 0;
        }
    }

    public static void getSDKTransactionID() {
        getSDKReferenceNumber = (char) 26446;
        getSDKTransactionID = (char) 41176;
        AuthenticationRequestParameters = (char) 42420;
        getDeviceData = (char) 43046;
    }

    public static void init$0() {
        $$a = new byte[]{57, ByteCompanionObject.MAX_VALUE, -91, 50};
        $$b = 35;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Boolean sDKTransactionID;
        ChallengeResult = (BuildConfig + 55) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKAppID;
        Object[] objArr = new Object[1];
        b("꿑ඥ灊㙩\u07be\uf47fꗠဣ\uec14⓽", 10 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null && (sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters)) != null) {
            return a0.h(sDKTransactionID);
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        ChallengeResult = (BuildConfig + 125) % 128;
        return failure;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/VibrateOn$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int getDeviceData;
        private static char[] getSDKAppID;
        private static char getSDKTransactionID;

        private static String $$c(int i11, short s7, short s8) {
            byte[] bArr = $$a;
            int i12 = s8 + 4;
            int i13 = s7 * 4;
            int i14 = 122 - i11;
            byte[] bArr2 = new byte[1 - i13];
            int i15 = 0 - i13;
            int i16 = -1;
            if (bArr == null) {
                i14 += i15;
            }
            while (true) {
                i16++;
                bArr2[i16] = (byte) i14;
                i12++;
                if (i16 == i15) {
                    return new String(bArr2, 0);
                }
                i14 += bArr[i12];
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKAppID = new char[]{30878, 30898, 30911, 30879, 30896, 30873, 30885, 30870, 30890, 30856, 30966, 30882, 30881, 30872, 30869, 30891, 30867, 30889, 30884, 30883, 30895, 30952, 30894, 30880, 30910, 30899, 30855, 30950, 30875, 30971, 30859, 30954, 30892, 30902, 30852, 30888, 30857, 30850, 30900, 30901, 30887, 30864, 30874, 30868, 30871, 30893, 30865, 30963, 30853};
            getSDKTransactionID = (char) 19803;
            getDeviceData = 711855223;
        }

        private AuthenticationRequestParameters() {
        }

        private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
            int i12;
            int i13;
            int i14;
            char c3;
            char c7;
            char c8;
            int i15;
            int i16;
            int i17;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
            char[] cArr = getSDKAppID;
            Class cls = Integer.TYPE;
            int i18 = -317146529;
            int i19 = 8;
            int i21 = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i22 = 0;
                while (i22 < length) {
                    $10 = ($11 + 125) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i22])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i18);
                        if (sDKTransactionID == null) {
                            i16 = i18;
                            byte b11 = (byte) 0;
                            i17 = i19;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData((-16775058) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getScrollBarSize() >> i19), 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 829471823, false, $$c((byte) 57, b11, (byte) (b11 - 1)), new Class[]{cls});
                        } else {
                            i16 = i18;
                            i17 = i19;
                        }
                        cArr2[i22] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i22++;
                        i18 = i16;
                        i19 = i17;
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
            int i23 = i18;
            int i24 = i19;
            Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i23);
            char c11 = '0';
            if (sDKTransactionID2 == null) {
                byte b12 = (byte) 0;
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", '0', 0, 0) + 2159, (char) View.MeasureSpec.getSize(0), TextUtils.getOffsetBefore("", 0) + 36, 829471823, false, $$c((byte) 57, b12, (byte) (b12 - 1)), new Class[]{cls});
            }
            char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i11];
            if (i11 % 2 != 0) {
                i12 = i11 - 1;
                cArr3[i12] = (char) (charArray[i12] - b8);
            } else {
                i12 = i11;
            }
            int i25 = 1;
            if (i12 > 1) {
                int i26 = $10 + 119;
                $11 = i26 % 128;
                char c12 = 2;
                if (i26 % 2 == 0) {
                    challengeResultKt.getSDKReferenceNumber = 1;
                } else {
                    challengeResultKt.getSDKReferenceNumber = 0;
                }
                while (true) {
                    int i27 = challengeResultKt.getSDKReferenceNumber;
                    if (i27 >= i12) {
                        break;
                    }
                    char c13 = charArray[i27];
                    challengeResultKt.getDeviceData = c13;
                    char c14 = charArray[i27 + 1];
                    challengeResultKt.getSDKAppID = c14;
                    if (c13 == c14) {
                        cArr3[i27] = (char) (c13 - b8);
                        cArr3[i27 + 1] = (char) (c14 - b8);
                        c8 = c11;
                        c3 = c12;
                        i15 = i25;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = challengeResultKt;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = challengeResultKt;
                        objArr4[9] = challengeResultKt;
                        objArr4[i24] = Integer.valueOf(cCharValue);
                        objArr4[7] = challengeResultKt;
                        objArr4[6] = challengeResultKt;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = challengeResultKt;
                        objArr4[3] = challengeResultKt;
                        objArr4[c12] = Integer.valueOf(cCharValue);
                        objArr4[i25] = challengeResultKt;
                        objArr4[i21] = challengeResultKt;
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                        if (sDKTransactionID3 == null) {
                            c3 = c12;
                            int iLastIndexOf = 1257 - TextUtils.lastIndexOf("", c11, i21);
                            c7 = '\n';
                            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 34414);
                            int capsMode = 41 - TextUtils.getCapsMode("", i21, i21);
                            i13 = i25;
                            byte b13 = (byte) i21;
                            i14 = i21;
                            String str$$c = $$c((byte) 55, b13, (byte) (b13 - 1));
                            Class cls2 = Integer.TYPE;
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iLastIndexOf, cKeyCodeFromString, capsMode, -307955329, false, str$$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            i13 = i25;
                            i14 = i21;
                            c3 = c12;
                            c7 = '\n';
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                        int i28 = challengeResultKt.ChallengeResultCancelled;
                        if (iIntValue == i28) {
                            Object[] objArr5 = new Object[11];
                            objArr5[c7] = challengeResultKt;
                            objArr5[9] = Integer.valueOf(cCharValue);
                            objArr5[i24] = challengeResultKt;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = challengeResultKt;
                            objArr5[4] = challengeResultKt;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[c3] = Integer.valueOf(cCharValue);
                            objArr5[i13] = challengeResultKt;
                            objArr5[i14] = challengeResultKt;
                            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                            if (sDKTransactionID4 == null) {
                                int i29 = i14;
                                int iResolveSize = 2223 - View.resolveSize(i29, i29);
                                char cLastIndexOf = (char) (53069 - TextUtils.lastIndexOf("", '0', i29));
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 21;
                                byte b14 = (byte) i29;
                                byte b15 = b14;
                                String str$$c2 = $$c(b14, b15, (byte) (b15 - 1));
                                Class cls3 = Integer.TYPE;
                                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iResolveSize, cLastIndexOf, longPressTimeout, 246098488, false, str$$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            c8 = '0';
                            int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                            int i31 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                            int i32 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i32] = cArr[iIntValue2];
                            cArr3[i32 + 1] = cArr[i31];
                            i15 = i13;
                        } else {
                            c8 = '0';
                            int i33 = challengeResultKt.AuthenticationRequestParameters;
                            int i34 = challengeResultKt.getSDKTransactionID;
                            int i35 = challengeResultKt.getMessageVersion;
                            if (i33 == i34) {
                                i15 = i13;
                                int iC = k.c(i35, cCharValue, i15, cCharValue);
                                challengeResultKt.getMessageVersion = iC;
                                int iC2 = k.c(i28, cCharValue, i15, cCharValue);
                                challengeResultKt.ChallengeResultCancelled = iC2;
                                int i36 = (i34 * cCharValue) + iC2;
                                int i37 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i37] = cArr[(i33 * cCharValue) + iC];
                                cArr3[i37 + i15] = cArr[i36];
                            } else {
                                i15 = i13;
                                int i38 = (i33 * cCharValue) + i28;
                                int i39 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i39] = cArr[i38];
                                cArr3[i39 + i15] = cArr[(i34 * cCharValue) + i35];
                            }
                        }
                    }
                    challengeResultKt.getSDKReferenceNumber += 2;
                    i25 = i15;
                    c11 = c8;
                    i21 = 0;
                    c12 = c3;
                }
            }
            for (int i41 = 0; i41 < i11; i41++) {
                cArr3[i41] = (char) (cArr3[i41] ^ 13722);
            }
            String str2 = new String(cArr3);
            $10 = ($11 + 43) % 128;
            objArr[0] = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r25, int r26, java.lang.String r27, int r28, boolean r29, java.lang.Object[] r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.runtimeError.AuthenticationRequestParameters.b(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKTransactionID(android.content.Context r34, int r35, int r36) {
            /*
                Method dump skipped, instruction units count: 1434
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.runtimeError.AuthenticationRequestParameters.getSDKTransactionID(android.content.Context, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{105, 109, -121, 42};
            $$b = 208;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ runtimeError(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
