package atd.as;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import com.adyen.threeds2.Warning;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/OverlayWarning;", "Lcom/adyen/threeds2/internal/security/warning/AppWarning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID implements getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;

    @NotNull
    public static final getSDKAppID getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 + 68
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r7 = r7 + 4
            byte[] r1 = atd.as.getSDKAppID.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L15
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r1
            r1 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getSDKAppID.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResult = 1;
        getDeviceData = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters();
        getSDKTransactionID = new getSDKAppID();
        ChallengeResult = (BuildConfig + 97) % 128;
    }

    private getSDKAppID() {
    }

    public static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = 1905653906042338631L;
        getSDKAppID = -2038612665;
        getSDKReferenceNumber = (char) 52059;
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        char c7;
        int i14 = $10 + 121;
        $11 = i14 % 128;
        int i15 = 2;
        Object obj = null;
        if (i14 % 2 == 0) {
            throw null;
        }
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $11 = ($10 + 89) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        onCompletion oncompletion = new onCompletion();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        int i16 = 0;
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c3);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr4 = new char[length3];
        oncompletion.getDeviceData = 0;
        $10 = ($11 + 19) % 128;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    i12 = i15;
                    byte b8 = (byte) (-1);
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", '0', i16, i16) + 2070, (char) (44657 - (KeyEvent.getMaxKeyCode() >> 16)), (ExpandableListView.getPackedPositionForGroup(i16) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i16) == 0L ? 0 : -1)) + 32, -397560981, false, $$c((byte) 49, b8, (byte) (b8 + 1)), new Class[]{Object.class});
                } else {
                    i12 = i15;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    i13 = i16;
                    byte b11 = (byte) (-1);
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3095 - View.getDefaultSize(i16, i16), (char) (Drawable.resolveOpacity(i16, i16) + 14367), (KeyEvent.getMaxKeyCode() >> 16) + 18, -1211924053, false, $$c((byte) 50, b11, (byte) (b11 + 1)), new Class[]{Object.class});
                } else {
                    i13 = i16;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i17 = cArr2[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr3[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) (-1);
                    c7 = 1;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(KeyEvent.keyCodeFromString("") + 1428, (char) (Process.myTid() >> 22), 30 - (ViewConfiguration.getTouchSlop() >> 8), -1183253656, false, $$c((byte) 51, b12, (byte) (b12 + 1)), new Class[]{Object.class, cls, cls});
                } else {
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i18 = cArr2[iIntValue2] * 32718;
                int i19 = i12;
                Object[] objArr5 = new Object[i19];
                objArr5[c7] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[i13] = Integer.valueOf(i18);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b13 = (byte) i13;
                    byte b14 = (byte) (b13 - 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2774 - (Process.myTid() >> 22), (char) (13061 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25, -320602145, false, $$c(b13, b14, (byte) (b14 + 1)), new Class[]{cls, cls});
                }
                cArr3[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr2[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i21 = oncompletion.getDeviceData;
                cArr4[i21] = (char) (((((long) (r1 ^ charArray2[i21])) ^ (AuthenticationRequestParameters ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKAppID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKReferenceNumber) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i21 + 1;
                i15 = i19;
                obj = null;
                i16 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr4);
        $10 = ($11 + 5) % 128;
        objArr[0] = str4;
    }

    public static void init$0() {
        $$a = new byte[]{22, 72, -28, -123};
        $$b = 225;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getID() throws Throwable {
        getMessageVersion = (getDeviceData + 7) % 128;
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", "郓頞⇟\ue533", "뫚ﻈ댑ଶ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 13089), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getMessageVersion + 9;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getMessage() throws Throwable {
        Object obj;
        int i11 = getMessageVersion + 47;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a("\u0000\u0000\u0000\u0000", "䮆䡄ꈍ羓", "슽뀎恹\u1cca妵綈뙓㼴ᎇ鶐괬幤\uf2f2⅟䅻㭦侖櫩䁦ᾤ퐇\uec2b\ue397姙ᚯ◗\ue019\ue27e", ViewConfiguration.getTapTimeout() >>> 98, (char) (37794 / KeyEvent.keyCodeFromString("")), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("\u0000\u0000\u0000\u0000", "䮆䡄ꈍ羓", "슽뀎恹\u1cca妵綈뙓㼴ᎇ鶐괬幤\uf2f2⅟䅻㭦侖櫩䁦ᾤ퐇\uec2b\ue397姙ᚯ◗\ue019\ue27e", ViewConfiguration.getTapTimeout() >> 16, (char) (KeyEvent.keyCodeFromString("") + 37794), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        getMessageVersion = (getDeviceData + 23) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final Warning.Severity getSeverity() {
        Warning.Severity severity;
        int i11 = getDeviceData + 55;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            severity = Warning.Severity.MEDIUM;
            int i12 = 60 / 0;
        } else {
            severity = Warning.Severity.MEDIUM;
        }
        int i13 = getMessageVersion + 69;
        getDeviceData = i13 % 128;
        if (i13 % 2 == 0) {
            return severity;
        }
        throw null;
    }
}
