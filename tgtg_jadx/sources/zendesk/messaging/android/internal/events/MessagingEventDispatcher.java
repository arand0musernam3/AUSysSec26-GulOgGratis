package zendesk.messaging.android.internal.events;

import com.braze.Constants;
import ib0.a;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import zendesk.android.events.ArticleBrowserClickedDetails;
import zendesk.android.events.ArticleClickedDetails;
import zendesk.android.events.ConnectionStatus;
import zendesk.android.events.ConversationAgentAssignedDetails;
import zendesk.android.events.ConversationExtensionDisplayedDetails;
import zendesk.android.events.ConversationExtensionOpenedDetails;
import zendesk.android.events.ConversationServedByAgentDetails;
import zendesk.android.events.ConversationUnreadCountChange;
import zendesk.android.events.ConversationWithAgentRequestedDetails;
import zendesk.android.events.NewConversationButtonClickedDetails;
import zendesk.android.events.NotificationDisplayedDetails;
import zendesk.android.events.NotificationOpenedDetails;
import zendesk.android.events.PostbackButtonClickedDetails;
import zendesk.android.events.ProactiveMessageClickedDetails;
import zendesk.android.events.ProactiveMessageDisplayedDetails;
import zendesk.android.events.ZendeskEvent;
import zendesk.android.events.ZendeskMessage;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.core.android.internal.DateKtxKt;
import zendesk.faye.internal.Bayeux;
import zendesk.messaging.android.internal.di.MessagingScope;
import zendesk.messaging.android.internal.validation.ValidationError;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0010J7\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0002\b\u0015J)\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0017J1\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ1\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\fH\u0000¢\u0006\u0002\b!J1\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\fH\u0000¢\u0006\u0002\b#J)\u0010$\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b%J)\u0010&\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020'H\u0000¢\u0006\u0002\b(J\u0014\u0010)\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0013J)\u0010,\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020-H\u0000¢\u0006\u0002\b.J)\u0010/\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b0J1\u00101\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00102\u001a\u00020\fH\u0000¢\u0006\u0002\b3J1\u00104\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00105\u001a\u00020\fH\u0000¢\u0006\u0002\b6J1\u00107\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00105\u001a\u00020\fH\u0000¢\u0006\u0002\b8J!\u00109\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b:J!\u0010;\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b<J1\u0010=\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\fH\u0000¢\u0006\u0002\b@J)\u0010A\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\fH\u0000¢\u0006\u0002\bBJ1\u0010C\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010D\u001a\u00020E2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\bFJ)\u0010G\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\bHR\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "", "dispatchEvent", "Lkotlin/Function1;", "Lzendesk/android/events/ZendeskEvent;", "", "conversationKit", "Lzendesk/conversationkit/android/ConversationKit;", "<init>", "(Lkotlin/jvm/functions/Function1;Lzendesk/conversationkit/android/ConversationKit;)V", "handleConversationOpenedEvent", "conversationId", "", "timestamp", "", "id", "handleConversationOpenedEvent$zendesk_messaging_messaging_android", "handleMessagesShownEvent", "messages", "", "Lzendesk/android/events/ZendeskMessage;", "handleMessagesShownEvent$zendesk_messaging_messaging_android", "handleConversationStartedEvent", "handleConversationStartedEvent$zendesk_messaging_messaging_android", "handleUnreadMessageCountChanged", Bayeux.KEY_DATA, "Lzendesk/android/events/ConversationUnreadCountChange;", "currentUnreadCount", "", "handleUnreadMessageCountChanged$zendesk_messaging_messaging_android", "handleProactiveMessageDisplayedEvent", "proactiveMessageId", "campaignId", "handleProactiveMessageDisplayedEvent$zendesk_messaging_messaging_android", "handleProactiveMessageClickedEvent", "handleProactiveMessageClickedEvent$zendesk_messaging_messaging_android", "handleConversationWithAgentRequestedEvent", "handleConversationWithAgentRequestedEvent$zendesk_messaging_messaging_android", "handleConversationServedByAgent", "Lzendesk/android/events/ConversationServedByAgentDetails;", "handleConversationServedByAgent$zendesk_messaging_messaging_android", "handleFieldValidationFailedEvent", "result", "Lzendesk/messaging/android/internal/validation/ValidationError;", "handleNewConversationButtonClicked", "Lzendesk/android/events/NewConversationButtonClickedDetails;", "handleNewConversationButtonClicked$zendesk_messaging_messaging_android", "handleConversationAgentAssignedEvent", "handleConversationAgentAssignedEvent$zendesk_messaging_messaging_android", "handlePostbackButtonClickedEvent", "actionName", "handlePostbackButtonClickedEvent$zendesk_messaging_messaging_android", "handleConversationExtensionOpenedEvent", Constants.BRAZE_WEBVIEW_URL_EXTRA, "handleConversationExtensionOpenedEvent$zendesk_messaging_messaging_android", "handleConversationExtensionDisplayedEvent", "handleConversationExtensionDisplayedEvent$zendesk_messaging_messaging_android", "handleMessagingOpenedEvent", "handleMessagingOpenedEvent$zendesk_messaging_messaging_android", "handleMessagingClosedEvent", "handleMessagingClosedEvent$zendesk_messaging_messaging_android", "handleArticleClickedEvent", "articleId", "articleTitle", "handleArticleClickedEvent$zendesk_messaging_messaging_android", "handleArticleClickedBrowserEvent", "handleArticleClickedBrowserEvent$zendesk_messaging_messaging_android", "handleNotificationDisplayedEvent", "messageReceivedTimestamp", "", "handleNotificationDisplayedEvent$zendesk_messaging_messaging_android", "handleNotificationOpenedEvent", "handleNotificationOpenedEvent$zendesk_messaging_messaging_android", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@MessagingScope
public final class MessagingEventDispatcher {

