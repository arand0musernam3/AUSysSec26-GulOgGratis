package atd.n;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Serial;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "kotlin.jvm.PlatformType", "getBuildSerial", "()Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSerial.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serial.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/build/Serial\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class ChallengeResultError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r7, int r8, byte r9) {
        /*
            int r9 = r9 * 3
            int r9 = 4 - r9
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = atd.n.ChallengeResultError.$$a
            int r8 = r8 + 112
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r5 = r2
            r0 = r9
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L29:
            int r8 = r8 + r9
            int r9 = r0 + 1
            r0 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.n.ChallengeResultError.$$d(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters = 0;
        getSDKTransactionID = 1;
        getSDKAppID();
        Color.blue(0);
        new getDeviceData((byte) 0);
        getSDKReferenceNumber = (getSDKAppID + 17) % 128;
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        float f11;
        int i12;
        char[] cArr;
        int i13;
        int i14;
        int i15;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i16 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = getDeviceData;
        int i17 = -1667528016;
        Class cls = Integer.TYPE;
        int i18 = 16;
        int i19 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            f11 = 0.0f;
            $10 = ($11 + 31) % 128;
            int i21 = 0;
            while (i21 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i21])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID == null) {
                        i14 = i17;
                        i13 = i16;
                        byte b8 = (byte) i19;
                        i15 = i18;
                        byte b11 = (byte) (b8 + 2);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(KeyEvent.keyCodeFromString("") + 2223, (char) (53070 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 21, 1089703072, false, $$d(b8, b11, (byte) (b11 - 2)), new Class[]{cls});
                    } else {
                        i13 = i16;
                        i14 = i17;
                        i15 = i18;
                    }
                    iArr3[i21] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i21++;
                    i17 = i14;
                    i16 = i13;
                    i18 = i15;
                    i19 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        } else {
            f11 = 0.0f;
        }
        int i22 = i16;
        int i23 = i17;
        int i24 = i18;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getDeviceData;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i25 = 0;
            while (i25 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i25])};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i23);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 2);
                    cArr = cArr2;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2222 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (53070 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 21 - (ViewConfiguration.getEdgeSlop() >> 16), 1089703072, false, $$d(b12, b13, (byte) (b13 - 2)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                }
                iArr6[i25] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i25++;
                cArr2 = cArr;
            }
            iArr5 = iArr6;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i26 = getmessageversion.getSDKAppID;
            if (i26 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            $11 = ($10 + 71) % 128;
            int i27 = iArr[i26];
            char c3 = (char) (i27 >> 16);
            cArr4[0] = c3;
            char c7 = (char) i27;
            cArr4[1] = c7;
            char c8 = (char) (iArr[i26 + 1] >> 16);
            cArr4[i22] = c8;
            char c11 = (char) iArr[i26 + 1];
            cArr4[3] = c11;
            getmessageversion.getDeviceData = (c3 << 16) + c7;
            getmessageversion.AuthenticationRequestParameters = (c8 << 16) + c11;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr4);
            $11 = ($10 + 15) % 128;
            int i28 = 0;
            while (true) {
                i12 = getmessageversion.getDeviceData;
                if (i28 >= i24) {
                    break;
                }
                int i29 = i12 ^ iArr4[i28];
                getmessageversion.getDeviceData = i29;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i29);
                Object[] objArr4 = new Object[4];
                objArr4[3] = getmessageversion;
                objArr4[i22] = getmessageversion;
                objArr4[1] = Integer.valueOf(sDKReferenceNumber);
                objArr4[0] = getmessageversion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Drawable.resolveOpacity(0, 0) + 2386, (char) (AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18, -2040903174, false, $$d(b14, b15, b15), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i28++;
                i24 = 16;
            }
            int i31 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i31;
            getmessageversion.AuthenticationRequestParameters = i12;
            i24 = 16;
            int i32 = i12 ^ iArr4[16];
            getmessageversion.AuthenticationRequestParameters = i32;
            int i33 = i31 ^ iArr4[17];
            getmessageversion.getDeviceData = i33;
            cArr4[0] = (char) (i33 >>> 16);
            cArr4[1] = (char) i33;
            cArr4[i22] = (char) (i32 >>> 16);
            cArr4[3] = (char) i32;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr4);
            int i34 = getmessageversion.getSDKAppID;
            cArr3[i34 * 2] = cArr4[0];
            cArr3[(i34 * 2) + 1] = cArr4[1];
            cArr3[(i34 * 2) + 2] = cArr4[i22];
            cArr3[(i34 * 2) + 3] = cArr4[3];
            int i35 = i22;
            Object[] objArr5 = new Object[i35];
            objArr5[1] = getmessageversion;
            objArr5[0] = getmessageversion;
            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID4 == null) {
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 + 1);
                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1861 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 40 - (Process.myPid() >> 22), -562771681, false, $$d(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID4).invoke(null, objArr5);
            i22 = i35;
        }
    }

    public static void getSDKAppID() {
        getDeviceData = new int[]{-333160506, 2055786185, 1196929469, 1428322753, 716959040, -1698438956, 56869425, -1856885285, -1928729876, -590843569, 1887594725, 1602716009, -1541579099, 780933459, 862204437, -255815410, 205541301, -528182226};
    }

    @SuppressLint({"MissingPermission"})
    private static String getSDKTransactionID() {
        AuthenticationRequestParameters = (getSDKTransactionID + 19) % 128;
        String serial = Build.getSerial();
        getSDKTransactionID = (AuthenticationRequestParameters + 15) % 128;
        return serial;
    }

    public static void init$0() {
        $$a = new byte[]{76, -80, -40, -9};
        $$b = 23;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        try {
            String sDKTransactionID = getSDKTransactionID();
            Object[] objArr = new Object[1];
            b(new int[]{-1515695206, 546028733, 1506804148, 45731863}, 7 - View.MeasureSpec.getSize(0), objArr);
            if (Intrinsics.areEqual(sDKTransactionID, ((String) objArr[0]).intern())) {
                sDKTransactionID = null;
            } else {
                AuthenticationRequestParameters = (getSDKTransactionID + 73) % 128;
            }
            return sDKTransactionID != null ? DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(sDKTransactionID)) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        } catch (SecurityException unused) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Serial$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        public static int getSDKReferenceNumber;
        public static int getSDKTransactionID;

        private getDeviceData() {
        }

        public static int getSDKAppID() {
            int i11 = getSDKTransactionID;
            int i12 = i11 % 7994868;
            getSDKTransactionID = i11 + 1;
            if (i12 != 0) {
                return getSDKReferenceNumber;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            getSDKReferenceNumber = iElapsedRealtime;
            return iElapsedRealtime;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
