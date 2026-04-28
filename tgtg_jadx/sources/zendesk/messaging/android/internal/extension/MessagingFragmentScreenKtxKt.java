package zendesk.messaging.android.internal.extension;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment;
import zendesk.messaging.android.internal.messagingscreen.MessagingFragmentScreen;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"getInstance", "Landroidx/fragment/app/Fragment;", "Lzendesk/messaging/android/internal/messagingscreen/MessagingFragmentScreen;", "credentials", "", "getTagName", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MessagingFragmentScreenKtxKt {
    @NotNull
    public static final Fragment getInstance(@NotNull MessagingFragmentScreen messagingFragmentScreen, @NotNull String str) {
        messagingFragmentScreen.getClass();
        str.getClass();
        if (!(messagingFragmentScreen instanceof MessagingFragmentScreen.ConversationFragmentScreen)) {
            return ConversationListFragment.INSTANCE.newInstance(str);
        }
        MessagingFragmentScreen.ConversationFragmentScreen conversationFragmentScreen = (MessagingFragmentScreen.ConversationFragmentScreen) messagingFragmentScreen;
        return ConversationFragment.INSTANCE.newInstance(str, conversationFragmentScreen.getConversationId(), conversationFragmentScreen.getProactiveId(), conversationFragmentScreen.getMessagingScreenNavigation(), conversationFragmentScreen.getShouldStartDefaultConversation());
    }

    @NotNull
    public static final String getTagName(@NotNull MessagingFragmentScreen messagingFragmentScreen) {
        messagingFragmentScreen.getClass();
        return messagingFragmentScreen instanceof MessagingFragmentScreen.ConversationFragmentScreen ? "ConversationFragment" : ConversationListFragment.NAME;
    }
}
