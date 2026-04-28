package zendesk.messaging.android.internal.conversationscreen.delegates;

import a0.g;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.r2;
import b0.x1;
import b3.o;
import d2.b3;
import e40.a;
import ep.l;
import g9.r0;
import hb0.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.android.messaging.UrlSource;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.core.ui.android.internal.model.MessageDirection;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.StubUriHandler;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.FileMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogListenersKt;
import zendesk.messaging.android.internal.extension.ViewKtxKt;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.avatar.AvatarImageView;
import zendesk.ui.android.conversation.file.FileRendering;
import zendesk.ui.android.conversation.file.FileState;
import zendesk.ui.android.conversation.file.FileView;
import zendesk.ui.android.conversation.imagecell.ImageCellRendering;
import zendesk.ui.android.conversation.imagecell.ImageCellState;
import zendesk.ui.android.conversation.imagecell.ImageCellView;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00014BM\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0013H\u0014¢\u0006\u0004\b!\u0010\"R2\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R2\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b-\u0010%\"\u0004\b.\u0010'R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/FileMessageContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/FileMessageContainerAdapterDelegate$ViewHolder;", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/Message;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "Lzendesk/messaging/android/internal/UriHandler;", "onUriClicked", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFileAttachmentClicked;", "onFileAttachmentClicked", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "<init>", "(Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/UriHandler;Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "item", "", "items", "", "position", "", "isForViewType", "(Lzendesk/messaging/android/internal/model/MessageLogEntry;Ljava/util/List;I)Z", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Lzendesk/messaging/android/internal/conversationscreen/delegates/FileMessageContainerAdapterDelegate$ViewHolder;", "holder", "", "payloads", "onBindViewHolder", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;Lzendesk/messaging/android/internal/conversationscreen/delegates/FileMessageContainerAdapterDelegate$ViewHolder;Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "getOnFailedMessageClicked", "()Lkotlin/jvm/functions/Function1;", "setOnFailedMessageClicked", "(Lkotlin/jvm/functions/Function1;)V", "Lzendesk/messaging/android/internal/UriHandler;", "getOnUriClicked", "()Lzendesk/messaging/android/internal/UriHandler;", "setOnUriClicked", "(Lzendesk/messaging/android/internal/UriHandler;)V", "getOnFileAttachmentClicked", "setOnFileAttachmentClicked", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "ViewHolder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileMessageContainerAdapterDelegate extends ListItemAdapterDelegate<MessageLogEntry.FileMessageContainer, MessageLogEntry, ViewHolder> {

    @NotNull
    private MessagingTheme messagingTheme;

    @NotNull
    private Function1<? super Message, Unit> onFailedMessageClicked;

    @NotNull
    private Function1<? super Message, Unit> onFileAttachmentClicked;

    @NotNull
    private UriHandler onUriClicked;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JO\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r*\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016JQ\u0010 \u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001d\u001a\u00020\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b \u0010!JO\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001d\u001a\u00020\u001b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b$\u0010%Jc\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001d\u001a\u00020\u001b2\b\b\u0001\u0010(\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*J/\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010.J/\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010.JM\u00102\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\u0011¢\u0006\u0004\b2\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/FileMessageContainerAdapterDelegate$ViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "itemView", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "<init>", "(Landroid/view/View;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;", "item", "Lkotlin/Function1;", "Lzendesk/conversationkit/android/model/Message;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFailedMessageClickedListener;", "onFailedMessageClicked", "Lzendesk/messaging/android/internal/UriHandler;", "onUriClicked", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFileAttachmentClicked;", "onFileAttachmentClicked", "renderContent", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/UriHandler;Lkotlin/jvm/functions/Function1;)V", "clickListener", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Lzendesk/conversationkit/android/model/MessageContent$File;", "fileContent", "Landroid/view/ViewGroup;", "parentView", "", "textAndIconColor", "backgroundColor", "", "onFileClicked", "createFileCell", "(Lzendesk/conversationkit/android/model/MessageContent$File;Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;Landroid/view/ViewGroup;IILkotlin/jvm/functions/Function1;)Landroid/view/View;", "Lzendesk/conversationkit/android/model/MessageContent$FileUpload;", "uploadContent", "createFileUploadCell", "(Lzendesk/conversationkit/android/model/MessageContent$FileUpload;Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;Landroid/view/ViewGroup;IILkotlin/jvm/functions/Function1;)Landroid/view/View;", "content", "uriHandler", "onErrorColor", "createFileImageUploadCell", "(Lzendesk/conversationkit/android/model/MessageContent$FileUpload;Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/UriHandler;III)Landroid/view/View;", "inboundMessageColor", "outboundMessageColor", "dangerColor", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$FileMessageContainer;III)I", "inboundMessageTextColor", "dangerTextColor", "outboundMessageTextColor", "bind", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "Landroid/widget/TextView;", "labelView", "Landroid/widget/TextView;", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "avatarView", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "Landroid/widget/LinearLayout;", "contentView", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "receiptView", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        private final int backgroundColor(MessageLogEntry.FileMessageContainer item, int inboundMessageColor, int outboundMessageColor, int dangerColor) {
            if (item.getDirection() != MessageDirection.INBOUND) {
                MessageStatus status = item.getStatus();
                if (status instanceof MessageStatus.Pending) {
                    return ViewKtxKt.adjustAlpha$default(outboundMessageColor, 0.0f, 1, null);
                }
                if ((status instanceof MessageStatus.Sent) || (status instanceof MessageStatus.Downloading)) {
                    return outboundMessageColor;
                }
                if (!(status instanceof MessageStatus.Failed) && !(status instanceof MessageStatus.DownloadFailed)) {
                    a.f();
                    return 0;
                }
            } else if (!(item.getStatus() instanceof MessageStatus.DownloadFailed)) {
                return inboundMessageColor;
            }
            return dangerColor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final Function1<Message, Unit> clickListener(MessageLogEntry.FileMessageContainer fileMessageContainer, Function1<? super Message, Unit> function1) {
            return fileMessageContainer.getMessage().getStatus() instanceof MessageStatus.Failed ? function1 : MessageLogListenersKt.getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER();
        }

        private final View createFileCell(MessageContent.File fileContent, MessageLogEntry.FileMessageContainer item, ViewGroup parentView, int textAndIconColor, int backgroundColor, Function1<? super String, Unit> onFileClicked) {
            Context context = parentView.getContext();
            context.getClass();
            FileView fileView = new FileView(context, null, 0, 0, 14, null);
            fileView.render(new b3(fileContent, textAndIconColor, backgroundColor, item, onFileClicked, 1));
            return fileView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ View createFileCell$default(ViewHolder viewHolder, MessageContent.File file, MessageLogEntry.FileMessageContainer fileMessageContainer, ViewGroup viewGroup, int i11, int i12, Function1 function1, int i13, Object obj) {
            if ((i13 & 32) != 0) {
                function1 = new r0(25);
            }
            return viewHolder.createFileCell(file, fileMessageContainer, viewGroup, i11, i12, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createFileCell$lambda$1(String str) {
            str.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FileRendering createFileCell$lambda$5$lambda$4(MessageContent.File file, int i11, int i12, MessageLogEntry.FileMessageContainer fileMessageContainer, Function1 function1, FileRendering fileRendering) {
            fileRendering.getClass();
            return fileRendering.toBuilder().state(new e(file, i11, i12, fileMessageContainer, 0)).onCellClicked(new g(fileMessageContainer, function1, file, 18)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FileState createFileCell$lambda$5$lambda$4$lambda$2(MessageContent.File file, int i11, int i12, MessageLogEntry.FileMessageContainer fileMessageContainer, FileState fileState) {
            fileState.getClass();
            return fileState.copy(file.getAltText(), file.getMediaSize(), i11, i11, i12, Integer.valueOf(AdapterDelegatesHelper.INSTANCE.getCellDrawable$zendesk_messaging_messaging_android(fileMessageContainer.getShape(), fileMessageContainer.getDirection())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createFileCell$lambda$5$lambda$4$lambda$3(MessageLogEntry.FileMessageContainer fileMessageContainer, Function1 function1, MessageContent.File file) {
            if ((fileMessageContainer.getStatus() instanceof MessageStatus.Sent) || (fileMessageContainer.getStatus() instanceof MessageStatus.DownloadFailed)) {
                function1.invoke(file.getMediaUrl());
            }
            return Unit.f26487a;
        }

        private final View createFileImageUploadCell(final MessageContent.FileUpload content, final MessageLogEntry.FileMessageContainer item, ViewGroup parentView, final Function1<? super Message, Unit> onFailedMessageClicked, final UriHandler uriHandler, final int textAndIconColor, final int backgroundColor, final int onErrorColor) {
            Context context = parentView.getContext();
            context.getClass();
            ImageCellView imageCellView = new ImageCellView(context, null, 0, 6, null);
            imageCellView.render(new Function1() { // from class: hb0.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FileMessageContainerAdapterDelegate.ViewHolder.createFileImageUploadCell$lambda$13$lambda$12(content, item, textAndIconColor, onErrorColor, backgroundColor, onFailedMessageClicked, uriHandler, (ImageCellRendering) obj);
                }
            });
            return imageCellView;
        }

        public static /* synthetic */ View createFileImageUploadCell$default(ViewHolder viewHolder, MessageContent.FileUpload fileUpload, MessageLogEntry.FileMessageContainer fileMessageContainer, ViewGroup viewGroup, Function1 function1, UriHandler uriHandler, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 16) != 0) {
                uriHandler = StubUriHandler.INSTANCE;
            }
            return viewHolder.createFileImageUploadCell(fileUpload, fileMessageContainer, viewGroup, function1, uriHandler, i11, i12, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImageCellRendering createFileImageUploadCell$lambda$13$lambda$12(MessageContent.FileUpload fileUpload, MessageLogEntry.FileMessageContainer fileMessageContainer, int i11, int i12, int i13, Function1 function1, UriHandler uriHandler, ImageCellRendering imageCellRendering) {
            imageCellRendering.getClass();
            return imageCellRendering.toBuilder().state(new o(fileUpload, fileMessageContainer, i11, i12, i13)).onImageCellClicked(new x1(7, fileMessageContainer, function1, uriHandler, fileUpload)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImageCellState createFileImageUploadCell$lambda$13$lambda$12$lambda$10(MessageContent.FileUpload fileUpload, MessageLogEntry.FileMessageContainer fileMessageContainer, int i11, int i12, int i13, ImageCellState imageCellState) {
            imageCellState.getClass();
            return ImageCellState.copy$default(imageCellState, Uri.parse(fileUpload.getUri()), Uri.parse(fileUpload.getUri()), fileUpload.getMimeType(), null, null, fileMessageContainer.getStatus() instanceof MessageStatus.Failed, fileMessageContainer.getStatus() instanceof MessageStatus.Pending, null, i11, i12, i12, 0, i13, 0, 0, 0, 0, null, AdapterDelegatesHelper.INSTANCE.getImageCellDirection$zendesk_messaging_messaging_android(fileMessageContainer.getShape(), fileMessageContainer.getDirection()), null, 780440, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createFileImageUploadCell$lambda$13$lambda$12$lambda$11(MessageLogEntry.FileMessageContainer fileMessageContainer, Function1 function1, UriHandler uriHandler, MessageContent.FileUpload fileUpload, String str) {
            str.getClass();
            if (fileMessageContainer.getStatus() instanceof MessageStatus.Failed) {
                function1.invoke(fileMessageContainer.getMessage());
            } else if (fileMessageContainer.getStatus() instanceof MessageStatus.Sent) {
                uriHandler.onUriClicked(fileUpload.getUri(), UrlSource.IMAGE, false, MessageSourceType.INSTANCE.findByValue(fileUpload.getSourceType().getValue()));
            }
            return Unit.f26487a;
        }

        private final View createFileUploadCell(MessageContent.FileUpload uploadContent, MessageLogEntry.FileMessageContainer item, ViewGroup parentView, int textAndIconColor, int backgroundColor, Function1<? super Message, Unit> onFailedMessageClicked) {
            Context context = parentView.getContext();
            context.getClass();
            FileView fileView = new FileView(context, null, 0, 0, 14, null);
            fileView.render(new b3(uploadContent, textAndIconColor, backgroundColor, item, onFailedMessageClicked, 2));
            return fileView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FileRendering createFileUploadCell$lambda$9$lambda$8(MessageContent.FileUpload fileUpload, int i11, int i12, MessageLogEntry.FileMessageContainer fileMessageContainer, Function1 function1, FileRendering fileRendering) {
            fileRendering.getClass();
            return fileRendering.toBuilder().state(new e(fileUpload, i11, i12, fileMessageContainer, 1)).onCellClicked(new l(21, fileMessageContainer, function1)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FileState createFileUploadCell$lambda$9$lambda$8$lambda$6(MessageContent.FileUpload fileUpload, int i11, int i12, MessageLogEntry.FileMessageContainer fileMessageContainer, FileState fileState) {
            fileState.getClass();
            return fileState.copy(fileUpload.getName(), fileUpload.getSize(), i11, i11, i12, Integer.valueOf(AdapterDelegatesHelper.INSTANCE.getCellDrawable$zendesk_messaging_messaging_android(fileMessageContainer.getShape(), fileMessageContainer.getDirection())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createFileUploadCell$lambda$9$lambda$8$lambda$7(MessageLogEntry.FileMessageContainer fileMessageContainer, Function1 function1) {
            if (fileMessageContainer.getStatus() instanceof MessageStatus.Failed) {
                function1.invoke(fileMessageContainer.getMessage());
            }
            return Unit.f26487a;
        }

        private final void renderContent(MessageLogEntry.FileMessageContainer item, Function1<? super Message, Unit> onFailedMessageClicked, UriHandler onUriClicked, Function1<? super Message, Unit> onFileAttachmentClicked) {
            View viewCreateFileUploadCell;
            this.contentView.removeAllViews();
            int iTextAndIconColor = textAndIconColor(item, this.messagingTheme.getOnBusinessMessageColor(), this.messagingTheme.getOnErrorColor(), this.messagingTheme.getOnMessageColor());
            int iBackgroundColor = backgroundColor(item, this.messagingTheme.getInboundMessageColor(), this.messagingTheme.getMessageColor(), ViewKtxKt.adjustAlpha$default(this.messagingTheme.getErrorColor(), 0.0f, 1, null));
            MessageContent content = item.getMessage().getContent();
            if (content instanceof MessageContent.File) {
                MessageContent content2 = item.getMessage().getContent();
                content2.getClass();
                viewCreateFileUploadCell = createFileCell((MessageContent.File) content2, item, this.contentView, iTextAndIconColor, iBackgroundColor, new ek.a(26, onFileAttachmentClicked, item));
            } else {
                if (!(content instanceof MessageContent.FileUpload)) {
                    return;
                }
                MessageContent content3 = item.getMessage().getContent();
                content3.getClass();
                if (((MessageContent.FileUpload) content3).isImageMimeType()) {
                    MessageContent content4 = item.getMessage().getContent();
                    content4.getClass();
                    viewCreateFileUploadCell = createFileImageUploadCell((MessageContent.FileUpload) content4, item, this.contentView, onFailedMessageClicked, onUriClicked, iTextAndIconColor, iBackgroundColor, this.messagingTheme.getOnErrorColor());
                } else {
                    MessageContent content5 = item.getMessage().getContent();
                    content5.getClass();
                    viewCreateFileUploadCell = createFileUploadCell((MessageContent.FileUpload) content5, item, this.contentView, iTextAndIconColor, iBackgroundColor, clickListener(item, onFailedMessageClicked));
                }
            }
            AdapterDelegatesHelper.INSTANCE.adjustDirectionAndWidth$zendesk_messaging_messaging_android(viewCreateFileUploadCell, item.getMessage().getContent(), item.getDirection(), this.contentView);
            this.contentView.addView(viewCreateFileUploadCell);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$0(Function1 function1, MessageLogEntry.FileMessageContainer fileMessageContainer, String str) {
            str.getClass();
            function1.invoke(fileMessageContainer.getMessage());
            return Unit.f26487a;
        }

        private final int textAndIconColor(MessageLogEntry.FileMessageContainer item, int inboundMessageTextColor, int dangerTextColor, int outboundMessageTextColor) {
            if (item.getDirection() == MessageDirection.INBOUND) {
                if (!(item.getStatus() instanceof MessageStatus.DownloadFailed)) {
                    return inboundMessageTextColor;
                }
            } else {
                if (item.getDirection() == MessageDirection.OUTBOUND && (item.getStatus() instanceof MessageStatus.Sent)) {
                    return outboundMessageTextColor;
                }
                if (!(item.getStatus() instanceof MessageStatus.Failed) && !(item.getStatus() instanceof MessageStatus.DownloadFailed)) {
                    return ViewKtxKt.adjustAlpha$default(outboundMessageTextColor, 0.0f, 1, null);
                }
            }
            return dangerTextColor;
        }

        public final void bind(@NotNull MessageLogEntry.FileMessageContainer item, @NotNull Function1<? super Message, Unit> onFailedMessageClicked, @NotNull UriHandler onUriClicked, @NotNull Function1<? super Message, Unit> onFileAttachmentClicked) {
            item.getClass();
            onFailedMessageClicked.getClass();
            onUriClicked.getClass();
            onFileAttachmentClicked.getClass();
            AdapterDelegatesHelper adapterDelegatesHelper = AdapterDelegatesHelper.INSTANCE;
            adapterDelegatesHelper.renderLabel$zendesk_messaging_messaging_android(this.labelView, item.getLabel(), item.getMessage().getContent(), this.messagingTheme);
            adapterDelegatesHelper.renderAvatar$zendesk_messaging_messaging_android(this.avatarView, item.getAvatarUrl(), item.getMessage().getContent(), item.getSize(), item.getDirection(), this.messagingTheme);
            renderContent(item, onFailedMessageClicked, onUriClicked, onFileAttachmentClicked);
            adapterDelegatesHelper.renderReceipt$zendesk_messaging_messaging_android(this.receiptView, item.getReceipt(), item.getDirection(), item.getStatus(), (item.getMessage().getContent() instanceof MessageContent.File) || (item.getMessage().getContent() instanceof MessageContent.FileUpload) || (item.getMessage().getContent() instanceof MessageContent.Unsupported) || (item.getMessage().getStatus() instanceof MessageStatus.Failed) || (item.getMessage().getStatus() instanceof MessageStatus.Downloading) || (item.getMessage().getStatus() instanceof MessageStatus.DownloadFailed), item.getMessage().getContent() instanceof MessageContent.Unsupported, item.getMessage().getContent(), this.messagingTheme);
            View view = this.itemView;
            view.getClass();
            adapterDelegatesHelper.adjustSpacing$zendesk_messaging_messaging_android(view, item.getPosition());
        }
    }

    public /* synthetic */ FileMessageContainerAdapterDelegate(Function1 function1, UriHandler uriHandler, Function1 function12, MessagingTheme messagingTheme, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MessageLogListenersKt.getNOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER() : function1, (i11 & 2) != 0 ? StubUriHandler.INSTANCE : uriHandler, (i11 & 4) != 0 ? MessageLogListenersKt.getNOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION() : function12, messagingTheme);
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
    public final Function1<Message, Unit> getOnFileAttachmentClicked() {
        return this.onFileAttachmentClicked;
    }

    @NotNull
    public final UriHandler getOnUriClicked() {
        return this.onUriClicked;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public boolean isForViewType(@NotNull MessageLogEntry item, @NotNull List<? extends MessageLogEntry> items, int position) {
        item.getClass();
        items.getClass();
        return item instanceof MessageLogEntry.FileMessageContainer;
    }

    public void onBindViewHolder(@NotNull MessageLogEntry.FileMessageContainer item, @NotNull ViewHolder holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        holder.bind(item, this.onFailedMessageClicked, this.onUriClicked, this.onFileAttachmentClicked);
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

    public final void setOnFileAttachmentClicked(@NotNull Function1<? super Message, Unit> function1) {
        function1.getClass();
        this.onFileAttachmentClicked = function1;
    }

    public final void setOnUriClicked(@NotNull UriHandler uriHandler) {
        uriHandler.getClass();
        this.onUriClicked = uriHandler;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, r2 r2Var, List list) {
        onBindViewHolder((MessageLogEntry.FileMessageContainer) obj, (ViewHolder) r2Var, (List<? extends Object>) list);
    }

    public FileMessageContainerAdapterDelegate(@NotNull Function1<? super Message, Unit> function1, @NotNull UriHandler uriHandler, @NotNull Function1<? super Message, Unit> function12, @NotNull MessagingTheme messagingTheme) {
        function1.getClass();
        uriHandler.getClass();
        function12.getClass();
        messagingTheme.getClass();
        this.onFailedMessageClicked = function1;
        this.onUriClicked = uriHandler;
        this.onFileAttachmentClicked = function12;
        this.messagingTheme = messagingTheme;
    }
}
