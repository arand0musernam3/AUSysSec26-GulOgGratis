package zendesk.messaging.android.internal.conversationslistscreen;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.core.ui.android.internal.xml.AccessibilityExtKt;
import zendesk.core.ui.android.internal.xml.InsetType;
import zendesk.core.ui.android.internal.xml.SystemWindowInsetsKt;
import zendesk.logger.Logger;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListView;
import zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListViewRendering;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.common.button.ButtonRendering;
import zendesk.ui.android.common.button.ButtonState;
import zendesk.ui.android.common.button.ButtonView;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerRendering;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerState;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerView;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.common.retryerror.RetryErrorState;
import zendesk.ui.android.common.retryerror.RetryErrorView;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetRendering;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetState;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetView;
import zendesk.ui.android.conversation.header.ConversationHeaderRendering;
import zendesk.ui.android.conversation.header.ConversationHeaderState;
import zendesk.ui.android.conversation.header.ConversationHeaderView;
import zendesk.ui.android.conversations.LoadingIndicatorRendering;
import zendesk.ui.android.conversations.LoadingIndicatorState;
import zendesk.ui.android.conversations.LoadingIndicatorView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 D2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001DB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\fj\b\u0012\u0004\u0012\u00020\u001d`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R*\u0010$\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\fj\b\u0012\u0004\u0012\u00020#`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R*\u0010)\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fj\b\u0012\u0004\u0012\u00020(`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R*\u00101\u001a\u0018\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002000\fj\b\u0012\u0004\u0012\u000200`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001fR\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R*\u00109\u001a\u0018\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002080\fj\b\u0012\u0004\u0012\u000208`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u001fR\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010>\u001a\u0018\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0\fj\b\u0012\u0004\u0012\u00020=`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u001fR\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR*\u0010C\u001a\u0018\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0\fj\b\u0012\u0004\u0012\u00020B`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u001f¨\u0006E"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lzendesk/messaging/android/internal/conversationscreen/RenderingUpdate;", "renderingUpdate", "", "render", "(Lkotlin/jvm/functions/Function1;)V", "showErrorView", "()V", "showListView", "showLoading", "applyWindowInsetsToScreenContent", "announceForAccessibilityWhenNewMessageReceived", "rendering", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenRendering;", "Lzendesk/ui/android/conversation/header/ConversationHeaderView;", "conversationHeaderView", "Lzendesk/ui/android/conversation/header/ConversationHeaderView;", "Lzendesk/ui/android/conversation/header/ConversationHeaderRendering;", "conversationHeaderRenderingUpdate", "Lkotlin/jvm/functions/Function1;", "Lzendesk/ui/android/conversations/LoadingIndicatorView;", "loadingIndicatorView", "Lzendesk/ui/android/conversations/LoadingIndicatorView;", "Lzendesk/ui/android/conversations/LoadingIndicatorRendering;", "conversationsLoaderRenderingUpdate", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListView;", "conversationsListView", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListView;", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewRendering;", "conversationsListViewRenderingUpdate", "Lzendesk/ui/android/common/button/ButtonView;", "createConversationsButton", "Lzendesk/ui/android/common/button/ButtonView;", "Landroid/widget/FrameLayout;", "createConversationsButtonContainer", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/common/button/ButtonRendering;", "createConversationButtonRenderingUpdate", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetView;", "createConversationFailedBottomSheet$delegate", "Lu70/j;", "getCreateConversationFailedBottomSheet", "()Lzendesk/ui/android/conversation/bottomsheet/BottomSheetView;", "createConversationFailedBottomSheet", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering;", "createConversationFailedBottomSheetRenderingUpdate", "Lzendesk/ui/android/common/retryerror/RetryErrorView;", "retryErrorView", "Lzendesk/ui/android/common/retryerror/RetryErrorView;", "Lzendesk/ui/android/common/retryerror/RetryErrorRendering;", "retryErrorViewRenderingUpdate", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerView;", "connectionBannerView", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerView;", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering;", "connectionBannerViewRenderingUpdate", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsListScreenView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListScreenView.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,331:1\n257#2,2:332\n257#2,2:334\n257#2,2:336\n257#2,2:338\n257#2,2:340\n257#2,2:342\n257#2,2:344\n257#2,2:346\n257#2,2:348\n*S KotlinDebug\n*F\n+ 1 ConversationsListScreenView.kt\nzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenView\n*L\n278#1:332,2\n279#1:334,2\n280#1:336,2\n284#1:338,2\n285#1:340,2\n286#1:342,2\n291#1:344,2\n292#1:346,2\n293#1:348,2\n*E\n"})
public final class ConversationsListScreenView extends ConstraintLayout implements Renderer<ConversationsListScreenRendering> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ConversationsListScreenView";

    @NotNull
    private final ConnectionBannerView connectionBannerView;

    @NotNull
    private final Function1<ConnectionBannerRendering, ConnectionBannerRendering> connectionBannerViewRenderingUpdate;

    @NotNull
    private final Function1<ConversationHeaderRendering, ConversationHeaderRendering> conversationHeaderRenderingUpdate;

    @NotNull
    private final ConversationHeaderView conversationHeaderView;

    @NotNull
    private final ConversationsListView conversationsListView;

    @NotNull
    private final Function1<ConversationsListViewRendering, ConversationsListViewRendering> conversationsListViewRenderingUpdate;

    @NotNull
    private final Function1<LoadingIndicatorRendering, LoadingIndicatorRendering> conversationsLoaderRenderingUpdate;

    @NotNull
    private final Function1<ButtonRendering, ButtonRendering> createConversationButtonRenderingUpdate;

    /* JADX INFO: renamed from: createConversationFailedBottomSheet$delegate, reason: from kotlin metadata */
    @NotNull
    private final j createConversationFailedBottomSheet;

    @NotNull
    private final Function1<BottomSheetRendering, BottomSheetRendering> createConversationFailedBottomSheetRenderingUpdate;

    @NotNull
    private final ButtonView createConversationsButton;

    @NotNull
    private final FrameLayout createConversationsButtonContainer;

    @NotNull
    private final LoadingIndicatorView loadingIndicatorView;

    @NotNull
    private ConversationsListScreenRendering rendering;

    @NotNull
    private final RetryErrorView retryErrorView;

    @NotNull
    private final Function1<RetryErrorRendering, RetryErrorRendering> retryErrorViewRenderingUpdate;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConnectionStatus.values().length];
            try {
                iArr[ConnectionStatus.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionStatus.CONNECTING_REALTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionStatus.CONNECTED_REALTIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConversationsListState.values().length];
            try {
                iArr2[ConversationsListState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversationsListState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ConversationsListState.FAILED_ENTRY_POINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ConversationsListState.FAILED_CONVERSATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ConversationsListState.IDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsListScreenView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.rendering = new ConversationsListScreenRendering();
        this.conversationHeaderRenderingUpdate = new e(this, 4);
        this.conversationsLoaderRenderingUpdate = new e(this, 5);
        this.conversationsListViewRenderingUpdate = new e(this, 6);
        this.createConversationButtonRenderingUpdate = new d(context, this, 4);
        this.createConversationFailedBottomSheet = l.b(new f(context, 3));
        this.createConversationFailedBottomSheetRenderingUpdate = new d(this, context);
        this.retryErrorViewRenderingUpdate = new d(context, this, 2);
        this.connectionBannerViewRenderingUpdate = new e(this, 0);
        View.inflate(context, R.layout.zma_view_conversations_list_screen, this);
        View viewFindViewById = findViewById(R.id.zma_conversations_list_header_view);
        viewFindViewById.getClass();
        this.conversationHeaderView = (ConversationHeaderView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zma_loading_indicator_view);
        viewFindViewById2.getClass();
        this.loadingIndicatorView = (LoadingIndicatorView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zma_conversations_list_view);
        viewFindViewById3.getClass();
        this.conversationsListView = (ConversationsListView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.zma_create_conversation_button);
        viewFindViewById4.getClass();
        this.createConversationsButton = (ButtonView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.zma_button_container);
        viewFindViewById5.getClass();
        this.createConversationsButtonContainer = (FrameLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.zma_retry_error_view);
        viewFindViewById6.getClass();
        this.retryErrorView = (RetryErrorView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.zma_conversations_list_connection_banner);
        viewFindViewById7.getClass();
        this.connectionBannerView = (ConnectionBannerView) viewFindViewById7;
        render(new o(16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationsListScreenRendering _init_$lambda$18(ConversationsListScreenRendering conversationsListScreenRendering) {
        conversationsListScreenRendering.getClass();
        return conversationsListScreenRendering;
    }

    private final void announceForAccessibilityWhenNewMessageReceived() {
        String receivedMessageAuthor;
        Context context = getContext();
        context.getClass();
        if (!AccessibilityExtKt.isAccessibilityServiceRunning(context) || (receivedMessageAuthor = this.rendering.getState().getReceivedMessageAuthor()) == null) {
            return;
        }
        ViewCompat.d0(this.conversationsListView, k.m(getContext().getString(R.string.zuia_accessibility_message_received, receivedMessageAuthor), " ", getContext().getResources().getQuantityString(R.plurals.unreadMessages, this.rendering.getState().getReceivedMessageUnreadCount(), Integer.valueOf(this.rendering.getState().getReceivedMessageUnreadCount()))));
        this.rendering.getOnMessageReceivedAuthorAnnounced$zendesk_messaging_messaging_android().invoke();
    }

    private final void applyWindowInsetsToScreenContent() {
        SystemWindowInsetsKt.applyWindowInsets(this, InsetType.BOTTOM);
        LoadingIndicatorView loadingIndicatorView = this.loadingIndicatorView;
        InsetType insetType = InsetType.HORIZONTAL;
        SystemWindowInsetsKt.applyWindowInsets(loadingIndicatorView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.conversationsListView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.connectionBannerView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.retryErrorView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.createConversationsButtonContainer, insetType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionBannerRendering connectionBannerViewRenderingUpdate$lambda$17(ConversationsListScreenView conversationsListScreenView, ConnectionBannerRendering connectionBannerRendering) {
        connectionBannerRendering.getClass();
        return connectionBannerRendering.toBuilder().showRetry(false).state(new e(conversationsListScreenView, 3)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionBannerState connectionBannerViewRenderingUpdate$lambda$17$lambda$16(ConversationsListScreenView conversationsListScreenView, ConnectionBannerState connectionBannerState) {
        connectionBannerState.getClass();
        ConnectionStatus connectionStatus = conversationsListScreenView.rendering.getState().getConnectionStatus();
        int i11 = connectionStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[connectionStatus.ordinal()];
        return connectionBannerState.copy(i11 != 1 ? i11 != 2 ? i11 != 3 ? ConnectionBannerState.ConnectionState.Connected.INSTANCE : ConnectionBannerState.ConnectionState.Reconnected.INSTANCE : ConnectionBannerState.ConnectionState.Reconnecting.INSTANCE : ConnectionBannerState.ConnectionState.Disconnected.INSTANCE, conversationsListScreenView.rendering.getState().getMessagingTheme().getBackgroundColor(), conversationsListScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor(), conversationsListScreenView.rendering.getState().getMessagingTheme().getSuccessColor(), conversationsListScreenView.rendering.getState().getMessagingTheme().getOnSuccessColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationHeaderRendering conversationHeaderRenderingUpdate$lambda$1(ConversationsListScreenView conversationsListScreenView, ConversationHeaderRendering conversationHeaderRendering) {
        conversationHeaderRendering.getClass();
        return conversationHeaderRendering.toBuilder().state(new e(conversationsListScreenView, 1)).onBackButtonClicked(conversationsListScreenView.rendering.getOnBackButtonClicked$zendesk_messaging_messaging_android()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationHeaderState conversationHeaderRenderingUpdate$lambda$1$lambda$0(ConversationsListScreenView conversationsListScreenView, ConversationHeaderState conversationHeaderState) {
        conversationHeaderState.getClass();
        return ConversationHeaderState.copy$default(conversationHeaderState, conversationsListScreenView.rendering.getState().getTitle(), conversationsListScreenView.rendering.getState().getDescription(), Uri.parse(conversationsListScreenView.rendering.getState().getLogoUrl()), null, Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getPrimaryColor()), Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getPrimaryColor()), Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getOnPrimaryColor()), Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getOnPrimaryColor()), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationsListViewRendering conversationsListViewRenderingUpdate$lambda$5(ConversationsListScreenView conversationsListScreenView, ConversationsListViewRendering conversationsListViewRendering) {
        conversationsListViewRendering.getClass();
        return conversationsListViewRendering.toBuilder().onRetryItemClickLambda(conversationsListScreenView.rendering.getOnRetryPaginationClick$zendesk_messaging_messaging_android()).onListItemClickLambda(conversationsListScreenView.rendering.getOnListItemClickLambda$zendesk_messaging_messaging_android()).loadMoreListener(conversationsListScreenView.rendering.getOnStartPagingLambda$zendesk_messaging_messaging_android()).state(new e(conversationsListScreenView, 2)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListState conversationsListViewRenderingUpdate$lambda$5$lambda$4(ConversationsListScreenView conversationsListScreenView, zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListState conversationsListState) {
        conversationsListState.getClass();
        return zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListState.copy$default(conversationsListState, conversationsListScreenView.rendering.getState().getConversations(), null, conversationsListScreenView.rendering.getState().getMessagingTheme(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingIndicatorRendering conversationsLoaderRenderingUpdate$lambda$3(ConversationsListScreenView conversationsListScreenView, LoadingIndicatorRendering loadingIndicatorRendering) {
        loadingIndicatorRendering.getClass();
        return loadingIndicatorRendering.toBuilder().state(new a(1, conversationsListScreenView.rendering.getState().getConversationsListState(), conversationsListScreenView)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingIndicatorState conversationsLoaderRenderingUpdate$lambda$3$lambda$2(ConversationsListState conversationsListState, ConversationsListScreenView conversationsListScreenView, LoadingIndicatorState loadingIndicatorState) {
        loadingIndicatorState.getClass();
        return loadingIndicatorState.copy(conversationsListState == ConversationsListState.LOADING, conversationsListScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonRendering createConversationButtonRenderingUpdate$lambda$8(Context context, ConversationsListScreenView conversationsListScreenView, ButtonRendering buttonRendering) {
        buttonRendering.getClass();
        return buttonRendering.toBuilder().state(new d(context, conversationsListScreenView, 0)).onButtonClicked(new f(conversationsListScreenView, 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonState createConversationButtonRenderingUpdate$lambda$8$lambda$6(Context context, ConversationsListScreenView conversationsListScreenView, ButtonState buttonState) {
        buttonState.getClass();
        String string = context.getString(R.string.zma_new_conversation_button);
        string.getClass();
        return ButtonState.copy$default(buttonState, string, conversationsListScreenView.rendering.getState().getCreateConversationState() == CreateConversationState.LOADING, Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getActionColor()), Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getOnActionColor()), Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getOnActionColor()), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConversationButtonRenderingUpdate$lambda$8$lambda$7(ConversationsListScreenView conversationsListScreenView) {
        conversationsListScreenView.rendering.getOnCreateConvoButtonClicked$zendesk_messaging_messaging_android().invoke();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetRendering createConversationFailedBottomSheetRenderingUpdate$lambda$12(ConversationsListScreenView conversationsListScreenView, Context context, BottomSheetRendering bottomSheetRendering) {
        bottomSheetRendering.getClass();
        return bottomSheetRendering.toBuilder().onBottomSheetActionClicked(new f(conversationsListScreenView, 0)).state(new d(context, conversationsListScreenView, 3)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConversationFailedBottomSheetRenderingUpdate$lambda$12$lambda$10(ConversationsListScreenView conversationsListScreenView) {
        conversationsListScreenView.getCreateConversationFailedBottomSheet().dismiss();
        conversationsListScreenView.rendering.getOnDismissCreateConversationError$zendesk_messaging_messaging_android().invoke();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetState createConversationFailedBottomSheetRenderingUpdate$lambda$12$lambda$11(Context context, ConversationsListScreenView conversationsListScreenView, BottomSheetState bottomSheetState) {
        bottomSheetState.getClass();
        String string = context.getString(R.string.zma_new_conversation_error_alert);
        string.getClass();
        String string2 = context.getString(R.string.zma_new_conversation_error_alert_dismiss_button);
        string2.getClass();
        return BottomSheetState.copy$default(bottomSheetState, string, string2, 0L, conversationsListScreenView.rendering.getState().getCreateConversationState() == CreateConversationState.FAILED, Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getErrorColor()), Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getOnErrorColor()), Integer.valueOf(conversationsListScreenView.rendering.getState().getMessagingTheme().getOnErrorColor()), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetView createConversationFailedBottomSheet_delegate$lambda$9(Context context) {
        return new BottomSheetView(context);
    }

    private final BottomSheetView getCreateConversationFailedBottomSheet() {
        return (BottomSheetView) this.createConversationFailedBottomSheet.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorRendering retryErrorViewRenderingUpdate$lambda$15(Context context, ConversationsListScreenView conversationsListScreenView, RetryErrorRendering retryErrorRendering) {
        retryErrorRendering.getClass();
        String string = context.getString(R.string.zuia_conversations_list_tap_to_retry_message_label);
        string.getClass();
        return retryErrorRendering.toBuilder().state(new yj.k(conversationsListScreenView, context, string, 3)).onButtonClicked(new f(conversationsListScreenView, 2)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorState retryErrorViewRenderingUpdate$lambda$15$lambda$13(ConversationsListScreenView conversationsListScreenView, Context context, String str, RetryErrorState retryErrorState) {
        retryErrorState.getClass();
        int onBackgroundColor = conversationsListScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor();
        String string = context.getString(R.string.zuia_conversation_message_label_tap_to_retry);
        string.getClass();
        return retryErrorState.copy(str, conversationsListScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor(), string, onBackgroundColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryErrorViewRenderingUpdate$lambda$15$lambda$14(ConversationsListScreenView conversationsListScreenView) {
        conversationsListScreenView.rendering.getOnRetryButtonClicked$zendesk_messaging_messaging_android().invoke();
        return Unit.f26487a;
    }

    private final void showErrorView() {
        this.loadingIndicatorView.setVisibility(8);
        this.retryErrorView.setVisibility(0);
        this.createConversationsButton.setVisibility(8);
    }

    private final void showListView() {
        this.retryErrorView.setVisibility(8);
        this.loadingIndicatorView.setVisibility(8);
        this.createConversationsButton.setVisibility(this.rendering.getState().getCanUserCreateMoreConversations() ? 0 : 8);
    }

    private final void showLoading() {
        this.loadingIndicatorView.setVisibility(0);
        this.retryErrorView.setVisibility(8);
        this.createConversationsButton.setVisibility(8);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ConversationsListScreenRendering, ? extends ConversationsListScreenRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ConversationsListScreenRendering conversationsListScreenRendering = (ConversationsListScreenRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = conversationsListScreenRendering;
        Logger.i(LOG_TAG, "Updating the Conversations List Screen with " + conversationsListScreenRendering.getState(), new Object[0]);
        setBackgroundColor(this.rendering.getState().getMessagingTheme().getBackgroundColor());
        this.conversationHeaderView.render(this.conversationHeaderRenderingUpdate);
        this.loadingIndicatorView.render(this.conversationsLoaderRenderingUpdate);
        this.conversationsListView.render(this.conversationsListViewRenderingUpdate);
        this.connectionBannerView.render(this.connectionBannerViewRenderingUpdate);
        getCreateConversationFailedBottomSheet().render(this.createConversationFailedBottomSheetRenderingUpdate);
        this.retryErrorView.render(this.retryErrorViewRenderingUpdate);
        this.createConversationsButton.render(this.createConversationButtonRenderingUpdate);
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.rendering.getState().getConversationsListState().ordinal()];
        if (i11 == 1) {
            showListView();
        } else if (i11 == 2) {
            showLoading();
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    e40.a.f();
                    return;
                }
            } else if (this.rendering.getState().getConversations().isEmpty()) {
                showErrorView();
            } else {
                showListView();
            }
        } else if (this.rendering.getState().getConversations().isEmpty()) {
            showErrorView();
        } else {
            showListView();
        }
        applyWindowInsetsToScreenContent();
        announceForAccessibilityWhenNewMessageReceived();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenView$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationsListScreenView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ConversationsListScreenView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationsListScreenView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
