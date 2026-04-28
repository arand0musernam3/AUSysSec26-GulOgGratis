package zendesk.messaging.android.internal.conversationscreen;

import android.text.Spanned;
import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator;
import zendesk.ui.android.common.buttonbanner.ButtonBannerState;
import zendesk.ui.android.conversations.LoadingIndicatorState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47693c;

    public /* synthetic */ m(int i11, Object obj, Object obj2) {
        this.f47691a = i11;
        this.f47692b = obj;
        this.f47693c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47691a) {
            case 0:
                return ConversationScreenCoordinator.AnonymousClass2.emit$lambda$3$lambda$2((ConversationScreenCoordinator) this.f47692b, (ConversationScreenState) this.f47693c, (ConversationScreenState) obj);
            case 1:
                return ConversationScreenView.postbackFailureBannerRenderingUpdate$lambda$21$lambda$19((ConversationScreenView) this.f47692b, (Spanned) this.f47693c, (ButtonBannerState) obj);
            default:
                return ConversationScreenView.loadingIndicatorRenderingUpdate$lambda$15$lambda$14((ConversationScreenStatus) this.f47692b, (ConversationScreenView) this.f47693c, (LoadingIndicatorState) obj);
        }
    }
}
