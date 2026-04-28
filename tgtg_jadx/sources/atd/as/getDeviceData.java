package atd.as;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.AndroidCharacter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultError;
import com.adyen.threeds2.Warning;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/DebuggerAttachedWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;

    @NotNull
    public static final getDeviceData getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, int r7) {
        /*
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = atd.as.getDeviceData.$$a
            int r7 = 110 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            r4 = r1[r5]
            int r3 = r3 + 1
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getDeviceData.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        ChallengeResult = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber();
        getSDKTransactionID = new getDeviceData();
        int i11 = getSDKReferenceNumber + 55;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getDeviceData() {
    }

    private static void a(int[] iArr, String str, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        char[] cArr;
        char c3;
        long j9;
        byte[] bArr;
        String str2 = str;
        Object bytes = str2;
        if (str2 != null) {
            $10 = ($11 + 71) % 128;
            bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr2 = (byte[]) bytes;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = 2;
        int i16 = iArr[2];
        int i17 = iArr[3];
        char[] cArr2 = getDeviceData;
        Class cls = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    int i19 = i15;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i18])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                    if (sDKTransactionID == null) {
                        int iGreen = 2943 - Color.green(i12);
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iResolveSize = 37 - View.resolveSize(i12, i12);
                        bArr = bArr2;
                        byte b8 = (byte) i12;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iGreen, windowTouchSlop, iResolveSize, -258931888, false, $$c(b8, b11, (byte) (b11 + 3)), new Class[]{cls});
                    } else {
                        bArr = bArr2;
                    }
                    cArr3[i18] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i18++;
                    i15 = i19;
                    bArr2 = bArr;
                    i12 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        byte[] bArr3 = bArr2;
        int i21 = i15;
        char[] cArr4 = new char[i14];
        System.arraycopy(cArr2, i13, cArr4, 0, i14);
        if (bArr3 != null) {
            int i22 = $11 + 95;
            int i23 = i22 % 128;
            $10 = i23;
            if (i22 % 2 != 0) {
                cArr = new char[i14];
                challengeResultError.AuthenticationRequestParameters = 1;
                c3 = 1;
            } else {
                cArr = new char[i14];
                challengeResultError.AuthenticationRequestParameters = 0;
                c3 = 0;
            }
            $11 = (i23 + 81) % 128;
            while (true) {
                int i24 = challengeResultError.AuthenticationRequestParameters;
                if (i24 >= i14) {
                    break;
                }
                $11 = ($10 + 79) % 128;
                if (bArr3[i24] == 1) {
                    char c7 = cArr4[i24];
                    Object[] objArr3 = new Object[i21];
                    objArr3[1] = Integer.valueOf(c3);
                    objArr3[0] = Integer.valueOf(c7);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        j9 = 0;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3095 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (14367 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -210991631, false, $$c(b12, b13, (byte) (b13 + 2)), new Class[]{cls, cls});
                    } else {
                        j9 = 0;
                    }
                    cArr[i24] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                } else {
                    j9 = 0;
                    Object[] objArr4 = {Integer.valueOf(cArr4[i24]), Integer.valueOf(c3)};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-565071239);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getTapTimeout() >> 16) + 2774, (char) (13060 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 25 - KeyEvent.getDeadChar(0, 0), 37336169, false, $$c(b14, b15, b15), new Class[]{cls, cls});
                    }
                    cArr[i24] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr[challengeResultError.AuthenticationRequestParameters];
                Object[] objArr5 = {challengeResultError, challengeResultError};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(2107237619);
                if (sDKTransactionID4 == null) {
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2277 - (ExpandableListView.getPackedPositionForChild(0, 0) > j9 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j9 ? 0 : -1)), (char) ('\"' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 34, -1577983261, false, "m", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                i21 = 2;
            }
            cArr4 = cArr;
        }
        if (i17 > 0) {
            char[] cArr5 = new char[i14];
            i11 = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i14);
            int i25 = i14 - i17;
            System.arraycopy(cArr5, 0, cArr4, i25, i17);
            System.arraycopy(cArr5, i17, cArr4, 0, i25);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i14];
            challengeResultError.AuthenticationRequestParameters = i11;
            while (true) {
                int i26 = challengeResultError.AuthenticationRequestParameters;
                if (i26 >= i14) {
                    break;
                }
                int i27 = $11 + 91;
                $10 = i27 % 128;
                if (i27 % 2 != 0) {
                    cArr6[i26] = cArr4[i14 - i26];
                } else {
                    cArr6[i26] = cArr4[(i14 - i26) - 1];
                    i26++;
                }
                challengeResultError.AuthenticationRequestParameters = i26;
            }
            $11 = ($10 + 3) % 128;
            cArr4 = cArr6;
        }
        if (i16 > 0) {
            $10 = ($11 + 23) % 128;
            challengeResultError.AuthenticationRequestParameters = 0;
            while (true) {
                int i28 = challengeResultError.AuthenticationRequestParameters;
                if (i28 >= i14) {
                    break;
                }
                cArr4[i28] = (char) (cArr4[i28] - iArr[2]);
                challengeResultError.AuthenticationRequestParameters = i28 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static void getSDKReferenceNumber() {
        getDeviceData = new char[]{63412, 63237, 63251, 63237, 63463, 63326, 63323, 63322, 63324, 63294, 63286, 63343, 63289, 63286, 63314, 63322, 63294, 63248, 63304, 63312, 63281, 63273, 63248, 63294, 63324, 63325, 63317, 63314, 63321, 63322, 63317, 63287, 63292, 63314, 63287, 63264, 63318, 63340};
    }

    public static void init$0() {
        $$a = new byte[]{5, 96, -35, 91};
        $$b = 229;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getID() throws Throwable {
        Object obj;
        int i11 = getSDKAppID + 35;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 4, 71, 3}, "\u0001\u0001\u0000\u0001", true, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 4, 71, 3}, "\u0001\u0001\u0000\u0001", true, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getMessage() throws Throwable {
        Object obj;
        int i11 = getSDKAppID + 19;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new int[]{4, 34, 111, 17}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", true, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{4, 34, 111, 17}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", false, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final Warning.Severity getSeverity() {
        int i11 = getSDKAppID + 97;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            Warning.Severity severity = Warning.Severity.LOW;
            throw null;
        }
        Warning.Severity severity2 = Warning.Severity.MEDIUM;
        int i12 = AuthenticationRequestParameters + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            return severity2;
        }
        throw null;
    }
}
