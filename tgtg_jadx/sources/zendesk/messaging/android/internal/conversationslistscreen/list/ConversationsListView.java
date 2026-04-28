package zendesk.messaging.android.internal.conversationslistscreen.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.y1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import yi.a0;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.ui.android.Renderer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 '2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001'B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/Function1;", "renderingUpdate", "", "render", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "Lu70/j;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListAdapter;", "conversationsListAdapter", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "rendering", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewRendering;", "Ljava/util/concurrent/atomic/AtomicInteger;", "state", "Ljava/util/concurrent/atomic/AtomicInteger;", "getState", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setState", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListView extends FrameLayout implements Renderer<ConversationsListViewRendering> {
    private static final int FIRST_POSITION = 0;

    @NotNull
    private final ConversationsListAdapter conversationsListAdapter;

    @NotNull
    private final LinearLayoutManager layoutManager;

    /* JADX INFO: renamed from: recyclerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j recyclerView;

    @NotNull
    private ConversationsListViewRendering rendering;

    @NotNull
    private AtomicInteger state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.recyclerView = l.b(new y.a(this, 21));
        ConversationsListAdapter conversationsListAdapter = new ConversationsListAdapter();
        this.conversationsListAdapter = conversationsListAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        this.rendering = new ConversationsListViewRendering();
        this.state = new AtomicInteger(0);
        View.inflate(context, R.layout.zma_view_conversations_list, this);
        getRecyclerView().setAdapter(conversationsListAdapter);
        getRecyclerView().setLayoutManager(linearLayoutManager);
        getRecyclerView().k(new c2() { // from class: zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListView.1
            @Override // androidx.recyclerview.widget.c2
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                recyclerView.getClass();
                ConversationsListView.this.getState().compareAndSet(0, newState);
                if (newState == 0) {
                    if (ConversationsListView.this.getState().compareAndSet(2, newState)) {
                        return;
                    }
                    ConversationsListView.this.getState().compareAndSet(1, newState);
                } else if (newState == 1) {
                    ConversationsListView.this.getState().compareAndSet(0, newState);
                } else {
                    if (newState != 2) {
                        return;
                    }
                    ConversationsListView.this.getState().compareAndSet(1, newState);
                }
            }

            @Override // androidx.recyclerview.widget.c2
            public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
                recyclerView.getClass();
                if (ConversationsListView.this.layoutManager.findLastCompletelyVisibleItemPosition() == ConversationsListView.this.rendering.getState().getConversations$zendesk_messaging_messaging_android().size() - 1) {
                    ConversationsListView.this.rendering.getOnLoadMoreListener$zendesk_messaging_messaging_android().invoke();
                }
            }
        });
        render(new o(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationsListViewRendering _init_$lambda$1(ConversationsListViewRendering conversationsListViewRendering) {
        conversationsListViewRendering.getClass();
        return conversationsListViewRendering;
    }

    private final RecyclerView getRecyclerView() {
        Object value = this.recyclerView.getValue();
        value.getClass();
        return (RecyclerView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView recyclerView_delegate$lambda$0(ConversationsListView conversationsListView) {
        return (RecyclerView) conversationsListView.findViewById(R.id.zma_conversations_list_screen_recycler_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$2(ConversationsListView conversationsListView) {
        y1 layoutManager = conversationsListView.getRecyclerView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0) {
            return;
        }
        conversationsListView.getRecyclerView().m0(0);
    }

    @NotNull
    public final AtomicInteger getState() {
        return this.state;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ConversationsListViewRendering, ? extends ConversationsListViewRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ConversationsListViewRendering conversationsListViewRendering = (ConversationsListViewRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = conversationsListViewRendering;
        this.conversationsListAdapter.submitList(conversationsListViewRendering.getState().getConversations$zendesk_messaging_messaging_android(), new a0(this, 2));
        this.conversationsListAdapter.setOnListItemClickListener(this.rendering.getOnListItemClickLambda$zendesk_messaging_messaging_android());
        this.conversationsListAdapter.setOnRetryClickListener(this.rendering.getOnRetryClickLambda$zendesk_messaging_messaging_android());
    }

    public final void setState(@NotNull AtomicInteger atomicInteger) {
        atomicInteger.getClass();
        this.state = atomicInteger;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationsListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationsListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ConversationsListView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationsListView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
