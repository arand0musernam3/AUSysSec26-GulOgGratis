package atd.p;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WifiNetworksAvailableNotificationOn;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWifiNetworksAvailableNotificationOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiNetworksAvailableNotificationOn.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WifiNetworksAvailableNotificationOn\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class completed extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int[] getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber AuthenticationRequestParameters;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 + 112
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = atd.p.completed.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.completed.$$d(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getSDKAppID();
        ExpandableListView.getPackedPositionChild(0L);
        new AuthenticationRequestParameters((byte) 0);
        getDeviceData = (getMessageVersion + 37) % 128;
    }

    private completed(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.AuthenticationRequestParameters = getsdkreferencenumber;
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        long j9;
        int i13;
        char[] cArr;
        int length;
        int[] iArr2;
        int i14;
        int i15;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i16 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        int i17 = 0;
        if (iArr3 != null) {
            i12 = -1667528016;
            int i18 = $11 + 33;
            j9 = 0;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i14 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i14 = 0;
            }
            while (i14 < length) {
                int i19 = $10 + 3;
                $11 = i19 % 128;
                if (i19 % i16 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i14])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                        if (sDKTransactionID == null) {
                            int i21 = 2224 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            i15 = i16;
                            char cResolveOpacity = (char) (Drawable.resolveOpacity(i17, i17) + 53070);
                            int trimmedLength = 21 - TextUtils.getTrimmedLength("");
                            byte b8 = (byte) ($$b & 11);
                            byte b11 = (byte) (b8 - 2);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(i21, cResolveOpacity, trimmedLength, 1089703072, false, $$d(b8, b11, b11), new Class[]{cls});
                        } else {
                            i15 = i16;
                        }
                        iArr2[i14] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                        i14 %= 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    i15 = i16;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i14])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID2 == null) {
                        int i22 = 2224 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 53071);
                        int edgeSlop = 21 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b12 = (byte) ($$b & 11);
                        byte b13 = (byte) (b12 - 2);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(i22, packedPositionChild, edgeSlop, 1089703072, false, $$d(b12, b13, b13), new Class[]{cls});
                    }
                    iArr2[i14] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i14++;
                }
                i16 = i15;
                i17 = 0;
            }
            iArr3 = iArr2;
        } else {
            i12 = -1667528016;
            j9 = 0;
        }
        int i23 = i16;
        int i24 = 1;
        int i25 = 16;
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getSDKTransactionID;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            $10 = ($11 + 103) % 128;
            int i26 = 0;
            while (i26 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i26])};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i12);
                if (sDKTransactionID3 == null) {
                    int i27 = 2223 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(j9) + 53071);
                    int defaultSize = 21 - View.getDefaultSize(0, 0);
                    byte b14 = (byte) ($$b & 11);
                    byte b15 = (byte) (b14 - 2);
                    cArr = cArr2;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(i27, packedPositionChild2, defaultSize, 1089703072, false, $$d(b14, b15, b15), new Class[]{cls});
                } else {
                    cArr = cArr2;
                }
                iArr6[i26] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                i26++;
                cArr2 = cArr;
            }
            iArr5 = iArr6;
        }
        char[] cArr4 = cArr2;
        char c3 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i28 = getmessageversion.getSDKAppID;
            if (i28 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            int i29 = iArr[i28];
            char c7 = (char) (i29 >> 16);
            cArr4[c3] = c7;
            char c8 = (char) i29;
            cArr4[i24] = c8;
            char c11 = (char) (iArr[i28 + 1] >> 16);
            cArr4[i23] = c11;
            char c12 = (char) iArr[i28 + 1];
            cArr4[3] = c12;
            getmessageversion.getDeviceData = (c7 << 16) + c8;
            getmessageversion.AuthenticationRequestParameters = (c11 << 16) + c12;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr4);
            int i31 = 0;
            while (true) {
                i13 = getmessageversion.getDeviceData;
                if (i31 >= i25) {
                    break;
                }
                int i32 = i13 ^ iArr4[i31];
                getmessageversion.getDeviceData = i32;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i32);
                Object[] objArr5 = new Object[4];
                objArr5[3] = getmessageversion;
                objArr5[i23] = getmessageversion;
                objArr5[i24] = Integer.valueOf(sDKReferenceNumber);
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(View.resolveSize(0, 0) + 2386, (char) (ExpandableListView.getPackedPositionForGroup(0) > j9 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j9 ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 19, -2040903174, false, $$d(b16, b17, b17), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i31++;
                i25 = 16;
            }
            int i33 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i33;
            getmessageversion.AuthenticationRequestParameters = i13;
            i25 = 16;
            int i34 = i13 ^ iArr4[16];
            getmessageversion.AuthenticationRequestParameters = i34;
            int i35 = i33 ^ iArr4[17];
            getmessageversion.getDeviceData = i35;
            cArr4[0] = (char) (i35 >>> 16);
            cArr4[i24] = (char) i35;
            cArr4[i23] = (char) (i34 >>> 16);
            cArr4[3] = (char) i34;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr4);
            int i36 = getmessageversion.getSDKAppID;
            cArr3[i36 * 2] = cArr4[0];
            cArr3[(i36 * 2) + 1] = cArr4[i24];
            cArr3[(i36 * 2) + 2] = cArr4[i23];
            cArr3[(i36 * 2) + 3] = cArr4[3];
            int i37 = i23;
            Object[] objArr6 = new Object[i37];
            objArr6[i24] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                int i38 = i24;
                byte b18 = (byte) i38;
                byte b19 = (byte) (b18 - 1);
                i24 = i38;
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(1862 - (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Color.alpha(0) + 40, -562771681, false, $$d(b18, b19, b19), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            i23 = i37;
            c3 = 0;
        }
    }

    public static void getSDKAppID() {
        getSDKTransactionID = new int[]{-1880412445, 368099406, -677304878, -718239631, -1440057845, -1531736693, -171518646, 2116819867, 2115157306, -1491091714, 1558443685, 2124263965, -113410473, -1731627664, -263068668, 1321152538, -455531157, 306840252};
    }

    public static void init$0() {
        $$a = new byte[]{112, -4, 67, 92};
        $$b = 182;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        int i11 = getSDKAppID + 43;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0 ? Build.VERSION.SDK_INT > 27 : Build.VERSION.SDK_INT > 109) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        b(new int[]{1925479643, -1657478273, -227163061, 1974877337, -789873563, -1049421298, 600611522, 330526886, 294604996, 1297736342, 1729578182, -1638149756, 2136412641, -60296540, 304123895, -2125849211, -1045922269, 867195076, 1848240476, -1819784568}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39, objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            getSDKReferenceNumber = (getSDKAppID + 55) % 128;
            Boolean sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters);
            if (sDKTransactionID != null) {
                return a0.h(sDKTransactionID);
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WifiNetworksAvailableNotificationOn$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ completed(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
