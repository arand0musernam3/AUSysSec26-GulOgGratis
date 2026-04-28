package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimState;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSimState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimState.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class InitializeResultFailure extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getDeviceData = 0;
    private static char[] getSDKAppID = null;
    private static int getSDKReferenceNumber = 1;
    private static long getSDKTransactionID;

    static {
        getSDKTransactionID();
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getZoomControlsTimeout();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        new getDeviceData((byte) 0);
        AuthenticationRequestParameters = (ChallengeResultCancelled + 13) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeResultFailure(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKTransactionID() {
        getSDKAppID = new char[]{15152, 20248, 54258, 26178};
        getSDKTransactionID = -916230230276341673L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult != null) {
            Integer numValueOf = Integer.valueOf(telephonyManagerChallengeResult.getSimState());
            int iIntValue = numValueOf.intValue();
            if (iIntValue < 0 || iIntValue >= 10) {
                numValueOf = null;
            } else {
                getDeviceData = (getSDKReferenceNumber + 47) % 128;
            }
            if (numValueOf != null) {
                return DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(numValueOf.intValue()));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimState$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MINIMUM", "", "MAXIMUM", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int getSDKAppID;
        private static int[] getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r6, byte r7, int r8) {
            /*
                int r6 = r6 * 3
                int r0 = r6 + 1
                int r7 = r7 + 4
                byte[] r1 = atd.w.InitializeResultFailure.getDeviceData.$$c
                int r8 = r8 + 112
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L13
                r3 = r1
                r4 = r2
                r1 = r7
                goto L2d
            L13:
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L22:
                int r8 = r8 + 1
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r1
                r1 = r8
                r8 = r4
                r4 = r3
                r3 = r5
            L2d:
                int r7 = r7 + r8
                r8 = r1
                r1 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.InitializeResultFailure.getDeviceData.$$e(short, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = 0;
            getSDKTransactionID = 1;
            getSDKReferenceNumber = new int[]{-761737803, -1825620875, -1184984022, -1931050208, 1237591853, -1257317501, 348036847, -760375527, 489259394, 15445976, -1563145265, -251937713, -1501099604, 1751111772, 1996592184, -389775011, 1293283666, 1815362931};
        }

        private getDeviceData() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 6
                int r7 = 103 - r7
                int r5 = r5 * 15
                int r0 = 26 - r5
                byte[] r1 = atd.w.InitializeResultFailure.getDeviceData.$$a
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                int r5 = 25 - r5
                r2 = 0
                if (r1 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                int r3 = r3 + 1
                int r6 = r6 + 1
                r4 = r1[r6]
            L2a:
                int r7 = r7 + r4
                int r7 = r7 + (-5)
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.InitializeResultFailure.getDeviceData.a(short, int, int, java.lang.Object[]):void");
        }

        private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
            int i12;
            int i13;
            int i14;
            long j9;
            int i15;
            char c3;
            char[] cArr;
            int[] iArr2;
            int i16;
            int i17;
            int i18;
            atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
            char[] cArr2 = new char[4];
            int i19 = 2;
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr3 = getSDKReferenceNumber;
            int i21 = -1667528016;
            Class cls = Integer.TYPE;
            int i22 = 0;
            if (iArr3 != null) {
                int length = iArr3.length;
                int[] iArr4 = new int[length];
                int i23 = 0;
                j9 = 0;
                while (i23 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i23])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i21);
                        if (sDKTransactionID == null) {
                            i17 = i21;
                            i16 = i19;
                            byte b8 = (byte) i22;
                            i18 = i22;
                            byte b11 = (byte) (b8 - 1);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(((Process.getThreadPriority(i22) + 20) >> 6) + 2223, (char) (53070 - TextUtils.indexOf("", "")), 22 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1089703072, false, $$e(b8, b11, (byte) (b11 + 3)), new Class[]{cls});
                        } else {
                            i16 = i19;
                            i17 = i21;
                            i18 = i22;
                        }
                        iArr4[i23] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                        i23++;
                        i21 = i17;
                        i19 = i16;
                        i22 = i18;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                i12 = i19;
                i13 = i21;
                i14 = i22;
                $10 = ($11 + 57) % 128;
                iArr3 = iArr4;
            } else {
                i12 = 2;
                i13 = -1667528016;
                i14 = 0;
                j9 = 0;
            }
            int length2 = iArr3.length;
            int[] iArr5 = new int[length2];
            int[] iArr6 = getSDKReferenceNumber;
            if (iArr6 != null) {
                int length3 = iArr6.length;
                int[] iArr7 = new int[length3];
                int i24 = i14;
                while (i24 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i24])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i13);
                    if (sDKTransactionID2 == null) {
                        int iNormalizeMetaState = 2223 - KeyEvent.normalizeMetaState(i14);
                        char c7 = (char) (53071 - (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)));
                        int i25 = i14;
                        int iIndexOf = 21 - TextUtils.indexOf("", "", i25, i25);
                        cArr = cArr2;
                        byte b12 = (byte) i25;
                        byte b13 = (byte) (b12 - 1);
                        iArr2 = iArr6;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iNormalizeMetaState, c7, iIndexOf, 1089703072, false, $$e(b12, b13, (byte) (b13 + 3)), new Class[]{cls});
                    } else {
                        cArr = cArr2;
                        iArr2 = iArr6;
                    }
                    iArr7[i24] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i24++;
                    cArr2 = cArr;
                    iArr6 = iArr2;
                    i14 = 0;
                }
                iArr6 = iArr7;
            }
            char[] cArr4 = cArr2;
            char c8 = 0;
            System.arraycopy(iArr6, 0, iArr5, 0, length2);
            getmessageversion.getSDKAppID = 0;
            while (true) {
                int i26 = getmessageversion.getSDKAppID;
                if (i26 >= iArr.length) {
                    objArr[0] = new String(cArr3, 0, i11);
                    return;
                }
                int i27 = iArr[i26];
                char c11 = (char) (i27 >> 16);
                cArr4[c8] = c11;
                char c12 = (char) i27;
                char c13 = 1;
                cArr4[1] = c12;
                char c14 = (char) (iArr[i26 + 1] >> 16);
                cArr4[i12] = c14;
                char c15 = (char) iArr[i26 + 1];
                cArr4[3] = c15;
                getmessageversion.getDeviceData = (c11 << 16) + c12;
                getmessageversion.AuthenticationRequestParameters = (c14 << 16) + c15;
                atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
                int i28 = 0;
                while (true) {
                    i15 = getmessageversion.getDeviceData;
                    if (i28 >= 16) {
                        break;
                    }
                    int i29 = i15 ^ iArr5[i28];
                    getmessageversion.getDeviceData = i29;
                    int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i29);
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = getmessageversion;
                    objArr4[i12] = getmessageversion;
                    objArr4[c13] = Integer.valueOf(sDKReferenceNumber);
                    objArr4[0] = getmessageversion;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 - 1);
                        c3 = c13;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollBarSize() >> 8) + 2386, (char) (AndroidCharacter.getMirror('0') - '0'), 19 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2040903174, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c3 = c13;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue;
                    i28++;
                    c13 = c3;
                }
                char c16 = c13;
                int i31 = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.getDeviceData = i31;
                getmessageversion.AuthenticationRequestParameters = i15;
                int i32 = i15 ^ iArr5[16];
                getmessageversion.AuthenticationRequestParameters = i32;
                int i33 = i31 ^ iArr5[17];
                getmessageversion.getDeviceData = i33;
                cArr4[0] = (char) (i33 >>> 16);
                cArr4[c16] = (char) i33;
                cArr4[i12] = (char) (i32 >>> 16);
                cArr4[3] = (char) i32;
                atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
                int i34 = getmessageversion.getSDKAppID;
                cArr3[i34 * 2] = cArr4[0];
                cArr3[(i34 * 2) + 1] = cArr4[c16];
                cArr3[(i34 * 2) + 2] = cArr4[i12];
                cArr3[(i34 * 2) + 3] = cArr4[3];
                int i35 = i12;
                Object[] objArr5 = new Object[i35];
                objArr5[c16] = getmessageversion;
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 - 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1860, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (-16777176) - Color.rgb(0, 0, 0), -562771681, false, $$e(b16, b17, (byte) (-b17)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                $10 = ($11 + 87) % 128;
                i12 = i35;
                c8 = 0;
            }
        }

        public static void getSDKTransactionID(long j9, long j11) throws Throwable {
            int i11 = getSDKAppID + 61;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 == 0) {
                byte b8 = $$a[28];
                byte b11 = (byte) (b8 - 1);
                Object[] objArr = new Object[1];
                a(b8, b11, (byte) (-b11), objArr);
                a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
                throw null;
            }
            byte[] bArr = $$a;
            byte b12 = bArr[28];
            byte b13 = (byte) (b12 - 1);
            Object[] objArr2 = new Object[1];
            a(b12, b13, (byte) (-b13), objArr2);
            a0.B(null, (String) objArr2[0], "AuthenticationRequestParameters");
            try {
                byte b14 = bArr[28];
                byte b15 = (byte) (b14 - 1);
                Object[] objArr3 = new Object[1];
                a(b14, b15, (byte) (-b15), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b16 = bArr[28];
                Object[] objArr4 = new Object[1];
                a((byte) (b16 + 1), bArr[4], b16, objArr4);
                Method method = cls.getMethod((String) objArr4[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr5 = {atd.as.getSDKEphemeralPublicKey.class.getField("getDeviceData").get(null)};
                Object[] objArr6 = new Object[1];
                b(new int[]{-66559487, -761175183}, 3 - Color.blue(0), objArr6);
                Method method2 = Set.class.getMethod(((String) objArr6[0]).intern(), Object.class);
                method2.setAccessible(true);
                int i12 = getSDKAppID + 5;
                getSDKTransactionID = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 11 / 0;
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
            $$a = new byte[]{89, 89, -99, 37, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
            $$b = 82;
        }

        public static void init$1() {
            $$c = new byte[]{95, 99, -67, 61};
            $$d = 10;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
