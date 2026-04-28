package atd.as;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.Warning;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/EmulatorDetectedWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;

    @NotNull
    public static final AuthenticationRequestParameters getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int[] getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, int r8) {
        /*
            int r8 = r8 + 4
            int r7 = 114 - r7
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = atd.as.AuthenticationRequestParameters.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r6
            goto L2c
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r1
            r1 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.AuthenticationRequestParameters.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        AuthenticationRequestParameters();
        getSDKAppID = new AuthenticationRequestParameters();
        getSDKReferenceNumber = (getSDKEphemeralPublicKey + 111) % 128;
    }

    private AuthenticationRequestParameters() {
    }

    public static void AuthenticationRequestParameters() {
        getSDKTransactionID = new int[]{-851119704, -421953732, -408669590, -160498718, 2031320739, 801294487, 783987709, -1363428743, -232973081, -388191617, 182333366, 1242627485, 996692265, -1400834124, 1730931863, -2143602657, 1546284704, -755410443};
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        char[] cArr;
        int[] iArr2;
        int i13;
        int length;
        int[] iArr3;
        int i14;
        int i15;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i16 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr4 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        int i17 = 0;
        if (iArr4 != null) {
            int i18 = $11 + 51;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                length = iArr4.length;
                iArr3 = new int[length];
                i14 = 1;
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
                i14 = 0;
            }
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i14])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID == null) {
                        int iRed = Color.red(i17) + 2223;
                        i15 = i16;
                        char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 53069);
                        int i19 = 21 - (TypedValue.complexToFloat(i17) > 0.0f ? 1 : (TypedValue.complexToFloat(i17) == 0.0f ? 0 : -1));
                        byte b8 = (byte) i17;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iRed, c3, i19, 1089703072, false, $$c(b8, b11, (byte) (b11 - 1)), new Class[]{cls});
                    } else {
                        i15 = i16;
                    }
                    iArr3[i14] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i14++;
                    i16 = i15;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int i21 = i16;
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKTransactionID;
        int i22 = 16;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i23 = 0;
            while (i23 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i23])};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                if (sDKTransactionID2 == null) {
                    cArr = cArr2;
                    i13 = i22;
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    iArr2 = iArr6;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2223 - (ViewConfiguration.getFadingEdgeLength() >> i22), (char) (53070 - (Process.myTid() >> 22)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21, 1089703072, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                    i13 = i22;
                }
                iArr7[i23] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i23++;
                i22 = i13;
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        int i24 = i22;
        char c7 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i25 = getmessageversion.getSDKAppID;
            if (i25 >= iArr.length) {
                String str = new String(cArr3, 0, i11);
                $10 = ($11 + 19) % 128;
                objArr[0] = str;
                return;
            }
            int i26 = iArr[i25];
            char c8 = (char) (i26 >> 16);
            cArr4[c7] = c8;
            char c11 = (char) i26;
            cArr4[1] = c11;
            char c12 = (char) (iArr[i25 + 1] >> 16);
            cArr4[i21] = c12;
            char c13 = (char) iArr[i25 + 1];
            cArr4[3] = c13;
            getmessageversion.getDeviceData = (c8 << 16) + c11;
            getmessageversion.AuthenticationRequestParameters = (c12 << 16) + c13;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i27 = 0;
            while (true) {
                i12 = getmessageversion.getDeviceData;
                if (i27 >= i24) {
                    break;
                }
                int i28 = i12 ^ iArr5[i27];
                getmessageversion.getDeviceData = i28;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i28);
                Object[] objArr4 = new Object[4];
                objArr4[3] = getmessageversion;
                objArr4[i21] = getmessageversion;
                objArr4[1] = Integer.valueOf(sDKReferenceNumber);
                objArr4[0] = getmessageversion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 2);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(TextUtils.getOffsetBefore("", 0) + 2386, (char) TextUtils.getOffsetAfter("", 0), View.combineMeasuredStates(0, 0) + 19, -2040903174, false, $$c(b14, b15, (byte) (b15 - 3)), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i27++;
                $10 = ($11 + 3) % 128;
                i24 = 16;
            }
            int i29 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i29;
            getmessageversion.AuthenticationRequestParameters = i12;
            i24 = 16;
            int i31 = i12 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i31;
            int i32 = i29 ^ iArr5[17];
            getmessageversion.getDeviceData = i32;
            cArr4[0] = (char) (i32 >>> 16);
            cArr4[1] = (char) i32;
            cArr4[i21] = (char) (i31 >>> 16);
            cArr4[3] = (char) i31;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i33 = getmessageversion.getSDKAppID;
            cArr3[i33 * 2] = cArr4[0];
            cArr3[(i33 * 2) + 1] = cArr4[1];
            cArr3[(i33 * 2) + 2] = cArr4[i21];
            cArr3[(i33 * 2) + 3] = cArr4[3];
            int i34 = i21;
            Object[] objArr5 = new Object[i34];
            objArr5[1] = getmessageversion;
            objArr5[0] = getmessageversion;
            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID4 == null) {
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 + 1);
                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1860 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 41, -562771681, false, $$c(b16, b17, (byte) (-b17)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID4).invoke(null, objArr5);
            i21 = i34;
            c7 = 0;
        }
    }

    public static void init$0() {
        $$a = new byte[]{123, -86, -87, -12};
        $$b = 149;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getID() throws Throwable {
        Object obj;
        int i11 = getDeviceData + 101;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(new int[]{-1572010179, -1731011850}, 5 >>> (ViewConfiguration.getTouchSlop() - 109), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{-1572010179, -1731011850}, (ViewConfiguration.getTouchSlop() >> 8) + 4, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i12 = AuthenticationRequestParameters + 19;
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 4 / 0;
        }
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getMessage() throws Throwable {
        AuthenticationRequestParameters = (getDeviceData + 57) % 128;
        Object[] objArr = new Object[1];
        a(new int[]{1346857284, -2028572474, -1168972690, 497622070, 508665649, 1702723798, -166682928, 2010316350, -318925090, -1644613244, 2061611310, 1448529258, 258191374, -806828339, 781825373, 1821084182, 1022367095, -1902095415, -252843836, -2018235802, -534506465, 1640897041}, 41 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        String strIntern = ((String) objArr[0]).intern();
        AuthenticationRequestParameters = (getDeviceData + 105) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final Warning.Severity getSeverity() {
        AuthenticationRequestParameters = (getDeviceData + 57) % 128;
        Warning.Severity severity = Warning.Severity.HIGH;
        int i11 = AuthenticationRequestParameters + 49;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return severity;
        }
        throw null;
    }
}
