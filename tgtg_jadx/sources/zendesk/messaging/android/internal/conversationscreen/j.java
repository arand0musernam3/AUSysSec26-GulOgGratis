package zendesk.messaging.android.internal.conversationscreen;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator;
import zendesk.ui.android.common.retryerror.RetryErrorState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47685d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i11) {
        this.f47682a = i11;
        this.f47685d = obj;
        this.f47683b = obj2;
        this.f47684c = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47682a) {
            case 0:
                return ConversationScreenCoordinator.AnonymousClass2.emit$lambda$3((ConversationScreenState) this.f47685d, (ConversationScreenCoordinator) this.f47683b, (ConversationScreenViewModel) this.f47684c, (ConversationScreenRendering) obj);
            case 1:
                return ConversationScreenCoordinator.onSendButtonClickedProvider$lambda$2$lambda$1((String) this.f47685d, (ConversationScreenCoordinator) this.f47683b, (ConversationScreenViewModel) this.f47684c, (String) obj);
            default:
                return ConversationScreenView.retryErrorViewRenderingUpdate$lambda$18$lambda$16((ConversationScreenView) this.f47685d, (Context) this.f47683b, (String) this.f47684c, (RetryErrorState) obj);
        }
    }
}
