package zendesk.messaging.android.internal.di;

import android.content.Context;
import android.text.format.DateFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lzendesk/messaging/android/internal/di/MessagingDateFormatModule;", "", "<init>", "()V", "providesIs24Hours", "", "context", "Landroid/content/Context;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagingDateFormatModule {
    public final boolean providesIs24Hours(@NotNull Context context) {
        context.getClass();
        return DateFormat.is24HourFormat(context);
    }
}
