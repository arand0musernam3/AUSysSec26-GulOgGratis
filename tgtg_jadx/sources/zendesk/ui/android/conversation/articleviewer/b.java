package zendesk.ui.android.conversation.articleviewer;

import java.util.List;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.ui.android.conversation.articleviewer.ArticleViewerRendering;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentRendering;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderRendering;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderState;
import zendesk.ui.android.conversation.articleviewer.feedbackbanner.ArticleFeedbackBannerRendering;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetRendering;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetView;
import zendesk.ui.android.conversation.carousel.CarouselAction;
import zendesk.ui.android.conversation.composer.MessageComposerRendering;
import zendesk.ui.android.conversation.composer.MessageComposerView;
import zendesk.ui.android.conversation.conversationextension.ConversationExtensionRendering;
import zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderRendering;
import zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderState;
import zendesk.ui.android.conversation.form.FieldRendering;
import zendesk.ui.android.conversation.form.FieldResponseRendering;
import zendesk.ui.android.conversation.form.FieldResponseView;
import zendesk.ui.android.conversation.form.FieldState;
import zendesk.ui.android.conversation.form.FieldView;
import zendesk.ui.android.conversation.form.FormRendering;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;
import zendesk.ui.android.conversation.receipt.MessageReceiptRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47805a;

    public /* synthetic */ b(int i11) {
        this.f47805a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47805a) {
            case 0:
                return ArticleViewerRendering.Builder.onMenuItemClicked$lambda$1((ArticleHeaderState.ButtonName) obj);
            case 1:
                return Boolean.valueOf(ArticleViewerRendering.Builder.shouldOverrideUrl$lambda$2((String) obj));
            case 2:
                return ArticleViewerRendering.Builder.onAttachmentItemClicked$lambda$4((ArticleAttachmentItem) obj);
            case 3:
                return Boolean.valueOf(ArticleContentRendering.Builder.shouldOverrideUrl$lambda$0((String) obj));
            case 4:
                return ArticleContentRendering.Builder.onLoadingUpdated$lambda$1((ArticleContentState.ArticleLoadingStatus) obj);
            case 5:
                return ArticleContentRendering.Builder.onAttachmentItemClicked$lambda$3((ArticleAttachmentItem) obj);
            case 6:
                return ArticleHeaderRendering.Builder.onMenuItemClicked$lambda$0((ArticleHeaderState.ButtonName) obj);
            case 7:
                return ArticleFeedbackBannerRendering.Builder.onFeedbackBannerOptionClicked$lambda$0((QuickReplyOption) obj);
            case 8:
                return BottomSheetView._init_$lambda$0((BottomSheetRendering) obj);
            case 9:
                return CarouselAction._init_$lambda$0((CarouselAction) obj);
            case 10:
                return MessageComposerRendering.Builder.onSendButtonClicked$lambda$0((String) obj);
            case 11:
                return MessageComposerRendering.Builder.onAttachButtonClicked$lambda$1(((Integer) obj).intValue());
            case 12:
                return MessageComposerRendering.Builder.onTextChanged$lambda$3((String) obj);
            case 13:
                return MessageComposerView._init_$lambda$2((MessageComposerRendering) obj);
            case 14:
                return ConversationExtensionRendering.Builder.onWebSdkUpdateTitle$lambda$4((String) obj);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ConversationExtensionRendering.Builder.onUrlUpdated$lambda$5((String) obj);
            case 16:
                return ConversationExtensionHeaderRendering.Builder.onMenuItemClicked$lambda$0((ConversationExtensionHeaderState.ButtonName) obj);
            case 17:
                return FieldRendering.Email._init_$lambda$0((FieldState.Email) obj);
            case 18:
                return FieldRendering.Email._init_$lambda$1((String) obj);
            case 19:
                return FieldRendering.Email._init_$lambda$2(((Boolean) obj).booleanValue());
            case 20:
                return FieldRendering.Select._init_$lambda$0((FieldState.Select) obj);
            case 21:
                return FieldRendering.Select._init_$lambda$1((List) obj);
            case 22:
                return FieldRendering.Select._init_$lambda$2(((Boolean) obj).booleanValue());
            case 23:
                return FieldRendering.Text._init_$lambda$0((FieldState.Text) obj);
            case 24:
                return FieldRendering.Text._init_$lambda$1((String) obj);
            case 25:
                return FieldRendering.Text._init_$lambda$2(((Boolean) obj).booleanValue());
            case 26:
                return FieldResponseView._init_$lambda$0((FieldResponseRendering) obj);
            case 27:
                return FieldView.rendering$lambda$0((FieldState.Text) obj);
            case 28:
                return FieldView.renderNoError$lambda$19((MessageReceiptRendering) obj);
            default:
                return FormRendering._init_$lambda$0((List) obj);
        }
    }
}
