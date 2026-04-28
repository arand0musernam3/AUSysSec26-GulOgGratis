package zendesk.messaging.android.internal.conversationslistscreen.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationCellFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u000e2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b\u001a\u0010\u0017R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListAdapter;", "Landroidx/recyclerview/widget/b1;", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/Function1;", "Lzendesk/core/ui/android/internal/model/ConversationEntry$ConversationItem;", "listItemClickListener", "setOnListItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;", "retryClickListener", "setOnRetryClickListener", "Lkotlin/jvm/functions/Function1;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListAdapter extends b1 {

    @NotNull
    private Function1<? super ConversationEntry.ConversationItem, Unit> listItemClickListener;

    @NotNull
    private Function1<? super ConversationEntry.LoadMore, Unit> retryClickListener;

    public ConversationsListAdapter() {
        super(ConversationDiffCallback.INSTANCE);
        this.listItemClickListener = new o(18);
        this.retryClickListener = new o(19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listItemClickListener$lambda$0(ConversationEntry.ConversationItem conversationItem) {
        conversationItem.getClass();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4(ConversationsListAdapter conversationsListAdapter, ConversationEntry.ConversationItem conversationItem) {
        conversationItem.getClass();
        conversationsListAdapter.listItemClickListener.invoke(conversationItem);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$2(ConversationsListAdapter conversationsListAdapter, ConversationEntry.ConversationItem conversationItem) {
        conversationItem.getClass();
        conversationsListAdapter.listItemClickListener.invoke(conversationItem);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$3(ConversationsListAdapter conversationsListAdapter, ConversationEntry.LoadMore loadMore) {
        loadMore.getClass();
        conversationsListAdapter.retryClickListener.invoke(loadMore);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryClickListener$lambda$1(ConversationEntry.LoadMore loadMore) {
        loadMore.getClass();
        return Unit.f26487a;
    }

    @Override // androidx.recyclerview.widget.l1
    public int getItemViewType(int position) {
        if (position == -1) {
            return -1;
        }
        ConversationEntry conversationEntry = (ConversationEntry) getItem(position);
        if (conversationEntry instanceof ConversationEntry.ConversationItem) {
            return ConversationsListCellViewType.CONVERSATION.ordinal();
        }
        if (conversationEntry instanceof ConversationEntry.LoadMore) {
            return ConversationsListCellViewType.LOAD_MORE.ordinal();
        }
        e40.a.f();
        return 0;
    }

    @Override // androidx.recyclerview.widget.l1
    public void onBindViewHolder(@NotNull ConversationsListViewHolder holder, int position) {
        holder.getClass();
        if (holder instanceof ConversationListItemViewHolder) {
            ConversationCellFactory conversationCellFactory = ConversationCellFactory.INSTANCE;
            Object item = getItem(position);
            item.getClass();
            View view = holder.itemView;
            view.getClass();
            ((ConversationListItemViewHolder) holder).onBind(conversationCellFactory.mapToConversationCellState$zendesk_messaging_messaging_android((ConversationEntry.ConversationItem) item, view, new a(this, 2)));
        }
        if (holder instanceof ConversationsListLoadMoreViewHolder) {
            Object item2 = getItem(position);
            item2.getClass();
            ((ConversationsListLoadMoreViewHolder) holder).onBind((ConversationEntry.LoadMore) item2);
        }
    }

    @Override // androidx.recyclerview.widget.l1
    @NotNull
    public ConversationsListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        parent.getClass();
        return ConversationsListCellViewType.values()[viewType] == ConversationsListCellViewType.CONVERSATION ? new ConversationListItemViewHolder(ConversationCellFactory.createConversationCellView$default(ConversationCellFactory.INSTANCE, null, parent, new a(this, 0), 1, null)) : new ConversationsListLoadMoreViewHolder(ConversationCellFactory.INSTANCE.createLoadMoreCellView(parent), new a(this, 1));
    }

    public final void setOnListItemClickListener(@NotNull Function1<? super ConversationEntry.ConversationItem, Unit> listItemClickListener) {
        listItemClickListener.getClass();
        this.listItemClickListener = listItemClickListener;
    }

    public final void setOnRetryClickListener(@NotNull Function1<? super ConversationEntry.LoadMore, Unit> retryClickListener) {
        retryClickListener.getClass();
        this.retryClickListener = retryClickListener;
    }
}
