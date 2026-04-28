package zendesk.messaging.android.internal.conversationslistscreen.list;

import kotlin.jvm.functions.Function1;
import zendesk.core.ui.android.internal.model.ConversationEntry;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationsListAdapter f47750b;

    public /* synthetic */ a(ConversationsListAdapter conversationsListAdapter, int i11) {
        this.f47749a = i11;
        this.f47750b = conversationsListAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47749a) {
            case 0:
                return ConversationsListAdapter.onCreateViewHolder$lambda$2(this.f47750b, (ConversationEntry.ConversationItem) obj);
            case 1:
                return ConversationsListAdapter.onCreateViewHolder$lambda$3(this.f47750b, (ConversationEntry.LoadMore) obj);
            default:
                return ConversationsListAdapter.onBindViewHolder$lambda$4(this.f47750b, (ConversationEntry.ConversationItem) obj);
        }
    }
}
