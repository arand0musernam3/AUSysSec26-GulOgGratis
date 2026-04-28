package atd.p;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DeviceProvisioned;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceProvisioned.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceProvisioned.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DeviceProvisioned\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class BuildConfig extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int[] getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r6, byte r7, short r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = atd.p.BuildConfig.$$a
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 + 112
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r7]
            r5 = r1
            r1 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r7
            int r7 = r1 + 1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.BuildConfig.$$d(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getSDKAppID();
        Process.myPid();
        new getSDKTransactionID((byte) 0);
        int i11 = AuthenticationRequestParameters + 5;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private BuildConfig(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c3;
        char[] cArr;
        int[] iArr2;
        int i14;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i15 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKTransactionID;
        char c7 = '0';
        Class cls = Integer.TYPE;
        int i16 = 16;
        if (iArr3 != null) {
            int length = iArr3.length;
            i12 = 53070;
            int[] iArr4 = new int[length];
            int i17 = 0;
            i13 = -1667528016;
            while (i17 < length) {
                int i18 = i15;
                int i19 = $10 + 9;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i17])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                        if (sDKTransactionID == null) {
                            int mirror = 2271 - AndroidCharacter.getMirror(c7);
                            i14 = i16;
                            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 53070);
                            int iLastIndexOf = TextUtils.lastIndexOf("", c7) + 22;
                            byte b8 = (byte) ($$b & 6);
                            byte b11 = (byte) (b8 - 2);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(mirror, doubleTapTimeout, iLastIndexOf, 1089703072, false, $$d(b8, b11, b11), new Class[]{cls});
                        } else {
                            i14 = i16;
                        }
                        iArr4[i17] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                        i17 <<= 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    i14 = i16;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i17])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID2 == null) {
                        int maximumFlingVelocity = 2223 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        char cBlue = (char) (53070 - Color.blue(0));
                        int iMyPid = (Process.myPid() >> 22) + 21;
                        byte b12 = (byte) ($$b & 6);
                        byte b13 = (byte) (b12 - 2);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(maximumFlingVelocity, cBlue, iMyPid, 1089703072, false, $$d(b12, b13, b13), new Class[]{cls});
                    }
                    iArr4[i17] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i17++;
                }
                i15 = i18;
                i16 = i14;
                c7 = '0';
            }
            iArr3 = iArr4;
        } else {
            i12 = 53070;
            i13 = -1667528016;
        }
        int i21 = i15;
        int i22 = i16;
        int i23 = 0;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKTransactionID;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i24 = 0;
            while (i24 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr6[i24])};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i13);
                if (sDKTransactionID3 == null) {
                    int i25 = i23;
                    int iIndexOf = TextUtils.indexOf("", "", i25, i25) + 2223;
                    char maximumFlingVelocity2 = (char) (i12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int bitsPerPixel = 20 - ImageFormat.getBitsPerPixel(i25);
                    byte b14 = (byte) ($$b & 6);
                    cArr = cArr2;
                    byte b15 = (byte) (b14 - 2);
                    iArr2 = iArr6;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iIndexOf, maximumFlingVelocity2, bitsPerPixel, 1089703072, false, $$d(b14, b15, b15), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                }
                iArr7[i24] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                i24++;
                cArr2 = cArr;
                iArr6 = iArr2;
                i23 = 0;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i26 = getmessageversion.getSDKAppID;
            if (i26 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            $11 = ($10 + 13) % 128;
            int i27 = iArr[i26];
            char c8 = (char) (i27 >> 16);
            cArr4[0] = c8;
            char c11 = (char) i27;
            char c12 = 1;
            cArr4[1] = c11;
            char c13 = (char) (iArr[i26 + 1] >> 16);
            cArr4[i21] = c13;
            char c14 = (char) iArr[i26 + 1];
            cArr4[3] = c14;
            getmessageversion.getDeviceData = (c8 << 16) + c11;
            getmessageversion.AuthenticationRequestParameters = (c13 << 16) + c14;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i28 = 0;
            while (i28 < i22) {
                int i29 = $10 + 59;
                $11 = i29 % 128;
                int i31 = i29 % 2;
                int i32 = getmessageversion.getDeviceData;
                if (i31 == 0) {
                    int i33 = iArr5[i28] ^ i32;
                    getmessageversion.getDeviceData = i33;
                    int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i33);
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = getmessageversion;
                    objArr5[i21] = getmessageversion;
                    objArr5[c12] = Integer.valueOf(sDKReferenceNumber);
                    objArr5[0] = getmessageversion;
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        c3 = c12;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getLongPressTimeout() >> 16) + 2386, (char) View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 20, -2040903174, false, $$d(b16, b17, b17), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c3 = c12;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue;
                    i28 += 99;
                } else {
                    c3 = c12;
                    int i34 = iArr5[i28] ^ i32;
                    getmessageversion.getDeviceData = i34;
                    int sDKReferenceNumber2 = atd.bb.getMessageVersion.getSDKReferenceNumber(i34);
                    Object[] objArr6 = new Object[4];
                    objArr6[3] = getmessageversion;
                    objArr6[i21] = getmessageversion;
                    objArr6[c3] = Integer.valueOf(sDKReferenceNumber2);
                    objArr6[0] = getmessageversion;
                    Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID5 == null) {
                        byte b18 = (byte) 0;
                        byte b19 = b18;
                        sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2386, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 19 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2040903174, false, $$d(b18, b19, b19), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID5).invoke(null, objArr6)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue2;
                    i28++;
                }
                c12 = c3;
                i22 = 16;
            }
            char c15 = c12;
            int i35 = getmessageversion.getDeviceData;
            int i36 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i36;
            getmessageversion.AuthenticationRequestParameters = i35;
            i22 = 16;
            int i37 = i35 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i37;
            int i38 = i36 ^ iArr5[17];
            getmessageversion.getDeviceData = i38;
            cArr4[0] = (char) (i38 >>> 16);
            cArr4[c15] = (char) i38;
            cArr4[i21] = (char) (i37 >>> 16);
            cArr4[3] = (char) i37;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i39 = getmessageversion.getSDKAppID;
            cArr3[i39 * 2] = cArr4[0];
            cArr3[(i39 * 2) + 1] = cArr4[c15];
            cArr3[(i39 * 2) + 2] = cArr4[i21];
            cArr3[(i39 * 2) + 3] = cArr4[3];
            int i41 = i21;
            Object[] objArr7 = new Object[i41];
            objArr7[c15] = getmessageversion;
            objArr7[0] = getmessageversion;
            Object sDKTransactionID6 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID6 == null) {
                int iResolveSizeAndState = 1861 - View.resolveSizeAndState(0, 0, 0);
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int defaultSize = 40 - View.getDefaultSize(0, 0);
                byte b21 = (byte) ($$b & 5);
                byte b22 = (byte) (b21 - 1);
                sDKTransactionID6 = atd.e.ChallengeResult.getDeviceData(iResolveSizeAndState, touchSlop, defaultSize, -562771681, false, $$d(b21, b22, b22), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID6).invoke(null, objArr7);
            i21 = i41;
        }
    }

    public static void getSDKAppID() {
        getSDKTransactionID = new int[]{30857663, 1313616937, -1595567422, 953484662, -560604325, -1535261809, 814328337, 1251704766, -726198470, 376791486, 1294525899, 1504488052, 1698234656, 216843704, -1211551505, -1940430594, 1767575801, 1106596797};
    }

    public static void init$0() {
        $$a = new byte[]{53, -94, 71, -95};
        $$b = 43;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getDeviceData;
        Object[] objArr = new Object[1];
        b(new int[]{1153100160, 1907374341, 586436366, 1535074173, 627899591, -872485783, -754963268, 736082049, 1724749877, 750736701}, 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            int i11 = getSDKReferenceNumber + 117;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters);
                throw null;
            }
            Boolean sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters);
            if (sDKTransactionID != null) {
                getSDKReferenceNumber = (getSDKAppID + 87) % 128;
                return a0.h(sDKTransactionID);
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i12 = getSDKReferenceNumber + 69;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 62 / 0;
        }
        return failure;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DeviceProvisioned$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
