package atd.k;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/SdkVersion;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class timedout extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r7, short r8, byte r9) {
        /*
            byte[] r0 = atd.k.timedout.$$a
            int r9 = 122 - r9
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r0
            r4 = r2
            r0 = r7
            goto L29
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L29:
            int r9 = -r9
            int r9 = r9 + r0
            r0 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.timedout.$$d(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        BuildConfig = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getKeyRepeatDelay();
        new getSDKAppID((byte) 0);
        BuildConfig = (getSDKTransactionID + 83) % 128;
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{19805, 19806, 30964, 30963, 30853, 30952, 30966, 30967, 30960};
        AuthenticationRequestParameters = (char) 19807;
    }

    private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        int i14;
        char c3;
        char c7;
        char c8;
        int i15;
        int i16;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
        char[] cArr = getDeviceData;
        Class cls = Integer.TYPE;
        int i17 = -317146529;
        int i18 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i19])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID == null) {
                        byte b11 = (byte) i18;
                        i16 = i17;
                        byte b12 = (byte) (b11 - 1);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2158 - View.resolveSize(i18, i18), (char) ExpandableListView.getPackedPositionType(0L), 36 - View.MeasureSpec.getMode(i18), 829471823, false, $$d(b11, b12, (byte) (b12 & 57)), new Class[]{cls});
                    } else {
                        i16 = i17;
                    }
                    cArr2[i19] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i19++;
                    i17 = i16;
                    i18 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i12 = i17;
            $10 = ($11 + 49) % 128;
            cArr = cArr2;
        } else {
            i12 = -317146529;
        }
        Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i12);
        if (sDKTransactionID2 == null) {
            byte b13 = (byte) 0;
            byte b14 = (byte) (b13 - 1);
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", '0') + 2159, (char) View.MeasureSpec.makeMeasureSpec(0, 0), Color.rgb(0, 0, 0) + 16777252, 829471823, false, $$d(b13, b14, (byte) (b14 & 57)), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            $11 = ($10 + 91) % 128;
            i13 = i11 - 1;
            cArr3[i13] = (char) (charArray[i13] - b8);
        } else {
            i13 = i11;
        }
        int i21 = 1;
        if (i13 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i22 = challengeResultKt.getSDKReferenceNumber;
                if (i22 >= i13) {
                    break;
                }
                int i23 = ($11 + 33) % 128;
                $10 = i23;
                char c11 = charArray[i22];
                challengeResultKt.getDeviceData = c11;
                char c12 = charArray[i22 + 1];
                challengeResultKt.getSDKAppID = c12;
                if (c11 == c12) {
                    $11 = (i23 + 25) % 128;
                    cArr3[i22] = (char) (c11 - b8);
                    cArr3[i22 + 1] = (char) (c12 - b8);
                    i15 = i21;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[6] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[3] = challengeResultKt;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i21] = challengeResultKt;
                    objArr4[0] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c3 = '\t';
                        int iIndexOf = 1258 - TextUtils.indexOf("", "");
                        c7 = 2;
                        char cGreen = (char) (34414 - Color.green(0));
                        int i24 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 41;
                        c8 = 7;
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 - 1);
                        i14 = i21;
                        String str$$d = $$d(b15, b16, (byte) (b16 & 55));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iIndexOf, cGreen, i24, -307955329, false, str$$d, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i14 = i21;
                        c3 = '\t';
                        c7 = 2;
                        c8 = 7;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i25 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i25) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = challengeResultKt;
                        objArr5[c3] = Integer.valueOf(cCharValue);
                        objArr5[8] = challengeResultKt;
                        objArr5[c8] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c7] = Integer.valueOf(cCharValue);
                        objArr5[i14] = challengeResultKt;
                        objArr5[0] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int i26 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2222;
                            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 53070);
                            int iAlpha = 21 - Color.alpha(0);
                            byte b17 = (byte) 0;
                            byte b18 = (byte) (b17 - 1);
                            String str$$d2 = $$d(b17, b18, (byte) (b18 + 1));
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(i26, deadChar, iAlpha, 246098488, false, str$$d2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i27 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i28 = challengeResultKt.getSDKReferenceNumber;
                        cArr3[i28] = cArr[iIntValue2];
                        cArr3[i28 + 1] = cArr[i27];
                        i15 = i14;
                    } else {
                        int i29 = challengeResultKt.AuthenticationRequestParameters;
                        int i31 = challengeResultKt.getSDKTransactionID;
                        int i32 = challengeResultKt.getMessageVersion;
                        if (i29 == i31) {
                            i15 = i14;
                            int iC = k.c(i32, cCharValue, i15, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i25, cCharValue, i15, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i33 = (i31 * cCharValue) + iC2;
                            int i34 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i34] = cArr[(i29 * cCharValue) + iC];
                            cArr3[i34 + i15] = cArr[i33];
                        } else {
                            i15 = i14;
                            int i35 = (i29 * cCharValue) + i25;
                            int i36 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i36] = cArr[i35];
                            cArr3[i36 + i15] = cArr[(i31 * cCharValue) + i32];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                i21 = i15;
            }
        }
        for (int i37 = 0; i37 < i11; i37++) {
            cArr3[i37] = (char) (cArr3[i37] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    @NotNull
    private static String getSDKTransactionID() throws Throwable {
        Object obj;
        int i11 = getSDKAppID + 75;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            b(4 >>> TextUtils.indexOf((CharSequence) "", 'D', 0), (byte) (85 % (ViewConfiguration.getTapTimeout() + 51)), "\u0005\b\u0005\b\u0005\u0002", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            b(5 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (111 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0005\b\u0005\b\u0005\u0002", objArr2);
            obj = objArr2[0];
        }
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(((String) obj).intern());
        int i12 = getSDKReferenceNumber + 71;
        getSDKAppID = i12 % 128;
        if (i12 % 2 != 0) {
            return strM165constructorimpl;
        }
        throw null;
    }

    public static void init$0() {
        $$a = new byte[]{11, -110, -81, 44};
        $$b = 184;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getSDKReferenceNumber = (getSDKAppID + 113) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(getSDKTransactionID());
        getSDKAppID = (getSDKReferenceNumber + 119) % 128;
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/SdkVersion$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
