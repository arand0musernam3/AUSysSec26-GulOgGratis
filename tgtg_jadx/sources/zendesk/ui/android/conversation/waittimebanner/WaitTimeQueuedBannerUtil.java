package zendesk.ui.android.conversation.waittimebanner;

import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import zendesk.ui.android.conversation.waittimebanner.QueuedBannerStatusType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0002J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeQueuedBannerUtil;", "", "<init>", "()V", "MINUTE_IN_SECONDS", "", "HOUR_IN_MINUTES", "DAY_IN_HOURS", "SECONDS_IN_A_DAY", "", "SECONDS_IN_AN_HOUR", "SECONDS_IN_A_MINUTE", "ONE_UNIT", "getType", "Lzendesk/ui/android/conversation/waittimebanner/QueuedBannerStatusType;", "lower", "", "upper", "getDaysText", "upperDays", "lowerDays", "getHoursText", "upperHours", "lowerHours", "getSecondsText", "upperMinutes", "lowerMinutes", "getMinutesText", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WaitTimeQueuedBannerUtil {
    public static final int $stable = 0;
    private static final double DAY_IN_HOURS = 24.0d;
    private static final double HOUR_IN_MINUTES = 60.0d;

    @NotNull
    public static final WaitTimeQueuedBannerUtil INSTANCE = new WaitTimeQueuedBannerUtil();
    private static final double MINUTE_IN_SECONDS = 60.0d;
    private static final int ONE_UNIT = 1;
    private static final int SECONDS_IN_AN_HOUR = 3600;
    private static final int SECONDS_IN_A_DAY = 86400;
    private static final int SECONDS_IN_A_MINUTE = 60;

    private WaitTimeQueuedBannerUtil() {
    }

    private final QueuedBannerStatusType getDaysText(int upperDays, int lowerDays) {
        return lowerDays < 1 ? new QueuedBannerStatusType.WithinDays(upperDays) : upperDays == lowerDays ? new QueuedBannerStatusType.AboutDays(upperDays) : new QueuedBannerStatusType.DailyRange(lowerDays, upperDays);
    }

    private final QueuedBannerStatusType getHoursText(int upperHours, int lowerHours) {
        return lowerHours < 1 ? new QueuedBannerStatusType.WithinHours(upperHours) : upperHours == lowerHours ? new QueuedBannerStatusType.AboutHours(upperHours) : new QueuedBannerStatusType.HourlyRange(lowerHours, upperHours);
    }

    private final QueuedBannerStatusType getMinutesText(int upperMinutes, int lowerMinutes) {
        return lowerMinutes < 1 ? new QueuedBannerStatusType.WithinMinutes(upperMinutes) : upperMinutes == lowerMinutes ? new QueuedBannerStatusType.AboutMinutes(upperMinutes) : new QueuedBannerStatusType.MinuteRange(lowerMinutes, upperMinutes);
    }

    private final QueuedBannerStatusType getSecondsText(int upperMinutes, int lowerMinutes) {
        return (upperMinutes == 1 && lowerMinutes == 1) ? new QueuedBannerStatusType.AboutMinute(0, 1, null) : new QueuedBannerStatusType.WithinMinute(0, 1, null);
    }

    @NotNull
    public final QueuedBannerStatusType getType(long lower, long upper) {
        Pair pair = lower > upper ? new Pair(Long.valueOf(lower), Long.valueOf(upper)) : new Pair(Long.valueOf(upper), Long.valueOf(lower));
        long jLongValue = ((Number) pair.f26485a).longValue();
        long jLongValue2 = ((Number) pair.f26486b).longValue();
        int iCeil = (int) Math.ceil(jLongValue / 60.0d);
        int iFloor = (int) Math.floor(jLongValue2 / 60.0d);
        int iCeil2 = (int) Math.ceil(((double) iCeil) / 60.0d);
        int iFloor2 = (int) Math.floor(((double) iFloor) / 60.0d);
        return jLongValue > 86400 ? getDaysText((int) Math.ceil(((double) iCeil2) / DAY_IN_HOURS), (int) Math.floor(((double) iFloor2) / DAY_IN_HOURS)) : jLongValue > 3600 ? getHoursText(iCeil2, iFloor2) : jLongValue <= 60 ? getSecondsText(iCeil, iFloor) : getMinutesText(iCeil, iFloor);
    }
}
