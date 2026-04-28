package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Ringtone;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRingtone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ringtone.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Ringtone\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class ChallengeResultCompleted extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r5, byte r6, short r7) {
        /*
            byte[] r0 = atd.y.ChallengeResultCompleted.$$a
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r7 = r7 + 68
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r7 = r6
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResultCompleted.$$d(int, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResult = 1;
        getSDKAppID = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID();
        View.MeasureSpec.getMode(0);
        Process.myPid();
        new getSDKTransactionID((byte) 0);
        int i11 = BuildConfig + 61;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private ChallengeResultCompleted(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    private static void b(int i11, String str, String str2, char c3, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        float f11;
        int i13;
        int i14;
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $11 = ($10 + 35) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.onCompletion oncompletion = new atd.bb.onCompletion();
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int length2 = charArray2.length;
        char[] cArr3 = new char[length2];
        int i15 = 0;
        System.arraycopy(cArr, 0, cArr2, 0, length);
        System.arraycopy(charArray2, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c3);
        int i16 = 2;
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $11 = ($10 + 53) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) i15;
                    byte b11 = b8;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getTapTimeout() >> 16) + 2069, (char) (44657 - View.getDefaultSize(i15, i15)), 32 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -397560981, false, $$d(b8, b11, (byte) (b11 | 49)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) i15;
                    f11 = 0.0f;
                    byte b13 = b12;
                    i12 = i16;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3095, (char) ((TypedValue.complexToFraction(i15, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i15, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14367), 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1211924053, false, $$d(b12, b13, (byte) (b13 | 50)), new Class[]{Object.class});
                } else {
                    i12 = i16;
                    f11 = 0.0f;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i17 = cArr2[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr3[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i15] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) i15;
                    i14 = i15;
                    byte b15 = b14;
                    i13 = iIntValue2;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf((CharSequence) "", '0', i15, i15) + 1429, (char) View.resolveSizeAndState(i15, i15, i15), 30 - (Process.myTid() >> 22), -1183253656, false, $$d(b14, b15, (byte) (b15 | 51)), new Class[]{Object.class, cls, cls});
                } else {
                    i13 = iIntValue2;
                    i14 = i15;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i18 = cArr2[i13] * 32718;
                int i19 = i12;
                Object[] objArr5 = new Object[i19];
                objArr5[1] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[i14] = Integer.valueOf(i18);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    int i21 = i14;
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2773 - (ExpandableListView.getPackedPositionForChild(i21, i21) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i21, i21) == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 13061), (AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)) + 25, -320602145, false, $$d(b16, b17, b17), new Class[]{cls, cls});
                }
                cArr3[i13] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr2[i13] = oncompletion.AuthenticationRequestParameters;
                int i22 = oncompletion.getDeviceData;
                cArr4[i22] = (char) (((((long) (r0 ^ charArray3[i22])) ^ (getSDKReferenceNumber ^ 1905653906042338631L)) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKTransactionID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i22 + 1;
                i16 = i19;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static void getSDKAppID() {
        getSDKReferenceNumber = 1905653906042338631L;
        AuthenticationRequestParameters = -2038612665;
        getSDKTransactionID = (char) 27982;
    }

    public static void init$0() {
        $$a = new byte[]{33, -9, 12, -125};
        $$b = 149;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        ChallengeResultCancelled = (getSDKAppID + 65) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getDeviceData;
        Object[] objArr = new Object[1];
        b(Color.red(0), "ḅ\ue986\ue887⚷", "\ue279믝죓奾ຠ膕\ue570␂", (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "\u0000\u0000\u0000\u0000", objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getSDKAppID = (ChallengeResultCancelled + 105) % 128;
        return failure;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Ringtone$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        public static int getSDKAppID;
        public static int getSDKReferenceNumber;

        private getSDKTransactionID() {
        }

        public static int getSDKReferenceNumber() {
            int i11 = getSDKAppID;
            int i12 = i11 % 7548812;
            getSDKAppID = i11 + 1;
            if (i12 != 0) {
                return getSDKReferenceNumber;
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            getSDKReferenceNumber = iUptimeMillis;
            return iUptimeMillis;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultCompleted(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
