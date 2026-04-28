package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.app.tgtg.model.local.AppConstants;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AllowedGeolocationOrigins;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAllowedGeolocationOrigins.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllowedGeolocationOrigins.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AllowedGeolocationOrigins\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class getSDKReferenceNumber extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    private static String $$d(short s7, int i11, short s8) {
        int i12 = (i11 * 4) + 111;
        int i13 = s7 * 2;
        int i14 = 3 - (s8 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i13];
        int i15 = 0 - i13;
        int i16 = -1;
        if (bArr == null) {
            i12 += i15;
        }
        while (true) {
            i16++;
            i14++;
            bArr2[i16] = (byte) i12;
            if (i16 == i15) {
                return new String(bArr2, 0);
            }
            i12 += bArr[i14];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID();
        TextUtils.getOffsetAfter("", 0);
        new AuthenticationRequestParameters((byte) 0);
        getSDKEphemeralPublicKey = (BuildConfig + 93) % 128;
    }

    private getSDKReferenceNumber(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        int i12;
        long j9;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        char c3 = '0';
        int i13 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i13;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2554 - TextUtils.indexOf("", c3, i13), (char) (48598 - TextUtils.getOffsetAfter("", i13)), 31 - (ViewConfiguration.getLongPressTimeout() >> 16), -390605202, false, $$d(b8, b11, b11), new Class[]{cls});
                    }
                    cArr2[i14] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i14++;
                    c3 = '0';
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 25) % 128;
            cArr = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        long j11 = 0;
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(ExpandableListView.getPackedPositionGroup(0L) + 147, (char) View.getDefaultSize(0, 0), View.resolveSize(0, 0) + 32, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i15 = 1124287645;
        if (getSDKAppID) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr3 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i16 = challengeResultTimeout.getSDKAppID;
                int i17 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                int i18 = $11 + 45;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr3[i16] = (char) (cArr[bArr[i17 >>> i16] / i11] << iIntValue);
                    Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i15);
                    if (sDKTransactionID3 == null) {
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1698;
                        i12 = i15;
                        char cBlue = (char) Color.blue(0);
                        int i19 = 30 - (ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1));
                        j9 = j11;
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 1);
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iIndexOf, cBlue, i19, -1620360563, false, $$d(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                    } else {
                        i12 = i15;
                        j9 = j11;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                } else {
                    i12 = i15;
                    j9 = j11;
                    cArr3[i16] = (char) (cArr[bArr[(i17 - 1) - i16] + i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(i12);
                    if (sDKTransactionID4 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 + 1);
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(Color.rgb(0, 0, 0) + 16778913, (char) Gravity.getAbsoluteGravity(0, 0), (SystemClock.uptimeMillis() > j9 ? 1 : (SystemClock.uptimeMillis() == j9 ? 0 : -1)) + 28, -1620360563, false, $$d(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                }
                i15 = i12;
                j11 = j9;
            }
        } else if (getSDKTransactionID) {
            $10 = ($11 + 115) % 128;
            int length3 = charArray.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr4 = new char[length3];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i21 = challengeResultTimeout.getSDKAppID;
                int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i21] = (char) (cArr[charArray[(i22 - 1) - i21] - i11] - iIntValue);
                Object[] objArr6 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID5 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 + 1);
                    sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(View.MeasureSpec.getMode(0) + 1697, (char) TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 29, -1620360563, false, $$d(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID5).invoke(null, objArr6);
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr5 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i23 = challengeResultTimeout.getSDKAppID;
                int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i23] = (char) (cArr[iArr[(i24 - 1) - i23] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i23 + 1;
                }
            }
        }
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{21725, 21704, 21711, 21751, 21697, 21696, 21727, 21703, 21699, 21744, 21701, 21710, 21746, 21747, 21693, 21644, 21686, 21684};
        getSDKReferenceNumber = 1286296700;
        getSDKTransactionID = true;
        getSDKAppID = true;
    }

    public static void init$0() {
        $$a = new byte[]{11, -110, -81, 44};
        $$b = AppConstants.RESULT_CODE_FLASH_SALES_SURVEY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        return com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        atd.x.getSDKReferenceNumber.ChallengeResultCancelled = (atd.x.getSDKReferenceNumber.ChallengeResult + 13) % 128;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = atd.x.getSDKReferenceNumber.ChallengeResultCancelled
            int r0 = r0 + 13
            int r1 = r0 % 128
            atd.x.getSDKReferenceNumber.ChallengeResult = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r7.getDeviceData
            r2 = 0
            r3 = 1
            java.lang.String r4 = "\u008e\u008c\u008b\u0088\u008b\u008d\u0083\u0087\u008c\u0083\u008b\u008a\u0081\u0089\u0083\u0082\u0083\u0085\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0082\u0081"
            java.lang.String r5 = ""
            r6 = 0
            if (r0 == 0) goto L31
            r0 = 99
            int r0 = android.text.TextUtils.indexOf(r5, r0)
            int r0 = 4794 - r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r6, r6, r0, r4, r3)
            r0 = r3[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L5d
            goto L4c
        L31:
            r0 = 48
            int r0 = android.text.TextUtils.indexOf(r5, r0)
            int r0 = r0 + 128
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r6, r6, r0, r4, r3)
            r0 = r3[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L5d
        L4c:
            int r1 = atd.x.getSDKReferenceNumber.ChallengeResult
            int r1 = r1 + 13
            int r1 = r1 % 128
            atd.x.getSDKReferenceNumber.ChallengeResultCancelled = r1
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        L5d:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKReferenceNumber.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AllowedGeolocationOrigins$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKReferenceNumber(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
