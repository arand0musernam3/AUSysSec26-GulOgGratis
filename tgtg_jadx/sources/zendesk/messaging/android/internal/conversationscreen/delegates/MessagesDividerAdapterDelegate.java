package zendesk.messaging.android.internal.conversationscreen.delegates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.r2;
import e40.a;
import hb0.n;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessageLogType;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.messagesdivider.MessagesDividerRendering;
import zendesk.ui.android.conversation.messagesdivider.MessagesDividerState;
import zendesk.ui.android.conversation.messagesdivider.MessagesDividerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0010H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\b¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/MessagesDividerAdapterDelegate;", "Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$MessagesDivider;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/MessagesDividerAdapterDelegate$ViewHolder;", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "isForViewType", "", "item", "items", "", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", "holder", "payloads", "", "ViewHolder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessagesDividerAdapterDelegate extends ListItemAdapterDelegate<MessageLogEntry.MessagesDivider, MessageLogEntry, ViewHolder> {

    @NotNull
    private MessagingTheme messagingTheme;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/MessagesDividerAdapterDelegate$ViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "itemView", "Landroid/content/Context;", "context", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "<init>", "(Landroid/view/View;Landroid/content/Context;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "Lzendesk/messaging/android/internal/model/MessageLogEntry$MessagesDivider;", "item", "", "bind", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$MessagesDivider;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "Lzendesk/ui/android/conversation/messagesdivider/MessagesDividerView;", "messagesDividerView", "Lzendesk/ui/android/conversation/messagesdivider/MessagesDividerView;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewHolder extends r2 {

        @NotNull
        private final Context context;

        @NotNull
        private final MessagesDividerView messagesDividerView;

        @NotNull
        private MessagingTheme messagingTheme;

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessageLogType.values().length];
                try {
                    iArr[MessageLogType.NewMessagesDivider.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessageLogType.TimeStampDivider.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view, @NotNull Context context, @NotNull MessagingTheme messagingTheme) {
            super(view);
            view.getClass();
            context.getClass();
            messagingTheme.getClass();
            this.context = context;
            this.messagingTheme = messagingTheme;
            View viewFindViewById = view.findViewById(R.id.zma_messages_divider);
            viewFindViewById.getClass();
            this.messagesDividerView = (MessagesDividerView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesDividerRendering bind$lambda$1(MessageLogEntry.MessagesDivider messagesDivider, MessagesDividerState messagesDividerState, MessagesDividerRendering messagesDividerRendering) {
            messagesDividerRendering.getClass();
            return messagesDividerRendering.toBuilder().state(new n(messagesDivider, messagesDividerState, 0)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MessagesDividerState bind$lambda$1$lambda$0(MessageLogEntry.MessagesDivider messagesDivider, MessagesDividerState messagesDividerState, MessagesDividerState messagesDividerState2) {
            messagesDividerState2.getClass();
            return messagesDividerState2.copy(messagesDivider.getText(), messagesDividerState.getDividerColor(), messagesDividerState.getTextColor(), messagesDividerState.getTextStyle());
        }

        public final void bind(@NotNull MessageLogEntry.MessagesDivider item) {
            MessagesDividerState messagesDividerStateNewMessagesDividerState;
            item.getClass();
            int i11 = WhenMappings.$EnumSwitchMapping$0[item.getType().ordinal()];
            if (i11 == 1) {
                messagesDividerStateNewMessagesDividerState = MessagesDividerState.INSTANCE.newMessagesDividerState(this.messagingTheme.getNotifyColor());
            } else {
                if (i11 != 2) {
                    a.f();
                    return;
                }
                messagesDividerStateNewMessagesDividerState = MessagesDividerState.INSTANCE.timeDividerState(this.context, this.messagingTheme.getOnBackgroundColor());
            }
            this.messagesDividerView.render(new n(item, messagesDividerStateNewMessagesDividerState, 1));
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final MessagingTheme getMessagingTheme() {
            return this.messagingTheme;
        }

        public final void setMessagingTheme(@NotNull MessagingTheme messagingTheme) {
            messagingTheme.getClass();
            this.messagingTheme = messagingTheme;
        }
    }

    public MessagesDividerAdapterDelegate(@NotNull MessagingTheme messagingTheme) {
        messagingTheme.getClass();
        this.messagingTheme = messagingTheme;
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public boolean isForViewType(@NotNull MessageLogEntry item, @NotNull List<? extends MessageLogEntry> items, int position) {
        item.getClass();
        items.getClass();
        return item instanceof MessageLogEntry.MessagesDivider;
    }

    public void onBindViewHolder(@NotNull MessageLogEntry.MessagesDivider item, @NotNull ViewHolder holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        holder.bind(item);
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate, zendesk.messaging.android.internal.adapterdelegate.AdapterDelegate
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.zma_view_message_log_entry_messages_divider, parent, false);
        viewInflate.getClass();
        Context context = parent.getContext();
        context.getClass();
        return new ViewHolder(viewInflate, context, this.messagingTheme);
    }

    public final void setMessagingTheme(@NotNull MessagingTheme messagingTheme) {
        messagingTheme.getClass();
        this.messagingTheme = messagingTheme;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, r2 r2Var, List list) {
        onBindViewHolder((MessageLogEntry.MessagesDivider) obj, (ViewHolder) r2Var, (List<? extends Object>) list);
    }
}
