package zendesk.ui.android.conversations.cell;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lzendesk/ui/android/conversations/cell/ConversationUnreadMessagesViewHolder;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "unReadMessagesTextView", "Landroid/widget/TextView;", "onBind", "", "unreadConversationsCount", "", "unreadMessagesCountBackgroundColor", "unreadMessagesCountTextColor", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationUnreadMessagesViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationUnreadMessagesViewHolder.kt\nzendesk/ui/android/conversations/cell/ConversationUnreadMessagesViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,47:1\n257#2,2:48\n*S KotlinDebug\n*F\n+ 1 ConversationUnreadMessagesViewHolder.kt\nzendesk/ui/android/conversations/cell/ConversationUnreadMessagesViewHolder\n*L\n44#1:48,2\n*E\n"})
public final class ConversationUnreadMessagesViewHolder {
    public static final int $stable = 8;

    @NotNull
    private final TextView unReadMessagesTextView;

    @NotNull
    private final View view;

    public ConversationUnreadMessagesViewHolder(@NotNull View view) {
        view.getClass();
        this.view = view;
        View viewFindViewById = view.findViewById(R.id.zuia_conversation_unread_count);
        viewFindViewById.getClass();
        this.unReadMessagesTextView = (TextView) viewFindViewById;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final void onBind(int unreadConversationsCount, int unreadMessagesCountBackgroundColor, int unreadMessagesCountTextColor) {
        boolean z11 = unreadConversationsCount > 0;
        if (z11) {
            UnreadMessagesTextHelperConversationCell unreadMessagesTextHelperConversationCell = UnreadMessagesTextHelperConversationCell.INSTANCE;
            Context context = this.unReadMessagesTextView.getContext();
            context.getClass();
            this.unReadMessagesTextView.setText(unreadMessagesTextHelperConversationCell.getUnreadMessagesText$zendesk_ui_ui_android(unreadConversationsCount, context));
            this.unReadMessagesTextView.setTextColor(unreadMessagesCountTextColor);
            this.unReadMessagesTextView.getBackground().setTint(unreadMessagesCountBackgroundColor);
        }
        this.unReadMessagesTextView.setVisibility(z11 ? 0 : 8);
    }
}
