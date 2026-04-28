package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Time12Or24;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isValid", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTime12Or24.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Time12Or24.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Time12Or24\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class protocolError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static short[] ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r7, short r8, int r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = atd.y.protocolError.$$a
            int r9 = r9 * 4
            int r9 = r9 + 101
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r5 = r2
            r0 = r9
            r9 = r7
            goto L2d
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2d:
            int r7 = r7 + r0
            r0 = r9
            r9 = r7
            r7 = r0
            r0 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.protocolError.$$d(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getMessageVersion = 1;
        ChallengeResultCancelled = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKTransactionID();
        ExpandableListView.getPackedPositionChild(0L);
        MotionEvent.axisFromString("");
        ViewConfiguration.getLongPressTimeout();
        SystemClock.uptimeMillis();
        Color.alpha(0);
        new getSDKTransactionID((byte) 0);
        BuildConfig = (getMessageVersion + 19) % 128;
    }

    private protocolError(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKAppID = getsdkreferencenumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean AuthenticationRequestParameters(java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.protocolError.AuthenticationRequestParameters(java.lang.String):boolean");
    }

    private static void b(byte b8, int i11, int i12, short s7, int i13, Object[] objArr) throws Throwable {
        int i14;
        long j9;
        int i15;
        int i16;
        long j11;
        int i17;
        int i18;
        int length;
        byte[] bArr;
        int i19;
        int i21;
        int i22;
        atd.bb.getTransactionStatus gettransactionstatus = new atd.bb.getTransactionStatus();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i23 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKTransactionID)};
            int i24 = 0;
            Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-217286249);
            Class cls = Integer.TYPE;
            if (sDKTransactionID == null) {
                byte b11 = (byte) (-1);
                i14 = -217286249;
                byte b12 = (byte) (b11 + 1);
                j9 = 0;
                sDKTransactionID = atd.e.ChallengeResult.getDeviceData(1226 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 795115399, false, $$d(b11, b12, b12), new Class[]{cls, cls});
            } else {
                i14 = -217286249;
                j9 = 0;
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
            int i25 = iIntValue == -1 ? 1 : 0;
            if (i25 != 0) {
                int i26 = $11 + 79;
                $10 = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
                byte[] bArr2 = AuthenticationRequestParameters;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i27 = 0;
                    j11 = 20070962823959587L;
                    while (i27 < length2) {
                        $10 = ($11 + 23) % 128;
                        Object[] objArr3 = {Integer.valueOf(bArr2[i27])};
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1659653064);
                        if (sDKTransactionID2 == null) {
                            i21 = i23;
                            i22 = i24;
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3316 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getTapTimeout() >> 16) + 33, -1098625576, false, "f", new Class[]{cls});
                        } else {
                            i21 = i23;
                            i22 = i24;
                        }
                        bArr3[i27] = ((Byte) ((Method) sDKTransactionID2).invoke(null, objArr3)).byteValue();
                        i27++;
                        i23 = i21;
                        i24 = i22;
                    }
                    bArr2 = bArr3;
                } else {
                    j11 = 20070962823959587L;
                }
                i15 = i23;
                i16 = i24;
                if (bArr2 != null) {
                    byte[] bArr4 = AuthenticationRequestParameters;
                    Object[] objArr4 = new Object[2];
                    objArr4[i15] = Integer.valueOf(getDeviceData);
                    objArr4[i16] = Integer.valueOf(i12);
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                    if (sDKTransactionID3 == null) {
                        byte b13 = (byte) (-1);
                        byte b14 = (byte) (b13 + 1);
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1225 - KeyEvent.normalizeMetaState(i16), (char) TextUtils.getTrimmedLength(""), 34 - (SystemClock.uptimeMillis() > j9 ? 1 : (SystemClock.uptimeMillis() == j9 ? 0 : -1)), 795115399, false, $$d(b13, b14, b14), new Class[]{cls, cls});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue()]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) ChallengeResult[i12 + ((int) (((long) getDeviceData) ^ j11))]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                    $11 = ($10 + 29) % 128;
                }
            } else {
                i15 = 1;
                i16 = 0;
                j11 = 20070962823959587L;
            }
            if (iIntValue > 0) {
                gettransactionstatus.getDeviceData = ((i12 + iIntValue) - 2) + ((int) (((long) getDeviceData) ^ j11)) + i25;
                int i28 = getSDKReferenceNumber;
                Object[] objArr5 = new Object[4];
                objArr5[3] = sb2;
                objArr5[2] = Integer.valueOf(i28);
                objArr5[i15] = Integer.valueOf(i13);
                objArr5[i16] = gettransactionstatus;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-488867474);
                if (sDKTransactionID4 == null) {
                    int keyRepeatDelay = 2158 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i29 = i16;
                    int iRgb = (-16777180) - Color.rgb(i29, i29, i29);
                    byte b15 = (byte) (-1);
                    byte b16 = (byte) (b15 + 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(keyRepeatDelay, longPressTimeout, iRgb, 1052016510, false, $$d(b15, b16, (byte) (b16 + 1)), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) sDKTransactionID4).invoke(null, objArr5)).append(gettransactionstatus.getSDKAppID);
                gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                byte[] bArr5 = AuthenticationRequestParameters;
                if (bArr5 != null) {
                    int i31 = $10 + 41;
                    $11 = i31 % 128;
                    if (i31 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i19 = i15;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i19 = 0;
                    }
                    while (i19 < length) {
                        bArr[i19] = (byte) (((long) bArr5[i19]) ^ j11);
                        i19++;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    i17 = i15;
                    i18 = i17;
                } else {
                    i17 = i15;
                    i18 = 0;
                }
                while (true) {
                    gettransactionstatus.AuthenticationRequestParameters = i17;
                    if (gettransactionstatus.AuthenticationRequestParameters >= iIntValue) {
                        break;
                    }
                    int i32 = $11 + 33;
                    $10 = i32 % 128;
                    if (i32 % 2 != 0) {
                        throw null;
                    }
                    int i33 = gettransactionstatus.getDeviceData;
                    if (i18 != 0) {
                        byte[] bArr6 = AuthenticationRequestParameters;
                        gettransactionstatus.getDeviceData = i33 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((byte) (((byte) (((long) bArr6[i33]) ^ j11)) + s7)) ^ b8));
                    } else {
                        short[] sArr = ChallengeResult;
                        gettransactionstatus.getDeviceData = i33 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((short) (((short) (((long) sArr[i33]) ^ j11)) + s7)) ^ b8));
                    }
                    sb2.append(gettransactionstatus.getSDKAppID);
                    gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                    i17 = gettransactionstatus.AuthenticationRequestParameters + 1;
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

    public static void getSDKTransactionID() {
        getDeviceData = -60708983;
        getSDKTransactionID = 829166640;
        getSDKReferenceNumber = -1022196677;
        AuthenticationRequestParameters = new byte[]{-117, 90, -92, -120, 91, 115, 113, -115, 124, 26, 98, 88, -89, 86, 35, 35, 35, 35};
    }

    public static void init$0() {
        $$a = new byte[]{123, -86, -87, -12};
        $$b = 159;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 71) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKAppID;
        Object[] objArr = new Object[1];
        b((byte) ((-86) - ((Process.getThreadPriority(0) + 20) >> 6)), ExpandableListView.getPackedPositionGroup(0L) - 9, 854740054 - KeyEvent.getDeadChar(0, 0), (short) View.resolveSizeAndState(0, 0, 0), 226586716 - View.combineMeasuredStates(0, 0), objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            if (AuthenticationRequestParameters(strAuthenticationRequestParameters)) {
                getSDKEphemeralPublicKey = (ChallengeResultCancelled + 105) % 128;
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
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Time12Or24$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        public static int getSDKAppID;
        public static int getSDKReferenceNumber;

        private getSDKTransactionID() {
        }

        public static int getDeviceData() {
            int i11 = getSDKAppID;
            int i12 = i11 % 6152257;
            getSDKAppID = i11 + 1;
            if (i12 != 0) {
                return getSDKReferenceNumber;
            }
            int iB = a0.b(138581221);
            getSDKReferenceNumber = iB;
            return iB;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ protocolError(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
