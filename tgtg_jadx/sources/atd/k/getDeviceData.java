package atd.k;

import java.util.TimeZone;
import kotlin.Metadata;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DefaultTimeZoneConverter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZoneConverter;", "<init>", "()V", "getTimeZoneInMinutes", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData implements cancelled {
    private static int getSDKAppID = 0;
    private static int getSDKTransactionID = 1;

    @Override // atd.k.cancelled
    public final long getSDKAppID() {
        int i11 = getSDKAppID;
        int i12 = i11 & 115;
        int i13 = ((i11 ^ 115) | i12) << 1;
        int i14 = -((i11 | 115) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        getSDKTransactionID = i15 % 128;
        int i16 = i15 % 2;
        TimeZone timeZone = TimeZone.getDefault();
        if (i16 == 0) {
            timeZone.getRawOffset();
            throw null;
        }
        long rawOffset = ((long) timeZone.getRawOffset()) / TimeConstants.ONE_MINUTE_DIFFERENCE;
        int i17 = getSDKTransactionID;
        int i18 = i17 ^ 119;
        int i19 = -(-((i17 & 119) << 1));
        int i21 = ((i18 | i19) << 1) - (i19 ^ i18);
        getSDKAppID = i21 % 128;
        if (i21 % 2 == 0) {
            return rawOffset;
        }
        throw null;
    }
}
