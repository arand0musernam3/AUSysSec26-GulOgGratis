package atd.w;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/ManufacturerCode;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nManufacturerCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManufacturerCode.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/ManufacturerCode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class ChallengeResultCompleted extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;
    private static int[] getSDKAppID = null;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    static {
        getSDKAppID();
        Process.getThreadPriority(0);
        new getSDKTransactionID((byte) 0);
        int i11 = getDeviceData + 51;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeResultCompleted(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKAppID() {
        getSDKAppID = new int[]{1479457276, -722819798, 143027132, -462482252, 1849347960, -1059047907, -1331113854, -216145127, -637273042, -501000122, -317255562, 637500112, -830222546, -287840777, 1168437598, 1793290977, 414975488, -1318310773};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        AuthenticationRequestParameters = (getSDKTransactionID + 103) % 128;
        if (Build.VERSION.SDK_INT < 29) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult != null) {
            getSDKTransactionID = (AuthenticationRequestParameters + 35) % 128;
            String manufacturerCode = telephonyManagerChallengeResult.getManufacturerCode();
            if (manufacturerCode != null) {
                DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(manufacturerCode));
                getSDKTransactionID = (AuthenticationRequestParameters + 33) % 128;
                return stringValueM164boximpl;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/ManufacturerCode$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static char getDeviceData;
        private static int getMessageVersion;
        private static char getSDKAppID;
        private static int getSDKReferenceNumber;
        private static char getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r6, byte r7, int r8) {
            /*
                int r8 = r8 * 3
                int r8 = 69 - r8
                int r6 = r6 * 2
                int r0 = r6 + 1
                int r7 = r7 + 4
                byte[] r1 = atd.w.ChallengeResultCompleted.getSDKTransactionID.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r1
                r4 = r2
                r1 = r8
                r8 = r7
                goto L2e
            L16:
                r3 = r2
            L17:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L2e:
                int r7 = -r7
                int r7 = r7 + r1
                r1 = r8
                r8 = r7
                r7 = r1
                r1 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeResultCompleted.getSDKTransactionID.$$e(byte, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKReferenceNumber = 0;
            getMessageVersion = 1;
            getSDKAppID = (char) 55623;
            getDeviceData = (char) 20509;
            AuthenticationRequestParameters = (char) 55276;
            getSDKTransactionID = (char) 5805;
        }

        private getSDKTransactionID() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x009a A[PHI: r1 r7 r11 r13 r17
          0x009a: PHI (r1v8 java.lang.reflect.Constructor[]) = (r1v3 java.lang.reflect.Constructor[]), (r1v4 java.lang.reflect.Constructor[]), (r1v9 java.lang.reflect.Constructor[]) binds: [B:16:0x0114, B:91:0x009a, B:9:0x0096] A[DONT_GENERATE, DONT_INLINE]
          0x009a: PHI (r7v58 int) = (r7v0 int), (r7v1 int), (r7v0 int) binds: [B:16:0x0114, B:91:0x009a, B:9:0x0096] A[DONT_GENERATE, DONT_INLINE]
          0x009a: PHI (r11v38 char) = (r11v0 char), (r11v1 char), (r11v0 char) binds: [B:16:0x0114, B:91:0x009a, B:9:0x0096] A[DONT_GENERATE, DONT_INLINE]
          0x009a: PHI (r13v12 char) = (r13v0 char), (r13v1 char), (r13v0 char) binds: [B:16:0x0114, B:91:0x009a, B:9:0x0096] A[DONT_GENERATE, DONT_INLINE]
          0x009a: PHI (r17v3 int) = (r17v0 int), (r17v1 int), (r17v6 int) binds: [B:16:0x0114, B:91:0x009a, B:9:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0116 A[PHI: r1 r17 r18
          0x0116: PHI (r1v4 java.lang.reflect.Constructor[]) = (r1v3 java.lang.reflect.Constructor[]), (r1v9 java.lang.reflect.Constructor[]) binds: [B:16:0x0114, B:9:0x0096] A[DONT_GENERATE, DONT_INLINE]
          0x0116: PHI (r17v1 int) = (r17v0 int), (r17v6 int) binds: [B:16:0x0114, B:9:0x0096] A[DONT_GENERATE, DONT_INLINE]
          0x0116: PHI (r18v1 long) = (r18v0 long), (r18v3 long) binds: [B:16:0x0114, B:9:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x026c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int AuthenticationRequestParameters(java.util.List r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1389
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeResultCompleted.getSDKTransactionID.AuthenticationRequestParameters(java.util.List):int");
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            int i13;
            int i14;
            char c3;
            $10 = ($11 + 107) % 128;
            if (str != null) {
                charArray = str.toCharArray();
                $10 = ($11 + 113) % 128;
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
            char[] cArr2 = new char[cArr.length];
            int i15 = 0;
            challengeResultCompleted.getDeviceData = 0;
            int i16 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i17 = challengeResultCompleted.getDeviceData;
                if (i17 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i11);
                    return;
                }
                cArr3[i15] = cArr[i17];
                char c7 = 1;
                cArr3[1] = cArr[i17 + 1];
                int i18 = 58224;
                int i19 = i15;
                while (i19 < 16) {
                    $10 = ($11 + 95) % 128;
                    char c8 = cArr3[c7];
                    char c11 = cArr3[i15];
                    char c12 = c7;
                    int i21 = (c11 + i18) ^ ((c11 << 4) + ((char) (((long) AuthenticationRequestParameters) ^ 5320350835299930193L)));
                    int i22 = c11 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKTransactionID);
                        objArr2[i16] = Integer.valueOf(i22);
                        objArr2[c12] = Integer.valueOf(i21);
                        objArr2[i15] = Integer.valueOf(c8);
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                        Class cls = Integer.TYPE;
                        if (sDKTransactionID == null) {
                            i14 = 906025703;
                            c3 = 3;
                            byte b8 = (byte) i15;
                            i13 = i16;
                            byte b11 = (byte) (b8 - 1);
                            i12 = i15;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2828 - ExpandableListView.getPackedPositionType(0L), (char) View.getDefaultSize(i15, i15), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27, -362226441, false, $$e(b8, b11, (byte) (-b11)), new Class[]{cls, cls, cls, cls});
                        } else {
                            i12 = i15;
                            i13 = i16;
                            i14 = 906025703;
                            c3 = 3;
                        }
                        char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        cArr3[c12] = cCharValue;
                        char c13 = cArr3[i12];
                        int i23 = (cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) getSDKAppID) ^ 5320350835299930193L)));
                        int i24 = cCharValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[c3] = Integer.valueOf(getDeviceData);
                        objArr3[i13] = Integer.valueOf(i24);
                        objArr3[c12] = Integer.valueOf(i23);
                        objArr3[i12] = Integer.valueOf(c13);
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                        if (sDKTransactionID2 == null) {
                            int threadPriority = ((Process.getThreadPriority(i12) + 20) >> 6) + 2828;
                            int i25 = i12;
                            char cResolveOpacity = (char) Drawable.resolveOpacity(i25, i25);
                            int iMakeMeasureSpec = 27 - View.MeasureSpec.makeMeasureSpec(i25, i25);
                            byte b12 = (byte) i25;
                            byte b13 = (byte) (b12 - 1);
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(threadPriority, cResolveOpacity, iMakeMeasureSpec, -362226441, false, $$e(b12, b13, (byte) (-b13)), new Class[]{cls, cls, cls, cls});
                        }
                        cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                        i18 -= 40503;
                        i19++;
                        $10 = ($11 + 13) % 128;
                        c7 = c12;
                        i16 = i13;
                        i15 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                int i26 = i16;
                char c14 = c7;
                int i27 = challengeResultCompleted.getDeviceData;
                cArr2[i27] = cArr3[0];
                cArr2[i27 + 1] = cArr3[c14];
                Object[] objArr4 = new Object[i26];
                objArr4[c14] = challengeResultCompleted;
                objArr4[0] = challengeResultCompleted;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollBarSize() >> 8) + 3156, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 25798), 27 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1296942946, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i16 = i26;
                i15 = 0;
            }
        }

        private static void b(int i11, int i12, short s7, Object[] objArr) {
            byte[] bArr = $$a;
            int i13 = 122 - i12;
            int i14 = 25 - i11;
            byte[] bArr2 = new byte[19 - s7];
            int i15 = 18 - s7;
            int i16 = -1;
            if (bArr == null) {
                i14++;
                i13 = (i13 + (-i14)) - 11;
            }
            while (true) {
                i16++;
                bArr2[i16] = (byte) i13;
                if (i16 == i15) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b8 = bArr[i14];
                    i14++;
                    i13 = (i13 + (-b8)) - 11;
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{ByteCompanionObject.MAX_VALUE, 102, 3, -17, -9, -26, 22, 4, -18, -20, -41, 6, -24, -16, 7, -13, -28, 0, -17, -10, 26, -6, 32, -34, 41, -12, -6, -12};
            $$b = 57;
        }

        public static void init$1() {
            $$c = new byte[]{94, 121, 122, 56};
            $$d = 104;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }
}
