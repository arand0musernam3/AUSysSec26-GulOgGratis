package zendesk.messaging.android.internal.conversationscreen.messagelog;

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
import zendesk.messaging.android.internal.conversationscreen.n;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.carousel.CarouselAction;
import zendesk.ui.android.conversation.form.DisplayedField;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001JB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b0\tj\u0002` 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R6\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0#j\u0002`'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R*\u0010.\u001a\u0012\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b0\tj\u0002`-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010\u000e\u001a\u0004\b/\u0010\u0010R0\u00103\u001a\u0018\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000b0#j\u0002`28\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010\u000e\u001a\u0004\b6\u0010\u0010R \u00108\u001a\b\u0012\u0004\u0012\u00020\u000b078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R0\u0010?\u001a\u0018\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000b0#j\u0002`>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010)\u001a\u0004\b@\u0010+R&\u0010A\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010\u000e\u001a\u0004\bB\u0010\u0010R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010\u000e\u001a\u0004\bD\u0010\u0010R\u001a\u0010F\u001a\u00020E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering$Builder;", "builder", "<init>", "(Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering$Builder;", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnReplyActionSelected;", "onReplyActionSelected", "Lkotlin/jvm/functions/Function1;", "getOnReplyActionSelected$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function1;", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "getOnFailedMessageClicked$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/UriHandler;", "onUriClicked", "Lzendesk/messaging/android/internal/UriHandler;", "getOnUriClicked$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/UriHandler;", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "onWebViewUriClicked", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "getOnWebViewUriClicked$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/WebViewUriHandler;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCarouselAction;", "onCarouselAction", "getOnCarouselAction$zendesk_messaging_messaging_android", "Lkotlin/Function2;", "", "Lzendesk/conversationkit/android/model/Field;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormCompleted;", "onFormCompleted", "Lkotlin/jvm/functions/Function2;", "getOnFormCompleted$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function2;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormFocusChangedListener;", "onFormFocusChanged", "getOnFormFocusChanged$zendesk_messaging_messaging_android", "Lzendesk/ui/android/conversation/form/DisplayedField;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "onFormDisplayedFieldsChanged", "getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android", "onLoadMoreListener", "getOnLoadMoreListener$zendesk_messaging_messaging_android", "Lkotlin/Function0;", "onRetryLoadMoreClickedListener", "Lkotlin/jvm/functions/Function0;", "getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function0;", "onSeeLatestClickedListener", "getOnSeeLatestClickedListener$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "onSendPostbackMessage", "getOnSendPostbackMessage$zendesk_messaging_messaging_android", "onCopyText", "getOnCopyText$zendesk_messaging_messaging_android", "onFileAttachmentClicked", "getOnFileAttachmentClicked$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;", "state", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;", "getState$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;", "Builder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageLogRendering {

    @NotNull
    private final Function1<CarouselAction, Unit> onCarouselAction;

    @NotNull
    private final Function1<String, Unit> onCopyText;

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
    private final Function1<Boolean, Unit> onLoadMoreListener;

    @NotNull
    private final Function1<MessageAction.Reply, Unit> onReplyActionSelected;

    @NotNull
    private final Function0<Unit> onRetryLoadMoreClickedListener;

    @NotNull
    private final Function0<Unit> onSeeLatestClickedListener;

    @NotNull
    private final Function2<String, String, Unit> onSendPostbackMessage;

    @NotNull
    private final UriHandler onUriClicked;

    @NotNull
    private final WebViewUriHandler onWebViewUriClicked;

    @NotNull
    private final MessageLogState state;

    public MessageLogRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onReplyActionSelected = builder.getOnReplyActionSelected$zendesk_messaging_messaging_android();
        this.onFailedMessageClicked = builder.getOnFailedMessageClicked$zendesk_messaging_messaging_android();
        this.onUriClicked = builder.getOnUriClicked();
        this.onWebViewUriClicked = builder.getOnWebViewUriClicked();
        this.onCarouselAction = builder.getOnCarouselAction$zendesk_messaging_messaging_android();
        this.onFormCompleted = builder.getOnFormCompleted$zendesk_messaging_messaging_android();
        this.onFormFocusChanged = builder.getOnFormFocusChanged$zendesk_messaging_messaging_android();
        this.onFormDisplayedFieldsChanged = builder.getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android();
        this.onLoadMoreListener = builder.getOnLoadMoreListener$zendesk_messaging_messaging_android();
        this.onRetryLoadMoreClickedListener = builder.getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android();
        this.onSeeLatestClickedListener = builder.getOnSeeLatestClickedListener$zendesk_messaging_messaging_android();
        this.onSendPostbackMessage = builder.getOnSendPostbackMessage$zendesk_messaging_messaging_android();
        this.onCopyText = builder.getOnCopyText$zendesk_messaging_messaging_android();
        this.onFileAttachmentClicked = builder.getOnFileAttachmentClicked$zendesk_messaging_messaging_android();
        this.state = builder.getState();
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
    public final Function1<Boolean, Unit> getOnLoadMoreListener$zendesk_messaging_messaging_android() {
        return this.onLoadMoreListener;
    }

    @NotNull
    public final Function1<MessageAction.Reply, Unit> getOnReplyActionSelected$zendesk_messaging_messaging_android() {
        return this.onReplyActionSelected;
    }

    @NotNull
    public final Function0<Unit> getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android() {
        return this.onRetryLoadMoreClickedListener;
    }

    @NotNull
    public final Function0<Unit> getOnSeeLatestClickedListener$zendesk_messaging_messaging_android() {
        return this.onSeeLatestClickedListener;
    }

    @NotNull
    public final Function2<String, String, Unit> getOnSendPostbackMessage$zendesk_messaging_messaging_android() {
        return this.onSendPostbackMessage;
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

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_messaging_messaging_android, reason: from getter */
    public final MessageLogState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    public MessageLogRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J%\u0010\u000b\u001a\u00020\u00002\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00002\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\u000e¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00002\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\u0019¢\u0006\u0004\b\u001a\u0010\fJ+\u0010\u001e\u001a\u00020\u00002\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001bj\u0002`\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010$\u001a\u00020\u00002\"\u0010$\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u001bj\u0002`#¢\u0006\u0004\b$\u0010\u001fJ%\u0010(\u001a\u00020\u00002\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0\u0007j\u0002`&¢\u0006\u0004\b(\u0010\fJ+\u0010+\u001a\u00020\u00002\u001c\u0010+\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001bj\u0002`*¢\u0006\u0004\b+\u0010\u001fJ!\u0010,\u001a\u00020\u00002\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b,\u0010\fJ\u001b\u0010.\u001a\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0-¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0-¢\u0006\u0004\b0\u0010/J%\u00103\u001a\u00020\u00002\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u0007j\u0002`1¢\u0006\u0004\b3\u0010\fJ%\u00105\u001a\u00020\u00002\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007j\u0002`4¢\u0006\u0004\b5\u0010\fJ!\u00108\u001a\u00020\u00002\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002060\u0007¢\u0006\u0004\b8\u0010\fJ\r\u00109\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:R2\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R2\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010;\u001a\u0004\b@\u0010=\"\u0004\bA\u0010?R\"\u0010\u0012\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u0016\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR>\u0010$\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u001bj\u0002`#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR2\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010;\u001a\u0004\bQ\u0010=\"\u0004\bR\u0010?R2\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0\u0007j\u0002`&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010;\u001a\u0004\bS\u0010=\"\u0004\bT\u0010?R\"\u00108\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR8\u0010+\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001bj\u0002`*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010L\u001a\u0004\bZ\u0010N\"\u0004\b[\u0010PR(\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R(\u00100\u001a\b\u0012\u0004\u0012\u00020\t0-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010\\\u001a\u0004\ba\u0010^\"\u0004\bb\u0010`R.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010;\u001a\u0004\bc\u0010=\"\u0004\bd\u0010?R\"\u0010e\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010k\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR8\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001bj\u0002`\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010L\u001a\u0004\bq\u0010N\"\u0004\br\u0010PR2\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u0007j\u0002`18\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010;\u001a\u0004\bs\u0010=\"\u0004\bt\u0010?R2\u00105\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007j\u0002`48\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010;\u001a\u0004\bu\u0010=\"\u0004\bv\u0010?¨\u0006w"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering$Builder;", "", "<init>", "()V", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering;", "rendering", "(Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering;)V", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnReplyActionSelected;", "onReplyActionSelected", "(Lkotlin/jvm/functions/Function1;)Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering$Builder;", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "Lzendesk/messaging/android/internal/UriHandler;", "uriHandler", "onUriClicked", "(Lzendesk/messaging/android/internal/UriHandler;)Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering$Builder;", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "webViewUriHandler", "onWebViewUriClicked", "(Lzendesk/messaging/android/internal/WebViewUriHandler;)Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering$Builder;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCarouselAction;", "onCarouselAction", "Lkotlin/Function2;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "onSendPostbackMessage", "(Lkotlin/jvm/functions/Function2;)Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering$Builder;", "", "Lzendesk/conversationkit/android/model/Field;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormCompleted;", "onFormCompleted", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormFocusChangedListener;", "onFormFocusChangedListener", "onFormFocusChanged", "Lzendesk/ui/android/conversation/form/DisplayedField;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "onFormDisplayedFieldsChanged", "onLoadMoreListener", "Lkotlin/Function0;", "onRetryLoadMoreClickedListener", "(Lkotlin/jvm/functions/Function0;)Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering$Builder;", "onSeeLatestClickedListener", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCopyTextAction;", "onCopyTextAction", "onCopyText", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFileAttachmentClicked;", "onFileAttachmentClicked", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;", "stateUpdate", "state", "build", "()Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering;", "Lkotlin/jvm/functions/Function1;", "getOnReplyActionSelected$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function1;", "setOnReplyActionSelected$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function1;)V", "getOnFailedMessageClicked$zendesk_messaging_messaging_android", "setOnFailedMessageClicked$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/UriHandler;", "getOnUriClicked$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/UriHandler;", "setOnUriClicked$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/UriHandler;)V", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "getOnWebViewUriClicked$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/WebViewUriHandler;", "setOnWebViewUriClicked$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/WebViewUriHandler;)V", "Lkotlin/jvm/functions/Function2;", "getOnFormCompleted$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function2;", "setOnFormCompleted$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function2;)V", "getOnCarouselAction$zendesk_messaging_messaging_android", "setOnCarouselAction$zendesk_messaging_messaging_android", "getOnFormFocusChanged$zendesk_messaging_messaging_android", "setOnFormFocusChanged$zendesk_messaging_messaging_android", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;", "getState$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;", "setState$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogState;)V", "getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android", "setOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android", "Lkotlin/jvm/functions/Function0;", "getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function0;", "setOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function0;)V", "getOnSeeLatestClickedListener$zendesk_messaging_messaging_android", "setOnSeeLatestClickedListener$zendesk_messaging_messaging_android", "getOnLoadMoreListener$zendesk_messaging_messaging_android", "setOnLoadMoreListener$zendesk_messaging_messaging_android", "showPostbackErrorBanner", "Z", "getShowPostbackErrorBanner$zendesk_messaging_messaging_android", "()Z", "setShowPostbackErrorBanner$zendesk_messaging_messaging_android", "(Z)V", "postbackErrorText", "Ljava/lang/String;", "getPostbackErrorText$zendesk_messaging_messaging_android", "()Ljava/lang/String;", "setPostbackErrorText$zendesk_messaging_messaging_android", "(Ljava/lang/String;)V", "getOnSendPostbackMessage$zendesk_messaging_messaging_android", "setOnSendPostbackMessage$zendesk_messaging_messaging_android", "getOnCopyText$zendesk_messaging_messaging_android", "setOnCopyText$zendesk_messaging_messaging_android", "getOnFileAttachmentClicked$zendesk_messaging_messaging_android", "setOnFileAttachmentClicked$zendesk_messaging_messaging_android", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private Function1<? super CarouselAction, Unit> onCarouselAction;

        @NotNull
        private Function1<? super String, Unit> onCopyText;

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
        private Function1<? super Boolean, Unit> onLoadMoreListener;

        @NotNull
        private Function1<? super MessageAction.Reply, Unit> onReplyActionSelected;

        @NotNull
        private Function0<Unit> onRetryLoadMoreClickedListener;

        @NotNull
        private Function0<Unit> onSeeLatestClickedListener;

        @NotNull
        private Function2<? super String, ? super String, Unit> onSendPostbackMessage;

        @NotNull
        private UriHandler onUriClicked;

        @NotNull
        private WebViewUriHandler onWebViewUriClicked;

        @NotNull
        private String postbackErrorText;
        private boolean showPostbackErrorBanner;

        @NotNull
        private MessageLogState state;

        public Builder() {
            this.onReplyActionSelected = MessageLogListenersKt.getNOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER();
            this.onFailedMessageClicked = MessageLogListenersKt.getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER();
            this.onUriClicked = StubUriHandler.INSTANCE;
            this.onWebViewUriClicked = StubWebViewUriHandler.INSTANCE;
            this.onFormCompleted = MessageLogListenersKt.getNOOP_ON_FORM_COMPLETED();
            this.onCarouselAction = MessageLogListenersKt.getNOOP_ON_CAROUSEL_ACTION();
            this.onFormFocusChanged = MessageLogListenersKt.getNOOP_ON_FORM_FOCUS_CHANGED_LISTENER();
            this.state = new MessageLogState(null, false, null, false, false, false, null, null, null, 511, null);
            this.onFormDisplayedFieldsChanged = MessageLogListenersKt.getNOOP_ON_FORM_DISPLAYED_FIELDS_CHANGED();
            this.onRetryLoadMoreClickedListener = new n(11);
            int i11 = 12;
            this.onSeeLatestClickedListener = new n(i11);
            this.onLoadMoreListener = new o(i11);
            this.postbackErrorText = "";
            this.onSendPostbackMessage = MessageLogListenersKt.getNOOP_ON_SEND_POSTBACK_MESSAGE();
            this.onCopyText = MessageLogListenersKt.getNOOP_ON_COPY_TEXT_ACTION();
            this.onFileAttachmentClicked = MessageLogListenersKt.getNOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onLoadMoreListener$lambda$2(boolean z11) {
            return Unit.f26487a;
        }

        @NotNull
        public final MessageLogRendering build() {
            return new MessageLogRendering(this);
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
        public final Function1<Boolean, Unit> getOnLoadMoreListener$zendesk_messaging_messaging_android() {
            return this.onLoadMoreListener;
        }

        @NotNull
        public final Function1<MessageAction.Reply, Unit> getOnReplyActionSelected$zendesk_messaging_messaging_android() {
            return this.onReplyActionSelected;
        }

        @NotNull
        public final Function0<Unit> getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android() {
            return this.onRetryLoadMoreClickedListener;
        }

        @NotNull
        public final Function0<Unit> getOnSeeLatestClickedListener$zendesk_messaging_messaging_android() {
            return this.onSeeLatestClickedListener;
        }

        @NotNull
        public final Function2<String, String, Unit> getOnSendPostbackMessage$zendesk_messaging_messaging_android() {
            return this.onSendPostbackMessage;
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

        @NotNull
        /* JADX INFO: renamed from: getPostbackErrorText$zendesk_messaging_messaging_android, reason: from getter */
        public final String getPostbackErrorText() {
            return this.postbackErrorText;
        }

        /* JADX INFO: renamed from: getShowPostbackErrorBanner$zendesk_messaging_messaging_android, reason: from getter */
        public final boolean getShowPostbackErrorBanner() {
            return this.showPostbackErrorBanner;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_messaging_messaging_android, reason: from getter */
        public final MessageLogState getState() {
            return this.state;
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
        public final Builder onFormFocusChanged(@NotNull Function1<? super Boolean, Unit> onFormFocusChangedListener) {
            onFormFocusChangedListener.getClass();
            this.onFormFocusChanged = onFormFocusChangedListener;
            return this;
        }

        @NotNull
        public final Builder onLoadMoreListener(@NotNull Function1<? super Boolean, Unit> onLoadMoreListener) {
            onLoadMoreListener.getClass();
            this.onLoadMoreListener = onLoadMoreListener;
            return this;
        }

        @NotNull
        public final Builder onReplyActionSelected(@NotNull Function1<? super MessageAction.Reply, Unit> onReplyActionSelected) {
            onReplyActionSelected.getClass();
            this.onReplyActionSelected = onReplyActionSelected;
            return this;
        }

        @NotNull
        public final Builder onRetryLoadMoreClickedListener(@NotNull Function0<Unit> onRetryLoadMoreClickedListener) {
            onRetryLoadMoreClickedListener.getClass();
            this.onRetryLoadMoreClickedListener = onRetryLoadMoreClickedListener;
            return this;
        }

        @NotNull
        public final Builder onSeeLatestClickedListener(@NotNull Function0<Unit> onSeeLatestClickedListener) {
            onSeeLatestClickedListener.getClass();
            this.onSeeLatestClickedListener = onSeeLatestClickedListener;
            return this;
        }

        @NotNull
        public final Builder onSendPostbackMessage(@NotNull Function2<? super String, ? super String, Unit> onSendPostbackMessage) {
            onSendPostbackMessage.getClass();
            this.onSendPostbackMessage = onSendPostbackMessage;
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

        public final void setOnCarouselAction$zendesk_messaging_messaging_android(@NotNull Function1<? super CarouselAction, Unit> function1) {
            function1.getClass();
            this.onCarouselAction = function1;
        }

        public final void setOnCopyText$zendesk_messaging_messaging_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onCopyText = function1;
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

        public final void setOnLoadMoreListener$zendesk_messaging_messaging_android(@NotNull Function1<? super Boolean, Unit> function1) {
            function1.getClass();
            this.onLoadMoreListener = function1;
        }

        public final void setOnReplyActionSelected$zendesk_messaging_messaging_android(@NotNull Function1<? super MessageAction.Reply, Unit> function1) {
            function1.getClass();
            this.onReplyActionSelected = function1;
        }

        public final void setOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onRetryLoadMoreClickedListener = function0;
        }

        public final void setOnSeeLatestClickedListener$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onSeeLatestClickedListener = function0;
        }

        public final void setOnSendPostbackMessage$zendesk_messaging_messaging_android(@NotNull Function2<? super String, ? super String, Unit> function2) {
            function2.getClass();
            this.onSendPostbackMessage = function2;
        }

        public final void setOnUriClicked$zendesk_messaging_messaging_android(@NotNull UriHandler uriHandler) {
            uriHandler.getClass();
            this.onUriClicked = uriHandler;
        }

        public final void setOnWebViewUriClicked$zendesk_messaging_messaging_android(@NotNull WebViewUriHandler webViewUriHandler) {
            webViewUriHandler.getClass();
            this.onWebViewUriClicked = webViewUriHandler;
        }

        public final void setPostbackErrorText$zendesk_messaging_messaging_android(@NotNull String str) {
            str.getClass();
            this.postbackErrorText = str;
        }

        public final void setShowPostbackErrorBanner$zendesk_messaging_messaging_android(boolean z11) {
            this.showPostbackErrorBanner = z11;
        }

        public final void setState$zendesk_messaging_messaging_android(@NotNull MessageLogState messageLogState) {
            messageLogState.getClass();
            this.state = messageLogState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super MessageLogState, MessageLogState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (MessageLogState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull MessageLogRendering messageLogRendering) {
            this();
            messageLogRendering.getClass();
            this.onReplyActionSelected = messageLogRendering.getOnReplyActionSelected$zendesk_messaging_messaging_android();
            this.onFailedMessageClicked = messageLogRendering.getOnFailedMessageClicked$zendesk_messaging_messaging_android();
            this.onUriClicked = messageLogRendering.getOnUriClicked();
            this.onFormFocusChanged = messageLogRendering.getOnFormFocusChanged$zendesk_messaging_messaging_android();
            this.onFormDisplayedFieldsChanged = messageLogRendering.getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android();
            this.onLoadMoreListener = messageLogRendering.getOnLoadMoreListener$zendesk_messaging_messaging_android();
            this.onRetryLoadMoreClickedListener = messageLogRendering.getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android();
            this.onSeeLatestClickedListener = messageLogRendering.getOnSeeLatestClickedListener$zendesk_messaging_messaging_android();
            this.onCopyText = messageLogRendering.getOnCopyText$zendesk_messaging_messaging_android();
            this.onFileAttachmentClicked = messageLogRendering.getOnFileAttachmentClicked$zendesk_messaging_messaging_android();
            this.state = messageLogRendering.getState();
        }

        public /* synthetic */ Builder(MessageLogRendering messageLogRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new MessageLogRendering() : messageLogRendering);
        }
    }
}
