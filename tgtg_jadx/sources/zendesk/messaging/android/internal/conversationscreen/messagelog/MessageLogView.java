package zendesk.messaging.android.internal.conversationscreen.messagelog;

import a3.l0;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EdgeEffect;
import androidx.activity.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.q1;
import androidx.recyclerview.widget.y0;
import androidx.recyclerview.widget.y1;
import h20.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import yi.a0;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.core.ui.android.internal.model.MessageDirection;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.conversationscreen.MessageListAdapter;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.messaging.android.internal.model.MessageLogType;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.common.buttonbanner.ButtonBannerRendering;
import zendesk.ui.android.common.buttonbanner.ButtonBannerState;
import zendesk.ui.android.common.buttonbanner.ButtonBannerView;
import zendesk.ui.android.common.buttonbanner.ButtonBannerViewType;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 :2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001:B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030 H\u0016J\u001f\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010#\u001a\u00020\tH\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001eH\u0002J\u001a\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\tH\u0002J\u001a\u0010(\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u00162\u0006\u0010)\u001a\u00020\tH\u0002J\f\u0010*\u001a\u00020\u001e*\u00020\u000eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0002J\"\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/H\u0002J\u0016\u00101\u001a\u00020\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002J\u0016\u00105\u001a\u00020\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002J\u0012\u00106\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0016\u00109\u001a\u00020\t2\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newMessagesView", "Lzendesk/ui/android/common/buttonbanner/ButtonBannerView;", "seeLatestView", "messageListAdapter", "Lzendesk/messaging/android/internal/conversationscreen/MessageListAdapter;", "rendering", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "verticalScrollOffset", "Ljava/util/concurrent/atomic/AtomicInteger;", "isFormFocused", "", "isNewMessagesClicked", "firstUnreadMessagePosition", "render", "", "renderingUpdate", "Lkotlin/Function1;", "isQuickReplyAtBottomOfList", "lastVisibleItemPosition", "lastMessagePosition", "(Ljava/lang/Integer;I)Z", "hideSeeLatestView", "scrollToBottom", "linearLayoutManager", "fastSmoothScrollToBottom", "messagePosition", "onScrollToBottomIfKeyboardShown", "announceNewMessageContentForAccessibility", "announceAccessibilityText", "accessibilityStringResId", "authorName", "", "accessibilitySubText", "showNewMessagesViewIfNeeded", "messageList", "", "Lzendesk/messaging/android/internal/model/MessageLogEntry;", "showSeeLatestViewIfNeeded", "updateScrollingBehaviourOnFocusChange", "newFocus", "Landroid/view/View;", "getNewMessagesDividerPosition", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageLogView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageLogView.kt\nzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n255#2:713\n255#2:721\n255#2:722\n67#2,4:726\n37#2,2:730\n55#2:732\n72#2:733\n67#2,4:734\n37#2,2:738\n55#2:740\n72#2:741\n774#3:714\n865#3,2:715\n1563#3:717\n1634#3,3:718\n1878#3,3:723\n*S KotlinDebug\n*F\n+ 1 MessageLogView.kt\nzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogView\n*L\n286#1:713\n496#1:721\n585#1:722\n214#1:726,4\n214#1:730,2\n214#1:732\n214#1:733\n232#1:734,4\n232#1:738,2\n232#1:740\n232#1:741\n361#1:714\n361#1:715,2\n432#1:717\n432#1:718,3\n671#1:723,3\n*E\n"})
public final class MessageLogView extends ConstraintLayout implements Renderer<MessageLogRendering> {

    @Deprecated
    @NotNull
    public static final String COMMA_SEPARATOR = ",";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAXIMUM_MESSAGES_NUMBER = 100;

    @Deprecated
    public static final long NEW_MESSAGE_VIEW_DELAY = 1500;

    @Deprecated
    public static final int NO_UNREAD_MESSAGES_EXIST = -1;

    @Deprecated
    public static final int OFFSET_WITH_EMPTY_MESSAGE = 2;

    @Deprecated
    public static final int OFFSET_WITH_NONEMPTY_MESSAGE = 1;

    @Deprecated
    public static final int OFFSET_WITH_REGULAR_MESSAGE = 1;

    @Deprecated
    public static final int ONE_HUNDRED_OR_MORE_UNREAD_MESSAGES = 0;

    @Deprecated
    public static final int SECOND_LAST_MESSAGE = 2;

    @Deprecated
    @NotNull
    public static final String TAG = "MessageLogView";

