package zendesk.messaging.android.internal.conversationslistscreen;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment;
import zendesk.ui.android.conversations.LoadingIndicatorState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47736c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f47734a = i11;
        this.f47735b = obj;
        this.f47736c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47734a) {
            case 0:
                return ConversationListFragment.AnonymousClass2.emit$lambda$9((ConversationsListScreenState) this.f47735b, (ConversationListFragment) this.f47736c, (ConversationsListScreenRendering) obj);
            default:
                return ConversationsListScreenView.conversationsLoaderRenderingUpdate$lambda$3$lambda$2((ConversationsListState) this.f47735b, (ConversationsListScreenView) this.f47736c, (LoadingIndicatorState) obj);
        }
    }
}
