package zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.format.Formatter;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.r2;
import bg.n0;
import j80.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.xml.AccessibilityExtKt;
import zendesk.ui.android.R;
import zendesk.ui.android.internal.ColorExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0017j\u0002`\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "fileSize", "Landroid/content/Context;", "context", "", "getFormattedFileSize", "(JLandroid/content/Context;)Ljava/lang/String;", "fileType", "setCharacterLimit", "(Ljava/lang/String;)Ljava/lang/String;", "", "getTheArticleAttachmentCarouselBorderAlpha", "()V", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "item", "", "textColor", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/OnAttachmentItemClicked;", "onAttachmentItemClicked", "bind", "(Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;ILkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "Landroid/widget/RelativeLayout;", "carouselContainer", "Landroid/widget/RelativeLayout;", "Landroid/widget/TextView;", MessageBundle.TITLE_ENTRY, "Landroid/widget/TextView;", "type", "size", "detailSeparator", "Landroid/widget/ImageView;", "image", "Landroid/widget/ImageView;", "", "borderAlpha", "F", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArticleAttachmentCarouselViewHolder extends r2 {
    private float borderAlpha;

    @NotNull
    private final RelativeLayout carouselContainer;

    @NotNull
    private final TextView detailSeparator;

    @NotNull
    private final ImageView image;

    @NotNull
    private final TextView size;

    @NotNull
    private final TextView title;

    @NotNull
    private TextView type;

    @NotNull
    private final View view;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleAttachmentCarouselViewHolder(@NotNull View view) {
        super(view);
        view.getClass();
        this.view = view;
        View viewFindViewById = view.findViewById(R.id.zuia_attachment_carousel_list_item_container);
        viewFindViewById.getClass();
        this.carouselContainer = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.zuia_attachment_carousel_title);
        viewFindViewById2.getClass();
        this.title = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.zuia_attachment_carousel_list_item_type);
        viewFindViewById3.getClass();
        this.type = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.zuia_attachment_carousel_list_item_size);
        viewFindViewById4.getClass();
        this.size = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.zuia_attachment_carousel_list_item_separator);
        viewFindViewById5.getClass();
        this.detailSeparator = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.zuia_attachment_carousel_list_item_image);
        viewFindViewById6.getClass();
        this.image = (ImageView) viewFindViewById6;
        getTheArticleAttachmentCarouselBorderAlpha();
    }

    private final String getFormattedFileSize(long fileSize, Context context) {
        long j9 = 1000;
        long j11 = fileSize * j9 * j9;
        long j12 = 1024;
        String fileSize2 = Formatter.formatFileSize(context, (j11 / j12) / j12);
        fileSize2.getClass();
        return fileSize2;
    }

    private final void getTheArticleAttachmentCarouselBorderAlpha() {
        TypedValue typedValue = new TypedValue();
        this.view.getContext().getResources().getValue(R.dimen.zuia_article_attachment_border_alpha, typedValue, true);
        this.borderAlpha = typedValue.getFloat();
    }

    private final String setCharacterLimit(String fileType) {
        return fileType.length() > 4 ? fileType.substring(0, 4).concat("...") : fileType;
    }

    public final void bind(@NotNull ArticleAttachmentItem item, int textColor, @NotNull Function1<? super ArticleAttachmentItem, Unit> onAttachmentItemClicked) {
        item.getClass();
        onAttachmentItemClicked.getClass();
        Drawable background = this.carouselContainer.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
        }
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(c.b(this.carouselContainer.getResources().getDimension(R.dimen.zuia_inner_stroke_width)), ColorExtKt.adjustAlpha(textColor, this.borderAlpha));
        }
        this.title.setText(item.getTitle());
        this.type.setText(setCharacterLimit(item.getType()));
        TextView textView = this.size;
        long size = item.getSize();
        Context context = this.view.getContext();
        context.getClass();
        textView.setText(getFormattedFileSize(size, context));
        this.detailSeparator.setText("•");
        this.image.setImageResource(R.drawable.zuia_ic_article_attachment_carousel);
        this.title.setTextColor(textColor);
        this.type.setTextColor(textColor);
        this.size.setTextColor(textColor);
        this.detailSeparator.setTextColor(textColor);
        this.image.setColorFilter(textColor);
        this.carouselContainer.setOnClickListener(new n0(20, onAttachmentItemClicked, item));
        TextView textView2 = this.title;
        Context context2 = this.view.getContext();
        int i11 = R.string.zuia_guide_article_view_attachment_carousel_accessibility_value;
        String title = item.getTitle();
        String type = item.getType();
        long size2 = item.getSize();
        Context context3 = this.view.getContext();
        context3.getClass();
        textView2.setContentDescription(context2.getString(i11, title, type, getFormattedFileSize(size2, context3)));
        String string = this.view.getContext().getString(R.string.zuia_guide_article_view_attachment_carousel_accessibility_label);
        string.getClass();
        Context context4 = this.view.getContext();
        int i12 = R.string.zuia_guide_article_view_attachment_carousel_accessibility_value;
        String title2 = item.getTitle();
        String type2 = item.getType();
        long size3 = item.getSize();
        Context context5 = this.view.getContext();
        context5.getClass();
        String string2 = context4.getString(i12, title2, type2, getFormattedFileSize(size3, context5));
        string2.getClass();
        String string3 = this.view.getContext().getString(R.string.zuia_guide_article_view_attachment_carousel_accessibility_action);
        string3.getClass();
        this.view.setContentDescription(string + ". " + string2 + ".");
        AccessibilityExtKt.overrideAccessibilityNodeActionInfo(this.view, string3, 16);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselViewHolder$Companion;", "", "<init>", "()V", "create", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselViewHolder;", "layoutInflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ArticleAttachmentCarouselViewHolder create(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup parent) {
            layoutInflater.getClass();
            parent.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.zuia_view_attachment_item_article_cell, parent, false);
            viewInflate.getClass();
            return new ArticleAttachmentCarouselViewHolder(viewInflate);
        }

        private Companion() {
        }
    }
}
