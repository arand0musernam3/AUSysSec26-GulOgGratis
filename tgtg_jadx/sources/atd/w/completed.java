package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkCountryIso;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkCountryIso.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkCountryIso.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkCountryIso\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class completed extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 1;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 0;
    private static byte[] getSDKAppID = null;
    private static int getSDKEphemeralPublicKey = 1;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        getSDKAppID();
        View.resolveSizeAndState(0, 0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        View.resolveSize(0, 0);
        ViewConfiguration.getTouchSlop();
        ExpandableListView.getPackedPositionForGroup(0);
        new getDeviceData((byte) 0);
        getMessageVersion = (getSDKEphemeralPublicKey + 75) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public completed(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = -1313932819;
        getDeviceData = 829166668;
        getSDKReferenceNumber = 802871317;
        getSDKAppID = new byte[]{43, 35, -52, 35};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult != null) {
            getSDKTransactionID = (ChallengeResult + 27) % 128;
            String networkCountryIso = telephonyManagerChallengeResult.getNetworkCountryIso();
            if (networkCountryIso != null) {
                getSDKTransactionID = (ChallengeResult + 19) % 128;
                if (networkCountryIso.length() == 2) {
                    getSDKTransactionID = (ChallengeResult + 15) % 128;
                } else {
                    networkCountryIso = null;
                }
                if (networkCountryIso != null) {
                    int i11 = getSDKTransactionID + 11;
                    ChallengeResult = i11 % 128;
                    if (i11 % 2 != 0) {
                        return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(networkCountryIso));
                    }
                    int i12 = 31 / 0;
                    return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(networkCountryIso));
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkCountryIso$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "LENGTH", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static char[] getDeviceData;
        private static int getSDKReferenceNumber;
        private static int getSDKTransactionID;

        private static String $$e(byte b8, byte b11, int i11) {
            int i12 = b8 * 2;
            int i13 = i11 + 4;
            byte[] bArr = $$c;
            int i14 = 122 - b11;
            byte[] bArr2 = new byte[i12 + 1];
            int i15 = -1;
            if (bArr == null) {
                i14 += i13;
                i13 = i13;
                bArr = bArr;
                i15 = -1;
            }
            while (true) {
                int i16 = i15 + 1;
                bArr2[i16] = (byte) i14;
                int i17 = i13 + 1;
                if (i16 == i12) {
                    return new String(bArr2, 0);
                }
                byte[] bArr3 = bArr;
                i14 += bArr[i17];
                i13 = i17;
                bArr = bArr3;
                i15 = i16;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKReferenceNumber = 1;
            getDeviceData = new char[]{19806, 19805, 30887, 30882};
            AuthenticationRequestParameters = (char) 19806;
        }

        private getDeviceData() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 15
                int r7 = 26 - r7
                int r8 = r8 * 25
                int r8 = r8 + 4
                int r9 = r9 * 6
                int r9 = r9 + 97
                byte[] r0 = atd.w.completed.getDeviceData.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L18
                r9 = r8
                r3 = r0
                r4 = r2
                r0 = r7
                goto L2f
            L18:
                r3 = r2
            L19:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r0
                r0 = r6
            L2f:
                int r0 = r0 + r8
                int r8 = r0 + (-5)
                int r9 = r9 + 1
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.completed.getDeviceData.a(short, short, short, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, byte b8, Object[] objArr) throws Throwable {
            int i12;
            char c3;
            int i13;
            char c7;
            char c8;
            char c11;
            int length;
            char[] cArr;
            int i14;
            char c12;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
            char[] cArr2 = getDeviceData;
            Class cls = Integer.TYPE;
            int i15 = -317146529;
            char c13 = 2;
            int i16 = 0;
            if (cArr2 != null) {
                int i17 = $11 + 103;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                }
                int i18 = 0;
                while (i18 < length) {
                    $10 = ($11 + 65) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i18])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i15);
                        if (sDKTransactionID == null) {
                            i14 = i15;
                            c12 = c13;
                            byte b11 = (byte) i16;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(Process.getGidForName("") + 2159, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 37 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 829471823, false, $$e(b11, (byte) (b11 | 57), (byte) (-1)), new Class[]{cls});
                        } else {
                            i14 = i15;
                            c12 = c13;
                        }
                        cArr[i18] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i18++;
                        i15 = i14;
                        c13 = c12;
                        i16 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            int i19 = i15;
            char c14 = c13;
            Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i19);
            char c15 = '\b';
            if (sDKTransactionID2 == null) {
                byte b12 = (byte) 0;
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2158 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36, 829471823, false, $$e(b12, (byte) (b12 | 57), (byte) (-1)), new Class[]{cls});
            }
            char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i11];
            if (i11 % 2 != 0) {
                i12 = i11 - 1;
                cArr3[i12] = (char) (charArray[i12] - b8);
            } else {
                i12 = i11;
            }
            int i21 = 1;
            if (i12 > 1) {
                char c16 = '\t';
                int i22 = $10 + 9;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                challengeResultKt.getSDKReferenceNumber = 0;
                while (true) {
                    int i24 = challengeResultKt.getSDKReferenceNumber;
                    if (i24 >= i12) {
                        break;
                    }
                    char c17 = charArray[i24];
                    challengeResultKt.getDeviceData = c17;
                    char c18 = charArray[i24 + 1];
                    challengeResultKt.getSDKAppID = c18;
                    if (c17 == c18) {
                        cArr3[i24] = (char) (c17 - b8);
                        cArr3[i24 + 1] = (char) (c18 - b8);
                        c3 = c15;
                        i13 = i21;
                        c7 = c16;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = challengeResultKt;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = challengeResultKt;
                        objArr4[c16] = challengeResultKt;
                        objArr4[c15] = Integer.valueOf(cCharValue);
                        objArr4[7] = challengeResultKt;
                        objArr4[6] = challengeResultKt;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = challengeResultKt;
                        objArr4[3] = challengeResultKt;
                        objArr4[c14] = Integer.valueOf(cCharValue);
                        objArr4[i21] = challengeResultKt;
                        objArr4[0] = challengeResultKt;
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                        if (sDKTransactionID3 == null) {
                            c3 = c15;
                            int i25 = 1259 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            c7 = c16;
                            char c19 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34413);
                            c8 = '\n';
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 41;
                            c11 = 7;
                            byte b13 = (byte) 0;
                            i13 = i21;
                            String str$$e = $$e(b13, (byte) (b13 | 55), (byte) (-1));
                            Class cls2 = Integer.TYPE;
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(i25, c19, iIndexOf, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            c3 = c15;
                            i13 = i21;
                            c7 = c16;
                            c8 = '\n';
                            c11 = 7;
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                        int i26 = challengeResultKt.ChallengeResultCancelled;
                        if (iIntValue == i26) {
                            Object[] objArr5 = new Object[11];
                            objArr5[c8] = challengeResultKt;
                            objArr5[c7] = Integer.valueOf(cCharValue);
                            objArr5[c3] = challengeResultKt;
                            objArr5[c11] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = challengeResultKt;
                            objArr5[4] = challengeResultKt;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[c14] = Integer.valueOf(cCharValue);
                            objArr5[i13] = challengeResultKt;
                            objArr5[0] = challengeResultKt;
                            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                            if (sDKTransactionID4 == null) {
                                int iRgb = Color.rgb(0, 0, 0) + 16779439;
                                char c21 = (char) (53070 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 21;
                                byte b14 = (byte) 0;
                                byte b15 = b14;
                                String str$$e2 = $$e(b14, b15, (byte) (b15 - 1));
                                Class cls3 = Integer.TYPE;
                                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iRgb, c21, keyRepeatDelay, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                            int i27 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                            int i28 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i28] = cArr2[iIntValue2];
                            cArr3[i28 + 1] = cArr2[i27];
                        } else {
                            int i29 = challengeResultKt.AuthenticationRequestParameters;
                            int i31 = challengeResultKt.getSDKTransactionID;
                            if (i29 == i31) {
                                $10 = ($11 + 61) % 128;
                                int i32 = i13;
                                int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, i32, cCharValue);
                                challengeResultKt.getMessageVersion = iC;
                                int iC2 = k.c(i26, cCharValue, i32, cCharValue);
                                challengeResultKt.ChallengeResultCancelled = iC2;
                                int i33 = (i31 * cCharValue) + iC2;
                                int i34 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i34] = cArr2[(i29 * cCharValue) + iC];
                                cArr3[i34 + i32] = cArr2[i33];
                                i13 = 1;
                            } else {
                                int i35 = (i29 * cCharValue) + i26;
                                int i36 = (i31 * cCharValue) + challengeResultKt.getMessageVersion;
                                int i37 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i37] = cArr2[i35];
                                i13 = 1;
                                cArr3[i37 + 1] = cArr2[i36];
                            }
                        }
                    }
                    challengeResultKt.getSDKReferenceNumber += 2;
                    c16 = c7;
                    c15 = c3;
                    i21 = i13;
                }
            }
            for (int i38 = 0; i38 < i11; i38++) {
                $10 = ($11 + 85) % 128;
                cArr3[i38] = (char) (cArr3[i38] ^ 13722);
            }
            String str2 = new String(cArr3);
            int i39 = $11 + 35;
            $10 = i39 % 128;
            if (i39 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        private static void getDeviceData() throws Throwable {
            byte[] bArr = $$a;
            byte b8 = bArr[28];
            byte b11 = b8;
            Object[] objArr = new Object[1];
            a(b8, b11, b11, objArr);
            a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
            int i11 = (getSDKReferenceNumber + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
            getSDKTransactionID = i11;
            getSDKReferenceNumber = (i11 + 111) % 128;
            try {
                byte b12 = bArr[28];
                byte b13 = b12;
                Object[] objArr2 = new Object[1];
                a(b12, b13, b13, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b14 = (byte) ($$b & 5);
                byte b15 = b14;
                Object[] objArr3 = new Object[1];
                a(b14, b15, b15, objArr3);
                Method method = cls.getMethod((String) objArr3[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr4 = {atd.as.getSDKReferenceNumber.class.getField("getDeviceData").get(null)};
                Object[] objArr5 = new Object[1];
                b("\u0003\u0002㘋", 3 - (Process.myPid() >> 22), (byte) (13 - Drawable.resolveOpacity(0, 0)), objArr5);
                Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
                method2.setAccessible(true);
                getSDKTransactionID = (getSDKReferenceNumber + 43) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        public static void init$0() {
            $$a = new byte[]{9, -55, 81, 14, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
            $$b = AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED;
        }

        public static void init$1() {
            $$c = new byte[]{33, 102, -32, 123};
            $$d = 86;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
