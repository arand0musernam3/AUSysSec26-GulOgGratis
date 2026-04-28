package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n*\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriberId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "subscriberId", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriberId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriberId.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriberId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class InitializeResult extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static int ChallengeResultCancelled = 1;
    private static char getDeviceData;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        getSDKAppID();
        TextUtils.getTrimmedLength("");
        new AuthenticationRequestParameters((byte) 0);
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 73) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeResult(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    private static String getSDKAppID(TelephonyManager telephonyManager) {
        int i11 = AuthenticationRequestParameters + 13;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            return telephonyManager.getSubscriberId();
        }
        telephonyManager.getSubscriberId();
        throw null;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        String sDKAppID;
        AuthenticationRequestParameters = (BuildConfig + 89) % 128;
        try {
            TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
            if (telephonyManagerChallengeResult == null || (sDKAppID = getSDKAppID(telephonyManagerChallengeResult)) == null) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            }
            AuthenticationRequestParameters = (BuildConfig + 95) % 128;
            return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(sDKAppID));
        } catch (SecurityException unused) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriberId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getDeviceData;
        private static int getSDKReferenceNumber;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(int r6, byte r7, byte r8) {
            /*
                int r6 = r6 * 2
                int r6 = r6 + 98
                int r7 = r7 * 4
                int r0 = r7 + 1
                byte[] r1 = atd.w.InitializeResult.AuthenticationRequestParameters.$$c
                int r8 = r8 * 4
                int r8 = 4 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L18
                r6 = r7
                r3 = r1
                r4 = r2
                r1 = r8
                goto L2d
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r1
                r1 = r8
                r8 = r4
                r4 = r3
                r3 = r5
            L2d:
                int r6 = r6 + r8
                int r8 = r1 + 1
                r1 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.InitializeResult.AuthenticationRequestParameters.$$e(int, byte, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            AuthenticationRequestParameters = 1;
            getSDKReferenceNumber = 711855196;
        }

        private AuthenticationRequestParameters() {
        }

        public static void AuthenticationRequestParameters(long j9, long j11) throws Throwable {
            byte[] bArr = $$a;
            byte b8 = bArr[28];
            byte b11 = (byte) (b8 + 1);
            Object[] objArr = new Object[1];
            a(b8, b11, b11, objArr);
            a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
            AuthenticationRequestParameters = (getDeviceData + 27) % 128;
            try {
                byte b12 = bArr[28];
                byte b13 = (byte) (b12 + 1);
                Object[] objArr2 = new Object[1];
                a(b12, b13, b13, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b14 = bArr[28];
                byte b15 = (byte) (b14 + 1);
                byte b16 = b14;
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Method method = cls.getMethod((String) objArr3[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr4 = {atd.as.BuildConfig.class.getField("getDeviceData").get(null)};
                Object[] objArr5 = new Object[1];
                b(true, 254 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0001\ufffe\u0001", 3 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 3 - View.resolveSizeAndState(0, 0, 0), objArr5);
                Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
                method2.setAccessible(true);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.w.InitializeResult.AuthenticationRequestParameters.$$a
                int r6 = r6 * 15
                int r1 = 26 - r6
                int r8 = r8 * 25
                int r8 = 28 - r8
                int r7 = r7 * 6
                int r7 = 103 - r7
                byte[] r1 = new byte[r1]
                int r6 = 25 - r6
                r2 = 0
                if (r0 != 0) goto L1a
                r7 = r6
                r3 = r0
                r4 = r2
                r0 = r8
                goto L32
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                int r8 = r8 + 1
                r3 = r0[r8]
                r5 = r0
                r0 = r8
                r8 = r3
                r3 = r5
            L32:
                int r8 = -r8
                int r7 = r7 + r8
                int r7 = r7 + (-5)
                r8 = r0
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.InitializeResult.AuthenticationRequestParameters.a(short, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(boolean r24, int r25, java.lang.String r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 371
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.InitializeResult.AuthenticationRequestParameters.b(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
        }

        public static void getSDKAppID(long j9, long j11) throws Throwable {
            AuthenticationRequestParameters = (getDeviceData + 83) % 128;
            byte[] bArr = $$a;
            byte b8 = bArr[28];
            byte b11 = (byte) (b8 + 1);
            Object[] objArr = new Object[1];
            a(b8, b11, b11, objArr);
            a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
            AuthenticationRequestParameters = (getDeviceData + 105) % 128;
            try {
                byte b12 = bArr[28];
                byte b13 = (byte) (b12 + 1);
                Object[] objArr2 = new Object[1];
                a(b12, b13, b13, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b14 = bArr[28];
                byte b15 = (byte) (b14 + 1);
                byte b16 = b14;
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Method method = cls.getMethod((String) objArr3[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr4 = {atd.as.getDeviceData.class.getField("getSDKTransactionID").get(null)};
                Object[] objArr5 = new Object[1];
                b(true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 254, "\u0001\ufffe\u0001", 1 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (Process.myTid() >> 22) + 3, objArr5);
                Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
                method2.setAccessible(true);
                AuthenticationRequestParameters = (getDeviceData + 101) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        public static void init$0() {
            $$a = new byte[]{76, -58, -49, 5, -24, 11, 49, -56, -22, 63, -62, -3, -20, 28, 10, -12, -14, -35, 12, -18, -10, 13, -7, -22, 6, -11, -4, 32, 0, -3, -20, 28, 10, -12, 5, -52, -5, 34, 0};
            $$b = 92;
        }

        public static void init$1() {
            $$c = new byte[]{6, -26, -55, -87};
            $$d = BERTags.FLAGS;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public static void getSDKAppID() {
        getDeviceData = (char) 42542;
        getSDKAppID = (char) 37852;
        getSDKReferenceNumber = (char) 61283;
        getSDKTransactionID = (char) 18084;
    }
}
