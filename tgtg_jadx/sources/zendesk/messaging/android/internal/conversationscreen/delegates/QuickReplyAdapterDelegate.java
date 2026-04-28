package zendesk.messaging.android.internal.conversationscreen.delegates;

import a3.y0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.r2;
import ek.a;
import hb0.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import qc.y;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogListenersKt;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;
import zendesk.ui.android.conversation.quickreply.QuickReplyRendering;
import zendesk.ui.android.conversation.quickreply.QuickReplyState;
import zendesk.ui.android.conversation.quickreply.QuickReplyView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B)\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J(\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00042\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001aH\u0014R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/QuickReplyAdapterDelegate;", "Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$QuickReply;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/QuickReplyAdapterDelegate$ViewHolder;", "onOptionSelected", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnReplyActionSelected;", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getOnOptionSelected", "()Lkotlin/jvm/functions/Function1;", "setOnOptionSelected", "(Lkotlin/jvm/functions/Function1;)V", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "isForViewType", "", "item", "items", "", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "holder", "payloads", "", "ViewHolder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuickReplyAdapterDelegate extends ListItemAdapterDelegate<MessageLogEntry.QuickReply, MessageLogEntry, ViewHolder> {

    @NotNull
    private MessagingTheme messagingTheme;

    @NotNull
    private Function1<? super MessageAction.Reply, Unit> onOptionSelected;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/QuickReplyAdapterDelegate$ViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "itemView", "", "quickReplyColor", "quickReplyBackgroundColor", "<init>", "(Landroid/view/View;II)V", "Lzendesk/messaging/android/internal/model/MessageLogEntry$QuickReply;", "item", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnReplyActionSelected;", "onReplyActionSelected", "bind", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$QuickReply;Lkotlin/jvm/functions/Function1;)V", "I", "Lzendesk/ui/android/conversation/quickreply/QuickReplyView;", "quickReplyView", "Lzendesk/ui/android/conversation/quickreply/QuickReplyView;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nQuickReplyAdapterDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickReplyAdapterDelegate.kt\nzendesk/messaging/android/internal/conversationscreen/delegates/QuickReplyAdapterDelegate$ViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1563#2:78\n1634#2,3:79\n230#2,2:82\n*S KotlinDebug\n*F\n+ 1 QuickReplyAdapterDelegate.kt\nzendesk/messaging/android/internal/conversationscreen/delegates/QuickReplyAdapterDelegate$ViewHolder\n*L\n55#1:78\n55#1:79,3\n69#1:82,2\n*E\n"})
    public static final class ViewHolder extends r2 {
        private final int quickReplyBackgroundColor;
        private final int quickReplyColor;

        @NotNull
        private final QuickReplyView quickReplyView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view, int i11, int i12) {
            super(view);
            view.getClass();
            this.quickReplyColor = i11;
            this.quickReplyBackgroundColor = i12;
            View viewFindViewById = view.findViewById(R.id.zma_quick_reply);
            viewFindViewById.getClass();
            this.quickReplyView = (QuickReplyView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final QuickReplyRendering bind$lambda$4(MessageLogEntry.QuickReply quickReply, ViewHolder viewHolder, Function1 function1, QuickReplyRendering quickReplyRendering) {
            quickReplyRendering.getClass();
            return quickReplyRendering.toBuilder().state(new a(29, quickReply, viewHolder)).onOptionClicked(new o(0, function1, quickReply)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final QuickReplyState bind$lambda$4$lambda$1(MessageLogEntry.QuickReply quickReply, ViewHolder viewHolder, QuickReplyState quickReplyState) {
            quickReplyState.getClass();
            List<MessageAction.Reply> replies = quickReply.getReplies();
            ArrayList arrayList = new ArrayList(e0.o(replies, 10));
            for (MessageAction.Reply reply : replies) {
                arrayList.add(new QuickReplyOption(reply.getId(), reply.getText()));
            }
            return quickReplyState.copy(arrayList, viewHolder.quickReplyColor, viewHolder.quickReplyBackgroundColor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$4$lambda$3(Function1 function1, MessageLogEntry.QuickReply quickReply, QuickReplyOption quickReplyOption) {
            quickReplyOption.getClass();
            for (Object obj : quickReply.getReplies()) {
                if (Intrinsics.areEqual(((MessageAction.Reply) obj).getId(), quickReplyOption.getId())) {
                    function1.invoke(obj);
                    return Unit.f26487a;
                }
            }
            y.h("Collection contains no element matching the predicate.");
            return null;
        }

        public final void bind(@NotNull MessageLogEntry.QuickReply item, @NotNull Function1<? super MessageAction.Reply, Unit> onReplyActionSelected) {
            item.getClass();
            onReplyActionSelected.getClass();
            this.quickReplyView.render(new y0(item, this, onReplyActionSelected, 16));
        }
    }

    public QuickReplyAdapterDelegate(@NotNull Function1<? super MessageAction.Reply, Unit> function1, @NotNull MessagingTheme messagingTheme) {
        function1.getClass();
        messagingTheme.getClass();
        this.onOptionSelected = function1;
        this.messagingTheme = messagingTheme;
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @NotNull
    public final Function1<MessageAction.Reply, Unit> getOnOptionSelected() {
        return this.onOptionSelected;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public boolean isForViewType(@NotNull MessageLogEntry item, @NotNull List<? extends MessageLogEntry> items, int position) {
        item.getClass();
        items.getClass();
        return item instanceof MessageLogEntry.QuickReply;
    }

    public void onBindViewHolder(@NotNull MessageLogEntry.QuickReply item, @NotNull ViewHolder holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        holder.bind(item, this.onOptionSelected);
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate, zendesk.messaging.android.internal.adapterdelegate.AdapterDelegate
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.zma_view_message_log_entry_quick_reply, parent, false);
        viewInflate.getClass();
        return new ViewHolder(viewInflate, this.messagingTheme.getOnSecondaryAction(), this.messagingTheme.getSecondaryActionColor());
    }

    public final void setMessagingTheme(@NotNull MessagingTheme messagingTheme) {
        messagingTheme.getClass();
        this.messagingTheme = messagingTheme;
    }

    public final void setOnOptionSelected(@NotNull Function1<? super MessageAction.Reply, Unit> function1) {
        function1.getClass();
        this.onOptionSelected = function1;
    }

    public /* synthetic */ QuickReplyAdapterDelegate(Function1 function1, MessagingTheme messagingTheme, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MessageLogListenersKt.getNOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER() : function1, messagingTheme);
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, r2 r2Var, List list) {
        onBindViewHolder((MessageLogEntry.QuickReply) obj, (ViewHolder) r2Var, (List<? extends Object>) list);
    }
}