    @NotNull
    private final Function1<ZendeskEvent, Unit> dispatchEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagingEventDispatcher(@NotNull Function1<? super ZendeskEvent, Unit> function1, @NotNull ConversationKit conversationKit) {
        function1.getClass();
        conversationKit.getClass();
        this.dispatchEvent = function1;
        conversationKit.addEventListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MessagingEventDispatcher messagingEventDispatcher, ConversationKitEvent conversationKitEvent) {
        conversationKitEvent.getClass();
        if (conversationKitEvent instanceof ConversationKitEvent.ConnectionStatusChanged) {
            messagingEventDispatcher.dispatchEvent.invoke(new ZendeskEvent.ConnectionStatusChanged(ConnectionStatus.valueOf(((ConversationKitEvent.ConnectionStatusChanged) conversationKitEvent).getConnectionStatus().name())));
        } else if (conversationKitEvent instanceof ConversationKitEvent.SendMessageFailed) {
            messagingEventDispatcher.dispatchEvent.invoke(new ZendeskEvent.SendMessageFailed(((ConversationKitEvent.SendMessageFailed) conversationKitEvent).getCause()));
        } else if (conversationKitEvent instanceof ConversationKitEvent.ConversationAddedSuccess) {
            messagingEventDispatcher.dispatchEvent.invoke(new ZendeskEvent.ConversationAdded(((ConversationKitEvent.ConversationAddedSuccess) conversationKitEvent).getConversation().getId()));
        }
    }

