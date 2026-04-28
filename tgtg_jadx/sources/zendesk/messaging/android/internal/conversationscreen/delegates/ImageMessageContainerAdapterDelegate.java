package zendesk.messaging.android.internal.conversationscreen.delegates;

import a3.u1;
import a3.y0;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c;
import androidx.recyclerview.widget.r2;
import b0.x1;
import b3.n;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import e40.a;
import g9.r0;
import hb0.h;
import hb0.k;
import i80.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import zendesk.android.messaging.UrlSource;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageKt;
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
import zendesk.messaging.android.internal.conversationscreen.delegates.ImageMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogListenersKt;
import zendesk.messaging.android.internal.extension.ViewKtxKt;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessageSize;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.avatar.AvatarImageView;
import zendesk.ui.android.conversation.file.FileRendering;
import zendesk.ui.android.conversation.file.FileState;
import zendesk.ui.android.conversation.file.FileView;
import zendesk.ui.android.conversation.imagecell.ImageCellDirection;
import zendesk.ui.android.conversation.imagecell.ImageCellRendering;
import zendesk.ui.android.conversation.imagecell.ImageCellState;
import zendesk.ui.android.conversation.imagecell.ImageCellView;
import zendesk.ui.android.conversation.imagecell.ImageType;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001@B]\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e\u0012\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00042\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u0017H\u0014¢\u0006\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R8\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u0002`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R2\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/ImageMessageContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/ImageMessageContainerAdapterDelegate$ViewHolder;", "Lzendesk/messaging/android/internal/UriHandler;", "onUriClicked", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "onWebViewUriClicked", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "Lkotlin/Function2;", "", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "onSendPostbackMessage", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "<init>", "(Lzendesk/messaging/android/internal/UriHandler;Lzendesk/messaging/android/internal/WebViewUriHandler;Lzendesk/messaging/android/internal/model/MessagingTheme;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "item", "", "items", "", "position", "", "isForViewType", "(Lzendesk/messaging/android/internal/model/MessageLogEntry;Ljava/util/List;I)Z", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lzendesk/messaging/android/internal/conversationscreen/delegates/ImageMessageContainerAdapterDelegate$ViewHolder;", "holder", "", "payloads", "onBindViewHolder", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;Lzendesk/messaging/android/internal/conversationscreen/delegates/ImageMessageContainerAdapterDelegate$ViewHolder;Ljava/util/List;)V", "Lzendesk/messaging/android/internal/UriHandler;", "getOnUriClicked", "()Lzendesk/messaging/android/internal/UriHandler;", "setOnUriClicked", "(Lzendesk/messaging/android/internal/UriHandler;)V", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "getOnWebViewUriClicked", "()Lzendesk/messaging/android/internal/WebViewUriHandler;", "setOnWebViewUriClicked", "(Lzendesk/messaging/android/internal/WebViewUriHandler;)V", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "Lkotlin/jvm/functions/Function2;", "getOnSendPostbackMessage", "()Lkotlin/jvm/functions/Function2;", "setOnSendPostbackMessage", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function1;", "getOnFailedMessageClicked", "()Lkotlin/jvm/functions/Function1;", "setOnFailedMessageClicked", "(Lkotlin/jvm/functions/Function1;)V", "ViewHolder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageMessageContainerAdapterDelegate extends ListItemAdapterDelegate<MessageLogEntry.ImageMessageContainer, MessageLogEntry, ViewHolder> {

    @NotNull
    private MessagingTheme messagingTheme;

    @NotNull
    private Function1<? super Message, Unit> onFailedMessageClicked;

    @NotNull
    private Function2<? super String, ? super String, Unit> onSendPostbackMessage;

    @NotNull
    private UriHandler onUriClicked;

    @NotNull
    private WebViewUriHandler onWebViewUriClicked;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Jg\u0010\u0018\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u00112\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jÿ\u0001\u0010.\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u001e2\b\b\u0001\u0010!\u001a\u00020\u001e2\b\b\u0001\u0010\"\u001a\u00020\u001e2\b\b\u0001\u0010#\u001a\u00020\u001e2\b\b\u0001\u0010$\u001a\u00020\u001e2\b\b\u0001\u0010%\u001a\u00020\u001e2\b\b\u0001\u0010&\u001a\u00020\u001e2\b\b\u0001\u0010'\u001a\u00020\u001e2\b\b\u0001\u0010(\u001a\u00020\u001e2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u00112\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u00132*\b\u0002\u0010-\u001a$\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00100)j\u0002`,2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b.\u0010/J\u0085\u0001\u00101\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u001e2\b\b\u0001\u0010%\u001a\u00020\u001e2\b\b\u0001\u0010&\u001a\u00020\u001e2\b\b\u0001\u0010!\u001a\u00020\u001e2\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013H\u0002¢\u0006\u0004\b1\u00102J;\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0015*\u00020\b2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0015H\u0002¢\u0006\u0004\b3\u00104J/\u00109\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020+H\u0002¢\u0006\u0004\b9\u0010:J[\u0010;\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u00112\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0015¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/ImageMessageContainerAdapterDelegate$ViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "itemView", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "<init>", "(Landroid/view/View;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;", "item", "Lzendesk/messaging/android/internal/UriHandler;", "onUriClicked", "Lzendesk/messaging/android/internal/WebViewUriHandler;", "onWebViewUriClicked", "Lkotlin/Function2;", "", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnSendPostbackMessage;", "onSendPostbackMessage", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "authorizationToken", "renderContent", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;Lzendesk/messaging/android/internal/UriHandler;Lzendesk/messaging/android/internal/WebViewUriHandler;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "Lzendesk/conversationkit/android/model/MessageContent$Image;", "content", "Landroid/view/ViewGroup;", "parentView", "", "outboundMessageColor", "outboundMessageTextColor", "onErrorColor", "errorBackgroundColor", "actionColor", "actionTextColor", "inboundMessageColor", "inboundMessageTextColor", "htmlCodeBlockTextColor", "htmlCodeBlockBackgroundColor", "Lkotlin/Function4;", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnWebViewMessage;", "onWebViewMessage", "createImageCell", "(Lzendesk/conversationkit/android/model/MessageContent$Image;Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;Landroid/view/ViewGroup;Lzendesk/messaging/android/internal/UriHandler;IIIIIIIIIILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Li80/o;Ljava/lang/String;)Landroid/view/View;", "onFileClicked", "createFileView", "(Lzendesk/conversationkit/android/model/MessageContent$Image;Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;Landroid/view/ViewGroup;IIIIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "clickListener", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "source", "uriHandler", "uri", "sourceType", "onActionUriClicked", "(Ljava/lang/String;Lzendesk/messaging/android/internal/UriHandler;Ljava/lang/String;Lzendesk/core/ui/android/internal/model/MessageSourceType;)V", "bind", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$ImageMessageContainer;Lzendesk/messaging/android/internal/UriHandler;Lzendesk/messaging/android/internal/WebViewUriHandler;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "Landroid/widget/TextView;", "labelView", "Landroid/widget/TextView;", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "avatarView", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "Landroid/widget/LinearLayout;", "contentView", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "receiptView", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nImageMessageContainerAdapterDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageMessageContainerAdapterDelegate.kt\nzendesk/messaging/android/internal/conversationscreen/delegates/ImageMessageContainerAdapterDelegate$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,490:1\n1#2:491\n*E\n"})
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
        private final Function1<Message, Unit> clickListener(MessageLogEntry.ImageMessageContainer imageMessageContainer, Function1<? super Message, Unit> function1) {
            return imageMessageContainer.getMessage().getStatus() instanceof MessageStatus.Failed ? function1 : MessageLogListenersKt.getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER();
        }

        private final View createFileView(final MessageContent.Image content, final MessageLogEntry.ImageMessageContainer item, ViewGroup parentView, final int outboundMessageColor, final int outboundMessageTextColor, final int inboundMessageColor, final int inboundMessageTextColor, final int onErrorColor, final Function1<? super String, Unit> onFileClicked, final Function1<? super Message, Unit> onFailedMessageClicked) {
            Context context = parentView.getContext();
            context.getClass();
            FileView fileView = new FileView(context, null, 0, 0, 14, null);
            fileView.render(new Function1() { // from class: hb0.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageMessageContainerAdapterDelegate.ViewHolder.createFileView$lambda$17(item, inboundMessageTextColor, outboundMessageTextColor, content, inboundMessageColor, outboundMessageColor, onErrorColor, onFileClicked, onFailedMessageClicked, (FileRendering) obj);
                }
            });
            return fileView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ View createFileView$default(ViewHolder viewHolder, MessageContent.Image image, MessageLogEntry.ImageMessageContainer imageMessageContainer, ViewGroup viewGroup, int i11, int i12, int i13, int i14, int i15, Function1 function1, Function1 function12, int i16, Object obj) {
            return viewHolder.createFileView(image, imageMessageContainer, viewGroup, i11, i12, i13, i14, i15, (i16 & 256) != 0 ? new r0(27) : function1, (i16 & 512) != 0 ? new r0(28) : function12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createFileView$lambda$13(String str) {
            str.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createFileView$lambda$14(Message message) {
            message.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FileRendering createFileView$lambda$17(final MessageLogEntry.ImageMessageContainer imageMessageContainer, int i11, int i12, final MessageContent.Image image, final int i13, final int i14, final int i15, Function1 function1, Function1 function12, FileRendering fileRendering) {
            final int i16;
            fileRendering.getClass();
            if (imageMessageContainer.getDirection() == MessageDirection.INBOUND) {
                i16 = i11;
            } else if (imageMessageContainer.getDirection() == MessageDirection.OUTBOUND && (imageMessageContainer.getStatus() instanceof MessageStatus.Sent)) {
                i16 = i12;
            } else {
                i11 = ViewKtxKt.adjustAlpha$default(i12, 0.0f, 1, null);
                i16 = i11;
            }
            return fileRendering.toBuilder().state(new Function1() { // from class: hb0.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageMessageContainerAdapterDelegate.ViewHolder.createFileView$lambda$17$lambda$15(image, i16, imageMessageContainer, i13, i14, i15, (FileState) obj);
                }
            }).onCellClicked(new c(9, imageMessageContainer, function1, image, function12)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FileState createFileView$lambda$17$lambda$15(MessageContent.Image image, int i11, MessageLogEntry.ImageMessageContainer imageMessageContainer, int i12, int i13, int i14, FileState fileState) {
            int i15;
            fileState.getClass();
            String strX = StringsKt.X(image.getMediaUrl(), ExpiryDateInput.SEPARATOR);
            try {
                String queryParameter = Uri.parse(image.getMediaUrl()).getQueryParameter("name");
                if (queryParameter != null) {
                    strX = queryParameter;
                }
            } catch (NullPointerException unused) {
            }
            String str = strX;
            long mediaSize = image.getMediaSize();
            if (imageMessageContainer.getDirection() == MessageDirection.INBOUND) {
                i15 = i12;
            } else {
                MessageStatus status = imageMessageContainer.getStatus();
                if (status instanceof MessageStatus.Pending) {
                    i12 = ViewKtxKt.adjustAlpha$default(i13, 0.0f, 1, null);
                } else if ((status instanceof MessageStatus.Sent) || (status instanceof MessageStatus.Downloading)) {
                    i15 = i13;
                } else {
                    if (!(status instanceof MessageStatus.Failed) && !(status instanceof MessageStatus.DownloadFailed)) {
                        a.f();
                        return null;
                    }
                    i12 = ViewKtxKt.adjustAlpha$default(i14, 0.0f, 1, null);
                }
                i15 = i12;
            }
            return fileState.copy(str, mediaSize, i11, i11, i15, Integer.valueOf(AdapterDelegatesHelper.INSTANCE.getCellDrawable$zendesk_messaging_messaging_android(imageMessageContainer.getShape(), imageMessageContainer.getDirection())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createFileView$lambda$17$lambda$16(MessageLogEntry.ImageMessageContainer imageMessageContainer, Function1 function1, MessageContent.Image image, Function1 function12) {
            if (imageMessageContainer.getStatus() instanceof MessageStatus.Sent) {
                function1.invoke(image.getMediaUrl());
            } else if (imageMessageContainer.getStatus() instanceof MessageStatus.Failed) {
                function12.invoke(imageMessageContainer.getMessage());
            }
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final View createImageCell(final MessageContent.Image content, final MessageLogEntry.ImageMessageContainer item, final ViewGroup parentView, final UriHandler onUriClicked, int outboundMessageColor, int outboundMessageTextColor, final int onErrorColor, final int errorBackgroundColor, final int actionColor, final int actionTextColor, int inboundMessageColor, int inboundMessageTextColor, final int htmlCodeBlockTextColor, final int htmlCodeBlockBackgroundColor, final Function2<? super String, ? super String, Unit> onSendPostbackMessage, final Function1<? super Message, Unit> onFailedMessageClicked, final o onWebViewMessage, final String authorizationToken) {
            if (!ImageType.INSTANCE.isSupported(content.getMediaType())) {
                return createFileView$default(this, content, item, parentView, outboundMessageColor, outboundMessageTextColor, inboundMessageColor, inboundMessageTextColor, onErrorColor, new ek.a(27, onUriClicked, content), null, 512, null);
            }
            Context context = parentView.getContext();
            context.getClass();
            final ImageCellView imageCellView = new ImageCellView(context, null, 0, 6, null);
            MessageDirection direction = item.getDirection();
            MessageDirection messageDirection = MessageDirection.INBOUND;
            final int i11 = direction == messageDirection ? inboundMessageTextColor : outboundMessageTextColor;
            final int i12 = item.getDirection() == messageDirection ? inboundMessageColor : outboundMessageColor;
            imageCellView.render(new Function1() { // from class: hb0.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageMessageContainerAdapterDelegate.ViewHolder.createImageCell$lambda$11$lambda$10(content, parentView, item, imageCellView, i11, onErrorColor, errorBackgroundColor, i12, actionColor, actionTextColor, htmlCodeBlockTextColor, htmlCodeBlockBackgroundColor, authorizationToken, onUriClicked, onFailedMessageClicked, this, onWebViewMessage, onSendPostbackMessage, (ImageCellRendering) obj);
                }
            });
            return imageCellView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImageCellRendering createImageCell$lambda$11$lambda$10(final MessageContent.Image image, final ViewGroup viewGroup, final MessageLogEntry.ImageMessageContainer imageMessageContainer, final ImageCellView imageCellView, final int i11, final int i12, final int i13, final int i14, final int i15, final int i16, final int i17, final int i18, final String str, UriHandler uriHandler, Function1 function1, ViewHolder viewHolder, o oVar, Function2 function2, ImageCellRendering imageCellRendering) {
            imageCellRendering.getClass();
            return imageCellRendering.toBuilder().state(new Function1() { // from class: hb0.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageMessageContainerAdapterDelegate.ViewHolder.createImageCell$lambda$11$lambda$10$lambda$5(image, viewGroup, imageMessageContainer, imageCellView, i11, i12, i13, i14, i15, i16, i17, i18, str, (ImageCellState) obj);
                }
            }).onImageCellClicked(new x1(8, imageMessageContainer, uriHandler, image, function1)).onActionButtonClicked(new u1(7, viewHolder, uriHandler)).onWebViewActionButtonClicked(new h(0, oVar)).onPostbackButtonClicked(new n(13, function2)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImageCellState createImageCell$lambda$11$lambda$10$lambda$5(MessageContent.Image image, ViewGroup viewGroup, MessageLogEntry.ImageMessageContainer imageMessageContainer, ImageCellView imageCellView, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str, ImageCellState imageCellState) {
            imageCellState.getClass();
            Uri uri = Uri.parse(image.getMediaUrl());
            String localUri = image.getLocalUri();
            Uri uri2 = localUri != null ? Uri.parse(localUri) : null;
            String mediaType = image.getMediaType();
            String text = image.getText();
            String htmlText = image.getHtmlText();
            String string = viewGroup.getContext().getString(R.string.zma_image_view_loading_error);
            AdapterDelegatesHelper adapterDelegatesHelper = AdapterDelegatesHelper.INSTANCE;
            ImageCellDirection imageCellDirection$zendesk_messaging_messaging_android = adapterDelegatesHelper.getImageCellDirection$zendesk_messaging_messaging_android(imageMessageContainer.getShape(), imageMessageContainer.getDirection());
            MessageContent content = imageMessageContainer.getMessage().getContent();
            Context context = imageCellView.getContext();
            context.getClass();
            return ImageCellState.copy$default(imageCellState, uri, uri2, mediaType, text, htmlText, false, false, adapterDelegatesHelper.getCellActions$zendesk_messaging_messaging_android(content, context), i11, i12, i12, i13, i14, i15, i16, i17, i18, string, imageCellDirection$zendesk_messaging_messaging_android, str, 96, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createImageCell$lambda$11$lambda$10$lambda$6(MessageLogEntry.ImageMessageContainer imageMessageContainer, UriHandler uriHandler, MessageContent.Image image, Function1 function1, String str) {
            str.getClass();
            if (imageMessageContainer.getStatus() instanceof MessageStatus.Sent) {
                uriHandler.onUriClicked(str, UrlSource.IMAGE, MessageKt.isPrivateAttachment(image), MessageSourceType.INSTANCE.findByValue(image.getSourceType().getValue()));
            } else if (imageMessageContainer.getStatus() instanceof MessageStatus.Failed) {
                function1.invoke(imageMessageContainer.getMessage());
            }
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createImageCell$lambda$11$lambda$10$lambda$7(ViewHolder viewHolder, UriHandler uriHandler, String str, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            str2.getClass();
            messageSourceType.getClass();
            viewHolder.onActionUriClicked(str2, uriHandler, str, messageSourceType);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createImageCell$lambda$11$lambda$10$lambda$8(o oVar, String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            oVar.invoke(str, messageActionSize, str2, messageSourceType);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createImageCell$lambda$11$lambda$10$lambda$9(Function2 function2, String str, String str2) {
            str.getClass();
            str2.getClass();
            function2.invoke(str, str2);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createImageCell$lambda$12(UriHandler uriHandler, MessageContent.Image image, String str) {
            str.getClass();
            uriHandler.onUriClicked(str, UrlSource.FILE, MessageKt.isPrivateAttachment(image), MessageSourceType.INSTANCE.findByValue(image.getSourceType().getValue()));
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createImageCell$lambda$2(Message message) {
            message.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createImageCell$lambda$3(String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            return Unit.f26487a;
        }

        private final void onActionUriClicked(String source, UriHandler uriHandler, String uri, MessageSourceType sourceType) {
            UrlSource urlSourceFindByValue = UrlSource.INSTANCE.findByValue(source);
            if (urlSourceFindByValue != null) {
                uriHandler.onUriClicked(uri, urlSourceFindByValue, false, sourceType);
            }
        }

        private final void renderContent(MessageLogEntry.ImageMessageContainer item, UriHandler onUriClicked, WebViewUriHandler onWebViewUriClicked, Function2<? super String, ? super String, Unit> onSendPostbackMessage, Function1<? super Message, Unit> onFailedMessageClicked, String authorizationToken) {
            this.contentView.removeAllViews();
            if (item.getMessage().getContent() instanceof MessageContent.Image) {
                MessageContent content = item.getMessage().getContent();
                content.getClass();
                LinearLayout linearLayout = this.contentView;
                int actionColor = this.messagingTheme.getActionColor();
                int onMessageColor = this.messagingTheme.getOnMessageColor();
                int onActionColor = this.messagingTheme.getOnActionColor();
                View viewCreateImageCell = createImageCell((MessageContent.Image) content, item, linearLayout, onUriClicked, this.messagingTheme.getMessageColor(), onMessageColor, this.messagingTheme.getOnErrorColor(), this.messagingTheme.getErrorColor(), actionColor, onActionColor, this.messagingTheme.getInboundMessageColor(), this.messagingTheme.getOnBusinessMessageColor(), this.messagingTheme.getOnBackgroundColor(), this.messagingTheme.getBackgroundColor(), onSendPostbackMessage, new y0(this, item, onFailedMessageClicked, 15), new k(onWebViewUriClicked, 0), authorizationToken);
                AdapterDelegatesHelper.INSTANCE.adjustDirectionAndWidth$zendesk_messaging_messaging_android(viewCreateImageCell, item.getMessage().getContent(), item.getDirection(), this.contentView);
                this.contentView.addView(viewCreateImageCell);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$0(ViewHolder viewHolder, MessageLogEntry.ImageMessageContainer imageMessageContainer, Function1 function1, Message message) {
            message.getClass();
            viewHolder.clickListener(imageMessageContainer, function1);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$1(WebViewUriHandler webViewUriHandler, String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            webViewUriHandler.onWebViewUriClicked(str, messageActionSize, UrlSource.WEBVIEW_MESSAGE_ACTION, messageSourceType);
            return Unit.f26487a;
        }

        public final void bind(@NotNull MessageLogEntry.ImageMessageContainer item, @NotNull UriHandler onUriClicked, @NotNull WebViewUriHandler onWebViewUriClicked, @NotNull Function2<? super String, ? super String, Unit> onSendPostbackMessage, @NotNull Function1<? super Message, Unit> onFailedMessageClicked) {
            item.getClass();
            onUriClicked.getClass();
            onWebViewUriClicked.getClass();
            onSendPostbackMessage.getClass();
            onFailedMessageClicked.getClass();
            AdapterDelegatesHelper adapterDelegatesHelper = AdapterDelegatesHelper.INSTANCE;
            adapterDelegatesHelper.renderLabel$zendesk_messaging_messaging_android(this.labelView, item.getLabel(), item.getMessage().getContent(), this.messagingTheme);
            adapterDelegatesHelper.renderAvatar$zendesk_messaging_messaging_android(this.avatarView, item.getAvatarUrl(), item.getMessage().getContent(), MessageSize.NORMAL, item.getDirection(), this.messagingTheme);
            renderContent(item, onUriClicked, onWebViewUriClicked, onSendPostbackMessage, onFailedMessageClicked, item.getAuthorizationToken());
            adapterDelegatesHelper.renderReceipt$zendesk_messaging_messaging_android(this.receiptView, item.getReceipt(), item.getDirection(), item.getStatus(), (item.getMessage().getContent() instanceof MessageContent.Image) || (item.getMessage().getStatus() instanceof MessageStatus.Failed), item.getMessage().getContent() instanceof MessageContent.Unsupported, item.getMessage().getContent(), this.messagingTheme);
            View view = this.itemView;
            view.getClass();
            adapterDelegatesHelper.adjustSpacing$zendesk_messaging_messaging_android(view, item.getPosition());
        }
    }

    public /* synthetic */ ImageMessageContainerAdapterDelegate(UriHandler uriHandler, WebViewUriHandler webViewUriHandler, MessagingTheme messagingTheme, Function2 function2, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? StubUriHandler.INSTANCE : uriHandler, (i11 & 2) != 0 ? StubWebViewUriHandler.INSTANCE : webViewUriHandler, messagingTheme, (i11 & 8) != 0 ? MessageLogListenersKt.getNOOP_ON_SEND_POSTBACK_MESSAGE() : function2, (i11 & 16) != 0 ? MessageLogListenersKt.getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER() : function1);
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
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
        return item instanceof MessageLogEntry.ImageMessageContainer;
    }

    public void onBindViewHolder(@NotNull MessageLogEntry.ImageMessageContainer item, @NotNull ViewHolder holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        holder.bind(item, this.onUriClicked, this.onWebViewUriClicked, this.onSendPostbackMessage, this.onFailedMessageClicked);
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
        onBindViewHolder((MessageLogEntry.ImageMessageContainer) obj, (ViewHolder) r2Var, (List<? extends Object>) list);
    }

    public ImageMessageContainerAdapterDelegate(@NotNull UriHandler uriHandler, @NotNull WebViewUriHandler webViewUriHandler, @NotNull MessagingTheme messagingTheme, @NotNull Function2<? super String, ? super String, Unit> function2, @NotNull Function1<? super Message, Unit> function1) {
        uriHandler.getClass();
        webViewUriHandler.getClass();
        messagingTheme.getClass();
        function2.getClass();
        function1.getClass();
        this.onUriClicked = uriHandler;
        this.onWebViewUriClicked = webViewUriHandler;
        this.messagingTheme = messagingTheme;
        this.onSendPostbackMessage = function2;
        this.onFailedMessageClicked = function1;
    }
}
