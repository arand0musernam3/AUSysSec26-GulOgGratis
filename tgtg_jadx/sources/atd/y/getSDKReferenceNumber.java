package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DateFormat;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isValidFormat", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDateFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateFormat.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DateFormat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class getSDKReferenceNumber extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static byte[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static short[] getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r7, int r8, int r9) {
        /*
            int r7 = r7 * 4
            int r7 = 105 - r7
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = atd.y.getSDKReferenceNumber.$$a
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r7 = r9
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2c
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r8]
            r6 = r0
            r0 = r8
            r8 = r3
            r3 = r6
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.getSDKReferenceNumber.$$d(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        BuildConfig = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters();
        ExpandableListView.getPackedPositionForChild(0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        Color.argb(0, 0, 0, 0);
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getMaximumDrawingCacheSize();
        ImageFormat.getBitsPerPixel(0);
        TextUtils.indexOf("", "", 0, 0);
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getWindowTouchSlop();
        AudioTrack.getMaxVolume();
        Color.red(0);
        View.getDefaultSize(0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getScrollBarSize();
        TypedValue.complexToFloat(0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getScrollBarSize();
        new getDeviceData((byte) 0);
        ChallengeResultCancelled = (ChallengeResult + 107) % 128;
    }

    private getSDKReferenceNumber(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getSDKAppID = -83036367;
        AuthenticationRequestParameters = 829166631;
        getSDKReferenceNumber = -132676322;
        getDeviceData = new byte[]{-55, 46, 33, -39, -45, -35, 32, 43, -55, 39, 97, 84, -93, 97, 95, -41, 97, 97, 97, -100, 98, 97, 97, 97, 43, -93, 97, 95, -86, 97, -119, 98, 97, 97, 97, 43, -86, 97, 84, -93, 97, 43, 30, -23, 43, 21, -99, 43, 43, 43, 100, 100, 100, 46, -90, 100, 90, -81, 100, -118, -118, -118, -64, 65, -118, -65, 72, -118, 12, -15, -2, 35, 35, 35, 35, 35, 35};
    }

    private static void b(byte b8, int i11, int i12, short s7, int i13, Object[] objArr) throws Throwable {
        int i14;
        long j9;
        long j11;
        int i15;
        int length;
        byte[] bArr;
        int i16;
        int i17;
        int i18;
        atd.bb.getTransactionStatus gettransactionstatus = new atd.bb.getTransactionStatus();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i19 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(AuthenticationRequestParameters)};
            Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-217286249);
            Class cls = Integer.TYPE;
            if (sDKTransactionID == null) {
                byte b11 = (byte) 1;
                i14 = -217286249;
                byte b12 = (byte) (-b11);
                j9 = 0;
                sDKTransactionID = atd.e.ChallengeResult.getDeviceData(1225 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 33 - View.MeasureSpec.getSize(0), 795115399, false, $$d(b11, b12, (byte) (b12 + 1)), new Class[]{cls, cls});
            } else {
                i14 = -217286249;
                j9 = 0;
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
            boolean z11 = iIntValue == -1;
            if (z11) {
                byte[] bArr2 = getDeviceData;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i21 = 0;
                    while (i21 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i21])};
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1659653064);
                        if (sDKTransactionID2 == null) {
                            i18 = i19;
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3316 - ExpandableListView.getPackedPositionGroup(j9), (char) TextUtils.indexOf("", "", 0), 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1098625576, false, "f", new Class[]{cls});
                        } else {
                            i18 = i19;
                        }
                        bArr3[i21] = ((Byte) ((Method) sDKTransactionID2).invoke(null, objArr3)).byteValue();
                        i21++;
                        i19 = i18;
                    }
                    i17 = i19;
                    j11 = 20070962823959587L;
                    $10 = ($11 + 21) % 128;
                    bArr2 = bArr3;
                } else {
                    i17 = 1;
                    j11 = 20070962823959587L;
                }
                if (bArr2 != null) {
                    $11 = ($10 + 21) % 128;
                    byte[] bArr4 = getDeviceData;
                    Object[] objArr4 = new Object[2];
                    objArr4[i17] = Integer.valueOf(getSDKAppID);
                    objArr4[0] = Integer.valueOf(i12);
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                    if (sDKTransactionID3 == null) {
                        byte b13 = (byte) i17;
                        byte b14 = (byte) (-b13);
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getTouchSlop() >> 8) + 1225, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, 795115399, false, $$d(b13, b14, (byte) (b14 + 1)), new Class[]{cls, cls});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue()]) ^ j11)) + ((int) (((long) AuthenticationRequestParameters) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) getSDKEphemeralPublicKey[i12 + ((int) (((long) getSDKAppID) ^ j11))]) ^ j11)) + ((int) (((long) AuthenticationRequestParameters) ^ j11)));
                }
            } else {
                j11 = 20070962823959587L;
            }
            if (iIntValue > 0) {
                int i22 = ($10 + 79) % 128;
                $11 = i22;
                int i23 = ((i12 + iIntValue) - 2) + ((int) (((long) getSDKAppID) ^ j11));
                if (z11) {
                    i15 = 1;
                } else {
                    $10 = (i22 + 103) % 128;
                    i15 = 0;
                }
                gettransactionstatus.getDeviceData = i23 + i15;
                Object[] objArr5 = {gettransactionstatus, Integer.valueOf(i13), Integer.valueOf(getSDKReferenceNumber), sb2};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-488867474);
                if (sDKTransactionID4 == null) {
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 - 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((Process.myTid() >> 22) + 2158, (char) View.combineMeasuredStates(0, 0), Color.argb(0, 0, 0, 0) + 36, 1052016510, false, $$d(b15, b16, (byte) (b16 + 1)), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) sDKTransactionID4).invoke(null, objArr5)).append(gettransactionstatus.getSDKAppID);
                gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                byte[] bArr5 = getDeviceData;
                if (bArr5 != null) {
                    int i24 = $11 + 83;
                    $10 = i24 % 128;
                    if (i24 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i16 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i16 = 0;
                    }
                    while (i16 < length) {
                        int i25 = $11 + 73;
                        $10 = i25 % 128;
                        if (i25 % 2 != 0) {
                            bArr[i16] = (byte) (((long) bArr5[i16]) - j11);
                        } else {
                            bArr[i16] = (byte) (((long) bArr5[i16]) ^ j11);
                            i16++;
                        }
                    }
                    bArr5 = bArr;
                }
                boolean z12 = bArr5 != null;
                int i26 = 1;
                while (true) {
                    gettransactionstatus.AuthenticationRequestParameters = i26;
                    if (gettransactionstatus.AuthenticationRequestParameters >= iIntValue) {
                        break;
                    }
                    int i27 = gettransactionstatus.getDeviceData;
                    if (z12) {
                        byte[] bArr6 = getDeviceData;
                        gettransactionstatus.getDeviceData = i27 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((byte) (((byte) (((long) bArr6[i27]) ^ j11)) + s7)) ^ b8));
                    } else {
                        short[] sArr = getSDKEphemeralPublicKey;
                        gettransactionstatus.getDeviceData = i27 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((short) (((short) (((long) sArr[i27]) ^ j11)) + s7)) ^ b8));
                    }
                    sb2.append(gettransactionstatus.getSDKAppID);
                    gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                    i26 = gettransactionstatus.AuthenticationRequestParameters + 1;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static boolean getSDKAppID(String str) throws Throwable {
        Object[] objArr = new Object[1];
        b((byte) (66 - TextUtils.getOffsetAfter("", 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27, 899620088 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 914648881, objArr);
        boolean zE = new Regex(((String) objArr[0]).intern()).e(str);
        BuildConfig = (getMessageVersion + 45) % 128;
        return zE;
    }

    public static void init$0() {
        $$a = new byte[]{101, -112, -32, 38};
        $$b = 36;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        BuildConfig = (getMessageVersion + 27) % 128;
        if (Build.VERSION.SDK_INT >= 31) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        b((byte) ((-7) - (ViewConfiguration.getTapTimeout() >> 16)), Color.blue(0) + 7, (ViewConfiguration.getEdgeSlop() >> 16) + 899620078, (short) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 914648871, objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            if (getSDKAppID(strAuthenticationRequestParameters)) {
                BuildConfig = (getMessageVersion + 53) % 128;
            } else {
                strAuthenticationRequestParameters = null;
            }
            if (strAuthenticationRequestParameters != null) {
                return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DateFormat$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MONTH_DAY_YEAR", "DAY_MONTH_YEAR", "YEAR_MONTH_DAY", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKReferenceNumber(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
