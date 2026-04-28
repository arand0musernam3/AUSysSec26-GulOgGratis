package zendesk.messaging.android.internal.di;

import android.content.Context;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessagingDateFormatModule_ProvidesIs24HoursFactory implements c {
    private final c contextProvider;
    private final MessagingDateFormatModule module;

    private MessagingDateFormatModule_ProvidesIs24HoursFactory(MessagingDateFormatModule messagingDateFormatModule, c cVar) {
        this.module = messagingDateFormatModule;
        this.contextProvider = cVar;
    }

    public static MessagingDateFormatModule_ProvidesIs24HoursFactory create(MessagingDateFormatModule messagingDateFormatModule, c cVar) {
        return new MessagingDateFormatModule_ProvidesIs24HoursFactory(messagingDateFormatModule, cVar);
    }

    public static boolean providesIs24Hours(MessagingDateFormatModule messagingDateFormatModule, Context context) {
        return messagingDateFormatModule.providesIs24Hours(context);
    }

    @Override // t70.a
    public Boolean get() {
        return Boolean.valueOf(providesIs24Hours(this.module, (Context) this.contextProvider.get()));
    }
}
