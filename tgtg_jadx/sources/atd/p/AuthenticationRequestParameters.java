package atd.p;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AirplaneModeRadios;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAirplaneModeRadios.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirplaneModeRadios.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AirplaneModeRadios\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, short r7, int r8) {
        /*
            int r8 = 119 - r8
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 + 4
            byte[] r1 = atd.p.AuthenticationRequestParameters.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r8 = r6
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2e
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2e:
            int r6 = r6 + r1
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.AuthenticationRequestParameters.$$d(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getMessageVersion = 1;
        getSDKTransactionID = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID();
        Process.getGidForName("");
        Color.rgb(0, 0, 0);
        new getSDKAppID((byte) 0);
        int i11 = ChallengeResult + 121;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private AuthenticationRequestParameters(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    private static void b(int i11, String str, String str2, char c3, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        int i12;
        int i13;
        int i14;
        char c7;
        if (str3 != null) {
            charArray = str3.toCharArray();
            $10 = ($11 + 25) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $11 = ($10 + 7) % 128;
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        onCompletion oncompletion = new onCompletion();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        int i15 = 0;
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        int i16 = 2;
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = charArray3.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $10 = ($11 + 59) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) (-1);
                    i12 = i16;
                    byte b11 = (byte) (b8 + 1);
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2069 - TextUtils.indexOf("", ""), (char) (44657 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 32 - Color.green(i15), -397560981, false, $$d(b8, b11, (byte) (b11 + 2)), new Class[]{Object.class});
                } else {
                    i12 = i16;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3095;
                    char offsetBefore = (char) (14367 - TextUtils.getOffsetBefore("", i15));
                    int iResolveOpacity = Drawable.resolveOpacity(i15, i15) + 18;
                    i13 = i15;
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(packedPositionGroup, offsetBefore, iResolveOpacity, -1211924053, false, $$d(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class});
                } else {
                    i13 = i15;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i17 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int i18 = i13;
                    int iResolveOpacity2 = 1428 - Drawable.resolveOpacity(i18, i18);
                    c7 = 1;
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int i19 = (TypedValue.complexToFloat(i18) > 0.0f ? 1 : (TypedValue.complexToFloat(i18) == 0.0f ? 0 : -1)) + 30;
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    i14 = iIntValue2;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iResolveOpacity2, cAxisFromString, i19, -1183253656, false, $$d(b14, b15, b15), new Class[]{Object.class, cls, cls});
                } else {
                    i14 = iIntValue2;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i21 = cArr3[i14] * 32718;
                int i22 = i12;
                Object[] objArr5 = new Object[i22];
                objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[0] = Integer.valueOf(i21);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) (-1);
                    byte b17 = (byte) (b16 + 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2773 - TextUtils.lastIndexOf("", '0'), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13060), 25 - View.combineMeasuredStates(0, 0), -320602145, false, $$d(b16, b17, (byte) (b17 | 51)), new Class[]{cls, cls});
                }
                cArr4[i14] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[i14] = oncompletion.AuthenticationRequestParameters;
                int i23 = oncompletion.getDeviceData;
                cArr5[i23] = (char) (((((long) (r0 ^ charArray3[i23])) ^ (getSDKReferenceNumber ^ 1905653906042338631L)) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKAppID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i23 + 1;
                i16 = i22;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    public static void getSDKAppID() {
        getSDKReferenceNumber = 1905653906042338631L;
        AuthenticationRequestParameters = -2038612665;
        getSDKAppID = (char) 51971;
    }

    public static void init$0() {
        $$a = new byte[]{101, -112, -32, 38};
        $$b = 112;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        return com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005f, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        atd.p.AuthenticationRequestParameters.ChallengeResultCancelled = (atd.p.AuthenticationRequestParameters.getSDKTransactionID + 77) % 128;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = atd.p.AuthenticationRequestParameters.ChallengeResultCancelled
            int r0 = r0 + 71
            int r1 = r0 % 128
            atd.p.AuthenticationRequestParameters.getSDKTransactionID = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r13.getDeviceData
            r2 = 0
            java.lang.String r3 = ""
            r4 = -1
            r6 = 1
            if (r0 == 0) goto L3b
            long r7 = android.os.SystemClock.currentThreadTimeMillis()
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            int r7 = r6 >>> r0
            int r0 = android.view.KeyEvent.keyCodeFromString(r3)
            char r10 = (char) r0
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r8 = "홥ꆙ\uf6fb\u0006"
            java.lang.String r9 = "ﵪ뛠\udf67囐薶繖\uf20e佝鯠髨邪쯓⌒ዹ䷴较⬭\uea64ᪿ\ue9b8"
            java.lang.String r11 = "\u0000\u0000\u0000\u0000"
            b(r7, r8, r9, r10, r11, r12)
            r0 = r12[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L72
            goto L61
        L3b:
            long r7 = android.os.SystemClock.currentThreadTimeMillis()
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            int r7 = 1 - r0
            int r0 = android.view.KeyEvent.keyCodeFromString(r3)
            char r10 = (char) r0
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r8 = "홥ꆙ\uf6fb\u0006"
            java.lang.String r9 = "ﵪ뛠\udf67囐薶繖\uf20e佝鯠髨邪쯓⌒ዹ䷴较⬭\uea64ᪿ\ue9b8"
            java.lang.String r11 = "\u0000\u0000\u0000\u0000"
            b(r7, r8, r9, r10, r11, r12)
            r0 = r12[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L72
        L61:
            int r1 = atd.p.AuthenticationRequestParameters.getSDKTransactionID
            int r1 = r1 + 77
            int r1 = r1 % 128
            atd.p.AuthenticationRequestParameters.ChallengeResultCancelled = r1
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        L72:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.AuthenticationRequestParameters.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AirplaneModeRadios$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ AuthenticationRequestParameters(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
