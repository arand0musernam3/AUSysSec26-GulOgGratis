package zendesk.messaging.android.internal.conversationscreen;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.messaging.android.internal.StubUriHandler;
import zendesk.messaging.android.internal.StubWebViewUriHandler;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.WebViewUriHandler;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogListenersKt;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.carousel.CarouselAction;
import zendesk.ui.android.conversation.form.DisplayedField;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001iB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010R*\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010R*\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b0\tj\u0002`#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010R$\u0010'\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016R\u001a\u0010*\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R*\u00105\u001a\u0012\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000b0\tj\u0002`48\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010\u000e\u001a\u0004\b6\u0010\u0010R0\u00109\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b07j\u0002`88\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R6\u0010A\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000b07j\u0002`@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R$\u0010C\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010\u0014\u001a\u0004\bD\u0010\u0016R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010\u000e\u001a\u0004\bF\u0010\u0010R$\u0010G\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010\u0014\u001a\u0004\bH\u0010\u0016R$\u0010I\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010\u0014\u001a\u0004\bJ\u0010\u0016R0\u0010M\u001a\u0018\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b07j\u0002`L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u0010<R&\u0010P\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010\u000e\u001a\u0004\bQ\u0010\u0010R&\u0010R\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010\u000e\u001a\u0004\bS\u0010\u0010R,\u0010T\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010\u0014\u001a\u0004\bU\u0010\u0016\"\u0004\bV\u0010WR$\u0010X\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010\u0014\u001a\u0004\bY\u0010\u0016R$\u0010Z\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0011j\u0002`\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010\u0014\u001a\u0004\b[\u0010\u0016R&\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010\u000e\u001a\u0004\b]\u0010\u0010R\u001a\u0010^\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR&\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010\u000e\u001a\u0004\bc\u0010\u0010R\u001a\u0010e\u001a\u00020d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010h¨\u0006j"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering;", "", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;", "builder", "<init>", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;", "Lkotlin/Function1;", "", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormFocusChangedListener;", "onFormFocusChanged", "Lkotlin/jvm/functions/Function1;", "getOnFormFocusChanged$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "Lzendesk/messaging/android/internal/conversationscreen/OnClickLambda;", "onBackButtonClicked", "Lkotlin/jvm/functions/Function0;", "getOnBackButtonClicked$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function0;", "", "Lzendesk/messaging/android/internal/conversationscreen/OnSendButtonClickLambda;", "onSendButtonClicked", "getOnSendButtonClicked$zendesk_messaging_messaging_android", "", "onAttachButtonClicked", "getOnAttachButtonClicked$zendesk_messaging_messaging_android", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnReplyActionSelected;", "onReplyActionSelected", "getOnReplyActionSelected$zendesk_messaging_messaging_android", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "getOnFailedMessageClicked$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnRetryConnectionClickedListener;", "onRetryConnectionClicked", "getOnRetryConnectionClicked$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/UriHandler;", "onUriClicked", "Lzendesk/messaging/android/internal/UriHandler;", "getOnUriClicked$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/UriHandler;", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "onWebViewUriClicked", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "getOnWebViewUriClicked$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/WebViewUriHandler;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCarouselAction;", "onCarouselAction", "getOnCarouselAction$zendesk_messaging_messaging_android", "Lkotlin/Function2;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "onSendPostbackMessage", "Lkotlin/jvm/functions/Function2;", "getOnSendPostbackMessage$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function2;", "", "Lzendesk/conversationkit/android/model/Field;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormCompleted;", "onFormCompleted", "getOnFormCompleted$zendesk_messaging_messaging_android", "onTyping", "getOnTyping$zendesk_messaging_messaging_android", "onMessageComposerTextChanged", "getOnMessageComposerTextChanged$zendesk_messaging_messaging_android", "onDeniedPermissionActionClicked", "getOnDeniedPermissionActionClicked$zendesk_messaging_messaging_android", "onDeniedPermissionDismissed", "getOnDeniedPermissionDismissed$zendesk_messaging_messaging_android", "Lzendesk/ui/android/conversation/form/DisplayedField;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "onFormDisplayedFieldsChanged", "getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android", "", "onLoadMoreMessages", "getOnLoadMoreMessages$zendesk_messaging_messaging_android", "onRetryLoadMoreClickedListener", "getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android", "onRetryLoadConversationClicked", "getOnRetryLoadConversationClicked$zendesk_messaging_messaging_android", "setOnRetryLoadConversationClicked$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function0;)V", "onSeeLatestClickedListener", "getOnSeeLatestClickedListener$zendesk_messaging_messaging_android", "onPostbackFailedDismissedListener", "getOnPostbackFailedDismissedListener$zendesk_messaging_messaging_android", "onCopyText", "getOnCopyText$zendesk_messaging_messaging_android", "shouldScrollToBottom", "Z", "getShouldScrollToBottom$zendesk_messaging_messaging_android", "()Z", "onFileAttachmentClicked", "getOnFileAttachmentClicked$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "state", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "getState$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "Builder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationScreenRendering {

    @NotNull
    private final Function1<Integer, Unit> onAttachButtonClicked;

    @NotNull
    private final Function0<Unit> onBackButtonClicked;

    @NotNull
    private final Function1<CarouselAction, Unit> onCarouselAction;

    @NotNull
    private final Function1<String, Unit> onCopyText;

    @NotNull
    private final Function0<Unit> onDeniedPermissionActionClicked;

    @NotNull
    private final Function0<Unit> onDeniedPermissionDismissed;

    @NotNull
    private final Function1<Message, Unit> onFailedMessageClicked;

    @NotNull
    private final Function1<Message, Unit> onFileAttachmentClicked;

    @NotNull
    private final Function2<List<? extends Field>, MessageLogEntry.FormMessageContainer, Unit> onFormCompleted;

    @NotNull
    private final Function2<DisplayedField, String, Unit> onFormDisplayedFieldsChanged;

    @NotNull
    private final Function1<Boolean, Unit> onFormFocusChanged;

    @NotNull
    private final Function1<Double, Unit> onLoadMoreMessages;

    @NotNull
    private final Function1<String, Unit> onMessageComposerTextChanged;

    @NotNull
    private final Function0<Unit> onPostbackFailedDismissedListener;

    @NotNull
    private final Function1<MessageAction.Reply, Unit> onReplyActionSelected;

    @NotNull
    private final Function0<Unit> onRetryConnectionClicked;

    @NotNull
    private Function0<Unit> onRetryLoadConversationClicked;

    @NotNull
    private final Function1<Double, Unit> onRetryLoadMoreClickedListener;

    @NotNull
    private final Function0<Unit> onSeeLatestClickedListener;

    @NotNull
    private final Function1<String, Unit> onSendButtonClicked;

    @NotNull
    private final Function2<String, String, Unit> onSendPostbackMessage;

    @NotNull
    private final Function0<Unit> onTyping;

    @NotNull
    private final UriHandler onUriClicked;

    @NotNull
    private final WebViewUriHandler onWebViewUriClicked;
    private final boolean shouldScrollToBottom;

    @NotNull
    private final ConversationScreenState state;

    public ConversationScreenRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onFormFocusChanged = builder.getOnFormFocusChanged$zendesk_messaging_messaging_android();
        this.onBackButtonClicked = builder.getOnBackButtonClicked$zendesk_messaging_messaging_android();
        this.onSendButtonClicked = builder.getOnSendButtonClicked$zendesk_messaging_messaging_android();
        this.onAttachButtonClicked = builder.getOnAttachButtonClicked$zendesk_messaging_messaging_android();
        this.onReplyActionSelected = builder.getOnReplyActionSelected$zendesk_messaging_messaging_android();
        this.onFailedMessageClicked = builder.getOnFailedMessageClicked$zendesk_messaging_messaging_android();
        this.onRetryConnectionClicked = builder.getOnRetryConnectionClickedListener$zendesk_messaging_messaging_android();
        this.onUriClicked = builder.getOnUriClicked();
        this.onWebViewUriClicked = builder.getOnWebViewUriClicked();
        this.onCarouselAction = builder.getOnCarouselAction$zendesk_messaging_messaging_android();
        this.onSendPostbackMessage = builder.getOnSendPostbackMessage$zendesk_messaging_messaging_android();
        this.onFormCompleted = builder.getOnFormCompleted$zendesk_messaging_messaging_android();
        this.onTyping = builder.getOnTyping$zendesk_messaging_messaging_android();
        this.onMessageComposerTextChanged = builder.getOnMessageComposerTextChanged$zendesk_messaging_messaging_android();
        this.onDeniedPermissionActionClicked = builder.getOnDeniedPermissionActionClicked$zendesk_messaging_messaging_android();
        this.onDeniedPermissionDismissed = builder.getOnDeniedPermissionDismissed$zendesk_messaging_messaging_android();
        this.onFormDisplayedFieldsChanged = builder.getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android();
        this.onLoadMoreMessages = builder.getOnLoadMoreMessages$zendesk_messaging_messaging_android();
        this.onRetryLoadMoreClickedListener = builder.getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android();
        this.onRetryLoadConversationClicked = builder.getOnRetryLoadConversationClicked$zendesk_messaging_messaging_android();
        this.onSeeLatestClickedListener = builder.getOnSeeLatestClickedListener$zendesk_messaging_messaging_android();
        this.onPostbackFailedDismissedListener = builder.getOnPostbackFailedDismissedListener$zendesk_messaging_messaging_android();
        this.onCopyText = builder.getOnCopyText$zendesk_messaging_messaging_android();
        this.shouldScrollToBottom = builder.getShouldScrollToBottom();
        this.onFileAttachmentClicked = builder.getOnFileAttachmentClicked$zendesk_messaging_messaging_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function1<Integer, Unit> getOnAttachButtonClicked$zendesk_messaging_messaging_android() {
        return this.onAttachButtonClicked;
    }

    @NotNull
    public final Function0<Unit> getOnBackButtonClicked$zendesk_messaging_messaging_android() {
        return this.onBackButtonClicked;
    }

    @NotNull
    public final Function1<CarouselAction, Unit> getOnCarouselAction$zendesk_messaging_messaging_android() {
        return this.onCarouselAction;
    }

    @NotNull
    public final Function1<String, Unit> getOnCopyText$zendesk_messaging_messaging_android() {
        return this.onCopyText;
    }

    @NotNull
    public final Function0<Unit> getOnDeniedPermissionActionClicked$zendesk_messaging_messaging_android() {
        return this.onDeniedPermissionActionClicked;
    }

    @NotNull
    public final Function0<Unit> getOnDeniedPermissionDismissed$zendesk_messaging_messaging_android() {
        return this.onDeniedPermissionDismissed;
    }

    @NotNull
    public final Function1<Message, Unit> getOnFailedMessageClicked$zendesk_messaging_messaging_android() {
        return this.onFailedMessageClicked;
    }

    @NotNull
    public final Function1<Message, Unit> getOnFileAttachmentClicked$zendesk_messaging_messaging_android() {
        return this.onFileAttachmentClicked;
    }

    @NotNull
    public final Function2<List<? extends Field>, MessageLogEntry.FormMessageContainer, Unit> getOnFormCompleted$zendesk_messaging_messaging_android() {
        return this.onFormCompleted;
    }

    @NotNull
    public final Function2<DisplayedField, String, Unit> getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android() {
        return this.onFormDisplayedFieldsChanged;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFormFocusChanged$zendesk_messaging_messaging_android() {
        return this.onFormFocusChanged;
    }

    @NotNull
    public final Function1<Double, Unit> getOnLoadMoreMessages$zendesk_messaging_messaging_android() {
        return this.onLoadMoreMessages;
    }

    @NotNull
    public final Function1<String, Unit> getOnMessageComposerTextChanged$zendesk_messaging_messaging_android() {
        return this.onMessageComposerTextChanged;
    }

    @NotNull
    public final Function0<Unit> getOnPostbackFailedDismissedListener$zendesk_messaging_messaging_android() {
        return this.onPostbackFailedDismissedListener;
    }

    @NotNull
    public final Function1<MessageAction.Reply, Unit> getOnReplyActionSelected$zendesk_messaging_messaging_android() {
        return this.onReplyActionSelected;
    }

    @NotNull
    public final Function0<Unit> getOnRetryConnectionClicked$zendesk_messaging_messaging_android() {
        return this.onRetryConnectionClicked;
    }

    @NotNull
    public final Function0<Unit> getOnRetryLoadConversationClicked$zendesk_messaging_messaging_android() {
        return this.onRetryLoadConversationClicked;
    }

    @NotNull
    public final Function1<Double, Unit> getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android() {
        return this.onRetryLoadMoreClickedListener;
    }

    @NotNull
    public final Function0<Unit> getOnSeeLatestClickedListener$zendesk_messaging_messaging_android() {
        return this.onSeeLatestClickedListener;
    }

    @NotNull
    public final Function1<String, Unit> getOnSendButtonClicked$zendesk_messaging_messaging_android() {
        return this.onSendButtonClicked;
    }

    @NotNull
    public final Function2<String, String, Unit> getOnSendPostbackMessage$zendesk_messaging_messaging_android() {
        return this.onSendPostbackMessage;
    }

    @NotNull
    public final Function0<Unit> getOnTyping$zendesk_messaging_messaging_android() {
        return this.onTyping;
    }

    @NotNull
    /* JADX INFO: renamed from: getOnUriClicked$zendesk_messaging_messaging_android, reason: from getter */
    public final UriHandler getOnUriClicked() {
        return this.onUriClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getOnWebViewUriClicked$zendesk_messaging_messaging_android, reason: from getter */
    public final WebViewUriHandler getOnWebViewUriClicked() {
        return this.onWebViewUriClicked;
    }

    /* JADX INFO: renamed from: getShouldScrollToBottom$zendesk_messaging_messaging_android, reason: from getter */
    public final boolean getShouldScrollToBottom() {
        return this.shouldScrollToBottom;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_messaging_messaging_android, reason: from getter */
    public final ConversationScreenState getState() {
        return this.state;
    }

    public final void setOnRetryLoadConversationClicked$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.onRetryLoadConversationClicked = function0;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    public ConversationScreenRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bO\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00002\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\u00002\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fj\u0002`\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0013\u0010\u0010J%\u0010\u0016\u001a\u00020\u00002\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\fj\u0002`\u0015¢\u0006\u0004\b\u0016\u0010\u0010J%\u0010\u0019\u001a\u00020\u00002\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\fj\u0002`\u0018¢\u0006\u0004\b\u0019\u0010\u0010J\u001f\u0010\u001c\u001a\u00020\u00002\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u001a¢\u0006\u0004\b\u001c\u0010\u000bJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00002\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\fj\u0002`&¢\u0006\u0004\b'\u0010\u0010J+\u0010*\u001a\u00020\u00002\u001c\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0(j\u0002`)¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\u00020\u00002\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fj\u0002`,¢\u0006\u0004\b.\u0010\u0010J1\u00103\u001a\u00020\u00002\"\u00103\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0(j\u0002`2¢\u0006\u0004\b3\u0010+J%\u00106\u001a\u00020\u00002\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\fj\u0002`5¢\u0006\u0004\b6\u0010\u0010J+\u00109\u001a\u00020\u00002\u001c\u00109\u001a\u0018\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0(j\u0002`8¢\u0006\u0004\b9\u0010+J\u001f\u0010:\u001a\u00020\u00002\u0010\u0010:\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\b:\u0010\u000bJ!\u0010;\u001a\u00020\u00002\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b;\u0010\u0010J\u001f\u0010<\u001a\u00020\u00002\u0010\u0010<\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\b<\u0010\u000bJ\u001f\u0010=\u001a\u00020\u00002\u0010\u0010=\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\b=\u0010\u000bJ!\u0010?\u001a\u00020\u00002\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b?\u0010\u0010J!\u0010@\u001a\u00020\u00002\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b@\u0010\u0010J\u001f\u0010B\u001a\u00020\u00002\u0010\u0010A\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\bB\u0010\u000bJ\u001f\u0010C\u001a\u00020\u00002\u0010\u0010C\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\bC\u0010\u000bJ\u001f\u0010D\u001a\u00020\u00002\u0010\u0010D\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0004\bD\u0010\u000bJ\u0015\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u000204¢\u0006\u0004\bE\u0010FJ%\u0010H\u001a\u00020\u00002\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\fj\u0002`G¢\u0006\u0004\bH\u0010\u0010J!\u0010K\u001a\u00020\u00002\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020I0\f¢\u0006\u0004\bK\u0010\u0010J\r\u0010L\u001a\u00020\u0004¢\u0006\u0004\bL\u0010MR2\u00106\u001a\u0012\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\fj\u0002`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR,\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010N\u001a\u0004\bX\u0010P\"\u0004\bY\u0010RR2\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fj\u0002`\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010N\u001a\u0004\bZ\u0010P\"\u0004\b[\u0010RR\"\u0010\u001f\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010#\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR2\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\fj\u0002`&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010N\u001a\u0004\bf\u0010P\"\u0004\bg\u0010RR2\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\fj\u0002`\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010N\u001a\u0004\bh\u0010P\"\u0004\bi\u0010RR2\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\fj\u0002`\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010N\u001a\u0004\bj\u0010P\"\u0004\bk\u0010RR,\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010S\u001a\u0004\bl\u0010U\"\u0004\bm\u0010WR>\u00103\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0(j\u0002`28\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR,\u0010:\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010S\u001a\u0004\bs\u0010U\"\u0004\bt\u0010WR.\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010N\u001a\u0004\bu\u0010P\"\u0004\bv\u0010RR,\u0010<\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010S\u001a\u0004\bw\u0010U\"\u0004\bx\u0010WR,\u0010=\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010S\u001a\u0004\by\u0010U\"\u0004\bz\u0010WR\"\u0010K\u001a\u00020I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR:\u00109\u001a\u0018\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0(j\u0002`88\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b9\u0010n\u001a\u0005\b\u0080\u0001\u0010p\"\u0005\b\u0081\u0001\u0010rR0\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b?\u0010N\u001a\u0005\b\u0082\u0001\u0010P\"\u0005\b\u0083\u0001\u0010RR0\u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b@\u0010N\u001a\u0005\b\u0084\u0001\u0010P\"\u0005\b\u0085\u0001\u0010RR.\u0010B\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bB\u0010S\u001a\u0005\b\u0086\u0001\u0010U\"\u0005\b\u0087\u0001\u0010WR.\u0010C\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bC\u0010S\u001a\u0005\b\u0088\u0001\u0010U\"\u0005\b\u0089\u0001\u0010WR:\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0(j\u0002`)8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b*\u0010n\u001a\u0005\b\u008a\u0001\u0010p\"\u0005\b\u008b\u0001\u0010rR.\u0010D\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bD\u0010S\u001a\u0005\b\u008c\u0001\u0010U\"\u0005\b\u008d\u0001\u0010WR4\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fj\u0002`,8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b.\u0010N\u001a\u0005\b\u008e\u0001\u0010P\"\u0005\b\u008f\u0001\u0010RR4\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\fj\u0002`G8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bH\u0010N\u001a\u0005\b\u0090\u0001\u0010P\"\u0005\b\u0091\u0001\u0010RR)\u0010\u0092\u0001\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u0098\u0001"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;", "", "<init>", "()V", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering;", "rendering", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering;)V", "Lkotlin/Function0;", "", "Lzendesk/messaging/android/internal/conversationscreen/OnClickLambda;", "onBackButtonClicked", "(Lkotlin/jvm/functions/Function0;)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;", "Lkotlin/Function1;", "", "Lzendesk/messaging/android/internal/conversationscreen/OnSendButtonClickLambda;", "onSendButtonClicked", "(Lkotlin/jvm/functions/Function1;)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;", "", "onAttachButtonClicked", "onAttachMenuItemClicked", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnReplyActionSelected;", "onReplyActionSelected", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnRetryConnectionClickedListener;", "onRetryConnectionClickedListener", "onRetryConnectionButtonClicked", "Lzendesk/messaging/android/internal/UriHandler;", "uriHandler", "onUriClicked", "(Lzendesk/messaging/android/internal/UriHandler;)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "webViewUriHandler", "onWebViewUriClicked", "(Lzendesk/messaging/android/internal/WebViewUriHandler;)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCarouselAction;", "onCarouselAction", "Lkotlin/Function2;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "onSendPostbackMessage", "(Lkotlin/jvm/functions/Function2;)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCopyTextAction;", "onCopyTextAction", "onCopyText", "", "Lzendesk/conversationkit/android/model/Field;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormCompleted;", "onFormCompleted", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormFocusChangedListener;", "onFormFocusChanged", "Lzendesk/ui/android/conversation/form/DisplayedField;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "onFormDisplayedFieldsChanged", "onTyping", "onMessageComposerTextChanged", "onDeniedPermissionActionClicked", "onDeniedPermissionDismissed", "", "onLoadMoreMessages", "onRetryLoadMoreClickedListener", "lambda", "onRetryLoadConversationClicked", "onSeeLatestClickedListener", "onPostbackFailedDismissedListener", "onScrollToBottomListener", "(Z)Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering$Builder;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFileAttachmentClicked;", "onFileAttachmentClicked", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "stateUpdate", "state", "build", "()Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering;", "Lkotlin/jvm/functions/Function1;", "getOnFormFocusChanged$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function1;", "setOnFormFocusChanged$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function0;", "getOnBackButtonClicked$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function0;", "setOnBackButtonClicked$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function0;)V", "getOnAttachButtonClicked$zendesk_messaging_messaging_android", "setOnAttachButtonClicked$zendesk_messaging_messaging_android", "getOnSendButtonClicked$zendesk_messaging_messaging_android", "setOnSendButtonClicked$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/UriHandler;", "getOnUriClicked$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/UriHandler;", "setOnUriClicked$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/UriHandler;)V", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "getOnWebViewUriClicked$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/WebViewUriHandler;", "setOnWebViewUriClicked$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/WebViewUriHandler;)V", "getOnCarouselAction$zendesk_messaging_messaging_android", "setOnCarouselAction$zendesk_messaging_messaging_android", "getOnReplyActionSelected$zendesk_messaging_messaging_android", "setOnReplyActionSelected$zendesk_messaging_messaging_android", "getOnFailedMessageClicked$zendesk_messaging_messaging_android", "setOnFailedMessageClicked$zendesk_messaging_messaging_android", "getOnRetryConnectionClickedListener$zendesk_messaging_messaging_android", "setOnRetryConnectionClickedListener$zendesk_messaging_messaging_android", "Lkotlin/jvm/functions/Function2;", "getOnFormCompleted$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function2;", "setOnFormCompleted$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function2;)V", "getOnTyping$zendesk_messaging_messaging_android", "setOnTyping$zendesk_messaging_messaging_android", "getOnMessageComposerTextChanged$zendesk_messaging_messaging_android", "setOnMessageComposerTextChanged$zendesk_messaging_messaging_android", "getOnDeniedPermissionActionClicked$zendesk_messaging_messaging_android", "setOnDeniedPermissionActionClicked$zendesk_messaging_messaging_android", "getOnDeniedPermissionDismissed$zendesk_messaging_messaging_android", "setOnDeniedPermissionDismissed$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "getState$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;", "setState$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenState;)V", "getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android", "setOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android", "getOnLoadMoreMessages$zendesk_messaging_messaging_android", "setOnLoadMoreMessages$zendesk_messaging_messaging_android", "getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android", "setOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android", "getOnRetryLoadConversationClicked$zendesk_messaging_messaging_android", "setOnRetryLoadConversationClicked$zendesk_messaging_messaging_android", "getOnSeeLatestClickedListener$zendesk_messaging_messaging_android", "setOnSeeLatestClickedListener$zendesk_messaging_messaging_android", "getOnSendPostbackMessage$zendesk_messaging_messaging_android", "setOnSendPostbackMessage$zendesk_messaging_messaging_android", "getOnPostbackFailedDismissedListener$zendesk_messaging_messaging_android", "setOnPostbackFailedDismissedListener$zendesk_messaging_messaging_android", "getOnCopyText$zendesk_messaging_messaging_android", "setOnCopyText$zendesk_messaging_messaging_android", "getOnFileAttachmentClicked$zendesk_messaging_messaging_android", "setOnFileAttachmentClicked$zendesk_messaging_messaging_android", "shouldScrollToBottom", "Z", "getShouldScrollToBottom$zendesk_messaging_messaging_android", "()Z", "setShouldScrollToBottom$zendesk_messaging_messaging_android", "(Z)V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private Function1<? super Integer, Unit> onAttachButtonClicked;

        @NotNull
        private Function0<Unit> onBackButtonClicked;

        @NotNull
        private Function1<? super CarouselAction, Unit> onCarouselAction;

        @NotNull
        private Function1<? super String, Unit> onCopyText;

        @NotNull
        private Function0<Unit> onDeniedPermissionActionClicked;

        @NotNull
        private Function0<Unit> onDeniedPermissionDismissed;

        @NotNull
        private Function1<? super Message, Unit> onFailedMessageClicked;

        @NotNull
        private Function1<? super Message, Unit> onFileAttachmentClicked;

        @NotNull
        private Function2<? super List<? extends Field>, ? super MessageLogEntry.FormMessageContainer, Unit> onFormCompleted;

        @NotNull
        private Function2<? super DisplayedField, ? super String, Unit> onFormDisplayedFieldsChanged;

        @NotNull
        private Function1<? super Boolean, Unit> onFormFocusChanged;

        @NotNull
        private Function1<? super Double, Unit> onLoadMoreMessages;

        @NotNull
        private Function1<? super String, Unit> onMessageComposerTextChanged;

        @NotNull
        private Function0<Unit> onPostbackFailedDismissedListener;

        @NotNull
        private Function1<? super MessageAction.Reply, Unit> onReplyActionSelected;

        @NotNull
        private Function0<Unit> onRetryConnectionClickedListener;

        @NotNull
        private Function0<Unit> onRetryLoadConversationClicked;

        @NotNull
        private Function1<? super Double, Unit> onRetryLoadMoreClickedListener;

        @NotNull
        private Function0<Unit> onSeeLatestClickedListener;

        @NotNull
        private Function1<? super String, Unit> onSendButtonClicked;

        @NotNull
        private Function2<? super String, ? super String, Unit> onSendPostbackMessage;

        @NotNull
        private Function0<Unit> onTyping;

        @NotNull
        private UriHandler onUriClicked;

        @NotNull
        private WebViewUriHandler onWebViewUriClicked;
        private boolean shouldScrollToBottom;

        @NotNull
        private ConversationScreenState state;

        public Builder() {
            this.onFormFocusChanged = new yj.m(28);
            this.onBackButtonClicked = new n(5);
            this.onAttachButtonClicked = new o(1);
            this.onSendButtonClicked = new o(2);
            this.onUriClicked = StubUriHandler.INSTANCE;
            this.onWebViewUriClicked = StubWebViewUriHandler.INSTANCE;
            this.onCarouselAction = MessageLogListenersKt.getNOOP_ON_CAROUSEL_ACTION();
            this.onReplyActionSelected = MessageLogListenersKt.getNOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER();
            this.onFailedMessageClicked = MessageLogListenersKt.getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER();
            this.onRetryConnectionClickedListener = MessageLogListenersKt.getNOOP_ON_RETRY_CONNECTION_CLICKED_LISTENER();
            this.onFormCompleted = MessageLogListenersKt.getNOOP_ON_FORM_COMPLETED();
            this.onTyping = new n(6);
            this.onMessageComposerTextChanged = new o(3);
            this.onDeniedPermissionActionClicked = new n(0);
            this.onDeniedPermissionDismissed = new n(1);
            this.state = new ConversationScreenState(null, null, null, null, null, null, false, null, false, false, null, null, null, false, null, false, false, false, null, false, null, false, null, null, null, false, null, 134217727, null);
            this.onFormDisplayedFieldsChanged = new yn.a(20);
            this.onLoadMoreMessages = new yj.m(29);
            this.onRetryLoadMoreClickedListener = new o(0);
            this.onRetryLoadConversationClicked = new n(2);
            this.onSeeLatestClickedListener = new n(3);
            this.onSendPostbackMessage = MessageLogListenersKt.getNOOP_ON_SEND_POSTBACK_MESSAGE();
            this.onPostbackFailedDismissedListener = new n(4);
            this.onCopyText = MessageLogListenersKt.getNOOP_ON_COPY_TEXT_ACTION();
            this.onFileAttachmentClicked = MessageLogListenersKt.getNOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAttachButtonClicked$lambda$2(int i11) {
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onFormDisplayedFieldsChanged$lambda$8(DisplayedField displayedField, String str) {
            displayedField.getClass();
            str.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onFormFocusChanged$lambda$0(boolean z11) {
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onLoadMoreMessages$lambda$9(double d3) {
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onMessageComposerTextChanged$lambda$5(String str) {
            str.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onRetryLoadMoreClickedListener$lambda$10(double d3) {
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onSendButtonClicked$lambda$3(String str) {
            str.getClass();
            return Unit.f26487a;
        }

        @NotNull
        public final ConversationScreenRendering build() {
            return new ConversationScreenRendering(this);
        }

        @NotNull
        public final Function1<Integer, Unit> getOnAttachButtonClicked$zendesk_messaging_messaging_android() {
            return this.onAttachButtonClicked;
        }

        @NotNull
        public final Function0<Unit> getOnBackButtonClicked$zendesk_messaging_messaging_android() {
            return this.onBackButtonClicked;
        }

        @NotNull
        public final Function1<CarouselAction, Unit> getOnCarouselAction$zendesk_messaging_messaging_android() {
            return this.onCarouselAction;
        }

        @NotNull
        public final Function1<String, Unit> getOnCopyText$zendesk_messaging_messaging_android() {
            return this.onCopyText;
        }

        @NotNull
        public final Function0<Unit> getOnDeniedPermissionActionClicked$zendesk_messaging_messaging_android() {
            return this.onDeniedPermissionActionClicked;
        }

        @NotNull
        public final Function0<Unit> getOnDeniedPermissionDismissed$zendesk_messaging_messaging_android() {
            return this.onDeniedPermissionDismissed;
        }

        @NotNull
        public final Function1<Message, Unit> getOnFailedMessageClicked$zendesk_messaging_messaging_android() {
            return this.onFailedMessageClicked;
        }

        @NotNull
        public final Function1<Message, Unit> getOnFileAttachmentClicked$zendesk_messaging_messaging_android() {
            return this.onFileAttachmentClicked;
        }

        @NotNull
        public final Function2<List<? extends Field>, MessageLogEntry.FormMessageContainer, Unit> getOnFormCompleted$zendesk_messaging_messaging_android() {
            return this.onFormCompleted;
        }

        @NotNull
        public final Function2<DisplayedField, String, Unit> getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android() {
            return this.onFormDisplayedFieldsChanged;
        }

        @NotNull
        public final Function1<Boolean, Unit> getOnFormFocusChanged$zendesk_messaging_messaging_android() {
            return this.onFormFocusChanged;
        }

        @NotNull
        public final Function1<Double, Unit> getOnLoadMoreMessages$zendesk_messaging_messaging_android() {
            return this.onLoadMoreMessages;
        }

        @NotNull
        public final Function1<String, Unit> getOnMessageComposerTextChanged$zendesk_messaging_messaging_android() {
            return this.onMessageComposerTextChanged;
        }

        @NotNull
        public final Function0<Unit> getOnPostbackFailedDismissedListener$zendesk_messaging_messaging_android() {
            return this.onPostbackFailedDismissedListener;
        }

        @NotNull
        public final Function1<MessageAction.Reply, Unit> getOnReplyActionSelected$zendesk_messaging_messaging_android() {
            return this.onReplyActionSelected;
        }

        @NotNull
        public final Function0<Unit> getOnRetryConnectionClickedListener$zendesk_messaging_messaging_android() {
            return this.onRetryConnectionClickedListener;
        }

        @NotNull
        public final Function0<Unit> getOnRetryLoadConversationClicked$zendesk_messaging_messaging_android() {
            return this.onRetryLoadConversationClicked;
        }

        @NotNull
        public final Function1<Double, Unit> getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android() {
            return this.onRetryLoadMoreClickedListener;
        }

        @NotNull
        public final Function0<Unit> getOnSeeLatestClickedListener$zendesk_messaging_messaging_android() {
            return this.onSeeLatestClickedListener;
        }

        @NotNull
        public final Function1<String, Unit> getOnSendButtonClicked$zendesk_messaging_messaging_android() {
            return this.onSendButtonClicked;
        }

        @NotNull
        public final Function2<String, String, Unit> getOnSendPostbackMessage$zendesk_messaging_messaging_android() {
            return this.onSendPostbackMessage;
        }

        @NotNull
        public final Function0<Unit> getOnTyping$zendesk_messaging_messaging_android() {
            return this.onTyping;
        }

        @NotNull
        /* JADX INFO: renamed from: getOnUriClicked$zendesk_messaging_messaging_android, reason: from getter */
        public final UriHandler getOnUriClicked() {
            return this.onUriClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getOnWebViewUriClicked$zendesk_messaging_messaging_android, reason: from getter */
        public final WebViewUriHandler getOnWebViewUriClicked() {
            return this.onWebViewUriClicked;
        }

        /* JADX INFO: renamed from: getShouldScrollToBottom$zendesk_messaging_messaging_android, reason: from getter */
        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_messaging_messaging_android, reason: from getter */
        public final ConversationScreenState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onAttachMenuItemClicked(@NotNull Function1<? super Integer, Unit> onAttachButtonClicked) {
            onAttachButtonClicked.getClass();
            this.onAttachButtonClicked = onAttachButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onBackButtonClicked(@NotNull Function0<Unit> onBackButtonClicked) {
            onBackButtonClicked.getClass();
            this.onBackButtonClicked = onBackButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onCarouselAction(@NotNull Function1<? super CarouselAction, Unit> onCarouselAction) {
            onCarouselAction.getClass();
            this.onCarouselAction = onCarouselAction;
            return this;
        }

        @NotNull
        public final Builder onCopyText(@NotNull Function1<? super String, Unit> onCopyTextAction) {
            onCopyTextAction.getClass();
            this.onCopyText = onCopyTextAction;
            return this;
        }

        @NotNull
        public final Builder onDeniedPermissionActionClicked(@NotNull Function0<Unit> onDeniedPermissionActionClicked) {
            onDeniedPermissionActionClicked.getClass();
            this.onDeniedPermissionActionClicked = onDeniedPermissionActionClicked;
            return this;
        }

        @NotNull
        public final Builder onDeniedPermissionDismissed(@NotNull Function0<Unit> onDeniedPermissionDismissed) {
            onDeniedPermissionDismissed.getClass();
            this.onDeniedPermissionDismissed = onDeniedPermissionDismissed;
            return this;
        }

        @NotNull
        public final Builder onFailedMessageClicked(@NotNull Function1<? super Message, Unit> onFailedMessageClicked) {
            onFailedMessageClicked.getClass();
            this.onFailedMessageClicked = onFailedMessageClicked;
            return this;
        }

        @NotNull
        public final Builder onFileAttachmentClicked(@NotNull Function1<? super Message, Unit> onFileAttachmentClicked) {
            onFileAttachmentClicked.getClass();
            this.onFileAttachmentClicked = onFileAttachmentClicked;
            return this;
        }

        @NotNull
        public final Builder onFormCompleted(@NotNull Function2<? super List<? extends Field>, ? super MessageLogEntry.FormMessageContainer, Unit> onFormCompleted) {
            onFormCompleted.getClass();
            this.onFormCompleted = onFormCompleted;
            return this;
        }

        @NotNull
        public final Builder onFormDisplayedFieldsChanged(@NotNull Function2<? super DisplayedField, ? super String, Unit> onFormDisplayedFieldsChanged) {
            onFormDisplayedFieldsChanged.getClass();
            this.onFormDisplayedFieldsChanged = onFormDisplayedFieldsChanged;
            return this;
        }

        @NotNull
        public final Builder onFormFocusChanged(@NotNull Function1<? super Boolean, Unit> onFormFocusChanged) {
            onFormFocusChanged.getClass();
            this.onFormFocusChanged = onFormFocusChanged;
            return this;
        }

        @NotNull
        public final Builder onLoadMoreMessages(@NotNull Function1<? super Double, Unit> onLoadMoreMessages) {
            onLoadMoreMessages.getClass();
            this.onLoadMoreMessages = onLoadMoreMessages;
            return this;
        }

        @NotNull
        public final Builder onMessageComposerTextChanged(@NotNull Function1<? super String, Unit> onMessageComposerTextChanged) {
            onMessageComposerTextChanged.getClass();
            this.onMessageComposerTextChanged = onMessageComposerTextChanged;
            return this;
        }

        @NotNull
        public final Builder onPostbackFailedDismissedListener(@NotNull Function0<Unit> onPostbackFailedDismissedListener) {
            onPostbackFailedDismissedListener.getClass();
            this.onPostbackFailedDismissedListener = onPostbackFailedDismissedListener;
            return this;
        }

        @NotNull
        public final Builder onReplyActionSelected(@NotNull Function1<? super MessageAction.Reply, Unit> onReplyActionSelected) {
            onReplyActionSelected.getClass();
            this.onReplyActionSelected = onReplyActionSelected;
            return this;
        }

        @NotNull
        public final Builder onRetryConnectionButtonClicked(@NotNull Function0<Unit> onRetryConnectionClickedListener) {
            onRetryConnectionClickedListener.getClass();
            this.onRetryConnectionClickedListener = onRetryConnectionClickedListener;
            return this;
        }

        @NotNull
        public final Builder onRetryLoadConversationClicked(@NotNull Function0<Unit> lambda) {
            lambda.getClass();
            this.onRetryLoadConversationClicked = lambda;
            return this;
        }

        @NotNull
        public final Builder onRetryLoadMoreClickedListener(@NotNull Function1<? super Double, Unit> onRetryLoadMoreClickedListener) {
            onRetryLoadMoreClickedListener.getClass();
            this.onRetryLoadMoreClickedListener = onRetryLoadMoreClickedListener;
            return this;
        }

        @NotNull
        public final Builder onScrollToBottomListener(boolean onScrollToBottomListener) {
            this.shouldScrollToBottom = onScrollToBottomListener;
            return this;
        }

        @NotNull
        public final Builder onSeeLatestClickedListener(@NotNull Function0<Unit> onSeeLatestClickedListener) {
            onSeeLatestClickedListener.getClass();
            this.onSeeLatestClickedListener = onSeeLatestClickedListener;
            return this;
        }

        @NotNull
        public final Builder onSendButtonClicked(@NotNull Function1<? super String, Unit> onSendButtonClicked) {
            onSendButtonClicked.getClass();
            this.onSendButtonClicked = onSendButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onSendPostbackMessage(@NotNull Function2<? super String, ? super String, Unit> onSendPostbackMessage) {
            onSendPostbackMessage.getClass();
            this.onSendPostbackMessage = onSendPostbackMessage;
            return this;
        }

        @NotNull
        public final Builder onTyping(@NotNull Function0<Unit> onTyping) {
            onTyping.getClass();
            this.onTyping = onTyping;
            return this;
        }

        @NotNull
        public final Builder onUriClicked(@NotNull UriHandler uriHandler) {
            uriHandler.getClass();
            this.onUriClicked = uriHandler;
            return this;
        }

        @NotNull
        public final Builder onWebViewUriClicked(@NotNull WebViewUriHandler webViewUriHandler) {
            webViewUriHandler.getClass();
            this.onWebViewUriClicked = webViewUriHandler;
            return this;
        }

        public final void setOnAttachButtonClicked$zendesk_messaging_messaging_android(@NotNull Function1<? super Integer, Unit> function1) {
            function1.getClass();
            this.onAttachButtonClicked = function1;
        }

        public final void setOnBackButtonClicked$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onBackButtonClicked = function0;
        }

        public final void setOnCarouselAction$zendesk_messaging_messaging_android(@NotNull Function1<? super CarouselAction, Unit> function1) {
            function1.getClass();
            this.onCarouselAction = function1;
        }

        public final void setOnCopyText$zendesk_messaging_messaging_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onCopyText = function1;
        }

        public final void setOnDeniedPermissionActionClicked$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onDeniedPermissionActionClicked = function0;
        }

        public final void setOnDeniedPermissionDismissed$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onDeniedPermissionDismissed = function0;
        }

        public final void setOnFailedMessageClicked$zendesk_messaging_messaging_android(@NotNull Function1<? super Message, Unit> function1) {
            function1.getClass();
            this.onFailedMessageClicked = function1;
        }

        public final void setOnFileAttachmentClicked$zendesk_messaging_messaging_android(@NotNull Function1<? super Message, Unit> function1) {
            function1.getClass();
            this.onFileAttachmentClicked = function1;
        }

        public final void setOnFormCompleted$zendesk_messaging_messaging_android(@NotNull Function2<? super List<? extends Field>, ? super MessageLogEntry.FormMessageContainer, Unit> function2) {
            function2.getClass();
            this.onFormCompleted = function2;
        }

        public final void setOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android(@NotNull Function2<? super DisplayedField, ? super String, Unit> function2) {
            function2.getClass();
            this.onFormDisplayedFieldsChanged = function2;
        }

        public final void setOnFormFocusChanged$zendesk_messaging_messaging_android(@NotNull Function1<? super Boolean, Unit> function1) {
            function1.getClass();
            this.onFormFocusChanged = function1;
        }

        public final void setOnLoadMoreMessages$zendesk_messaging_messaging_android(@NotNull Function1<? super Double, Unit> function1) {
            function1.getClass();
            this.onLoadMoreMessages = function1;
        }

        public final void setOnMessageComposerTextChanged$zendesk_messaging_messaging_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onMessageComposerTextChanged = function1;
        }

        public final void setOnPostbackFailedDismissedListener$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onPostbackFailedDismissedListener = function0;
        }

        public final void setOnReplyActionSelected$zendesk_messaging_messaging_android(@NotNull Function1<? super MessageAction.Reply, Unit> function1) {
            function1.getClass();
            this.onReplyActionSelected = function1;
        }

        public final void setOnRetryConnectionClickedListener$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onRetryConnectionClickedListener = function0;
        }

        public final void setOnRetryLoadConversationClicked$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onRetryLoadConversationClicked = function0;
        }

        public final void setOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android(@NotNull Function1<? super Double, Unit> function1) {
            function1.getClass();
            this.onRetryLoadMoreClickedListener = function1;
        }

        public final void setOnSeeLatestClickedListener$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onSeeLatestClickedListener = function0;
        }

        public final void setOnSendButtonClicked$zendesk_messaging_messaging_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onSendButtonClicked = function1;
        }

        public final void setOnSendPostbackMessage$zendesk_messaging_messaging_android(@NotNull Function2<? super String, ? super String, Unit> function2) {
            function2.getClass();
            this.onSendPostbackMessage = function2;
        }

        public final void setOnTyping$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onTyping = function0;
        }

        public final void setOnUriClicked$zendesk_messaging_messaging_android(@NotNull UriHandler uriHandler) {
            uriHandler.getClass();
            this.onUriClicked = uriHandler;
        }

        public final void setOnWebViewUriClicked$zendesk_messaging_messaging_android(@NotNull WebViewUriHandler webViewUriHandler) {
            webViewUriHandler.getClass();
            this.onWebViewUriClicked = webViewUriHandler;
        }

        public final void setShouldScrollToBottom$zendesk_messaging_messaging_android(boolean z11) {
            this.shouldScrollToBottom = z11;
        }

        public final void setState$zendesk_messaging_messaging_android(@NotNull ConversationScreenState conversationScreenState) {
            conversationScreenState.getClass();
            this.state = conversationScreenState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ConversationScreenState, ConversationScreenState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ConversationScreenState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ConversationScreenRendering conversationScreenRendering) {
            this();
            conversationScreenRendering.getClass();
            this.onBackButtonClicked = conversationScreenRendering.getOnBackButtonClicked$zendesk_messaging_messaging_android();
            this.onSendButtonClicked = conversationScreenRendering.getOnSendButtonClicked$zendesk_messaging_messaging_android();
            this.onAttachButtonClicked = conversationScreenRendering.getOnAttachButtonClicked$zendesk_messaging_messaging_android();
            this.onReplyActionSelected = conversationScreenRendering.getOnReplyActionSelected$zendesk_messaging_messaging_android();
            this.onFailedMessageClicked = conversationScreenRendering.getOnFailedMessageClicked$zendesk_messaging_messaging_android();
            this.onRetryConnectionClickedListener = conversationScreenRendering.getOnRetryConnectionClicked$zendesk_messaging_messaging_android();
            this.onUriClicked = conversationScreenRendering.getOnUriClicked();
            this.onWebViewUriClicked = conversationScreenRendering.getOnWebViewUriClicked();
            this.onCarouselAction = conversationScreenRendering.getOnCarouselAction$zendesk_messaging_messaging_android();
            this.onFormCompleted = conversationScreenRendering.getOnFormCompleted$zendesk_messaging_messaging_android();
            this.onFormFocusChanged = conversationScreenRendering.getOnFormFocusChanged$zendesk_messaging_messaging_android();
            this.onFormDisplayedFieldsChanged = conversationScreenRendering.getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android();
            this.onTyping = conversationScreenRendering.getOnTyping$zendesk_messaging_messaging_android();
            this.onMessageComposerTextChanged = conversationScreenRendering.getOnMessageComposerTextChanged$zendesk_messaging_messaging_android();
            this.onDeniedPermissionActionClicked = conversationScreenRendering.getOnDeniedPermissionActionClicked$zendesk_messaging_messaging_android();
            this.onDeniedPermissionDismissed = conversationScreenRendering.getOnDeniedPermissionDismissed$zendesk_messaging_messaging_android();
            this.onLoadMoreMessages = conversationScreenRendering.getOnLoadMoreMessages$zendesk_messaging_messaging_android();
            this.onRetryLoadMoreClickedListener = conversationScreenRendering.getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android();
            this.onSeeLatestClickedListener = conversationScreenRendering.getOnSeeLatestClickedListener$zendesk_messaging_messaging_android();
            this.onPostbackFailedDismissedListener = conversationScreenRendering.getOnPostbackFailedDismissedListener$zendesk_messaging_messaging_android();
            this.onCopyText = conversationScreenRendering.getOnCopyText$zendesk_messaging_messaging_android();
            this.shouldScrollToBottom = conversationScreenRendering.getShouldScrollToBottom();
            this.onFileAttachmentClicked = conversationScreenRendering.getOnFileAttachmentClicked$zendesk_messaging_messaging_android();
            this.state = conversationScreenRendering.getState();
        }

        public /* synthetic */ Builder(ConversationScreenRendering conversationScreenRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ConversationScreenRendering() : conversationScreenRendering);
        }
    }
}
