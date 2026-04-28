package atd.af;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID extends getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static long getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;
    private final byte[] getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, int r7) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r5 = 119 - r5
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r1 = atd.af.getSDKAppID.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
        L27:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.getSDKAppID.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        getDeviceData = 0;
        getSDKEphemeralPublicKey = 1;
        getDeviceData();
        ViewConfiguration.getWindowTouchSlop();
        View.resolveSizeAndState(0, 0, 0);
        getMessageVersion = (ChallengeResult + 61) % 128;
    }

    public getSDKAppID(JSONObject jSONObject) throws Throwable {
        super(jSONObject);
        atd.bc.getSDKReferenceNumber sDKTransactionID = atd.bc.getSDKReferenceNumber.getSDKTransactionID();
        Object[] objArr = new Object[1];
        a("\uf27c\u1716㼆┎", "ꇿ蘑\u1317ػ", "꧰", 394662305 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.lastIndexOf("", '0') + 15124), objArr);
        this.getSDKReferenceNumber = sDKTransactionID.getSDKAppID(jSONObject.getString(((String) objArr[0]).intern()));
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        char c7;
        long j9;
        int i14 = 2;
        int i15 = 0;
        if (str3 != null) {
            int i16 = $11 + 47;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                charArray = str3.toCharArray();
                int i17 = 30 / 0;
            } else {
                charArray = str3.toCharArray();
            }
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        onCompletion oncompletion = new onCompletion();
        int length = charArray2.length;
        char[] cArr2 = new char[length];
        int length2 = charArray3.length;
        char[] cArr3 = new char[length2];
        System.arraycopy(charArray2, 0, cArr2, 0, length);
        System.arraycopy(charArray3, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c3);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr4 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    int iCombineMeasuredStates = 2069 - View.combineMeasuredStates(i15, i15);
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(i15, i15) + 44657);
                    int i18 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32;
                    byte b8 = (byte) ($$b & 3);
                    byte b11 = (byte) (b8 - 2);
                    i12 = i14;
                    sDKTransactionID = ChallengeResult.getDeviceData(iCombineMeasuredStates, cMakeMeasureSpec, i18, -397560981, false, $$c(b8, b11, b11), new Class[]{Object.class});
                } else {
                    i12 = i14;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) 1;
                    c7 = 1;
                    byte b13 = (byte) (b12 - 1);
                    i13 = i15;
                    sDKTransactionID2 = ChallengeResult.getDeviceData((KeyEvent.getMaxKeyCode() >> 16) + 3095, (char) (14367 - (Process.myTid() >> 22)), 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1211924053, false, $$c(b12, b13, b13), new Class[]{Object.class});
                } else {
                    i13 = i15;
                    c7 = 1;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i19 = cArr2[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr3[iIntValue]);
                objArr4[c7] = Integer.valueOf(i19);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    j9 = 0;
                    byte b14 = (byte) i13;
                    byte b15 = b14;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(1427 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 30 - Color.blue(i13), -1183253656, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, cls});
                } else {
                    j9 = 0;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i21 = cArr2[iIntValue2] * 32718;
                int i22 = i12;
                Object[] objArr5 = new Object[i22];
                objArr5[c7] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[0] = Integer.valueOf(i21);
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(2773 - Process.getGidForName(""), (char) ((Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)) + 13059), 25 - (ViewConfiguration.getTouchSlop() >> 8), -320602145, false, $$c((byte) 51, b16, b16), new Class[]{cls, cls});
                }
                cArr3[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr2[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i23 = oncompletion.getDeviceData;
                cArr4[i23] = (char) (((((long) (r0 ^ cArr[i23])) ^ (getSDKAppID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKTransactionID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i23 + 1;
                $10 = ($11 + 1) % 128;
                i14 = i22;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static void getDeviceData() {
        getSDKAppID = 4574532590956695355L;
        getSDKTransactionID = -2038612665;
        AuthenticationRequestParameters = (char) 15687;
    }

    public static void init$0() {
        $$a = new byte[]{123, -86, -87, -12};
        $$b = 94;
    }

    @Override // atd.af.getSDKReferenceNumber
    public final void AuthenticationRequestParameters() {
        getSDKEphemeralPublicKey = (getDeviceData + 17) % 128;
        super.AuthenticationRequestParameters();
        byte[] bArr = this.getSDKReferenceNumber;
        if (bArr != null) {
            getSDKEphemeralPublicKey = (getDeviceData + 21) % 128;
            Arrays.fill(bArr, (byte) 0);
            getDeviceData = (getSDKEphemeralPublicKey + 107) % 128;
        }
    }

    public final byte[] getSDKReferenceNumber() throws CloneNotSupportedException {
        int i11 = getSDKEphemeralPublicKey + 1;
        getDeviceData = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = this.getSDKReferenceNumber;
        if (i12 == 0) {
            return (byte[]) bArr.clone();
        }
        bArr.clone();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKAppID(String str, byte[] bArr) throws Throwable {
        Object[] objArr = new Object[1];
        a("\uf27c\u1716㼆┎", "ꁤ誶袱젧", "役掾Ꞁ", (-1316309344) - ExpandableListView.getPackedPositionType(0L), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10121), objArr);
        super(str, ((String) objArr[0]).intern());
        this.getSDKReferenceNumber = (byte[]) bArr.clone();
    }
}
