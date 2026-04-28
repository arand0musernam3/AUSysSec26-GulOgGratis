package atd.k;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DateTime;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Ljava/util/Calendar;", "calendar", "<init>", "(Ljava/util/Calendar;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Ljava/util/Calendar;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final Calendar getDeviceData;

    private static String $$d(short s7, int i11, short s8) {
        byte[] bArr = $$a;
        int i12 = s7 * 2;
        int i13 = (s8 * 2) + 4;
        int i14 = (i11 * 2) + 98;
        byte[] bArr2 = new byte[i12 + 1];
        int i15 = -1;
        if (bArr == null) {
            i13++;
            i14 = i13 + (-i12);
        }
        while (true) {
            int i16 = i13;
            int i17 = i14;
            i15++;
            bArr2[i15] = (byte) i17;
            if (i15 == i12) {
                return new String(bArr2, 0);
            }
            i13 = i16 + 1;
            i14 = i17 + (-bArr[i16]);
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        getSDKAppID();
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getScrollFriction();
        new getSDKAppID((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 109;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 17 / 0;
        }
    }

    private getSDKTransactionID(@NotNull Calendar calendar) {
        calendar.getClass();
        this.getDeviceData = calendar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r24, int r25, java.lang.String r26, int r27, boolean r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.getSDKTransactionID.b(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        getSDKAppID = 711855197;
    }

    public static void init$0() {
        $$a = new byte[]{80, -63, 35, 89};
        $$b = 8;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Object[] objArr = new Object[1];
        b(Gravity.getAbsoluteGravity(0, 0) + 11, ExpandableListView.getPackedPositionType(0L) + 256, "\u0013\uffe7\uffe7\ufffe\ufffe￢￢\u0007\u0007\r\r\u0013\u0013\u0013", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, false, objArr);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr[0]).intern(), Locale.getDefault());
        Object[] objArr2 = new Object[1];
        b(-TextUtils.lastIndexOf("", '0'), 232 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\ufff5\u0007\u0006", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, false, objArr2);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(((String) objArr2[0]).intern()));
        String str = simpleDateFormat.format(this.getDeviceData.getTime());
        str.getClass();
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(str));
        getSDKReferenceNumber = (getSDKTransactionID + 49) % 128;
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DateTime$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKTransactionID(byte b8) {
        this(Calendar.getInstance());
    }

    public getSDKTransactionID() {
        this((byte) 0);
    }
}
