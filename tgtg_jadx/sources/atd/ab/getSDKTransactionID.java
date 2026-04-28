package atd.ab;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import com.adyen.threeds2.ErrorMessage;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKTransactionID implements ErrorMessage {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static char ChallengeResult;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private final String getDeviceData;
    private final String getSDKAppID;
    private final String getSDKReferenceNumber;
    private final String getSDKTransactionID;

    private static String $$c(short s7, byte b8, byte b11) {
        int i11 = s7 * 4;
        byte[] bArr = $$a;
        int i12 = 119 - b8;
        int i13 = (b11 * 3) + 4;
        byte[] bArr2 = new byte[1 - i11];
        int i14 = 0 - i11;
        int i15 = -1;
        if (bArr == null) {
            i12 = i14 + (-i13);
            i13++;
            bArr = bArr;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr2[i16] = (byte) i12;
            if (i16 == i14) {
                return new String(bArr2, 0);
            }
            i12 += -bArr[i13];
            i13++;
            bArr = bArr;
            i15 = i16;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters = 1905653906042338631L;
        getSDKEphemeralPublicKey = -2038612665;
        ChallengeResult = (char) 46635;
    }

    public getSDKTransactionID(String str, String str2, String str3, String str4) {
        this.getDeviceData = str;
        this.getSDKAppID = str2;
        this.getSDKReferenceNumber = str3;
        this.getSDKTransactionID = str4;
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        float f11;
        char[] cArr;
        int i13;
        char c7;
        int i14 = $10 + 65;
        $11 = i14 % 128;
        int i15 = 2;
        Object obj = null;
        if (i14 % 2 == 0) {
            throw null;
        }
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            int i16 = $10 + 39;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr2 = charArray;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        onCompletion oncompletion = new onCompletion();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        int i17 = 0;
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) i17;
                    byte b11 = (byte) (b8 + 2);
                    i12 = i15;
                    sDKTransactionID = ChallengeResult.getDeviceData(ExpandableListView.getPackedPositionGroup(0L) + 2069, (char) (44657 - Drawable.resolveOpacity(i17, i17)), View.MeasureSpec.getMode(i17) + 32, -397560981, false, $$c(b8, b11, (byte) (b11 - 2)), new Class[]{Object.class});
                } else {
                    i12 = i15;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) i17;
                    byte b13 = (byte) (b12 + 1);
                    f11 = 0.0f;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(3095 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 14367), 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1211924053, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class});
                } else {
                    f11 = 0.0f;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i18 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i18);
                objArr4[i17] = oncompletion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', i17) + 1429;
                    c7 = 1;
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(i17) + 1);
                    int defaultSize = View.getDefaultSize(i17, i17) + 30;
                    byte b14 = (byte) i17;
                    i13 = i17;
                    byte b15 = b14;
                    cArr = charArray2;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(iLastIndexOf, bitsPerPixel, defaultSize, -1183253656, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, cls});
                } else {
                    cArr = charArray2;
                    i13 = i17;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i19 = cArr3[iIntValue2] * 32718;
                int i21 = i12;
                Object[] objArr5 = new Object[i21];
                objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[i13] = Integer.valueOf(i19);
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    int i22 = 2775 - (ViewConfiguration.getScrollFriction() > f11 ? 1 : (ViewConfiguration.getScrollFriction() == f11 ? 0 : -1));
                    char cAxisFromString = (char) (13059 - MotionEvent.axisFromString(""));
                    float f12 = f11;
                    int i23 = i13;
                    int i24 = (TypedValue.complexToFraction(i23, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(i23, f12, f12) == f12 ? 0 : -1)) + 25;
                    byte b16 = (byte) i23;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(i22, cAxisFromString, i24, -320602145, false, $$c(b16, (byte) (b16 | 51), b16), new Class[]{cls, cls});
                }
                cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i25 = oncompletion.getDeviceData;
                cArr5[i25] = (char) (((((long) (r0 ^ cArr[i25])) ^ (AuthenticationRequestParameters ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKEphemeralPublicKey) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) ChallengeResult) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i25 + 1;
                i15 = i21;
                charArray2 = cArr;
                obj = null;
                i17 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr5);
        $10 = ($11 + 9) % 128;
        objArr[0] = str4;
    }

    public static void init$0() {
        $$a = new byte[]{27, 20, 100, 39};
        $$b = 73;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public final String getErrorCode() {
        int i11 = BuildConfig;
        String str = this.getSDKAppID;
        int i12 = i11 + 119;
        getMessageVersion = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 63 / 0;
        }
        return str;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public final String getErrorDescription() {
        int i11 = BuildConfig;
        String str = this.getSDKReferenceNumber;
        getMessageVersion = (i11 + 49) % 128;
        return str;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public final String getErrorDetails() {
        int i11 = getMessageVersion + 31;
        BuildConfig = i11 % 128;
        int i12 = i11 % 2;
        String str = this.getSDKTransactionID;
        if (i12 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public final String getTransactionID() {
        int i11 = (getMessageVersion + 63) % 128;
        BuildConfig = i11;
        String str = this.getDeviceData;
        getMessageVersion = (i11 + 111) % 128;
        return str;
    }

    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", "ꤙ愳⅊ᘹ", "陶㒰匴\u1ae5詿줦ꈻ⤰燝菀쫂鱉闂쵼蠊Ɱ", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 14625), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(getTransactionID());
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "齬㻉腯ѩ", "ꜙ핀䎙迟\u0e6d䓫䢐᰾읟戁∿閕", ViewConfiguration.getLongPressTimeout() >> 16, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(getErrorCode());
        Object[] objArr3 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "䎙\uee6e︓鮾", "旁롇嚺媎ᠺლἴﰌ섄\u2ef6䄫ﺯ⢹\u0080ᥣ쭯랽覈宎", TextUtils.getCapsMode("", 0, 0) + 334392899, (char) (48895 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(getErrorDescription());
        Object[] objArr4 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "⒁詴ꀹⳍ", "歳\udbdc爠ﯺꖽ딬\udf07說몽\udb22硿鮖댈迕硏", (ViewConfiguration.getPressedStateDuration() >> 16) + 965375012, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 52639), objArr4);
        sb2.append(((String) objArr4[0]).intern());
        sb2.append(getErrorDetails());
        String string = sb2.toString();
        BuildConfig = (getMessageVersion + 83) % 128;
        return string;
    }
}
