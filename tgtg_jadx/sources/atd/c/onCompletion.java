package atd.c;

import a40.d0;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import java.util.ArrayList;
import n90.b0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class onCompletion extends ChallengeResultError implements Parcelable {
    private static int AuthenticationRequestParameters = 0;
    public static final Parcelable.Creator<onCompletion> CREATOR = new Parcelable.Creator<onCompletion>() { // from class: atd.c.onCompletion.4
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static long getDeviceData;
        private static int getSDKReferenceNumber;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(short r7, int r8, short r9) {
            /*
                byte[] r0 = atd.c.onCompletion.AnonymousClass4.$$c
                int r7 = r7 * 4
                int r7 = r7 + 1
                int r9 = r9 * 3
                int r9 = r9 + 4
                int r8 = r8 * 2
                int r8 = r8 + 97
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r8 = r9
                r4 = r2
                goto L2d
            L17:
                r3 = r9
                r9 = r8
                r8 = r3
                r3 = r2
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L28:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2d:
                int r3 = -r3
                int r9 = r9 + 1
                int r8 = r8 + r3
                r3 = r9
                r9 = r8
                r8 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.c.onCompletion.AnonymousClass4.$$g(short, int, short):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            getSDKReferenceNumber = 0;
            AuthenticationRequestParameters = 1;
            getDeviceData = -8348049362019703764L;
        }

        private static onCompletion[] AuthenticationRequestParameters(int i11) {
            int i12 = AuthenticationRequestParameters;
            int i13 = i12 + 93;
            getSDKReferenceNumber = i13 % 128;
            onCompletion[] oncompletionArr = new onCompletion[i11];
            if (i13 % 2 != 0) {
                throw null;
            }
            getSDKReferenceNumber = (i12 + 97) % 128;
            return oncompletionArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = 42 - r6
                int r8 = r8 * 36
                int r8 = r8 + 67
                byte[] r0 = atd.c.onCompletion.AnonymousClass4.$$a
                int r7 = r7 * 7
                int r7 = r7 + 17
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r5 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                int r6 = r6 + 1
                if (r5 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r6]
            L28:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-3)
                r3 = r5
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.c.onCompletion.AnonymousClass4.a(byte, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(java.lang.String r20, int r21, java.lang.Object[] r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.c.onCompletion.AnonymousClass4.b(java.lang.String, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = 91 - r6
                int r7 = 40 - r7
                int r8 = r8 * 6
                int r8 = 103 - r8
                byte[] r0 = atd.c.onCompletion.AnonymousClass4.$$d
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r0
                r4 = r2
                r0 = r6
                goto L2f
            L13:
                r3 = r8
                r8 = r6
                r6 = r3
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r8 = r8 + 1
                r4 = r0[r8]
                r5 = r0
                r0 = r8
                r8 = r4
                r4 = r3
                r3 = r5
            L2f:
                int r8 = -r8
                int r6 = r6 + r8
                int r6 = r6 + (-2)
                r8 = r0
                r0 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.c.onCompletion.AnonymousClass4.c(byte, short, byte, java.lang.Object[]):void");
        }

        private onCompletion getDeviceData(Parcel parcel) throws Throwable {
            int i11;
            float f11;
            int i12;
            int i13;
            int i14;
            Object[] objArr;
            AuthenticationRequestParameters = (getSDKReferenceNumber + 43) % 128;
            Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-788093327);
            if (sDKTransactionID == null) {
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 904;
                char maximumDrawingCacheSize = (char) (42075 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int i15 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32;
                byte[] bArr = $$a;
                byte b8 = (byte) (-bArr[2]);
                byte b11 = (byte) (-bArr[4]);
                Object[] objArr2 = new Object[1];
                a(b8, b11, b11, objArr2);
                sDKTransactionID = atd.e.ChallengeResult.getDeviceData(windowTouchSlop, maximumDrawingCacheSize, i15, 225353825, false, (String) objArr2[0], null);
            }
            long j9 = ((Field) sDKTransactionID).getLong(null);
            Object[] objArr3 = new Object[1];
            b("붥踓\udad2⚝獏뼰诶ퟥ\u2063氶룐蕤턑᷒榮멶蘹틎Ẫ欐럓莂", 13241 - KeyEvent.keyCodeFromString(""), objArr3);
            Class<?> cls = Class.forName(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            b("붡睱⠗\udd3f雓䮜粶㙹\ueb69鰄凒ૣ㾁\uf0acꩿ", View.MeasureSpec.getSize(0) + 51929, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod(((String) objArr4[0]).intern(), null).invoke(null, null)).longValue();
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1245587777);
            if (sDKTransactionID2 == null) {
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 905;
                i11 = -788093327;
                char cMyTid = (char) ((Process.myTid() >> 22) + 42075);
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 32;
                f11 = 0.0f;
                i12 = 42075;
                i14 = 2;
                i13 = 4;
                Object[] objArr5 = new Object[1];
                a(r17[20], r17[12], (byte) (-$$a[4]), objArr5);
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iLastIndexOf, cMyTid, maximumFlingVelocity, -1772736687, false, (String) objArr5[0], null);
            } else {
                i11 = -788093327;
                f11 = 0.0f;
                i12 = 42075;
                i13 = 4;
                i14 = 2;
            }
            if (j9 == ((jLongValue - ((((Field) sDKTransactionID2).getLong(null) << 53) >>> 53)) >> 11)) {
                getSDKReferenceNumber = (AuthenticationRequestParameters + 59) % 128;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(381208869);
                if (sDKTransactionID3 == null) {
                    int iArgb = 904 - Color.argb(0, 0, 0, 0);
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + i12);
                    int iGreen = Color.green(0) + 32;
                    byte[] bArr2 = $$a;
                    byte b12 = bArr2[12];
                    Object[] objArr6 = new Object[1];
                    a(b12, (byte) (-bArr2[i13]), b12, objArr6);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iArgb, cNormalizeMetaState, iGreen, -892285131, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) sDKTransactionID3).get(null);
                objArr = new Object[i13];
                objArr[0] = new int[]{i};
                objArr[1] = new int[1];
                objArr[i14] = new int[]{i};
                int i16 = ((int[]) objArr7[0])[0];
                int i17 = ((int[]) objArr7[i14])[0];
                objArr[3] = (String) objArr7[3];
                int iMyTid = Process.myTid();
                int iA = l1.a(~(iMyTid | (-342108167)), 345, (((~((-376731727) | (~iMyTid))) | (-536313184)) * 345) + (((~((-376731727) | iMyTid)) | 342108166) * 345) + 1635321888, 99169890);
                int i18 = iA ^ (iA << 13);
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[1])[0] = i19 ^ (i19 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b("붮머늈ꭲꎞ鮹逋裡腋說\uf1b5\uee02\ue6eb\udf49휷쾚", View.resolveSize(0, 0) + 1949, objArr8);
                Class<?> cls2 = Class.forName(((String) objArr8[0]).intern());
                Object[] objArr9 = new Object[1];
                b("붭ᥣ\uf427口⺼詢愢㳨鮔睾툩꧍ң\ue04c뼊ᫌ", 42179 - View.MeasureSpec.getSize(0), objArr9);
                int iIntValue = ((Integer) cls2.getMethod(((String) objArr9[0]).intern(), Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr10 = new Object[i14];
                    objArr10[1] = 99169890;
                    objArr10[0] = Integer.valueOf(iIntValue);
                    byte[] bArr3 = $$d;
                    Object[] objArr11 = new Object[1];
                    c((byte) 88, bArr3[13], (byte) (-bArr3[10]), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c((byte) (-bArr3[88]), (byte) 27, bArr3[13], objArr12);
                    String str = (String) objArr12[0];
                    Class cls4 = Integer.TYPE;
                    objArr = (Object[]) cls3.getMethod(str, cls4, cls4).invoke(null, objArr10);
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(381208869);
                    if (sDKTransactionID4 == null) {
                        int iRed = 904 - Color.red(0);
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + i12);
                        int gidForName = 31 - Process.getGidForName("");
                        byte[] bArr4 = $$a;
                        byte b13 = bArr4[12];
                        Object[] objArr13 = new Object[1];
                        a(b13, (byte) (-bArr4[4]), b13, objArr13);
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iRed, absoluteGravity, gidForName, -892285131, false, (String) objArr13[0], null);
                    }
                    ((Field) sDKTransactionID4).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        b("붥踓\udad2⚝獏뼰诶ퟥ\u2063氶룐蕤턑᷒榮멶蘹틎Ẫ欐럓莂", 13241 - TextUtils.getCapsMode("", 0, 0), objArr14);
                        Class<?> cls5 = Class.forName(((String) objArr14[0]).intern());
                        Object[] objArr15 = new Object[1];
                        b("붡睱⠗\udd3f雓䮜粶㙹\ueb69鰄凒ૣ㾁\uf0acꩿ", (ViewConfiguration.getLongPressTimeout() >> 16) + 51929, objArr15);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod(((String) objArr15[0]).intern(), null).invoke(null, null)).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(1245587777);
                        if (sDKTransactionID5 == null) {
                            int i21 = (TypedValue.complexToFloat(0) > f11 ? 1 : (TypedValue.complexToFloat(0) == f11 ? 0 : -1)) + 904;
                            char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42074);
                            int maxKeyCode = 32 - (KeyEvent.getMaxKeyCode() >> 16);
                            Object[] objArr16 = new Object[1];
                            a(r12[20], r12[12], (byte) (-$$a[4]), objArr16);
                            sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(i21, c3, maxKeyCode, -1772736687, false, (String) objArr16[0], null);
                        }
                        ((Field) sDKTransactionID5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 11);
                        Object sDKTransactionID6 = atd.e.ChallengeResult.getSDKTransactionID(i11);
                        if (sDKTransactionID6 == null) {
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 904;
                            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + i12);
                            int i22 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31;
                            byte[] bArr5 = $$a;
                            byte b14 = (byte) (-bArr5[2]);
                            byte b15 = (byte) (-bArr5[4]);
                            Object[] objArr17 = new Object[1];
                            a(b14, b15, b15, objArr17);
                            sDKTransactionID6 = atd.e.ChallengeResult.getDeviceData(offsetAfter, capsMode, i22, 225353825, false, (String) objArr17[0], null);
                        }
                        ((Field) sDKTransactionID6).set(null, lValueOf2);
                        i14 = 2;
                    } catch (Exception unused) {
                        d0.c();
                        return null;
                    }
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            int i23 = ((int[]) objArr[i14])[0];
            int i24 = ((int[]) objArr[0])[0];
            if (i24 == i23) {
                int i25 = ((int[]) objArr[1])[0];
                Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i26 = ~iIdentityHashCode;
                int i27 = (((((~((-831875722) | i26)) | 285288457) | (~(649349012 | i26))) | (~((-102761749) | iIdentityHashCode))) * (-84)) - 1665099004;
                int i28 = (~(iIdentityHashCode | 649349012)) | 831875721;
                int i29 = ~(i26 | (-649349013));
                int iA2 = l1.a(i29 | 102761748, 84, ((i28 | i29) * (-84)) + i27, i25);
                int i31 = iA2 ^ (iA2 << 13);
                int i32 = i31 ^ (i31 >>> 17);
                ((int[]) objArr18[1])[0] = i32 ^ (i32 << 5);
            } else {
                new ArrayList().add((String) objArr[3]);
                long j11 = ((long) (i23 ^ i24)) ^ (-5952225185015791616L);
                getSDKReferenceNumber = (AuthenticationRequestParameters + 49) % 128;
                try {
                    Object[] objArr19 = {Long.valueOf(j11), -1385860437L};
                    byte[] bArr6 = $$d;
                    Object[] objArr20 = new Object[1];
                    c(bArr6[90], bArr6[15], (byte) (-bArr6[10]), objArr20);
                    Class<?> cls6 = Class.forName((String) objArr20[0]);
                    byte b16 = bArr6[13];
                    Object[] objArr21 = new Object[1];
                    c(b16, (byte) (-bArr6[47]), b16, objArr21);
                    String str2 = (String) objArr21[0];
                    Class cls7 = Long.TYPE;
                    cls6.getMethod(str2, cls7, cls7).invoke(null, objArr19);
                    int i33 = ((int[]) objArr[1])[0];
                    Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String) objArr[3]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int iA3 = l1.a(iIdentityHashCode2 | (-1027030958), 54, (((~((~iIdentityHashCode2) | 941047713)) | (~((-941047714) | iIdentityHashCode2)) | (-1027030958)) * 54) + ((((~((-758521005) | r2)) | 672537760) * (-108)) - 224614426), i33);
                    int i34 = iA3 ^ (iA3 << 13);
                    int i35 = i34 ^ (i34 >>> 17);
                    ((int[]) objArr22[1])[0] = i35 ^ (i35 << 5);
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            }
            return new onCompletion(parcel);
        }

        public static void init$0() {
            $$a = new byte[]{57, -81, -39, 15, -1, -18, 30, 12, -10, 3, -46, 5, 0, -11, 5, -16, 14, -14, 25, -40, 16, -13, 0, 3, 21, -29, -23, -1, -18, 36, -27, -17, -3, 15, -9, -1, 12, -18, -16, -4, 7, -9, -2, -40, 4, -14, -3, 4, -12, 4, -1, 16, -22, -17, -5, 6, -11, 46, -33, -16, 8, -5, -10, -3, 4, -2};
            $$b = 104;
        }

        public static void init$1() {
            $$d = new byte[]{39, 64, -52, -10, -21, 14, 52, -77, 73, -67, -1, 41, -46, 0, -5, 2, 5, -17, 9, -8, -1, 72, -69, 0, -17, 31, 13, -9, -9, -21, -3, -1, -15, 11, -11, 9, -4, 21, -41, 6, 9, -5, -15, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17, -21, 14, 52, -77, 73, -59, 0, -17, 30, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 25, -35, 17, -21, -3, 0, 77, -69, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -9, -21, -3, -1, -15, 11, -11, 9, -4, 21, -41, 6, 9, -5, -15};
            $$e = 173;
        }

        public static void init$2() {
            $$c = new byte[]{105, 109, -121, 42};
            $$f = 18;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ onCompletion createFromParcel(Parcel parcel) throws Throwable {
            AuthenticationRequestParameters = (getSDKReferenceNumber + 119) % 128;
            onCompletion deviceData = getDeviceData(parcel);
            int i11 = getSDKReferenceNumber + 109;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 != 0) {
                return deviceData;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ onCompletion[] newArray(int i11) {
            AuthenticationRequestParameters = (getSDKReferenceNumber + 57) % 128;
            onCompletion[] oncompletionArrAuthenticationRequestParameters = AuthenticationRequestParameters(i11);
            int i12 = getSDKReferenceNumber + 23;
            AuthenticationRequestParameters = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 60 / 0;
            }
            return oncompletionArrAuthenticationRequestParameters;
        }
    };
    private static int getSDKTransactionID = 1;

    static {
        int i11 = getSDKTransactionID;
        int i12 = (i11 | 47) << 1;
        int i13 = -(((~i11) & 47) | (i11 & (-48)));
        int i14 = (i12 & i13) + (i13 | i12);
        AuthenticationRequestParameters = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 79 / 0;
        }
    }

    public onCompletion(b0 b0Var) throws atd.ac.getSDKAppID {
        super(b0Var);
    }

    public onCompletion(Parcel parcel) {
        super(parcel);
    }
}
