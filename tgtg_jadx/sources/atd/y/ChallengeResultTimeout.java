package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightnessMode;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenBrightnessMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenBrightnessMode.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightnessMode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ChallengeResultTimeout extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 + 4
            byte[] r0 = atd.y.ChallengeResultTimeout.$$a
            int r7 = 119 - r7
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r7 = r6
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r8 = r8 + 1
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultTimeout.$$d(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKAppID = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters();
        TextUtils.getCapsMode("", 0, 0);
        Color.rgb(0, 0, 0);
        new getSDKTransactionID((byte) 0);
        getMessageVersion = (getSDKEphemeralPublicKey + 33) % 128;
    }

    private ChallengeResultTimeout(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = 1905653906042338631L;
        getSDKReferenceNumber = -2038612665;
        getSDKTransactionID = (char) 19204;
    }

    private static void b(int i11, String str, String str2, char c3, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        char[] charArray3;
        long j9;
        int i12;
        int i13;
        int i14;
        char c7;
        if (str3 != null) {
            charArray = str3.toCharArray();
            $11 = ($10 + 37) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        if (str2 != null) {
            $10 = ($11 + 13) % 128;
            charArray2 = str2.toCharArray();
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        if (str != null) {
            $11 = ($10 + 9) % 128;
            charArray3 = str.toCharArray();
        } else {
            charArray3 = str;
        }
        char[] cArr3 = charArray3;
        atd.bb.onCompletion oncompletion = new atd.bb.onCompletion();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i15 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c3);
        int i16 = 2;
        cArr5[2] = (char) (cArr5[2] + ((char) i11));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) i15;
                    j9 = 0;
                    byte b11 = (byte) (b8 + 2);
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(Gravity.getAbsoluteGravity(i15, i15) + 2069, (char) (44657 - ExpandableListView.getPackedPositionType(0L)), 33 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -397560981, false, $$d(b8, b11, (byte) (b11 - 3)), new Class[]{Object.class});
                } else {
                    j9 = 0;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) i15;
                    i12 = i16;
                    byte b13 = (byte) (b12 + 1);
                    i13 = i15;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf((CharSequence) "", '0', i15, i15) + 3096, (char) (Color.argb(i15, i15, i15, i15) + 14367), 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > j9 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j9 ? 0 : -1)), -1211924053, false, $$d(b12, b13, (byte) (-b13)), new Class[]{Object.class});
                } else {
                    i12 = i16;
                    i13 = i15;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i17 = cArr4[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int keyRepeatDelay = 1428 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    char c8 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    c7 = 1;
                    int i18 = i13;
                    int iResolveSize = 30 - View.resolveSize(i18, i18);
                    byte b14 = (byte) i18;
                    byte b15 = b14;
                    i14 = iIntValue2;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(keyRepeatDelay, c8, iResolveSize, -1183253656, false, $$d(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, cls, cls});
                } else {
                    i14 = iIntValue2;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i19 = cArr4[i14] * 32718;
                int i21 = i12;
                Object[] objArr5 = new Object[i21];
                objArr5[c7] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[0] = Integer.valueOf(i19);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(Color.rgb(0, 0, 0) + 16779990, (char) (13060 - TextUtils.indexOf("", "", 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 26, -320602145, false, $$d(b16, (byte) (b16 | 51), (byte) (-1)), new Class[]{cls, cls});
                }
                cArr5[i14] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr4[i14] = oncompletion.AuthenticationRequestParameters;
                int i22 = oncompletion.getDeviceData;
                cArr6[i22] = (char) (((((long) (r0 ^ cArr2[i22])) ^ (AuthenticationRequestParameters ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKTransactionID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i22 + 1;
                i16 = i21;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static void init$0() {
        $$a = new byte[]{71, 110, 67, -59};
        $$b = 212;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006a A[PHI: r0
      0x006a: PHI (r0v12 java.lang.String) = (r0v11 java.lang.String), (r0v24 java.lang.String) binds: [B:8:0x0068, B:5:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = atd.y.ChallengeResultTimeout.BuildConfig
            int r0 = r0 + 29
            int r1 = r0 % 128
            atd.y.ChallengeResultTimeout.getSDKAppID = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r12.getDeviceData
            r2 = -1
            java.lang.String r3 = ""
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L40
            r0 = 35
            int r0 = android.text.TextUtils.lastIndexOf(r3, r0, r4)
            int r6 = r5 % r0
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            int r0 = r2 << r0
            char r9 = (char) r0
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r7 = "猶⍖帚\uee59"
            java.lang.String r8 = "컈ퟶ煝㮪闟髙\u2437ᣃ⍪硚玠凶᪇澻ꟗ袒坐栝꙯芔䟎㷖"
            java.lang.String r10 = "\u0000\u0000\u0000\u0000"
            b(r6, r7, r8, r9, r10, r11)
            r0 = r11[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L75
            goto L6a
        L40:
            r0 = 48
            int r0 = android.text.TextUtils.lastIndexOf(r3, r0, r4)
            int r6 = r0 + 1
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            int r0 = r0 + r2
            char r9 = (char) r0
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r7 = "猶⍖帚\uee59"
            java.lang.String r8 = "컈ퟶ煝㮪闟髙\u2437ᣃ⍪硚玠凶᪇澻ꟗ袒坐栝꙯芔䟎㷖"
            java.lang.String r10 = "\u0000\u0000\u0000\u0000"
            b(r6, r7, r8, r9, r10, r11)
            r0 = r11[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L75
        L6a:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L75
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            return r0
        L75:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            int r1 = atd.y.ChallengeResultTimeout.BuildConfig
            int r1 = r1 + 25
            int r1 = r1 % 128
            atd.y.ChallengeResultTimeout.getSDKAppID = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultTimeout.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightnessMode$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static boolean AuthenticationRequestParameters;
        private static boolean getDeviceData;
        private static char[] getSDKAppID;
        private static int getSDKReferenceNumber;
        private static long getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, byte r7, int r8) {
            /*
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r6 = r6 * 4
                int r0 = r6 + 1
                byte[] r1 = atd.y.ChallengeResultTimeout.getSDKTransactionID.$$a
                int r8 = 120 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r4 = r8
                r3 = r2
                r8 = r7
                goto L2b
            L15:
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r5
            L2b:
                int r7 = r7 + 1
                int r4 = -r4
                int r8 = r8 + r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultTimeout.getSDKTransactionID.$$c(byte, byte, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKAppID = new char[]{21612, 21607, 21656, 21662, 21584, 21653, 21611, 21605, 21659, 21652, 21615, 21658, 21663, 21614, 21595, 21590, 21630, 21622, 21648, 21654, 21650, 21573, 21616, 21571, 21575, 21610, 21649, 21542, 21578, 21604, 21609, 21586, 21617, 21627, 21621, 21613, 21619, 21651, 21583, 21608, 21576};
            getSDKReferenceNumber = 1286296582;
            AuthenticationRequestParameters = true;
            getDeviceData = true;
            getSDKTransactionID = -6107279908852120979L;
        }

        private getSDKTransactionID() {
        }

        private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            int i12;
            long j9;
            String str3 = str2;
            Object bytes = str3;
            if (str3 != null) {
                int i13 = $11 + 73;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
                    throw null;
                }
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr = (byte[]) bytes;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
            char[] cArr = getSDKAppID;
            Class cls = Integer.TYPE;
            long j11 = 0;
            int i14 = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i15 = 0;
                while (i15 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i15])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            j9 = j11;
                            byte b8 = (byte) i14;
                            byte b11 = b8;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2555 - View.resolveSize(i14, i14), (char) (48597 - (ExpandableListView.getPackedPositionForChild(i14, i14) > j11 ? 1 : (ExpandableListView.getPackedPositionForChild(i14, i14) == j11 ? 0 : -1))), 31 - ((Process.getThreadPriority(i14) + 20) >> 6), -390605202, false, $$c(b8, b11, (byte) (b11 | 9)), new Class[]{cls});
                        } else {
                            j9 = j11;
                        }
                        cArr2[i15] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i15++;
                        j11 = j9;
                        i14 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            long j12 = j11;
            Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
            if (sDKTransactionID2 == null) {
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(147 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getCapsMode("", 0, 0) + 32, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
            int i16 = 1124287645;
            if (getDeviceData) {
                int length2 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length2;
                char[] cArr3 = new char[length2];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i17 = challengeResultTimeout.getSDKAppID;
                    int i18 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i17 >= i18) {
                        objArr[0] = new String(cArr3);
                        return;
                    }
                    cArr3[i17] = (char) (cArr[bArr[(i18 - 1) - i17] + i11] - iIntValue);
                    Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID3 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1697, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j12 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j12 ? 0 : -1)) - 1), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1620360563, false, $$c(b12, b13, (byte) (b13 + 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                }
            } else if (AuthenticationRequestParameters) {
                $11 = ($10 + 115) % 128;
                int length3 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                char[] cArr4 = new char[length3];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i19 = challengeResultTimeout.getSDKAppID;
                    int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i19 >= i21) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    int i22 = $10 + 93;
                    $11 = i22 % 128;
                    if (i22 % 2 == 0) {
                        cArr4[i19] = (char) (cArr[charArray[(i21 % 0) >> i19] - i11] >>> iIntValue);
                        Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(i16);
                        if (sDKTransactionID4 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            i12 = i16;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1697 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 28 - ImageFormat.getBitsPerPixel(0), -1620360563, false, $$c(b14, b15, (byte) (b15 + 5)), new Class[]{Object.class, Object.class});
                        } else {
                            i12 = i16;
                        }
                        ((Method) sDKTransactionID4).invoke(null, objArr5);
                    } else {
                        i12 = i16;
                        cArr4[i19] = (char) (cArr[charArray[(i21 - 1) - i19] - i11] - iIntValue);
                        Object[] objArr6 = {challengeResultTimeout, challengeResultTimeout};
                        Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(i12);
                        if (sDKTransactionID5 == null) {
                            byte b16 = (byte) 0;
                            byte b17 = b16;
                            sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(KeyEvent.keyCodeFromString("") + 1697, (char) ExpandableListView.getPackedPositionGroup(j12), Color.alpha(0) + 29, -1620360563, false, $$c(b16, b17, (byte) (b17 + 5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) sDKTransactionID5).invoke(null, objArr6);
                    }
                    i16 = i12;
                }
            } else {
                int length4 = iArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                char[] cArr5 = new char[length4];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i23 = challengeResultTimeout.getSDKAppID;
                    int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i23 >= i24) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        cArr5[i23] = (char) (cArr[iArr[(i24 - 1) - i23] - i11] - iIntValue);
                        challengeResultTimeout.getSDKAppID = i23 + 1;
                    }
                }
            }
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            if (str != null) {
                $10 = ($11 + 121) % 128;
                charArray = str.toCharArray();
                $11 = ($10 + 23) % 128;
            } else {
                charArray = str;
            }
            atd.bb.completed completedVar = new atd.bb.completed();
            char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKTransactionID ^ 2436480605514729170L, charArray, i11);
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
                    Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKTransactionID)};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                    if (sDKTransactionID2 == null) {
                        int iGreen = Color.green(0) + 2774;
                        char cRgb = (char) ((-16764156) - Color.rgb(0, 0, 0));
                        int scrollDefaultDelay = 25 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b8 = (byte) 0;
                        byte b11 = b8;
                        String str$$c = $$c(b8, b11, b11);
                        Class cls = Long.TYPE;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iGreen, cRgb, scrollDefaultDelay, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                    }
                    sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {completedVar, completedVar};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                    if (sDKTransactionID3 == null) {
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((-16776808) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 30 - (ViewConfiguration.getTouchSlop() >> 8), 144017174, false, "y", new Class[]{Object.class, Object.class});
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [int[], java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v11 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(android.content.Context r25, int r26, int r27) {
            /*
                Method dump skipped, instruction units count: 1096
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultTimeout.getSDKTransactionID.getDeviceData(android.content.Context, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{101, 73, 104, 45};
            $$b = 44;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultTimeout(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
