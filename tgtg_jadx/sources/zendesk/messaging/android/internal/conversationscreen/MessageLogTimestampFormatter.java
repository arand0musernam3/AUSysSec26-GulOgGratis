package zendesk.messaging.android.internal.conversationscreen;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.core.android.internal.DateKtxKt;
import zendesk.core.ui.android.internal.local.LocaleProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageLogTimestampFormatter;", "", "localeProvider", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "is24HourFormat", "", "<init>", "(Lzendesk/core/ui/android/internal/local/LocaleProvider;Z)V", "dayAndTimeFormat", "Ljava/text/SimpleDateFormat;", "timeOnly", "", "timestamp", "Ljava/util/Date;", "dayAndTime", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageLogTimestampFormatter {

    @NotNull
    private final SimpleDateFormat dayAndTimeFormat;
    private final boolean is24HourFormat;

    @NotNull
    private final LocaleProvider localeProvider;

    public MessageLogTimestampFormatter(@NotNull LocaleProvider localeProvider, boolean z11) {
        localeProvider.getClass();
        this.localeProvider = localeProvider;
        this.is24HourFormat = z11;
        this.dayAndTimeFormat = new SimpleDateFormat(z11 ? "MMMM d, H:mm" : "MMMM d, h:mm a", localeProvider.getLocale());
    }

    @NotNull
    public final String dayAndTime(@NotNull Date timestamp) {
        timestamp.getClass();
        return DateKtxKt.formatToLocalisedNumbers(timestamp, this.dayAndTimeFormat, this.localeProvider.getLocale());
    }

    @NotNull
    public final String timeOnly(@NotNull Date timestamp) {
        timestamp.getClass();
        return DateKtxKt.timeOnly(timestamp, this.localeProvider.getLocale(), this.is24HourFormat);
    }
}
