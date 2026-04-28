package atd.k;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ScreenResolution;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusReceiver extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char[] getDeviceData;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @NotNull
    private final Application AuthenticationRequestParameters;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r5, short r6, short r7) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = atd.k.ChallengeStatusReceiver.$$a
            int r7 = r7 * 4
            int r7 = r7 + 111
            int r5 = r5 * 3
            int r5 = 1 - r5
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeStatusReceiver.$$d(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters();
        TextUtils.getCapsMode("", 0, 0);
        new getDeviceData((byte) 0);
        int i11 = ChallengeResult + 11;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public ChallengeStatusReceiver(@NotNull Application application) {
        application.getClass();
        this.AuthenticationRequestParameters = application;
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{21688, 21755, 21743, 21722, 21671, 21679};
        getSDKReferenceNumber = 1286296727;
        getSDKAppID = true;
        getSDKTransactionID = true;
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            $11 = ($10 + 97) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr2 = getDeviceData;
        Class cls = Integer.TYPE;
        int i12 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int iResolveSize = View.resolveSize(i12, i12) + 2555;
                        char cIndexOf = (char) (TextUtils.indexOf("", "", i12) + 48598);
                        int iIndexOf = TextUtils.indexOf("", "", i12) + 31;
                        byte b8 = (byte) ($$a[3] - 1);
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iResolveSize, cIndexOf, iIndexOf, -390605202, false, $$d(b8, b11, b11), new Class[]{cls});
                    }
                    cArr3[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i13++;
                    i12 = 0;
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
        Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(147 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 32 - TextUtils.indexOf("", "", 0), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        if (getSDKTransactionID) {
            $11 = ($10 + 43) % 128;
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr4 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i14 = challengeResultTimeout.getSDKAppID;
                int i15 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    int iRgb = Color.rgb(0, 0, 0) + 16778913;
                    char cGreen = (char) Color.green(0);
                    int defaultSize = View.getDefaultSize(0, 0) + 29;
                    byte b12 = $$a[3];
                    byte b13 = (byte) (b12 - 1);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iRgb, cGreen, defaultSize, -1620360563, false, $$d(b13, b13, b12), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                $11 = ($10 + 85) % 128;
            }
        } else if (getSDKAppID) {
            int length3 = cArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr5 = new char[length3];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i16 = challengeResultTimeout.getSDKAppID;
                int i17 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i18 = $10 + 43;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr5[i16] = (char) (cArr2[cArr[(i17 + 1) - i16] * i11] + iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1697;
                        char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 29;
                        byte b14 = $$a[3];
                        byte b15 = (byte) (b14 - 1);
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(doubleTapTimeout, cIndexOf2, iMakeMeasureSpec, -1620360563, false, $$d(b15, b15, b14), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                } else {
                    cArr5[i16] = (char) (cArr2[cArr[(i17 - 1) - i16] - i11] - iIntValue);
                    Object[] objArr6 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID5 == null) {
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1697;
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        int i19 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28;
                        byte b16 = $$a[3];
                        byte b17 = (byte) (b16 - 1);
                        sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(doubleTapTimeout2, offsetAfter, i19, -1620360563, false, $$d(b17, b17, b16), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID5).invoke(null, objArr6);
                }
                $11 = ($10 + 39) % 128;
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr6 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i21 = challengeResultTimeout.getSDKAppID;
                int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i21] = (char) (cArr2[iArr[(i22 - 1) - i21] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i21 + 1;
                }
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{55, 68, 17, 1};
        $$b = 143;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = atd.k.ChallengeStatusReceiver.getSDKEphemeralPublicKey
            int r0 = r0 + 21
            int r1 = r0 % 128
            atd.k.ChallengeStatusReceiver.BuildConfig = r1
            r1 = 2
            int r0 = r0 % r1
            android.app.Application r2 = r8.AuthenticationRequestParameters
            r3 = 0
            if (r0 == 0) goto L8a
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = r0.heightPixels
            if (r2 < 0) goto L82
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r2 >= r4) goto L82
            int r2 = atd.k.ChallengeStatusReceiver.getSDKEphemeralPublicKey
            int r5 = r2 + 51
            int r6 = r5 % 128
            atd.k.ChallengeStatusReceiver.BuildConfig = r6
            int r5 = r5 % r1
            if (r5 != 0) goto L2c
            goto L82
        L2c:
            int r2 = r2 + 13
            int r5 = r2 % 128
            atd.k.ChallengeStatusReceiver.BuildConfig = r5
            int r2 = r2 % r1
            int r5 = r0.widthPixels
            r6 = 1
            r7 = 0
            if (r2 != 0) goto L3f
            r2 = 77
            int r2 = r2 / r7
            if (r5 < 0) goto L45
            goto L41
        L3f:
            if (r5 < 0) goto L45
        L41:
            if (r5 >= r4) goto L45
            r2 = r6
            goto L46
        L45:
            r2 = r7
        L46:
            if (r2 == 0) goto L82
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r2 = android.view.ViewConfiguration.getPressedStateDuration()
            int r2 = r2 >> 16
            int r2 = r2 + 127
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r5 = "\u0082\u0081\u0083\u0082\u0081"
            b(r3, r3, r2, r5, r4)
            r2 = r4[r7]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            int r3 = r0.widthPixels
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r0 = r0.heightPixels
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        L82:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        L8a:
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeStatusReceiver.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ScreenResolution$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "MAX_VALUE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        public static int getSDKAppID;
        public static int getSDKTransactionID;

        private getDeviceData() {
        }

        public static int AuthenticationRequestParameters() {
            int i11 = getSDKTransactionID;
            int i12 = i11 % 5098597;
            getSDKTransactionID = i11 + 1;
            if (i12 != 0) {
                return getSDKAppID;
            }
            int iMyPid = Process.myPid();
            getSDKAppID = iMyPid;
            return iMyPid;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
