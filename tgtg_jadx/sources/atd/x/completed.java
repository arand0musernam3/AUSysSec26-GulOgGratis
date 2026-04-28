package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SkipFirstUseHints;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSkipFirstUseHints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipFirstUseHints.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SkipFirstUseHints\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class completed extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r6, byte r7, short r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r7 = r7 + 65
            byte[] r1 = atd.x.completed.$$a
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r7
            r7 = r6
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r1
            r1 = r7
            r7 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.completed.$$d(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters = 0;
        getSDKTransactionID = 1;
        getSDKAppID();
        ViewConfiguration.getKeyRepeatDelay();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        new getSDKTransactionID((byte) 0);
        ChallengeResultCancelled = (ChallengeResult + 33) % 128;
    }

    private completed(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
        int i12;
        float f11;
        char c3;
        char c7;
        char c8;
        char c11;
        char c12;
        int i13;
        int length;
        char[] cArr;
        int i14;
        int i15;
        char c13;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i16 = 11;
        char c14 = 2;
        if (cArr2 != null) {
            int i17 = $11 + 11;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i14 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i14 = 0;
            }
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-317146529);
                    if (sDKTransactionID == null) {
                        c13 = c14;
                        byte b11 = (byte) 0;
                        i15 = i16;
                        byte b12 = b11;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2157 - ExpandableListView.getPackedPositionChild(0L), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 36, 829471823, false, $$d(b11, b12, b12), new Class[]{cls});
                    } else {
                        i15 = i16;
                        c13 = c14;
                    }
                    cArr[i14] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i14++;
                    c14 = c13;
                    i16 = i15;
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
        int i18 = i16;
        char c15 = c14;
        Object[] objArr3 = {Integer.valueOf(getDeviceData)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-317146529);
        float f12 = 0.0f;
        char c16 = 6;
        if (sDKTransactionID2 == null) {
            byte b13 = (byte) 0;
            byte b14 = b13;
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2157, (char) Color.green(0), 36 - ((Process.getThreadPriority(0) + 20) >> 6), 829471823, false, $$d(b13, b14, b14), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr3[i12] = (char) (charArray[i12] - b8);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i19 = challengeResultKt.getSDKReferenceNumber;
                if (i19 >= i12) {
                    break;
                }
                int i21 = $10;
                $11 = (i21 + 77) % 128;
                char c17 = charArray[i19];
                challengeResultKt.getDeviceData = c17;
                char c18 = charArray[i19 + 1];
                challengeResultKt.getSDKAppID = c18;
                if (c17 == c18) {
                    int i22 = i21 + 13;
                    $11 = i22 % 128;
                    if (i22 % 2 == 0) {
                        cArr3[i19] = (char) (c17 >>> b8);
                        cArr3[i19] = (char) (c18 % b8);
                    } else {
                        cArr3[i19] = (char) (c17 - b8);
                        cArr3[i19 + 1] = (char) (c18 - b8);
                    }
                    f11 = f12;
                    c3 = c16;
                    i13 = i18;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[i18] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[c16] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[3] = challengeResultKt;
                    objArr4[c15] = Integer.valueOf(cCharValue);
                    objArr4[1] = challengeResultKt;
                    objArr4[0] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    f11 = f12;
                    if (sDKTransactionID3 == null) {
                        c3 = c16;
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 1258;
                        c7 = '\n';
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 34414);
                        int i23 = (TypedValue.complexToFloat(0) > f11 ? 1 : (TypedValue.complexToFloat(0) == f11 ? 0 : -1)) + 41;
                        c8 = '\t';
                        byte b15 = (byte) 0;
                        c11 = 7;
                        byte b16 = (byte) (b15 + 2);
                        c12 = '\b';
                        String str$$d = $$d(b15, b16, (byte) (b16 - 2));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iIndexOf, cArgb, i23, -307955329, false, str$$d, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c3 = c16;
                        c7 = '\n';
                        c8 = '\t';
                        c11 = 7;
                        c12 = '\b';
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i24 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i24) {
                        i13 = i18;
                        Object[] objArr5 = new Object[i13];
                        objArr5[c7] = challengeResultKt;
                        objArr5[c8] = Integer.valueOf(cCharValue);
                        objArr5[c12] = challengeResultKt;
                        objArr5[c11] = Integer.valueOf(cCharValue);
                        objArr5[c3] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c15] = Integer.valueOf(cCharValue);
                        objArr5[1] = challengeResultKt;
                        objArr5[0] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int gidForName = Process.getGidForName("") + 2224;
                            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 53070);
                            int iIndexOf2 = TextUtils.indexOf("", "") + 21;
                            byte b17 = (byte) 0;
                            String str$$d2 = $$d(b17, (byte) (b17 | 57), b17);
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(gidForName, packedPositionType, iIndexOf2, 246098488, false, str$$d2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i25 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i26 = challengeResultKt.getSDKReferenceNumber;
                        cArr3[i26] = cArr2[iIntValue2];
                        cArr3[i26 + 1] = cArr2[i25];
                    } else {
                        i13 = i18;
                        int i27 = challengeResultKt.AuthenticationRequestParameters;
                        int i28 = challengeResultKt.getSDKTransactionID;
                        if (i27 == i28) {
                            $11 = ($10 + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
                            int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, 1, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i24, cCharValue, 1, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i29 = (i28 * cCharValue) + iC2;
                            int i31 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i31] = cArr2[(i27 * cCharValue) + iC];
                            cArr3[i31 + 1] = cArr2[i29];
                        } else {
                            int i32 = (i27 * cCharValue) + i24;
                            int i33 = (i28 * cCharValue) + challengeResultKt.getMessageVersion;
                            int i34 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i34] = cArr2[i32];
                            cArr3[i34 + 1] = cArr2[i33];
                            challengeResultKt.getSDKReferenceNumber += 2;
                            f12 = f11;
                            i18 = i13;
                            c16 = c3;
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                f12 = f11;
                i18 = i13;
                c16 = c3;
            }
        }
        int i35 = 0;
        while (i35 < i11) {
            cArr3[i35] = (char) (cArr3[i35] ^ 13722);
            i35++;
            $11 = ($10 + 23) % 128;
        }
        objArr[0] = new String(cArr3);
    }

    public static void getSDKAppID() {
        getSDKAppID = new char[]{30902, 30893, 30855, 30883, 30888, 30966, 30961, 30880, 30894, 30898, 30899, 30900, 30974, 30895, 30901, 30873};
        getDeviceData = (char) 19800;
    }

    public static void init$0() {
        $$a = new byte[]{48, -117, 71, 27};
        $$b = 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[PHI: r0
      0x005c: PHI (r0v10 java.lang.String) = (r0v9 java.lang.String), (r0v23 java.lang.String) binds: [B:8:0x005a, B:5:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = atd.x.completed.AuthenticationRequestParameters
            int r0 = r0 + 119
            int r1 = r0 % 128
            atd.x.completed.getSDKTransactionID = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r7.getSDKReferenceNumber
            r2 = 0
            r3 = 1
            java.lang.String r4 = "\r\u0002\f\u0001\u0003\u000b\u000f\t\r\n\u000e\u000b\u000f\u0002\f\u000b\f\u0005\n\r"
            if (r0 != 0) goto L38
            int r0 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r0 = r0 * 58
            int r0 = r0 + 82
            int r5 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r5 = r5 * 127
            r6 = 39
            int r6 = r6 % r5
            byte r5 = (byte) r6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r0, r5, r4, r3)
            r0 = r3[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L88
            goto L5c
        L38:
            int r0 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r0 = r0 >> 16
            int r0 = r0 + 20
            int r5 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r5 = r5 >> 16
            int r5 = 58 - r5
            byte r5 = (byte) r5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r0, r5, r4, r3)
            r0 = r3[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L88
        L5c:
            int r1 = atd.x.completed.AuthenticationRequestParameters
            int r1 = r1 + 27
            int r1 = r1 % 128
            atd.x.completed.getSDKTransactionID = r1
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L88
            int r1 = atd.x.completed.getSDKTransactionID
            int r1 = r1 + 59
            int r2 = r1 % 128
            atd.x.completed.AuthenticationRequestParameters = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L7b
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            return r0
        L7b:
            boolean r0 = r0.booleanValue()
            boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m130constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m129boximpl(r0)
            r0 = 0
            throw r0
        L88:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.completed.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SkipFirstUseHints$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        public static int getDeviceData;
        public static int getSDKTransactionID;

        private getSDKTransactionID() {
        }

        public static int AuthenticationRequestParameters() {
            int i11 = getDeviceData;
            int i12 = i11 % 8213682;
            getDeviceData = i11 + 1;
            if (i12 != 0) {
                return getSDKTransactionID;
            }
            int i13 = (int) Runtime.getRuntime().totalMemory();
            getSDKTransactionID = i13;
            return i13;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ completed(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
