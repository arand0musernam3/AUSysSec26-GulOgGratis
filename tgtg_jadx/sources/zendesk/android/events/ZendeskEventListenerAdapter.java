package zendesk.android.events;

import e40.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.android.events.ZendeskEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0017J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0017J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rH\u0017J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fH\u0017J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011H\u0017J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0013H\u0017J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0015H\u0017J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0017H\u0017J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0019H\u0017J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001bH\u0017J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001dH\u0017J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001fH\u0017J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020!H\u0017J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020#H\u0017J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020%H\u0017J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020'H\u0017J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020)H\u0017J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020+H\u0017J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020-H\u0017J\u0010\u0010.\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020/H\u0017J\u0010\u00100\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u000201H\u0017J\u0010\u00102\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u000203H\u0017J\u0010\u00104\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u000205H\u0017J\u0010\u00106\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u000207H\u0017¨\u00068"}, d2 = {"Lzendesk/android/events/ZendeskEventListenerAdapter;", "Lzendesk/android/events/ZendeskEventListener;", "<init>", "()V", "onEvent", "", "event", "Lzendesk/android/events/ZendeskEvent;", "onMessagesShown", "Lzendesk/android/events/ZendeskEvent$MessagesShown;", "onConversationStarted", "Lzendesk/android/events/ZendeskEvent$ConversationStarted;", "onConversationOpened", "Lzendesk/android/events/ZendeskEvent$ConversationOpened;", "onUnreadMessageCountChanged", "Lzendesk/android/events/ZendeskEvent$UnreadMessageCountChanged;", "onAuthenticationFailed", "Lzendesk/android/events/ZendeskEvent$AuthenticationFailed;", "onFieldValidationFailed", "Lzendesk/android/events/ZendeskEvent$FieldValidationFailed;", "onConnectionStatusChanged", "Lzendesk/android/events/ZendeskEvent$ConnectionStatusChanged;", "onSendMessageFailed", "Lzendesk/android/events/ZendeskEvent$SendMessageFailed;", "onConversationAdded", "Lzendesk/android/events/ZendeskEvent$ConversationAdded;", "onProactiveMessageDisplayed", "Lzendesk/android/events/ZendeskEvent$ProactiveMessageDisplayed;", "onNewConversationButtonClicked", "Lzendesk/android/events/ZendeskEvent$NewConversationButtonClicked;", "onProactiveMessageClicked", "Lzendesk/android/events/ZendeskEvent$ProactiveMessageClicked;", "onConversationWithAgentRequested", "Lzendesk/android/events/ZendeskEvent$ConversationWithAgentRequested;", "onConversationAgentAssigned", "Lzendesk/android/events/ZendeskEvent$ConversationAgentAssigned;", "onConversationServedByAgent", "Lzendesk/android/events/ZendeskEvent$ConversationServedByAgent;", "onPostbackClicked", "Lzendesk/android/events/ZendeskEvent$PostbackButtonClicked;", "onConversationExtensionOpened", "Lzendesk/android/events/ZendeskEvent$ConversationExtensionOpened;", "onConversationExtensionDisplayed", "Lzendesk/android/events/ZendeskEvent$ConversationExtensionDisplayed;", "onMessagingOpened", "Lzendesk/android/events/ZendeskEvent$MessagingOpened;", "onMessagingClosed", "Lzendesk/android/events/ZendeskEvent$MessagingClosed;", "onArticleClicked", "Lzendesk/android/events/ZendeskEvent$ArticleClicked;", "onArticleBrowserClicked", "Lzendesk/android/events/ZendeskEvent$ArticleBrowserClicked;", "onNotificationDisplayed", "Lzendesk/android/events/ZendeskEvent$NotificationDisplayed;", "onNotificationOpened", "Lzendesk/android/events/ZendeskEvent$NotificationOpened;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ZendeskEventListenerAdapter implements ZendeskEventListener {
    public void onArticleBrowserClicked(@NotNull ZendeskEvent.ArticleBrowserClicked event) {
        event.getClass();
    }

    public void onArticleClicked(@NotNull ZendeskEvent.ArticleClicked event) {
        event.getClass();
    }

    public void onAuthenticationFailed(@NotNull ZendeskEvent.AuthenticationFailed event) {
        event.getClass();
    }

    public void onConnectionStatusChanged(@NotNull ZendeskEvent.ConnectionStatusChanged event) {
        event.getClass();
    }

    public void onConversationAdded(@NotNull ZendeskEvent.ConversationAdded event) {
        event.getClass();
    }

    public void onConversationAgentAssigned(@NotNull ZendeskEvent.ConversationAgentAssigned event) {
        event.getClass();
    }

    public void onConversationExtensionDisplayed(@NotNull ZendeskEvent.ConversationExtensionDisplayed event) {
        event.getClass();
    }

    public void onConversationExtensionOpened(@NotNull ZendeskEvent.ConversationExtensionOpened event) {
        event.getClass();
    }

    public void onConversationOpened(@NotNull ZendeskEvent.ConversationOpened event) {
        event.getClass();
    }

    public void onConversationServedByAgent(@NotNull ZendeskEvent.ConversationServedByAgent event) {
        event.getClass();
    }

    public void onConversationStarted(@NotNull ZendeskEvent.ConversationStarted event) {
        event.getClass();
    }

    public void onConversationWithAgentRequested(@NotNull ZendeskEvent.ConversationWithAgentRequested event) {
        event.getClass();
    }

    @Override // zendesk.android.events.ZendeskEventListener
    public final void onEvent(@NotNull ZendeskEvent event) {
        event.getClass();
        if (event instanceof ZendeskEvent.UnreadMessageCountChanged) {
            onUnreadMessageCountChanged((ZendeskEvent.UnreadMessageCountChanged) event);
            return;
        }
        if (event instanceof ZendeskEvent.AuthenticationFailed) {
            onAuthenticationFailed((ZendeskEvent.AuthenticationFailed) event);
            return;
        }
        if (event instanceof ZendeskEvent.FieldValidationFailed) {
            onFieldValidationFailed((ZendeskEvent.FieldValidationFailed) event);
            return;
        }
        if (event instanceof ZendeskEvent.ConnectionStatusChanged) {
            onConnectionStatusChanged((ZendeskEvent.ConnectionStatusChanged) event);
            return;
        }
        if (event instanceof ZendeskEvent.SendMessageFailed) {
            onSendMessageFailed((ZendeskEvent.SendMessageFailed) event);
            return;
        }
        if (event instanceof ZendeskEvent.ConversationAdded) {
            onConversationAdded((ZendeskEvent.ConversationAdded) event);
            return;
        }
        if (event instanceof ZendeskEvent.ConversationOpened) {
            onConversationOpened((ZendeskEvent.ConversationOpened) event);
            return;
        }
        if (event instanceof ZendeskEvent.ConversationStarted) {
            onConversationStarted((ZendeskEvent.ConversationStarted) event);
            return;
        }
        if (event instanceof ZendeskEvent.MessagesShown) {
            onMessagesShown((ZendeskEvent.MessagesShown) event);
            return;
        }
        if (event instanceof ZendeskEvent.ProactiveMessageDisplayed) {
            onProactiveMessageDisplayed((ZendeskEvent.ProactiveMessageDisplayed) event);
            return;
        }
        if (event instanceof ZendeskEvent.NewConversationButtonClicked) {
            onNewConversationButtonClicked((ZendeskEvent.NewConversationButtonClicked) event);
            return;
        }
        if (event instanceof ZendeskEvent.ProactiveMessageClicked) {
            onProactiveMessageClicked((ZendeskEvent.ProactiveMessageClicked) event);
            return;
        }
        if (event instanceof ZendeskEvent.ConversationWithAgentRequested) {
            onConversationWithAgentRequested((ZendeskEvent.ConversationWithAgentRequested) event);
            return;
        }
        if (event instanceof ZendeskEvent.ConversationAgentAssigned) {
            onConversationAgentAssigned((ZendeskEvent.ConversationAgentAssigned) event);
            return;
        }
        if (event instanceof ZendeskEvent.ConversationServedByAgent) {
            onConversationServedByAgent((ZendeskEvent.ConversationServedByAgent) event);
            return;
        }
        if (event instanceof ZendeskEvent.PostbackButtonClicked) {
            onPostbackClicked((ZendeskEvent.PostbackButtonClicked) event);
            return;
        }
        if (event instanceof ZendeskEvent.ConversationExtensionOpened) {
            onConversationExtensionOpened((ZendeskEvent.ConversationExtensionOpened) event);
            return;
        }
        if (event instanceof ZendeskEvent.ConversationExtensionDisplayed) {
            onConversationExtensionDisplayed((ZendeskEvent.ConversationExtensionDisplayed) event);
            return;
        }
        if (event instanceof ZendeskEvent.MessagingOpened) {
            onMessagingOpened((ZendeskEvent.MessagingOpened) event);
            return;
        }
        if (event instanceof ZendeskEvent.MessagingClosed) {
            onMessagingClosed((ZendeskEvent.MessagingClosed) event);
            return;
        }
        if (event instanceof ZendeskEvent.ArticleClicked) {
            onArticleClicked((ZendeskEvent.ArticleClicked) event);
            return;
        }
        if (event instanceof ZendeskEvent.ArticleBrowserClicked) {
            onArticleBrowserClicked((ZendeskEvent.ArticleBrowserClicked) event);
            return;
        }
        if (event instanceof ZendeskEvent.NotificationDisplayed) {
            onNotificationDisplayed((ZendeskEvent.NotificationDisplayed) event);
        } else if (event instanceof ZendeskEvent.NotificationOpened) {
            onNotificationOpened((ZendeskEvent.NotificationOpened) event);
        } else {
            a.f();
        }
    }

    public void onFieldValidationFailed(@NotNull ZendeskEvent.FieldValidationFailed event) {
        event.getClass();
    }

    public void onMessagesShown(@NotNull ZendeskEvent.MessagesShown event) {
        event.getClass();
    }

    public void onMessagingClosed(@NotNull ZendeskEvent.MessagingClosed event) {
        event.getClass();
    }

    public void onMessagingOpened(@NotNull ZendeskEvent.MessagingOpened event) {
        event.getClass();
    }

    public void onNewConversationButtonClicked(@NotNull ZendeskEvent.NewConversationButtonClicked event) {
        event.getClass();
    }

    public void onNotificationDisplayed(@NotNull ZendeskEvent.NotificationDisplayed event) {
        event.getClass();
    }

    public void onNotificationOpened(@NotNull ZendeskEvent.NotificationOpened event) {
        event.getClass();
    }

    public void onPostbackClicked(@NotNull ZendeskEvent.PostbackButtonClicked event) {
        event.getClass();
    }

    public void onProactiveMessageClicked(@NotNull ZendeskEvent.ProactiveMessageClicked event) {
        event.getClass();
    }

    public void onProactiveMessageDisplayed(@NotNull ZendeskEvent.ProactiveMessageDisplayed event) {
        event.getClass();
    }

    public void onSendMessageFailed(@NotNull ZendeskEvent.SendMessageFailed event) {
        event.getClass();
    }

    public void onUnreadMessageCountChanged(@NotNull ZendeskEvent.UnreadMessageCountChanged event) {
        event.getClass();
    }
}
