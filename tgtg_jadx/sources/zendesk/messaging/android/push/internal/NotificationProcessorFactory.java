package zendesk.messaging.android.push.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.android.internal.di.KotlinxSerializationModule;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/push/internal/NotificationProcessorFactory;", "", "<init>", "()V", "notificationProcessor", "Lzendesk/messaging/android/push/internal/NotificationProcessor;", "create", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationProcessorFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationProcessorFactory.kt\nzendesk/messaging/android/push/internal/NotificationProcessorFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class NotificationProcessorFactory {

    @NotNull
    public static final NotificationProcessorFactory INSTANCE = new NotificationProcessorFactory();

    @Nullable
    private static NotificationProcessor notificationProcessor;

    private NotificationProcessorFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final NotificationProcessor create() {
        NotificationProcessor notificationProcessor2 = notificationProcessor;
        if (notificationProcessor2 != null) {
            return notificationProcessor2;
        }
        NotificationProcessor notificationProcessor3 = new NotificationProcessor(null, KotlinxSerializationModule.INSTANCE.provideJson(), 1, 0 == true ? 1 : 0);
        notificationProcessor = notificationProcessor3;
        return notificationProcessor3;
    }
}
