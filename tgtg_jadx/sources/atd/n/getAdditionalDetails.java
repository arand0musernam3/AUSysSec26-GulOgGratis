package atd.n;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Sku;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSku.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sku.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/build/Sku\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class getAdditionalDetails extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r7, int r8, short r9) {
        /*
            byte[] r0 = atd.n.getAdditionalDetails.$$a
            int r7 = 114 - r7
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r9 = r9 * 3
            int r9 = 4 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r9 = r9 + r3
            int r7 = r7 + 1
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.n.getAdditionalDetails.$$d(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        getSDKAppID();
        View.resolveSizeAndState(0, 0, 0);
        new AuthenticationRequestParameters((byte) 0);
        getDeviceData = (getSDKTransactionID + 51) % 128;
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char[] cArr;
        int[] iArr2;
        int i14;
        int i15;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i16 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKReferenceNumber;
        int i17 = -1667528016;
        Class cls = Integer.TYPE;
        int i18 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i19])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID == null) {
                        i15 = i17;
                        i14 = i16;
                        byte b8 = (byte) i18;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf((CharSequence) "", '0') + 2224, (char) (53070 - View.resolveSizeAndState(i18, i18, i18)), TextUtils.indexOf((CharSequence) "", '0') + 22, 1089703072, false, $$d(b8, b11, b11), new Class[]{cls});
                    } else {
                        i14 = i16;
                        i15 = i17;
                    }
                    iArr4[i19] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i19++;
                    i17 = i15;
                    i16 = i14;
                    i18 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int i21 = i16;
        int i22 = i17;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKReferenceNumber;
        if (iArr6 != null) {
            $10 = ($11 + 105) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i23 = 0;
            while (i23 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i23])};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i22);
                if (sDKTransactionID2 == null) {
                    cArr = cArr2;
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    iArr2 = iArr6;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2224 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (53069 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 22, 1089703072, false, $$d(b12, b13, b13), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                }
                iArr7[i23] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i23++;
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i24 = getmessageversion.getSDKAppID;
            if (i24 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            $11 = ($10 + 73) % 128;
            int i25 = iArr[i24];
            char c3 = (char) (i25 >> 16);
            cArr4[0] = c3;
            char c7 = (char) i25;
            cArr4[1] = c7;
            int i26 = 16;
            char c8 = (char) (iArr[i24 + 1] >> 16);
            cArr4[i21] = c8;
            char c11 = (char) iArr[i24 + 1];
            cArr4[3] = c11;
            getmessageversion.getDeviceData = (c3 << 16) + c7;
            getmessageversion.AuthenticationRequestParameters = (c8 << 16) + c11;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i27 = 0;
            while (true) {
                i12 = getmessageversion.getDeviceData;
                if (i27 >= i26) {
                    break;
                }
                int i28 = i12 ^ iArr5[i27];
                getmessageversion.getDeviceData = i28;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i28);
                Object[] objArr4 = new Object[4];
                objArr4[3] = getmessageversion;
                objArr4[i21] = getmessageversion;
                objArr4[1] = Integer.valueOf(sDKReferenceNumber);
                objArr4[0] = getmessageversion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) i21;
                    byte b15 = (byte) (b14 - 2);
                    i13 = i26;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Gravity.getAbsoluteGravity(0, 0) + 2386, (char) TextUtils.getOffsetBefore("", 0), 19 - View.MeasureSpec.getMode(0), -2040903174, false, $$d(b14, b15, b15), new Class[]{Object.class, cls, Object.class, Object.class});
                } else {
                    i13 = i26;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i27++;
                i26 = i13;
                i21 = 2;
            }
            int i29 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i29;
            getmessageversion.AuthenticationRequestParameters = i12;
            int i31 = i12 ^ iArr5[i26];
            getmessageversion.AuthenticationRequestParameters = i31;
            int i32 = i29 ^ iArr5[17];
            getmessageversion.getDeviceData = i32;
            cArr4[0] = (char) (i32 >>> 16);
            cArr4[1] = (char) i32;
            cArr4[2] = (char) (i31 >>> 16);
            cArr4[3] = (char) i31;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i33 = getmessageversion.getSDKAppID;
            cArr3[i33 * 2] = cArr4[0];
            cArr3[(i33 * 2) + 1] = cArr4[1];
            cArr3[(i33 * 2) + 2] = cArr4[2];
            cArr3[(i33 * 2) + 3] = cArr4[3];
            Object[] objArr5 = {getmessageversion, getmessageversion};
            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID4 == null) {
                byte b16 = (byte) 1;
                byte b17 = (byte) (b16 - 1);
                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(((Process.getThreadPriority(0) + 20) >> 6) + 1861, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 40, -562771681, false, $$d(b16, b17, b17), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID4).invoke(null, objArr5);
            i21 = 2;
        }
    }

    public static void getSDKAppID() {
        getSDKReferenceNumber = new int[]{-1848522606, 110520666, 526282119, -998762175, -1184953075, 1137066672, 763650363, -1679376778, -448087320, -2109578849, 1275517864, -618403402, -1427906319, 905739184, 529167191, -924927861, -1202666371, -396427672};
    }

    public static void init$0() {
        $$a = new byte[]{121, -69, 41, 13};
        $$b = 24;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = atd.n.getAdditionalDetails.getSDKAppID
            int r0 = r0 + 103
            int r0 = r0 % 128
            atd.n.getAdditionalDetails.AuthenticationRequestParameters = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L16
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED
            r0.<init>(r1)
            return r0
        L16:
            java.lang.String r0 = android.os.Build.SKU
            r1 = 867495657(0x33b4eee9, float:8.425361E-8)
            r2 = -1688766328(0xffffffff9b577888, float:-1.7823329E-22)
            r3 = 1939249280(0x73969880, float:2.3862842E31)
            r4 = -1155729284(0xffffffffbb1cf87c, float:-0.002395182)
            int[] r1 = new int[]{r3, r4, r1, r2}
            float r2 = android.view.ViewConfiguration.getScrollFriction()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            int r2 = 8 - r2
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r1, r2, r3)
            r1 = 0
            r1 = r3[r1]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 != 0) goto L5a
            int r1 = atd.n.getAdditionalDetails.AuthenticationRequestParameters
            int r2 = r1 + 95
            int r3 = r2 % 128
            atd.n.getAdditionalDetails.getSDKAppID = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L53
            goto L5a
        L53:
            int r1 = r1 + 113
            int r1 = r1 % 128
            atd.n.getAdditionalDetails.getSDKAppID = r1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            if (r0 == 0) goto L66
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        L66:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.n.getAdditionalDetails.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Sku$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
