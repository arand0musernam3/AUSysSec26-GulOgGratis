package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.core.android.internal.DateKtxKt;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogTimestampFormatter;", "", "context", "Landroid/content/Context;", "localeProvider", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "is24HourFormat", "", "<init>", "(Landroid/content/Context;Lzendesk/core/ui/android/internal/local/LocaleProvider;Z)V", "formatWhenConversationWasUpdatedAt", "", "dateFromMessage", "Ljava/util/Date;", "currentDate", "formatWhenConversationWasUpdatedAt$zendesk_messaging_messaging_android", "isOlderThanCurrentYear", "messageCalendar", "Ljava/util/Calendar;", "currentCalendar", "isOlderThanCurrentDay", "isOlderThanCurrentMinute", "resetTimeToMidnight", "", "calendar", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationLogTimestampFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationLogTimestampFormatter.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogTimestampFormatter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final class ConversationLogTimestampFormatter {

    @NotNull
    private final Context context;
    private final boolean is24HourFormat;

    @NotNull
    private final LocaleProvider localeProvider;

    public ConversationLogTimestampFormatter(@NotNull Context context, @NotNull LocaleProvider localeProvider, boolean z11) {
        context.getClass();
        localeProvider.getClass();
        this.context = context;
        this.localeProvider = localeProvider;
        this.is24HourFormat = z11;
    }

    private final boolean isOlderThanCurrentDay(Calendar messageCalendar, Calendar currentCalendar) {
        resetTimeToMidnight(messageCalendar);
        resetTimeToMidnight(currentCalendar);
        return (currentCalendar.getTimeInMillis() - messageCalendar.getTimeInMillis()) / ((long) ConversationLogTimestampFormatterKt.MILLISECONDS_IN_A_DAY) >= 1 || ((currentCalendar.get(2) > messageCalendar.get(2)) && (currentCalendar.get(5) != messageCalendar.get(5))) || ((currentCalendar.get(2) == messageCalendar.get(2)) && (currentCalendar.get(5) > messageCalendar.get(5)));
    }

    private final boolean isOlderThanCurrentMinute(Date dateFromMessage, Date currentDate) {
        return DateKtxKt.toTimestamp(currentDate) - DateKtxKt.toTimestamp(dateFromMessage) >= TimeConstants.ONE_MINUTE_DIFFERENCE;
    }

    private final boolean isOlderThanCurrentYear(Calendar messageCalendar, Calendar currentCalendar) {
        return currentCalendar.get(1) - messageCalendar.get(1) >= 1;
    }

    private final void resetTimeToMidnight(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    @NotNull
    public final String formatWhenConversationWasUpdatedAt$zendesk_messaging_messaging_android(@NotNull Date dateFromMessage, @NotNull Date currentDate) {
        dateFromMessage.getClass();
        currentDate.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFromMessage);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(currentDate);
        if (isOlderThanCurrentYear(calendar, calendar2)) {
            return DateKtxKt.monthDayAndYear(dateFromMessage, this.localeProvider.getLocale());
        }
        if (isOlderThanCurrentDay(calendar, calendar2)) {
            return DateKtxKt.dayAndMonth(dateFromMessage, this.localeProvider.getLocale());
        }
        if (isOlderThanCurrentMinute(dateFromMessage, currentDate)) {
            return DateKtxKt.timeOnly(dateFromMessage, this.localeProvider.getLocale(), this.is24HourFormat);
        }
        String string = this.context.getString(R.string.zma_conversation_list_item_timestamp_just_now);
        string.getClass();
        return string;
    }
}
