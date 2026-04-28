package atd.k;

import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DeviceModel;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r6, byte r7, int r8) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r7 = 110 - r7
            byte[] r1 = atd.k.getSDKEphemeralPublicKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = r7 + r8
            r8 = r1
            r1 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.getSDKEphemeralPublicKey.$$d(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getDeviceData = 1;
        getSDKTransactionID = 0;
        AuthenticationRequestParameters = 1;
        AuthenticationRequestParameters();
        new getSDKAppID((byte) 0);
        getDeviceData = (getSDKAppID + 33) % 128;
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new char[]{63409, 63475, 63397, 63429, 63438, 63437};
    }

    private static void b(String str, boolean z11, int[] iArr, Object[] objArr) throws Throwable {
        int i11;
        byte[] bArr;
        String str2 = str;
        $11 = ($10 + 43) % 128;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr2 = (byte[]) bytes;
        atd.bb.ChallengeResultError challengeResultError = new atd.bb.ChallengeResultError();
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char[] cArr = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                    if (sDKTransactionID == null) {
                        bArr = bArr2;
                        byte b8 = (byte) 0;
                        byte b11 = (byte) (b8 + 3);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", '0') + 2944, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), TextUtils.lastIndexOf("", '0', 0) + 38, -258931888, false, $$d(b8, b11, (byte) (b11 - 4)), new Class[]{cls});
                    } else {
                        bArr = bArr2;
                    }
                    cArr2[i16] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i16++;
                    bArr2 = bArr;
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
        byte[] bArr3 = bArr2;
        char[] cArr3 = new char[i13];
        System.arraycopy(cArr, i12, cArr3, 0, i13);
        if (bArr3 != null) {
            char[] cArr4 = new char[i13];
            challengeResultError.AuthenticationRequestParameters = 0;
            char c3 = 0;
            while (true) {
                int i17 = challengeResultError.AuthenticationRequestParameters;
                if (i17 >= i13) {
                    break;
                }
                if (bArr3[i17] == 1) {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i17]), Integer.valueOf(c3)};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 2);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3095 - TextUtils.indexOf("", "", 0, 0), (char) (TextUtils.indexOf("", "", 0) + 14367), Process.getGidForName("") + 19, -210991631, false, $$d(b12, b13, (byte) (b13 - 3)), new Class[]{cls, cls});
                    }
                    cArr4[i17] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i17]), Integer.valueOf(c3)};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-565071239);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((Process.myPid() >> 22) + 2774, (char) (13060 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.getOffsetAfter("", 0) + 25, 37336169, false, $$d(b14, b15, (byte) (b15 - 1)), new Class[]{cls, cls});
                    }
                    cArr4[i17] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[challengeResultError.AuthenticationRequestParameters];
                Object[] objArr5 = {challengeResultError, challengeResultError};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(2107237619);
                if (sDKTransactionID4 == null) {
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2278 - Color.argb(0, 0, 0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 65523), 34 - KeyEvent.normalizeMetaState(0), -1577983261, false, "m", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i15 > 0) {
            int i18 = $10 + 29;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                char[] cArr5 = new char[i13];
                i11 = 0;
                System.arraycopy(cArr3, 1, cArr5, 0, i13);
                System.arraycopy(cArr5, 0, cArr3, i13 << i15, i15);
                System.arraycopy(cArr5, i15, cArr3, 1, i13 + i15);
            } else {
                i11 = 0;
                char[] cArr6 = new char[i13];
                System.arraycopy(cArr3, 0, cArr6, 0, i13);
                int i19 = i13 - i15;
                System.arraycopy(cArr6, 0, cArr3, i19, i15);
                System.arraycopy(cArr6, i15, cArr3, 0, i19);
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            $10 = ($11 + 89) % 128;
            char[] cArr7 = new char[i13];
            challengeResultError.AuthenticationRequestParameters = i11;
            while (true) {
                int i21 = challengeResultError.AuthenticationRequestParameters;
                if (i21 >= i13) {
                    break;
                }
                cArr7[i21] = cArr3[(i13 - i21) - 1];
                challengeResultError.AuthenticationRequestParameters = i21 + 1;
            }
            cArr3 = cArr7;
        }
        if (i14 > 0) {
            $11 = ($10 + 95) % 128;
            challengeResultError.AuthenticationRequestParameters = 0;
            while (true) {
                int i22 = challengeResultError.AuthenticationRequestParameters;
                if (i22 >= i13) {
                    break;
                }
                $11 = ($10 + 93) % 128;
                cArr3[i22] = (char) (cArr3[i22] - iArr[2]);
                challengeResultError.AuthenticationRequestParameters = i22 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @NotNull
    private static String getSDKAppID() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.MANUFACTURER);
        Object[] objArr = new Object[1];
        b("\u0000\u0000", false, new int[]{0, 2, 0, 1}, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(Build.MODEL);
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(sb2.toString());
        getSDKTransactionID = (AuthenticationRequestParameters + 93) % 128;
        return strM165constructorimpl;
    }

    public static void init$0() {
        $$a = new byte[]{126, -64, 93, -48};
        $$b = 120;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        int i11 = AuthenticationRequestParameters + 75;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return DeviceParameterResult.Success.StringValue.m164boximpl(getSDKAppID());
        }
        int i12 = 37 / 0;
        return DeviceParameterResult.Success.StringValue.m164boximpl(getSDKAppID());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DeviceModel$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
