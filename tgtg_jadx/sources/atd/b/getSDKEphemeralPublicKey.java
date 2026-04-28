package atd.b;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import atd.bb.ChallengeResultTimeout;
import com.braze.Constants;
import java.lang.reflect.Method;
import org.bouncycastle.i18n.LocalizedMessage;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKEphemeralPublicKey extends getDeviceData<String> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final Boolean AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static boolean ChallengeResultCancelled;
    private static int ChallengeResultCompleted;
    private static int getMessageVersion;
    private static char[] getSDKAppID;
    private static boolean getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private String getDeviceData;
    private String getSDKTransactionID;

    private static String $$c(byte b8, int i11, byte b11) {
        int i12 = b8 * 3;
        byte[] bArr = $$a;
        int i13 = (b11 * 4) + 4;
        int i14 = (i11 * 4) + 111;
        byte[] bArr2 = new byte[i12 + 1];
        int i15 = -1;
        if (bArr == null) {
            i14 = i12 + (-i13);
            i13++;
            bArr = bArr;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr2[i16] = (byte) i14;
            if (i16 == i12) {
                return new String(bArr2, 0);
            }
            i14 += -bArr[i13];
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
        ChallengeResultCompleted = 1;
        BuildConfig = 0;
        ChallengeResult = 1;
        ChallengeResultCancelled();
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getLongPressTimeout();
        TextUtils.indexOf("", "", 0, 0);
        AuthenticationRequestParameters = Boolean.TRUE;
        int i11 = getMessageVersion + 15;
        ChallengeResultCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 88 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKEphemeralPublicKey(@NonNull String str, String str2) throws Throwable {
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, null, "\u0088\u0087\u0084\u0086\u0085\u0084\u0081\u0083\u0082\u0081\u0081", objArr);
        super(((String) objArr[0]).intern(), str);
        this.getDeviceData = str;
        this.getSDKTransactionID = str2;
    }

    private static boolean AuthenticationRequestParameters(String str) throws Throwable {
        ChallengeResult = (BuildConfig + 13) % 128;
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionChild(0L) + 128, null, null, "\u008f\u008e", objArr);
        boolean zEquals = ((String) objArr[0]).intern().equals(str);
        Object[] objArr2 = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 128, null, null, "\u0090\u008e", objArr2);
        boolean zEquals2 = ((String) objArr2[0]).intern().equals(str);
        if (!zEquals) {
            ChallengeResult = (BuildConfig + 113) % 128;
            if (!zEquals2) {
                return false;
            }
        }
        return true;
    }

    public static void ChallengeResultCancelled() {
        getSDKAppID = new char[]{21636, 21659, 21624, 21639, 21641, 21634, 21646, 21662, 21626, 21637, 21608, 21658, 21640, 21573, 21578, 21579, 21614, 21611, 21601, 21602, 21657};
        getSDKReferenceNumber = 1286296629;
        ChallengeResultCancelled = true;
        getSDKEphemeralPublicKey = true;
    }

    private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            $10 = ($11 + 61) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i12 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                $10 = ($11 + 33) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i12;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(Color.red(i12) + 2555, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48597), (ViewConfiguration.getEdgeSlop() >> 16) + 31, -390605202, false, $$c(b8, b11, b11), new Class[]{cls});
                    }
                    cArr3[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i13++;
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
        Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        long j9 = 0;
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(KeyEvent.getDeadChar(0, 0) + 147, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i14 = 1124287645;
        if (getSDKEphemeralPublicKey) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr4 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i15 = challengeResultTimeout.getSDKAppID;
                int i16 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                $10 = ($11 + 47) % 128;
                cArr4[i15] = (char) (cArr2[bArr[(i16 - 1) - i15] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getEdgeSlop() >> 16) + 1697, (char) Drawable.resolveOpacity(0, 0), Color.green(0) + 29, -1620360563, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
            }
        } else if (ChallengeResultCancelled) {
            int length3 = cArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr5 = new char[length3];
            challengeResultTimeout.getSDKAppID = 0;
            $11 = ($10 + 21) % 128;
            while (true) {
                int i17 = challengeResultTimeout.getSDKAppID;
                int i18 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i17] = (char) (cArr2[cArr[(i18 - 1) - i17] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                if (sDKTransactionID4 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1697 - (ExpandableListView.getPackedPositionForGroup(0) > j9 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j9 ? 0 : -1)), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j9 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j9 ? 0 : -1))), 29 - (KeyEvent.getMaxKeyCode() >> 16), -1620360563, false, $$c(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                i14 = 1124287645;
                j9 = 0;
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr6 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i19 = challengeResultTimeout.getSDKAppID;
                int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i19] = (char) (cArr2[iArr[(i21 - 1) - i19] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i19 + 1;
                }
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{52, -114, -70, 47};
        $$b = 127;
    }

    public final String ChallengeResult() {
        int i11 = (ChallengeResult + 85) % 128;
        BuildConfig = i11;
        String str = this.getSDKTransactionID;
        ChallengeResult = (i11 + 23) % 128;
        return str;
    }

    public final String getDeviceData() {
        int i11 = (ChallengeResult + 63) % 128;
        BuildConfig = i11;
        String str = this.getDeviceData;
        int i12 = i11 + 41;
        ChallengeResult = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // atd.b.getDeviceData
    public final /* synthetic */ boolean getSDKReferenceNumber(String str) throws Throwable {
        BuildConfig = (ChallengeResult + 43) % 128;
        boolean zAuthenticationRequestParameters = AuthenticationRequestParameters(str);
        int i11 = ChallengeResult + 33;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            return zAuthenticationRequestParameters;
        }
        throw null;
    }

    @Override // atd.b.getDeviceData
    public final void getSDKTransactionID() {
        int i11 = BuildConfig + 115;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            super.getSDKTransactionID();
            this.getDeviceData = null;
            this.getSDKTransactionID = null;
            throw null;
        }
        super.getSDKTransactionID();
        this.getDeviceData = null;
        this.getSDKTransactionID = null;
        int i12 = BuildConfig + 33;
        ChallengeResult = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 9 / 0;
        }
    }

    @Override // atd.b.getDeviceData, atd.i.getDeviceData
    public final JSONObject AuthenticationRequestParameters() throws Throwable {
        JSONObject jSONObject = new JSONObject();
        if (AuthenticationRequestParameters(getSDKAppID())) {
            BuildConfig = (ChallengeResult + 7) % 128;
            jSONObject.put(getSDKReferenceNumber(), getSDKAppID());
            ChallengeResult = (BuildConfig + 33) % 128;
        }
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, null, null, "\u008d\u0087\u0085\u008c\u0085\u008b\u008a\u008a\u0089\u0082\u0081\u0081", objArr);
        jSONObject.putOpt(((String) objArr[0]).intern(), this.getSDKTransactionID);
        return jSONObject;
    }
}
