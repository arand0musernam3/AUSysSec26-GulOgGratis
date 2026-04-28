package atd.bc;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.completed;
import com.adyen.threeds2.exception.InvalidInputException;
import com.braze.Constants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.security.InvalidParameterException;
import java.util.UUID;
import org.bouncycastle.i18n.LocalizedMessage;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static long getDeviceData;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static boolean getSDKReferenceNumber;
    private static int getSDKTransactionID;

    private static String $$c(int i11, byte b8, int i12) {
        int i13 = 3 - (i11 * 3);
        int i14 = b8 + 111;
        int i15 = i12 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i15 + 1];
        int i16 = -1;
        if (bArr == null) {
            i14 = (-i13) + i15;
            i13 = i13;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i14;
            int i18 = i13 + 1;
            if (i17 == i15) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i14 = (-bArr[i18]) + i14;
            i13 = i18;
            bArr = bArr3;
            i16 = i17;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters = new char[]{21713, 21700, 21708, 21707, 21701, 21754, 21638, 21711, 21749, 21744, 21755, 21746, 21720, 21703, 21745, 21723, 21679, 21674, 21706, 21747, 21710, 21752, 21758, 21680, 21748, 21759, 21691, 21686, 21726, 21718, 21750, 21669, 21712, 21667, 21671, 21705, 21682, 21717, 21709, 21715, 21704, 21695};
        getSDKTransactionID = 1286296678;
        getSDKAppID = true;
        getSDKReferenceNumber = true;
        getDeviceData = 8090579305036436336L;
    }

    public static void AuthenticationRequestParameters(String str, atd.aa.getDeviceData getdevicedata) throws Throwable {
        BuildConfig = (getSDKEphemeralPublicKey + 61) % 128;
        getSDKAppID(str, getdevicedata);
        try {
            if (UUID.fromString(str).toString().equalsIgnoreCase(str)) {
                getSDKEphemeralPublicKey = (BuildConfig + 15) % 128;
                return;
            }
            Object[] objArr = new Object[1];
            a(126 - Process.getGidForName(""), null, null, "\u0095\u0085\u0086\u008e\u0094\u0087\u0086\u008f\u008a\u0087\u008f\u0093\u0087\u0092\u0091\u0090\u0090\u0087\u0093\u008a\u008e\u0087\u0084\u008b\u008c\u008e\u008d", objArr);
            new InvalidParameterException(((String) objArr[0]).intern());
            throw getdevicedata.getSDKTransactionID();
        } catch (IllegalArgumentException unused) {
            Object[] objArr2 = new Object[1];
            a(TextUtils.getOffsetAfter("", 0) + 127, null, null, "\u0092\u0091\u0090\u0090\u0087\u008e\u0087\u0086\u008f\u008a\u0087\u0084\u008b\u008c\u008e\u008d", objArr2);
            new InvalidParameterException(((String) objArr2[0]).intern());
            throw getdevicedata.getSDKTransactionID();
        }
    }

    private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char c3;
        int i12;
        char[] cArr;
        int i13;
        char c7;
        String str3 = str2;
        int i14 = 2;
        Object bytes = str3;
        if (str3 != null) {
            int i15 = $10 + 119;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
                throw null;
            }
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr2 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        char c8 = '0';
        int i16 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i17])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int iAxisFromString = 2554 - MotionEvent.axisFromString("");
                        c7 = c8;
                        char cIndexOf = (char) (48597 - TextUtils.indexOf("", c8, i16, i16));
                        int iRgb = Color.rgb(i16, i16, i16) + 16777247;
                        i13 = i14;
                        byte b8 = (byte) i16;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iAxisFromString, cIndexOf, iRgb, -390605202, false, $$c(b8, b11, b11), new Class[]{cls});
                    } else {
                        i13 = i14;
                        c7 = c8;
                    }
                    cArr3[i17] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i17++;
                    c8 = c7;
                    i14 = i13;
                    i16 = 0;
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
        int i18 = i14;
        char c11 = c8;
        Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(AndroidCharacter.getMirror(c11) + 'c', (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 32, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        float f11 = 0.0f;
        if (getSDKReferenceNumber) {
            int i19 = $11 + 41;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                int length2 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length2;
                cArr = new char[length2];
                i12 = 0;
            } else {
                i12 = 0;
                int length3 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                cArr = new char[length3];
            }
            challengeResultTimeout.getSDKAppID = i12;
            while (true) {
                int i21 = challengeResultTimeout.getSDKAppID;
                int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i23 = $11 + 117;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    cArr[i21] = (char) (cArr2[bArr[(i22 % 1) % i21] - i11] + iIntValue);
                    Object[] objArr4 = new Object[i18];
                    objArr4[1] = challengeResultTimeout;
                    objArr4[0] = challengeResultTimeout;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID3 == null) {
                        int i24 = 1698 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29;
                        byte length4 = (byte) $$a.length;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(i24, maximumDrawingCacheSize, maximumDrawingCacheSize2, -1620360563, false, $$c((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                } else {
                    cArr[i21] = (char) (cArr2[bArr[(i22 - 1) - i21] + i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1697;
                        char c12 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                        int bitsPerPixel = 28 - ImageFormat.getBitsPerPixel(0);
                        byte length5 = (byte) $$a.length;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(edgeSlop, c12, bitsPerPixel, -1620360563, false, $$c((byte) 0, length5, (byte) (length5 - 4)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                }
                i18 = 2;
            }
        } else {
            int i25 = 0;
            if (getSDKAppID) {
                int length6 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length6;
                char[] cArr4 = new char[length6];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i26 = challengeResultTimeout.getSDKAppID;
                    int i27 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i26 >= i27) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i26] = (char) (cArr2[charArray[(i27 - 1) - i26] - i11] - iIntValue);
                    Object[] objArr6 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID5 == null) {
                        int i28 = (AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)) + 1697;
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        char c13 = c11;
                        int iLastIndexOf = 28 - TextUtils.lastIndexOf("", c13, 0, 0);
                        byte length7 = (byte) $$a.length;
                        sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(i28, cAxisFromString, iLastIndexOf, -1620360563, false, $$c((byte) 0, length7, (byte) (length7 - 4)), new Class[]{Object.class, Object.class});
                        c3 = c13;
                    } else {
                        c3 = c11;
                    }
                    ((Method) sDKTransactionID5).invoke(null, objArr6);
                    c11 = c3;
                    f11 = 0.0f;
                }
            } else {
                int length8 = iArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length8;
                char[] cArr5 = new char[length8];
                while (true) {
                    challengeResultTimeout.getSDKAppID = i25;
                    int i29 = challengeResultTimeout.getSDKAppID;
                    int i31 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i29 >= i31) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        cArr5[i29] = (char) (cArr2[iArr[(i31 - 1) - i29] - i11] - iIntValue);
                        i25 = i29 + 1;
                    }
                }
            }
        }
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $10 = ($11 + 97) % 128;
            charArray = str.toCharArray();
            $11 = ($10 + 115) % 128;
        } else {
            charArray = str;
        }
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getDeviceData ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getDeviceData)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2774;
                    char cResolveSize = (char) (View.resolveSize(0, 0) + 13060);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 25;
                    byte b8 = (byte) 0;
                    String str$$c = $$c(b8, (byte) (b8 | 9), b8);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(scrollBarFadeDuration, cResolveSize, scrollBarSize, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(409 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 30 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 144017174, false, "y", new Class[]{Object.class, Object.class});
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

    public static void getSDKAppID(Object obj, atd.aa.getDeviceData getdevicedata) throws Throwable {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = i11 + 121;
        BuildConfig = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (obj == null) {
            Object[] objArr = new Object[1];
            a(AndroidCharacter.getMirror('0') + 'O', null, null, "\u008c\u008c\u008b\u008a\u0087\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            new InvalidParameterException(((String) objArr[0]).intern());
            throw getdevicedata.getSDKTransactionID();
        }
        int i13 = i11 + 79;
        BuildConfig = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int[], java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v14 */
    public static Object[] getSDKReferenceNumber(Context context, int i11, int i12) {
        char c3;
        ?? r102 = 0;
        int i13 = 1;
        int i14 = 0;
        if (context == null) {
            Object[] objArr = {new int[]{i11}, new int[1], new int[]{i11}, null};
            int iMyTid = Process.myTid();
            int iA = l1.a((~((~iMyTid) | 145434270)) | 2171926, 420, ((~(iMyTid | 145434270)) * 420) + 223169464, i12);
            int i15 = iA ^ (iA << 13);
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr[1])[0] = i16 ^ (i16 << 5);
            return objArr;
        }
        try {
            Object[] objArr2 = new Object[1];
            a(127 - Color.blue(0), null, null, "\u008c\u008e\u009f\u0088\u0085\u008a\u0088\u0099\u009e\u009c\u009c\u009b\u009d\u0098\u009c\u009c\u009b\u0097\u0098\u0095\u0086\u008b\u008e\u0098\u009a\u0086\u0088\u0099\u008b\u0085\u0084\u0089\u0098\u0097\u008e\u0096\u008e\u0083", objArr2);
            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
            c3 = 3;
            try {
                Object[] objArr4 = new Object[1];
                a(127 - View.getDefaultSize(0, 0), null, null, "¦\u0090¢ ¥\u0093\u0088\u008f\u0099\u0093\u008a£¢\u0081¥¤\u008b\u0082\u0084\u0092\u0087\u0093\u0088\u008f\u0099\u0093\u008a£¢¡ ", objArr4);
                try {
                    Object[] objArr5 = {((String) objArr4[0]).intern()};
                    Object[] objArr6 = new Object[1];
                    a(127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, null, "\u008c\u008e\u009f\u0088\u0085\u008a\u0088\u0099\u009e\u009c\u009c\u009b\u009d\u0098\u009c\u009c\u009b\u0097\u0098\u0095\u0086\u008b\u008e\u0098\u009a\u0086\u0088\u0099\u008b\u0085\u0084\u0089\u0098\u0097\u008e\u0096\u008e\u0083", objArr6);
                    objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                    Object[] objArr7 = new Object[1];
                    b("曳暰㍨뷘ဟ曷ᛉႪし鼍방䜰쮍ㆾ\ue5fe붆攂樶ጨᐢ㲝鲗룽䭷혿㕐\ue65bꇸ憧澚\u0fe8ᡬ㬩聇땃", TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr7);
                    try {
                        Object[] objArr8 = {((String) objArr7[0]).intern()};
                        Object[] objArr9 = new Object[1];
                        a(Color.argb(0, 0, 0, 0) + 127, null, null, "\u008c\u008e\u009f\u0088\u0085\u008a\u0088\u0099\u009e\u009c\u009c\u009b\u009d\u0098\u009c\u009c\u009b\u0097\u0098\u0095\u0086\u008b\u008e\u0098\u009a\u0086\u0088\u0099\u008b\u0085\u0084\u0089\u0098\u0097\u008e\u0096\u008e\u0083", objArr9);
                        objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                        try {
                            Object[] objArr10 = new Object[1];
                            b("ꝼꜝ\uec23㫫ᤋ맯釋ᦟ\uf19b䁠㭃之ਏ\ueefe拑뒉ꒁ땷鑃ᵛﴟ䎎㿡䉹ឱ\uea11慳", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr10);
                            Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                            Object[] objArr11 = new Object[1];
                            a(View.getDefaultSize(0, 0) + 127, null, null, "\u0099\u0084¤\u008e\u008a\u008e¨\u0084¤\u008e§\u0085\u008e\u009e\u0086\u0084¤", objArr11);
                            Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                            try {
                                Object[] objArr12 = new Object[1];
                                b("ꝼꜝ\uec23㫫ᤋ맯釋ᦟ\uf19b䁠㭃之ਏ\ueefe拑뒉ꒁ땷鑃ᵛﴟ䎎㿡䉹ឱ\uea11慳", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr12);
                                Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                                Object[] objArr13 = new Object[1];
                                b("\u173e\u1759靆䬦ꁣ슁\ue016ꃕ䇗㬏䪁\uf76c멉閑ጼ෴ᓋ츙", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr13);
                                try {
                                    Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                    Object[] objArr15 = new Object[1];
                                    b("騁驠ꢖ棤\uea76ﵚ쏄\ueae2쳦ӕ楌봶㝲ꩋマ䟴駼\uf1c2왌\uee26쁑ܹ涮넠⫈꺿㍣宙鵖\uf421\udadd\ue201쟗ᮭ恿뒍⸳", ExpandableListView.getPackedPositionGroup(0L), objArr15);
                                    Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                    Object[] objArr16 = new Object[1];
                                    b("ㆊ\u31ed仾癰讑ᬹ\udd40謧杣\ue2b7矗\udc9e鳽䰩\u2e6d☉㉴ឫ", ExpandableListView.getPackedPositionType(0L), objArr16);
                                    Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                    int i17 = 16;
                                    Object[] objArr17 = new Object[1];
                                    a(127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, null, "\u008f©\u008a\u0091\u0084¤\u008e§\u0085\u008e\u009e\u0098\u0094\u009f\u0098\u0086\u008a\u0084\u0086\u008a\u008f\u0085\u0098\u0093\u0088\u008f\u0099\u0093\u008a\u008e", objArr17);
                                    Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                    Object[] objArr18 = new Object[1];
                                    b("\ud826\ud855ꁷ퐖㛭\uf5bc缵㙥軏\u0c29햯懱畓ꊶ", Color.red(0), objArr18);
                                    Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                    int length = objArr19.length;
                                    int i18 = 0;
                                    while (i18 < length) {
                                        Object obj = objArr19[i18];
                                        int i19 = i17;
                                        Object[] objArr20 = new Object[i13];
                                        a(View.MeasureSpec.getMode(i14) + 127, r102, r102, "ª\u009c\u009b\u0098\u009d", objArr20);
                                        try {
                                            Object[] objArr21 = {((String) objArr20[i14]).intern()};
                                            Object[] objArr22 = new Object[i13];
                                            b("굜괶퀭秹⨇藮틋⪀ﯺ籴硐紊9틭⇄螅꺽褹흆⸜\uf70e羛粳煂ᶑ형≡鯠ꨊ貖쯮≰\uf090挒煃瓸\u197f\ud9bb☒齓\ua7ed", ViewConfiguration.getTapTimeout() >> 16, objArr22);
                                            Class<?> cls5 = Class.forName(((String) objArr22[i14]).intern());
                                            int i21 = i14;
                                            Object[] objArr23 = new Object[i13];
                                            b("壴墓\ue9a4궪밧뱣ښ번ฒ䗽값\ueb28\uf58a\ueb75\uf59b", ViewConfiguration.getWindowTouchSlop() >> 8, objArr23);
                                            Object objInvoke3 = cls5.getMethod(((String) objArr23[i21]).intern(), String.class).invoke(r102, objArr21);
                                            try {
                                                Object[] objArr24 = new Object[i13];
                                                a(126 - TextUtils.indexOf((CharSequence) "", '0'), r102, r102, "\u0084\u0099\u008b\u0086\u008e\u008a¤\u0088¦\u0098\u0094\u009f\u0098\u0086\u008a\u0084\u0086\u008a\u008f\u0085\u0098\u0093\u0088\u008f\u0099\u0093\u008a\u008e", objArr24);
                                                Class<?> cls6 = Class.forName(((String) objArr24[i21]).intern());
                                                Object[] objArr25 = new Object[i13];
                                                b("팁퍵鞭ﾅ\ud83b쉠咃\ud8a4藽㯢︈輧繣镾Ꞩ", View.combineMeasuredStates(i21, i21), objArr25);
                                                try {
                                                    Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[i21]).intern(), null).invoke(obj, null))};
                                                    Object[] objArr27 = new Object[i13];
                                                    b("굜괶퀭秹⨇藮틋⪀ﯺ籴硐紊9틭⇄螅꺽褹흆⸜\uf70e羛粳煂ᶑ형≡鯠ꨊ貖쯮≰\uf090挒煃瓸\u197f\ud9bb☒齓\ua7ed", View.MeasureSpec.makeMeasureSpec(0, 0), objArr27);
                                                    Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                    Object[] objArr28 = new Object[i13];
                                                    a(127 - (ViewConfiguration.getEdgeSlop() >> 16), null, null, "\u0084\u0086\u008e\u0085\u0088©\u0088\u0086\u0099\u0084 \u0084\u0086\u008e\u0099\u0084\u008a\u0084¤", objArr28);
                                                    Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                    int i22 = 0;
                                                    while (i22 < 2) {
                                                        Object obj2 = objArr3[i22];
                                                        try {
                                                            Object[] objArr29 = new Object[i13];
                                                            b("\u0ef0ບ⤍씳礪糎渁禭塖蕔쒚⸧ꎕ⯍鴎풨\u0d11瀙殌紱咢蚻쁹≴빭⽷黦죧থ疭眳煕匮騾춬⟕뫄₊", TextUtils.indexOf((CharSequence) "", '0') + i13, objArr29);
                                                            Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                            Object[] objArr30 = new Object[i13];
                                                            a(126 - MotionEvent.axisFromString(""), null, null, "\u008c\u008e\u009f\u0088\u0085\u008a\u0088\u0099\u009e\u009c\u009c\u009b\u009d\u0086\u0085\u0084\u0083\u0082\u008b¦\u0086\u0084¤", objArr30);
                                                            if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                Object[] objArr31 = {new int[]{i11}, new int[1], new int[]{i11 ^ 1}, null};
                                                                int iMyUid = Process.myUid();
                                                                int i23 = ~iMyUid;
                                                                int iD = a0.D((~(iMyUid | (-42357259))) | (~(312965663 | i23)) | (-401047360), 140, (((~((-130438955) | i23)) | 42357258) * (-280)) + (((iMyUid | (-130438955)) * 140) - 1083751696), i19, i12);
                                                                int i24 = iD ^ (iD << 13);
                                                                int i25 = i24 ^ (i24 >>> 17);
                                                                ((int[]) objArr31[1])[0] = i25 ^ (i25 << 5);
                                                                return objArr31;
                                                            }
                                                            i22++;
                                                            i13 = 1;
                                                        } catch (Throwable th2) {
                                                            Throwable cause = th2.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i18++;
                                                    i17 = i19;
                                                    r102 = 0;
                                                    i13 = 1;
                                                    i14 = 0;
                                                } catch (Throwable th3) {
                                                    Throwable cause2 = th3.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause3 = th4.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th4;
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause4 = th5.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th5;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause5 = th6.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause6 = th7.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause7 = th8.getCause();
                            if (cause7 != null) {
                                throw cause7;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause8 = th9.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause9 = th10.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            c3 = 3;
        }
        Object[] objArr32 = new Object[4];
        objArr32[0] = new int[]{i11};
        objArr32[1] = new int[1];
        objArr32[2] = new int[]{i11};
        objArr32[c3] = null;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i26 = ~iUptimeMillis;
        int iA2 = l1.a(~(i26 | (-38978391)), 301, (((~(iUptimeMillis | (-221505100))) | 220275721 | (~((-37749013) | i26))) * (-301)) + (((~((-221505100) | i26)) | (-38978391)) * (-602)) + 440897165, i12);
        int i27 = iA2 ^ (iA2 << 13);
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr32[1])[0] = i28 ^ (i28 << 5);
        return objArr32;
    }

    public static void init$0() {
        $$a = new byte[]{48, -109, -115, -11};
        $$b = 126;
    }

    public static void AuthenticationRequestParameters(int i11, atd.aa.getDeviceData getdevicedata) throws InvalidInputException {
        int i12 = (getSDKEphemeralPublicKey + 71) % 128;
        BuildConfig = i12;
        if (i11 < 5) {
            throw getdevicedata.getSDKAppID();
        }
        int i13 = i12 + 9;
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }
}
