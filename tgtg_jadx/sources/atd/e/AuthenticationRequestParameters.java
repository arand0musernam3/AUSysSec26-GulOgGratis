package atd.e;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.getTransactionStatus;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ AuthenticationRequestParameters[] $VALUES;
    private static short[] AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    public static final AuthenticationRequestParameters V2_1_0;
    public static final AuthenticationRequestParameters V2_2_0;
    private static byte[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.g.getDeviceData mDataVersion;
    private final String mVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = 1 - r6
            int r8 = r8 * 4
            int r8 = 105 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = atd.e.AuthenticationRequestParameters.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.AuthenticationRequestParameters.$$c(int, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        getSDKAppID();
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 316638573, (-27) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-1260371488) + ExpandableListView.getPackedPositionChild(0L), (byte) View.MeasureSpec.getSize(0), (short) (84 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(316638537 - (ViewConfiguration.getTapTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 26, (-1260371482) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (39 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr2);
        V2_1_0 = new AuthenticationRequestParameters(strIntern, 0, ((String) objArr2[0]).intern(), atd.g.getDeviceData.V1_6);
        Object[] objArr3 = new Object[1];
        a(Color.green(0) + 316638573, (-26) - TextUtils.indexOf("", "", 0, 0), (-1260371478) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), (short) ((-121) - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(316638536 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 26, (KeyEvent.getMaxKeyCode() >> 16) - 1260371472, (byte) Color.blue(0), (short) ((-97) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr4);
        V2_2_0 = new AuthenticationRequestParameters(strIntern2, 1, ((String) objArr4[0]).intern(), atd.g.getDeviceData.V1_7);
        $VALUES = getSDKReferenceNumber();
        getSDKEphemeralPublicKey = (getMessageVersion + 39) % 128;
    }

    private AuthenticationRequestParameters(String str, int i11, String str2, atd.g.getDeviceData getdevicedata) {
        this.mVersion = str2;
        this.mDataVersion = getdevicedata;
    }

    private static void a(int i11, int i12, int i13, byte b8, short s7, Object[] objArr) throws Throwable {
        int i14;
        long j9;
        int i15;
        int i16;
        int i17;
        long j11;
        int i18;
        int i19;
        int length;
        byte[] bArr;
        int length2;
        byte[] bArr2;
        int i21;
        int i22;
        int i23;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i24 = 1;
            Object[] objArr2 = {Integer.valueOf(i12), Integer.valueOf(getSDKAppID)};
            Object sDKTransactionID = ChallengeResult.getSDKTransactionID(-217286249);
            Class cls = Integer.TYPE;
            int i25 = 4;
            if (sDKTransactionID == null) {
                int iMakeMeasureSpec = 33 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b11 = (byte) ($$b - 4);
                i14 = -217286249;
                byte b12 = b11;
                j9 = 0;
                sDKTransactionID = ChallengeResult.getDeviceData(1225 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), iMakeMeasureSpec, 795115399, false, $$c(b11, b12, (byte) (b12 + 1)), new Class[]{cls, cls});
            } else {
                i14 = -217286249;
                j9 = 0;
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                $10 = ($11 + 115) % 128;
                i15 = 1;
            } else {
                $11 = ($10 + 17) % 128;
                i15 = 0;
            }
            if (i15 != 0) {
                int i26 = ($10 + 95) % 128;
                $11 = i26;
                byte[] bArr3 = getDeviceData;
                if (bArr3 != null) {
                    int i27 = i26 + 19;
                    $10 = i27 % 128;
                    if (i27 % 2 != 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i21 = 1;
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i21 = 0;
                    }
                    j11 = 20070962823959587L;
                    while (i21 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr3[i21])};
                        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1659653064);
                        if (sDKTransactionID2 == null) {
                            i22 = i24;
                            i23 = i25;
                            sDKTransactionID2 = ChallengeResult.getDeviceData(3317 - (ViewConfiguration.getGlobalActionKeyTimeout() > j9 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j9 ? 0 : -1)), (char) TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf("", "", 0) + 33, -1098625576, false, "f", new Class[]{cls});
                        } else {
                            i22 = i24;
                            i23 = i25;
                        }
                        bArr2[i21] = ((Byte) ((Method) sDKTransactionID2).invoke(null, objArr3)).byteValue();
                        i21++;
                        i25 = i23;
                        i24 = i22;
                    }
                    bArr3 = bArr2;
                } else {
                    j11 = 20070962823959587L;
                }
                i16 = i24;
                i17 = i25;
                if (bArr3 != null) {
                    byte[] bArr4 = getDeviceData;
                    Object[] objArr4 = new Object[2];
                    objArr4[i16] = Integer.valueOf(getSDKTransactionID);
                    objArr4[0] = Integer.valueOf(i13);
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(i14);
                    if (sDKTransactionID3 == null) {
                        byte b13 = (byte) ($$b - 4);
                        byte b14 = b13;
                        sDKTransactionID3 = ChallengeResult.getDeviceData(1224 - ImageFormat.getBitsPerPixel(0), (char) KeyEvent.keyCodeFromString(""), TextUtils.getOffsetAfter("", 0) + 33, 795115399, false, $$c(b13, b14, (byte) (b14 + 1)), new Class[]{cls, cls});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue()]) ^ j11)) + ((int) (((long) getSDKAppID) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) AuthenticationRequestParameters[i13 + ((int) (((long) getSDKTransactionID) ^ j11))]) ^ j11)) + ((int) (((long) getSDKAppID) ^ j11)));
                }
            } else {
                i16 = 1;
                i17 = 4;
                j11 = 20070962823959587L;
            }
            if (iIntValue > 0) {
                $11 = ($10 + 1) % 128;
                gettransactionstatus.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKTransactionID) ^ j11)) + i15;
                int i28 = getSDKReferenceNumber;
                Object[] objArr5 = new Object[i17];
                objArr5[3] = sb2;
                objArr5[2] = Integer.valueOf(i28);
                objArr5[i16] = Integer.valueOf(i11);
                objArr5[0] = gettransactionstatus;
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-488867474);
                if (sDKTransactionID4 == null) {
                    byte b15 = (byte) ($$b - 4);
                    byte b16 = b15;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(Color.red(0) + 2158, (char) View.MeasureSpec.getSize(0), (KeyEvent.getMaxKeyCode() >> 16) + 36, 1052016510, false, $$c(b15, b16, b16), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) sDKTransactionID4).invoke(null, objArr5)).append(gettransactionstatus.getSDKAppID);
                gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                byte[] bArr5 = getDeviceData;
                if (bArr5 != null) {
                    int i29 = $10 + 77;
                    $11 = i29 % 128;
                    if (i29 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i31 = 0; i31 < length; i31++) {
                        bArr[i31] = (byte) (((long) bArr5[i31]) ^ j11);
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    $11 = ($10 + 121) % 128;
                    i18 = i16;
                    i19 = i18;
                } else {
                    i18 = 0;
                    i19 = i16;
                }
                gettransactionstatus.AuthenticationRequestParameters = i19;
                $11 = ($10 + 83) % 128;
                while (gettransactionstatus.AuthenticationRequestParameters < iIntValue) {
                    $10 = ($11 + 85) % 128;
                    int i32 = gettransactionstatus.getDeviceData;
                    if (i18 != 0) {
                        byte[] bArr6 = getDeviceData;
                        gettransactionstatus.getDeviceData = i32 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((byte) (((byte) (((long) bArr6[i32]) ^ j11)) + s7)) ^ b8));
                    } else {
                        short[] sArr = AuthenticationRequestParameters;
                        gettransactionstatus.getDeviceData = i32 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((short) (((short) (((long) sArr[i32]) ^ j11)) + s7)) ^ b8));
                    }
                    sb2.append(gettransactionstatus.getSDKAppID);
                    gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                    gettransactionstatus.AuthenticationRequestParameters++;
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

    public static AuthenticationRequestParameters[] getDeviceData() {
        ChallengeResult = (ChallengeResultCancelled + 63) % 128;
        AuthenticationRequestParameters[] authenticationRequestParametersArrValues = values();
        ChallengeResultCancelled = (ChallengeResult + 39) % 128;
        return authenticationRequestParametersArrValues;
    }

    public static void getSDKAppID() {
        getSDKTransactionID = 2054400514;
        getSDKAppID = 829166650;
        getSDKReferenceNumber = -598970678;
        getDeviceData = new byte[]{-50, 94, -7, 93, -6, -85, -49, -8, -11, -1, -10, -50, 105, -123, 111, -123, 118, -49, 71, 125, 69, 125};
    }

    private static /* synthetic */ AuthenticationRequestParameters[] getSDKReferenceNumber() {
        int i11 = (ChallengeResultCancelled + 87) % 128;
        ChallengeResult = i11;
        AuthenticationRequestParameters[] authenticationRequestParametersArr = {V2_1_0, V2_2_0};
        int i12 = i11 + 37;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 == 0) {
            return authenticationRequestParametersArr;
        }
        throw null;
    }

    public static AuthenticationRequestParameters getSDKTransactionID(String str) {
        AuthenticationRequestParameters[] authenticationRequestParametersArrValues;
        int length;
        int i11;
        if (!TextUtils.isEmpty(str)) {
            int i12 = ChallengeResultCancelled + 31;
            ChallengeResult = i12 % 128;
            if (i12 % 2 == 0) {
                authenticationRequestParametersArrValues = values();
                length = authenticationRequestParametersArrValues.length;
                i11 = 1;
            } else {
                authenticationRequestParametersArrValues = values();
                length = authenticationRequestParametersArrValues.length;
                i11 = 0;
            }
            while (i11 < length) {
                AuthenticationRequestParameters authenticationRequestParameters = authenticationRequestParametersArrValues[i11];
                if (authenticationRequestParameters.AuthenticationRequestParameters().equals(str)) {
                    int i13 = ChallengeResult + 87;
                    ChallengeResultCancelled = i13 % 128;
                    if (i13 % 2 == 0) {
                        return authenticationRequestParameters;
                    }
                    throw null;
                }
                i11++;
            }
        }
        throw atd.aa.getDeviceData.MESSAGE_VERSION.getSDKAppID();
    }

    public static void init$0() {
        $$a = new byte[]{29, 9, 51, -111};
        $$b = 4;
    }

    public static AuthenticationRequestParameters valueOf(String str) {
        ChallengeResultCancelled = (ChallengeResult + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) Enum.valueOf(AuthenticationRequestParameters.class, str);
        int i11 = ChallengeResultCancelled + 15;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 63 / 0;
        }
        return authenticationRequestParameters;
    }

    public static AuthenticationRequestParameters[] values() {
        ChallengeResult = (ChallengeResultCancelled + 1) % 128;
        AuthenticationRequestParameters[] authenticationRequestParametersArr = (AuthenticationRequestParameters[]) $VALUES.clone();
        ChallengeResult = (ChallengeResultCancelled + 77) % 128;
        return authenticationRequestParametersArr;
    }

    public final String AuthenticationRequestParameters() {
        int i11 = (ChallengeResult + 59) % 128;
        ChallengeResultCancelled = i11;
        String str = this.mVersion;
        int i12 = i11 + 43;
        ChallengeResult = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i11 = ChallengeResultCancelled + 75;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            AuthenticationRequestParameters();
            throw null;
        }
        String strAuthenticationRequestParameters = AuthenticationRequestParameters();
        ChallengeResult = (ChallengeResultCancelled + 117) % 128;
        return strAuthenticationRequestParameters;
    }

    public final atd.g.getDeviceData getSDKTransactionID() {
        int i11 = (ChallengeResultCancelled + 105) % 128;
        ChallengeResult = i11;
        atd.g.getDeviceData getdevicedata = this.mDataVersion;
        ChallengeResultCancelled = (i11 + 13) % 128;
        return getdevicedata;
    }
}
