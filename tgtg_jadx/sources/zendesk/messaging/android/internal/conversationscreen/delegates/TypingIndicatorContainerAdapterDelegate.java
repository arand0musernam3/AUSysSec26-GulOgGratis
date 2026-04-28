package zendesk.messaging.android.internal.conversationscreen.delegates;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.r2;
import hb0.u;
import hb0.v;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.avatar.AvatarImageRendering;
import zendesk.ui.android.conversation.avatar.AvatarImageState;
import zendesk.ui.android.conversation.avatar.AvatarImageView;
import zendesk.ui.android.conversation.avatar.AvatarMask;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;
import zendesk.ui.android.conversation.typingindicatorcell.TypingIndicatorCellRendering;
import zendesk.ui.android.conversation.typingindicatorcell.TypingIndicatorCellState;
import zendesk.ui.android.conversation.typingindicatorcell.TypingIndicatorCellView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0010H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\b¨\u0006\u001c"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/TypingIndicatorContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TypingIndicatorContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/TypingIndicatorContainerAdapterDelegate$ViewHolder;", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "isForViewType", "", "item", "items", "", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", "holder", "payloads", "", "ViewHolder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TypingIndicatorContainerAdapterDelegate extends ListItemAdapterDelegate<MessageLogEntry.TypingIndicatorContainer, MessageLogEntry, ViewHolder> {

    @NotNull
    private MessagingTheme messagingTheme;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/TypingIndicatorContainerAdapterDelegate$ViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "itemView", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "<init>", "(Landroid/view/View;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "", "renderContent", "()V", "Landroid/view/ViewGroup;", "parentView", "createTypingIndicatorCell", "(Landroid/view/ViewGroup;Lzendesk/messaging/android/internal/model/MessagingTheme;)Landroid/view/View;", "", "avatarUrl", "renderAvatar", "(Ljava/lang/String;)V", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TypingIndicatorContainer;", "item", "bind", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$TypingIndicatorContainer;)V", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "Landroid/widget/TextView;", "labelView", "Landroid/widget/TextView;", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "avatarView", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "Landroid/widget/LinearLayout;", "contentView", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "receiptView", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewHolder extends r2 {

        @NotNull
        private final AvatarImageView avatarView;

        @NotNull
        private final LinearLayout contentView;

        @NotNull
        private final TextView labelView;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final MessageReceiptView receiptView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view, @NotNull MessagingTheme messagingTheme) {
            super(view);
            view.getClass();
            messagingTheme.getClass();
            this.messagingTheme = messagingTheme;
            View viewFindViewById = view.findViewById(R.id.zma_message_label);
            viewFindViewById.getClass();
            this.labelView = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.zma_avatar_view);
            viewFindViewById2.getClass();
            this.avatarView = (AvatarImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.zma_message_content);
            viewFindViewById3.getClass();
            this.contentView = (LinearLayout) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.zma_message_receipt);
            viewFindViewById4.getClass();
            this.receiptView = (MessageReceiptView) viewFindViewById4;
        }

        private final View createTypingIndicatorCell(ViewGroup parentView, MessagingTheme messagingTheme) {
            Context context = parentView.getContext();
            context.getClass();
            TypingIndicatorCellView typingIndicatorCellView = new TypingIndicatorCellView(context, null, 0, 0, 14, null);
            typingIndicatorCellView.render(new v(messagingTheme, 1));
            return typingIndicatorCellView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TypingIndicatorCellRendering createTypingIndicatorCell$lambda$3$lambda$2(MessagingTheme messagingTheme, TypingIndicatorCellRendering typingIndicatorCellRendering) {
            typingIndicatorCellRendering.getClass();
            return typingIndicatorCellRendering.toBuilder().state(new v(messagingTheme, 0)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TypingIndicatorCellState createTypingIndicatorCell$lambda$3$lambda$2$lambda$1(MessagingTheme messagingTheme, TypingIndicatorCellState typingIndicatorCellState) {
            typingIndicatorCellState.getClass();
            return typingIndicatorCellState.copy(Integer.valueOf(messagingTheme.getInboundMessageColor()), Integer.valueOf(messagingTheme.getOnBusinessMessageColor()));
        }

        private final void renderAvatar(String avatarUrl) {
            this.avatarView.render(new u(avatarUrl, this, 1));
            this.avatarView.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AvatarImageRendering renderAvatar$lambda$5(String str, ViewHolder viewHolder, AvatarImageRendering avatarImageRendering) {
            avatarImageRendering.getClass();
            return avatarImageRendering.toBuilder().state(new u(str, viewHolder, 0)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AvatarImageState renderAvatar$lambda$5$lambda$4(String str, ViewHolder viewHolder, AvatarImageState avatarImageState) {
            avatarImageState.getClass();
            return AvatarImageState.copy$default(avatarImageState, Uri.parse(str), false, 0, Integer.valueOf(viewHolder.messagingTheme.getInboundMessageColor()), AvatarMask.CIRCLE, 6, null);
        }

        private final void renderContent() {
            LinearLayout linearLayout = this.contentView;
            linearLayout.removeAllViews();
            linearLayout.addView(createTypingIndicatorCell(this.contentView, this.messagingTheme));
            linearLayout.getLayoutParams().width = -2;
            linearLayout.requestLayout();
        }

        public final void bind(@NotNull MessageLogEntry.TypingIndicatorContainer item) {
            item.getClass();
            this.receiptView.setVisibility(8);
            this.labelView.setVisibility(8);
            renderContent();
            renderAvatar(item.getAvatarUrl());
        }
    }

    public TypingIndicatorContainerAdapterDelegate(@NotNull MessagingTheme messagingTheme) {
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
        return item instanceof MessageLogEntry.TypingIndicatorContainer;
    }

    public void onBindViewHolder(@NotNull MessageLogEntry.TypingIndicatorContainer item, @NotNull ViewHolder holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        holder.bind(item);
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate, zendesk.messaging.android.internal.adapterdelegate.AdapterDelegate
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.zma_view_message_log_entry_message_container, parent, false);
        viewInflate.getClass();
        return new ViewHolder(viewInflate, this.messagingTheme);
    }

    public final void setMessagingTheme(@NotNull MessagingTheme messagingTheme) {
        messagingTheme.getClass();
        this.messagingTheme = messagingTheme;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, r2 r2Var, List list) {
        onBindViewHolder((MessageLogEntry.TypingIndicatorContainer) obj, (ViewHolder) r2Var, (List<? extends Object>) list);
    }
}
