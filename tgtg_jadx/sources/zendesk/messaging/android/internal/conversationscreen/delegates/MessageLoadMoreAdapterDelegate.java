package zendesk.messaging.android.internal.conversationscreen.delegates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.r2;
import cw.b;
import e40.a;
import g3.q9;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate;
import zendesk.messaging.android.internal.model.LoadMoreStatus;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.common.loadmore.LoadMoreRendering;
import zendesk.ui.android.common.loadmore.LoadMoreState;
import zendesk.ui.android.common.loadmore.LoadMoreView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0012H\u0014R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/MessageLoadMoreAdapterDelegate;", "Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$LoadMore;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/MessageLoadMoreAdapterDelegate$ViewHolder;", "<init>", "()V", "onRetryClicked", "Lkotlin/Function0;", "", "getOnRetryClicked$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function0;", "setOnRetryClicked$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function0;)V", "isForViewType", "", "item", "items", "", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "holder", "payloads", "", "ViewHolder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageLoadMoreAdapterDelegate extends ListItemAdapterDelegate<MessageLogEntry.LoadMore, MessageLogEntry, ViewHolder> {

    @Nullable
    private Function0<Unit> onRetryClicked;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/MessageLoadMoreAdapterDelegate$ViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "itemView", "Lkotlin/Function0;", "", "onRetryClicked", "Landroid/content/Context;", "context", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Landroid/content/Context;)V", "Lzendesk/messaging/android/internal/model/MessageLogEntry$LoadMore;", "item", "bind", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$LoadMore;)V", "Lkotlin/jvm/functions/Function0;", "getOnRetryClicked", "()Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lzendesk/ui/android/common/loadmore/LoadMoreView;", "loadMoreView", "Lzendesk/ui/android/common/loadmore/LoadMoreView;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewHolder extends r2 {

        @NotNull
        private final Context context;

        @NotNull
        private final LoadMoreView loadMoreView;

        @Nullable
        private final Function0<Unit> onRetryClicked;

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoadMoreStatus.values().length];
                try {
                    iArr[LoadMoreStatus.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadMoreStatus.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LoadMoreStatus.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view, @Nullable Function0<Unit> function0, @NotNull Context context) {
            super(view);
            view.getClass();
            context.getClass();
            this.onRetryClicked = function0;
            this.context = context;
            View viewFindViewById = view.findViewById(R.id.zma_messages_load_more);
            viewFindViewById.getClass();
            this.loadMoreView = (LoadMoreView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LoadMoreRendering bind$lambda$2(ViewHolder viewHolder, MessageLogEntry.LoadMore loadMore, LoadMoreRendering loadMoreRendering) {
            loadMoreRendering.getClass();
            return loadMoreRendering.toBuilder().onRetryClicked(new b(viewHolder, 28)).state(new q9(loadMore, 13)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$2$lambda$0(ViewHolder viewHolder) {
            Function0<Unit> function0 = viewHolder.onRetryClicked;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LoadMoreState bind$lambda$2$lambda$1(MessageLogEntry.LoadMore loadMore, LoadMoreState loadMoreState) {
            LoadMoreState.LoadMoreStatus loadMoreStatus;
            loadMoreState.getClass();
            String failedRetryText = loadMore.getFailedRetryText();
            int i11 = WhenMappings.$EnumSwitchMapping$0[loadMore.getStatus().ordinal()];
            if (i11 == 1) {
                loadMoreStatus = LoadMoreState.LoadMoreStatus.LOADING;
            } else if (i11 == 2) {
                loadMoreStatus = LoadMoreState.LoadMoreStatus.FAILED;
            } else {
                if (i11 != 3) {
                    a.f();
                    return null;
                }
                loadMoreStatus = LoadMoreState.LoadMoreStatus.NONE;
            }
            return LoadMoreState.copy$default(loadMoreState, failedRetryText, 0, 0, loadMoreStatus, 6, null);
        }

        public final void bind(@NotNull MessageLogEntry.LoadMore item) {
            item.getClass();
            this.loadMoreView.render(new ek.a(28, this, item));
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        public final Function0<Unit> getOnRetryClicked() {
            return this.onRetryClicked;
        }
    }

    @Nullable
    public final Function0<Unit> getOnRetryClicked$zendesk_messaging_messaging_android() {
        return this.onRetryClicked;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public boolean isForViewType(@NotNull MessageLogEntry item, @NotNull List<? extends MessageLogEntry> items, int position) {
        item.getClass();
        items.getClass();
        return item instanceof MessageLogEntry.LoadMore;
    }

    public void onBindViewHolder(@NotNull MessageLogEntry.LoadMore item, @NotNull ViewHolder holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        holder.bind(item);
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate, zendesk.messaging.android.internal.adapterdelegate.AdapterDelegate
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.zma_view_message_log_entry_message_load_more, parent, false);
        viewInflate.getClass();
        Function0<Unit> function0 = this.onRetryClicked;
        Context context = parent.getContext();
        context.getClass();
        return new ViewHolder(viewInflate, function0, context);
    }

    public final void setOnRetryClicked$zendesk_messaging_messaging_android(@Nullable Function0<Unit> function0) {
        this.onRetryClicked = function0;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, r2 r2Var, List list) {
        onBindViewHolder((MessageLogEntry.LoadMore) obj, (ViewHolder) r2Var, (List<? extends Object>) list);
    }
}
