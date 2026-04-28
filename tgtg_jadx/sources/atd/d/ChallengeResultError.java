package atd.d;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.signers.PSSSigner;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class ChallengeResultError extends SSLSocketFactory {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static int[] getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final SSLSocketFactory AuthenticationRequestParameters;
    private final String[] getSDKAppID;

    private static String $$g(short s7, short s8, short s11) {
        int i11 = s11 + 4;
        int i12 = s8 * 2;
        byte[] bArr = $$c;
        int i13 = 119 - s7;
        byte[] bArr2 = new byte[1 - i12];
        int i14 = 0 - i12;
        int i15 = -1;
        if (bArr == null) {
            i13 = (-i13) + i14;
            i11 = i11;
            bArr = bArr;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr2[i16] = (byte) i13;
            int i17 = i11 + 1;
            if (i16 == i14) {
                return new String(bArr2, 0);
            }
            i13 = (-bArr[i17]) + i13;
            i11 = i17;
            bArr = bArr;
            i15 = i16;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        getSDKReferenceNumber = -1977436474389145139L;
        getSDKTransactionID = -2038612665;
        getDeviceData = (char) 15687;
        getMessageVersion = new int[]{-1605825098, -1522782256, -236649028, 1034433998, -1664241670, 518067636, 1678914014, 275514820, -2013968874, 1501003049, -1755297605, -1432124119, -835080999, 584164810, -476999615, 969569934, -1967283558, 317818183};
    }

    public ChallengeResultError() throws Throwable {
        int i11;
        int i12;
        char c3;
        int i13;
        Method method;
        ArrayList arrayList = new ArrayList();
        Object[] objArr = new Object[1];
        a("撊摟舡ﻼ", "촷䷣충鬋", "㜷\ud91f䛣ᑔ켫瑲电㊝鈚ݺ㖵⽦뽁Ꞥ癖䭸ᗝ㈶콊캑ꆙ\ue110텟컛", ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        int i14 = 0;
        Class<?> cls = Class.forName(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a("撊摟舡ﻼ", "﯀麁쯮魸", "쾄䍪뙜침", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (30923 - TextUtils.indexOf("", "", 0, 0)), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i15 = 14;
        Object[] objArr3 = new Object[1];
        b(new int[]{-1925749381, -760990472, -2123319406, 481600709, 2137611239, 1863054090, 190560414, -1433021638, 1853189855, -884063073, 937477828, 1414064218, -269302069, 569228611}, View.combineMeasuredStates(0, 0) + 26, objArr3);
        Method[] methodArr = {cls.getMethod(strIntern, KeyManager[].class, TrustManager[].class, Class.forName(((String) objArr3[0]).intern()))};
        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1866647183);
        if (sDKTransactionID == null) {
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2774;
            char minimumFlingVelocity = (char) (13060 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 25;
            byte[] bArr = $$a;
            byte b8 = bArr[18];
            byte b11 = bArr[27];
            i11 = -1866647183;
            Object[] objArr4 = new Object[1];
            c(b8, b11, (byte) (b11 + 2), objArr4);
            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(scrollDefaultDelay, minimumFlingVelocity, tapTimeout, 1289043809, false, (String) objArr4[0], null);
        } else {
            i11 = -1866647183;
        }
        Object obj = ((Field) sDKTransactionID).get(null);
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        if (obj == null) {
            c3 = 17;
            i13 = -1;
            Method[] declaredMethods = ((Class) atd.e.ChallengeResult.AuthenticationRequestParameters((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2773, (char) (13059 - MotionEvent.axisFromString("")), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    i12 = i15;
                    break;
                }
                Method method2 = declaredMethods[i16];
                try {
                    Object[] objArr5 = new Object[1];
                    a("撊摟舡ﻼ", "逘ত\uec7b귃", "솁ᵣ椆\uee85銏祖Ყ覝\uf021岹胐ቯ砄䢇囃뿬䊡㹆塂䥉빭뮆㵘㹱", View.MeasureSpec.getSize(i14), (char) Color.argb(i14, i14, i14, i14), objArr5);
                    Class<?> cls4 = Class.forName(((String) objArr5[i14]).intern());
                    int i17 = i14;
                    Object[] objArr6 = new Object[1];
                    a("撊摟舡ﻼ", "雽饧覈恇", "듵扦힄欍\ue5cf흄酓㬎⺃\uda2bꮔ緳", Gravity.getAbsoluteGravity(i14, i14), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr6);
                    Object[] objArr7 = {Integer.valueOf(((Integer) cls4.getMethod(((String) objArr6[i17]).intern(), null).invoke(method2, null)).intValue())};
                    int[] iArr = new int[i15];
                    // fill-array-data instruction
                    iArr[0] = -1925749381;
                    iArr[1] = -760990472;
                    iArr[2] = -1286606644;
                    iArr[3] = 1158302913;
                    iArr[4] = 1479721207;
                    iArr[5] = 1133213677;
                    iArr[6] = -1925788704;
                    iArr[7] = 2037720615;
                    iArr[8] = 2072222446;
                    iArr[9] = -1326896639;
                    iArr[10] = -748514868;
                    iArr[11] = 2090089522;
                    iArr[12] = -1749852864;
                    iArr[13] = 1991400421;
                    i12 = i15;
                    Object[] objArr8 = new Object[1];
                    b(iArr, 26 - TextUtils.getOffsetAfter("", i17), objArr8);
                    Class<?> cls5 = Class.forName(((String) objArr8[i17]).intern());
                    Object[] objArr9 = new Object[1];
                    a("撊摟舡ﻼ", "됤囩쁻斻", "짫聒웅틝찥\ue7f2剩亇", ViewConfiguration.getPressedStateDuration() >> 16, (char) (TextUtils.lastIndexOf("", '0') + 1), objArr9);
                    if (((Boolean) cls5.getMethod(((String) objArr9[0]).intern(), cls3).invoke(null, objArr7)).booleanValue()) {
                        Object[] objArr10 = new Object[1];
                        a("撊摟舡ﻼ", "逘ত\uec7b귃", "솁ᵣ椆\uee85銏祖Ყ覝\uf021岹胐ቯ砄䢇囃뿬䊡㹆塂䥉빭뮆㵘㹱", KeyEvent.normalizeMetaState(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr10);
                        Class<?> cls6 = Class.forName(((String) objArr10[0]).intern());
                        Object[] objArr11 = new Object[1];
                        b(new int[]{-1878772972, -254375653, -804113139, -354573362, -1134572416, -1177050022, -1735365026, -712437969}, (Process.myPid() >> 22) + 13, objArr11);
                        if (cls2.equals(cls6.getMethod(((String) objArr11[0]).intern(), null).invoke(method2, null))) {
                            Object[] objArr12 = new Object[1];
                            a("撊摟舡ﻼ", "逘ত\uec7b귃", "솁ᵣ椆\uee85銏祖Ყ覝\uf021岹胐ቯ砄䢇囃뿬䊡㹆塂䥉빭뮆㵘㹱", ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr12);
                            Class<?> cls7 = Class.forName(((String) objArr12[0]).intern());
                            Object[] objArr13 = new Object[1];
                            a("撊摟舡ﻼ", "Ⳮ橬韢쏀", "偤꤫獁\ue843\ue6ae昿폢㾍塙㡖ソ\ufadc⟋뒐ﻗ햔\ue75f", (-496341973) - MotionEvent.axisFromString(""), (char) (49303 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr13);
                            Object[] objArr14 = (Object[]) cls7.getMethod(((String) objArr13[0]).intern(), null).invoke(method2, null);
                            if (objArr14.length == 2 && cls2.equals(objArr14[0])) {
                                Object[] objArr15 = new Object[1];
                                a("撊摟舡ﻼ", "逘ত\uec7b귃", "솁ᵣ椆\uee85銏祖Ყ覝\uf021岹胐ቯ砄䢇囃뿬䊡㹆塂䥉빭뮆㵘㹱", Color.alpha(0), (char) ((-1) - MotionEvent.axisFromString("")), objArr15);
                                if (Class.forName(((String) objArr15[0]).intern()).equals(objArr14[1])) {
                                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i11);
                                    if (sDKTransactionID2 == null) {
                                        int iRgb = (-16774442) - Color.rgb(0, 0, 0);
                                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 13060);
                                        int i18 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24;
                                        byte[] bArr2 = $$a;
                                        byte b12 = bArr2[18];
                                        byte b13 = bArr2[27];
                                        Object[] objArr16 = new Object[1];
                                        c(b12, b13, (byte) (b13 + 2), objArr16);
                                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iRgb, defaultSize, i18, 1289043809, false, (String) objArr16[0], null);
                                    }
                                    ((Field) sDKTransactionID2).set(null, method2);
                                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i11);
                                    if (sDKTransactionID3 == null) {
                                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 2775;
                                        char keyRepeatTimeout = (char) (13060 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                        int iIndexOf2 = 25 - TextUtils.indexOf("", "", 0);
                                        byte[] bArr3 = $$a;
                                        byte b14 = bArr3[18];
                                        byte b15 = bArr3[27];
                                        Object[] objArr17 = new Object[1];
                                        c(b14, b15, (byte) (b15 + 2), objArr17);
                                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iIndexOf, keyRepeatTimeout, iIndexOf2, 1289043809, false, (String) objArr17[0], null);
                                    }
                                    try {
                                        Object[] objArr18 = {0L, ((Field) sDKTransactionID3).get(null)};
                                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1314787788);
                                        if (sDKTransactionID4 == null) {
                                            int trimmedLength = TextUtils.getTrimmedLength("") + 2774;
                                            char cRgb = (char) ((-16764156) - Color.rgb(0, 0, 0));
                                            int i19 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 24;
                                            byte b16 = $$a[17];
                                            byte b17 = (byte) (b16 + 1);
                                            byte b18 = b16;
                                            Object[] objArr19 = new Object[1];
                                            c(b17, b18, (byte) (b18 + 3), objArr19);
                                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(trimmedLength, cRgb, i19, -1841948708, false, (String) objArr19[0], new Class[]{cls2, Method.class});
                                        }
                                        ((Long) ((Method) sDKTransactionID4).invoke(null, objArr18)).getClass();
                                    } catch (Throwable th2) {
                                        Throwable cause = th2.getCause();
                                        if (cause == null) {
                                            throw th2;
                                        }
                                        throw cause;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i16++;
                    i15 = i12;
                    i14 = 0;
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        throw th3;
                    }
                    throw cause2;
                }
            }
        } else {
            i12 = 14;
            c3 = 17;
            i13 = -1;
        }
        Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(i11);
        if (sDKTransactionID5 == null) {
            int iIndexOf3 = 2773 - TextUtils.indexOf((CharSequence) "", '0');
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 13060);
            int maximumFlingVelocity = 25 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr4 = $$a;
            byte b19 = bArr4[18];
            byte b21 = bArr4[27];
            Object[] objArr20 = new Object[1];
            c(b19, b21, (byte) (b21 + 2), objArr20);
            sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(iIndexOf3, edgeSlop, maximumFlingVelocity, 1289043809, false, (String) objArr20[0], null);
        }
        try {
            Object[] objArr21 = {((Field) sDKTransactionID5).get(null)};
            Object sDKTransactionID6 = atd.e.ChallengeResult.getSDKTransactionID(-820980419);
            if (sDKTransactionID6 == null) {
                int iMyTid = 2774 - (Process.myTid() >> 22);
                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 13060);
                int mode = 25 - View.MeasureSpec.getMode(0);
                byte b22 = $$a[c3];
                byte b23 = (byte) (b22 | 21);
                Object[] objArr22 = new Object[1];
                c(b22, b23, (byte) (b23 & 3), objArr22);
                sDKTransactionID6 = atd.e.ChallengeResult.getDeviceData(iMyTid, offsetBefore, mode, 326685485, false, (String) objArr22[0], new Class[]{Object.class});
            }
            ((Method) sDKTransactionID6).invoke(null, objArr21);
            try {
                Object[] objArr23 = {0, methodArr, null};
                Object sDKTransactionID7 = atd.e.ChallengeResult.getSDKTransactionID(923113519);
                if (sDKTransactionID7 == null) {
                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3183;
                    char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16800977);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 20;
                    Object[] objArr24 = new Object[1];
                    c((byte) 2, (byte) (-$$a[i12]), r9[c3], objArr24);
                    sDKTransactionID7 = atd.e.ChallengeResult.getDeviceData(scrollDefaultDelay2, cRgb2, longPressTimeout, -345137601, false, (String) objArr24[0], new Class[]{cls3, Method[].class, List.class});
                }
                long jLongValue = ((Long) ((Method) sDKTransactionID7).invoke(null, objArr23)).longValue();
                long j9 = -103246693;
                long jMyTid = Process.myTid();
                long j11 = 50;
                long j12 = i13;
                long j13 = jLongValue ^ j12;
                long j14 = jMyTid ^ j12;
                long j15 = j13 | j14;
                long j16 = (j11 * (((j14 | j9) ^ j12) | (j15 ^ j12) | ((j13 | j9) ^ j12))) + ((((((j9 ^ j12) | j13) | jMyTid) ^ j12) | ((j15 | j9) ^ j12)) * j11) + (((long) (-50)) * (j9 | jMyTid)) + (((long) (-49)) * jLongValue) + (((long) 51) * j9) + ((long) (-76366944));
                int iB = a0.b(1078597942);
                int i21 = ~iB;
                int i22 = ((int) (j16 >> 32)) & ((((~(iB | (-1946814672))) | 1073743946) * 464) + ((1984670159 | iB) * (-464)) + (((~(i21 | (-1946814672))) | (~(910926213 | i21)) | 1073743946) * 464) + 1821319050);
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i23 = ~iElapsedRealtime;
                int i24 = (((int) j16) & ((((~(iElapsedRealtime | 2144312755)) | (~(i23 | (-1095307537))) | (~((-713428131) | iElapsedRealtime))) * BERTags.PRIVATE) + (((~((-1808735667) | i23)) | 713428130) * (-384)) + ((335577089 | i23) * (-192)) + 1788176917)) | i22;
                int i25 = i24 >>> 24;
                int i26 = i24 & 16777215;
                int i27 = i25 != 0 ? 1 : 0;
                arrayList.add((i27 == 0 || i26 >= 1 || (method = methodArr[i26]) == null) ? null : method.toString());
                int i28 = (i25 + 6) * i27;
                if (i28 != 0) {
                    try {
                        Object[] objArr25 = {Long.valueOf(((long) i28) ^ 1196984175391932416L), 278694597L};
                        byte[] bArr5 = $$d;
                        byte b24 = bArr5[10];
                        byte b25 = (byte) (b24 - 1);
                        byte b26 = b24;
                        Object[] objArr26 = new Object[1];
                        d(b25, b26, (byte) (b26 - 1), objArr26);
                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                        byte b27 = bArr5[10];
                        byte b28 = b27;
                        Object[] objArr27 = new Object[1];
                        d(b28, (byte) (b28 - 1), b27, objArr27);
                        cls8.getMethod((String) objArr27[0], cls2, cls2).invoke(null, objArr25);
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 == null) {
                            throw th4;
                        }
                        throw cause3;
                    }
                }
                Object[] objArr28 = new Object[1];
                b(new int[]{-689248629, 629988825}, 3 - (ViewConfiguration.getTouchSlop() >> 8), objArr28);
                SSLContext sSLContext = SSLContext.getInstance(((String) objArr28[0]).intern());
                sSLContext.init(null, null, null);
                this.AuthenticationRequestParameters = sSLContext.getSocketFactory();
                Object[] objArr29 = new Object[1];
                b(new int[]{287463026, -602651846, 9502271, -943750741}, ExpandableListView.getPackedPositionType(0L) + 7, objArr29);
                this.getSDKAppID = new String[]{((String) objArr29[0]).intern()};
            } catch (Throwable th5) {
                Throwable cause4 = th5.getCause();
                if (cause4 == null) {
                    throw th5;
                }
                throw cause4;
            }
        } catch (Throwable th6) {
            Throwable cause5 = th6.getCause();
            if (cause5 == null) {
                throw th6;
            }
            throw cause5;
        }
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        long j9;
        int i12;
        int i13;
        char c7;
        Object obj = null;
        int i14 = 2;
        if (str3 != null) {
            int i15 = $10 + 35;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
            $11 = ($10 + 85) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        if (str2 != null) {
            $10 = ($11 + 71) % 128;
            charArray2 = str2.toCharArray();
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        onCompletion oncompletion = new onCompletion();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        int i16 = 0;
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    int packedPositionGroup = 2069 - ExpandableListView.getPackedPositionGroup(0L);
                    char cResolveSize = (char) (View.resolveSize(i16, i16) + 44657);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 32;
                    byte b8 = (byte) ($$f & i14);
                    j9 = 0;
                    byte b11 = (byte) (b8 - 2);
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(packedPositionGroup, cResolveSize, keyRepeatDelay, -397560981, false, $$g(b8, b11, (byte) (b11 - 1)), new Class[]{Object.class});
                } else {
                    j9 = 0;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3095;
                    char gidForName = (char) (Process.getGidForName("") + 14368);
                    int i17 = (SystemClock.elapsedRealtimeNanos() > j9 ? 1 : (SystemClock.elapsedRealtimeNanos() == j9 ? 0 : -1)) + 17;
                    c7 = 1;
                    byte b12 = (byte) ($$f & 1);
                    i12 = i14;
                    byte b13 = (byte) (b12 - 1);
                    i13 = i16;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(scrollDefaultDelay, gidForName, i17, -1211924053, false, $$g(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class});
                } else {
                    i12 = i14;
                    i13 = i16;
                    c7 = 1;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i18 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[c7] = Integer.valueOf(i18);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1427 - TextUtils.lastIndexOf("", '0', i13), (char) (KeyEvent.getMaxKeyCode() >> 16), 30 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1183253656, false, $$g(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, cls, cls});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i19 = cArr3[iIntValue2] * 32718;
                int i21 = i12;
                Object[] objArr5 = new Object[i21];
                objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[0] = Integer.valueOf(i19);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getFadingEdgeLength() >> 16) + 2774, (char) (13060 - View.resolveSizeAndState(0, 0, 0)), 25 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -320602145, false, $$g((byte) ($$f + 4), b16, (byte) (b16 - 1)), new Class[]{cls, cls});
                }
                cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i22 = oncompletion.getDeviceData;
                cArr5[i22] = (char) (((((long) (r0 ^ cArr[i22])) ^ (getSDKReferenceNumber ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKTransactionID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getDeviceData) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i22 + 1;
                obj = null;
                i14 = i21;
                i16 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        float f11;
        int i12;
        int i13;
        char[] cArr;
        int i14;
        char[] cArr2;
        int length;
        int[] iArr2;
        int i15;
        int i16;
        int i17;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr3 = new char[4];
        int i18 = 2;
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr3 = getMessageVersion;
        char c3 = 17;
        Class cls = Integer.TYPE;
        int i19 = 16;
        if (iArr3 != null) {
            i12 = 53070;
            int i21 = $11 + 17;
            f11 = 0.0f;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i15 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i15 = 0;
            }
            i13 = -1667528016;
            while (i15 < length) {
                char c7 = c3;
                int i22 = $11 + 83;
                $10 = i22 % 128;
                if (i22 % i18 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i15])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                        if (sDKTransactionID == null) {
                            i16 = i18;
                            int i23 = 2224 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 53070);
                            int iIndexOf = 21 - TextUtils.indexOf("", "");
                            byte b8 = (byte) ($$f & 21);
                            i17 = i19;
                            byte b11 = (byte) (b8 - 5);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(i23, minimumFlingVelocity, iIndexOf, 1089703072, false, $$g(b8, b11, (byte) (b11 - 1)), new Class[]{cls});
                        } else {
                            i16 = i18;
                            i17 = i19;
                        }
                        iArr2[i15] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    i16 = i18;
                    i17 = i19;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i15])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID2 == null) {
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2224;
                        char c8 = (char) (53070 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int threadPriority = 21 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b12 = (byte) ($$f & 21);
                        byte b13 = (byte) (b12 - 5);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iLastIndexOf, c8, threadPriority, 1089703072, false, $$g(b12, b13, (byte) (b13 - 1)), new Class[]{cls});
                    }
                    iArr2[i15] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i15++;
                }
                c3 = c7;
                i18 = i16;
                i19 = i17;
            }
            iArr3 = iArr2;
        } else {
            f11 = 0.0f;
            i12 = 53070;
            i13 = -1667528016;
        }
        int i24 = i18;
        char c11 = c3;
        int i25 = i19;
        int i26 = 0;
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getMessageVersion;
        if (iArr5 != null) {
            $11 = ($10 + 103) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i27 = 0;
            while (i27 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i27])};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i13);
                if (sDKTransactionID3 == null) {
                    int i28 = i26;
                    int iResolveOpacity = Drawable.resolveOpacity(i28, i28) + 2223;
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + i12);
                    int iMyTid = (Process.myTid() >> 22) + 21;
                    byte b14 = (byte) ($$f & 21);
                    byte b15 = (byte) (b14 - 5);
                    cArr2 = cArr3;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iResolveOpacity, doubleTapTimeout, iMyTid, 1089703072, false, $$g(b14, b15, (byte) (b15 - 1)), new Class[]{cls});
                } else {
                    cArr2 = cArr3;
                }
                iArr6[i27] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                i27++;
                cArr3 = cArr2;
                i26 = 0;
            }
            cArr = cArr3;
            $10 = ($11 + 17) % 128;
            iArr5 = iArr6;
        } else {
            cArr = cArr3;
        }
        char c12 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i29 = getmessageversion.getSDKAppID;
            if (i29 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i31 = iArr[i29];
            char c13 = (char) (i31 >> 16);
            cArr[c12] = c13;
            char c14 = (char) i31;
            cArr[1] = c14;
            char c15 = (char) (iArr[i29 + 1] >> 16);
            cArr[i24] = c15;
            char c16 = (char) iArr[i29 + 1];
            cArr[3] = c16;
            getmessageversion.getDeviceData = (c13 << 16) + c14;
            getmessageversion.AuthenticationRequestParameters = (c15 << 16) + c16;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr4);
            int i32 = 0;
            while (true) {
                i14 = getmessageversion.getDeviceData;
                if (i32 >= i25) {
                    break;
                }
                int i33 = i14 ^ iArr4[i32];
                getmessageversion.getDeviceData = i33;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i33);
                Object[] objArr5 = new Object[4];
                objArr5[3] = getmessageversion;
                objArr5[i24] = getmessageversion;
                objArr5[1] = Integer.valueOf(sDKReferenceNumber);
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getPressedStateDuration() >> 16) + 2386, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 19 - ExpandableListView.getPackedPositionGroup(0L), -2040903174, false, $$g((byte) ($$f & 23), b16, (byte) (b16 - 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i32++;
                i25 = 16;
            }
            int i34 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i34;
            getmessageversion.AuthenticationRequestParameters = i14;
            i25 = 16;
            int i35 = i14 ^ iArr4[16];
            getmessageversion.AuthenticationRequestParameters = i35;
            int i36 = i34 ^ iArr4[c11];
            getmessageversion.getDeviceData = i36;
            cArr[0] = (char) (i36 >>> 16);
            cArr[1] = (char) i36;
            cArr[i24] = (char) (i35 >>> 16);
            cArr[3] = (char) i35;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr4);
            int i37 = getmessageversion.getSDKAppID;
            cArr4[i37 * 2] = cArr[0];
            cArr4[(i37 * 2) + 1] = cArr[1];
            cArr4[(i37 * 2) + 2] = cArr[i24];
            cArr4[(i37 * 2) + 3] = cArr[3];
            int i38 = i24;
            Object[] objArr6 = new Object[i38];
            objArr6[1] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                byte b17 = (byte) 0;
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(ExpandableListView.getPackedPositionChild(0L) + 1862, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > f11 ? 1 : (TypedValue.complexToFloat(0) == f11 ? 0 : -1)) + 40, -562771681, false, $$g((byte) ($$f & 22), b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            $10 = ($11 + 71) % 128;
            i24 = i38;
            c12 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 2
            byte[] r1 = atd.d.ChallengeResultError.$$a
            int r8 = 24 - r8
            int r7 = 122 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 1
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r1
            r1 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.ChallengeResultError.c(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 32
            int r8 = 97 - r8
            int r6 = r6 * 19
            int r0 = 50 - r6
            int r7 = r7 * 49
            int r7 = 52 - r7
            byte[] r1 = atd.d.ChallengeResultError.$$d
            byte[] r0 = new byte[r0]
            int r6 = 49 - r6
            r2 = 0
            if (r1 != 0) goto L1a
            r8 = r7
            r3 = r1
            r4 = r2
            r1 = r6
            goto L33
        L1a:
            r3 = r2
        L1b:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L33:
            int r7 = -r7
            int r7 = r7 + r1
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.ChallengeResultError.d(int, short, byte, java.lang.Object[]):void");
    }

    private Socket getSDKTransactionID(Socket socket) {
        if (socket instanceof SSLSocket) {
            ChallengeResultCancelled = (getSDKEphemeralPublicKey + 25) % 128;
            ((SSLSocket) socket).setEnabledProtocols(this.getSDKAppID);
            ChallengeResultCancelled = (getSDKEphemeralPublicKey + 99) % 128;
        }
        return socket;
    }

    public static void init$0() {
        $$a = new byte[]{48, -79, 31, 67, 9, 26, -22, -4, 18, 20, 41, -6, 24, 16, -7, 13, 28, 0, 17, 10, -26, 6, -32, 34, -41, 0, 18, 19};
        $$b = 112;
    }

    public static void init$1() {
        $$d = new byte[]{6, -55, PSSSigner.TRAILER_IMPLICIT, 44, -19, 16, 54, -76, 76, -65, 1, 43, -44, 2, -3, 4, 7, -15, 11, -6, 1, 74, -29, -52, 1, 12, 3, -9, -6, 11, 6, 2, -19, 11, -6, 1, 28, -19, -12, -4, 16, -14, -1, 36, -17, -17, 17, -12, 8, -15, 15, -13, -1, -52, 1, 12, 3, -9, -6, 11, 6, 2, -19, 11, -6, 1, 28, -19, -12, -4, 16, -14, -1, 36, -17, -17, 17, -12, 8, -15, 15, -13, -1};
        $$e = 141;
    }

    public static void init$2() {
        $$c = new byte[]{33, 102, -32, 123};
        $$f = 47;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        int i12 = ChallengeResultCancelled + 75;
        getSDKEphemeralPublicKey = i12 % 128;
        int i13 = i12 % 2;
        Socket socketCreateSocket = this.AuthenticationRequestParameters.createSocket(socket, str, i11, z11);
        if (i13 != 0) {
            getSDKTransactionID(socketCreateSocket);
            throw null;
        }
        Socket sDKTransactionID = getSDKTransactionID(socketCreateSocket);
        int i14 = getSDKEphemeralPublicKey + 39;
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 51 / 0;
        }
        return sDKTransactionID;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        int i11 = getSDKEphemeralPublicKey + 85;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        SSLSocketFactory sSLSocketFactory = this.AuthenticationRequestParameters;
        if (i12 != 0) {
            return sSLSocketFactory.getDefaultCipherSuites();
        }
        String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
        int i13 = 0 / 0;
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 99) % 128;
        String[] supportedCipherSuites = this.AuthenticationRequestParameters.getSupportedCipherSuites();
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 29) % 128;
        return supportedCipherSuites;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        int i11 = getSDKEphemeralPublicKey + 125;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        SSLSocketFactory sSLSocketFactory = this.AuthenticationRequestParameters;
        if (i12 != 0) {
            return getSDKTransactionID(sSLSocketFactory.createSocket());
        }
        getSDKTransactionID(sSLSocketFactory.createSocket());
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11) throws IOException {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 11) % 128;
        Socket sDKTransactionID = getSDKTransactionID(this.AuthenticationRequestParameters.createSocket(str, i11));
        int i12 = getSDKEphemeralPublicKey + 1;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            return sDKTransactionID;
        }
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 23) % 128;
        Socket sDKTransactionID = getSDKTransactionID(this.AuthenticationRequestParameters.createSocket(str, i11, inetAddress, i12));
        int i13 = getSDKEphemeralPublicKey + 79;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 22 / 0;
        }
        return sDKTransactionID;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        int i12 = getSDKEphemeralPublicKey + 41;
        ChallengeResultCancelled = i12 % 128;
        int i13 = i12 % 2;
        Socket socketCreateSocket = this.AuthenticationRequestParameters.createSocket(inetAddress, i11);
        if (i13 != 0) {
            return getSDKTransactionID(socketCreateSocket);
        }
        getSDKTransactionID(socketCreateSocket);
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 5) % 128;
        Socket sDKTransactionID = getSDKTransactionID(this.AuthenticationRequestParameters.createSocket(inetAddress, i11, inetAddress2, i12));
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 43) % 128;
        return sDKTransactionID;
    }
}
