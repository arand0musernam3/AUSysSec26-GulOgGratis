package zendesk.messaging.android.internal.conversationslistscreen.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yl.e;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.ui.android.common.loadmore.LoadMoreRendering;
import zendesk.ui.android.common.loadmore.LoadMoreState;
import zendesk.ui.android.common.loadmore.LoadMoreView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListLoadMoreViewHolder;", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewHolder;", "loadMoreView", "Lzendesk/ui/android/common/loadmore/LoadMoreView;", "onRetryClicked", "Lkotlin/Function1;", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;", "", "<init>", "(Lzendesk/ui/android/common/loadmore/LoadMoreView;Lkotlin/jvm/functions/Function1;)V", "getOnRetryClicked", "()Lkotlin/jvm/functions/Function1;", "onBind", "loadMoreEntry", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListLoadMoreViewHolder extends ConversationsListViewHolder {

    @NotNull
    private final LoadMoreView loadMoreView;

    @Nullable
    private final Function1<ConversationEntry.LoadMore, Unit> onRetryClicked;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationEntry.LoadMoreStatus.values().length];
            try {
                iArr[ConversationEntry.LoadMoreStatus.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversationEntry.LoadMoreStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConversationEntry.LoadMoreStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationsListLoadMoreViewHolder(@NotNull LoadMoreView loadMoreView, @Nullable Function1<? super ConversationEntry.LoadMore, Unit> function1) {
        super(loadMoreView);
        loadMoreView.getClass();
        this.loadMoreView = loadMoreView;
        this.onRetryClicked = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadMoreRendering onBind$lambda$2(ConversationsListLoadMoreViewHolder conversationsListLoadMoreViewHolder, ConversationEntry.LoadMore loadMore, LoadMoreRendering loadMoreRendering) {
        loadMoreRendering.getClass();
        return loadMoreRendering.toBuilder().onRetryClicked(new e(8, conversationsListLoadMoreViewHolder, loadMore)).state(new zendesk.core.android.internal.a(loadMore, 5)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBind$lambda$2$lambda$0(ConversationsListLoadMoreViewHolder conversationsListLoadMoreViewHolder, ConversationEntry.LoadMore loadMore) {
        Function1<ConversationEntry.LoadMore, Unit> function1 = conversationsListLoadMoreViewHolder.onRetryClicked;
        if (function1 != null) {
            function1.invoke(loadMore);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadMoreState onBind$lambda$2$lambda$1(ConversationEntry.LoadMore loadMore, LoadMoreState loadMoreState) {
        LoadMoreState.LoadMoreStatus loadMoreStatus;
        loadMoreState.getClass();
        String retryText = loadMore.getRetryText();
        int failedRetryTextColor = loadMore.getFailedRetryTextColor();
        int progressBarColor = loadMore.getProgressBarColor();
        int i11 = WhenMappings.$EnumSwitchMapping$0[loadMore.getStatus().ordinal()];
        if (i11 == 1) {
            loadMoreStatus = LoadMoreState.LoadMoreStatus.LOADING;
        } else if (i11 == 2) {
            loadMoreStatus = LoadMoreState.LoadMoreStatus.FAILED;
        } else {
            if (i11 != 3) {
                e40.a.f();
                return null;
            }
            loadMoreStatus = LoadMoreState.LoadMoreStatus.NONE;
        }
        return loadMoreState.copy(retryText, progressBarColor, failedRetryTextColor, loadMoreStatus);
    }

    @Nullable
    public final Function1<ConversationEntry.LoadMore, Unit> getOnRetryClicked() {
        return this.onRetryClicked;
    }

    public final void onBind(@NotNull ConversationEntry.LoadMore loadMoreEntry) {
        loadMoreEntry.getClass();
        this.loadMoreView.render(new xq.a(15, this, loadMoreEntry));
    }
}
