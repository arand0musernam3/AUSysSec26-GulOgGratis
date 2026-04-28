package zendesk.ui.android.conversations.cell;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lzendesk/ui/android/conversations/cell/UnreadMessagesTextHelperConversationCell;", "", "<init>", "()V", "MAX_CONVERSATIONS", "", "getUnreadMessagesText", "", "toRender", "context", "Landroid/content/Context;", "getUnreadMessagesText$zendesk_ui_ui_android", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnreadMessagesTextHelperConversationCell {
    public static final int $stable = 0;

    @NotNull
    public static final UnreadMessagesTextHelperConversationCell INSTANCE = new UnreadMessagesTextHelperConversationCell();
    private static final int MAX_CONVERSATIONS = 99;

    private UnreadMessagesTextHelperConversationCell() {
    }

    @NotNull
    public final String getUnreadMessagesText$zendesk_ui_ui_android(int toRender, @NotNull Context context) {
        context.getClass();
        if (toRender <= MAX_CONVERSATIONS) {
            return String.valueOf(toRender);
        }
        String string = context.getString(R.string.zuia_conversation_list_item_unread_indicator_maximum);
        string.getClass();
        return string;
    }
}
