package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function0;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator;
import zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47690b;

    public /* synthetic */ l(Object obj, int i11) {
        this.f47689a = i11;
        this.f47690b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47689a) {
            case 0:
                return ConversationScreenCoordinator.AnonymousClass2.emit$lambda$3$lambda$1((ConversationScreenViewModel) this.f47690b);
            case 1:
                return ConversationScreenCoordinator.onRetryConnectionClicked$lambda$10$lambda$9((ConversationScreenViewModel) this.f47690b);
            default:
                return ImageViewerActivity.AnonymousClass1.C00471.C00481.C00491.emit$lambda$2$lambda$1((ImageViewerActivity) this.f47690b);
        }
    }
}
