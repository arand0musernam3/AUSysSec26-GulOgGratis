package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/VibrateWhenRinging;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVibrateWhenRinging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VibrateWhenRinging.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/VibrateWhenRinging\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class timedout extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber AuthenticationRequestParameters;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r5, byte r6, short r7) {
        /*
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r6 = 110 - r6
            byte[] r0 = atd.y.timedout.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            r3 = r6
            if (r0 != 0) goto L17
            r4 = r2
            r6 = r5
            goto L29
        L17:
            r6 = r5
            r5 = r3
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r3 = r0[r6]
        L29:
            int r3 = -r3
            int r5 = r5 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.timedout.$$d(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        BuildConfig = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        getSDKTransactionID();
        new AuthenticationRequestParameters((byte) 0);
        BuildConfig = (getSDKAppID + 63) % 128;
    }

    private timedout(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.AuthenticationRequestParameters = getsdkreferencenumber;
    }

    private static void b(String str, boolean z11, int[] iArr, Object[] objArr) throws Throwable {
        byte b8;
        int i11;
        char c3;
        int i12;
        int i13;
        long j9;
        byte[] bArr;
        int i14;
        String str2 = str;
        Object bytes = str2;
        if (str2 != null) {
            $10 = ($11 + 43) % 128;
            bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr2 = (byte[]) bytes;
        atd.bb.ChallengeResultError challengeResultError = new atd.bb.ChallengeResultError();
        int i15 = 0;
        int i16 = iArr[0];
        int i17 = iArr[1];
        int i18 = iArr[2];
        int i19 = iArr[3];
        char[] cArr = getDeviceData;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            c3 = 3;
            int length = cArr.length;
            i11 = 2;
            char[] cArr2 = new char[length];
            b8 = 1;
            int i21 = 0;
            while (i21 < length) {
                int i22 = $10 + 91;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i21])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                        if (sDKTransactionID == null) {
                            int iResolveSizeAndState = View.resolveSizeAndState(i15, i15, i15) + 2943;
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int mirror = AndroidCharacter.getMirror('0') - 11;
                            bArr = bArr2;
                            byte b11 = (byte) ($$a[1] + 1);
                            byte b12 = (byte) (b11 + 3);
                            i14 = i21;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iResolveSizeAndState, cMyTid, mirror, -258931888, false, $$d(b11, b12, (byte) (b12 - 3)), new Class[]{cls});
                        } else {
                            bArr = bArr2;
                            i14 = i21;
                        }
                        cArr2[i14] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i21 = i14 - 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    bArr = bArr2;
                    int i23 = i21;
                    Object[] objArr3 = {Integer.valueOf(cArr[i23])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                    if (sDKTransactionID2 == null) {
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2943;
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int iIndexOf = TextUtils.indexOf("", "") + 37;
                        byte b13 = (byte) ($$a[1] + 1);
                        byte b14 = (byte) (b13 + 3);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(jumpTapTimeout, cLastIndexOf, iIndexOf, -258931888, false, $$d(b13, b14, (byte) (b14 - 3)), new Class[]{cls});
                    }
                    cArr2[i23] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i21 = i23 + 1;
                }
                bArr2 = bArr;
                i15 = 0;
            }
            cArr = cArr2;
        } else {
            b8 = 1;
            i11 = 2;
            c3 = 3;
        }
        byte[] bArr3 = bArr2;
        char[] cArr3 = new char[i17];
        System.arraycopy(cArr, i16, cArr3, 0, i17);
        if (bArr3 != null) {
            char[] cArr4 = new char[i17];
            challengeResultError.AuthenticationRequestParameters = 0;
            char c7 = 0;
            while (true) {
                int i24 = challengeResultError.AuthenticationRequestParameters;
                if (i24 >= i17) {
                    break;
                }
                byte b15 = b8;
                if (bArr3[i24] == b15) {
                    char c8 = cArr3[i24];
                    Object[] objArr4 = new Object[i11];
                    objArr4[b15] = Integer.valueOf(c7);
                    objArr4[0] = Integer.valueOf(c8);
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
                    if (sDKTransactionID3 == null) {
                        int defaultSize = 3095 - View.getDefaultSize(0, 0);
                        char cMakeMeasureSpec = (char) (14367 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int i25 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17;
                        byte b16 = (byte) ($$a[1] + 1);
                        j9 = 0;
                        byte b17 = (byte) (b16 + 2);
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(defaultSize, cMakeMeasureSpec, i25, -210991631, false, $$d(b16, b17, (byte) (b17 - 2)), new Class[]{cls, cls});
                    } else {
                        j9 = 0;
                    }
                    cArr4[i24] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                } else {
                    j9 = 0;
                    Object[] objArr5 = {Integer.valueOf(cArr3[i24]), Integer.valueOf(c7)};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-565071239);
                    if (sDKTransactionID4 == null) {
                        int iLastIndexOf = 2773 - TextUtils.lastIndexOf("", '0', 0, 0);
                        char c11 = (char) (13060 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int iAlpha = 25 - Color.alpha(0);
                        byte b18 = (byte) ($$a[1] + 1);
                        byte b19 = b18;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iLastIndexOf, c11, iAlpha, 37336169, false, $$d(b18, b19, b19), new Class[]{cls, cls});
                    }
                    cArr4[i24] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                }
                c7 = cArr4[challengeResultError.AuthenticationRequestParameters];
                Object[] objArr6 = {challengeResultError, challengeResultError};
                Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(2107237619);
                if (sDKTransactionID5 == null) {
                    sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf("", "", 0, 0) + 2278, (char) (TextUtils.indexOf("", "", 0) + 65522), (SystemClock.elapsedRealtimeNanos() > j9 ? 1 : (SystemClock.elapsedRealtimeNanos() == j9 ? 0 : -1)) + 33, -1577983261, false, "m", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID5).invoke(null, objArr6);
                i11 = 2;
                b8 = 1;
            }
            cArr3 = cArr4;
        }
        if (i19 > 0) {
            int i26 = $10 + 125;
            $11 = i26 % 128;
            if (i26 % 2 == 0) {
                char[] cArr5 = new char[i17];
                System.arraycopy(cArr3, 1, cArr5, 1, i17);
                System.arraycopy(cArr5, 1, cArr3, i17 / i19, i19);
                System.arraycopy(cArr5, i19, cArr3, 1, i17 % i19);
                i12 = 0;
            } else {
                char[] cArr6 = new char[i17];
                i12 = 0;
                System.arraycopy(cArr3, 0, cArr6, 0, i17);
                int i27 = i17 - i19;
                System.arraycopy(cArr6, 0, cArr3, i27, i19);
                System.arraycopy(cArr6, i19, cArr3, 0, i27);
            }
        } else {
            i12 = 0;
        }
        if (z11) {
            char[] cArr7 = new char[i17];
            challengeResultError.AuthenticationRequestParameters = i12;
            while (true) {
                int i28 = challengeResultError.AuthenticationRequestParameters;
                if (i28 >= i17) {
                    break;
                }
                cArr7[i28] = cArr3[(i17 - i28) - 1];
                challengeResultError.AuthenticationRequestParameters = i28 + 1;
            }
            cArr3 = cArr7;
        }
        if (i18 > 0) {
            $10 = ($11 + 7) % 128;
            challengeResultError.AuthenticationRequestParameters = 0;
            while (true) {
                int i29 = challengeResultError.AuthenticationRequestParameters;
                if (i29 >= i17) {
                    break;
                }
                int i31 = $11 + 59;
                $10 = i31 % 128;
                if (i31 % 2 != 0) {
                    cArr3[i29] = (char) (cArr3[i29] >> iArr[c3]);
                    i13 = i29 - 1;
                } else {
                    cArr3[i29] = (char) (cArr3[i29] - iArr[2]);
                    i13 = i29 + 1;
                }
                challengeResultError.AuthenticationRequestParameters = i13;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void getSDKTransactionID() {
        getDeviceData = new char[]{63473, 63353, 63331, 63358, 63359, 63358, 63356, 63334, 63357, 63353, 63330, 63359, 63330, 63328, 63355, 63357, 63358, 63328, 63357, 63358, 63407, 63414, 63422, 63421};
    }

    public static void init$0() {
        $$a = new byte[]{110, -1, -32, -95};
        $$b = 124;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        int i11 = getSDKTransactionID + 113;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 80) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        b("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", false, new int[]{0, 20, 135, 0}, objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            getSDKTransactionID = (getSDKReferenceNumber + 43) % 128;
            Boolean sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters);
            if (sDKTransactionID != null) {
                getSDKTransactionID = (getSDKReferenceNumber + 41) % 128;
                DeviceParameterResult.Success.BooleanValue booleanValueH = a0.h(sDKTransactionID);
                int i12 = getSDKReferenceNumber + 51;
                getSDKTransactionID = i12 % 128;
                if (i12 % 2 != 0) {
                    return booleanValueH;
                }
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/VibrateWhenRinging$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        public static int AuthenticationRequestParameters;
        public static int getSDKAppID;

        private AuthenticationRequestParameters() {
        }

        public static int getSDKAppID() {
            int i11 = getSDKAppID;
            int i12 = i11 % 6564614;
            getSDKAppID = i11 + 1;
            if (i12 != 0) {
                return AuthenticationRequestParameters;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            AuthenticationRequestParameters = iFreeMemory;
            return iFreeMemory;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ timedout(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
