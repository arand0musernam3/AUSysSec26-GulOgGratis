package zendesk.messaging.android.internal.conversationscreen.delegates;

import a3.u1;
import a3.y0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.r2;
import b3.n;
import defpackage.d;
import e40.a;
import hb0.h;
import hb0.k;
import hb0.p;
import i80.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.android.messaging.UrlSource;
import zendesk.conversationkit.android.model.AuthorSubtype;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageDirection;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.StubUriHandler;
import zendesk.messaging.android.internal.StubWebViewUriHandler;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.WebViewUriHandler;
import zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.TextMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogListenersKt;
import zendesk.messaging.android.internal.extension.ViewKtxKt;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.actionbutton.ActionButton;
import zendesk.ui.android.conversation.avatar.AvatarImageView;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;
import zendesk.ui.android.conversation.textcell.TextCellRendering;
import zendesk.ui.android.conversation.textcell.TextCellState;
import zendesk.ui.android.conversation.textcell.TextCellView;
import zendesk.ui.android.internal.ContextualMenuOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b!\b\u0000\u0018\u0000 D2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002EDBw\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u0011\u0012\u001e\b\u0002\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00042\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0019H\u0014¢\u0006\u0004\b'\u0010(R2\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R2\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010)\u001a\u0004\b=\u0010+\"\u0004\b>\u0010-R8\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u0013j\u0002`\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/TextMessageContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TextMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/TextMessageContainerAdapterDelegate$ViewHolder;", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/Message;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "Lzendesk/messaging/android/internal/UriHandler;", "onUriClicked", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "onWebViewUriClicked", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCopyTextAction;", "onCopyText", "Lkotlin/Function2;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "onSendPostbackMessage", "<init>", "(Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/UriHandler;Lzendesk/messaging/android/internal/WebViewUriHandler;Lzendesk/messaging/android/internal/model/MessagingTheme;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "item", "", "items", "", "position", "", "isForViewType", "(Lzendesk/messaging/android/internal/model/MessageLogEntry;Ljava/util/List;I)Z", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lzendesk/messaging/android/internal/conversationscreen/delegates/TextMessageContainerAdapterDelegate$ViewHolder;", "holder", "", "payloads", "onBindViewHolder", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$TextMessageContainer;Lzendesk/messaging/android/internal/conversationscreen/delegates/TextMessageContainerAdapterDelegate$ViewHolder;Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "getOnFailedMessageClicked", "()Lkotlin/jvm/functions/Function1;", "setOnFailedMessageClicked", "(Lkotlin/jvm/functions/Function1;)V", "Lzendesk/messaging/android/internal/UriHandler;", "getOnUriClicked", "()Lzendesk/messaging/android/internal/UriHandler;", "setOnUriClicked", "(Lzendesk/messaging/android/internal/UriHandler;)V", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "getOnWebViewUriClicked", "()Lzendesk/messaging/android/internal/WebViewUriHandler;", "setOnWebViewUriClicked", "(Lzendesk/messaging/android/internal/WebViewUriHandler;)V", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getOnCopyText", "setOnCopyText", "Lkotlin/jvm/functions/Function2;", "getOnSendPostbackMessage", "()Lkotlin/jvm/functions/Function2;", "setOnSendPostbackMessage", "(Lkotlin/jvm/functions/Function2;)V", "Companion", "ViewHolder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextMessageContainerAdapterDelegate extends ListItemAdapterDelegate<MessageLogEntry.TextMessageContainer, MessageLogEntry, ViewHolder> {
    public static final float PENDING_ALPHA_FACTOR = 0.66f;

    @NotNull
    private MessagingTheme messagingTheme;

    @NotNull
    private Function1<? super String, Unit> onCopyText;

    @NotNull
    private Function1<? super Message, Unit> onFailedMessageClicked;

    @NotNull
    private Function2<? super String, ? super String, Unit> onSendPostbackMessage;

    @NotNull
    private UriHandler onUriClicked;

    @NotNull
    private WebViewUriHandler onWebViewUriClicked;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ju\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\nj\u0002`\u00142\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJã\u0002\u00106\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001f\u001a\u00020\u001d2\b\b\u0001\u0010 \u001a\u00020\u001d2\b\b\u0001\u0010!\u001a\u00020\u001d2\b\b\u0001\u0010\"\u001a\u00020\u001d2\b\b\u0001\u0010#\u001a\u00020\u001d2\b\b\u0001\u0010$\u001a\u00020\u001d2\b\b\u0001\u0010%\u001a\u00020\u001d2\b\b\u0001\u0010&\u001a\u00020\u001d2\b\b\u0001\u0010'\u001a\u00020\u001d2\b\b\u0001\u0010(\u001a\u00020\u001d2\b\b\u0001\u0010)\u001a\u00020\u001d2\b\b\u0001\u0010*\u001a\u00020\u001d2\b\b\u0001\u0010+\u001a\u00020\u001d2\b\b\u0001\u0010,\u001a\u00020\u001d2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u00100\u001a\u00020\u000f2\u001e\b\u0002\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u00172*\b\u0002\u00105\u001a$\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\f01j\u0002`4H\u0002¢\u0006\u0004\b6\u00107J3\u00109\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010!\u001a\u00020\u001d2\b\b\u0001\u00108\u001a\u00020\u001dH\u0002¢\u0006\u0004\b9\u0010:J/\u0010>\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u000203H\u0002¢\u0006\u0004\b>\u0010?J;\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r*\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\rH\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bF\u0010GJs\u0010H\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\nj\u0002`\u00142\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0016j\u0002`\u0017¢\u0006\u0004\bH\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/TextMessageContainerAdapterDelegate$ViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "itemView", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "<init>", "(Landroid/view/View;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "Lzendesk/messaging/android/internal/model/MessageLogEntry$TextMessageContainer;", "item", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/Message;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "Lzendesk/messaging/android/internal/UriHandler;", "onUriClicked", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "onWebViewUriClicked", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCopyTextAction;", "onCopyText", "Lkotlin/Function2;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "onSendPostbackMessage", "renderContent", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$TextMessageContainer;Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/UriHandler;Lzendesk/messaging/android/internal/WebViewUriHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parentView", "", "inboundMessageColor", "inboundMessageTextColor", "outboundMessageColor", "outboundMessageTextColor", "actionColor", "actionTextColor", "disabledColor", "disabledTextColor", "errorColor", "errorTextColor", "aiDisclaimerTextColor", "aiDisclaimerImageColor", "aiDisclaimerBorderColor", "codeBlockTextColor", "codeBlockBackgroundColor", "onMessageContainerClicked", "onMessageTextClicked", "onCopyTextMenuItemClicked", "uriHandler", "Lkotlin/Function4;", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnWebViewMessage;", "onWebViewMessage", "createTextCell", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$TextMessageContainer;Landroid/view/ViewGroup;IIIIIIIIIIIIIIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/UriHandler;Lkotlin/jvm/functions/Function2;Li80/o;)Landroid/view/View;", "dangerColor", "createUnsupportedCell", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$TextMessageContainer;Landroid/view/ViewGroup;II)Landroid/view/View;", "source", "uri", "sourceType", "onActionUriClicked", "(Ljava/lang/String;Lzendesk/messaging/android/internal/UriHandler;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageSourceType;)V", "clickListener", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$TextMessageContainer;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "context", "", "Lzendesk/ui/android/internal/ContextualMenuOption;", "getCellContextualMenuOptions", "(Landroid/content/Context;)Ljava/util/List;", "bind", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "Landroid/widget/TextView;", "labelView", "Landroid/widget/TextView;", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "avatarView", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "Landroid/widget/LinearLayout;", "contentView", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "receiptView", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewHolder extends r2 {

        @NotNull
        private final AvatarImageView avatarView;

        @NotNull
        private final LinearLayout contentView;

        @NotNull
        private final TextView labelView;

        @NotNull
        private final MessagingTheme messagingTheme;

        @NotNull
        private final MessageReceiptView receiptView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view, @NotNull MessagingTheme messagingTheme) {
            super(view);
            view.getClass();
            messagingTheme.getClass();
            this.messagingTheme = messagingTheme;
            View viewFindViewById = view.findViewById(R.id.zma_message_label);
            viewFindViewById.getClass();
            this.labelView = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.zma_avatar_view);
            viewFindViewById2.getClass();
            this.avatarView = (AvatarImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.zma_message_content);
            viewFindViewById3.getClass();
            this.contentView = (LinearLayout) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.zma_message_receipt);
            viewFindViewById4.getClass();
            this.receiptView = (MessageReceiptView) viewFindViewById4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final Function1<Message, Unit> clickListener(MessageLogEntry.TextMessageContainer textMessageContainer, Function1<? super Message, Unit> function1) {
            return textMessageContainer.getMessage().getStatus() instanceof MessageStatus.Failed ? function1 : MessageLogListenersKt.getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final View createTextCell(final MessageLogEntry.TextMessageContainer item, ViewGroup parentView, final int inboundMessageColor, final int inboundMessageTextColor, final int outboundMessageColor, final int outboundMessageTextColor, final int actionColor, final int actionTextColor, final int disabledColor, final int disabledTextColor, final int errorColor, final int errorTextColor, final int aiDisclaimerTextColor, final int aiDisclaimerImageColor, final int aiDisclaimerBorderColor, final int codeBlockTextColor, final int codeBlockBackgroundColor, final Function1<? super Message, Unit> onMessageContainerClicked, final Function1<? super Message, Unit> onFailedMessageClicked, final Function1<? super String, Unit> onMessageTextClicked, final Function1<? super String, Unit> onCopyTextMenuItemClicked, final UriHandler uriHandler, final Function2<? super String, ? super String, Unit> onSendPostbackMessage, final o onWebViewMessage) {
            Context context = parentView.getContext();
            context.getClass();
            final TextCellView textCellView = new TextCellView(context, null, 0, 0, 14, null);
            textCellView.render(new Function1() { // from class: hb0.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextMessageContainerAdapterDelegate.ViewHolder.createTextCell$lambda$18$lambda$17(item, inboundMessageTextColor, errorTextColor, outboundMessageTextColor, inboundMessageColor, outboundMessageColor, errorColor, textCellView, this, aiDisclaimerTextColor, aiDisclaimerImageColor, aiDisclaimerBorderColor, actionColor, actionTextColor, disabledColor, disabledTextColor, codeBlockTextColor, codeBlockBackgroundColor, onFailedMessageClicked, onMessageContainerClicked, onMessageTextClicked, uriHandler, onWebViewMessage, onCopyTextMenuItemClicked, onSendPostbackMessage, (TextCellRendering) obj);
                }
            });
            return textCellView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextCellRendering createTextCell$lambda$18$lambda$17(final MessageLogEntry.TextMessageContainer textMessageContainer, final int i11, final int i12, final int i13, final int i14, final int i15, final int i16, final TextCellView textCellView, final ViewHolder viewHolder, final int i17, final int i18, final int i19, final int i21, final int i22, final int i23, final int i24, final int i25, final int i26, final Function1 function1, final Function1 function12, final Function1 function13, UriHandler uriHandler, o oVar, Function1 function14, Function2 function2, TextCellRendering textCellRendering) {
            textCellRendering.getClass();
            final int i27 = 0;
            TextCellRendering.Builder builderOnCellClicked = textCellRendering.toBuilder().state(new Function1() { // from class: hb0.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextMessageContainerAdapterDelegate.ViewHolder.createTextCell$lambda$18$lambda$17$lambda$10(textMessageContainer, i11, i12, i13, i14, i15, i16, textCellView, viewHolder, i17, i18, i19, i21, i22, i23, i24, i25, i26, (TextCellState) obj);
                }
            }).onCellClicked(new Function1() { // from class: hb0.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i27) {
                        case 0:
                            return TextMessageContainerAdapterDelegate.ViewHolder.createTextCell$lambda$18$lambda$17$lambda$11(textMessageContainer, function1, function12, (String) obj);
                        default:
                            return TextMessageContainerAdapterDelegate.ViewHolder.createTextCell$lambda$18$lambda$17$lambda$12(textMessageContainer, function1, function12, (String) obj);
                    }
                }
            });
            final int i28 = 1;
            return builderOnCellClicked.onCellTextClicked(new Function1() { // from class: hb0.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i28) {
                        case 0:
                            return TextMessageContainerAdapterDelegate.ViewHolder.createTextCell$lambda$18$lambda$17$lambda$11(textMessageContainer, function13, function1, (String) obj);
                        default:
                            return TextMessageContainerAdapterDelegate.ViewHolder.createTextCell$lambda$18$lambda$17$lambda$12(textMessageContainer, function13, function1, (String) obj);
                    }
                }
            }).onActionButtonClicked(new u1(8, viewHolder, uriHandler)).onWebViewActionButtonClicked(new h(1, oVar)).onCopyTextMenuItemClicked(new d(function14, 16)).onPostbackButtonClicked(new n(14, function2)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextCellState createTextCell$lambda$18$lambda$17$lambda$10(MessageLogEntry.TextMessageContainer textMessageContainer, int i11, int i12, int i13, int i14, int i15, int i16, TextCellView textCellView, ViewHolder viewHolder, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, TextCellState textCellState) {
            int iAdjustAlpha;
            textCellState.getClass();
            MessageContent content = textMessageContainer.getMessage().getContent();
            MessageContent.Text text = content instanceof MessageContent.Text ? (MessageContent.Text) content : null;
            String text2 = text != null ? text.getText() : null;
            if (text2 == null) {
                text2 = "";
            }
            MessageContent content2 = textMessageContainer.getMessage().getContent();
            MessageContent.Text text3 = content2 instanceof MessageContent.Text ? (MessageContent.Text) content2 : null;
            String htmlText = text3 != null ? text3.getHtmlText() : null;
            boolean zContains = textMessageContainer.getMessage().getAuthor().getSubtypes().contains(AuthorSubtype.AI);
            MessageDirection direction = textMessageContainer.getDirection();
            MessageDirection messageDirection = MessageDirection.INBOUND;
            int i27 = direction == messageDirection ? i11 : textMessageContainer.getStatus() instanceof MessageStatus.Failed ? i12 : i13;
            if (textMessageContainer.getDirection() == messageDirection) {
                iAdjustAlpha = i14;
            } else {
                MessageStatus status = textMessageContainer.getStatus();
                if (status instanceof MessageStatus.Pending) {
                    iAdjustAlpha = ViewKtxKt.adjustAlpha(i15, 0.66f);
                } else if ((status instanceof MessageStatus.Sent) || (status instanceof MessageStatus.Downloading)) {
                    iAdjustAlpha = i15;
                } else {
                    if (!(status instanceof MessageStatus.Failed) && !(status instanceof MessageStatus.DownloadFailed)) {
                        a.f();
                        return null;
                    }
                    iAdjustAlpha = i16;
                }
            }
            AdapterDelegatesHelper adapterDelegatesHelper = AdapterDelegatesHelper.INSTANCE;
            int cellDrawable$zendesk_messaging_messaging_android = adapterDelegatesHelper.getCellDrawable$zendesk_messaging_messaging_android(textMessageContainer.getShape(), textMessageContainer.getDirection());
            MessageContent content3 = textMessageContainer.getMessage().getContent();
            Context context = textCellView.getContext();
            context.getClass();
            List<ActionButton> cellActions$zendesk_messaging_messaging_android = adapterDelegatesHelper.getCellActions$zendesk_messaging_messaging_android(content3, context);
            Context context2 = textCellView.getContext();
            context2.getClass();
            return textCellState.copy(text2, htmlText, cellActions$zendesk_messaging_messaging_android, viewHolder.getCellContextualMenuOptions(context2), zContains, Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(i27), Integer.valueOf(iAdjustAlpha), Integer.valueOf(cellDrawable$zendesk_messaging_messaging_android), Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23), Integer.valueOf(i24), Integer.valueOf(i25), Integer.valueOf(i26));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$18$lambda$17$lambda$11(MessageLogEntry.TextMessageContainer textMessageContainer, Function1 function1, Function1 function12, String str) {
            str.getClass();
            if (textMessageContainer.getStatus() instanceof MessageStatus.Failed) {
                function1.invoke(textMessageContainer.getMessage());
            } else if (textMessageContainer.getStatus() instanceof MessageStatus.Sent) {
                function12.invoke(textMessageContainer.getMessage());
            }
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$18$lambda$17$lambda$12(MessageLogEntry.TextMessageContainer textMessageContainer, Function1 function1, Function1 function12, String str) {
            str.getClass();
            if (textMessageContainer.getStatus() instanceof MessageStatus.Failed) {
                function12.invoke(textMessageContainer.getMessage());
            } else {
                function1.invoke(str);
            }
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$18$lambda$17$lambda$13(ViewHolder viewHolder, UriHandler uriHandler, String str, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            str2.getClass();
            messageSourceType.getClass();
            viewHolder.onActionUriClicked(str2, uriHandler, str, messageSourceType);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$18$lambda$17$lambda$14(o oVar, String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            oVar.invoke(str, messageActionSize, str2, messageSourceType);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$18$lambda$17$lambda$15(Function1 function1, String str) {
            str.getClass();
            function1.invoke(str);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$18$lambda$17$lambda$16(Function2 function2, String str, String str2) {
            str.getClass();
            str2.getClass();
            function2.invoke(str, str2);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$4(Message message) {
            message.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$5(Message message) {
            message.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$6(String str) {
            str.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$7(String str) {
            str.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$8(String str, String str2) {
            str.getClass();
            str2.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createTextCell$lambda$9(String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            return Unit.f26487a;
        }

        private final View createUnsupportedCell(MessageLogEntry.TextMessageContainer item, ViewGroup parentView, int outboundMessageTextColor, int dangerColor) {
            Context context = parentView.getContext();
            context.getClass();
            TextCellView textCellView = new TextCellView(context, null, 0, 0, 14, null);
            textCellView.render(new p(textCellView, outboundMessageTextColor, dangerColor, item, 1));
            return textCellView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextCellRendering createUnsupportedCell$lambda$21$lambda$20(TextCellView textCellView, int i11, int i12, MessageLogEntry.TextMessageContainer textMessageContainer, TextCellRendering textCellRendering) {
            textCellRendering.getClass();
            return textCellRendering.toBuilder().state(new p(textCellView, i11, i12, textMessageContainer, 0)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextCellState createUnsupportedCell$lambda$21$lambda$20$lambda$19(TextCellView textCellView, int i11, int i12, MessageLogEntry.TextMessageContainer textMessageContainer, TextCellState textCellState) {
            textCellState.getClass();
            String string = textCellView.getContext().getString(R.string.zma_conversation_message_label_cant_be_displayed);
            string.getClass();
            return TextCellState.copy$default(textCellState, string, null, null, null, false, null, null, null, Integer.valueOf(i11), Integer.valueOf(ViewKtxKt.adjustAlpha$default(i12, 0.0f, 1, null)), Integer.valueOf(AdapterDelegatesHelper.INSTANCE.getCellDrawable$zendesk_messaging_messaging_android(textMessageContainer.getShape(), textMessageContainer.getDirection())), null, null, null, null, null, null, 129278, null);
        }

        private final List<ContextualMenuOption> getCellContextualMenuOptions(Context context) {
            ArrayList arrayList = new ArrayList();
            int i11 = zendesk.ui.android.R.id.zuia_cell_menu_copy;
            String string = context.getString(R.string.zma_contextual_menu_copy);
            string.getClass();
            arrayList.add(new ContextualMenuOption(i11, string));
            return arrayList;
        }

        private final void onActionUriClicked(String source, UriHandler uriHandler, String uri, MessageSourceType sourceType) {
            UrlSource urlSourceFindByValue = UrlSource.INSTANCE.findByValue(source);
            if (urlSourceFindByValue != null) {
                uriHandler.onUriClicked(uri, urlSourceFindByValue, false, sourceType);
            }
        }

        private final void renderContent(MessageLogEntry.TextMessageContainer item, Function1<? super Message, Unit> onFailedMessageClicked, UriHandler onUriClicked, WebViewUriHandler onWebViewUriClicked, Function1<? super String, Unit> onCopyText, Function2<? super String, ? super String, Unit> onSendPostbackMessage) {
            View viewCreateUnsupportedCell;
            ViewHolder viewHolder = this;
            MessageLogEntry.TextMessageContainer textMessageContainer = item;
            viewHolder.contentView.removeAllViews();
            MessageContent content = textMessageContainer.getMessage().getContent();
            if (content instanceof MessageContent.Text) {
                LinearLayout linearLayout = viewHolder.contentView;
                int actionColor = viewHolder.messagingTheme.getActionColor();
                int messageColor = viewHolder.messagingTheme.getMessageColor();
                textMessageContainer = item;
                viewHolder = this;
                viewCreateUnsupportedCell = viewHolder.createTextCell(textMessageContainer, linearLayout, viewHolder.messagingTheme.getInboundMessageColor(), viewHolder.messagingTheme.getOnBusinessMessageColor(), messageColor, viewHolder.messagingTheme.getOnMessageColor(), actionColor, viewHolder.messagingTheme.getOnActionColor(), viewHolder.messagingTheme.getDisabledColor(), viewHolder.messagingTheme.getOnBackgroundColor(), viewHolder.messagingTheme.getErrorColor(), viewHolder.messagingTheme.getOnErrorColor(), viewHolder.messagingTheme.getOnBusinessMessageColor(), viewHolder.messagingTheme.getOnBusinessMessageColor(), viewHolder.messagingTheme.getOnBusinessMessageColor(), viewHolder.messagingTheme.getOnCardColor(), viewHolder.messagingTheme.getCardColor(), new y0(viewHolder, textMessageContainer, onFailedMessageClicked, 17), onFailedMessageClicked, new hb0.o(1, onUriClicked, textMessageContainer), new d(onCopyText, 15), onUriClicked, onSendPostbackMessage, new k(onWebViewUriClicked, 1));
            } else if (!(content instanceof MessageContent.Unsupported)) {
                return;
            } else {
                viewCreateUnsupportedCell = viewHolder.createUnsupportedCell(textMessageContainer, viewHolder.contentView, viewHolder.messagingTheme.getOnErrorColor(), viewHolder.messagingTheme.getErrorColor());
            }
            AdapterDelegatesHelper.INSTANCE.adjustDirectionAndWidth$zendesk_messaging_messaging_android(viewCreateUnsupportedCell, textMessageContainer.getMessage().getContent(), textMessageContainer.getDirection(), viewHolder.contentView);
            viewHolder.contentView.addView(viewCreateUnsupportedCell);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$0(ViewHolder viewHolder, MessageLogEntry.TextMessageContainer textMessageContainer, Function1 function1, Message message) {
            message.getClass();
            viewHolder.clickListener(textMessageContainer, function1);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$1(UriHandler uriHandler, MessageLogEntry.TextMessageContainer textMessageContainer, String str) {
            str.getClass();
            UrlSource urlSource = UrlSource.TEXT;
            MessageSourceType.Companion companion = MessageSourceType.INSTANCE;
            MessageContent content = textMessageContainer.getMessage().getContent();
            content.getClass();
            uriHandler.onUriClicked(str, urlSource, false, companion.findByValue(((MessageContent.Text) content).getSourceType().getValue()));
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$2(Function1 function1, String str) {
            str.getClass();
            function1.invoke(str);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$3(WebViewUriHandler webViewUriHandler, String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            webViewUriHandler.onWebViewUriClicked(str, messageActionSize, UrlSource.WEBVIEW_MESSAGE_ACTION, messageSourceType);
            return Unit.f26487a;
        }

        public final void bind(@NotNull MessageLogEntry.TextMessageContainer item, @NotNull Function1<? super Message, Unit> onFailedMessageClicked, @NotNull UriHandler onUriClicked, @NotNull WebViewUriHandler onWebViewUriClicked, @NotNull Function1<? super String, Unit> onCopyText, @NotNull Function2<? super String, ? super String, Unit> onSendPostbackMessage) {
            item.getClass();
            onFailedMessageClicked.getClass();
            onUriClicked.getClass();
            onWebViewUriClicked.getClass();
            onCopyText.getClass();
            onSendPostbackMessage.getClass();
            AdapterDelegatesHelper adapterDelegatesHelper = AdapterDelegatesHelper.INSTANCE;
            adapterDelegatesHelper.renderAvatar$zendesk_messaging_messaging_android(this.avatarView, item.getAvatarUrl(), item.getMessage().getContent(), item.getSize(), item.getDirection(), this.messagingTheme);
            adapterDelegatesHelper.renderLabel$zendesk_messaging_messaging_android(this.labelView, item.getLabel(), item.getMessage().getContent(), this.messagingTheme);
            renderContent(item, onFailedMessageClicked, onUriClicked, onWebViewUriClicked, onCopyText, onSendPostbackMessage);
            adapterDelegatesHelper.renderReceipt$zendesk_messaging_messaging_android(this.receiptView, item.getReceipt(), item.getDirection(), item.getStatus(), (item.getMessage().getContent() instanceof MessageContent.Text) || (item.getMessage().getContent() instanceof MessageContent.File) || (item.getMessage().getContent() instanceof MessageContent.Image) || (item.getMessage().getContent() instanceof MessageContent.FileUpload) || (item.getMessage().getContent() instanceof MessageContent.Unsupported) || (item.getMessage().getStatus() instanceof MessageStatus.Failed), item.getMessage().getContent() instanceof MessageContent.Unsupported, item.getMessage().getContent(), this.messagingTheme);
            View view = this.itemView;
            view.getClass();
            adapterDelegatesHelper.adjustSpacing$zendesk_messaging_messaging_android(view, item.getPosition());
        }
    }

    public /* synthetic */ TextMessageContainerAdapterDelegate(Function1 function1, UriHandler uriHandler, WebViewUriHandler webViewUriHandler, MessagingTheme messagingTheme, Function1 function12, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MessageLogListenersKt.getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER() : function1, (i11 & 2) != 0 ? StubUriHandler.INSTANCE : uriHandler, (i11 & 4) != 0 ? StubWebViewUriHandler.INSTANCE : webViewUriHandler, messagingTheme, (i11 & 16) != 0 ? MessageLogListenersKt.getNOOP_ON_COPY_TEXT_ACTION() : function12, (i11 & 32) != 0 ? MessageLogListenersKt.getNOOP_ON_SEND_POSTBACK_MESSAGE() : function2);
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @NotNull
    public final Function1<String, Unit> getOnCopyText() {
        return this.onCopyText;
    }

    @NotNull
    public final Function1<Message, Unit> getOnFailedMessageClicked() {
        return this.onFailedMessageClicked;
    }

    @NotNull
    public final Function2<String, String, Unit> getOnSendPostbackMessage() {
        return this.onSendPostbackMessage;
    }

    @NotNull
    public final UriHandler getOnUriClicked() {
        return this.onUriClicked;
    }

    @NotNull
    public final WebViewUriHandler getOnWebViewUriClicked() {
        return this.onWebViewUriClicked;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public boolean isForViewType(@NotNull MessageLogEntry item, @NotNull List<? extends MessageLogEntry> items, int position) {
        item.getClass();
        items.getClass();
        return item instanceof MessageLogEntry.TextMessageContainer;
    }

    public void onBindViewHolder(@NotNull MessageLogEntry.TextMessageContainer item, @NotNull ViewHolder holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        holder.bind(item, this.onFailedMessageClicked, this.onUriClicked, this.onWebViewUriClicked, this.onCopyText, this.onSendPostbackMessage);
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate, zendesk.messaging.android.internal.adapterdelegate.AdapterDelegate
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.zma_view_message_log_entry_message_container, parent, false);
        viewInflate.getClass();
        return new ViewHolder(viewInflate, this.messagingTheme);
    }

    public final void setMessagingTheme(@NotNull MessagingTheme messagingTheme) {
        messagingTheme.getClass();
        this.messagingTheme = messagingTheme;
    }

    public final void setOnCopyText(@NotNull Function1<? super String, Unit> function1) {
        function1.getClass();
        this.onCopyText = function1;
    }

    public final void setOnFailedMessageClicked(@NotNull Function1<? super Message, Unit> function1) {
        function1.getClass();
        this.onFailedMessageClicked = function1;
    }

    public final void setOnSendPostbackMessage(@NotNull Function2<? super String, ? super String, Unit> function2) {
        function2.getClass();
        this.onSendPostbackMessage = function2;
    }

    public final void setOnUriClicked(@NotNull UriHandler uriHandler) {
        uriHandler.getClass();
        this.onUriClicked = uriHandler;
    }

    public final void setOnWebViewUriClicked(@NotNull WebViewUriHandler webViewUriHandler) {
        webViewUriHandler.getClass();
        this.onWebViewUriClicked = webViewUriHandler;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, r2 r2Var, List list) {
        onBindViewHolder((MessageLogEntry.TextMessageContainer) obj, (ViewHolder) r2Var, (List<? extends Object>) list);
    }

    public TextMessageContainerAdapterDelegate(@NotNull Function1<? super Message, Unit> function1, @NotNull UriHandler uriHandler, @NotNull WebViewUriHandler webViewUriHandler, @NotNull MessagingTheme messagingTheme, @NotNull Function1<? super String, Unit> function12, @NotNull Function2<? super String, ? super String, Unit> function2) {
        function1.getClass();
        uriHandler.getClass();
        webViewUriHandler.getClass();
        messagingTheme.getClass();
        function12.getClass();
        function2.getClass();
        this.onFailedMessageClicked = function1;
        this.onUriClicked = uriHandler;
        this.onWebViewUriClicked = webViewUriHandler;
        this.messagingTheme = messagingTheme;
        this.onCopyText = function12;
        this.onSendPostbackMessage = function2;
    }
}
