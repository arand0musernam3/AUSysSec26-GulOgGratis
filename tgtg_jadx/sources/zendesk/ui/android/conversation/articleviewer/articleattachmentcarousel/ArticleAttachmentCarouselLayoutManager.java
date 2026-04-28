package zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0010\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u00020\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselLayoutManager;", "Landroidx/recyclerview/widget/l1;", "Landroidx/recyclerview/widget/r2;", "T", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "adapter", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/l1;)V", "Landroidx/recyclerview/widget/RecyclerView$a;", "lp", "", "checkLayoutParams", "(Landroidx/recyclerview/widget/RecyclerView$a;)Z", "canScrollHorizontally", "()Z", "scrollEnabled", "", "setScroll$zendesk_ui_ui_android", "(Z)V", "setScroll", "Landroidx/recyclerview/widget/l1;", "getAdapter", "()Landroidx/recyclerview/widget/l1;", "isScrollEnabled", "Z", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArticleAttachmentCarouselLayoutManager<T extends l1> extends LinearLayoutManager {
    public static final int $stable = 8;

    @NotNull
    private final T adapter;
    private boolean isScrollEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleAttachmentCarouselLayoutManager(@NotNull Context context, @NotNull T t9) {
        super(context, 0, false);
        context.getClass();
        t9.getClass();
        this.adapter = t9;
        this.isScrollEnabled = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    /* JADX INFO: renamed from: canScrollHorizontally, reason: from getter */
    public boolean getIsScrollEnabled() {
        return this.isScrollEnabled;
    }

    @Override // androidx.recyclerview.widget.y1
    public boolean checkLayoutParams(@NotNull RecyclerView.a lp2) {
        lp2.getClass();
        ((ViewGroup.MarginLayoutParams) lp2).width = -2;
        return true;
    }

    @NotNull
    public final T getAdapter() {
        return this.adapter;
    }

    public final void setScroll$zendesk_ui_ui_android(boolean scrollEnabled) {
        this.isScrollEnabled = scrollEnabled;
    }
}