    @NotNull
    private final AtomicInteger firstUnreadMessagePosition;
    private boolean isFormFocused;
    private boolean isNewMessagesClicked;

    @NotNull
    private LinearLayoutManager layoutManager;

    @NotNull
    private final MessageListAdapter messageListAdapter;

    @NotNull
    private final ButtonBannerView newMessagesView;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private MessageLogRendering rendering;

    @NotNull
    private final ButtonBannerView seeLatestView;

    @NotNull
    private final AtomicInteger verticalScrollOffset;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"zendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogView$2", "Landroidx/recyclerview/widget/c2;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "dx", "dy", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "state", "Ljava/util/concurrent/atomic/AtomicInteger;", "getState", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setState", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMessageLogView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageLogView.kt\nzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogView$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,712:1\n255#2:713\n*S KotlinDebug\n*F\n+ 1 MessageLogView.kt\nzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogView$2\n*L\n126#1:713\n*E\n"})
    public static final class AnonymousClass2 extends c2 {
        private AtomicInteger state = new AtomicInteger(0);

        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ButtonBannerRendering onScrolled$lambda$1(MessageLogView messageLogView, ButtonBannerRendering buttonBannerRendering) {
            buttonBannerRendering.getClass();
            return buttonBannerRendering.toBuilder().state(new a(messageLogView, 10)).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ButtonBannerState onScrolled$lambda$1$lambda$0(MessageLogView messageLogView, ButtonBannerState buttonBannerState) {
            buttonBannerState.getClass();
            return ButtonBannerState.copy$default(buttonBannerState, ButtonBannerViewType.NEW_MESSAGES, null, Boolean.FALSE, Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getElevatedColor()), null, null, false, 450, null);
        }

        public final AtomicInteger getState() {
            return this.state;
        }

        @Override // androidx.recyclerview.widget.c2
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            this.state.compareAndSet(0, newState);
            if (newState == 0) {
                if (this.state.compareAndSet(2, newState)) {
                    return;
                }
                this.state.compareAndSet(1, newState);
            } else if (newState == 1) {
                this.state.compareAndSet(0, newState);
            } else {
                if (newState != 2) {
                    return;
                }
                this.state.compareAndSet(1, newState);
            }
        }