    public static /* synthetic */ void handleArticleClickedBrowserEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleArticleClickedBrowserEvent$zendesk_messaging_messaging_android(str, j9, str2);
    }

    public static /* synthetic */ void handleArticleClickedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, long j11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleArticleClickedEvent$zendesk_messaging_messaging_android(str, j9, j11, str2);
    }

    public static /* synthetic */ void handleConversationAgentAssignedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleConversationAgentAssignedEvent$zendesk_messaging_messaging_android(str, j9, str2);
    }

    public static /* synthetic */ void handleConversationExtensionDisplayedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleConversationExtensionDisplayedEvent$zendesk_messaging_messaging_android(str, j9, str2, str3);
    }

    public static /* synthetic */ void handleConversationExtensionOpenedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleConversationExtensionOpenedEvent$zendesk_messaging_messaging_android(str, j9, str2, str3);
    }

    public static /* synthetic */ void handleConversationOpenedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        if ((i11 & 4) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        messagingEventDispatcher.handleConversationOpenedEvent$zendesk_messaging_messaging_android(str, j9, str2);
    }

    public static /* synthetic */ void handleConversationServedByAgent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, ConversationServedByAgentDetails conversationServedByAgentDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleConversationServedByAgent$zendesk_messaging_messaging_android(str, j9, conversationServedByAgentDetails);
    }

    public static /* synthetic */ void handleConversationStartedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        if ((i11 & 4) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        messagingEventDispatcher.handleConversationStartedEvent$zendesk_messaging_messaging_android(str, j9, str2);
    }

    public static /* synthetic */ void handleConversationWithAgentRequestedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleConversationWithAgentRequestedEvent$zendesk_messaging_messaging_android(str, j9, str2);
    }

    public static /* synthetic */ void handleMessagesShownEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleMessagesShownEvent$zendesk_messaging_messaging_android(str, j9, str2, list);
    }

    public static /* synthetic */ void handleMessagingClosedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleMessagingClosedEvent$zendesk_messaging_messaging_android(str, j9);
    }

    public static /* synthetic */ void handleMessagingOpenedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleMessagingOpenedEvent$zendesk_messaging_messaging_android(str, j9);
    }

    public static /* synthetic */ void handleNewConversationButtonClicked$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, NewConversationButtonClickedDetails newConversationButtonClickedDetails, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleNewConversationButtonClicked$zendesk_messaging_messaging_android(str, j9, newConversationButtonClickedDetails);
    }

    public static /* synthetic */ void handleNotificationDisplayedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, double d3, String str2, long j9, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        String str3 = str2;
        if ((i11 & 8) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleNotificationDisplayedEvent$zendesk_messaging_messaging_android(str, d3, str3, j9);
    }

    public static /* synthetic */ void handleNotificationOpenedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, String str2, long j9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        if ((i11 & 4) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleNotificationOpenedEvent$zendesk_messaging_messaging_android(str, str2, j9);
    }

    public static /* synthetic */ void handlePostbackButtonClickedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i11 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handlePostbackButtonClickedEvent$zendesk_messaging_messaging_android(str, j9, str2, str3);
    }

    public static /* synthetic */ void handleProactiveMessageClickedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i12 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleProactiveMessageClickedEvent$zendesk_messaging_messaging_android(str, j9, i11, str2);
    }

    public static /* synthetic */ void handleProactiveMessageDisplayedEvent$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i12 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleProactiveMessageDisplayedEvent$zendesk_messaging_messaging_android(str, j9, i11, str2);
    }

    public static /* synthetic */ void handleUnreadMessageCountChanged$zendesk_messaging_messaging_android$default(MessagingEventDispatcher messagingEventDispatcher, String str, long j9, ConversationUnreadCountChange conversationUnreadCountChange, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = UUID.randomUUID().toString();
        }
        if ((i12 & 2) != 0) {
            j9 = DateKtxKt.toUnixTimeStamp(new Date());
        }
        messagingEventDispatcher.handleUnreadMessageCountChanged$zendesk_messaging_messaging_android(str, j9, conversationUnreadCountChange, i11);
    }

    public final void handleArticleClickedBrowserEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull String url) {
        id2.getClass();
        url.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.ArticleBrowserClicked(id2, timestamp, new ArticleBrowserClickedDetails(url)));
    }

    public final void handleArticleClickedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, long articleId, @NotNull String articleTitle) {
        id2.getClass();
        articleTitle.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.ArticleClicked(id2, timestamp, new ArticleClickedDetails(articleId, articleTitle)));
    }

    public final void handleConversationAgentAssignedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull String conversationId) {
        id2.getClass();
        conversationId.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.ConversationAgentAssigned(id2, timestamp, new ConversationAgentAssignedDetails(conversationId)));
    }

    public final void handleConversationExtensionDisplayedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull String conversationId, @NotNull String url) {
        a0.C(id2, conversationId, url);
        this.dispatchEvent.invoke(new ZendeskEvent.ConversationExtensionDisplayed(id2, timestamp, new ConversationExtensionDisplayedDetails(conversationId, url)));
    }

    public final void handleConversationExtensionOpenedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull String conversationId, @NotNull String url) {
        a0.C(id2, conversationId, url);
        this.dispatchEvent.invoke(new ZendeskEvent.ConversationExtensionOpened(id2, timestamp, new ConversationExtensionOpenedDetails(conversationId, url)));
    }

    public final void handleConversationOpenedEvent$zendesk_messaging_messaging_android(@Nullable String conversationId, long timestamp, @NotNull String id2) {
        id2.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.ConversationOpened(id2, conversationId, timestamp));
    }

    public final void handleConversationServedByAgent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull ConversationServedByAgentDetails data) {
        id2.getClass();
        data.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.ConversationServedByAgent(id2, timestamp, data));
    }

    public final void handleConversationStartedEvent$zendesk_messaging_messaging_android(@NotNull String conversationId, long timestamp, @NotNull String id2) {
        conversationId.getClass();
        id2.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.ConversationStarted(id2, conversationId, timestamp));
    }

    public final void handleConversationWithAgentRequestedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull String conversationId) {
        id2.getClass();
        conversationId.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.ConversationWithAgentRequested(id2, timestamp, new ConversationWithAgentRequestedDetails(conversationId)));
    }

    public final void handleFieldValidationFailedEvent(@NotNull List<? extends ValidationError> result) {
        result.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.FieldValidationFailed(result));
    }

    public final void handleMessagesShownEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull String conversationId, @NotNull List<ZendeskMessage> messages) {
        id2.getClass();
        conversationId.getClass();
        messages.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.MessagesShown(id2, conversationId, timestamp, messages));
    }

    public final void handleMessagingClosedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp) {
        id2.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.MessagingClosed(id2, timestamp));
    }

    public final void handleMessagingOpenedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp) {
        id2.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.MessagingOpened(id2, timestamp));
    }

    public final void handleNewConversationButtonClicked$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull NewConversationButtonClickedDetails data) {
        id2.getClass();
        data.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.NewConversationButtonClicked(id2, timestamp, data));
    }

    public final void handleNotificationDisplayedEvent$zendesk_messaging_messaging_android(@NotNull String conversationId, double messageReceivedTimestamp, @NotNull String id2, long timestamp) {
        conversationId.getClass();
        id2.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.NotificationDisplayed(id2, timestamp, new NotificationDisplayedDetails(conversationId, messageReceivedTimestamp)));
    }

    public final void handleNotificationOpenedEvent$zendesk_messaging_messaging_android(@NotNull String conversationId, @NotNull String id2, long timestamp) {
        conversationId.getClass();
        id2.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.NotificationOpened(id2, timestamp, new NotificationOpenedDetails(conversationId)));
    }

    public final void handlePostbackButtonClickedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull String conversationId, @NotNull String actionName) {
        a0.C(id2, conversationId, actionName);
        this.dispatchEvent.invoke(new ZendeskEvent.PostbackButtonClicked(id2, timestamp, new PostbackButtonClickedDetails(conversationId, actionName)));
    }

    public final void handleProactiveMessageClickedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, int proactiveMessageId, @NotNull String campaignId) {
        id2.getClass();
        campaignId.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.ProactiveMessageClicked(id2, timestamp, new ProactiveMessageClickedDetails(proactiveMessageId, campaignId)));
    }

    public final void handleProactiveMessageDisplayedEvent$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, int proactiveMessageId, @NotNull String campaignId) {
        id2.getClass();
        campaignId.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.ProactiveMessageDisplayed(id2, timestamp, new ProactiveMessageDisplayedDetails(proactiveMessageId, campaignId)));
    }

    public final void handleUnreadMessageCountChanged$zendesk_messaging_messaging_android(@NotNull String id2, long timestamp, @NotNull ConversationUnreadCountChange data, int currentUnreadCount) {
        id2.getClass();
        data.getClass();
        this.dispatchEvent.invoke(new ZendeskEvent.UnreadMessageCountChanged(id2, timestamp, data, currentUnreadCount));
    }
}
