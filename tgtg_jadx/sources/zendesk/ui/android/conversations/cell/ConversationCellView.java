package zendesk.ui.android.conversations.cell;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.ui.android.internal.xml.AccessibilityExtKt;
import zendesk.ui.android.R;
import zendesk.ui.android.conversation.bottomsheet.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0014J\u0014\u0010\u001d\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0003H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/conversations/cell/ConversationCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/conversations/cell/ViewHolderBinder;", "Lzendesk/ui/android/conversations/cell/ConversationCellState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "conversationAvatarViewHolder", "Lzendesk/ui/android/conversations/cell/ConversationAvatarViewHolder;", "conversationTitleViewHolder", "Lzendesk/ui/android/conversations/cell/ConversationTitleViewHolder;", "conversationLastMessageViewHolder", "Lzendesk/ui/android/conversations/cell/ConversationLastMessageViewHolder;", "conversationDateTimeStampViewHolder", "Lzendesk/ui/android/conversations/cell/ConversationDateTimeStampViewHolder;", "conversationUnreadMessagesViewHolder", "Lzendesk/ui/android/conversations/cell/ConversationUnreadMessagesViewHolder;", "conversationCellDividerViewHolder", "Lzendesk/ui/android/conversations/cell/ConversationCellDividerViewHolder;", "onBind", "", "viewState", "onDetachedFromWindow", "updateAccessibility", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationCellView extends ConstraintLayout implements ViewHolderBinder<ConversationCellState> {
    public static final int $stable = 8;

    @NotNull
    private final ConversationAvatarViewHolder conversationAvatarViewHolder;

    @NotNull
    private final ConversationCellDividerViewHolder conversationCellDividerViewHolder;

    @NotNull
    private final ConversationDateTimeStampViewHolder conversationDateTimeStampViewHolder;

    @NotNull
    private final ConversationLastMessageViewHolder conversationLastMessageViewHolder;

    @NotNull
    private final ConversationTitleViewHolder conversationTitleViewHolder;

    @NotNull
    private final ConversationUnreadMessagesViewHolder conversationUnreadMessagesViewHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationCellView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_ConversationCellStyle, false);
        View viewInflate = View.inflate(context, R.layout.zuia_view_conversation_cell, this);
        viewInflate.getClass();
        this.conversationAvatarViewHolder = new ConversationAvatarViewHolder(viewInflate);
        this.conversationTitleViewHolder = new ConversationTitleViewHolder(viewInflate);
        this.conversationLastMessageViewHolder = new ConversationLastMessageViewHolder(viewInflate);
        this.conversationDateTimeStampViewHolder = new ConversationDateTimeStampViewHolder(viewInflate);
        this.conversationUnreadMessagesViewHolder = new ConversationUnreadMessagesViewHolder(viewInflate);
        this.conversationCellDividerViewHolder = new ConversationCellDividerViewHolder(viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBind$lambda$0(ConversationCellState conversationCellState, View view) {
        conversationCellState.getClickListener().invoke();
    }

    private final void updateAccessibility(ConversationCellView conversationCellView, ConversationCellState conversationCellState) {
        AccessibilityExtKt.overrideAccessibilityNodeClassNameInfo(conversationCellView, Button.class.getName());
        conversationCellView.setContentDescription(conversationCellState.getAccessibilityTitle());
    }

    @Override // zendesk.ui.android.conversations.cell.ViewHolderBinder
    public void onBind(@NotNull ConversationCellState viewState) {
        viewState.getClass();
        setOnClickListener(new a(viewState, 2));
        updateAccessibility(this, viewState);
        int unreadMessagesCount = viewState.getUnreadMessagesCount();
        this.conversationAvatarViewHolder.onBind$zendesk_ui_ui_android(viewState.getAvatarImageState());
        this.conversationTitleViewHolder.onBind$zendesk_ui_ui_android(viewState.getConversationTitle(), viewState.getConversationTitleTextColor());
        this.conversationLastMessageViewHolder.onBind$zendesk_ui_ui_android(viewState.getLastMessage(), unreadMessagesCount, viewState.getLastMessageTextColor());
        this.conversationDateTimeStampViewHolder.onBind$zendesk_ui_ui_android(viewState.getDateTimeStamp(), viewState.getDateTimestampTextColor());
        this.conversationUnreadMessagesViewHolder.onBind(unreadMessagesCount, viewState.getUnreadMessagesCountBackgroundColor(), viewState.getUnreadMessagesCountTextColor());
        this.conversationCellDividerViewHolder.onBind$zendesk_ui_ui_android(viewState.getConversationCellDividerColor());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.conversationAvatarViewHolder.onUnbind$zendesk_ui_ui_android();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationCellView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationCellView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ConversationCellView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationCellView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
