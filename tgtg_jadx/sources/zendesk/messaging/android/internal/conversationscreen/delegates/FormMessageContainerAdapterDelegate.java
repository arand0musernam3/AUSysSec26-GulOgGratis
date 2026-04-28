package zendesk.messaging.android.internal.conversationscreen.delegates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.r2;
import defpackage.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.RenderingUpdates;
import zendesk.messaging.android.internal.conversationscreen.delegates.FormMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogListenersKt;
import zendesk.messaging.android.internal.extension.ViewKtxKt;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.avatar.AvatarImageView;
import zendesk.ui.android.conversation.form.DisplayedField;
import zendesk.ui.android.conversation.form.DisplayedForm;
import zendesk.ui.android.conversation.form.FormRendering;
import zendesk.ui.android.conversation.form.FormResponseRendering;
import zendesk.ui.android.conversation.form.FormResponseView;
import zendesk.ui.android.conversation.form.FormView;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 92\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u000289B\u0085\u0001\u0012$\b\u0002\u0010\u0005\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fj\u0002`\u000e\u0012\u001e\b\u0002\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u0012\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00032\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010/\u001a\u000200H\u0014J\u0010\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u000203H\u0016J(\u00104\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00042\u000e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u0007H\u0014R6\u0010\u0005\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fj\u0002`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006:"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/FormMessageContainerAdapterDelegate;", "Lzendesk/messaging/android/internal/adapterdelegate/ListItemAdapterDelegate;", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "Lzendesk/messaging/android/internal/conversationscreen/delegates/FormMessageContainerAdapterDelegate$ViewHolder;", "onFormCompleted", "Lkotlin/Function2;", "", "Lzendesk/conversationkit/android/model/Field;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormCompleted;", "onFormFocusChangedListener", "Lkotlin/Function1;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormFocusChangedListener;", "onFormDisplayedFieldsChanged", "Lzendesk/ui/android/conversation/form/DisplayedField;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "mapOfDisplayedForm", "", "Lzendesk/ui/android/conversation/form/DisplayedForm;", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/util/Map;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getOnFormCompleted", "()Lkotlin/jvm/functions/Function2;", "setOnFormCompleted", "(Lkotlin/jvm/functions/Function2;)V", "getOnFormFocusChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnFormFocusChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "getOnFormDisplayedFieldsChanged", "setOnFormDisplayedFieldsChanged", "getMapOfDisplayedForm", "()Ljava/util/Map;", "setMapOfDisplayedForm", "(Ljava/util/Map;)V", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setMessagingTheme", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "isForViewType", "item", "items", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "holder", "payloads", "", "ViewHolder", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FormMessageContainerAdapterDelegate extends ListItemAdapterDelegate<MessageLogEntry.FormMessageContainer, MessageLogEntry, ViewHolder> {
    public static final float FORM_FIELD_BORDER_ALPHA = 0.55f;
    public static final float FORM_RESPONSE_BORDER_ALPHA = 0.12f;

    @NotNull
    private Map<String, DisplayedForm> mapOfDisplayedForm;

    @NotNull
    private MessagingTheme messagingTheme;

    @NotNull
    private Function2<? super List<? extends Field>, ? super MessageLogEntry.FormMessageContainer, Unit> onFormCompleted;

    @NotNull
    private Function2<? super DisplayedField, ? super String, Unit> onFormDisplayedFieldsChanged;

    @NotNull
    private Function1<? super Boolean, Unit> onFormFocusChangedListener;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0085\u0001\u0010\u001b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\"\u0010\u000f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\nj\u0002`\u000e2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\nj\u0002`\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"2\u0006\u0010\u001e\u001a\u00020\u001d2.\u0010!\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001f0\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001f` H\u0002¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u001c\u0010!\u001a\u0018\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\u0010j\b\u0012\u0004\u0012\u00020%` H\u0002¢\u0006\u0004\b'\u0010(J\u0083\u0001\u0010*\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\"\u0010\u000f\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\nj\u0002`\u000e2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010j\u0002`\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\nj\u0002`\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b*\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/delegates/FormMessageContainerAdapterDelegate$ViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "itemView", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "<init>", "(Landroid/view/View;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;", "item", "Lkotlin/Function2;", "", "Lzendesk/conversationkit/android/model/Field;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormCompleted;", "onFormCompleted", "Lkotlin/Function1;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormFocusChangedListener;", "onFormFocusChanged", "Lzendesk/ui/android/conversation/form/DisplayedField;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "onFormDisplayedFieldsChanged", "", "Lzendesk/ui/android/conversation/form/DisplayedForm;", "mapOfDisplayedForm", "renderContent", "(Lzendesk/messaging/android/internal/model/MessageLogEntry$FormMessageContainer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/util/Map;)V", "Landroid/view/ViewGroup;", "parentView", "Lzendesk/ui/android/conversation/form/FormRendering;", "Lzendesk/messaging/android/internal/conversationscreen/RenderingUpdate;", "renderingUpdate", "Lzendesk/ui/android/conversation/form/FormView;", "createFormView", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/form/FormView;", "Lzendesk/ui/android/conversation/form/FormResponseRendering;", "Lzendesk/ui/android/conversation/form/FormResponseView;", "createFormResponseView", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/form/FormResponseView;", "onFormFocusChangedListener", "bind", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "Landroid/widget/TextView;", "labelView", "Landroid/widget/TextView;", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "avatarView", "Lzendesk/ui/android/conversation/avatar/AvatarImageView;", "Landroid/widget/LinearLayout;", "contentView", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "receiptView", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        private final FormResponseView createFormResponseView(ViewGroup parentView, Function1<? super FormResponseRendering, FormResponseRendering> renderingUpdate) {
            Context context = parentView.getContext();
            context.getClass();
            FormResponseView formResponseView = new FormResponseView(context, null, 0, 0, 14, null);
            formResponseView.render(renderingUpdate);
            return formResponseView;
        }

        private final FormView<Field> createFormView(ViewGroup parentView, Function1<? super FormRendering<Field>, FormRendering<Field>> renderingUpdate) {
            Context context = parentView.getContext();
            context.getClass();
            FormView<Field> formView = new FormView<>(context, null, 0, 0, 14, null);
            formView.render(renderingUpdate);
            return formView;
        }

        private final void renderContent(final MessageLogEntry.FormMessageContainer item, final Function2<? super List<? extends Field>, ? super MessageLogEntry.FormMessageContainer, Unit> onFormCompleted, Function1<? super Boolean, Unit> onFormFocusChanged, Function2<? super DisplayedField, ? super String, Unit> onFormDisplayedFieldsChanged, Map<String, DisplayedForm> mapOfDisplayedForm) {
            String formId;
            List<Field> fields;
            View viewCreateFormView;
            this.contentView.removeAllViews();
            if (item.getMessage().getContent() instanceof MessageContent.FormResponse) {
                MessageContent content = item.getMessage().getContent();
                content.getClass();
                formId = ((MessageContent.FormResponse) content).getQuotedMessageId();
            } else {
                MessageContent content2 = item.getMessage().getContent();
                content2.getClass();
                formId = ((MessageContent.Form) content2).getFormId();
            }
            String str = formId;
            if (item.getMessage().getContent() instanceof MessageContent.FormResponse) {
                MessageContent content3 = item.getMessage().getContent();
                content3.getClass();
                fields = ((MessageContent.FormResponse) content3).getFields();
            } else {
                MessageContent content4 = item.getMessage().getContent();
                content4.getClass();
                fields = ((MessageContent.Form) content4).getFields();
            }
            List<Field> list = fields;
            MessageContent content5 = item.getMessage().getContent();
            if (content5 instanceof MessageContent.Form) {
                LinearLayout linearLayout = this.contentView;
                RenderingUpdates renderingUpdates = RenderingUpdates.INSTANCE;
                int actionColor = this.messagingTheme.getActionColor();
                boolean z11 = item.getMessage().getStatus() instanceof MessageStatus.Pending;
                int onErrorColor = this.messagingTheme.getOnErrorColor();
                final int i11 = 0;
                viewCreateFormView = createFormView(linearLayout, renderingUpdates.formRenderingUpdate(list, new Function1() { // from class: hb0.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i11) {
                            case 0:
                                return FormMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$0(onFormCompleted, item, (List) obj);
                            default:
                                return FormMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$2(onFormCompleted, item, (List) obj);
                        }
                    }
                }, new d(onFormFocusChanged, 13), actionColor, z11, onFormDisplayedFieldsChanged, mapOfDisplayedForm, str, this.messagingTheme.getOnActionColor(), onErrorColor, this.messagingTheme.getOnSecondaryAction(), ViewKtxKt.adjustAlpha(this.messagingTheme.getOnInputColor(), 0.55f), this.messagingTheme.getInputColor(), this.messagingTheme.getOnInputColor(), this.messagingTheme.getOnCardColor(), this.messagingTheme.getCardColor(), this.messagingTheme.getOnElevatedColor(), item.getMessage().getStatus() instanceof MessageStatus.Failed));
            } else {
                if (!(content5 instanceof MessageContent.FormResponse)) {
                    return;
                }
                MessageStatus status = item.getMessage().getStatus();
                if ((status instanceof MessageStatus.Pending) || (status instanceof MessageStatus.Failed)) {
                    LinearLayout linearLayout2 = this.contentView;
                    RenderingUpdates renderingUpdates2 = RenderingUpdates.INSTANCE;
                    int actionColor2 = this.messagingTheme.getActionColor();
                    boolean z12 = item.getMessage().getStatus() instanceof MessageStatus.Pending;
                    int onErrorColor2 = this.messagingTheme.getOnErrorColor();
                    int onActionColor = this.messagingTheme.getOnActionColor();
                    int onSecondaryAction = this.messagingTheme.getOnSecondaryAction();
                    int cardColor = this.messagingTheme.getCardColor();
                    final int i12 = 1;
                    viewCreateFormView = createFormView(linearLayout2, renderingUpdates2.formRenderingUpdate(list, new Function1() { // from class: hb0.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i12) {
                                case 0:
                                    return FormMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$0(onFormCompleted, item, (List) obj);
                                default:
                                    return FormMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$2(onFormCompleted, item, (List) obj);
                            }
                        }
                    }, new d(onFormFocusChanged, 14), actionColor2, z12, onFormDisplayedFieldsChanged, mapOfDisplayedForm, str, onActionColor, onErrorColor2, onSecondaryAction, ViewKtxKt.adjustAlpha(this.messagingTheme.getOnInputColor(), 0.55f), this.messagingTheme.getInputColor(), this.messagingTheme.getOnInputColor(), this.messagingTheme.getOnCardColor(), cardColor, this.messagingTheme.getOnElevatedColor(), item.getMessage().getStatus() instanceof MessageStatus.Failed));
                } else if (!(status instanceof MessageStatus.Sent)) {
                    return;
                } else {
                    viewCreateFormView = createFormResponseView(this.contentView, RenderingUpdates.INSTANCE.formResponseRenderingUpdate(list, ViewKtxKt.adjustAlpha(this.messagingTheme.getOnBackgroundColor(), 0.12f), this.messagingTheme.getCardColor(), this.messagingTheme.getOnCardColor()));
                }
            }
            AdapterDelegatesHelper.INSTANCE.adjustDirectionAndWidth$zendesk_messaging_messaging_android(viewCreateFormView, item.getMessage().getContent(), item.getDirection(), this.contentView);
            this.contentView.addView(viewCreateFormView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$0(Function2 function2, MessageLogEntry.FormMessageContainer formMessageContainer, List list) {
            list.getClass();
            function2.invoke(list, formMessageContainer);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$1(Function1 function1, boolean z11) {
            function1.invoke(Boolean.valueOf(z11));
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$2(Function2 function2, MessageLogEntry.FormMessageContainer formMessageContainer, List list) {
            list.getClass();
            function2.invoke(list, formMessageContainer);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit renderContent$lambda$3(Function1 function1, boolean z11) {
            function1.invoke(Boolean.valueOf(z11));
            return Unit.f26487a;
        }

        public final void bind(@NotNull MessageLogEntry.FormMessageContainer item, @NotNull Function2<? super List<? extends Field>, ? super MessageLogEntry.FormMessageContainer, Unit> onFormCompleted, @NotNull Function1<? super Boolean, Unit> onFormFocusChangedListener, @NotNull Function2<? super DisplayedField, ? super String, Unit> onFormDisplayedFieldsChanged, @NotNull Map<String, DisplayedForm> mapOfDisplayedForm) {
            item.getClass();
            onFormCompleted.getClass();
            onFormFocusChangedListener.getClass();
            onFormDisplayedFieldsChanged.getClass();
            mapOfDisplayedForm.getClass();
            AdapterDelegatesHelper adapterDelegatesHelper = AdapterDelegatesHelper.INSTANCE;
            adapterDelegatesHelper.renderLabel$zendesk_messaging_messaging_android(this.labelView, item.getLabel(), item.getMessage().getContent(), this.messagingTheme);
            adapterDelegatesHelper.renderAvatar$zendesk_messaging_messaging_android(this.avatarView, item.getAvatarUrl(), item.getMessage().getContent(), item.getSize(), item.getDirection(), this.messagingTheme);
            renderContent(item, onFormCompleted, onFormFocusChangedListener, onFormDisplayedFieldsChanged, mapOfDisplayedForm);
            adapterDelegatesHelper.renderReceipt$zendesk_messaging_messaging_android(this.receiptView, item.getReceipt(), item.getDirection(), item.getStatus(), (item.getMessage().getContent() instanceof MessageContent.Unsupported) || (item.getMessage().getStatus() instanceof MessageStatus.Failed), item.getMessage().getContent() instanceof MessageContent.Unsupported, item.getMessage().getContent(), this.messagingTheme);
            View view = this.itemView;
            view.getClass();
            adapterDelegatesHelper.adjustSpacing$zendesk_messaging_messaging_android(view, item.getPosition());
        }
    }

    public /* synthetic */ FormMessageContainerAdapterDelegate(Function2 function2, Function1 function1, Function2 function22, Map map, MessagingTheme messagingTheme, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? MessageLogListenersKt.getNOOP_ON_FORM_COMPLETED() : function2, (i11 & 2) != 0 ? MessageLogListenersKt.getNOOP_ON_FORM_FOCUS_CHANGED_LISTENER() : function1, (i11 & 4) != 0 ? MessageLogListenersKt.getNOOP_ON_FORM_DISPLAYED_FIELDS_CHANGED() : function22, (i11 & 8) != 0 ? new HashMap() : map, messagingTheme);
    }

    @NotNull
    public final Map<String, DisplayedForm> getMapOfDisplayedForm() {
        return this.mapOfDisplayedForm;
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @NotNull
    public final Function2<List<? extends Field>, MessageLogEntry.FormMessageContainer, Unit> getOnFormCompleted() {
        return this.onFormCompleted;
    }

    @NotNull
    public final Function2<DisplayedField, String, Unit> getOnFormDisplayedFieldsChanged() {
        return this.onFormDisplayedFieldsChanged;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFormFocusChangedListener() {
        return this.onFormFocusChangedListener;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public boolean isForViewType(@NotNull MessageLogEntry item, @NotNull List<? extends MessageLogEntry> items, int position) {
        item.getClass();
        items.getClass();
        return item instanceof MessageLogEntry.FormMessageContainer;
    }

    public void onBindViewHolder(@NotNull MessageLogEntry.FormMessageContainer item, @NotNull ViewHolder holder, @NotNull List<? extends Object> payloads) {
        item.getClass();
        holder.getClass();
        payloads.getClass();
        holder.bind(item, this.onFormCompleted, this.onFormFocusChangedListener, this.onFormDisplayedFieldsChanged, this.mapOfDisplayedForm);
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate, zendesk.messaging.android.internal.adapterdelegate.AdapterDelegate
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent) {
        parent.getClass();
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.zma_view_message_log_entry_message_container, parent, false);
        viewInflate.getClass();
        return new ViewHolder(viewInflate, this.messagingTheme);
    }

    public final void setMapOfDisplayedForm(@NotNull Map<String, DisplayedForm> map) {
        map.getClass();
        this.mapOfDisplayedForm = map;
    }

    public final void setMessagingTheme(@NotNull MessagingTheme messagingTheme) {
        messagingTheme.getClass();
        this.messagingTheme = messagingTheme;
    }

    public final void setOnFormCompleted(@NotNull Function2<? super List<? extends Field>, ? super MessageLogEntry.FormMessageContainer, Unit> function2) {
        function2.getClass();
        this.onFormCompleted = function2;
    }

    public final void setOnFormDisplayedFieldsChanged(@NotNull Function2<? super DisplayedField, ? super String, Unit> function2) {
        function2.getClass();
        this.onFormDisplayedFieldsChanged = function2;
    }

    public final void setOnFormFocusChangedListener(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.onFormFocusChangedListener = function1;
    }

    @Override // zendesk.messaging.android.internal.adapterdelegate.ListItemAdapterDelegate
    public /* bridge */ /* synthetic */ void onBindViewHolder(Object obj, r2 r2Var, List list) {
        onBindViewHolder((MessageLogEntry.FormMessageContainer) obj, (ViewHolder) r2Var, (List<? extends Object>) list);
    }

    public FormMessageContainerAdapterDelegate(@NotNull Function2<? super List<? extends Field>, ? super MessageLogEntry.FormMessageContainer, Unit> function2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function2<? super DisplayedField, ? super String, Unit> function22, @NotNull Map<String, DisplayedForm> map, @NotNull MessagingTheme messagingTheme) {
        function2.getClass();
        function1.getClass();
        function22.getClass();
        map.getClass();
        messagingTheme.getClass();
        this.onFormCompleted = function2;
        this.onFormFocusChangedListener = function1;
        this.onFormDisplayedFieldsChanged = function22;
        this.mapOfDisplayedForm = map;
        this.messagingTheme = messagingTheme;
    }
}
