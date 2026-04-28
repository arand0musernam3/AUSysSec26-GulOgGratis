package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.messaging.android.internal.conversationscreen.cache.MessagingUIPersistence;
import zendesk.messaging.android.internal.conversationscreen.cache.StoredForm;
import zendesk.ui.android.common.button.ButtonRendering;
import zendesk.ui.android.common.buttonbanner.ButtonBannerRendering;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerRendering;
import zendesk.ui.android.common.loadmore.LoadMoreRendering;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.conversation.articleviewer.ArticleViewerRendering;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentRendering;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47697a;

    public /* synthetic */ n(int i11) {
        this.f47697a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f47697a) {
            case 0:
                return Unit.f26487a;
            case 1:
                return Unit.f26487a;
            case 2:
                return Unit.f26487a;
            case 3:
                return Unit.f26487a;
            case 4:
                return Unit.f26487a;
            case 5:
                return Unit.f26487a;
            case 6:
                return Unit.f26487a;
            case 7:
                return MessageContainerFactory._init_$lambda$0();
            case 8:
                return MessagingUIPersistence._childSerializers$_anonymous_();
            case 9:
                return StoredForm._childSerializers$_anonymous_();
            case 10:
                return Unit.f26487a;
            case 11:
                return Unit.f26487a;
            case 12:
                return Unit.f26487a;
            case 13:
                return Unit.f26487a;
            case 14:
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Unit.f26487a;
            case 16:
                return Unit.f26487a;
            case 17:
                return Unit.f26487a;
            case 18:
                return Unit.f26487a;
            case 19:
                return Unit.f26487a;
            case 20:
                return ButtonRendering.Builder.onButtonClicked$lambda$0();
            case 21:
                return ButtonBannerRendering.Builder.onViewClicked$lambda$0();
            case 22:
                return ButtonBannerRendering.Builder.onViewDismissed$lambda$1();
            case 23:
                return ConnectionBannerRendering.Builder.onRetryClicked$lambda$0();
            case 24:
                return LoadMoreRendering.Builder.onRetryClicked$lambda$0();
            case 25:
                return RetryErrorRendering.Builder.onButtonClicked$lambda$0();
            case 26:
                return ArticleViewerRendering.Builder.onRetryButtonClicked$lambda$3();
            case 27:
                return ArticleContentRendering.Builder.onRetryButtonClicked$lambda$2();
            case 28:
                return BottomSheetRendering.Builder.onBottomSheetActionClicked$lambda$0();
            default:
                return BottomSheetRendering.Builder.onBottomSheetDismissed$lambda$1();
        }
    }
}
