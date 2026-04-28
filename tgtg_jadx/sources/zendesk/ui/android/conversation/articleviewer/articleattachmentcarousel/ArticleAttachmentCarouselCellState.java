package zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellState;", "", "attachmentListData", "", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "textColor", "", "navigationButtonBackgroundColor", "focusedStateBorderColor", "<init>", "(Ljava/util/List;III)V", "getAttachmentListData", "()Ljava/util/List;", "getTextColor", "()I", "getNavigationButtonBackgroundColor", "getFocusedStateBorderColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ArticleAttachmentCarouselCellState {
    public static final int $stable = 8;

    @NotNull
    private final List<ArticleAttachmentItem> attachmentListData;
    private final int focusedStateBorderColor;
    private final int navigationButtonBackgroundColor;
    private final int textColor;

    public ArticleAttachmentCarouselCellState(List list, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? n0.f26529a : list, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArticleAttachmentCarouselCellState copy$default(ArticleAttachmentCarouselCellState articleAttachmentCarouselCellState, List list, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            list = articleAttachmentCarouselCellState.attachmentListData;
        }
        if ((i14 & 2) != 0) {
            i11 = articleAttachmentCarouselCellState.textColor;
        }
        if ((i14 & 4) != 0) {
            i12 = articleAttachmentCarouselCellState.navigationButtonBackgroundColor;
        }
        if ((i14 & 8) != 0) {
            i13 = articleAttachmentCarouselCellState.focusedStateBorderColor;
        }
        return articleAttachmentCarouselCellState.copy(list, i11, i12, i13);
    }

    @NotNull
    public final List<ArticleAttachmentItem> component1() {
        return this.attachmentListData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNavigationButtonBackgroundColor() {
        return this.navigationButtonBackgroundColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    @NotNull
    public final ArticleAttachmentCarouselCellState copy(@NotNull List<ArticleAttachmentItem> attachmentListData, int textColor, int navigationButtonBackgroundColor, int focusedStateBorderColor) {
        attachmentListData.getClass();
        return new ArticleAttachmentCarouselCellState(attachmentListData, textColor, navigationButtonBackgroundColor, focusedStateBorderColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleAttachmentCarouselCellState)) {
            return false;
        }
        ArticleAttachmentCarouselCellState articleAttachmentCarouselCellState = (ArticleAttachmentCarouselCellState) other;
        return Intrinsics.areEqual(this.attachmentListData, articleAttachmentCarouselCellState.attachmentListData) && this.textColor == articleAttachmentCarouselCellState.textColor && this.navigationButtonBackgroundColor == articleAttachmentCarouselCellState.navigationButtonBackgroundColor && this.focusedStateBorderColor == articleAttachmentCarouselCellState.focusedStateBorderColor;
    }

    @NotNull
    public final List<ArticleAttachmentItem> getAttachmentListData() {
        return this.attachmentListData;
    }

    public final int getFocusedStateBorderColor() {
        return this.focusedStateBorderColor;
    }

    public final int getNavigationButtonBackgroundColor() {
        return this.navigationButtonBackgroundColor;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.focusedStateBorderColor) + k.b(this.navigationButtonBackgroundColor, k.b(this.textColor, this.attachmentListData.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "ArticleAttachmentCarouselCellState(attachmentListData=" + this.attachmentListData + ", textColor=" + this.textColor + ", navigationButtonBackgroundColor=" + this.navigationButtonBackgroundColor + ", focusedStateBorderColor=" + this.focusedStateBorderColor + ")";
    }

    public ArticleAttachmentCarouselCellState(@NotNull List<ArticleAttachmentItem> list, int i11, int i12, int i13) {
        list.getClass();
        this.attachmentListData = list;
        this.textColor = i11;
        this.navigationButtonBackgroundColor = i12;
        this.focusedStateBorderColor = i13;
    }

    public ArticleAttachmentCarouselCellState() {
        this(null, 0, 0, 0, 15, null);
    }
}
