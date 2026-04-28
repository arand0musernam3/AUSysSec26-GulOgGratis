package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/BluetoothDiscoverabilityTimeout;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBluetoothDiscoverabilityTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothDiscoverabilityTimeout.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/BluetoothDiscoverabilityTimeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class getSDKTransactionID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    private static String $$d(int i11, int i12, short s7) {
        byte[] bArr = $$a;
        int i13 = i12 * 2;
        int i14 = s7 + 4;
        int i15 = (i11 * 2) + 120;
        byte[] bArr2 = new byte[i13 + 1];
        int i16 = -1;
        if (bArr == null) {
            int i17 = i14 + i13;
            i14 = i14;
            i15 = i17;
        }
        while (true) {
            i16++;
            int i18 = i14 + 1;
            bArr2[i16] = (byte) i15;
            if (i16 == i13) {
                return new String(bArr2, 0);
            }
            i14 = i18;
            i15 += bArr[i18];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters();
        ViewConfiguration.getScrollBarSize();
        new getSDKReferenceNumber((byte) 0);
        getSDKTransactionID = (getSDKEphemeralPublicKey + 57) % 128;
    }

    private getSDKTransactionID(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = 134861200351368743L;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $11 = ($10 + 97) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        atd.bb.completed completedVar = new atd.bb.completed();
        char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKReferenceNumber ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                String str2 = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                $10 = ($11 + 111) % 128;
                objArr[0] = str2;
                return;
            }
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKReferenceNumber)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int i14 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2774;
                    char c3 = (char) (13061 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int i15 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25;
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    String str$$d = $$d(b8, b11, (byte) (b11 - 1));
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(i14, c3, i15, -1416626223, false, str$$d, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(408 - KeyEvent.normalizeMetaState(0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.indexOf("", "") + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{35, 23, 10, 49};
        $$b = AppConstants.PERMISSIONS_REQUEST_USE_LOCATION;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[PHI: r0
      0x0047: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v21 java.lang.String) binds: [B:8:0x0045, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.y.getSDKTransactionID.AuthenticationRequestParameters
            int r0 = r0 + 7
            int r1 = r0 % 128
            atd.y.getSDKTransactionID.getSDKAppID = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r6.getDeviceData
            java.lang.String r2 = ""
            java.lang.String r3 = "缰罒럲❫ڭ鋒✲\u2068㲐捔捼搕\uf8f0꼰꽛\ua83c됿\uebe0\ueba4\uecff瀅ៅ㟶傟ⱽ厇珊钥\ue9b1遀븻\udb6cꖑ\udc56充Ἄ懤"
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L2e
            int r0 = android.text.TextUtils.getOffsetBefore(r2, r5)
            int r0 = r5 << r0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            b(r3, r0, r2)
            r0 = r2[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L62
            goto L47
        L2e:
            int r0 = android.text.TextUtils.getOffsetBefore(r2, r4)
            int r0 = 1 - r0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            b(r3, r0, r2)
            r0 = r2[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L62
        L47:
            int r1 = atd.y.getSDKTransactionID.getSDKAppID
            int r1 = r1 + 69
            int r1 = r1 % 128
            atd.y.getSDKTransactionID.AuthenticationRequestParameters = r1
            java.lang.Integer r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(r0)
            if (r0 == 0) goto L62
            int r0 = r0.intValue()
            int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m151constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$IntValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m150boximpl(r0)
            return r0
        L62:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            int r1 = atd.y.getSDKTransactionID.getSDKAppID
            int r1 = r1 + r5
            int r2 = r1 % 128
            atd.y.getSDKTransactionID.AuthenticationRequestParameters = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L75
            return r0
        L75:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.getSDKTransactionID.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/BluetoothDiscoverabilityTimeout$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static short[] getDeviceData;
        private static int getSDKAppID;
        private static char[] getSDKEphemeralPublicKey;
        private static int getSDKReferenceNumber;
        private static byte[] getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r7, short r8, short r9) {
            /*
                int r8 = r8 * 3
                int r8 = 4 - r8
                byte[] r0 = atd.y.getSDKTransactionID.getSDKReferenceNumber.$$a
                int r9 = r9 * 3
                int r9 = 1 - r9
                int r7 = r7 + 101
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r0
                r4 = r2
                r0 = r8
                r8 = r9
                goto L2b
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r0
                r0 = r6
            L2b:
                int r7 = -r7
                int r7 = r7 + r8
                int r8 = r0 + 1
                r0 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.getSDKTransactionID.getSDKReferenceNumber.$$c(byte, short, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKReferenceNumber = 295070004;
            AuthenticationRequestParameters = 829166610;
            getSDKAppID = -801502573;
            getSDKTransactionID = new byte[]{5, -1, 9, 8, -5, 11, -7, 44, 46, 14, -11, -45, 36, -16, 14, -11, -77, 68, -56, -6, -15, 26, 61, -69, 11, 5, -7, -13, 28, -16, -4, 75, -72, 25, -27, 27, -7, 92, -70, 88, -75, 106, 89, 88, 95, -84, 84, -113, -90, 76, -127, 103, 80, -79, 95, -125, -122, 30, 89, 88, 95, -84, 84, -113, -90, 77, -87, -126, 99, -115, 81, 84, -52, -117, -118, -115, 126, -122, 93, 116, -97, 123, 103, -72, -117, -118, -115, 126, -122, 93, 116, -98, 83, -87, -114, 104, -118, 2, -15, 9, -4, 2, 27, -25, -15, 9, -7, 7, 13, 30, -45, 0, -15, -57, 51, 44, -42, -63, 57, -55, 55, 61, 46, -29, 48, -63, -126, 113, -119, 124, -126, -101, 103, 113, -119, 121, -121, -115, -98, -83, 78, 114, -51, 53, -119, -122, 126, -119, 112, -125, -70, 69, 116, 117, 114, -127, 121, -126, -127, 112, -83, 108, 118, -114, 126, ByteCompanionObject.MIN_VALUE, -118, -103, 84, -121, 118, -90, 87, -118, 75, 81, -87, 89, -89, -83, -66, -115, 110, 82, -19, 21, -87, -90, 94, -87, 80, -93, -102, 101, 84, 85, 82, -95, 89, -94, 63, 59, -61, 41, 58, 35, -39, -55, 43, -58, -62, 59, -59, -51, 58, 53, 26, 45, -126, 58, 53, 58, 13, -115, 61, 51, -49, -59, 42, -58, -54, 125, -11, -45, 45, -49, 6, 8, -12, -26, 6, -14, 11, -29, -48, 52, 8, -73, 79, -13, -4, 4, -13, 10, -7, -64, 63, 14, 15, 8, -5, 3, -8, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35};
            getSDKEphemeralPublicKey = new char[]{63259, 63142, 63147, 63149, 63151, 63148, 63136, 63144, 63146, 63141, 63144, 63133, 63358, 63109, 63141, 63149, 63146, 63141, 63144, 63149, 63118, 63117, 63120, 63421, 63459, 63484, 63457, 63463, 63461, 63464, 63461, 63483, 63484, 63395, 63436, 63422, 63421, 63419, 63441, 63284, 63310, 63292, 63295, 63306, 63303, 63280, 63283, 63282, 63286, 63411, 63481, 63459, 63452, 63446, 63485, 63462, 63458, 63481, 63486, 63447, 63239, 63127, 63129, 63105, 63133, 63132, 63132, 63125, 63120, 63128, 63119, 63119, 63127, 63129, 63130, 63128, 63130, 63130, 63133, 63429, 63251, 63253, 63261, 63257, 63256, 63256, 63249, 63276, 63252, 63243, 63457, 63467, 63469, 63481, 63484, 63246, 63276, 63252, 63259, 63479, 63244, 63273, 63249, 63250, 63276, 63251, 63259, 63251, 63247, 63480, 63252, 63252, 63258, 63254, 63480, 63448, 63448, 63443, 63472, 63252, 63237, 63235, 63262, 63238, 63251, 63477, 63252, 63235, 63233, 63260, 63239, 63256, 63263, 63237, 63258, 63263};
        }

        private getSDKReferenceNumber() {
        }

        private static void a(int i11, int i12, int i13, byte b8, short s7, Object[] objArr) throws Throwable {
            boolean z11;
            int i14;
            long j9;
            int i15;
            int i16;
            int i17;
            int i18;
            byte b11;
            long j11;
            int i19;
            atd.bb.getTransactionStatus gettransactionstatus = new atd.bb.getTransactionStatus();
            StringBuilder sb2 = new StringBuilder();
            try {
                int i21 = 1;
                Object[] objArr2 = {Integer.valueOf(i12), Integer.valueOf(AuthenticationRequestParameters)};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-217286249);
                Class cls = Integer.TYPE;
                if (sDKTransactionID == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(1225 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (Process.getGidForName("") + 1), TextUtils.lastIndexOf("", '0', 0) + 34, 795115399, false, $$c(b12, b13, b13), new Class[]{cls, cls});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    $10 = ($11 + 87) % 128;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int i22 = $11 + 59;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        throw null;
                    }
                    byte[] bArr = getSDKTransactionID;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        i18 = -217286249;
                        int i23 = 0;
                        while (i23 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i23])};
                            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1659653064);
                            if (sDKTransactionID2 == null) {
                                i19 = i21;
                                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3316 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 33, -1098625576, false, "f", new Class[]{cls});
                            } else {
                                i19 = i21;
                            }
                            bArr2[i23] = ((Byte) ((Method) sDKTransactionID2).invoke(null, objArr3)).byteValue();
                            i23++;
                            i21 = i19;
                        }
                        bArr = bArr2;
                    } else {
                        i18 = -217286249;
                    }
                    i14 = i21;
                    j9 = 20070962823959587L;
                    if (bArr != null) {
                        int i24 = $10 + 5;
                        $11 = i24 % 128;
                        if (i24 % 2 == 0) {
                            byte[] bArr3 = getSDKTransactionID;
                            Object[] objArr4 = new Object[2];
                            objArr4[i14] = Integer.valueOf(getSDKReferenceNumber);
                            objArr4[0] = Integer.valueOf(i13);
                            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i18);
                            if (sDKTransactionID3 == null) {
                                byte b14 = (byte) 0;
                                byte b15 = b14;
                                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1225 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) Color.red(0), TextUtils.getOffsetAfter("", 0) + 33, 795115399, false, $$c(b14, b15, b15), new Class[]{cls, cls});
                            }
                            b11 = (byte) (((long) bArr3[((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue()]) - 20070962823959587L);
                            j11 = ((long) AuthenticationRequestParameters) / 20070962823959587L;
                        } else {
                            byte[] bArr4 = getSDKTransactionID;
                            Object[] objArr5 = new Object[2];
                            objArr5[i14] = Integer.valueOf(getSDKReferenceNumber);
                            objArr5[0] = Integer.valueOf(i13);
                            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(i18);
                            if (sDKTransactionID4 == null) {
                                byte b16 = (byte) 0;
                                byte b17 = b16;
                                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(View.resolveSize(0, 0) + 1225, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, 795115399, false, $$c(b16, b17, b17), new Class[]{cls, cls});
                            }
                            b11 = (byte) (((long) bArr4[((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue()]) ^ 20070962823959587L);
                            j11 = ((long) AuthenticationRequestParameters) ^ 20070962823959587L;
                        }
                        iIntValue = (byte) (b11 + ((int) j11));
                    } else {
                        iIntValue = (short) (((short) (((long) getDeviceData[i13 + ((int) (((long) getSDKReferenceNumber) ^ 20070962823959587L))]) ^ 20070962823959587L)) + ((int) (((long) AuthenticationRequestParameters) ^ 20070962823959587L)));
                    }
                } else {
                    i14 = 1;
                    j9 = 20070962823959587L;
                }
                if (iIntValue > 0) {
                    int i25 = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKReferenceNumber) ^ j9));
                    if (z11) {
                        $11 = ($10 + 73) % 128;
                        i15 = i14;
                    } else {
                        i15 = 0;
                    }
                    gettransactionstatus.getDeviceData = i25 + i15;
                    int i26 = getSDKAppID;
                    Object[] objArr6 = new Object[4];
                    objArr6[3] = sb2;
                    objArr6[2] = Integer.valueOf(i26);
                    objArr6[i14] = Integer.valueOf(i11);
                    objArr6[0] = gettransactionstatus;
                    Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(-488867474);
                    if (sDKTransactionID5 == null) {
                        int offsetAfter = 2158 - TextUtils.getOffsetAfter("", 0);
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int i27 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35;
                        byte length2 = (byte) $$a.length;
                        byte b18 = (byte) (length2 - 4);
                        sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(offsetAfter, offsetBefore, i27, 1052016510, false, $$c(length2, b18, b18), new Class[]{Object.class, cls, cls, Object.class});
                    }
                    ((StringBuilder) ((Method) sDKTransactionID5).invoke(null, objArr6)).append(gettransactionstatus.getSDKAppID);
                    gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                    byte[] bArr5 = getSDKTransactionID;
                    if (bArr5 != null) {
                        int length3 = bArr5.length;
                        byte[] bArr6 = new byte[length3];
                        for (int i28 = 0; i28 < length3; i28++) {
                            bArr6[i28] = (byte) (((long) bArr5[i28]) ^ j9);
                        }
                        bArr5 = bArr6;
                    }
                    if (bArr5 != null) {
                        i16 = i14;
                        i17 = i16;
                    } else {
                        i16 = 0;
                        i17 = i14;
                    }
                    while (true) {
                        gettransactionstatus.AuthenticationRequestParameters = i17;
                        if (gettransactionstatus.AuthenticationRequestParameters >= iIntValue) {
                            break;
                        }
                        if (i16 != 0) {
                            $11 = ($10 + 99) % 128;
                            byte[] bArr7 = getSDKTransactionID;
                            gettransactionstatus.getDeviceData = gettransactionstatus.getDeviceData - 1;
                            gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((byte) (((byte) (((long) bArr7[r4]) ^ j9)) + s7)) ^ b8));
                        } else {
                            short[] sArr = getDeviceData;
                            gettransactionstatus.getDeviceData = gettransactionstatus.getDeviceData - 1;
                            gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((short) (((short) (((long) sArr[r4]) ^ j9)) + s7)) ^ b8));
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

        private static void b(String str, boolean z11, int[] iArr, Object[] objArr) throws Throwable {
            int i11;
            int length;
            char[] cArr;
            int i12;
            byte[] bArr;
            String str2 = str;
            Object bytes = str2;
            if (str2 != null) {
                $10 = ($11 + 91) % 128;
                bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr2 = (byte[]) bytes;
            atd.bb.ChallengeResultError challengeResultError = new atd.bb.ChallengeResultError();
            int i13 = 0;
            int i14 = iArr[0];
            int i15 = iArr[1];
            int i16 = iArr[2];
            int i17 = iArr[3];
            char[] cArr2 = getSDKEphemeralPublicKey;
            Class cls = Integer.TYPE;
            if (cArr2 != null) {
                int i18 = $11 + 19;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i12 = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i12 = 0;
                }
                while (i12 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                        if (sDKTransactionID == null) {
                            bArr = bArr2;
                            byte b8 = (byte) i13;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2943 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) Color.red(i13), (TypedValue.complexToFraction(i13, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i13, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, -258931888, false, $$c((byte) 6, b8, b8), new Class[]{cls});
                        } else {
                            bArr = bArr2;
                        }
                        cArr[i12] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i12++;
                        bArr2 = bArr;
                        i13 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr;
            }
            byte[] bArr3 = bArr2;
            char[] cArr3 = new char[i15];
            System.arraycopy(cArr2, i14, cArr3, 0, i15);
            if (bArr3 != null) {
                char[] cArr4 = new char[i15];
                challengeResultError.AuthenticationRequestParameters = 0;
                char c3 = 0;
                while (true) {
                    int i19 = challengeResultError.AuthenticationRequestParameters;
                    if (i19 >= i15) {
                        break;
                    }
                    $11 = ($10 + 53) % 128;
                    if (bArr3[i19] == 1) {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i19]), Integer.valueOf(c3)};
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
                        if (sDKTransactionID2 == null) {
                            byte b11 = (byte) 0;
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3095 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TextUtils.getTrimmedLength("") + 14367), 18 - (KeyEvent.getMaxKeyCode() >> 16), -210991631, false, $$c((byte) 7, b11, b11), new Class[]{cls, cls});
                        }
                        cArr4[i19] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(cArr3[i19]), Integer.valueOf(c3)};
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-565071239);
                        if (sDKTransactionID3 == null) {
                            byte b12 = (byte) 0;
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Drawable.resolveOpacity(0, 0) + 2774, (char) (13060 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 25, 37336169, false, $$c((byte) 9, b12, b12), new Class[]{cls, cls});
                        }
                        cArr4[i19] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                    }
                    c3 = cArr4[challengeResultError.AuthenticationRequestParameters];
                    Object[] objArr5 = {challengeResultError, challengeResultError};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(2107237619);
                    if (sDKTransactionID4 == null) {
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollBarSize() >> 8) + 2278, (char) (Color.blue(0) + 65522), 35 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1577983261, false, "m", new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i17 > 0) {
                char[] cArr5 = new char[i15];
                i11 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i15);
                int i21 = i15 - i17;
                System.arraycopy(cArr5, 0, cArr3, i21, i17);
                System.arraycopy(cArr5, i17, cArr3, 0, i21);
            } else {
                i11 = 0;
            }
            if (z11) {
                char[] cArr6 = new char[i15];
                challengeResultError.AuthenticationRequestParameters = i11;
                $11 = ($10 + 75) % 128;
                while (true) {
                    int i22 = challengeResultError.AuthenticationRequestParameters;
                    if (i22 >= i15) {
                        break;
                    }
                    cArr6[i22] = cArr3[(i15 - i22) - 1];
                    challengeResultError.AuthenticationRequestParameters = i22 + 1;
                }
                cArr3 = cArr6;
            }
            if (i16 > 0) {
                int i23 = $11 + 85;
                $10 = i23 % 128;
                int i24 = i23 % 2;
                challengeResultError.AuthenticationRequestParameters = 0;
                while (true) {
                    int i25 = challengeResultError.AuthenticationRequestParameters;
                    if (i25 >= i15) {
                        break;
                    }
                    $10 = ($11 + 27) % 128;
                    cArr3[i25] = (char) (cArr3[i25] - iArr[2]);
                    challengeResultError.AuthenticationRequestParameters = i25 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r24v0 */
        /* JADX WARN: Type inference failed for: r24v1 */
        /* JADX WARN: Type inference failed for: r24v16 */
        /* JADX WARN: Type inference failed for: r24v17 */
        /* JADX WARN: Type inference failed for: r24v18 */
        /* JADX WARN: Type inference failed for: r24v19 */
        /* JADX WARN: Type inference failed for: r24v20 */
        /* JADX WARN: Type inference failed for: r24v21 */
        /* JADX WARN: Type inference failed for: r24v22 */
        /* JADX WARN: Type inference failed for: r24v23 */
        /* JADX WARN: Type inference failed for: r24v24 */
        /* JADX WARN: Type inference failed for: r24v3 */
        /* JADX WARN: Type inference failed for: r24v31 */
        /* JADX WARN: Type inference failed for: r24v4 */
        /* JADX WARN: Type inference failed for: r24v9 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKAppID(android.content.Context r36, int r37, int r38) {
            /*
                Method dump skipped, instruction units count: 1660
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.getSDKTransactionID.getSDKReferenceNumber.getSDKAppID(android.content.Context, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{4, -95, 14, -12};
            $$b = 85;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKTransactionID(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
