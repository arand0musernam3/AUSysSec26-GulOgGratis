package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/AccelerometerRotation;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccelerometerRotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelerometerRotation.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/AccelerometerRotation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class getDeviceData extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static long getDeviceData;
    private static char getSDKAppID;
    private static int getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r5, short r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r0 = atd.y.getDeviceData.$$a
            int r5 = r5 + 4
            int r7 = r7 + 68
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r5 = r5 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r5]
        L24:
            int r7 = r7 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.getDeviceData.$$d(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        BuildConfig = 1;
        getSDKReferenceNumber = 0;
        ChallengeResult = 1;
        getSDKTransactionID();
        SystemClock.elapsedRealtimeNanos();
        ViewConfiguration.getWindowTouchSlop();
        new getSDKTransactionID((byte) 0);
        int i11 = ChallengeResultCancelled + 113;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 96 / 0;
        }
    }

    private getDeviceData(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    private static void b(int i11, String str, String str2, char c3, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        char c7;
        int i12;
        int i13;
        long j9;
        $10 = ($11 + 97) % 128;
        if (str3 != null) {
            charArray = str3.toCharArray();
            $10 = ($11 + 13) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        int i14 = 2;
        Object obj = null;
        char c8 = 1;
        if (str != null) {
            int i15 = $11 + 1;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        atd.bb.onCompletion oncompletion = new atd.bb.onCompletion();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        int i16 = 0;
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = charArray3.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) (-1);
                    c7 = c8;
                    byte b11 = (byte) (b8 + 1);
                    i12 = i16;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(Color.red(i16) + 2069, (char) (View.combineMeasuredStates(i16, i16) + 44657), KeyEvent.normalizeMetaState(i16) + 32, -397560981, false, $$d(b8, b11, (byte) (b11 | 49)), new Class[]{Object.class});
                } else {
                    c7 = c8;
                    i12 = i16;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    i13 = i14;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getWindowTouchSlop() >> 8) + 3095, (char) (14367 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, -1211924053, false, $$d(b12, b13, (byte) (b13 | 50)), new Class[]{Object.class});
                } else {
                    i13 = i14;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i17 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i13] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[c7] = Integer.valueOf(i17);
                objArr4[i12] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    j9 = 0;
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getFadingEdgeLength() >> 16) + 1428, (char) ExpandableListView.getPackedPositionType(0L), 30 - (Process.myPid() >> 22), -1183253656, false, $$d(b14, b15, (byte) (b15 | 51)), new Class[]{Object.class, cls, cls});
                } else {
                    j9 = 0;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i18 = cArr3[iIntValue2] * 32718;
                int i19 = i13;
                Object[] objArr5 = new Object[i19];
                objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[i12] = Integer.valueOf(i18);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    int i21 = 2775 - (SystemClock.uptimeMillis() > j9 ? 1 : (SystemClock.uptimeMillis() == j9 ? 0 : -1));
                    char maximumFlingVelocity = (char) (13060 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int i22 = i12;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, i22) + 25;
                    byte b16 = (byte) (-1);
                    byte b17 = (byte) (b16 + 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(i21, maximumFlingVelocity, absoluteGravity, -320602145, false, $$d(b16, b17, b17), new Class[]{cls, cls});
                }
                cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i23 = oncompletion.getDeviceData;
                cArr5[i23] = (char) (((((long) (r3 ^ charArray3[i23])) ^ (getDeviceData ^ 1905653906042338631L)) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKAppID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i23 + 1;
                obj = null;
                i14 = i19;
                i16 = 0;
                c8 = c7;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr5);
        $11 = ($10 + 9) % 128;
        objArr[0] = str4;
    }

    public static void getSDKTransactionID() {
        getDeviceData = 1905653906042338631L;
        AuthenticationRequestParameters = 686220268;
        getSDKAppID = (char) 15687;
    }

    public static void init$0() {
        $$a = new byte[]{16, 15, -73, -127};
        $$b = 59;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        getSDKReferenceNumber = (ChallengeResult + 45) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        b(MotionEvent.axisFromString("") + 1, "≼煁隳礤", "訵࢚뎵韥Ӱꁠ\u1bf9娘笏釕偅ഢꡕ愕\uf3ea藌ᅹ⌃᭲ㄍ䐧灔", (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            getSDKReferenceNumber = (ChallengeResult + 113) % 128;
            Boolean sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters);
            if (sDKTransactionID != null) {
                int i11 = getSDKReferenceNumber + 3;
                ChallengeResult = i11 % 128;
                if (i11 % 2 != 0) {
                    return a0.h(sDKTransactionID);
                }
                DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(sDKTransactionID.booleanValue()));
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/AccelerometerRotation$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getDeviceData(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
