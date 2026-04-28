package zendesk.android.internal.proactivemessaging;

import s70.c;
import v80.b0;
import zendesk.conversationkit.android.ConversationKit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class VisitTypeProvider_Factory implements c {
    private final c conversationKitProvider;
    private final c coroutineScopeProvider;

    private VisitTypeProvider_Factory(c cVar, c cVar2) {
        this.conversationKitProvider = cVar;
        this.coroutineScopeProvider = cVar2;
    }

    public static VisitTypeProvider_Factory create(c cVar, c cVar2) {
        return new VisitTypeProvider_Factory(cVar, cVar2);
    }

    public static VisitTypeProvider newInstance(ConversationKit conversationKit, b0 b0Var) {
        return new VisitTypeProvider(conversationKit, b0Var);
    }

    @Override // t70.a
    public VisitTypeProvider get() {
        return newInstance((ConversationKit) this.conversationKitProvider.get(), (b0) this.coroutineScopeProvider.get());
    }
}
