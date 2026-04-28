package atd.k;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/OsName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOsName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OsName.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/common/OsName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class ChallengeResultError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static boolean getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = r8 + 111
            byte[] r0 = atd.k.ChallengeResultError.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r8 = r6
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r0
            r0 = r8
            r8 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultError.$$d(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        new getDeviceData((byte) 0);
        getMessageVersion = (getSDKEphemeralPublicKey + 111) % 128;
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new char[]{21679, 21752, 21746, 21756, 21753, 21751, 21646, 21683, 21757, 21726, 21719, 21677, 21694, 21693};
        getSDKTransactionID = 1286296686;
        getDeviceData = true;
        getSDKAppID = true;
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] cArr;
        int i12;
        int i13;
        int i14;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            $10 = ($11 + 75) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr2 = charArray;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr3 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        int i15 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            $11 = ($10 + 91) % 128;
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i16])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int doubleTapTimeout = 2555 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        char packedPositionChild = (char) (48597 - ExpandableListView.getPackedPositionChild(0L));
                        int absoluteGravity = 31 - Gravity.getAbsoluteGravity(i15, i15);
                        i14 = i15;
                        byte b8 = (byte) ($$a[3] + 1);
                        byte b11 = (byte) (b8 + 1);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(doubleTapTimeout, packedPositionChild, absoluteGravity, -390605202, false, $$d(b8, b11, b11), new Class[]{cls});
                    } else {
                        i14 = i15;
                    }
                    cArr4[i16] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i16++;
                    i15 = i14;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        int i17 = i15;
        Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(147 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i17) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i17) == 0.0d ? 0 : -1)), 32 - ((Process.getThreadPriority(i17) + 20) >> 6), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i18 = 1124287645;
        if (getSDKAppID) {
            int i19 = $11 + 49;
            $10 = i19 % 128;
            if (i19 % 2 != 0) {
                int length2 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length2;
                cArr = new char[length2];
                i12 = 1;
            } else {
                int length3 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                cArr = new char[length3];
                i12 = i17;
            }
            challengeResultTimeout.getSDKAppID = i12;
            while (true) {
                int i21 = challengeResultTimeout.getSDKAppID;
                int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i21] = (char) (cArr3[bArr[(i22 - 1) - i21] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i18);
                if (sDKTransactionID3 == null) {
                    int iCombineMeasuredStates = 1697 - View.combineMeasuredStates(0, 0);
                    char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iResolveOpacity = 29 - Drawable.resolveOpacity(0, 0);
                    byte b12 = (byte) ($$a[3] + 1);
                    byte b13 = (byte) (b12 + 1);
                    i13 = i18;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iCombineMeasuredStates, c3, iResolveOpacity, -1620360563, false, $$d(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                } else {
                    i13 = i18;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                $11 = ($10 + 45) % 128;
                i18 = i13;
            }
        } else if (getDeviceData) {
            $11 = ($10 + 23) % 128;
            int length4 = cArr2.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr5 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i23 = challengeResultTimeout.getSDKAppID;
                int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i23] = (char) (cArr3[cArr2[(i24 - 1) - i23] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    int trimmedLength = TextUtils.getTrimmedLength("") + 29;
                    byte b14 = (byte) ($$a[3] + 1);
                    byte b15 = (byte) (b14 + 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf("", "", 0) + 1697, (char) (AndroidCharacter.getMirror('0') - '0'), trimmedLength, -1620360563, false, $$d(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
        } else {
            int i25 = 0;
            int length5 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length5;
            char[] cArr6 = new char[length5];
            while (true) {
                challengeResultTimeout.getSDKAppID = i25;
                int i26 = challengeResultTimeout.getSDKAppID;
                int i27 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i26 >= i27) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    $10 = ($11 + 1) % 128;
                    cArr6[i26] = (char) (cArr3[iArr[(i27 - 1) - i26] - i11] - iIntValue);
                    i25 = i26 + 1;
                }
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{5, 67, -107, -2};
        $$b = 153;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[PHI: r7
      0x0032: PHI (r7v6 java.lang.reflect.Field) = (r7v5 java.lang.reflect.Field), (r7v9 java.lang.reflect.Field) binds: [B:11:0x0030, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[PHI: r7
      0x003c: PHI (r7v8 java.lang.reflect.Field) = (r7v5 java.lang.reflect.Field), (r7v9 java.lang.reflect.Field) binds: [B:11:0x0030, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Class<android.os.Build$VERSION_CODES> r1 = android.os.Build.VERSION_CODES.class
            java.lang.reflect.Field[] r1 = r1.getFields()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Le:
            r5 = 1
            r6 = 0
            if (r4 >= r2) goto L42
            int r7 = atd.k.ChallengeResultError.BuildConfig
            int r7 = r7 + 121
            int r8 = r7 % 128
            atd.k.ChallengeResultError.AuthenticationRequestParameters = r8
            int r7 = r7 % 2
            if (r7 == 0) goto L2a
            r7 = r1[r4]
            int r8 = r7.getInt(r6)
            r9 = 94
            int r9 = r9 / r3
            if (r8 != r0) goto L3c
            goto L32
        L2a:
            r7 = r1[r4]
            int r8 = r7.getInt(r6)
            if (r8 != r0) goto L3c
        L32:
            int r8 = atd.k.ChallengeResultError.AuthenticationRequestParameters
            int r8 = r8 + 33
            int r8 = r8 % 128
            atd.k.ChallengeResultError.BuildConfig = r8
            r8 = r5
            goto L3d
        L3c:
            r8 = r3
        L3d:
            if (r8 != 0) goto L43
            int r4 = r4 + 1
            goto Le
        L42:
            r7 = r6
        L43:
            if (r7 == 0) goto L4a
            java.lang.String r1 = r7.getName()
            goto L4b
        L4a:
            r1 = r6
        L4b:
            if (r1 == 0) goto L91
            int r2 = r1.length()
            if (r2 != 0) goto L54
            goto L91
        L54:
            int r2 = atd.k.ChallengeResultError.BuildConfig
            int r2 = r2 + 9
            int r2 = r2 % 128
            atd.k.ChallengeResultError.AuthenticationRequestParameters = r2
            kotlin.jvm.internal.StringCompanionObject r2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            int r2 = android.view.ViewConfiguration.getPressedStateDuration()
            int r2 = r2 >> 16
            int r2 = r2 + 127
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r5 = "\u0083\u0088\u0087\u008b\u008a\u0081\u0087\u0089\u0088\u0087\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081"
            b(r6, r6, r2, r5, r4)
            r2 = r4[r3]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r3, r0}
            r1 = 3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        L91:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultError.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/OsName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        public static int getSDKAppID;
        public static int getSDKReferenceNumber;

        private getDeviceData() {
        }

        public static int getSDKReferenceNumber() {
            int i11 = getSDKAppID;
            int i12 = i11 % 6407211;
            getSDKAppID = i11 + 1;
            if (i12 != 0) {
                return getSDKReferenceNumber;
            }
            int i13 = (int) Runtime.getRuntime().totalMemory();
            getSDKReferenceNumber = i13;
            return i13;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
