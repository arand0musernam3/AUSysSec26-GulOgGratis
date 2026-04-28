package atd.p;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/HttpProxy;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHttpProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpProxy.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/HttpProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class ChallengeResultError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int[] getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    private static String $$d(int i11, byte b8, int i12) {
        byte[] bArr = $$a;
        int i13 = 114 - b8;
        int i14 = (i11 * 2) + 4;
        int i15 = i12 * 4;
        byte[] bArr2 = new byte[1 - i15];
        int i16 = 0 - i15;
        int i17 = -1;
        if (bArr == null) {
            i13 = (-i14) + i13;
            i14++;
            bArr = bArr;
            i17 = -1;
        }
        while (true) {
            int i18 = i17 + 1;
            bArr2[i18] = (byte) i13;
            if (i18 == i16) {
                return new String(bArr2, 0);
            }
            int i19 = i13;
            byte[] bArr3 = bArr;
            i13 = (-bArr[i14]) + i19;
            i14++;
            bArr = bArr3;
            i17 = i18;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        ChallengeResultCancelled = 1;
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        getSDKTransactionID();
        ExpandableListView.getPackedPositionForChild(0, 0);
        new AuthenticationRequestParameters((byte) 0);
        ChallengeResultCancelled = (getSDKAppID + 49) % 128;
    }

    private ChallengeResultError(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c3;
        char[] cArr;
        int[] iArr2;
        int i14;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i15 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        int i16 = 16;
        int i17 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i18 = 0;
            i12 = 53070;
            while (i18 < length) {
                int i19 = $11 + 5;
                int i21 = i15;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i18])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                        if (sDKTransactionID == null) {
                            i14 = i16;
                            byte b8 = (byte) i17;
                            byte b11 = b8;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(TextUtils.getTrimmedLength("") + 2223, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 53070), 21 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1089703072, false, $$d(b8, b11, b11), new Class[]{cls});
                        } else {
                            i14 = i16;
                        }
                        iArr4[i18] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    i14 = i16;
                    int i22 = i17;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i18])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) i22;
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(View.MeasureSpec.getMode(i22) + 2223, (char) (Color.red(i22) + 53070), (Process.myTid() >> 22) + 21, 1089703072, false, $$d(b12, b13, b13), new Class[]{cls});
                    }
                    iArr4[i18] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i18++;
                }
                $11 = ($10 + 83) % 128;
                i15 = i21;
                i16 = i14;
                i17 = 0;
            }
            iArr3 = iArr4;
        } else {
            i12 = 53070;
        }
        int i23 = i15;
        int i24 = i16;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKTransactionID;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i25 = 0;
            while (i25 < length3) {
                int i26 = $10 + 69;
                $11 = i26 % 128;
                if (i26 % 2 == 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i25])};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID3 == null) {
                        cArr = cArr2;
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        iArr2 = iArr6;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getLongPressTimeout() >> 16) + 2223, (char) (i12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 21, 1089703072, false, $$d(b14, b15, b15), new Class[]{cls});
                    } else {
                        cArr = cArr2;
                        iArr2 = iArr6;
                    }
                    iArr7[i25] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    i25 <<= 1;
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                    Object[] objArr5 = {Integer.valueOf(iArr2[i25])};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2223 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 53071), 22 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1089703072, false, $$d(b16, b17, b17), new Class[]{cls});
                    }
                    iArr7[i25] = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                    i25++;
                }
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i27 = getmessageversion.getSDKAppID;
            if (i27 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            $11 = ($10 + 105) % 128;
            int i28 = iArr[i27];
            char c7 = (char) (i28 >> 16);
            cArr4[0] = c7;
            char c8 = (char) i28;
            char c11 = 1;
            cArr4[1] = c8;
            char c12 = (char) (iArr[i27 + 1] >> 16);
            cArr4[i23] = c12;
            char c13 = (char) iArr[i27 + 1];
            cArr4[3] = c13;
            getmessageversion.getDeviceData = (c7 << 16) + c8;
            getmessageversion.AuthenticationRequestParameters = (c12 << 16) + c13;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            $10 = ($11 + 111) % 128;
            int i29 = 0;
            while (true) {
                i13 = getmessageversion.getDeviceData;
                if (i29 >= i24) {
                    break;
                }
                int i31 = i13 ^ iArr5[i29];
                getmessageversion.getDeviceData = i31;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i31);
                Object[] objArr6 = new Object[4];
                objArr6[3] = getmessageversion;
                objArr6[i23] = getmessageversion;
                objArr6[c11] = Integer.valueOf(sDKReferenceNumber);
                objArr6[0] = getmessageversion;
                Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID5 == null) {
                    c3 = c11;
                    byte b18 = (byte) 0;
                    byte b19 = (byte) (b18 + 2);
                    sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(2386 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf((CharSequence) "", '0', 0) + 20, -2040903174, false, $$d(b18, b19, (byte) (b19 - 2)), new Class[]{Object.class, cls, Object.class, Object.class});
                } else {
                    c3 = c11;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID5).invoke(null, objArr6)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i29++;
                c11 = c3;
                i24 = 16;
            }
            char c14 = c11;
            int i32 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i32;
            getmessageversion.AuthenticationRequestParameters = i13;
            int i33 = i13 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i33;
            int i34 = i32 ^ iArr5[17];
            getmessageversion.getDeviceData = i34;
            cArr4[0] = (char) (i34 >>> 16);
            cArr4[c14] = (char) i34;
            cArr4[i23] = (char) (i33 >>> 16);
            cArr4[3] = (char) i33;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i35 = getmessageversion.getSDKAppID;
            cArr3[i35 * 2] = cArr4[0];
            cArr3[(i35 * 2) + 1] = cArr4[c14];
            cArr3[(i35 * 2) + 2] = cArr4[i23];
            cArr3[(i35 * 2) + 3] = cArr4[3];
            int i36 = i23;
            Object[] objArr7 = new Object[i36];
            objArr7[c14] = getmessageversion;
            objArr7[0] = getmessageversion;
            Object sDKTransactionID6 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID6 == null) {
                i24 = 16;
                byte b21 = (byte) 0;
                byte b22 = (byte) (b21 + 1);
                sDKTransactionID6 = atd.e.ChallengeResult.getDeviceData(1861 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) KeyEvent.getDeadChar(0, 0), 39 - Process.getGidForName(""), -562771681, false, $$d(b21, b22, (byte) (b22 - 1)), new Class[]{Object.class, Object.class});
            } else {
                i24 = 16;
            }
            ((Method) sDKTransactionID6).invoke(null, objArr7);
            i23 = i36;
        }
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = new int[]{-1307514216, 293594917, 1686470481, -1990625095, -169548852, 186135114, 369992620, -1150141835, 1377946562, 487480235, -1467610889, 515735991, -1416963950, 98920456, -383914253, -1886155694, 1321396791, -929015229};
    }

    public static void init$0() {
        $$a = new byte[]{6, -26, -55, -87};
        $$b = 175;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getDeviceData;
        Object[] objArr = new Object[1];
        b(new int[]{149548009, 1020970703, 2053480278, -1816418065, -1055231003, 1934757472}, 10 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            int i11 = getSDKReferenceNumber + 81;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 != 0) {
                return failure;
            }
            throw null;
        }
        int i12 = getSDKReferenceNumber + 59;
        AuthenticationRequestParameters = i12 % 128;
        int i13 = i12 % 2;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
        if (i13 == 0) {
            int i14 = 80 / 0;
        }
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/HttpProxy$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultError(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
