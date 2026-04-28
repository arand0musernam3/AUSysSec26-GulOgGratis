package atd.u;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.ChallengeResultError;
import atd.bb.getTransactionStatus;
import atd.e.ChallengeResult;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/statfs/GetTotalBytes;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$LongValue;", "getDeviceParameterResult-9LCWfJs", "()J", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends DeviceParameter {
    private static char AuthenticationRequestParameters = 0;
    private static int BuildConfig = 0;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static char getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        getSDKTransactionID();
        ViewConfiguration.getEdgeSlop();
        new getSDKTransactionID((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 35;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 2 / 0;
        }
    }

    private static long AuthenticationRequestParameters() {
        long jM158constructorimpl = DeviceParameterResult.Success.LongValue.m158constructorimpl(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
        getMessageVersion = (getDeviceData + 117) % 128;
        return jM158constructorimpl;
    }

    public static void getSDKTransactionID() {
        getSDKAppID = (char) 13029;
        getSDKReferenceNumber = (char) 36908;
        getSDKTransactionID = (char) 8164;
        AuthenticationRequestParameters = (char) 8593;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getDeviceData = (getMessageVersion + 109) % 128;
        DeviceParameterResult.Success.LongValue longValueM157boximpl = DeviceParameterResult.Success.LongValue.m157boximpl(AuthenticationRequestParameters());
        int i11 = getDeviceData + 25;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return longValueM157boximpl;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/statfs/GetTotalBytes$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static char[] ChallengeResultCancelled;
        private static short[] getDeviceData;
        private static int getSDKAppID;
        private static byte[] getSDKReferenceNumber;
        private static int getSDKTransactionID;

        private static String $$c(short s7, int i11, int i12) {
            int i13 = s7 + 101;
            int i14 = i11 * 4;
            int i15 = 3 - (i12 * 3);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i14];
            int i16 = 0 - i14;
            int i17 = -1;
            if (bArr == null) {
                i13 += -i16;
            }
            while (true) {
                i17++;
                bArr2[i17] = (byte) i13;
                if (i17 == i16) {
                    return new String(bArr2, 0);
                }
                i15++;
                i13 += -bArr[i15];
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKAppID = 378522136;
            getSDKTransactionID = 829166663;
            AuthenticationRequestParameters = -671207517;
            getSDKReferenceNumber = new byte[]{-31, -15, 11, -3, -4, 15, -1, 13, -40, -38, -6, 1, 39, -48, 4, -6, 1, 71, -80, 60, 14, 5, -18, -55, 79, -1, -15, 13, 7, -24, 4, 8, -65, 76, -19, 17, -17, 13, -112, 3, -20, 14, -7, 0, -45, -22, 69, -7, -10, 14, -7, 0, -13, -54, 53, 4, 5, 2, -15, 9, -14, -119, 71, -77, -84, 86, 65, -71, 73, -73, -67, -82, 99, -80, 65, -98, -42, 37, -35, 40, -42, -49, 51, 37, -35, 45, -45, -39, -54, -7, 26, 38, -103, 97, -35, -46, 42, -35, 36, -41, -18, 17, 32, 33, 38, -43, 45, -42, -119, 69, -76, 105, -88, -78, 74, -70, 68, 78, 93, -112, 67, -78, -103, 32, -47, 12, -51, -41, 47, -33, 33, 43, 56, 11, -24, -44, 107, -109, 47, 32, -40, 47, -42, 37, 28, -29, -46, -45, -44, 39, -33, 36, -101, -59, -53, 55, 37, -59, 49, -56, 32, 19, -9, -53, 116, -116, 48, 63, -57, 48, -55, 58, 3, -4, -51, -52, -53, 56, -64, 59, -124, -110, 101, -118, -69, 86, 123, 113, -67, 89, 113, -116, -87, 75, -90, -94, 91, -91, -83, 90, 85, 122, -122, -87, 75, -73, 85, -81, 81, -90, -99, 42, -56, 37, 33, -40, 38, 46, -39, -42, -7, -47, -46, 32, 6, -15, 97, -39, -42, -39, -18, 110, -34, -48, 44, 38, -55, 37, 41, -98, 22, 48, -50, 44, -112, -13, 9, -1, -2, 13, -3, 15, -38, -40, -8, 3, 37, 28, -23, 6, 3, -16, 21, -38, 39, -9, 6};
            ChallengeResultCancelled = new char[]{63398, 63451, 63430, 63439, 63416, 63431, 63465, 63459, 63487, 63460, 63462, 63448, 63408, 63433, 63410, 63430, 63457, 63460, 63468, 63451, 63421, 63437, 63465, 63459, 63487, 63460, 63462, 63448, 63408, 63434, 63431, 63417, 63460, 63449, 63451, 63442, 63449, 63457, 63247, 63245, 63240, 63244, 63474, 63440, 63425, 63440, 63443, 63449, 63457, 63247, 63245, 63240, 63244, 63474, 63446, 63430, 63460, 63477, 63245, 63242, 63459, 63448, 63420, 63465, 63459, 63469, 63447, 63469, 63464, 63465, 63467, 63465, 63446, 63448, 63464, 63464, 63467, 63465, 63460, 63413, 63484, 63460, 63459, 63484, 63457, 63463, 63461, 63464, 63461, 63447, 63266, 63264, 63308, 63281, 63404, 63452, 63469, 63460, 63486, 63487, 63482, 63486, 63466, 63460, 63460, 63432, 63455, 63459, 63467, 63459, 63484, 63458, 63457, 63481, 63452, 63431, 63467, 63460, 63484, 63454, 63415, 63451, 63460, 63484, 63457, 63464, 63464, 63465, 63469, 63461, 63459, 63447, 63295, 63291, 63292, 63289, 63280, 63283, 63272, 63269, 63287, 63293};
        }

        private getSDKTransactionID() {
        }

        private static void a(int i11, int i12, int i13, byte b8, short s7, Object[] objArr) throws Throwable {
            int i14;
            long j9;
            int i15;
            int i16;
            int i17;
            int i18;
            getTransactionStatus gettransactionstatus = new getTransactionStatus();
            StringBuilder sb2 = new StringBuilder();
            try {
                int i19 = 1;
                Object[] objArr2 = {Integer.valueOf(i12), Integer.valueOf(getSDKTransactionID)};
                int i21 = 0;
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(-217286249);
                Class cls = Integer.TYPE;
                if (sDKTransactionID == null) {
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    sDKTransactionID = ChallengeResult.getDeviceData((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1225, (char) (RoundCornerImageView.DEFAULT_STROKE_COLOR - Color.rgb(0, 0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, 795115399, false, $$c(b11, b12, b12), new Class[]{cls, cls});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                boolean z11 = iIntValue == -1;
                if (z11) {
                    int i22 = $10 + 23;
                    $11 = i22 % 128;
                    if (i22 % 2 == 0) {
                        throw null;
                    }
                    byte[] bArr = getSDKReferenceNumber;
                    if (bArr != null) {
                        int length = bArr.length;
                        j9 = 20070962823959587L;
                        byte[] bArr2 = new byte[length];
                        int i23 = 0;
                        while (i23 < length) {
                            int i24 = i19;
                            Object[] objArr3 = {Integer.valueOf(bArr[i23])};
                            Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1659653064);
                            if (sDKTransactionID2 == null) {
                                i18 = i21;
                                sDKTransactionID2 = ChallengeResult.getDeviceData((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3315, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33, -1098625576, false, "f", new Class[]{cls});
                            } else {
                                i18 = i21;
                            }
                            bArr2[i23] = ((Byte) ((Method) sDKTransactionID2).invoke(null, objArr3)).byteValue();
                            i23++;
                            i19 = i24;
                            i21 = i18;
                        }
                        bArr = bArr2;
                    } else {
                        j9 = 20070962823959587L;
                    }
                    i14 = i19;
                    int i25 = i21;
                    if (bArr != null) {
                        byte[] bArr3 = getSDKReferenceNumber;
                        Object[] objArr4 = new Object[2];
                        objArr4[i14] = Integer.valueOf(getSDKAppID);
                        objArr4[i25] = Integer.valueOf(i13);
                        Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-217286249);
                        if (sDKTransactionID3 == null) {
                            byte b13 = (byte) i25;
                            byte b14 = b13;
                            sDKTransactionID3 = ChallengeResult.getDeviceData(1225 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 33 - (ViewConfiguration.getLongPressTimeout() >> 16), 795115399, false, $$c(b13, b14, b14), new Class[]{cls, cls});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue()]) ^ j9)) + ((int) (((long) getSDKTransactionID) ^ j9)));
                    } else {
                        iIntValue = (short) (((short) (((long) getDeviceData[i13 + ((int) (((long) getSDKAppID) ^ j9))]) ^ j9)) + ((int) (((long) getSDKTransactionID) ^ j9)));
                    }
                } else {
                    i14 = 1;
                    j9 = 20070962823959587L;
                }
                if (iIntValue > 0) {
                    int i26 = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKAppID) ^ j9));
                    if (z11) {
                        $10 = ($11 + 97) % 128;
                        i15 = i14;
                    } else {
                        i15 = 0;
                    }
                    gettransactionstatus.getDeviceData = i26 + i15;
                    int i27 = AuthenticationRequestParameters;
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = sb2;
                    objArr5[2] = Integer.valueOf(i27);
                    objArr5[i14] = Integer.valueOf(i11);
                    objArr5[0] = gettransactionstatus;
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-488867474);
                    if (sDKTransactionID4 == null) {
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2158;
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 37;
                        byte length2 = (byte) $$a.length;
                        byte b15 = (byte) (length2 - 4);
                        sDKTransactionID4 = ChallengeResult.getDeviceData(iKeyCodeFromString, cMyPid, iLastIndexOf, 1052016510, false, $$c(length2, b15, b15), new Class[]{Object.class, cls, cls, Object.class});
                    }
                    ((StringBuilder) ((Method) sDKTransactionID4).invoke(null, objArr5)).append(gettransactionstatus.getSDKAppID);
                    gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                    byte[] bArr4 = getSDKReferenceNumber;
                    if (bArr4 != null) {
                        int length3 = bArr4.length;
                        byte[] bArr5 = new byte[length3];
                        for (int i28 = 0; i28 < length3; i28++) {
                            bArr5[i28] = (byte) (((long) bArr4[i28]) ^ j9);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        i16 = i14;
                        i17 = i16;
                    } else {
                        i16 = i14;
                        i17 = 0;
                    }
                    while (true) {
                        gettransactionstatus.AuthenticationRequestParameters = i16;
                        if (gettransactionstatus.AuthenticationRequestParameters >= iIntValue) {
                            break;
                        }
                        int i29 = gettransactionstatus.getDeviceData;
                        if (i17 != 0) {
                            byte[] bArr6 = getSDKReferenceNumber;
                            gettransactionstatus.getDeviceData = i29 - 1;
                            gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((byte) (((byte) (((long) bArr6[i29]) ^ j9)) + s7)) ^ b8));
                            $10 = ($11 + 41) % 128;
                        } else {
                            short[] sArr = getDeviceData;
                            gettransactionstatus.getDeviceData = i29 - 1;
                            gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((short) (((short) (((long) sArr[i29]) ^ j9)) + s7)) ^ b8));
                        }
                        sb2.append(gettransactionstatus.getSDKAppID);
                        gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                        i16 = gettransactionstatus.AuthenticationRequestParameters + 1;
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
            int i12;
            byte[] bArr;
            int i13;
            String str2 = str;
            int i14 = $11 + 11;
            $10 = i14 % 128;
            Object bytes = str2;
            if (i14 % 2 != 0) {
                throw null;
            }
            if (str2 != null) {
                bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr2 = (byte[]) bytes;
            ChallengeResultError challengeResultError = new ChallengeResultError();
            int i15 = iArr[0];
            int i16 = iArr[1];
            int i17 = iArr[2];
            int i18 = iArr[3];
            char[] cArr = ChallengeResultCancelled;
            Class cls = Integer.TYPE;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                i11 = 2;
                int i19 = 0;
                while (i19 < length) {
                    int i21 = $11 + 105;
                    $10 = i21 % 128;
                    if (i21 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i19])};
                            Object sDKTransactionID = ChallengeResult.getSDKTransactionID(754517312);
                            if (sDKTransactionID == null) {
                                bArr = bArr2;
                                i13 = i19;
                                byte b8 = (byte) 0;
                                sDKTransactionID = ChallengeResult.getDeviceData(2943 - (Process.myTid() >> 22), (char) (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0) + 38, -258931888, false, $$c((byte) 6, b8, b8), new Class[]{cls});
                            } else {
                                bArr = bArr2;
                                i13 = i19;
                            }
                            cArr2[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                            i19 = i13 / 0;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        bArr = bArr2;
                        int i22 = i19;
                        Object[] objArr3 = {Integer.valueOf(cArr[i22])};
                        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(754517312);
                        if (sDKTransactionID2 == null) {
                            byte b11 = (byte) 0;
                            sDKTransactionID2 = ChallengeResult.getDeviceData((ViewConfiguration.getFadingEdgeLength() >> 16) + 2943, (char) View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "") + 37, -258931888, false, $$c((byte) 6, b11, b11), new Class[]{cls});
                        }
                        cArr2[i22] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                        i19 = i22 + 1;
                    }
                    bArr2 = bArr;
                }
                cArr = cArr2;
            } else {
                i11 = 2;
            }
            byte[] bArr3 = bArr2;
            char[] cArr3 = new char[i16];
            System.arraycopy(cArr, i15, cArr3, 0, i16);
            if (bArr3 != null) {
                $10 = ($11 + 23) % 128;
                char[] cArr4 = new char[i16];
                challengeResultError.AuthenticationRequestParameters = 0;
                char c3 = 0;
                while (true) {
                    int i23 = challengeResultError.AuthenticationRequestParameters;
                    if (i23 >= i16) {
                        break;
                    }
                    int i24 = $11;
                    $10 = (i24 + 53) % 128;
                    if (bArr3[i23] == 1) {
                        int i25 = i24 + 59;
                        $10 = i25 % 128;
                        if (i25 % 2 != 0) {
                            char c7 = cArr3[i23];
                            Object[] objArr4 = new Object[i11];
                            objArr4[1] = Integer.valueOf(c3);
                            objArr4[0] = Integer.valueOf(c7);
                            Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(788825057);
                            if (sDKTransactionID3 == null) {
                                byte b12 = (byte) 0;
                                sDKTransactionID3 = ChallengeResult.getDeviceData(View.combineMeasuredStates(0, 0) + 3095, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 14367), View.combineMeasuredStates(0, 0) + 18, -210991631, false, $$c((byte) 7, b12, b12), new Class[]{cls, cls});
                            }
                            cArr4[i23] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                            int i26 = 68 / 0;
                        } else {
                            Object[] objArr5 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c3)};
                            Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(788825057);
                            if (sDKTransactionID4 == null) {
                                byte b13 = (byte) 0;
                                sDKTransactionID4 = ChallengeResult.getDeviceData(3096 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14367), 18 - TextUtils.getOffsetBefore("", 0), -210991631, false, $$c((byte) 7, b13, b13), new Class[]{cls, cls});
                            }
                            cArr4[i23] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                        }
                    } else {
                        Object[] objArr6 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c3)};
                        Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(-565071239);
                        if (sDKTransactionID5 == null) {
                            byte b14 = (byte) 0;
                            sDKTransactionID5 = ChallengeResult.getDeviceData(2774 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (13060 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, 37336169, false, $$c((byte) 9, b14, b14), new Class[]{cls, cls});
                        }
                        cArr4[i23] = ((Character) ((Method) sDKTransactionID5).invoke(null, objArr6)).charValue();
                    }
                    c3 = cArr4[challengeResultError.AuthenticationRequestParameters];
                    Object[] objArr7 = {challengeResultError, challengeResultError};
                    Object sDKTransactionID6 = ChallengeResult.getSDKTransactionID(2107237619);
                    if (sDKTransactionID6 == null) {
                        sDKTransactionID6 = ChallengeResult.getDeviceData(View.MeasureSpec.getSize(0) + 2278, (char) (65523 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 34 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1577983261, false, "m", new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID6).invoke(null, objArr7);
                    $11 = ($10 + 23) % 128;
                    i11 = 2;
                }
                cArr3 = cArr4;
            }
            if (i18 > 0) {
                char[] cArr5 = new char[i16];
                i12 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i16);
                int i27 = i16 - i18;
                System.arraycopy(cArr5, 0, cArr3, i27, i18);
                System.arraycopy(cArr5, i18, cArr3, 0, i27);
            } else {
                i12 = 0;
            }
            if (z11) {
                char[] cArr6 = new char[i16];
                challengeResultError.AuthenticationRequestParameters = i12;
                while (true) {
                    int i28 = challengeResultError.AuthenticationRequestParameters;
                    if (i28 >= i16) {
                        break;
                    }
                    cArr6[i28] = cArr3[(i16 - i28) - 1];
                    challengeResultError.AuthenticationRequestParameters = i28 + 1;
                }
                cArr3 = cArr6;
            }
            if (i17 > 0) {
                challengeResultError.AuthenticationRequestParameters = 0;
                while (true) {
                    int i29 = challengeResultError.AuthenticationRequestParameters;
                    if (i29 >= i16) {
                        break;
                    }
                    cArr3[i29] = (char) (cArr3[i29] - iArr[2]);
                    challengeResultError.AuthenticationRequestParameters = i29 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r22v0 */
        /* JADX WARN: Type inference failed for: r22v1 */
        /* JADX WARN: Type inference failed for: r22v11, types: [int] */
        /* JADX WARN: Type inference failed for: r22v14, types: [int] */
        /* JADX WARN: Type inference failed for: r22v16 */
        /* JADX WARN: Type inference failed for: r22v20 */
        /* JADX WARN: Type inference failed for: r22v3 */
        /* JADX WARN: Type inference failed for: r22v32 */
        /* JADX WARN: Type inference failed for: r22v33 */
        /* JADX WARN: Type inference failed for: r22v4, types: [int] */
        /* JADX WARN: Type inference failed for: r22v6, types: [int] */
        /* JADX WARN: Type inference failed for: r22v8, types: [int] */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKTransactionID(android.content.Context r35, int r36, int r37) {
            /*
                Method dump skipped, instruction units count: 1672
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.u.getSDKReferenceNumber.getSDKTransactionID.getSDKTransactionID(android.content.Context, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{48, -79, 31, 67};
            $$b = 138;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }
}
