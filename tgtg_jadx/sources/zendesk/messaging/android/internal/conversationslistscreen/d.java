package zendesk.messaging.android.internal.conversationslistscreen;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import zendesk.ui.android.common.button.ButtonRendering;
import zendesk.ui.android.common.button.ButtonState;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetRendering;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationsListScreenView f47742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f47743c;

    public /* synthetic */ d(ConversationsListScreenView conversationsListScreenView, Context context) {
        this.f47741a = 1;
        this.f47742b = conversationsListScreenView;
        this.f47743c = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47741a) {
            case 0:
                return ConversationsListScreenView.createConversationButtonRenderingUpdate$lambda$8$lambda$6(this.f47743c, this.f47742b, (ButtonState) obj);
            case 1:
                return ConversationsListScreenView.createConversationFailedBottomSheetRenderingUpdate$lambda$12(this.f47742b, this.f47743c, (BottomSheetRendering) obj);
            case 2:
                return ConversationsListScreenView.retryErrorViewRenderingUpdate$lambda$15(this.f47743c, this.f47742b, (RetryErrorRendering) obj);
            case 3:
                return ConversationsListScreenView.createConversationFailedBottomSheetRenderingUpdate$lambda$12$lambda$11(this.f47743c, this.f47742b, (BottomSheetState) obj);
            default:
                return ConversationsListScreenView.createConversationButtonRenderingUpdate$lambda$8(this.f47743c, this.f47742b, (ButtonRendering) obj);
        }
    }

    public /* synthetic */ d(Context context, ConversationsListScreenView conversationsListScreenView, int i11) {
        this.f47741a = i11;
        this.f47743c = context;
        this.f47742b = conversationsListScreenView;
    }
}
