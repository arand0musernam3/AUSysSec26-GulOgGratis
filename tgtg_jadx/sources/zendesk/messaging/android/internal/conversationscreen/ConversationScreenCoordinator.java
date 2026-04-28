package zendesk.messaging.android.internal.conversationscreen;

import android.os.Build;
import com.braze.h2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.y;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import w.a0;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.MessagingDelegate;
import zendesk.android.messaging.UrlSource;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.AttachmentIntents;
import zendesk.messaging.android.internal.AttachmentIntentsLauncher;
import zendesk.messaging.android.internal.KnownUriSchemes;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.VisibleScreen;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.WebViewUriHandler;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenAction;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.UploadFile;
import zendesk.messaging.android.internal.permissions.RuntimePermissionRequester;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.carousel.CarouselAction;
import zendesk.ui.android.conversation.form.DisplayedField;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 v2\u00020\u0001:\u0001vB\u00ad\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b#\u0010$J\u000f\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020\u0007H\u0000¢\u0006\u0004\b)\u0010'J+\u0010/\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b/\u00100J\u001d\u00106\u001a\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00108\u001a\u00020\u0007H\u0000¢\u0006\u0004\b7\u0010'J\u000f\u0010:\u001a\u00020\u0007H\u0000¢\u0006\u0004\b9\u0010'J\u000f\u0010;\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010'J\u000f\u0010<\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010'J%\u0010@\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010JR\"\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010KR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010LR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010MR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010OR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010PR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010QR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010RR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010SR$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010KR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010TR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010UR4\u0010W\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR4\u0010Z\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u00070\u00050V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010XR8\u0010]\u001a&\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\\0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010XR*\u0010_\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\tj\u0002`^0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010KRD\u0010c\u001a2\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020`01\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00070Vj\u0002`b0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010XR0\u0010e\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`d0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010KR4\u0010f\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010XR8\u0010i\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070Vj\u0002`h0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010KR(\u0010j\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010KR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010LR4\u0010m\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\u00070\u00050V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010XR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010LR$\u0010q\u001a\u0012\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010KR*\u0010s\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070Vj\u0002`r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010XR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010LR \u0010u\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010K¨\u0006w"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenCoordinator;", "", "Lzendesk/ui/android/Renderer;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering;", "conversationScreenRenderer", "Lkotlin/Function1;", "", "", "onBackButtonClicked", "Lkotlin/Function0;", "onDeniedPermissionActionClicked", "", "onAttachMenuItemClicked", "Lzendesk/messaging/android/internal/UriHandler;", "uriHandler", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "webViewUriHandler", "Lzendesk/messaging/android/internal/AttachmentIntents;", "attachmentIntents", "Lv80/b0;", "coroutineScope", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "visibleScreenTracker", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel;", "conversationScreenViewModel", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCopyTextAction;", "onCopyTextAction", "Lzendesk/messaging/android/internal/permissions/RuntimePermissionRequester;", "permissionRequester", "Lzendesk/messaging/android/internal/AttachmentIntentsLauncher;", "attachmentIntentLauncher", "<init>", "(Lzendesk/ui/android/Renderer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/UriHandler;Lzendesk/messaging/android/internal/WebViewUriHandler;Lzendesk/messaging/android/internal/AttachmentIntents;Lv80/b0;Lzendesk/messaging/android/internal/VisibleScreenTracker;Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel;Lzendesk/android/messaging/model/MessagingSettings;Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/permissions/RuntimePermissionRequester;Lzendesk/messaging/android/internal/AttachmentIntentsLauncher;)V", "init$zendesk_messaging_messaging_android", "(Lx70/c;)Ljava/lang/Object;", "init", "launchCamera$zendesk_messaging_messaging_android", "()V", "launchCamera", "launchGallery$zendesk_messaging_messaging_android", "launchGallery", "uri", "Lzendesk/android/messaging/UrlSource;", "urlSource", "launchIntent", "handleUri", "(Ljava/lang/String;Lzendesk/android/messaging/UrlSource;Lkotlin/jvm/functions/Function0;)V", "", "Lzendesk/messaging/android/internal/model/UploadFile;", "uploads", "dispatchUploadFilesAction$zendesk_messaging_messaging_android", "(Ljava/util/List;)V", "dispatchUploadFilesAction", "dispatchUploadFilesForRestoredUrisAction$zendesk_messaging_messaging_android", "dispatchUploadFilesForRestoredUrisAction", "clearNewMessagesDivider$zendesk_messaging_messaging_android", "clearNewMessagesDivider", "capturePhoto", "openGallery", "", "isGranted", "action", "showPermissionDialogIfNeeded", "(ZLkotlin/jvm/functions/Function0;)V", "setupWithStore", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel;Lx70/c;)Ljava/lang/Object;", "setupScreenEvents", "(Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel;)V", "actionId", TextBundle.TEXT_ENTRY, "sendPostbackMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "Lzendesk/ui/android/Renderer;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lzendesk/messaging/android/internal/UriHandler;", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "Lzendesk/messaging/android/internal/AttachmentIntents;", "Lv80/b0;", "Lzendesk/messaging/android/internal/VisibleScreenTracker;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenViewModel;", "Lzendesk/android/messaging/model/MessagingSettings;", "Lzendesk/messaging/android/internal/permissions/RuntimePermissionRequester;", "Lzendesk/messaging/android/internal/AttachmentIntentsLauncher;", "Lkotlin/Function2;", "onSendButtonClickedProvider", "Lkotlin/jvm/functions/Function2;", "Lzendesk/conversationkit/android/model/MessageAction$Reply;", "onReplyActionSelectedProvider", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnRetryConnectionClickedListener;", "onRetryConnectionClicked", "Lzendesk/conversationkit/android/model/Field;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormCompleted;", "onFormCompletedProvider", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormFocusChangedListener;", "onFormFocusChanged", "onComposerTextChanged", "Lzendesk/ui/android/conversation/form/DisplayedField;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "onFormDisplayedFieldsChanged", "onTyping", "onDeniedPermissionDismissed", "", "onLoadMoreMessages", "onSeeLatestViewClicked", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCarouselAction;", "onCarouselAction", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "onSendPostBackMessage", "onRetryLoadConversation", "onFileAttachmentClicked", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationScreenCoordinator {

    @NotNull
    private static final String LOG_TAG = "ConversationScreenCoordinator";

    @NotNull
    private final AttachmentIntentsLauncher attachmentIntentLauncher;

    @NotNull
    private final AttachmentIntents attachmentIntents;

    @NotNull
    private final Renderer<ConversationScreenRendering> conversationScreenRenderer;

    @NotNull
    private final ConversationScreenViewModel conversationScreenViewModel;

    @NotNull
    private final b0 coroutineScope;

    @NotNull
    private final MessagingSettings messagingSettings;

    @NotNull
    private final Function1<Integer, Unit> onAttachMenuItemClicked;

    @NotNull
    private final Function1<String, Unit> onBackButtonClicked;

    @NotNull
    private final Function1<CarouselAction, Unit> onCarouselAction;

    @NotNull
    private final Function2<ConversationScreenViewModel, String, Function1<String, Unit>> onComposerTextChanged;

    @NotNull
    private final Function1<String, Unit> onCopyTextAction;

    @NotNull
    private final Function0<Unit> onDeniedPermissionActionClicked;

    @NotNull
    private final Function0<Unit> onDeniedPermissionDismissed;

    @NotNull
    private final Function2<ConversationScreenViewModel, String, Function1<Message, Unit>> onFailedMessageClicked;

    @NotNull
    private final Function1<Message, Unit> onFileAttachmentClicked;

    @NotNull
    private final Function2<ConversationScreenViewModel, String, Function2<List<? extends Field>, MessageLogEntry.FormMessageContainer, Unit>> onFormCompletedProvider;

    @NotNull
    private final Function1<String, Function2<DisplayedField, String, Unit>> onFormDisplayedFieldsChanged;

    @NotNull
    private final Function1<ConversationScreenViewModel, Function1<Boolean, Unit>> onFormFocusChanged;

    @NotNull
    private final Function2<ConversationScreenViewModel, String, Function1<Double, Unit>> onLoadMoreMessages;

    @NotNull
    private final Function2<ConversationScreenViewModel, String, Function1<MessageAction.Reply, Unit>> onReplyActionSelectedProvider;

    @NotNull
    private final Function1<ConversationScreenViewModel, Function0<Unit>> onRetryConnectionClicked;

    @NotNull
    private final Function0<Unit> onRetryLoadConversation;

    @NotNull
    private final Function0<Unit> onSeeLatestViewClicked;

    @NotNull
    private final Function2<ConversationScreenViewModel, String, Function1<String, Unit>> onSendButtonClickedProvider;

    @NotNull
    private final Function2<String, String, Unit> onSendPostBackMessage;

    @NotNull
    private final Function1<String, Function0<Unit>> onTyping;

    @NotNull
    private final RuntimePermissionRequester permissionRequester;

    @NotNull
    private final UriHandler uriHandler;

    @NotNull
    private final VisibleScreenTracker visibleScreenTracker;

    @NotNull
    private final WebViewUriHandler webViewUriHandler;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$handleUri$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$handleUri$1", f = "ConversationScreenCoordinator.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $launchIntent;
        final /* synthetic */ String $uri;
        final /* synthetic */ UrlSource $urlSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, UrlSource urlSource, x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$uri = str;
            this.$launchIntent = function0;
            this.$urlSource = urlSource;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return new AnonymousClass1(this.$uri, this.$launchIntent, this.$urlSource, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            UrlSource urlSource;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            if (y.p(this.$uri, KnownUriSchemes.PHONE_NUMBER, false) || y.p(this.$uri, KnownUriSchemes.EMAIL, false) || Messaging.INSTANCE.getDelegate().shouldHandleUrl(this.$uri, this.$urlSource) || (urlSource = this.$urlSource) == UrlSource.IMAGE) {
                this.$launchIntent.invoke();
            } else {
                Logger.i(ConversationScreenCoordinator.LOG_TAG, "MessagingDelegate.shouldHandleUrl returned false, ignoring " + this.$uri + " from " + urlSource, new Object[0]);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$sendPostbackMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$sendPostbackMessage$1", f = "ConversationScreenCoordinator.kt", l = {587}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C03881 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $actionId;
        final /* synthetic */ String $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03881(String str, String str2, x70.c<? super C03881> cVar) {
            super(2, cVar);
            this.$actionId = str;
            this.$text = str2;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationScreenCoordinator.this.new C03881(this.$actionId, this.$text, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C03881) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenViewModel conversationScreenViewModel = ConversationScreenCoordinator.this.conversationScreenViewModel;
                this.label = 1;
                obj = conversationScreenViewModel.conversationId$zendesk_messaging_messaging_android(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            ConversationScreenCoordinator.this.conversationScreenViewModel.dispatchAction(new ConversationScreenAction.SendPostbackMessage((String) obj, this.$actionId, this.$text));
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$setupScreenEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$setupScreenEvents$1", f = "ConversationScreenCoordinator.kt", l = {569}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C03891 extends z70.i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ ConversationScreenViewModel $conversationScreenViewModel;
        int label;
        final /* synthetic */ ConversationScreenCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03891(ConversationScreenViewModel conversationScreenViewModel, ConversationScreenCoordinator conversationScreenCoordinator, x70.c<? super C03891> cVar) {
            super(2, cVar);
            this.$conversationScreenViewModel = conversationScreenViewModel;
            this.this$0 = conversationScreenCoordinator;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return new C03891(this.$conversationScreenViewModel, this.this$0, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C03891) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                ConversationScreenViewModel conversationScreenViewModel = this.$conversationScreenViewModel;
                this.label = 1;
                obj = conversationScreenViewModel.conversationId$zendesk_messaging_messaging_android(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            String str = (String) obj;
            this.$conversationScreenViewModel.subscribeTypingEventsToLifecycle(str);
            this.this$0.visibleScreenTracker.setShownScreen$zendesk_messaging_messaging_android(new VisibleScreen.ConversationScreen(str));
            this.$conversationScreenViewModel.dispatchAction(new ConversationScreenAction.SendActivityData(ActivityData.CONVERSATION_READ, str));
            this.$conversationScreenViewModel.dispatchAction(ConversationScreenAction.CheckPollingStatus.INSTANCE);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$setupWithStore$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator", f = "ConversationScreenCoordinator.kt", l = {488}, m = "setupWithStore")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03901 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C03901(x70.c<? super C03901> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationScreenCoordinator.this.setupWithStore(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenCoordinator(@NotNull Renderer<ConversationScreenRendering> renderer, @NotNull Function1<? super String, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super Integer, Unit> function12, @NotNull UriHandler uriHandler, @NotNull WebViewUriHandler webViewUriHandler, @NotNull AttachmentIntents attachmentIntents, @NotNull b0 b0Var, @NotNull VisibleScreenTracker visibleScreenTracker, @NotNull ConversationScreenViewModel conversationScreenViewModel, @NotNull MessagingSettings messagingSettings, @NotNull Function1<? super String, Unit> function13, @NotNull RuntimePermissionRequester runtimePermissionRequester, @NotNull AttachmentIntentsLauncher attachmentIntentsLauncher) {
        renderer.getClass();
        function1.getClass();
        function0.getClass();
        function12.getClass();
        uriHandler.getClass();
        webViewUriHandler.getClass();
        attachmentIntents.getClass();
        b0Var.getClass();
        visibleScreenTracker.getClass();
        conversationScreenViewModel.getClass();
        messagingSettings.getClass();
        function13.getClass();
        runtimePermissionRequester.getClass();
        attachmentIntentsLauncher.getClass();
        this.conversationScreenRenderer = renderer;
        this.onBackButtonClicked = function1;
        this.onDeniedPermissionActionClicked = function0;
        this.onAttachMenuItemClicked = function12;
        this.uriHandler = uriHandler;
        this.webViewUriHandler = webViewUriHandler;
        this.attachmentIntents = attachmentIntents;
        this.coroutineScope = b0Var;
        this.visibleScreenTracker = visibleScreenTracker;
        this.conversationScreenViewModel = conversationScreenViewModel;
        this.messagingSettings = messagingSettings;
        this.onCopyTextAction = function13;
        this.permissionRequester = runtimePermissionRequester;
        this.attachmentIntentLauncher = attachmentIntentsLauncher;
        final int i11 = 0;
        this.onSendButtonClickedProvider = new Function2(this) { // from class: zendesk.messaging.android.internal.conversationscreen.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationScreenCoordinator f47669b;

            {
                this.f47669b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        return ConversationScreenCoordinator.onSendButtonClickedProvider$lambda$2(this.f47669b, (ConversationScreenViewModel) obj, (String) obj2);
                    default:
                        return ConversationScreenCoordinator.onSendPostBackMessage$lambda$30(this.f47669b, (String) obj, (String) obj2);
                }
            }
        };
        this.onReplyActionSelectedProvider = new yn.a(16);
        this.onFailedMessageClicked = new yn.a(17);
        this.onRetryConnectionClicked = new yj.m(26);
        this.onFormCompletedProvider = new yn.a(18);
        this.onFormFocusChanged = new yj.m(27);
        this.onComposerTextChanged = new yn.a(19);
        this.onFormDisplayedFieldsChanged = new g(this, 2);
        int i12 = 3;
        this.onTyping = new g(this, i12);
        this.onDeniedPermissionDismissed = new e(this, i12);
        this.onLoadMoreMessages = new yn.a(15);
        this.onSeeLatestViewClicked = new e(this, 1);
        this.onCarouselAction = new g(this, 0);
        final int i13 = 1;
        this.onSendPostBackMessage = new Function2(this) { // from class: zendesk.messaging.android.internal.conversationscreen.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationScreenCoordinator f47669b;

            {
                this.f47669b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        return ConversationScreenCoordinator.onSendButtonClickedProvider$lambda$2(this.f47669b, (ConversationScreenViewModel) obj, (String) obj2);
                    default:
                        return ConversationScreenCoordinator.onSendPostBackMessage$lambda$30(this.f47669b, (String) obj, (String) obj2);
                }
            }
        };
        this.onRetryLoadConversation = new e(this, 2);
        this.onFileAttachmentClicked = new g(this, 1);
    }

    private final void capturePhoto() {
        this.attachmentIntentLauncher.launchCamera(this.attachmentIntents.getCameraIntent(), new g(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit capturePhoto$lambda$35(ConversationScreenCoordinator conversationScreenCoordinator, UploadFile uploadFile) {
        uploadFile.getClass();
        conversationScreenCoordinator.dispatchUploadFilesAction$zendesk_messaging_messaging_android(c0.c(uploadFile));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchCamera$lambda$34(ConversationScreenCoordinator conversationScreenCoordinator, boolean z11) {
        conversationScreenCoordinator.showPermissionDialogIfNeeded(z11, new e(conversationScreenCoordinator, 0));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchCamera$lambda$34$lambda$33(ConversationScreenCoordinator conversationScreenCoordinator) {
        conversationScreenCoordinator.capturePhoto();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGallery$lambda$37(ConversationScreenCoordinator conversationScreenCoordinator, boolean z11) {
        conversationScreenCoordinator.showPermissionDialogIfNeeded(z11, new e(conversationScreenCoordinator, 4));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGallery$lambda$37$lambda$36(ConversationScreenCoordinator conversationScreenCoordinator) {
        conversationScreenCoordinator.openGallery();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCarouselAction$lambda$29(ConversationScreenCoordinator conversationScreenCoordinator, CarouselAction carouselAction) {
        carouselAction.getClass();
        if (carouselAction instanceof CarouselAction.Link) {
            Logger.i(LOG_TAG, "CarouselAction.Link " + carouselAction + " clicked", new Object[0]);
            CarouselAction.Link link = (CarouselAction.Link) carouselAction;
            conversationScreenCoordinator.uriHandler.onUriClicked(link.getUrl(), UrlSource.CAROUSEL, false, link.getSourceType());
        } else if (carouselAction instanceof CarouselAction.Postback) {
            String id2 = carouselAction.getId();
            Logger.i(LOG_TAG, a0.p("CarouselAction.Postback ", id2, " clicked"), new Object[0]);
            conversationScreenCoordinator.sendPostbackMessage(id2, carouselAction.getText());
        } else if (carouselAction instanceof CarouselAction.WebView) {
            Logger.i(LOG_TAG, "CarouselAction.WebView " + carouselAction + " clicked", new Object[0]);
            CarouselAction.WebView webView = (CarouselAction.WebView) carouselAction;
            conversationScreenCoordinator.webViewUriHandler.onWebViewUriClicked(webView.getUrl(), webView.getSize(), UrlSource.WEBVIEW_MESSAGE_ACTION, webView.getSourceType());
        } else if (carouselAction instanceof CarouselAction.Unsupported) {
            Logger.i(LOG_TAG, "UnSupported " + carouselAction + " clicked", new Object[0]);
        } else {
            Logger.i(LOG_TAG, "UnSupported " + carouselAction + " clicked", new Object[0]);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 onComposerTextChanged$lambda$18(ConversationScreenViewModel conversationScreenViewModel, String str) {
        conversationScreenViewModel.getClass();
        return new d(str, conversationScreenViewModel, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onComposerTextChanged$lambda$18$lambda$17(String str, ConversationScreenViewModel conversationScreenViewModel, String str2) {
        str2.getClass();
        if (str != null) {
            conversationScreenViewModel.dispatchAction(new ConversationScreenAction.PersistComposerText(str, str2));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeniedPermissionDismissed$lambda$24(ConversationScreenCoordinator conversationScreenCoordinator) {
        conversationScreenCoordinator.conversationScreenViewModel.dispatchAction(ConversationScreenAction.HideDeniedPermission.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 onFailedMessageClicked$lambda$8(ConversationScreenViewModel conversationScreenViewModel, String str) {
        conversationScreenViewModel.getClass();
        return new d(str, conversationScreenViewModel, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFailedMessageClicked$lambda$8$lambda$7(String str, ConversationScreenViewModel conversationScreenViewModel, Message message) {
        message.getClass();
        if (str != null) {
            conversationScreenViewModel.dispatchAction(new ConversationScreenAction.ResendFailedMessage(message, str));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFileAttachmentClicked$lambda$32(ConversationScreenCoordinator conversationScreenCoordinator, Message message) {
        message.getClass();
        MessagingDelegate delegate = Messaging.INSTANCE.getDelegate();
        MessageContent content = message.getContent();
        content.getClass();
        if (delegate.shouldHandleUrl(((MessageContent.File) content).getMediaUrl(), UrlSource.FILE)) {
            conversationScreenCoordinator.conversationScreenViewModel.dispatchAction(new ConversationScreenAction.ViewAttachment(message));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2 onFormCompletedProvider$lambda$13(ConversationScreenViewModel conversationScreenViewModel, String str) {
        conversationScreenViewModel.getClass();
        return new h(conversationScreenViewModel, 1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFormCompletedProvider$lambda$13$lambda$12(String str, ConversationScreenViewModel conversationScreenViewModel, List list, MessageLogEntry.FormMessageContainer formMessageContainer) {
        list.getClass();
        formMessageContainer.getClass();
        if (str != null) {
            conversationScreenViewModel.dispatchAction(new ConversationScreenAction.SendFormResponse(list, formMessageContainer, str));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2 onFormDisplayedFieldsChanged$lambda$21(ConversationScreenCoordinator conversationScreenCoordinator, String str) {
        return new h(conversationScreenCoordinator, 0, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFormDisplayedFieldsChanged$lambda$21$lambda$20(String str, ConversationScreenCoordinator conversationScreenCoordinator, DisplayedField displayedField, String str2) {
        displayedField.getClass();
        str2.getClass();
        if (str != null) {
            conversationScreenCoordinator.conversationScreenViewModel.updateListOfStoredForm(displayedField, str, str2);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 onFormFocusChanged$lambda$15(ConversationScreenViewModel conversationScreenViewModel) {
        conversationScreenViewModel.getClass();
        return new i(conversationScreenViewModel, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFormFocusChanged$lambda$15$lambda$14(ConversationScreenViewModel conversationScreenViewModel, boolean z11) {
        conversationScreenViewModel.dispatchAction(new ConversationScreenAction.FormFocusChanged(z11));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 onLoadMoreMessages$lambda$27(ConversationScreenViewModel conversationScreenViewModel, String str) {
        conversationScreenViewModel.getClass();
        return new d(str, conversationScreenViewModel, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoadMoreMessages$lambda$27$lambda$26(String str, ConversationScreenViewModel conversationScreenViewModel, double d3) {
        if (str != null) {
            conversationScreenViewModel.dispatchAction(new ConversationScreenAction.LoadMoreMessages(str, d3));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 onReplyActionSelectedProvider$lambda$5(ConversationScreenViewModel conversationScreenViewModel, String str) {
        conversationScreenViewModel.getClass();
        return new d(str, conversationScreenViewModel, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onReplyActionSelectedProvider$lambda$5$lambda$4(String str, ConversationScreenViewModel conversationScreenViewModel, MessageAction.Reply reply) {
        reply.getClass();
        if (str != null) {
            conversationScreenViewModel.dispatchAction(new ConversationScreenAction.SendTextMessage(reply.getText(), reply.getPayload(), reply.getMetadata(), str, ConversationScreenAction.SendTextMessage.TextMessageSource.QUICK_REPLY));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 onRetryConnectionClicked$lambda$10(ConversationScreenViewModel conversationScreenViewModel) {
        conversationScreenViewModel.getClass();
        return new l(conversationScreenViewModel, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRetryConnectionClicked$lambda$10$lambda$9(ConversationScreenViewModel conversationScreenViewModel) {
        conversationScreenViewModel.dispatchAction(ConversationScreenAction.RetryConnection.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRetryLoadConversation$lambda$31(ConversationScreenCoordinator conversationScreenCoordinator) {
        conversationScreenCoordinator.conversationScreenViewModel.dispatchAction(ConversationScreenAction.RetryLoadConversation.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSeeLatestViewClicked$lambda$28(ConversationScreenCoordinator conversationScreenCoordinator) {
        conversationScreenCoordinator.conversationScreenViewModel.dispatchAction(ConversationScreenAction.SeeLatestViewClicked.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 onSendButtonClickedProvider$lambda$2(ConversationScreenCoordinator conversationScreenCoordinator, ConversationScreenViewModel conversationScreenViewModel, String str) {
        conversationScreenViewModel.getClass();
        return new j(str, conversationScreenCoordinator, conversationScreenViewModel, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSendButtonClickedProvider$lambda$2$lambda$1(String str, ConversationScreenCoordinator conversationScreenCoordinator, ConversationScreenViewModel conversationScreenViewModel, String str2) {
        str2.getClass();
        if (str != null) {
            conversationScreenCoordinator.conversationScreenViewModel.onSendMessage(str);
            conversationScreenViewModel.dispatchAction(new ConversationScreenAction.SendTextMessage(str2, null, null, str, ConversationScreenAction.SendTextMessage.TextMessageSource.INPUT_FIELD, 6, null));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSendPostBackMessage$lambda$30(ConversationScreenCoordinator conversationScreenCoordinator, String str, String str2) {
        str.getClass();
        str2.getClass();
        Logger.i(LOG_TAG, "Button Postback " + str + " clicked", new Object[0]);
        conversationScreenCoordinator.sendPostbackMessage(str, str2);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 onTyping$lambda$23(ConversationScreenCoordinator conversationScreenCoordinator, String str) {
        return new k(str, conversationScreenCoordinator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTyping$lambda$23$lambda$22(String str, ConversationScreenCoordinator conversationScreenCoordinator) {
        if (str != null) {
            conversationScreenCoordinator.conversationScreenViewModel.onTyping(str);
        }
        return Unit.f26487a;
    }

    private final void openGallery() {
        this.attachmentIntentLauncher.launchGallery(this.attachmentIntents.getAttachmentIntent(), new g(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openGallery$lambda$38(ConversationScreenCoordinator conversationScreenCoordinator, List list) {
        list.getClass();
        conversationScreenCoordinator.dispatchUploadFilesAction$zendesk_messaging_messaging_android(list);
        return Unit.f26487a;
    }

    private final void sendPostbackMessage(String actionId, String text) {
        f0.B(this.coroutineScope, null, null, new C03881(actionId, text, null), 3);
    }

    private final void setupScreenEvents(ConversationScreenViewModel conversationScreenViewModel) {
        f0.B(this.coroutineScope, null, null, new C03891(conversationScreenViewModel, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setupWithStore(zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel r6, x70.c<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator.C03901
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$setupWithStore$1 r0 = (zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator.C03901) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$setupWithStore$1 r0 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$setupWithStore$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
        L28:
            r6 = 0
            return r6
        L2a:
            ba0.g.M(r7)
            goto L50
        L2e:
            ba0.g.M(r7)
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r2 = "ConversationScreenCoordinator"
            java.lang.String r4 = "Listening to Conversation Screen updates."
            zendesk.logger.Logger.i(r2, r4, r7)
            r5.setupScreenEvents(r6)
            y80.y1 r7 = r6.getConversationScreenStateFlow()
            zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$setupWithStore$2 r2 = new zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$setupWithStore$2
            r2.<init>(r6)
            r0.label = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator.setupWithStore(zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModel, x70.c):java.lang.Object");
    }

    private final void showPermissionDialogIfNeeded(boolean isGranted, Function0<Unit> action) {
        ConversationScreenViewModel conversationScreenViewModel = this.conversationScreenViewModel;
        if (!isGranted) {
            conversationScreenViewModel.dispatchAction(ConversationScreenAction.ShowDeniedPermission.INSTANCE);
        } else {
            conversationScreenViewModel.dispatchAction(ConversationScreenAction.HideDeniedPermission.INSTANCE);
            action.invoke();
        }
    }

    public final void clearNewMessagesDivider$zendesk_messaging_messaging_android() {
        this.conversationScreenViewModel.clearNewMessagesDivider();
    }

    public final void dispatchUploadFilesAction$zendesk_messaging_messaging_android(@NotNull List<UploadFile> uploads) {
        uploads.getClass();
        Logger.i(LOG_TAG, "Sending conversation upload file event", new Object[0]);
        f0.B(this.coroutineScope, null, null, new ConversationScreenCoordinator$dispatchUploadFilesAction$1(uploads, this, null), 3);
    }

    public final void dispatchUploadFilesForRestoredUrisAction$zendesk_messaging_messaging_android() {
        Logger.i(LOG_TAG, "Sending conversation upload restored file event", new Object[0]);
        f0.B(this.coroutineScope, null, null, new ConversationScreenCoordinator$dispatchUploadFilesForRestoredUrisAction$1(this, null), 3);
    }

    public final void handleUri(@NotNull String uri, @NotNull UrlSource urlSource, @NotNull Function0<Unit> launchIntent) {
        uri.getClass();
        urlSource.getClass();
        launchIntent.getClass();
        f0.B(this.coroutineScope, null, null, new AnonymousClass1(uri, launchIntent, urlSource, null), 3);
    }

    @Nullable
    public final Object init$zendesk_messaging_messaging_android(@NotNull x70.c<? super Unit> cVar) {
        Object obj = setupWithStore(this.conversationScreenViewModel, cVar);
        return obj == y70.a.COROUTINE_SUSPENDED ? obj : Unit.f26487a;
    }

    public final void launchCamera$zendesk_messaging_messaging_android() {
        if (this.attachmentIntents.shouldAskForCameraPermission()) {
            this.permissionRequester.launchSinglePermissionRequest("android.permission.CAMERA", new g(this, 4));
        } else {
            capturePhoto();
        }
    }

    public final void launchGallery$zendesk_messaging_messaging_android() {
        if (Build.VERSION.SDK_INT <= 32) {
            this.permissionRequester.launchSinglePermissionRequest("android.permission.READ_EXTERNAL_STORAGE", new g(this, 5));
        } else {
            openGallery();
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.ConversationScreenCoordinator$setupWithStore$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements y80.j {
        final /* synthetic */ ConversationScreenViewModel $conversationScreenViewModel;

        public AnonymousClass2(ConversationScreenViewModel conversationScreenViewModel) {
            this.$conversationScreenViewModel = conversationScreenViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ConversationScreenRendering emit$lambda$3(ConversationScreenState conversationScreenState, ConversationScreenCoordinator conversationScreenCoordinator, ConversationScreenViewModel conversationScreenViewModel, ConversationScreenRendering conversationScreenRendering) {
            conversationScreenRendering.getClass();
            Conversation conversation = conversationScreenState.getConversation();
            String id2 = conversation != null ? conversation.getId() : null;
            return conversationScreenRendering.toBuilder().onSendButtonClicked((Function1) conversationScreenCoordinator.onSendButtonClickedProvider.invoke(conversationScreenViewModel, id2)).onAttachMenuItemClicked(conversationScreenCoordinator.onAttachMenuItemClicked).onBackButtonClicked(new k(conversationScreenCoordinator, id2)).onFailedMessageClicked((Function1) conversationScreenCoordinator.onFailedMessageClicked.invoke(conversationScreenViewModel, id2)).onRetryConnectionButtonClicked((Function0) conversationScreenCoordinator.onRetryConnectionClicked.invoke(conversationScreenViewModel)).onReplyActionSelected((Function1) conversationScreenCoordinator.onReplyActionSelectedProvider.invoke(conversationScreenViewModel, id2)).onUriClicked(conversationScreenCoordinator.uriHandler).onWebViewUriClicked(conversationScreenCoordinator.webViewUriHandler).onCarouselAction(conversationScreenCoordinator.onCarouselAction).onFormCompleted((Function2) conversationScreenCoordinator.onFormCompletedProvider.invoke(conversationScreenViewModel, id2)).onFormFocusChanged((Function1) conversationScreenCoordinator.onFormFocusChanged.invoke(conversationScreenViewModel)).onFormDisplayedFieldsChanged((Function2) conversationScreenCoordinator.onFormDisplayedFieldsChanged.invoke(id2)).onTyping((Function0) conversationScreenCoordinator.onTyping.invoke(id2)).onDeniedPermissionActionClicked(conversationScreenCoordinator.onDeniedPermissionActionClicked).onDeniedPermissionDismissed(conversationScreenCoordinator.onDeniedPermissionDismissed).onMessageComposerTextChanged((Function1) conversationScreenCoordinator.onComposerTextChanged.invoke(conversationScreenViewModel, id2)).onLoadMoreMessages((Function1) conversationScreenCoordinator.onLoadMoreMessages.invoke(conversationScreenViewModel, id2)).onRetryLoadMoreClickedListener((Function1) conversationScreenCoordinator.onLoadMoreMessages.invoke(conversationScreenViewModel, id2)).onRetryLoadConversationClicked(conversationScreenCoordinator.onRetryLoadConversation).onSeeLatestClickedListener(conversationScreenCoordinator.onSeeLatestViewClicked).onSendPostbackMessage(conversationScreenCoordinator.onSendPostBackMessage).onCopyText(conversationScreenCoordinator.onCopyTextAction).onPostbackFailedDismissedListener(new l(conversationScreenViewModel, 0)).onFileAttachmentClicked(conversationScreenCoordinator.onFileAttachmentClicked).state(new m(0, conversationScreenCoordinator, conversationScreenState)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$3$lambda$0(ConversationScreenCoordinator conversationScreenCoordinator, String str) {
            conversationScreenCoordinator.onBackButtonClicked.invoke(str);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$3$lambda$1(ConversationScreenViewModel conversationScreenViewModel) {
            conversationScreenViewModel.dispatchAction(ConversationScreenAction.PostbackBannerDismissed.INSTANCE);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ConversationScreenState emit$lambda$3$lambda$2(ConversationScreenCoordinator conversationScreenCoordinator, ConversationScreenState conversationScreenState, ConversationScreenState conversationScreenState2) {
            conversationScreenState2.getClass();
            return ConversationScreenState.copy$default(conversationScreenState, null, null, null, null, null, null, false, null, conversationScreenCoordinator.attachmentIntents.canOpenAttachmentIntent(), conversationScreenCoordinator.attachmentIntents.canOpenCameraIntent(), null, null, null, false, null, false, false, conversationScreenCoordinator.messagingSettings.getHipaaAttachmentFlag(), null, false, null, false, null, null, null, false, null, 134085887, null);
        }

        public final Object emit(ConversationScreenState conversationScreenState, x70.c<? super Unit> cVar) {
            ConversationScreenCoordinator.this.conversationScreenRenderer.render(new j(conversationScreenState, ConversationScreenCoordinator.this, this.$conversationScreenViewModel, 0));
            return Unit.f26487a;
        }

        @Override // y80.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, x70.c cVar) {
            return emit((ConversationScreenState) obj, (x70.c<? super Unit>) cVar);
        }
    }
}
