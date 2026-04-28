package zendesk.messaging.android.internal.conversationscreen;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageActionType;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageType;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.WebViewUriHandler;
import zendesk.messaging.android.internal.adapterdelegate.AdapterDelegatesManager;
import zendesk.messaging.android.internal.adapterdelegate.AsyncListDifferDelegationAdapter;
import zendesk.messaging.android.internal.conversationscreen.delegates.CarouselContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.FileMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.FormMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.ImageMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.MessageLoadMoreAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.MessagesDividerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.QuickReplyAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.TextMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.TypingIndicatorContainerAdapterDelegate;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.carousel.CarouselAction;
import zendesk.ui.android.conversation.form.DisplayedField;
import zendesk.ui.android.conversation.form.DisplayedForm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001tBa\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fRD\u0010)\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 j\u0002`#2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 j\u0002`#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010/\u001a\u00020*2\u0006\u0010$\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.RD\u00104\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\"0 j\u0002`12\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\"0 j\u0002`18F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(R$\u0010:\u001a\u0002052\u0006\u0010$\u001a\u0002058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010@\u001a\u00020;2\u0006\u0010$\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\\\u0010J\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\"0Aj\u0002`E2\"\u0010$\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\"0Aj\u0002`E8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IRD\u0010O\u001a\u0012\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\"0 j\u0002`L2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\"0 j\u0002`L8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010&\"\u0004\bN\u0010(RP\u0010T\u001a\u0018\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\"0Aj\u0002`Q2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\"0Aj\u0002`Q8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010G\"\u0004\bS\u0010IRD\u0010X\u001a\u0012\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\"0 j\u0002`U2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\"0 j\u0002`U8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010&\"\u0004\bW\u0010(RD\u0010]\u001a\u0012\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\"0 j\u0002`Z2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\"0 j\u0002`Z8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010&\"\u0004\b\\\u0010(RP\u0010b\u001a\u0018\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\"0Aj\u0002`_2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\"0Aj\u0002`_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010G\"\u0004\ba\u0010IR<\u0010i\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020d0c2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020d0c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR4\u0010o\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010j2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010j8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nRD\u0010s\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\"0 j\u0002`p2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\"0 j\u0002`p8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010&\"\u0004\br\u0010(¨\u0006u"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageListAdapter;", "Lzendesk/messaging/android/internal/adapterdelegate/AsyncListDifferDelegationAdapter;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/TextMessageContainerAdapterDelegate;", "textMessageContainerAdapterDelegate", "Lzendesk/messaging/android/internal/conversationscreen/delegates/MessagesDividerAdapterDelegate;", "messagesDividerAdapterDelegate", "Lzendesk/messaging/android/internal/conversationscreen/delegates/MessageLoadMoreAdapterDelegate;", "messageLoadMoreAdapterDelegate", "Lzendesk/messaging/android/internal/conversationscreen/delegates/QuickReplyAdapterDelegate;", "quickReplyAdapterDelegate", "Lzendesk/messaging/android/internal/conversationscreen/delegates/TypingIndicatorContainerAdapterDelegate;", "typingIndicatorContainerAdapterDelegate", "Lzendesk/messaging/android/internal/conversationscreen/delegates/FileMessageContainerAdapterDelegate;", "fileMessageContainerAdapterDelegate", "Lzendesk/messaging/android/internal/conversationscreen/delegates/ImageMessageContainerAdapterDelegate;", "imageMessageContainerAdapterDelegate", "Lzendesk/messaging/android/internal/conversationscreen/delegates/FormMessageContainerAdapterDelegate;", "formMessageContainerAdapterDelegate", "Lzendesk/messaging/android/internal/conversationscreen/delegates/CarouselContainerAdapterDelegate;", "carouselContainerAdapterDelegate", "<init>", "(Lzendesk/messaging/android/internal/conversationscreen/delegates/TextMessageContainerAdapterDelegate;Lzendesk/messaging/android/internal/conversationscreen/delegates/MessagesDividerAdapterDelegate;Lzendesk/messaging/android/internal/conversationscreen/delegates/MessageLoadMoreAdapterDelegate;Lzendesk/messaging/android/internal/conversationscreen/delegates/QuickReplyAdapterDelegate;Lzendesk/messaging/android/internal/conversationscreen/delegates/TypingIndicatorContainerAdapterDelegate;Lzendesk/messaging/android/internal/conversationscreen/delegates/FileMessageContainerAdapterDelegate;Lzendesk/messaging/android/internal/conversationscreen/delegates/ImageMessageContainerAdapterDelegate;Lzendesk/messaging/android/internal/conversationscreen/delegates/FormMessageContainerAdapterDelegate;Lzendesk/messaging/android/internal/conversationscreen/delegates/CarouselContainerAdapterDelegate;)V", "Lzendesk/messaging/android/internal/conversationscreen/delegates/TextMessageContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/MessagesDividerAdapterDelegate;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/MessageLoadMoreAdapterDelegate;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/QuickReplyAdapterDelegate;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/TypingIndicatorContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/FileMessageContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/ImageMessageContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/FormMessageContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/CarouselContainerAdapterDelegate;", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnReplyActionSelected;", "value", "getOnReplyActionSelected", "()Lkotlin/jvm/functions/Function1;", "setOnReplyActionSelected", "(Lkotlin/jvm/functions/Function1;)V", "onReplyActionSelected", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "messagingTheme", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "getOnFailedMessageClicked", "setOnFailedMessageClicked", "onFailedMessageClicked", "Lzendesk/messaging/android/internal/UriHandler;", "getOnUriClicked", "()Lzendesk/messaging/android/internal/UriHandler;", "setOnUriClicked", "(Lzendesk/messaging/android/internal/UriHandler;)V", "onUriClicked", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "getOnWebViewUriClicked", "()Lzendesk/messaging/android/internal/WebViewUriHandler;", "setOnWebViewUriClicked", "(Lzendesk/messaging/android/internal/WebViewUriHandler;)V", "onWebViewUriClicked", "Lkotlin/Function2;", "", "Lzendesk/conversationkit/android/model/Field;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormCompleted;", "getOnFormCompleted", "()Lkotlin/jvm/functions/Function2;", "setOnFormCompleted", "(Lkotlin/jvm/functions/Function2;)V", "onFormCompleted", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCarouselAction;", "getOnCarouselAction", "setOnCarouselAction", "onCarouselAction", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "getOnSendPostbackMessage", "setOnSendPostbackMessage", "onSendPostbackMessage", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCopyTextAction;", "getOnCopyText", "setOnCopyText", "onCopyText", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormFocusChangedListener;", "getOnFormFocusChanged", "setOnFormFocusChanged", "onFormFocusChanged", "Lzendesk/ui/android/conversation/form/DisplayedField;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "getOnFormDisplayedFieldsChanged", "setOnFormDisplayedFieldsChanged", "onFormDisplayedFieldsChanged", "", "Lzendesk/ui/android/conversation/form/DisplayedForm;", "getMapOfDisplayedFields", "()Ljava/util/Map;", "setMapOfDisplayedFields", "(Ljava/util/Map;)V", "mapOfDisplayedFields", "Lkotlin/Function0;", "getOnLoadMoreRetryClicked", "()Lkotlin/jvm/functions/Function0;", "setOnLoadMoreRetryClicked", "(Lkotlin/jvm/functions/Function0;)V", "onLoadMoreRetryClicked", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFileAttachmentClicked;", "getOnFileAttachmentClicked", "setOnFileAttachmentClicked", "onFileAttachmentClicked", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageListAdapter extends AsyncListDifferDelegationAdapter<MessageLogEntry> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CarouselContainerAdapterDelegate carouselContainerAdapterDelegate;

    @NotNull
    private final FileMessageContainerAdapterDelegate fileMessageContainerAdapterDelegate;

    @NotNull
    private final FormMessageContainerAdapterDelegate formMessageContainerAdapterDelegate;

    @NotNull
    private final ImageMessageContainerAdapterDelegate imageMessageContainerAdapterDelegate;

    @NotNull
    private final MessageLoadMoreAdapterDelegate messageLoadMoreAdapterDelegate;

    @NotNull
    private final MessagesDividerAdapterDelegate messagesDividerAdapterDelegate;

    @NotNull
    private final QuickReplyAdapterDelegate quickReplyAdapterDelegate;

    @NotNull
    private final TextMessageContainerAdapterDelegate textMessageContainerAdapterDelegate;

    @NotNull
    private final TypingIndicatorContainerAdapterDelegate typingIndicatorContainerAdapterDelegate;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ MessageListAdapter(TextMessageContainerAdapterDelegate textMessageContainerAdapterDelegate, MessagesDividerAdapterDelegate messagesDividerAdapterDelegate, MessageLoadMoreAdapterDelegate messageLoadMoreAdapterDelegate, QuickReplyAdapterDelegate quickReplyAdapterDelegate, TypingIndicatorContainerAdapterDelegate typingIndicatorContainerAdapterDelegate, FileMessageContainerAdapterDelegate fileMessageContainerAdapterDelegate, ImageMessageContainerAdapterDelegate imageMessageContainerAdapterDelegate, FormMessageContainerAdapterDelegate formMessageContainerAdapterDelegate, CarouselContainerAdapterDelegate carouselContainerAdapterDelegate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        int i12 = 1;
        this((i11 & 1) != 0 ? new TextMessageContainerAdapterDelegate(null, null, null, MessagingTheme.INSTANCE.getDEFAULT(), null, null, 55, null) : textMessageContainerAdapterDelegate, (i11 & 2) != 0 ? new MessagesDividerAdapterDelegate(MessagingTheme.INSTANCE.getDEFAULT()) : messagesDividerAdapterDelegate, (i11 & 4) != 0 ? new MessageLoadMoreAdapterDelegate() : messageLoadMoreAdapterDelegate, (i11 & 8) != 0 ? new QuickReplyAdapterDelegate(null, MessagingTheme.INSTANCE.getDEFAULT(), i12, 0 == true ? 1 : 0) : quickReplyAdapterDelegate, (i11 & 16) != 0 ? new TypingIndicatorContainerAdapterDelegate(MessagingTheme.INSTANCE.getDEFAULT()) : typingIndicatorContainerAdapterDelegate, (i11 & 32) != 0 ? new FileMessageContainerAdapterDelegate(null, null, null, MessagingTheme.INSTANCE.getDEFAULT(), 7, null) : fileMessageContainerAdapterDelegate, (i11 & 64) != 0 ? new ImageMessageContainerAdapterDelegate(null, null, MessagingTheme.INSTANCE.getDEFAULT(), null, null, 27, null) : imageMessageContainerAdapterDelegate, (i11 & 128) != 0 ? new FormMessageContainerAdapterDelegate(null, null, null, null, MessagingTheme.INSTANCE.getDEFAULT(), 15, null) : formMessageContainerAdapterDelegate, (i11 & 256) != 0 ? new CarouselContainerAdapterDelegate(0 == true ? 1 : 0, MessagingTheme.INSTANCE.getDEFAULT(), i12, 0 == true ? 1 : 0) : carouselContainerAdapterDelegate);
    }

    @NotNull
    public final Map<String, DisplayedForm> getMapOfDisplayedFields() {
        return this.formMessageContainerAdapterDelegate.getMapOfDisplayedForm();
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.textMessageContainerAdapterDelegate.getMessagingTheme();
    }

    @NotNull
    public final Function1<CarouselAction, Unit> getOnCarouselAction() {
        return this.carouselContainerAdapterDelegate.getOnCarouselAction();
    }

    @NotNull
    public final Function1<String, Unit> getOnCopyText() {
        return this.textMessageContainerAdapterDelegate.getOnCopyText();
    }

    @NotNull
    public final Function1<Message, Unit> getOnFailedMessageClicked() {
        return this.textMessageContainerAdapterDelegate.getOnFailedMessageClicked();
    }

    @NotNull
    public final Function1<Message, Unit> getOnFileAttachmentClicked() {
        return this.fileMessageContainerAdapterDelegate.getOnFileAttachmentClicked();
    }

    @NotNull
    public final Function2<List<? extends Field>, MessageLogEntry.FormMessageContainer, Unit> getOnFormCompleted() {
        return this.formMessageContainerAdapterDelegate.getOnFormCompleted();
    }

    @NotNull
    public final Function2<DisplayedField, String, Unit> getOnFormDisplayedFieldsChanged() {
        return this.formMessageContainerAdapterDelegate.getOnFormDisplayedFieldsChanged();
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFormFocusChanged() {
        return this.formMessageContainerAdapterDelegate.getOnFormFocusChangedListener();
    }

    @Nullable
    public final Function0<Unit> getOnLoadMoreRetryClicked() {
        return this.messageLoadMoreAdapterDelegate.getOnRetryClicked$zendesk_messaging_messaging_android();
    }

    @NotNull
    public final Function1<MessageAction.Reply, Unit> getOnReplyActionSelected() {
        return this.quickReplyAdapterDelegate.getOnOptionSelected();
    }

    @NotNull
    public final Function2<String, String, Unit> getOnSendPostbackMessage() {
        return this.textMessageContainerAdapterDelegate.getOnSendPostbackMessage();
    }

    @NotNull
    public final UriHandler getOnUriClicked() {
        return this.textMessageContainerAdapterDelegate.getOnUriClicked();
    }

    @NotNull
    public final WebViewUriHandler getOnWebViewUriClicked() {
        return this.textMessageContainerAdapterDelegate.getOnWebViewUriClicked();
    }

    public final void setMapOfDisplayedFields(@NotNull Map<String, DisplayedForm> map) {
        map.getClass();
        this.formMessageContainerAdapterDelegate.setMapOfDisplayedForm(map);
    }

    public final void setMessagingTheme(@NotNull MessagingTheme messagingTheme) {
        messagingTheme.getClass();
        this.carouselContainerAdapterDelegate.setMessagingTheme(messagingTheme);
        this.textMessageContainerAdapterDelegate.setMessagingTheme(messagingTheme);
        this.messagesDividerAdapterDelegate.setMessagingTheme(messagingTheme);
        this.quickReplyAdapterDelegate.setMessagingTheme(messagingTheme);
        this.typingIndicatorContainerAdapterDelegate.setMessagingTheme(messagingTheme);
        this.fileMessageContainerAdapterDelegate.setMessagingTheme(messagingTheme);
        this.formMessageContainerAdapterDelegate.setMessagingTheme(messagingTheme);
        this.imageMessageContainerAdapterDelegate.setMessagingTheme(messagingTheme);
    }

    public final void setOnCarouselAction(@NotNull Function1<? super CarouselAction, Unit> function1) {
        function1.getClass();
        this.carouselContainerAdapterDelegate.setOnCarouselAction(function1);
    }

    public final void setOnCopyText(@NotNull Function1<? super String, Unit> function1) {
        function1.getClass();
        this.textMessageContainerAdapterDelegate.setOnCopyText(function1);
    }

    public final void setOnFailedMessageClicked(@NotNull Function1<? super Message, Unit> function1) {
        function1.getClass();
        this.textMessageContainerAdapterDelegate.setOnFailedMessageClicked(function1);
        this.fileMessageContainerAdapterDelegate.setOnFailedMessageClicked(function1);
        this.imageMessageContainerAdapterDelegate.setOnFailedMessageClicked(function1);
    }

    public final void setOnFileAttachmentClicked(@NotNull Function1<? super Message, Unit> function1) {
        function1.getClass();
        this.fileMessageContainerAdapterDelegate.setOnFileAttachmentClicked(function1);
    }

    public final void setOnFormCompleted(@NotNull Function2<? super List<? extends Field>, ? super MessageLogEntry.FormMessageContainer, Unit> function2) {
        function2.getClass();
        this.formMessageContainerAdapterDelegate.setOnFormCompleted(function2);
    }

    public final void setOnFormDisplayedFieldsChanged(@NotNull Function2<? super DisplayedField, ? super String, Unit> function2) {
        function2.getClass();
        this.formMessageContainerAdapterDelegate.setOnFormDisplayedFieldsChanged(function2);
    }

    public final void setOnFormFocusChanged(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.formMessageContainerAdapterDelegate.setOnFormFocusChangedListener(function1);
    }

    public final void setOnLoadMoreRetryClicked(@Nullable Function0<Unit> function0) {
        this.messageLoadMoreAdapterDelegate.setOnRetryClicked$zendesk_messaging_messaging_android(function0);
    }

    public final void setOnReplyActionSelected(@NotNull Function1<? super MessageAction.Reply, Unit> function1) {
        function1.getClass();
        this.quickReplyAdapterDelegate.setOnOptionSelected(function1);
    }

    public final void setOnSendPostbackMessage(@NotNull Function2<? super String, ? super String, Unit> function2) {
        function2.getClass();
        this.imageMessageContainerAdapterDelegate.setOnSendPostbackMessage(function2);
        this.textMessageContainerAdapterDelegate.setOnSendPostbackMessage(function2);
    }

    public final void setOnUriClicked(@NotNull UriHandler uriHandler) {
        uriHandler.getClass();
        this.textMessageContainerAdapterDelegate.setOnUriClicked(uriHandler);
        this.fileMessageContainerAdapterDelegate.setOnUriClicked(uriHandler);
        this.imageMessageContainerAdapterDelegate.setOnUriClicked(uriHandler);
    }

    public final void setOnWebViewUriClicked(@NotNull WebViewUriHandler webViewUriHandler) {
        webViewUriHandler.getClass();
        this.textMessageContainerAdapterDelegate.setOnWebViewUriClicked(webViewUriHandler);
        this.imageMessageContainerAdapterDelegate.setOnWebViewUriClicked(webViewUriHandler);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0013"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageListAdapter$Companion;", "Landroidx/recyclerview/widget/w;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "<init>", "()V", "Lzendesk/conversationkit/android/model/MessageContent;", "oldItemContent", "newItemContent", "", "isText", "Lzendesk/messaging/android/internal/conversationscreen/MessageListAdapter$Companion$PostbackDiffData;", "getPostbackInfo", "(Lzendesk/conversationkit/android/model/MessageContent;Lzendesk/conversationkit/android/model/MessageContent;Z)Lzendesk/messaging/android/internal/conversationscreen/MessageListAdapter$Companion$PostbackDiffData;", "oldItem", "newItem", "areItemsTheSame", "(Lzendesk/messaging/android/internal/model/MessageLogEntry;Lzendesk/messaging/android/internal/model/MessageLogEntry;)Z", "areContentsTheSame", "PostbackDiffData", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends androidx.recyclerview.widget.w {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageListAdapter$Companion$PostbackDiffData;", "", "isOldPostbackMessageAction", "", "isNewPostbackMessageAction", "oldPostbackMessageAction", "Lzendesk/conversationkit/android/model/MessageAction$Postback;", "newPostbackMessageAction", "<init>", "(ZZLzendesk/conversationkit/android/model/MessageAction$Postback;Lzendesk/conversationkit/android/model/MessageAction$Postback;)V", "()Z", "getOldPostbackMessageAction", "()Lzendesk/conversationkit/android/model/MessageAction$Postback;", "getNewPostbackMessageAction", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PostbackDiffData {
            private final boolean isNewPostbackMessageAction;
            private final boolean isOldPostbackMessageAction;

            @Nullable
            private final MessageAction.Postback newPostbackMessageAction;

            @Nullable
            private final MessageAction.Postback oldPostbackMessageAction;

            public PostbackDiffData(boolean z11, boolean z12, @Nullable MessageAction.Postback postback, @Nullable MessageAction.Postback postback2) {
                this.isOldPostbackMessageAction = z11;
                this.isNewPostbackMessageAction = z12;
                this.oldPostbackMessageAction = postback;
                this.newPostbackMessageAction = postback2;
            }

            public static /* synthetic */ PostbackDiffData copy$default(PostbackDiffData postbackDiffData, boolean z11, boolean z12, MessageAction.Postback postback, MessageAction.Postback postback2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = postbackDiffData.isOldPostbackMessageAction;
                }
                if ((i11 & 2) != 0) {
                    z12 = postbackDiffData.isNewPostbackMessageAction;
                }
                if ((i11 & 4) != 0) {
                    postback = postbackDiffData.oldPostbackMessageAction;
                }
                if ((i11 & 8) != 0) {
                    postback2 = postbackDiffData.newPostbackMessageAction;
                }
                return postbackDiffData.copy(z11, z12, postback, postback2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getIsOldPostbackMessageAction() {
                return this.isOldPostbackMessageAction;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getIsNewPostbackMessageAction() {
                return this.isNewPostbackMessageAction;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final MessageAction.Postback getOldPostbackMessageAction() {
                return this.oldPostbackMessageAction;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final MessageAction.Postback getNewPostbackMessageAction() {
                return this.newPostbackMessageAction;
            }

            @NotNull
            public final PostbackDiffData copy(boolean isOldPostbackMessageAction, boolean isNewPostbackMessageAction, @Nullable MessageAction.Postback oldPostbackMessageAction, @Nullable MessageAction.Postback newPostbackMessageAction) {
                return new PostbackDiffData(isOldPostbackMessageAction, isNewPostbackMessageAction, oldPostbackMessageAction, newPostbackMessageAction);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PostbackDiffData)) {
                    return false;
                }
                PostbackDiffData postbackDiffData = (PostbackDiffData) other;
                return this.isOldPostbackMessageAction == postbackDiffData.isOldPostbackMessageAction && this.isNewPostbackMessageAction == postbackDiffData.isNewPostbackMessageAction && Intrinsics.areEqual(this.oldPostbackMessageAction, postbackDiffData.oldPostbackMessageAction) && Intrinsics.areEqual(this.newPostbackMessageAction, postbackDiffData.newPostbackMessageAction);
            }

            @Nullable
            public final MessageAction.Postback getNewPostbackMessageAction() {
                return this.newPostbackMessageAction;
            }

            @Nullable
            public final MessageAction.Postback getOldPostbackMessageAction() {
                return this.oldPostbackMessageAction;
            }

            public int hashCode() {
                int iE = r8.k.e(Boolean.hashCode(this.isOldPostbackMessageAction) * 31, 31, this.isNewPostbackMessageAction);
                MessageAction.Postback postback = this.oldPostbackMessageAction;
                int iHashCode = (iE + (postback == null ? 0 : postback.hashCode())) * 31;
                MessageAction.Postback postback2 = this.newPostbackMessageAction;
                return iHashCode + (postback2 != null ? postback2.hashCode() : 0);
            }

            public final boolean isNewPostbackMessageAction() {
                return this.isNewPostbackMessageAction;
            }

            public final boolean isOldPostbackMessageAction() {
                return this.isOldPostbackMessageAction;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isOldPostbackMessageAction;
                boolean z12 = this.isNewPostbackMessageAction;
                MessageAction.Postback postback = this.oldPostbackMessageAction;
                MessageAction.Postback postback2 = this.newPostbackMessageAction;
                StringBuilder sbP = b3.i.p("PostbackDiffData(isOldPostbackMessageAction=", z11, ", isNewPostbackMessageAction=", z12, ", oldPostbackMessageAction=");
                sbP.append(postback);
                sbP.append(", newPostbackMessageAction=");
                sbP.append(postback2);
                sbP.append(")");
                return sbP.toString();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PostbackDiffData getPostbackInfo(MessageContent oldItemContent, MessageContent newItemContent, boolean isText) {
            boolean z11;
            MessageAction.Postback postback;
            boolean z12;
            boolean z13;
            boolean z14 = false;
            MessageAction.Postback postback2 = null;
            if (isText) {
                newItemContent.getClass();
                List<MessageAction> actions = ((MessageContent.Text) newItemContent).getActions();
                if (actions != null) {
                    z11 = false;
                    for (MessageAction messageAction : actions) {
                        boolean z15 = messageAction.getMessageActionType() == MessageActionType.POSTBACK;
                        if (z15) {
                            postback = (MessageAction.Postback) messageAction;
                            z11 = z15;
                            break;
                        }
                        z11 = z15;
                    }
                } else {
                    z11 = false;
                }
                postback = null;
                oldItemContent.getClass();
                List<MessageAction> actions2 = ((MessageContent.Text) oldItemContent).getActions();
                if (actions2 != null) {
                    z12 = false;
                    for (MessageAction messageAction2 : actions2) {
                        z13 = messageAction2.getMessageActionType() == MessageActionType.POSTBACK;
                        if (z13) {
                            postback2 = (MessageAction.Postback) messageAction2;
                            z14 = z13;
                            break;
                        }
                        z12 = z13;
                    }
                    z14 = z12;
                }
            } else {
                newItemContent.getClass();
                List<MessageAction> actions3 = ((MessageContent.Image) newItemContent).getActions();
                if (actions3 != null) {
                    z11 = false;
                    for (MessageAction messageAction3 : actions3) {
                        boolean z16 = messageAction3.getMessageActionType() == MessageActionType.POSTBACK;
                        if (z16) {
                            postback = (MessageAction.Postback) messageAction3;
                            z11 = z16;
                            break;
                        }
                        z11 = z16;
                    }
                } else {
                    z11 = false;
                }
                postback = null;
                oldItemContent.getClass();
                List<MessageAction> actions4 = ((MessageContent.Image) oldItemContent).getActions();
                if (actions4 != null) {
                    z12 = false;
                    for (MessageAction messageAction4 : actions4) {
                        z13 = messageAction4.getMessageActionType() == MessageActionType.POSTBACK;
                        if (z13) {
                            postback2 = (MessageAction.Postback) messageAction4;
                            z14 = z13;
                            break;
                        }
                        z12 = z13;
                    }
                    z14 = z12;
                }
            }
            return new PostbackDiffData(z14, z11, postback2, postback);
        }

        public static /* synthetic */ PostbackDiffData getPostbackInfo$default(Companion companion, MessageContent messageContent, MessageContent messageContent2, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return companion.getPostbackInfo(messageContent, messageContent2, z11);
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areContentsTheSame(@NotNull MessageLogEntry oldItem, @NotNull MessageLogEntry newItem) {
            oldItem.getClass();
            newItem.getClass();
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.w
        public boolean areItemsTheSame(@NotNull MessageLogEntry oldItem, @NotNull MessageLogEntry newItem) {
            oldItem.getClass();
            newItem.getClass();
            if ((oldItem instanceof MessageLogEntry.LoadMore) && (newItem instanceof MessageLogEntry.LoadMore)) {
                return Intrinsics.areEqual(((MessageLogEntry.LoadMore) oldItem).getId(), ((MessageLogEntry.LoadMore) newItem).getId());
            }
            if ((oldItem instanceof MessageLogEntry.MessagesDivider) && (newItem instanceof MessageLogEntry.MessagesDivider)) {
                return Intrinsics.areEqual(((MessageLogEntry.MessagesDivider) oldItem).getText(), ((MessageLogEntry.MessagesDivider) newItem).getText());
            }
            if ((oldItem instanceof MessageLogEntry.TextMessageContainer) && (newItem instanceof MessageLogEntry.TextMessageContainer)) {
                MessageLogEntry.TextMessageContainer textMessageContainer = (MessageLogEntry.TextMessageContainer) oldItem;
                MessageType messageContentType = textMessageContainer.getMessage().getContent().getMessageContentType();
                MessageType messageType = MessageType.TEXT;
                if (messageContentType == messageType) {
                    MessageLogEntry.TextMessageContainer textMessageContainer2 = (MessageLogEntry.TextMessageContainer) newItem;
                    if (textMessageContainer2.getMessage().getContent().getMessageContentType() == messageType) {
                        PostbackDiffData postbackInfo = getPostbackInfo(textMessageContainer.getMessage().getContent(), textMessageContainer2.getMessage().getContent(), true);
                        return (postbackInfo.isNewPostbackMessageAction() && postbackInfo.isOldPostbackMessageAction()) ? Intrinsics.areEqual(textMessageContainer.getMessage().getLocalId(), textMessageContainer2.getMessage().getLocalId()) && Intrinsics.areEqual(postbackInfo.getNewPostbackMessageAction(), postbackInfo.getOldPostbackMessageAction()) : Intrinsics.areEqual(textMessageContainer.getMessage().getLocalId(), textMessageContainer2.getMessage().getLocalId());
                    }
                }
            }
            if ((oldItem instanceof MessageLogEntry.ImageMessageContainer) && (newItem instanceof MessageLogEntry.ImageMessageContainer)) {
                MessageLogEntry.ImageMessageContainer imageMessageContainer = (MessageLogEntry.ImageMessageContainer) oldItem;
                MessageType messageContentType2 = imageMessageContainer.getMessage().getContent().getMessageContentType();
                MessageType messageType2 = MessageType.IMAGE;
                if (messageContentType2 == messageType2) {
                    MessageLogEntry.ImageMessageContainer imageMessageContainer2 = (MessageLogEntry.ImageMessageContainer) newItem;
                    if (imageMessageContainer2.getMessage().getContent().getMessageContentType() == messageType2) {
                        PostbackDiffData postbackInfo2 = getPostbackInfo(imageMessageContainer.getMessage().getContent(), imageMessageContainer2.getMessage().getContent(), false);
                        return (postbackInfo2.isNewPostbackMessageAction() && postbackInfo2.isOldPostbackMessageAction()) ? Intrinsics.areEqual(imageMessageContainer.getMessage().getLocalId(), imageMessageContainer2.getMessage().getLocalId()) && Intrinsics.areEqual(postbackInfo2.getNewPostbackMessageAction(), postbackInfo2.getOldPostbackMessageAction()) : Intrinsics.areEqual(imageMessageContainer.getMessage().getLocalId(), imageMessageContainer2.getMessage().getLocalId());
                    }
                }
            }
            if ((oldItem instanceof MessageLogEntry.MessageContainer) && (newItem instanceof MessageLogEntry.MessageContainer)) {
                return Intrinsics.areEqual(((MessageLogEntry.MessageContainer) oldItem).getMessage().getLocalId(), ((MessageLogEntry.MessageContainer) newItem).getMessage().getLocalId());
            }
            if ((oldItem instanceof MessageLogEntry.CarouselContainer) && (newItem instanceof MessageLogEntry.CarouselContainer)) {
                return Intrinsics.areEqual(((MessageLogEntry.CarouselContainer) oldItem).getMessage().getLocalId(), ((MessageLogEntry.CarouselContainer) newItem).getMessage().getLocalId());
            }
            if ((oldItem instanceof MessageLogEntry.FileMessageContainer) && (newItem instanceof MessageLogEntry.FileMessageContainer)) {
                return Intrinsics.areEqual(((MessageLogEntry.FileMessageContainer) oldItem).getMessage().getLocalId(), ((MessageLogEntry.FileMessageContainer) newItem).getMessage().getLocalId());
            }
            if ((oldItem instanceof MessageLogEntry.FormMessageContainer) && (newItem instanceof MessageLogEntry.FormMessageContainer)) {
                return Intrinsics.areEqual(((MessageLogEntry.FormMessageContainer) oldItem).getMessage().getLocalId(), ((MessageLogEntry.FormMessageContainer) newItem).getMessage().getLocalId());
            }
            if ((oldItem instanceof MessageLogEntry.QuickReply) && (newItem instanceof MessageLogEntry.QuickReply)) {
                return Intrinsics.areEqual(((MessageLogEntry.QuickReply) oldItem).getReplies(), ((MessageLogEntry.QuickReply) newItem).getReplies());
            }
            if ((oldItem instanceof MessageLogEntry.TypingIndicatorContainer) && (newItem instanceof MessageLogEntry.TypingIndicatorContainer)) {
                return Intrinsics.areEqual(((MessageLogEntry.TypingIndicatorContainer) oldItem).getAvatarUrl(), ((MessageLogEntry.TypingIndicatorContainer) newItem).getAvatarUrl());
            }
            return false;
        }

        private Companion() {
        }
    }

    public MessageListAdapter() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListAdapter(@NotNull TextMessageContainerAdapterDelegate textMessageContainerAdapterDelegate, @NotNull MessagesDividerAdapterDelegate messagesDividerAdapterDelegate, @NotNull MessageLoadMoreAdapterDelegate messageLoadMoreAdapterDelegate, @NotNull QuickReplyAdapterDelegate quickReplyAdapterDelegate, @NotNull TypingIndicatorContainerAdapterDelegate typingIndicatorContainerAdapterDelegate, @NotNull FileMessageContainerAdapterDelegate fileMessageContainerAdapterDelegate, @NotNull ImageMessageContainerAdapterDelegate imageMessageContainerAdapterDelegate, @NotNull FormMessageContainerAdapterDelegate formMessageContainerAdapterDelegate, @NotNull CarouselContainerAdapterDelegate carouselContainerAdapterDelegate) {
        super(INSTANCE, new AdapterDelegatesManager(formMessageContainerAdapterDelegate, fileMessageContainerAdapterDelegate, textMessageContainerAdapterDelegate, messagesDividerAdapterDelegate, typingIndicatorContainerAdapterDelegate, messageLoadMoreAdapterDelegate, quickReplyAdapterDelegate, imageMessageContainerAdapterDelegate, carouselContainerAdapterDelegate));
        textMessageContainerAdapterDelegate.getClass();
        messagesDividerAdapterDelegate.getClass();
        messageLoadMoreAdapterDelegate.getClass();
        quickReplyAdapterDelegate.getClass();
        typingIndicatorContainerAdapterDelegate.getClass();
        fileMessageContainerAdapterDelegate.getClass();
        imageMessageContainerAdapterDelegate.getClass();
        formMessageContainerAdapterDelegate.getClass();
        carouselContainerAdapterDelegate.getClass();
        this.textMessageContainerAdapterDelegate = textMessageContainerAdapterDelegate;
        this.messagesDividerAdapterDelegate = messagesDividerAdapterDelegate;
        this.messageLoadMoreAdapterDelegate = messageLoadMoreAdapterDelegate;
        this.quickReplyAdapterDelegate = quickReplyAdapterDelegate;
        this.typingIndicatorContainerAdapterDelegate = typingIndicatorContainerAdapterDelegate;
        this.fileMessageContainerAdapterDelegate = fileMessageContainerAdapterDelegate;
        this.imageMessageContainerAdapterDelegate = imageMessageContainerAdapterDelegate;
        this.formMessageContainerAdapterDelegate = formMessageContainerAdapterDelegate;
        this.carouselContainerAdapterDelegate = carouselContainerAdapterDelegate;
    }
}
