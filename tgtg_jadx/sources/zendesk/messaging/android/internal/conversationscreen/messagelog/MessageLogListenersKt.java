package zendesk.messaging.android.internal.conversationscreen.messagelog;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.messaging.android.internal.conversationscreen.n;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.carousel.CarouselAction;
import zendesk.ui.android.conversation.form.DisplayedField;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"6\u0010\u0011\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\fj\u0002`\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007\"0\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\fj\u0002`\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"*\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0005\u001a\u0004\b\u001f\u0010\u0007\"$\u0010\"\u001a\f\u0012\u0004\u0012\u00020\u00020 j\u0002`!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"*\u0010(\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010\u0005\u001a\u0004\b)\u0010\u0007\"0\u0010,\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\fj\u0002`+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\"*\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u0005\u001a\u0004\b0\u0010\u0007*$\b\u0000\u00101\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000*$\b\u0000\u00103\"\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00020\u0000*$\b\u0000\u00105\"\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00020\u0000*$\b\u0000\u00106\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000*<\b\u0000\u00107\"\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\f2\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\f*$\b\u0000\u00108\"\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u0000*\u0018\b\u0000\u00109\"\b\u0012\u0004\u0012\u00020\u00020 2\b\u0012\u0004\u0012\u00020\u00020 *$\b\u0000\u0010:\"\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0000*$\b\u0000\u0010;\"\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020\u0000*0\b\u0000\u0010<\"\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\f2\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\f*0\b\u0000\u0010=\"\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\f2\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\f*H\b\u0000\u0010A\" \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00020>2 \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00020>*$\b\u0000\u0010B\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006C"}, d2 = {"Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnReplyActionSelected;", "NOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER", "Lkotlin/jvm/functions/Function1;", "getNOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER", "()Lkotlin/jvm/functions/Function1;", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "NOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER", "getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER", "Lkotlin/Function2;", "", "Lzendesk/conversationkit/android/model/Field;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormCompleted;", "NOOP_ON_FORM_COMPLETED", "Lkotlin/jvm/functions/Function2;", "getNOOP_ON_FORM_COMPLETED", "()Lkotlin/jvm/functions/Function2;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCarouselAction;", "NOOP_ON_CAROUSEL_ACTION", "getNOOP_ON_CAROUSEL_ACTION", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "NOOP_ON_SEND_POSTBACK_MESSAGE", "getNOOP_ON_SEND_POSTBACK_MESSAGE", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCopyTextAction;", "NOOP_ON_COPY_TEXT_ACTION", "getNOOP_ON_COPY_TEXT_ACTION", "Lkotlin/Function0;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnRetryConnectionClickedListener;", "NOOP_ON_RETRY_CONNECTION_CLICKED_LISTENER", "Lkotlin/jvm/functions/Function0;", "getNOOP_ON_RETRY_CONNECTION_CLICKED_LISTENER", "()Lkotlin/jvm/functions/Function0;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormFocusChangedListener;", "NOOP_ON_FORM_FOCUS_CHANGED_LISTENER", "getNOOP_ON_FORM_FOCUS_CHANGED_LISTENER", "Lzendesk/ui/android/conversation/form/DisplayedField;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "NOOP_ON_FORM_DISPLAYED_FIELDS_CHANGED", "getNOOP_ON_FORM_DISPLAYED_FIELDS_CHANGED", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFileAttachmentClicked;", "NOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION", "getNOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION", "OnFailedMessageClickedListener", "Lzendesk/messaging/android/internal/model/MessageLogEntry$MessageContainer;", "OnMessageClickedListener", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOption;", "OnQuickReplyOptionListener", "OnReplyActionSelected", "OnFormCompleted", "OnCarouselAction", "OnRetryConnectionClickedListener", "OnCopyTextAction", "OnFormFocusChangedListener", "OnFormDisplayedFieldsChanged", "OnSendPostbackMessage", "Lkotlin/Function4;", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "OnWebViewMessage", "OnFileAttachmentClicked", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MessageLogListenersKt {

    @NotNull
    private static final Function1<Boolean, Unit> NOOP_ON_FORM_FOCUS_CHANGED_LISTENER;

    @NotNull
    private static final Function0<Unit> NOOP_ON_RETRY_CONNECTION_CLICKED_LISTENER;

    @NotNull
    private static final Function1<MessageAction.Reply, Unit> NOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER = new o(6);

    @NotNull
    private static final Function1<Message, Unit> NOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER = new o(7);

    @NotNull
    private static final Function2<List<? extends Field>, MessageLogEntry.FormMessageContainer, Unit> NOOP_ON_FORM_COMPLETED = new yn.a(21);

    @NotNull
    private static final Function1<CarouselAction, Unit> NOOP_ON_CAROUSEL_ACTION = new o(8);

    @NotNull
    private static final Function2<String, String, Unit> NOOP_ON_SEND_POSTBACK_MESSAGE = new yn.a(22);

    @NotNull
    private static final Function1<String, Unit> NOOP_ON_COPY_TEXT_ACTION = new o(9);

    @NotNull
    private static final Function2<DisplayedField, String, Unit> NOOP_ON_FORM_DISPLAYED_FIELDS_CHANGED = new yn.a(23);

    @NotNull
    private static final Function1<Message, Unit> NOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION = new o(11);

    static {
        int i11 = 10;
        NOOP_ON_RETRY_CONNECTION_CLICKED_LISTENER = new n(i11);
        NOOP_ON_FORM_FOCUS_CHANGED_LISTENER = new o(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NOOP_ON_CAROUSEL_ACTION$lambda$3(CarouselAction carouselAction) {
        carouselAction.getClass();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NOOP_ON_COPY_TEXT_ACTION$lambda$5(String str) {
        str.getClass();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION$lambda$9(Message message) {
        message.getClass();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NOOP_ON_FORM_COMPLETED$lambda$2(List list, MessageLogEntry.FormMessageContainer formMessageContainer) {
        list.getClass();
        formMessageContainer.getClass();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NOOP_ON_FORM_DISPLAYED_FIELDS_CHANGED$lambda$8(DisplayedField displayedField, String str) {
        displayedField.getClass();
        str.getClass();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NOOP_ON_FORM_FOCUS_CHANGED_LISTENER$lambda$7(boolean z11) {
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER$lambda$1(Message message) {
        message.getClass();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER$lambda$0(MessageAction.Reply reply) {
        reply.getClass();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NOOP_ON_SEND_POSTBACK_MESSAGE$lambda$4(String str, String str2) {
        str.getClass();
        str2.getClass();
        return Unit.f26487a;
    }

    @NotNull
    public static final Function1<CarouselAction, Unit> getNOOP_ON_CAROUSEL_ACTION() {
        return NOOP_ON_CAROUSEL_ACTION;
    }

    @NotNull
    public static final Function1<String, Unit> getNOOP_ON_COPY_TEXT_ACTION() {
        return NOOP_ON_COPY_TEXT_ACTION;
    }

    @NotNull
    public static final Function1<Message, Unit> getNOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION() {
        return NOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION;
    }

    @NotNull
    public static final Function2<List<? extends Field>, MessageLogEntry.FormMessageContainer, Unit> getNOOP_ON_FORM_COMPLETED() {
        return NOOP_ON_FORM_COMPLETED;
    }

    @NotNull
    public static final Function2<DisplayedField, String, Unit> getNOOP_ON_FORM_DISPLAYED_FIELDS_CHANGED() {
        return NOOP_ON_FORM_DISPLAYED_FIELDS_CHANGED;
    }

    @NotNull
    public static final Function1<Boolean, Unit> getNOOP_ON_FORM_FOCUS_CHANGED_LISTENER() {
        return NOOP_ON_FORM_FOCUS_CHANGED_LISTENER;
    }

    @NotNull
    public static final Function1<Message, Unit> getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER() {
        return NOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER;
    }

    @NotNull
    public static final Function1<MessageAction.Reply, Unit> getNOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER() {
        return NOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER;
    }

    @NotNull
    public static final Function0<Unit> getNOOP_ON_RETRY_CONNECTION_CLICKED_LISTENER() {
        return NOOP_ON_RETRY_CONNECTION_CLICKED_LISTENER;
    }

    @NotNull
    public static final Function2<String, String, Unit> getNOOP_ON_SEND_POSTBACK_MESSAGE() {
        return NOOP_ON_SEND_POSTBACK_MESSAGE;
    }
}
