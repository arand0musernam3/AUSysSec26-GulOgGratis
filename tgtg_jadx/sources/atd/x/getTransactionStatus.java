package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/RttCallingMode;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRttCallingMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RttCallingMode.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/RttCallingMode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class getTransactionStatus extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static char[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = atd.x.getTransactionStatus.$$a
            int r7 = r7 + 65
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r3
            r3 = r5
        L2b:
            int r7 = r7 + r8
            r8 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getTransactionStatus.$$d(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getSDKTransactionID();
        ViewConfiguration.getFadingEdgeLength();
        KeyEvent.getMaxKeyCode();
        new getSDKTransactionID((byte) 0);
        getMessageVersion = (ChallengeResultCancelled + 31) % 128;
    }

    private getTransactionStatus(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        char c3;
        char c7;
        char c8;
        int i15;
        char c11;
        int i16;
        int i17 = ($11 + 115) % 128;
        $10 = i17;
        char c12 = 2;
        if (str != null) {
            int i18 = i17 + 99;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
        char[] cArr2 = getDeviceData;
        Class cls = Integer.TYPE;
        int i19 = -317146529;
        char c13 = '0';
        int i21 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            $10 = ($11 + 45) % 128;
            int i22 = 0;
            while (i22 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i22])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i19);
                    if (sDKTransactionID == null) {
                        c11 = c12;
                        byte b11 = (byte) 0;
                        i16 = i19;
                        byte b12 = b11;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData((-16775058) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 35 - TextUtils.indexOf("", c13, 0), 829471823, false, $$d(b11, b12, b12), new Class[]{cls});
                    } else {
                        c11 = c12;
                        i16 = i19;
                    }
                    cArr3[i22] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i22++;
                    i19 = i16;
                    c12 = c11;
                    c13 = '0';
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
        char c14 = c12;
        int i23 = i19;
        Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i23);
        if (sDKTransactionID2 == null) {
            byte b13 = (byte) 0;
            byte b14 = b13;
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2158, (char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 36, 829471823, false, $$d(b13, b14, b14), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            int i24 = $11 + 95;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                i12 = i11 + 127;
                cArr4[i12] = (char) (cArr[i12] + b8);
            } else {
                i12 = i11 - 1;
                cArr4[i12] = (char) (cArr[i12] - b8);
            }
        } else {
            i12 = i11;
        }
        int i25 = 1;
        if (i12 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i26 = challengeResultKt.getSDKReferenceNumber;
                if (i26 >= i12) {
                    break;
                }
                char c15 = cArr[i26];
                challengeResultKt.getDeviceData = c15;
                char c16 = cArr[i26 + 1];
                challengeResultKt.getSDKAppID = c16;
                if (c15 == c16) {
                    cArr4[i26] = (char) (c15 - b8);
                    cArr4[i26 + 1] = (char) (c16 - b8);
                    i15 = i25;
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
                    objArr4[3] = challengeResultKt;
                    objArr4[c14] = Integer.valueOf(cCharValue);
                    objArr4[i25] = challengeResultKt;
                    objArr4[i21] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c3 = '\n';
                        int i27 = 1257 - (ExpandableListView.getPackedPositionForChild(i21, i21) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i21, i21) == 0L ? 0 : -1));
                        c7 = '\t';
                        c8 = 7;
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i21, i21) + 34415);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i21, i21) + 42;
                        byte b15 = (byte) i21;
                        i13 = i25;
                        byte b16 = (byte) (b15 + 2);
                        i14 = i21;
                        String str$$d = $$d(b15, b16, (byte) (b16 - 2));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(i27, cIndexOf, iLastIndexOf, -307955329, false, str$$d, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i13 = i25;
                        i14 = i21;
                        c3 = '\n';
                        c7 = '\t';
                        c8 = 7;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i28 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i28) {
                        Object[] objArr5 = new Object[11];
                        objArr5[c3] = challengeResultKt;
                        objArr5[c7] = Integer.valueOf(cCharValue);
                        objArr5[8] = challengeResultKt;
                        objArr5[c8] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c14] = Integer.valueOf(cCharValue);
                        objArr5[i13] = challengeResultKt;
                        objArr5[i14] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int i29 = 2224 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int i31 = i14;
                            char c17 = (char) (53069 - (ExpandableListView.getPackedPositionForChild(i31, i31) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i31, i31) == 0L ? 0 : -1)));
                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', i31, i31) + 22;
                            byte b17 = (byte) i31;
                            String str$$d2 = $$d(b17, (byte) (b17 | 57), b17);
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(i29, c17, iLastIndexOf2, 246098488, false, str$$d2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i32 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i33 = challengeResultKt.getSDKReferenceNumber;
                        cArr4[i33] = cArr2[iIntValue2];
                        cArr4[i33 + 1] = cArr2[i32];
                        i15 = i13;
                    } else {
                        int i34 = challengeResultKt.AuthenticationRequestParameters;
                        int i35 = challengeResultKt.getSDKTransactionID;
                        int i36 = challengeResultKt.getMessageVersion;
                        if (i34 == i35) {
                            i15 = i13;
                            int iC = k.c(i36, cCharValue, i15, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i28, cCharValue, i15, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i37 = (i35 * cCharValue) + iC2;
                            int i38 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i38] = cArr2[(i34 * cCharValue) + iC];
                            cArr4[i38 + i15] = cArr2[i37];
                        } else {
                            i15 = i13;
                            int i39 = (i34 * cCharValue) + i28;
                            int i41 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i41] = cArr2[i39];
                            cArr4[i41 + i15] = cArr2[(i35 * cCharValue) + i36];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                i25 = i15;
                i21 = 0;
            }
        }
        for (int i42 = 0; i42 < i11; i42++) {
            cArr4[i42] = (char) (cArr4[i42] ^ 13722);
        }
        String str2 = new String(cArr4);
        $10 = ($11 + 95) % 128;
        objArr[0] = str2;
    }

    public static void getSDKTransactionID() {
        getDeviceData = new char[]{30887, 31582, 31583, 30881, 30895, 30967, 30900, 30873, 30963, 30966, 31581, 30888, 30882, 30891, 31580, 30880, 30890, 31576, 31577, 30898, 30883, 31578, 30885, 30855, 30889};
        AuthenticationRequestParameters = (char) 19801;
    }

    public static void init$0() {
        $$a = new byte[]{46, -100, -124, -10};
        $$b = 117;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Boolean sDKTransactionID;
        getSDKAppID = (getSDKTransactionID + 79) % 128;
        if (Build.VERSION.SDK_INT >= 28) {
            atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
            Object[] objArr = new Object[1];
            b(16 - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (99 - Gravity.getAbsoluteGravity(0, 0)), "\t\u0010\u0011\t\u0014\u0002㙙㙙\u0001\u000e\u0002\b\u000e\u0017\n\u0016", objArr);
            String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
            return (strAuthenticationRequestParameters == null || (sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters)) == null) ? new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK) : a0.h(sDKTransactionID);
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        int i11 = getSDKTransactionID + 13;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return failure;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/RttCallingMode$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        public static int getDeviceData;
        public static int getSDKAppID;

        private getSDKTransactionID() {
        }

        public static int getSDKTransactionID() {
            int i11 = getSDKAppID;
            int i12 = i11 % 5232821;
            getSDKAppID = i11 + 1;
            if (i12 != 0) {
                return getDeviceData;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            getDeviceData = iFreeMemory;
            return iFreeMemory;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getTransactionStatus(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
