package zendesk.messaging.android.internal.conversationscreen.delegates;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.r2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageItem;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessagePosition;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.CarouselContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogListenersKt;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessageSize;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.avatar.AvatarImageState;
import zendesk.ui.android.conversation.avatar.AvatarImageView;
import zendesk.ui.android.conversation.avatar.AvatarMask;
import zendesk.ui.android.conversation.carousel.CarouselAction;
import zendesk.ui.android.conversation.carousel.CarouselCellData;
import zendesk.ui.android.conversation.carousel.CarouselCellState;
import zendesk.ui.android.conversation.carousel.CarouselCellView;
import zendesk.ui.android.conversation.carousel.CarouselRendering;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B)\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J(\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00042\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001aH\u0014R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/CarouselContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$CarouselContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/CarouselContainerAdapterDelegate$ViewHolder;", "onCarouselAction", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCarouselAction;", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Lkotlin/jvm/functions/Function1;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getOnCarouselAction", "()Lkotlin/jvm/functions/Function1;", "setOnCarouselAction", "(Lkotlin/jvm/functions/Function1;)V", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "isForViewType", "", "item", "items", "", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "holder", "payloads", "", "ViewHolder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CarouselContainerAdapterDelegate extends ListItemAdapterDelegate<MessageLogEntry.CarouselContainer, MessageLogEntry, ViewHolder> {

    @NotNull
    private MessagingTheme messagingTheme;

    @NotNull
    private Function1<? super CarouselAction, Unit> onCarouselAction;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J¡\u0001\u0010\"\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u00162\b\b\u0001\u0010\u0019\u001a\u00020\u00162\b\b\u0001\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\u001b\u001a\u00020\u00162\b\b\u0001\u0010\u001c\u001a\u00020\u00162\b\b\u0001\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010\u001e\u001a\u00020\u00162\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0001\u0010 \u001a\u00020\u00162\b\b\u0001\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J9\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b)\u0010*J-\u0010+\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0004\b+\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/CarouselContainerAdapterDelegate$ViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "itemView", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "<init>", "(Landroid/view/View;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "Lzendesk/messaging/android/internal/model/MessageLogEntry$CarouselContainer;", "item", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnCarouselAction;", "onCarouselAction", "renderContent", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$CarouselContainer;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parentView", "Lzendesk/conversationkit/android/model/MessageContent$Carousel;", "content", "container", "", "navigationButtonColor", "navigationIconColor", "textColor", "inboundMessageColor", "buttonTextColor", "buttonDisabledTextColor", "focusedStateBorderColor", "cardColor", "carouselItemClickListener", "disabledBackgroundColor", "actionBackgroundColor", "createCarouselCell", "(Landroid/view/ViewGroup;Lzendesk/conversationkit/android/model/MessageContent$Carousel;Lzendesk/messaging/android/internal/model/MessageLogEntry$CarouselContainer;IIIIIIIILkotlin/jvm/functions/Function1;II)Landroid/view/View;", "Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "avatarImageState", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$CarouselContainer;I)Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "", "Lzendesk/ui/android/conversation/carousel/CarouselCellData$Item;", "mapActionsToCarouselItems", "(Landroid/view/ViewGroup;Lzendesk/conversationkit/android/model/MessageContent$Carousel;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "bind", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "Landroid/widget/TextView;", "labelView", "Landroid/widget/TextView;", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "avatarView", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "Landroid/widget/LinearLayout;", "contentView", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "receiptView", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCarouselContainerAdapterDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselContainerAdapterDelegate.kt\nzendesk/messaging/android/internal/conversationscreen/delegates/CarouselContainerAdapterDelegate$ViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,324:1\n1803#2,3:325\n1563#2:329\n1634#2,2:330\n1563#2:332\n1634#2,3:333\n1636#2:336\n29#3:328\n*S KotlinDebug\n*F\n+ 1 CarouselContainerAdapterDelegate.kt\nzendesk/messaging/android/internal/conversationscreen/delegates/CarouselContainerAdapterDelegate$ViewHolder\n*L\n219#1:325,3\n269#1:329\n269#1:330,2\n270#1:332\n270#1:333,3\n269#1:336\n255#1:328\n*E\n"})
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

        private final AvatarImageState avatarImageState(MessageLogEntry.CarouselContainer container, int inboundMessageColor) {
            if (container.getAvatarUrl() == null) {
                return null;
            }
            return new AvatarImageState(Uri.parse(container.getAvatarUrl()), false, 0, Integer.valueOf(inboundMessageColor), AvatarMask.CIRCLE, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final View createCarouselCell(final ViewGroup parentView, final MessageContent.Carousel content, final MessageLogEntry.CarouselContainer container, final int navigationButtonColor, final int navigationIconColor, final int textColor, final int inboundMessageColor, final int buttonTextColor, final int buttonDisabledTextColor, final int focusedStateBorderColor, final int cardColor, final Function1<? super CarouselAction, Unit> carouselItemClickListener, final int disabledBackgroundColor, final int actionBackgroundColor) {
            Context context = parentView.getContext();
            context.getClass();
            CarouselCellView carouselCellView = new CarouselCellView(context, null, 0, 6, null);
            Iterator it = d0.h(Integer.valueOf(R.dimen.zma_cell_inbound_margin_end), Integer.valueOf(zendesk.ui.android.R.dimen.zuia_horizontal_spacing_medium), Integer.valueOf(zendesk.ui.android.R.dimen.zuia_avatar_image_size)).iterator();
            final int dimensionPixelSize = 0;
            while (it.hasNext()) {
                dimensionPixelSize += parentView.getResources().getDimensionPixelSize(((Number) it.next()).intValue());
            }
            carouselCellView.render(new Function1() { // from class: hb0.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CarouselContainerAdapterDelegate.ViewHolder.createCarouselCell$lambda$2(container, navigationButtonColor, navigationIconColor, cardColor, textColor, dimensionPixelSize, inboundMessageColor, buttonTextColor, buttonDisabledTextColor, focusedStateBorderColor, disabledBackgroundColor, actionBackgroundColor, this, parentView, content, carouselItemClickListener, (CarouselCellState) obj);
                }
            });
            return carouselCellView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createCarouselCell$lambda$0(CarouselAction carouselAction) {
            carouselAction.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CarouselCellState createCarouselCell$lambda$2(MessageLogEntry.CarouselContainer carouselContainer, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, ViewHolder viewHolder, ViewGroup viewGroup, MessageContent.Carousel carousel, Function1 function1, CarouselCellState carouselCellState) {
            carouselCellState.getClass();
            return carouselCellState.copy(viewHolder.mapActionsToCarouselItems(viewGroup, carousel, function1), viewHolder.avatarImageState(carouselContainer, i16), new CarouselRendering(i11, i12, i13, i14, i15, i16, i17, i18, i19, carouselContainer.getPosition() == MessagePosition.GROUP_BOTTOM || carouselContainer.getPosition() == MessagePosition.STANDALONE, i21, i22));
        }

        private final List<CarouselCellData.Item> mapActionsToCarouselItems(ViewGroup parentView, MessageContent.Carousel content, Function1<? super CarouselAction, Unit> carouselItemClickListener) {
            Function1<? super CarouselAction, Unit> function1;
            Object unsupported;
            String string = parentView.getContext().getString(R.string.zuia_carousel_action_not_supported);
            string.getClass();
            List<MessageItem> items = content.getItems();
            ArrayList arrayList = new ArrayList(e0.o(items, 10));
            for (MessageItem messageItem : items) {
                List<MessageAction> actions = messageItem.getActions();
                ArrayList arrayList2 = new ArrayList(e0.o(actions, 10));
                for (MessageAction messageAction : actions) {
                    if (messageAction instanceof MessageAction.Link) {
                        MessageAction.Link link = (MessageAction.Link) messageAction;
                        function1 = carouselItemClickListener;
                        unsupported = new CarouselAction.Link(link.getId(), link.getText(), function1, link.getUri(), MessageSourceType.INSTANCE.findByValue(content.getSourceType().getValue()));
                    } else {
                        function1 = carouselItemClickListener;
                        if (messageAction instanceof MessageAction.Postback) {
                            MessageAction.Postback postback = (MessageAction.Postback) messageAction;
                            unsupported = new CarouselAction.Postback(postback.getId(), postback.getText(), function1, postback.isLoading());
                        } else if (messageAction instanceof MessageAction.WebView) {
                            MessageAction.WebView webView = (MessageAction.WebView) messageAction;
                            unsupported = new CarouselAction.WebView(webView.getId(), webView.getText(), function1, webView.getUri(), MessageActionSize.valueOf(webView.getSize().name()), MessageSourceType.INSTANCE.findByValue(content.getSourceType().getValue()));
                        } else {
                            unsupported = new CarouselAction.Unsupported(messageAction.getId(), string, function1);
                            arrayList2.add(unsupported);
                        }
                    }
                    arrayList2.add(unsupported);
                }
                arrayList.add(new CarouselCellData.Item(messageItem.getTitle(), messageItem.getDescription(), messageItem.getMediaUrl(), messageItem.getMediaType(), arrayList2));
            }
            return arrayList;
        }

        private final void renderContent(MessageLogEntry.CarouselContainer item, Function1<? super CarouselAction, Unit> onCarouselAction) {
            this.contentView.removeAllViews();
            LinearLayout linearLayout = this.contentView;
            MessageContent content = item.getMessage().getContent();
            content.getClass();
            View viewCreateCarouselCell = createCarouselCell(linearLayout, (MessageContent.Carousel) content, item, this.messagingTheme.getElevatedColor(), this.messagingTheme.getOnElevatedColor(), this.messagingTheme.getOnCardColor(), this.messagingTheme.getInboundMessageColor(), this.messagingTheme.getOnActionColor(), this.messagingTheme.getOnBackgroundColor(), this.messagingTheme.getOnBackgroundColor(), this.messagingTheme.getCardColor(), onCarouselAction, this.messagingTheme.getDisabledColor(), this.messagingTheme.getActionColor());
            AdapterDelegatesHelper.INSTANCE.adjustDirectionAndWidth$zendesk_messaging_messaging_android(viewCreateCarouselCell, item.getMessage().getContent(), item.getDirection(), this.contentView);
            this.contentView.addView(viewCreateCarouselCell);
        }

        public final void bind(@NotNull MessageLogEntry.CarouselContainer item, @NotNull Function1<? super CarouselAction, Unit> onCarouselAction) {
            item.getClass();
            onCarouselAction.getClass();
            if (MessageSize.FULL_WIDTH == item.getSize()) {
                this.avatarView.setVisibility(8);
            }
            AdapterDelegatesHelper adapterDelegatesHelper = AdapterDelegatesHelper.INSTANCE;
            adapterDelegatesHelper.renderLabel$zendesk_messaging_messaging_android(this.labelView, item.getLabel(), item.getMessage().getContent(), this.messagingTheme);
            renderContent(item, onCarouselAction);
            adapterDelegatesHelper.renderReceipt$zendesk_messaging_messaging_android(this.receiptView, item.getReceipt(), item.getDirection(), item.getStatus(), (item.getMessage().getContent() instanceof MessageContent.File) || (item.getMessage().getContent() instanceof MessageContent.FileUpload) || (item.getMessage().getContent() instanceof MessageContent.Unsupported) || (item.getMessage().getStatus() instanceof MessageStatus.Failed) || (item.getMessage().getStatus() instanceof MessageStatus.Downloading) || (item.getMessage().getStatus() instanceof MessageStatus.DownloadFailed), item.getMessage().getContent() instanceof MessageContent.Unsupported, item.getMessage().getContent(), this.messagingTheme);
            View view = this.itemView;
            view.getClass();
            adapterDelegatesHelper.adjustSpacing$zendesk_messaging_messaging_android(view, item.getPosition());
        }
    }

    public CarouselContainerAdapterDelegate(@NotNull Function1<? super CarouselAction, Unit> function1, @NotNull MessagingTheme messagingTheme) {
        function1.getClass();
        messagingTheme.getClass();
        this.onCarouselAction = function1;
        this.messagingTheme = messagingTheme;
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @NotNull
    public final Function1<CarouselAction, Unit> getOnCarouselAction() {
        return this.onCarouselAction;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public boolean isForViewType(@NotNull MessageLogEntry item, @NotNull List<? extends MessageLogEntry> items, int position) {
        item.getClass();
        items.getClass();
        return item instanceof MessageLogEntry.CarouselContainer;
    }

    public void onBindViewHolder(@NotNull MessageLogEntry.CarouselContainer item, @NotNull ViewHolder holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        holder.bind(item, this.onCarouselAction);
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

    public final void setOnCarouselAction(@NotNull Function1<? super CarouselAction, Unit> function1) {
        function1.getClass();
        this.onCarouselAction = function1;
    }

    public /* synthetic */ CarouselContainerAdapterDelegate(Function1 function1, MessagingTheme messagingTheme, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MessageLogListenersKt.getNOOP_ON_CAROUSEL_ACTION() : function1, messagingTheme);
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, r2 r2Var, List list) {
        onBindViewHolder((MessageLogEntry.CarouselContainer) obj, (ViewHolder) r2Var, (List<? extends Object>) list);
    }
}
