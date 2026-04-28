package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function0;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47686a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConversationScreenCoordinator f47688c;

    public /* synthetic */ k(String str, ConversationScreenCoordinator conversationScreenCoordinator) {
        this.f47687b = str;
        this.f47688c = conversationScreenCoordinator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47686a) {
            case 0:
                return ConversationScreenCoordinator.AnonymousClass2.emit$lambda$3$lambda$0(this.f47688c, this.f47687b);
            default:
                return ConversationScreenCoordinator.onTyping$lambda$23$lambda$22(this.f47687b, this.f47688c);
        }
    }

    public /* synthetic */ k(ConversationScreenCoordinator conversationScreenCoordinator, String str) {
        this.f47688c = conversationScreenCoordinator;
        this.f47687b = str;
    }
}
