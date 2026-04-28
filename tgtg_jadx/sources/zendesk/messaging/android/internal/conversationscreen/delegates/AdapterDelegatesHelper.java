package zendesk.messaging.android.internal.conversationscreen.delegates;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import e40.a;
import f2.y;
import hb0.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageDirection;
import zendesk.core.ui.android.internal.model.MessagePosition;
import zendesk.core.ui.android.internal.model.MessageShape;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.android.internal.conversationscreen.delegates.AdapterDelegatesHelper;
import zendesk.messaging.android.internal.extension.ViewKtxKt;
import zendesk.messaging.android.internal.model.MessageReceipt;
import zendesk.messaging.android.internal.model.MessageSize;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.R;
import zendesk.ui.android.conversation.actionbutton.ActionButton;
import zendesk.ui.android.conversation.avatar.AvatarImageRendering;
import zendesk.ui.android.conversation.avatar.AvatarImageState;
import zendesk.ui.android.conversation.avatar.AvatarImageView;
import zendesk.ui.android.conversation.avatar.AvatarMask;
import zendesk.ui.android.conversation.imagecell.ImageCellDirection;
import zendesk.ui.android.conversation.receipt.MessageReceiptPosition;
import zendesk.ui.android.conversation.receipt.MessageReceiptRendering;
import zendesk.ui.android.conversation.receipt.MessageReceiptState;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J/\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J?\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b(JO\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b3J\u0010\u00104\u001a\u0002012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J!\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106*\u00020\u001d2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J-\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010>\u001a\u00020?H\u0000¢\u0006\u0002\b@J\u001d\u0010A\u001a\u00020B2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u00020B2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010E\u001a\u00020B2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010F\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106*\n\u0012\u0004\u0012\u00020G\u0018\u0001062\u0006\u00108\u001a\u000209H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/AdapterDelegatesHelper;", "", "<init>", "()V", "LABEL_ALPHA", "", "PENDING_ALPHA_FACTOR", "adjustSpacing", "", "itemView", "Landroid/view/View;", "position", "Lzendesk/core/ui/android/internal/model/MessagePosition;", "adjustSpacing$zendesk_messaging_messaging_android", "getCellDrawable", "", "shape", "Lzendesk/core/ui/android/internal/model/MessageShape;", "direction", "Lzendesk/core/ui/android/internal/model/MessageDirection;", "getCellDrawable$zendesk_messaging_messaging_android", "inboundCellDrawable", "outboundCellDrawable", "renderLabel", "labelView", "Landroid/widget/TextView;", "labelText", "", "messageContent", "Lzendesk/conversationkit/android/model/MessageContent;", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "renderLabel$zendesk_messaging_messaging_android", "renderAvatar", "avatarView", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "avatarUrl", "messageSize", "Lzendesk/messaging/android/internal/model/MessageSize;", "messageDirection", "renderAvatar$zendesk_messaging_messaging_android", "renderReceipt", "receiptView", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "receipt", "Lzendesk/messaging/android/internal/model/MessageReceipt;", "status", "Lzendesk/conversationkit/android/model/MessageStatus;", "showIcon", "", "isUnsupported", "renderReceipt$zendesk_messaging_messaging_android", "shouldShowNonContentViewComponents", "getCellActions", "", "Lzendesk/ui/android/conversation/actionbutton/ActionButton;", "context", "Landroid/content/Context;", "getCellActions$zendesk_messaging_messaging_android", "adjustDirectionAndWidth", "view", "content", "contentView", "Landroid/widget/LinearLayout;", "adjustDirectionAndWidth$zendesk_messaging_messaging_android", "getImageCellDirection", "Lzendesk/ui/android/conversation/imagecell/ImageCellDirection;", "getImageCellDirection$zendesk_messaging_messaging_android", "inboundImageCellDirection", "outboundImageCellDirection", "toListOfActionButton", "Lzendesk/conversationkit/android/model/MessageAction;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdapterDelegatesHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdapterDelegatesHelper.kt\nzendesk/messaging/android/internal/conversationscreen/delegates/AdapterDelegatesHelper\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n257#2,2:489\n257#2,2:491\n257#2,2:493\n257#2,2:495\n257#2,2:497\n257#2,2:499\n257#2,2:501\n808#3,11:503\n1617#3,9:514\n1869#3:523\n1870#3:525\n1626#3:526\n1#4:524\n*S KotlinDebug\n*F\n+ 1 AdapterDelegatesHelper.kt\nzendesk/messaging/android/internal/conversationscreen/delegates/AdapterDelegatesHelper\n*L\n121#1:489,2\n126#1:491,2\n156#1:493,2\n178#1:495,2\n217#1:497,2\n222#1:499,2\n299#1:501,2\n325#1:503,11\n455#1:514,9\n455#1:523\n455#1:525\n455#1:526\n455#1:524\n*E\n"})
public final class AdapterDelegatesHelper {

    @NotNull
    public static final AdapterDelegatesHelper INSTANCE = new AdapterDelegatesHelper();
    private static final float LABEL_ALPHA = 0.65f;
    private static final float PENDING_ALPHA_FACTOR = 0.66f;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MessagePosition.values().length];
            try {
                iArr[MessagePosition.STANDALONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagePosition.GROUP_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessagePosition.GROUP_MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessagePosition.GROUP_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MessageShape.values().length];
            try {
                iArr2[MessageShape.STANDALONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MessageShape.GROUP_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MessageShape.GROUP_MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MessageShape.GROUP_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MessageDirection.values().length];
            try {
                iArr3[MessageDirection.INBOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[MessageDirection.OUTBOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private AdapterDelegatesHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adjustDirectionAndWidth$lambda$7(int i11, LinearLayout.LayoutParams layoutParams) {
        layoutParams.getClass();
        layoutParams.setMarginEnd(i11);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adjustDirectionAndWidth$lambda$8(MessageDirection messageDirection, int i11, int i12, int i13, LinearLayout.LayoutParams layoutParams) {
        layoutParams.getClass();
        if (messageDirection == MessageDirection.INBOUND) {
            layoutParams.setMarginEnd(i11);
        } else {
            layoutParams.setMarginStart(i12);
            layoutParams.setMarginEnd(i13);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adjustDirectionAndWidth$lambda$9(MessageDirection messageDirection, int i11, int i12, int i13, LinearLayout.LayoutParams layoutParams) {
        layoutParams.getClass();
        if (messageDirection == MessageDirection.INBOUND) {
            layoutParams.setMarginEnd(i11);
        } else {
            layoutParams.setMarginStart(i12);
            layoutParams.setMarginEnd(i13);
        }
        return Unit.f26487a;
    }

    private final int inboundCellDrawable(MessageShape shape) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[shape.ordinal()];
        if (i11 == 1) {
            return R.drawable.zuia_message_cell_inbound_shape_single;
        }
        if (i11 == 2) {
            return R.drawable.zuia_message_cell_inbound_shape_top;
        }
        if (i11 == 3) {
            return R.drawable.zuia_message_cell_inbound_shape_middle;
        }
        if (i11 == 4) {
            return R.drawable.zuia_message_cell_inbound_shape_bottom;
        }
        a.f();
        return 0;
    }

    private final ImageCellDirection inboundImageCellDirection(MessageShape shape) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[shape.ordinal()];
        if (i11 == 1) {
            return ImageCellDirection.INBOUND_SINGLE;
        }
        if (i11 == 2) {
            return ImageCellDirection.INBOUND_TOP;
        }
        if (i11 == 3) {
            return ImageCellDirection.INBOUND_MIDDLE;
        }
        if (i11 == 4) {
            return ImageCellDirection.INBOUND_BOTTOM;
        }
        a.f();
        return null;
    }

    private final int outboundCellDrawable(MessageShape shape) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[shape.ordinal()];
        if (i11 == 1) {
            return R.drawable.zuia_message_cell_outbound_shape_single;
        }
        if (i11 == 2) {
            return R.drawable.zuia_message_cell_outbound_shape_top;
        }
        if (i11 == 3) {
            return R.drawable.zuia_message_cell_outbound_shape_middle;
        }
        if (i11 == 4) {
            return R.drawable.zuia_message_cell_outbound_shape_bottom;
        }
        a.f();
        return 0;
    }

    private final ImageCellDirection outboundImageCellDirection(MessageShape shape) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[shape.ordinal()];
        if (i11 == 1) {
            return ImageCellDirection.OUTBOUND_SINGLE;
        }
        if (i11 == 2) {
            return ImageCellDirection.OUTBOUND_TOP;
        }
        if (i11 == 3) {
            return ImageCellDirection.OUTBOUND_MIDDLE;
        }
        if (i11 == 4) {
            return ImageCellDirection.OUTBOUND_BOTTOM;
        }
        a.f();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvatarImageRendering renderAvatar$lambda$2$lambda$1(String str, MessagingTheme messagingTheme, AvatarImageRendering avatarImageRendering) {
        avatarImageRendering.getClass();
        return avatarImageRendering.toBuilder().state(new c(str, messagingTheme, 0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvatarImageState renderAvatar$lambda$2$lambda$1$lambda$0(String str, MessagingTheme messagingTheme, AvatarImageState avatarImageState) {
        avatarImageState.getClass();
        return AvatarImageState.copy$default(avatarImageState, Uri.parse(str), false, 0, Integer.valueOf(messagingTheme.getInboundMessageColor()), AvatarMask.CIRCLE, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageReceiptRendering renderReceipt$lambda$6(MessagingTheme messagingTheme, MessageReceipt messageReceipt, boolean z11, MessageDirection messageDirection, MessageStatus messageStatus, boolean z12, MessageReceiptRendering messageReceiptRendering) {
        messageReceiptRendering.getClass();
        return messageReceiptRendering.toBuilder().state(new hb0.a(messagingTheme, messageReceipt, z11, messageDirection, messageStatus, z12, 0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageReceiptState renderReceipt$lambda$6$lambda$5(MessagingTheme messagingTheme, MessageReceipt messageReceipt, boolean z11, MessageDirection messageDirection, MessageStatus messageStatus, boolean z12, MessageReceiptState messageReceiptState) {
        messageReceiptState.getClass();
        int iAdjustAlpha = ViewKtxKt.adjustAlpha(messagingTheme.getOnBackgroundColor(), 0.65f);
        int onErrorColor = messagingTheme.getOnErrorColor();
        MessageReceiptState.Builder builderShowIcon = messageReceiptState.toBuilder().label(messageReceipt.getLabel()).showIcon(z11);
        MessageDirection messageDirection2 = MessageDirection.INBOUND;
        if ((messageDirection == messageDirection2 && (messageStatus instanceof MessageStatus.Failed)) || ((messageDirection == messageDirection2 && z12) || (messageDirection == messageDirection2 && (messageStatus instanceof MessageStatus.DownloadFailed)))) {
            builderShowIcon.messageReceiptPosition(MessageReceiptPosition.INBOUND_FAILED);
            builderShowIcon.shouldAnimateReceipt(false);
            builderShowIcon.labelColor(onErrorColor);
            builderShowIcon.iconColor(onErrorColor);
        } else if (messageDirection == messageDirection2) {
            builderShowIcon.shouldAnimateReceipt(false);
            int inboundMessageColor = messagingTheme.getInboundMessageColor();
            builderShowIcon.messageReceiptPosition(MessageReceiptPosition.INBOUND);
            builderShowIcon.labelColor(iAdjustAlpha);
            builderShowIcon.iconColor(inboundMessageColor);
        } else {
            int messageColor = messagingTheme.getMessageColor();
            if (messageStatus instanceof MessageStatus.Pending) {
                builderShowIcon.messageReceiptPosition(MessageReceiptPosition.OUTBOUND_SENDING);
                builderShowIcon.shouldAnimateReceipt(true);
                builderShowIcon.labelColor(iAdjustAlpha);
                builderShowIcon.iconColor(ViewKtxKt.adjustAlpha(messageColor, 0.66f));
            } else if (messageStatus instanceof MessageStatus.Sent) {
                builderShowIcon.messageReceiptPosition(MessageReceiptPosition.OUTBOUND_SENT);
                builderShowIcon.shouldAnimateReceipt(false);
                builderShowIcon.labelColor(iAdjustAlpha);
                builderShowIcon.iconColor(messageColor);
            } else if ((messageStatus instanceof MessageStatus.Failed) || (messageStatus instanceof MessageStatus.DownloadFailed)) {
                builderShowIcon.messageReceiptPosition(MessageReceiptPosition.OUTBOUND_FAILED);
                builderShowIcon.shouldAnimateReceipt(false);
                builderShowIcon.labelColor(onErrorColor);
                builderShowIcon.iconColor(onErrorColor);
            } else {
                if (!(messageStatus instanceof MessageStatus.Downloading)) {
                    a.f();
                    return null;
                }
                builderShowIcon.showIcon(true);
                builderShowIcon.messageReceiptPosition(MessageReceiptPosition.OUTBOUND_SENT);
                builderShowIcon.shouldAnimateReceipt(false);
                builderShowIcon.labelColor(iAdjustAlpha);
                builderShowIcon.iconColor(messageColor);
            }
        }
        return builderShowIcon.getState();
    }

    private final boolean shouldShowNonContentViewComponents(MessageContent messageContent) {
        boolean z11;
        List<MessageAction> actions;
        MessageContent.Text text = messageContent instanceof MessageContent.Text ? (MessageContent.Text) messageContent : null;
        String text2 = text != null ? text.getText() : null;
        if (text2 == null) {
            text2 = "";
        }
        boolean z12 = text2.length() == 0;
        if (text == null || (actions = text.getActions()) == null) {
            z11 = false;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : actions) {
                if (obj instanceof MessageAction.Reply) {
                    arrayList.add(obj);
                }
            }
            z11 = !arrayList.isEmpty();
        }
        return (z12 && z11) ? false : true;
    }

    private final List<ActionButton> toListOfActionButton(List<? extends MessageAction> list, Context context) {
        ActionButton actionButton;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MessageAction messageAction : list) {
            if (messageAction instanceof MessageAction.Reply) {
                actionButton = null;
            } else if (messageAction instanceof MessageAction.Link) {
                MessageAction.Link link = (MessageAction.Link) messageAction;
                actionButton = new ActionButton(link.getText(), link.getUri(), null, false, "LINK_MESSAGE_ACTION", null, false, null, MessageSourceType.INSTANCE.findByValue(link.getSourceType().getValue()), 236, null);
            } else if (messageAction instanceof MessageAction.WebView) {
                MessageAction.WebView webView = (MessageAction.WebView) messageAction;
                actionButton = new ActionButton(webView.getText(), webView.getUri(), webView.getFallback(), false, "WEBVIEW_MESSAGE_ACTION", null, false, MessageActionSize.valueOf(webView.getSize().name()), MessageSourceType.INSTANCE.findByValue(webView.getSourceType().getValue()), 104, null);
            } else if (messageAction instanceof MessageAction.Postback) {
                MessageAction.Postback postback = (MessageAction.Postback) messageAction;
                actionButton = new ActionButton(postback.getText(), null, null, false, null, postback.getId(), false, null, null, 478, null);
            } else {
                String string = context.getString(R.string.zuia_option_not_supported);
                string.getClass();
                actionButton = new ActionButton(string, null, null, false, null, null, false, null, null, 502, null);
            }
            if (actionButton != null) {
                arrayList.add(actionButton);
            }
        }
        return arrayList;
    }

    public final void adjustDirectionAndWidth$zendesk_messaging_messaging_android(@NotNull View view, @NotNull MessageContent content, @NotNull final MessageDirection direction, @NotNull LinearLayout contentView) {
        view.getClass();
        content.getClass();
        direction.getClass();
        contentView.getClass();
        final int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.zuia_horizontal_spacing_small);
        final int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(zendesk.messaging.R.dimen.zma_cell_inbound_margin_end);
        final int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(zendesk.messaging.R.dimen.zma_cell_outbound_margin_end);
        view.setMinimumWidth(view.getResources().getDimensionPixelSize(zendesk.messaging.R.dimen.zma_message_cell_min_width));
        boolean z11 = content instanceof MessageContent.FileUpload;
        boolean z12 = z11 && ((MessageContent.FileUpload) content).isImageMimeType();
        if ((content instanceof MessageContent.Form) || (content instanceof MessageContent.FormResponse)) {
            ViewKtxKt.edgeToEdge(view, new y(dimensionPixelSize, 2));
            return;
        }
        if (content instanceof MessageContent.Carousel) {
            ViewKtxKt.edgeToEdge(view);
            return;
        }
        if ((content instanceof MessageContent.Image) || z12) {
            final int i11 = 0;
            ViewKtxKt.edgeToEdge(view, new Function1() { // from class: hb0.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            return AdapterDelegatesHelper.adjustDirectionAndWidth$lambda$8(direction, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize, (LinearLayout.LayoutParams) obj);
                        default:
                            return AdapterDelegatesHelper.adjustDirectionAndWidth$lambda$9(direction, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize, (LinearLayout.LayoutParams) obj);
                    }
                }
            });
        } else if ((content instanceof MessageContent.File) || z11 || (content instanceof MessageContent.Text) || (content instanceof MessageContent.Unsupported)) {
            final int i12 = 1;
            ViewKtxKt.wrap(view, new Function1() { // from class: hb0.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i12) {
                        case 0:
                            return AdapterDelegatesHelper.adjustDirectionAndWidth$lambda$8(direction, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize, (LinearLayout.LayoutParams) obj);
                        default:
                            return AdapterDelegatesHelper.adjustDirectionAndWidth$lambda$9(direction, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize, (LinearLayout.LayoutParams) obj);
                    }
                }
            });
            contentView.setGravity(direction == MessageDirection.OUTBOUND ? 8388613 : 8388611);
        }
    }

    public final void adjustSpacing$zendesk_messaging_messaging_android(@NotNull View itemView, @NotNull MessagePosition position) {
        itemView.getClass();
        position.getClass();
        int dimensionPixelSize = itemView.getResources().getDimensionPixelSize(R.dimen.zuia_vertical_spacing_small);
        int dimensionPixelSize2 = itemView.getResources().getDimensionPixelSize(R.dimen.zuia_vertical_spacing_large);
        int i11 = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i11 == 1) {
            dimensionPixelSize = dimensionPixelSize2;
        } else if (i11 != 2 && i11 != 3) {
            if (i11 != 4) {
                a.f();
                return;
            }
            dimensionPixelSize = dimensionPixelSize2;
        }
        itemView.setPaddingRelative(0, 0, 0, dimensionPixelSize);
    }

    @Nullable
    public final List<ActionButton> getCellActions$zendesk_messaging_messaging_android(@NotNull MessageContent messageContent, @NotNull Context context) {
        messageContent.getClass();
        context.getClass();
        if (messageContent instanceof MessageContent.Text) {
            return toListOfActionButton(((MessageContent.Text) messageContent).getActions(), context);
        }
        if (messageContent instanceof MessageContent.Image) {
            return toListOfActionButton(((MessageContent.Image) messageContent).getActions(), context);
        }
        return null;
    }

    public final int getCellDrawable$zendesk_messaging_messaging_android(@NotNull MessageShape shape, @NotNull MessageDirection direction) {
        shape.getClass();
        direction.getClass();
        return direction == MessageDirection.INBOUND ? inboundCellDrawable(shape) : outboundCellDrawable(shape);
    }

    @NotNull
    public final ImageCellDirection getImageCellDirection$zendesk_messaging_messaging_android(@NotNull MessageShape shape, @NotNull MessageDirection direction) {
        shape.getClass();
        direction.getClass();
        return direction == MessageDirection.INBOUND ? inboundImageCellDirection(shape) : outboundImageCellDirection(shape);
    }

    public final void renderAvatar$zendesk_messaging_messaging_android(@NotNull AvatarImageView avatarView, @Nullable String avatarUrl, @NotNull MessageContent messageContent, @NotNull MessageSize messageSize, @NotNull MessageDirection messageDirection, @NotNull MessagingTheme messagingTheme) {
        avatarView.getClass();
        messageContent.getClass();
        messageSize.getClass();
        messageDirection.getClass();
        messagingTheme.getClass();
        avatarView.setVisibility(shouldShowNonContentViewComponents(messageContent) ? 0 : 8);
        if (shouldShowNonContentViewComponents(messageContent)) {
            if (MessageSize.FULL_WIDTH == messageSize) {
                avatarView.setVisibility(8);
            } else if (avatarUrl == null) {
                avatarView.setVisibility(messageDirection == MessageDirection.INBOUND ? 4 : 8);
            } else {
                avatarView.render(new c(avatarUrl, messagingTheme, 1));
                avatarView.setVisibility(0);
            }
        }
    }

    public final void renderLabel$zendesk_messaging_messaging_android(@NotNull TextView labelView, @Nullable String labelText, @NotNull MessageContent messageContent, @NotNull MessagingTheme messagingTheme) {
        labelView.getClass();
        messageContent.getClass();
        messagingTheme.getClass();
        labelView.setVisibility(shouldShowNonContentViewComponents(messageContent) ? 0 : 8);
        if (shouldShowNonContentViewComponents(messageContent)) {
            labelView.setText(labelText);
            labelView.setVisibility(labelText == null || labelText.length() == 0 ? 8 : 0);
            labelView.setTextColor(ViewKtxKt.adjustAlpha(messagingTheme.getOnBackgroundColor(), 0.65f));
        }
    }

    public final void renderReceipt$zendesk_messaging_messaging_android(@NotNull MessageReceiptView receiptView, @Nullable MessageReceipt receipt, @NotNull MessageDirection direction, @NotNull MessageStatus status, boolean showIcon, boolean isUnsupported, @NotNull MessageContent messageContent, @NotNull MessagingTheme messagingTheme) {
        int i11;
        receiptView.getClass();
        direction.getClass();
        status.getClass();
        messageContent.getClass();
        messagingTheme.getClass();
        receiptView.setVisibility(shouldShowNonContentViewComponents(messageContent) ? 0 : 8);
        if (shouldShowNonContentViewComponents(messageContent)) {
            if (receipt == null) {
                receiptView.setVisibility(8);
                return;
            }
            receiptView.render(new hb0.a(messagingTheme, receipt, showIcon, direction, status, isUnsupported, 1));
            receiptView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = receiptView.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i12 = WhenMappings.$EnumSwitchMapping$2[direction.ordinal()];
            if (i12 == 1) {
                i11 = 8388611;
            } else {
                if (i12 != 2) {
                    a.f();
                    return;
                }
                i11 = 8388613;
            }
            layoutParams2.gravity = i11;
            receiptView.setLayoutParams(layoutParams2);
        }
    }
}
