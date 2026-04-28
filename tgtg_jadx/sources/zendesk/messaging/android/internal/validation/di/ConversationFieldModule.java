package zendesk.messaging.android.internal.validation.di;

import kotlin.Metadata;
import oa0.o0;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.android.internal.validation.ConversationFieldService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzendesk/messaging/android/internal/validation/di/ConversationFieldModule;", "", "<init>", "()V", "Loa0/o0;", "retrofit", "Lzendesk/messaging/android/internal/validation/ConversationFieldService;", "provideConversationFieldService", "(Loa0/o0;)Lzendesk/messaging/android/internal/validation/ConversationFieldService;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationFieldModule {
    @NotNull
    public final ConversationFieldService provideConversationFieldService(@NotNull o0 retrofit) {
        retrofit.getClass();
        Object objB = retrofit.b(ConversationFieldService.class);
        objB.getClass();
        return (ConversationFieldService) objB;
    }
}
