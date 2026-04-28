package atd.p;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/TransitionAnimationScale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransitionAnimationScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionAnimationScale.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/TransitionAnimationScale\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class ChallengeResultTimeout extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getMessageVersion;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    private static String $$d(short s7, short s8, byte b8) {
        int i11 = (s8 * 3) + 4;
        int i12 = b8 + 103;
        int i13 = s7 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i13];
        int i14 = 0 - i13;
        int i15 = -1;
        if (bArr == null) {
            i11++;
            i12 = i14 + i12;
        }
        while (true) {
            i15++;
            bArr2[i15] = (byte) i12;
            if (i15 == i14) {
                return new String(bArr2, 0);
            }
            byte b11 = bArr[i11];
            i11++;
            i12 += b11;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        BuildConfig = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        getSDKAppID();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        Color.alpha(0);
        AudioTrack.getMinVolume();
        new getSDKReferenceNumber((byte) 0);
        BuildConfig = (getMessageVersion + 91) % 128;
    }

    private ChallengeResultTimeout(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r32, int r33, int r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResultTimeout.b(char, int, int, java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = new char[]{62586, 11559, 18137, 30833, 37137, 51872, 60504, 1306, 16057, 20563, 35295, 41606, 50212, 65016, 5785, 18490, 25034, 39788, 48135, 54689, 3917, 8202, 22975, 29506, 38122, 52616, 62543, 11621, 18049, 30763};
        getSDKAppID = -4110822326543700651L;
    }

    public static void init$0() {
        $$a = new byte[]{101, -112, -32, 38};
        $$b = 82;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getDeviceData;
        Object[] objArr = new Object[1];
        b((char) TextUtils.getTrimmedLength(""), 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Color.alpha(0), objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            getSDKReferenceNumber = (getSDKTransactionID + 109) % 128;
            Float fG = x.g(strAuthenticationRequestParameters);
            if (fG != null) {
                int i11 = getSDKTransactionID + 121;
                getSDKReferenceNumber = i11 % 128;
                if (i11 % 2 != 0) {
                    return DeviceParameterResult.Success.FloatValue.m143boximpl(DeviceParameterResult.Success.FloatValue.m144constructorimpl(fG.floatValue()));
                }
                DeviceParameterResult.Success.FloatValue.m143boximpl(DeviceParameterResult.Success.FloatValue.m144constructorimpl(fG.floatValue()));
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/TransitionAnimationScale$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        public static int AuthenticationRequestParameters;
        public static int getSDKTransactionID;

        private getSDKReferenceNumber() {
        }

        public static int getSDKTransactionID() {
            int i11 = getSDKTransactionID;
            int i12 = i11 % 9434125;
            getSDKTransactionID = i11 + 1;
            if (i12 != 0) {
                return AuthenticationRequestParameters;
            }
            int iMyPid = Process.myPid();
            AuthenticationRequestParameters = iMyPid;
            return iMyPid;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultTimeout(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
