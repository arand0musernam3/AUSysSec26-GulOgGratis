package zendesk.messaging.android.internal.conversationscreen;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import zendesk.ui.android.common.buttonbanner.ButtonBannerRendering;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetRendering;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationScreenView f47704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f47705c;

    public /* synthetic */ r(Context context, ConversationScreenView conversationScreenView, int i11) {
        this.f47703a = i11;
        this.f47705c = context;
        this.f47704b = conversationScreenView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47703a) {
            case 0:
                return ConversationScreenView.deniedPermissionBottomSheetRenderingUpdate$lambda$13$lambda$12(this.f47705c, this.f47704b, (BottomSheetState) obj);
            case 1:
                return ConversationScreenView.deniedPermissionBottomSheetRenderingUpdate$lambda$13(this.f47704b, this.f47705c, (BottomSheetRendering) obj);
            case 2:
                return ConversationScreenView.retryErrorViewRenderingUpdate$lambda$18(this.f47705c, this.f47704b, (RetryErrorRendering) obj);
            default:
                return ConversationScreenView.postbackFailureBannerRenderingUpdate$lambda$21(this.f47704b, this.f47705c, (ButtonBannerRendering) obj);
        }
    }

    public /* synthetic */ r(ConversationScreenView conversationScreenView, Context context, int i11) {
        this.f47703a = i11;
        this.f47704b = conversationScreenView;
        this.f47705c = context;
    }
}
