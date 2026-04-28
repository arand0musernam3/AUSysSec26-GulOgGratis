package zendesk.messaging.android.internal.conversationscreen.di;

import android.content.Context;
import android.text.format.DateFormat;
import k.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.messaging.android.internal.conversationscreen.MessageContainerFactory;
import zendesk.messaging.android.internal.conversationscreen.MessageLogLabelProvider;
import zendesk.messaging.android.internal.conversationscreen.MessageLogTimestampFormatter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/di/MessageLogModule;", "", "<init>", "()V", "Lk/h;", "activity", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogLabelProvider;", "providesMessageLogLabelProvider", "(Lk/h;)Lzendesk/messaging/android/internal/conversationscreen/MessageLogLabelProvider;", "Landroid/content/Context;", "context", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "localeProvider", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogTimestampFormatter;", "providesMessageLogTimestampFormatter", "(Landroid/content/Context;Lzendesk/core/ui/android/internal/local/LocaleProvider;)Lzendesk/messaging/android/internal/conversationscreen/MessageLogTimestampFormatter;", "messageLogLabelProvider", "messageLogTimestampFormatter", "Lzendesk/messaging/android/internal/conversationscreen/MessageContainerFactory;", "providesMessageContainerFactory", "(Lzendesk/messaging/android/internal/conversationscreen/MessageLogLabelProvider;Lzendesk/messaging/android/internal/conversationscreen/MessageLogTimestampFormatter;)Lzendesk/messaging/android/internal/conversationscreen/MessageContainerFactory;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageLogModule {
    @NotNull
    public final MessageContainerFactory providesMessageContainerFactory(@NotNull MessageLogLabelProvider messageLogLabelProvider, @NotNull MessageLogTimestampFormatter messageLogTimestampFormatter) {
        messageLogLabelProvider.getClass();
        messageLogTimestampFormatter.getClass();
        return new MessageContainerFactory(messageLogLabelProvider, messageLogTimestampFormatter, null, 4, null);
    }

    @NotNull
    public final MessageLogLabelProvider providesMessageLogLabelProvider(@NotNull h activity) {
        activity.getClass();
        return new MessageLogLabelProvider(activity);
    }

    @NotNull
    public final MessageLogTimestampFormatter providesMessageLogTimestampFormatter(@NotNull Context context, @NotNull LocaleProvider localeProvider) {
        context.getClass();
        localeProvider.getClass();
        return new MessageLogTimestampFormatter(localeProvider, DateFormat.is24HourFormat(context));
    }
}
