package zendesk.ui.android.conversation.articleviewer.feedbackbanner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;
import zendesk.ui.android.conversation.quickreply.QuickReplyRendering;
import zendesk.ui.android.conversation.quickreply.QuickReplyState;
import zendesk.ui.android.conversation.quickreply.QuickReplyView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerView;", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "feedbackBannerContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "optionContainer", "feedbackBannerText", "Landroid/widget/TextView;", "rendering", "render", "", "renderingUpdate", "Lkotlin/Function1;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArticleFeedbackBannerView extends LinearLayout implements Renderer<ArticleFeedbackBannerRendering> {
    public static final int $stable = 8;

    @NotNull
    private final ConstraintLayout feedbackBannerContainer;

    @NotNull
    private final TextView feedbackBannerText;

    @NotNull
    private final LinearLayout optionContainer;

    @NotNull
    private ArticleFeedbackBannerRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleFeedbackBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ArticleFeedbackBannerRendering();
        View.inflate(context, R.layout.zuia_view_article_feedback_banner, this);
        View viewFindViewById = findViewById(R.id.zuia_feedback_banner_container);
        viewFindViewById.getClass();
        this.feedbackBannerContainer = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_feedback_banner_options);
        viewFindViewById2.getClass();
        this.optionContainer = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_feedback_banner_label);
        viewFindViewById3.getClass();
        this.feedbackBannerText = (TextView) viewFindViewById3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickReplyRendering render$lambda$3$lambda$2$lambda$1(ArticleFeedbackBannerView articleFeedbackBannerView, List list, QuickReplyRendering quickReplyRendering) {
        quickReplyRendering.getClass();
        return quickReplyRendering.toBuilder().state(new a(list, articleFeedbackBannerView)).onOptionClicked(articleFeedbackBannerView.rendering.getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickReplyState render$lambda$3$lambda$2$lambda$1$lambda$0(List list, ArticleFeedbackBannerView articleFeedbackBannerView, QuickReplyState quickReplyState) {
        quickReplyState.getClass();
        return QuickReplyState.copy$default(quickReplyState, list, articleFeedbackBannerView.rendering.getState().getButtonColor$zendesk_ui_ui_android(), 0, 4, null);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ArticleFeedbackBannerRendering, ? extends ArticleFeedbackBannerRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ArticleFeedbackBannerRendering articleFeedbackBannerRendering = (ArticleFeedbackBannerRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = articleFeedbackBannerRendering;
        this.feedbackBannerContainer.setBackgroundColor(articleFeedbackBannerRendering.getState().getBackgroundColor$zendesk_ui_ui_android());
        this.feedbackBannerText.setTextColor(this.rendering.getState().getTextColor$zendesk_ui_ui_android());
        List<QuickReplyOption> options$zendesk_ui_ui_android = this.rendering.getState().getOptions$zendesk_ui_ui_android();
        if (options$zendesk_ui_ui_android != null) {
            this.optionContainer.removeAllViews();
            LinearLayout linearLayout = this.optionContainer;
            Context context = getContext();
            context.getClass();
            QuickReplyView quickReplyView = new QuickReplyView(context, null, 0, 0, 14, null);
            quickReplyView.render(new a(this, options$zendesk_ui_ui_android));
            linearLayout.addView(quickReplyView, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleFeedbackBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleFeedbackBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ArticleFeedbackBannerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleFeedbackBannerView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
