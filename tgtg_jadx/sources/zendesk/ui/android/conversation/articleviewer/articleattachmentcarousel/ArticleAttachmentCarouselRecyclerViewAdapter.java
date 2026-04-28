package zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.l1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentCarouselViewHolder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u000f2\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR*\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0012j\u0004\u0018\u0001`\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselRecyclerViewAdapter;", "Landroidx/recyclerview/widget/l1;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselViewHolder;I)V", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/OnAttachmentItemClicked;", "onAttachmentItemClicked", "setOnAttachmentItemClicked", "(Lkotlin/jvm/functions/Function1;)V", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellState;", "state", "swapData", "(Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellState;)V", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellState;", "Lkotlin/jvm/functions/Function1;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArticleAttachmentCarouselRecyclerViewAdapter extends l1 {
    public static final int $stable = 8;

    @Nullable
    private Function1<? super ArticleAttachmentItem, Unit> onAttachmentItemClicked;

    @NotNull
    private ArticleAttachmentCarouselCellState state = new ArticleAttachmentCarouselCellState(null, 0, 0, 0, 15, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(ArticleAttachmentCarouselRecyclerViewAdapter articleAttachmentCarouselRecyclerViewAdapter, ArticleAttachmentItem articleAttachmentItem) {
        articleAttachmentItem.getClass();
        Function1<? super ArticleAttachmentItem, Unit> function1 = articleAttachmentCarouselRecyclerViewAdapter.onAttachmentItemClicked;
        if (function1 != null) {
            function1.invoke(articleAttachmentItem);
        }
        return Unit.f26487a;
    }

    @Override // androidx.recyclerview.widget.l1
    public int getItemCount() {
        return this.state.getAttachmentListData().size();
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull ArticleAttachmentCarouselViewHolder holder, int position) {
        holder.getClass();
        holder.bind(this.state.getAttachmentListData().get(position), this.state.getTextColor(), new zendesk.core.android.internal.a(this, 8));
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public ArticleAttachmentCarouselViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        ArticleAttachmentCarouselViewHolder.Companion companion = ArticleAttachmentCarouselViewHolder.INSTANCE;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        layoutInflaterFrom.getClass();
        return companion.create(layoutInflaterFrom, parent);
    }

    public final void setOnAttachmentItemClicked(@Nullable Function1<? super ArticleAttachmentItem, Unit> onAttachmentItemClicked) {
        this.onAttachmentItemClicked = onAttachmentItemClicked;
    }

    public final void swapData(@NotNull ArticleAttachmentCarouselCellState state) {
        state.getClass();
        this.state = state;
        notifyDataSetChanged();
    }
}