        @Override // androidx.recyclerview.widget.c2
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            recyclerView.getClass();
            if (this.state.get() != 0) {
                MessageLogView.this.verticalScrollOffset.getAndAdd(dy2);
                MessageLogView.this.rendering.getOnLoadMoreListener$zendesk_messaging_messaging_android().invoke(Boolean.valueOf(MessageLogView.this.layoutManager.findFirstCompletelyVisibleItemPosition() == 0));
                MessageLogView.this.hideSeeLatestView();
                if (MessageLogView.this.firstUnreadMessagePosition.get() == MessageLogView.this.layoutManager.findFirstVisibleItemPosition() && MessageLogView.this.newMessagesView.getVisibility() == 0) {
                    MessageLogView.this.newMessagesView.render(new a(MessageLogView.this, 9));
                    MessageLogView.this.isNewMessagesClicked = true;
                }
            }
        }

        public final void setState(AtomicInteger atomicInteger) {
            atomicInteger.getClass();
            this.state = atomicInteger;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageLogView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new MessageLogRendering();
        this.layoutManager = new LinearLayoutManager(context, 1, false);
        this.verticalScrollOffset = new AtomicInteger(0);
        this.firstUnreadMessagePosition = new AtomicInteger(0);
        View.inflate(context, R.layout.zma_view_message_log, this);
        View viewFindViewById = findViewById(R.id.zma_message_list_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.recyclerView = recyclerView;
        View viewFindViewById2 = findViewById(R.id.zma_message_list_new_messages_view);
        viewFindViewById2.getClass();
        this.newMessagesView = (ButtonBannerView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zma_message_list_see_latest_view);
        viewFindViewById3.getClass();
        this.seeLatestView = (ButtonBannerView) viewFindViewById3;
        MessageListAdapter messageListAdapter = new MessageListAdapter(null, null, null, null, null, null, null, null, null, 511, null);
        this.messageListAdapter = messageListAdapter;
        recyclerView.setAdapter(messageListAdapter);
        recyclerView.setLayoutManager(this.layoutManager);
        messageListAdapter.setStateRestorationPolicy(k1.PREVENT_WHEN_EMPTY);
        recyclerView.addOnLayoutChangeListener(new e(this, 2));
        recyclerView.k(new AnonymousClass2());
        recyclerView.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: zendesk.messaging.android.internal.conversationscreen.messagelog.b
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                this.f47696a.updateScrollingBehaviourOnFocusChange(view2);
            }
        });
        render(new o(13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MessageLogView messageLogView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (messageLogView.isFormFocused) {
            return;
        }
        int i19 = i18 - i14;
        if (Math.abs(i19) > 0) {
            if (i19 > 0 || Math.abs(messageLogView.verticalScrollOffset.get()) >= Math.abs(i19)) {
                messageLogView.recyclerView.scrollBy(0, Math.abs(i19));
            } else {
                messageLogView.recyclerView.scrollBy(0, messageLogView.verticalScrollOffset.get());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageLogRendering _init_$lambda$2(MessageLogRendering messageLogRendering) {
        messageLogRendering.getClass();
        return messageLogRendering;
    }

    private final void announceAccessibilityText(int accessibilityStringResId, String authorName, String accessibilitySubText) {
        String string = this.recyclerView.getContext().getString(accessibilityStringResId, authorName);
        string.getClass();
        if (accessibilitySubText.length() > 0) {
            string = k.m(string, " ", accessibilitySubText);
        }
        ViewCompat.d0(this.recyclerView, string);
    }

    public static /* synthetic */ void announceAccessibilityText$default(MessageLogView messageLogView, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        messageLogView.announceAccessibilityText(i11, str, str2);
    }

    private final void announceNewMessageContentForAccessibility() {
        String altText;
        String text;
        String text2;
        List<MessageLogEntry> messageLogEntryList$zendesk_messaging_messaging_android = this.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android();
        ArrayList arrayList = new ArrayList();
        for (Object obj : messageLogEntryList$zendesk_messaging_messaging_android) {
            MessageLogEntry messageLogEntry = (MessageLogEntry) obj;
            if ((messageLogEntry instanceof MessageLogEntry.TextMessageContainer) || (messageLogEntry instanceof MessageLogEntry.ImageMessageContainer) || (messageLogEntry instanceof MessageLogEntry.FileMessageContainer) || (messageLogEntry instanceof MessageLogEntry.FormMessageContainer) || (messageLogEntry instanceof MessageLogEntry.QuickReply) || (messageLogEntry instanceof MessageLogEntry.CarouselContainer)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty() && this.rendering.getState().getShouldAnnounceMessage$zendesk_messaging_messaging_android()) {
            MessageLogEntry messageLogEntry2 = (MessageLogEntry) CollectionsKt.W(arrayList);
            String str = "";
            if (messageLogEntry2 instanceof MessageLogEntry.TextMessageContainer) {
                MessageLogEntry.TextMessageContainer textMessageContainer = (MessageLogEntry.TextMessageContainer) messageLogEntry2;
                if (textMessageContainer.getDirection() == MessageDirection.INBOUND) {
                    int i11 = zendesk.ui.android.R.string.zuia_new_content_change_accessibility_label;
                    String displayName = textMessageContainer.getMessage().getAuthor().getDisplayName();
                    MessageContent content = textMessageContainer.getMessage().getContent();
                    MessageContent.Text text3 = content instanceof MessageContent.Text ? (MessageContent.Text) content : null;
                    if (text3 != null && (text2 = text3.getText()) != null) {
                        str = text2;
                    }
                    announceAccessibilityText(i11, displayName, str);
                }
            } else if (messageLogEntry2 instanceof MessageLogEntry.ImageMessageContainer) {
                MessageLogEntry.ImageMessageContainer imageMessageContainer = (MessageLogEntry.ImageMessageContainer) messageLogEntry2;
                if (imageMessageContainer.getDirection() == MessageDirection.INBOUND) {
                    MessageContent content2 = imageMessageContainer.getMessage().getContent();
                    MessageContent.Image image = content2 instanceof MessageContent.Image ? (MessageContent.Image) content2 : null;
                    if (image == null || (text = image.getText()) == null || text.length() <= 0) {
                        announceAccessibilityText(zendesk.ui.android.R.string.zuia_accessibility_image_message_received_announcement, imageMessageContainer.getMessage().getAuthor().getDisplayName(), "");
                        return;
                    }
                    Context context = this.recyclerView.getContext();
                    int i12 = zendesk.ui.android.R.string.zuia_accessibility_image_and_text_message_received_announcement;
                    String displayName2 = imageMessageContainer.getMessage().getAuthor().getDisplayName();
                    MessageContent content3 = imageMessageContainer.getMessage().getContent();
                    MessageContent.Image image2 = content3 instanceof MessageContent.Image ? (MessageContent.Image) content3 : null;
                    String string = context.getString(i12, displayName2, image2 != null ? image2.getText() : null);
                    string.getClass();
                    ViewCompat.d0(this.recyclerView, string);
                }
            } else if (messageLogEntry2 instanceof MessageLogEntry.FileMessageContainer) {
                MessageLogEntry.FileMessageContainer fileMessageContainer = (MessageLogEntry.FileMessageContainer) messageLogEntry2;
                if (fileMessageContainer.getDirection() == MessageDirection.INBOUND) {
                    int i13 = zendesk.ui.android.R.string.zuia_accessibility_file_message_received_announcement;
                    String displayName3 = fileMessageContainer.getMessage().getAuthor().getDisplayName();
                    MessageContent content4 = fileMessageContainer.getMessage().getContent();
                    MessageContent.File file = content4 instanceof MessageContent.File ? (MessageContent.File) content4 : null;
                    if (file != null && (altText = file.getAltText()) != null) {
                        str = altText;
                    }
                    announceAccessibilityText(i13, displayName3, str);
                }
            } else {
                if (!(messageLogEntry2 instanceof MessageLogEntry.FormMessageContainer)) {
                    if (!(messageLogEntry2 instanceof MessageLogEntry.QuickReply)) {
                        if (messageLogEntry2 instanceof MessageLogEntry.CarouselContainer) {
                            MessageLogEntry.CarouselContainer carouselContainer = (MessageLogEntry.CarouselContainer) messageLogEntry2;
                            if (carouselContainer.getDirection() == MessageDirection.INBOUND && (carouselContainer.getMessage().getContent() instanceof MessageContent.Carousel)) {
                                Resources resources = getContext().getResources();
                                int i14 = zendesk.ui.android.R.plurals.carouselArticles;
                                MessageContent content5 = carouselContainer.getMessage().getContent();
                                content5.getClass();
                                int size = ((MessageContent.Carousel) content5).getItems().size();
                                String displayName4 = carouselContainer.getMessage().getAuthor().getDisplayName();
                                MessageContent content6 = carouselContainer.getMessage().getContent();
                                content6.getClass();
                                String quantityString = resources.getQuantityString(i14, size, displayName4, Integer.valueOf(((MessageContent.Carousel) content6).getItems().size()));
                                quantityString.getClass();
                                ViewCompat.d0(this.recyclerView, quantityString);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    String string2 = this.recyclerView.getContext().getString(zendesk.ui.android.R.string.zuia_accessibility_quick_replies_available_actions_announcement);
                    string2.getClass();
                    String string3 = this.recyclerView.getContext().getString(zendesk.ui.android.R.string.zuia_quick_reply_button_accessibility_label);
                    string3.getClass();
                    MessageLogEntry messageLogEntry3 = (MessageLogEntry) CollectionsKt.Q(arrayList.size() - 2, arrayList);
                    if ((messageLogEntry3 instanceof MessageLogEntry.TextMessageContainer ? (MessageLogEntry.TextMessageContainer) messageLogEntry3 : null) != null) {
                        MessageContent content7 = ((MessageLogEntry.TextMessageContainer) messageLogEntry3).getMessage().getContent();
                        MessageContent.Text text4 = content7 instanceof MessageContent.Text ? (MessageContent.Text) content7 : null;
                        string2 = (text4 != null ? text4.getText() : null) + " " + ((Object) string2);
                    }
                    List<MessageAction.Reply> replies = ((MessageLogEntry.QuickReply) messageLogEntry2).getReplies();
                    ArrayList arrayList2 = new ArrayList(e0.o(replies, 10));
                    Iterator<T> it = replies.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((MessageAction.Reply) it.next()).getText() + " " + string3);
                    }
                    ViewCompat.d0(this.recyclerView, ((Object) string2) + CollectionsKt.U(arrayList2, COMMA_SEPARATOR, null, null, null, 62));
                    return;
                }
                MessageLogEntry.FormMessageContainer formMessageContainer = (MessageLogEntry.FormMessageContainer) messageLogEntry2;
                if (formMessageContainer.getDirection() == MessageDirection.INBOUND) {
                    announceAccessibilityText$default(this, zendesk.ui.android.R.string.zuia_accessibility_form_message_received_announcement, formMessageContainer.getMessage().getAuthor().getDisplayName(), null, 4, null);
                }
            }
        }
    }

    private final void fastSmoothScrollToBottom(LinearLayoutManager linearLayoutManager, int messagePosition) {
        final Context context = this.recyclerView.getContext();
        final int i11 = -1;
        y0 y0Var = new y0(context) { // from class: zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView$fastSmoothScrollToBottom$smoothScroller$1
            @Override // androidx.recyclerview.widget.y0
            /* JADX INFO: renamed from: getHorizontalSnapPreference, reason: from getter */
            public int get$snapMode() {
                return i11;
            }

            @Override // androidx.recyclerview.widget.y0
            public int getVerticalSnapPreference() {
                return i11;
            }
        };
        y0Var.setTargetPosition(messagePosition);
        if (linearLayoutManager != null) {
            linearLayoutManager.startSmoothScroll(y0Var);
        }
    }

    private final int getNewMessagesDividerPosition(List<? extends MessageLogEntry> messageList) {
        if (this.firstUnreadMessagePosition.get() == -1) {
            return -1;
        }
        y1 layoutManager = this.recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0;
        int i11 = 0;
        for (Object obj : messageList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            MessageLogEntry messageLogEntry = (MessageLogEntry) obj;
            if ((messageLogEntry instanceof MessageLogEntry.MessagesDivider) && ((MessageLogEntry.MessagesDivider) messageLogEntry).getType() == MessageLogType.NewMessagesDivider) {
                if (i11 == 0) {
                    this.firstUnreadMessagePosition.set(0);
                    return 0;
                }
                if (iFindFirstVisibleItemPosition > i11) {
                    this.firstUnreadMessagePosition.set(i11);
                    return i11;
                }
            }
            i11 = i12;
        }
        this.firstUnreadMessagePosition.set(-1);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSeeLatestView() {
        if (this.layoutManager.findLastVisibleItemPosition() == this.messageListAdapter.getItemCount() - 1 && this.seeLatestView.getVisibility() == 0) {
            this.seeLatestView.render(new a(this, 5));
            this.rendering.getOnSeeLatestClickedListener$zendesk_messaging_messaging_android().invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerRendering hideSeeLatestView$lambda$9(MessageLogView messageLogView, ButtonBannerRendering buttonBannerRendering) {
        buttonBannerRendering.getClass();
        return buttonBannerRendering.toBuilder().state(new a(messageLogView, 6)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerState hideSeeLatestView$lambda$9$lambda$8(MessageLogView messageLogView, ButtonBannerState buttonBannerState) {
        buttonBannerState.getClass();
        return ButtonBannerState.copy$default(buttonBannerState, ButtonBannerViewType.SEE_LATEST, null, Boolean.FALSE, Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getElevatedColor()), null, null, false, 450, null);
    }

    private final boolean isQuickReplyAtBottomOfList(Integer lastVisibleItemPosition, int lastMessagePosition) {
        if (lastVisibleItemPosition == null) {
            return false;
        }
        int iIntValue = lastVisibleItemPosition.intValue();
        return iIntValue == lastMessagePosition || iIntValue == lastMessagePosition + (-1) || iIntValue == lastMessagePosition + (-2);
    }

    private final void onScrollToBottomIfKeyboardShown(RecyclerView recyclerView) {
        ViewKt.onKeyboardShown(recyclerView, new yl.e(6, recyclerView, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onScrollToBottomIfKeyboardShown$lambda$14(RecyclerView recyclerView, MessageLogView messageLogView) {
        l1 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount() - 1;
            y1 layoutManager = recyclerView.getLayoutManager();
            messageLogView.scrollToBottom(layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null, itemCount);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$6$lambda$5(final MessageLogView messageLogView) {
        int size = messageLogView.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android().size();
        int i11 = size - 1;
        MessageLogEntry messageLogEntry = (MessageLogEntry) CollectionsKt.X(messageLogView.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android());
        int i12 = size - 2;
        MessageLogEntry messageLogEntry2 = (MessageLogEntry) CollectionsKt.Q(i12, messageLogView.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android());
        y1 layoutManager = messageLogView.recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()) : null;
        if ((((messageLogEntry instanceof MessageLogEntry.QuickReply) && (messageLogEntry2 instanceof MessageLogEntry.TextMessageContainer)) ? messageLogView.isQuickReplyAtBottomOfList(numValueOf, i11) : numValueOf != null && numValueOf.intValue() == i12) || messageLogView.rendering.getState().getShouldScrollToBottom$zendesk_messaging_messaging_android()) {
            messageLogView.scrollToBottom(linearLayoutManager, i11);
            RecyclerView recyclerView = messageLogView.recyclerView;
            if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView$render$lambda$6$lambda$5$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        if (this.this$0.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android().isEmpty()) {
                            return;
                        }
                        this.this$0.recyclerView.postDelayed(new MessageLogView$render$2$1$1$1(this.this$0), MessageLogView.NEW_MESSAGE_VIEW_DELAY);
                    }
                });
            } else if (!messageLogView.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android().isEmpty()) {
                messageLogView.recyclerView.postDelayed(new MessageLogView$render$2$1$1$1(messageLogView), NEW_MESSAGE_VIEW_DELAY);
            }
        } else {
            RecyclerView recyclerView2 = messageLogView.recyclerView;
            if (!recyclerView2.isLaidOut() || recyclerView2.isLayoutRequested()) {
                recyclerView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView$render$lambda$6$lambda$5$$inlined$doOnLayout$2
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        if (!this.this$0.rendering.getState().getShouldSeeLatestViewVisible$zendesk_messaging_messaging_android() || this.this$0.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android().isEmpty()) {
                            return;
                        }
                        this.this$0.recyclerView.postDelayed(new MessageLogView$render$2$1$2$1(this.this$0), MessageLogView.NEW_MESSAGE_VIEW_DELAY);
                    }
                });
            } else if (messageLogView.rendering.getState().getShouldSeeLatestViewVisible$zendesk_messaging_messaging_android() && !messageLogView.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android().isEmpty()) {
                messageLogView.recyclerView.postDelayed(new MessageLogView$render$2$1$2$1(messageLogView), NEW_MESSAGE_VIEW_DELAY);
            }
        }
        messageLogView.announceNewMessageContentForAccessibility();
    }

    private final void scrollToBottom(LinearLayoutManager linearLayoutManager, int lastMessagePosition) {
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPosition(lastMessagePosition);
            post(new l(linearLayoutManager, lastMessagePosition, this, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToBottom$lambda$12$lambda$11(LinearLayoutManager linearLayoutManager, int i11, MessageLogView messageLogView) {
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i11);
        if (viewFindViewByPosition != null) {
            linearLayoutManager.scrollToPositionWithOffset(i11, messageLogView.getMeasuredHeight() - viewFindViewByPosition.getMeasuredHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNewMessagesViewIfNeeded(List<? extends MessageLogEntry> messageList) {
        int iFindLastVisibleItemPosition;
        y1 layoutManager = this.recyclerView.getLayoutManager();
        layoutManager.getClass();
        if (((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() > 0) {
            y1 layoutManager2 = this.recyclerView.getLayoutManager();
            layoutManager2.getClass();
            iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager2).findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        MessageLogEntry messageLogEntry = messageList.get(iFindLastVisibleItemPosition);
        MessageDirection direction = messageLogEntry instanceof MessageLogEntry.MessageContainer ? ((MessageLogEntry.MessageContainer) messageLogEntry).getDirection() : null;
        if (this.newMessagesView.getVisibility() == 0 && direction == MessageDirection.OUTBOUND) {
            this.newMessagesView.render(new a(this, 0));
            this.isNewMessagesClicked = true;
        }
        int newMessagesDividerPosition = getNewMessagesDividerPosition(messageList);
        int size = newMessagesDividerPosition != -1 ? newMessagesDividerPosition != 0 ? (messageList.size() - 1) - newMessagesDividerPosition : 100 : 0;
        if (this.isNewMessagesClicked || size <= 0) {
            return;
        }
        this.newMessagesView.render(new q(this, newMessagesDividerPosition, size, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerRendering showNewMessagesViewIfNeeded$lambda$19(MessageLogView messageLogView, ButtonBannerRendering buttonBannerRendering) {
        buttonBannerRendering.getClass();
        return buttonBannerRendering.toBuilder().state(new a(messageLogView, 4)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerState showNewMessagesViewIfNeeded$lambda$19$lambda$18(MessageLogView messageLogView, ButtonBannerState buttonBannerState) {
        buttonBannerState.getClass();
        return ButtonBannerState.copy$default(buttonBannerState, ButtonBannerViewType.NEW_MESSAGES, null, Boolean.FALSE, Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getElevatedColor()), null, null, false, 450, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerRendering showNewMessagesViewIfNeeded$lambda$23(MessageLogView messageLogView, int i11, int i12, ButtonBannerRendering buttonBannerRendering) {
        buttonBannerRendering.getClass();
        return buttonBannerRendering.toBuilder().onViewClicked(new l0(messageLogView, i11, 11)).onViewDismissed(new y.a(messageLogView, 20)).state(new b3.q(i12, messageLogView, 7)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showNewMessagesViewIfNeeded$lambda$23$lambda$20(MessageLogView messageLogView, int i11) {
        LinearLayoutManager linearLayoutManager = messageLogView.layoutManager;
        if (linearLayoutManager == null) {
            linearLayoutManager = null;
        }
        messageLogView.fastSmoothScrollToBottom(linearLayoutManager, i11);
        messageLogView.isNewMessagesClicked = true;
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showNewMessagesViewIfNeeded$lambda$23$lambda$21(MessageLogView messageLogView) {
        messageLogView.isNewMessagesClicked = true;
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerState showNewMessagesViewIfNeeded$lambda$23$lambda$22(int i11, MessageLogView messageLogView, ButtonBannerState buttonBannerState) {
        buttonBannerState.getClass();
        return ButtonBannerState.copy$default(buttonBannerState, ButtonBannerViewType.NEW_MESSAGES, i11 == 100 ? messageLogView.getContext().getString(R.string.zuia_new_messages_nighty_night_plus_label) : messageLogView.getContext().getString(R.string.zuia_new_messages_label, Integer.valueOf(i11)), Boolean.TRUE, Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getElevatedColor()), null, null, false, 448, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSeeLatestViewIfNeeded(List<? extends MessageLogEntry> messageList) {
        int iFindLastVisibleItemPosition;
        y1 layoutManager = this.recyclerView.getLayoutManager();
        layoutManager.getClass();
        if (((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() > 0) {
            y1 layoutManager2 = this.recyclerView.getLayoutManager();
            layoutManager2.getClass();
            iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager2).findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        if (Intrinsics.areEqual(messageList.get(iFindLastVisibleItemPosition), CollectionsKt.W(messageList))) {
            this.seeLatestView.render(new a(this, 2));
            this.rendering.getOnSeeLatestClickedListener$zendesk_messaging_messaging_android().invoke();
        } else {
            if (this.newMessagesView.getVisibility() == 0) {
                this.newMessagesView.render(new a(this, 1));
                this.isNewMessagesClicked = true;
            }
            this.seeLatestView.render(new xq.a(14, this, messageList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerRendering showSeeLatestViewIfNeeded$lambda$25(MessageLogView messageLogView, ButtonBannerRendering buttonBannerRendering) {
        buttonBannerRendering.getClass();
        return buttonBannerRendering.toBuilder().state(new a(messageLogView, 3)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerState showSeeLatestViewIfNeeded$lambda$25$lambda$24(MessageLogView messageLogView, ButtonBannerState buttonBannerState) {
        buttonBannerState.getClass();
        return ButtonBannerState.copy$default(buttonBannerState, ButtonBannerViewType.NEW_MESSAGES, null, Boolean.FALSE, Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getElevatedColor()), null, null, false, 450, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerRendering showSeeLatestViewIfNeeded$lambda$28(MessageLogView messageLogView, List list, ButtonBannerRendering buttonBannerRendering) {
        buttonBannerRendering.getClass();
        return buttonBannerRendering.toBuilder().onViewClicked(new yl.e(5, messageLogView, list)).state(new a(messageLogView, 8)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSeeLatestViewIfNeeded$lambda$28$lambda$26(MessageLogView messageLogView, List list) {
        LinearLayoutManager linearLayoutManager = messageLogView.layoutManager;
        if (linearLayoutManager == null) {
            linearLayoutManager = null;
        }
        messageLogView.fastSmoothScrollToBottom(linearLayoutManager, list.size() - 1);
        messageLogView.rendering.getOnSeeLatestClickedListener$zendesk_messaging_messaging_android().invoke();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerState showSeeLatestViewIfNeeded$lambda$28$lambda$27(MessageLogView messageLogView, ButtonBannerState buttonBannerState) {
        buttonBannerState.getClass();
        return ButtonBannerState.copy$default(buttonBannerState, ButtonBannerViewType.SEE_LATEST, messageLogView.getContext().getString(R.string.zuia_see_latest_label), Boolean.TRUE, Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getElevatedColor()), null, null, false, 448, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerRendering showSeeLatestViewIfNeeded$lambda$30(MessageLogView messageLogView, ButtonBannerRendering buttonBannerRendering) {
        buttonBannerRendering.getClass();
        return buttonBannerRendering.toBuilder().state(new a(messageLogView, 7)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerState showSeeLatestViewIfNeeded$lambda$30$lambda$29(MessageLogView messageLogView, ButtonBannerState buttonBannerState) {
        buttonBannerState.getClass();
        return ButtonBannerState.copy$default(buttonBannerState, ButtonBannerViewType.SEE_LATEST, null, Boolean.FALSE, Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getOnElevatedColor()), Integer.valueOf(messageLogView.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getElevatedColor()), null, null, false, 450, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScrollingBehaviourOnFocusChange(View newFocus) {
        if (newFocus == null || newFocus.getId() != zendesk.ui.android.R.id.zuia_field_input) {
            this.isFormFocused = false;
            onScrollToBottomIfKeyboardShown(this.recyclerView);
        } else {
            this.isFormFocused = true;
            this.recyclerView.r0();
        }
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super MessageLogRendering, ? extends MessageLogRendering> renderingUpdate) {
        renderingUpdate.getClass();
        MessageLogState state = this.rendering.getState();
        MessageLogRendering messageLogRendering = (MessageLogRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = messageLogRendering;
        MessageLogState state2 = messageLogRendering.getState();
        this.recyclerView.setEdgeEffectFactory(new q1() { // from class: zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView.render.1
            @Override // androidx.recyclerview.widget.q1
            public EdgeEffect createEdgeEffect(RecyclerView view, int direction) {
                view.getClass();
                EdgeEffect edgeEffect = new EdgeEffect(view.getContext());
                edgeEffect.setColor(MessageLogView.this.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android().getMessageColor());
                return edgeEffect;
            }
        });
        MessageListAdapter messageListAdapter = this.messageListAdapter;
        messageListAdapter.setOnReplyActionSelected(this.rendering.getOnReplyActionSelected$zendesk_messaging_messaging_android());
        messageListAdapter.setOnFailedMessageClicked(this.rendering.getOnFailedMessageClicked$zendesk_messaging_messaging_android());
        messageListAdapter.setOnUriClicked(this.rendering.getOnUriClicked());
        messageListAdapter.setOnWebViewUriClicked(this.rendering.getOnWebViewUriClicked());
        messageListAdapter.setOnFormCompleted(this.rendering.getOnFormCompleted$zendesk_messaging_messaging_android());
        messageListAdapter.setOnCarouselAction(this.rendering.getOnCarouselAction$zendesk_messaging_messaging_android());
        messageListAdapter.setOnFormFocusChanged(this.rendering.getOnFormFocusChanged$zendesk_messaging_messaging_android());
        messageListAdapter.setMapOfDisplayedFields(this.rendering.getState().getMapOfDisplayedFields$zendesk_messaging_messaging_android());
        messageListAdapter.setOnFormDisplayedFieldsChanged(this.rendering.getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android());
        messageListAdapter.setOnLoadMoreRetryClicked(this.rendering.getOnRetryLoadMoreClickedListener$zendesk_messaging_messaging_android());
        messageListAdapter.setOnSendPostbackMessage(this.rendering.getOnSendPostbackMessage$zendesk_messaging_messaging_android());
        messageListAdapter.setOnCopyText(this.rendering.getOnCopyText$zendesk_messaging_messaging_android());
        messageListAdapter.setMessagingTheme(this.rendering.getState().getMessagingTheme$zendesk_messaging_messaging_android());
        messageListAdapter.setOnFileAttachmentClicked(this.rendering.getOnFileAttachmentClicked$zendesk_messaging_messaging_android());
        if (Intrinsics.areEqual(state.getMessageLogEntryList$zendesk_messaging_messaging_android(), state2.getMessageLogEntryList$zendesk_messaging_messaging_android()) || state2.getMessageLogEntryList$zendesk_messaging_messaging_android().isEmpty()) {
            return;
        }
        messageListAdapter.submitList(this.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android(), new a0(this, 1));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogView$Companion;", "", "<init>", "()V", "TAG", "", "NEW_MESSAGE_VIEW_DELAY", "", "NO_UNREAD_MESSAGES_EXIST", "", "ONE_HUNDRED_OR_MORE_UNREAD_MESSAGES", "MAXIMUM_MESSAGES_NUMBER", "OFFSET_WITH_EMPTY_MESSAGE", "OFFSET_WITH_NONEMPTY_MESSAGE", "OFFSET_WITH_REGULAR_MESSAGE", "SECOND_LAST_MESSAGE", "COMMA_SEPARATOR", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageLogView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageLogView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ MessageLogView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageLogView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
