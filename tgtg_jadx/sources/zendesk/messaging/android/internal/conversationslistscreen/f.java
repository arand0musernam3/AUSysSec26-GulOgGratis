package zendesk.messaging.android.internal.conversationslistscreen;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47747b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f47746a = i11;
        this.f47747b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47746a) {
            case 0:
                return ConversationsListScreenView.createConversationFailedBottomSheetRenderingUpdate$lambda$12$lambda$10((ConversationsListScreenView) this.f47747b);
            case 1:
                return ConversationsListScreenView.createConversationButtonRenderingUpdate$lambda$8$lambda$7((ConversationsListScreenView) this.f47747b);
            case 2:
                return ConversationsListScreenView.retryErrorViewRenderingUpdate$lambda$15$lambda$14((ConversationsListScreenView) this.f47747b);
            default:
                return ConversationsListScreenView.createConversationFailedBottomSheet_delegate$lambda$9((Context) this.f47747b);
        }
    }
}
