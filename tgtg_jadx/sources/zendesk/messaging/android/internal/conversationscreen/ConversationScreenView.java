package zendesk.messaging.android.internal.conversationscreen;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.core.ui.android.internal.xml.InsetType;
import zendesk.core.ui.android.internal.xml.SystemWindowInsetsKt;
import zendesk.logger.Logger;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogRendering;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogState;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.common.buttonbanner.ButtonBannerRendering;
import zendesk.ui.android.common.buttonbanner.ButtonBannerState;
import zendesk.ui.android.common.buttonbanner.ButtonBannerView;
import zendesk.ui.android.common.buttonbanner.ButtonBannerViewType;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerRendering;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerState;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerView;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.common.retryerror.RetryErrorState;
import zendesk.ui.android.common.retryerror.RetryErrorView;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetRendering;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetState;
import zendesk.ui.android.conversation.bottomsheet.BottomSheetView;
import zendesk.ui.android.conversation.composer.MessageComposerRendering;
import zendesk.ui.android.conversation.composer.MessageComposerState;
import zendesk.ui.android.conversation.composer.MessageComposerView;
import zendesk.ui.android.conversation.form.DisplayedForm;
import zendesk.ui.android.conversation.header.ConversationHeaderRendering;
import zendesk.ui.android.conversation.header.ConversationHeaderState;
import zendesk.ui.android.conversation.header.ConversationHeaderView;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerRendering;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerState;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerView;
import zendesk.ui.android.conversations.LoadingIndicatorRendering;
import zendesk.ui.android.conversations.LoadingIndicatorState;
import zendesk.ui.android.conversations.LoadingIndicatorView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 D2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002CDB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ&\u00103\u001a\u0002042\u001c\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010j\b\u0012\u0004\u0012\u00020\u0003`\u0012H\u0016J\u0010\u00106\u001a\u0002042\u0006\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000204H\u0002J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020?H\u0002J\u0018\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020B2\u0006\u0010>\u001a\u00020?H\u0002R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0010j\b\u0012\u0004\u0012\u00020\u0016`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0010j\b\u0012\u0004\u0012\u00020\u001a`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u0010j\b\u0012\u0004\u0012\u00020\u001e`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010!\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0\u0010j\b\u0012\u0004\u0012\u00020\"`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010%\u001a\u0018\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0\u0010j\b\u0012\u0004\u0012\u00020&`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010)\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0\u0010j\b\u0012\u0004\u0012\u00020*`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010-\u001a\u0018\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0\u0010j\b\u0012\u0004\u0012\u00020.`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00101\u001a\u0018\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002020\u0010j\b\u0012\u0004\u0012\u000202`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenView;", "Landroid/widget/RelativeLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rendering", "conversationHeaderView", "Lzendesk/ui/android/conversation/header/ConversationHeaderView;", "conversationHeaderRenderingUpdate", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/header/ConversationHeaderRendering;", "Lzendesk/messaging/android/internal/conversationscreen/RenderingUpdate;", "connectionBannerView", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerView;", "connectionBannerRenderingUpdate", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering;", "messageLogView", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogView;", "messageLogViewRenderingUpdate", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/MessageLogRendering;", "messageComposerView", "Lzendesk/ui/android/conversation/composer/MessageComposerView;", "messageComposerRenderingUpdate", "Lzendesk/ui/android/conversation/composer/MessageComposerRendering;", "deniedPermissionBottomSheetView", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetView;", "deniedPermissionBottomSheetRenderingUpdate", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering;", "loadingIndicatorView", "Lzendesk/ui/android/conversations/LoadingIndicatorView;", "loadingIndicatorRenderingUpdate", "Lzendesk/ui/android/conversations/LoadingIndicatorRendering;", "retryErrorView", "Lzendesk/ui/android/common/retryerror/RetryErrorView;", "retryErrorViewRenderingUpdate", "Lzendesk/ui/android/common/retryerror/RetryErrorRendering;", "postbackBannerView", "Lzendesk/ui/android/common/buttonbanner/ButtonBannerView;", "postbackFailureBannerRenderingUpdate", "Lzendesk/ui/android/common/buttonbanner/ButtonBannerRendering;", "waitTimeBannerView", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerView;", "waitTimeBannerViewRenderingUpdate", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerRendering;", "render", "", "renderingUpdate", "setState", "state", "Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenView$ScreenState;", "applyWindowInsetsToScreenContent", "loadMoreMessages", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "composerVisibility", "isFormFocused", "", "renderWaitTimeBanner", "waitTimeBannerType", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "ScreenState", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationScreenView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationScreenView.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,438:1\n255#2:439\n257#2,2:440\n257#2,2:442\n257#2,2:444\n257#2,2:446\n257#2,2:448\n257#2,2:450\n*S KotlinDebug\n*F\n+ 1 ConversationScreenView.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationScreenView\n*L\n354#1:439\n363#1:440,2\n364#1:442,2\n365#1:444,2\n415#1:446,2\n420#1:448,2\n424#1:450,2\n*E\n"})
public final class ConversationScreenView extends RelativeLayout implements Renderer<ConversationScreenRendering> {
    private static final int COMPOSER_MAX_LENGTH = 4096;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ConversationScreenView";
    private static final int MAX_CONVERSATION_LIST_NUM = 100;

    @NotNull
    private final Function1<ConnectionBannerRendering, ConnectionBannerRendering> connectionBannerRenderingUpdate;

    @NotNull
    private final ConnectionBannerView connectionBannerView;

    @NotNull
    private final Function1<ConversationHeaderRendering, ConversationHeaderRendering> conversationHeaderRenderingUpdate;

    @NotNull
    private final ConversationHeaderView conversationHeaderView;

    @NotNull
    private final Function1<BottomSheetRendering, BottomSheetRendering> deniedPermissionBottomSheetRenderingUpdate;

    @NotNull
    private final BottomSheetView deniedPermissionBottomSheetView;

    @NotNull
    private final Function1<LoadingIndicatorRendering, LoadingIndicatorRendering> loadingIndicatorRenderingUpdate;

    @NotNull
    private final LoadingIndicatorView loadingIndicatorView;

    @NotNull
    private final Function1<MessageComposerRendering, MessageComposerRendering> messageComposerRenderingUpdate;

    @NotNull
    private final MessageComposerView messageComposerView;

    @NotNull
    private final MessageLogView messageLogView;

    @NotNull
    private final Function1<MessageLogRendering, MessageLogRendering> messageLogViewRenderingUpdate;

    @NotNull
    private final ButtonBannerView postbackBannerView;

    @NotNull
    private final Function1<ButtonBannerRendering, ButtonBannerRendering> postbackFailureBannerRenderingUpdate;

    @NotNull
    private ConversationScreenRendering rendering;

    @NotNull
    private final RetryErrorView retryErrorView;

    @NotNull
    private final Function1<RetryErrorRendering, RetryErrorRendering> retryErrorViewRenderingUpdate;

    @NotNull
    private final WaitTimeBannerView waitTimeBannerView;

    @NotNull
    private final Function1<WaitTimeBannerRendering, WaitTimeBannerRendering> waitTimeBannerViewRenderingUpdate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenView$ScreenState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LOADING", "RETRY", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScreenState {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ ScreenState[] $VALUES;
        public static final ScreenState DEFAULT = new ScreenState("DEFAULT", 0);
        public static final ScreenState LOADING = new ScreenState("LOADING", 1);
        public static final ScreenState RETRY = new ScreenState("RETRY", 2);

        private static final /* synthetic */ ScreenState[] $values() {
            return new ScreenState[]{DEFAULT, LOADING, RETRY};
        }

        static {
            ScreenState[] screenStateArr$values = $values();
            $VALUES = screenStateArr$values;
            $ENTRIES = v0.n.w(screenStateArr$values);
        }

        private ScreenState(String str, int i11) {
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static ScreenState valueOf(String str) {
            return (ScreenState) Enum.valueOf(ScreenState.class, str);
        }

        public static ScreenState[] values() {
            return (ScreenState[]) $VALUES.clone();
        }
    }

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
            int[] iArr2 = new int[ConversationScreenStatus.values().length];
            try {
                iArr2[ConversationScreenStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversationScreenStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.rendering = new ConversationScreenRendering();
        this.conversationHeaderRenderingUpdate = new q(this, 0);
        this.connectionBannerRenderingUpdate = new q(this, 6);
        this.messageLogViewRenderingUpdate = new q(this, 8);
        this.messageComposerRenderingUpdate = new q(this, 9);
        this.deniedPermissionBottomSheetRenderingUpdate = new r(this, context, 1);
        this.loadingIndicatorRenderingUpdate = new q(this, 10);
        this.retryErrorViewRenderingUpdate = new r(context, this, 2);
        this.postbackFailureBannerRenderingUpdate = new r(this, context, 3);
        this.waitTimeBannerViewRenderingUpdate = new q(this, 11);
        View.inflate(context, R.layout.zma_view_conversation, this);
        View viewFindViewById = findViewById(R.id.zma_conversation_header_view);
        viewFindViewById.getClass();
        this.conversationHeaderView = (ConversationHeaderView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zma_message_list);
        viewFindViewById2.getClass();
        this.messageLogView = (MessageLogView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zma_message_composer_view);
        viewFindViewById3.getClass();
        this.messageComposerView = (MessageComposerView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.zma_wait_time_banner_view);
        viewFindViewById4.getClass();
        this.waitTimeBannerView = (WaitTimeBannerView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.zma_connection_banner_view);
        viewFindViewById5.getClass();
        ConnectionBannerView connectionBannerView = (ConnectionBannerView) viewFindViewById5;
        this.connectionBannerView = connectionBannerView;
        this.deniedPermissionBottomSheetView = new BottomSheetView(context);
        View viewFindViewById6 = findViewById(R.id.zma_loading_indicator_view);
        viewFindViewById6.getClass();
        this.loadingIndicatorView = (LoadingIndicatorView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.zma_retry_error_view);
        viewFindViewById7.getClass();
        this.retryErrorView = (RetryErrorView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.zma_postback_failure_banner);
        viewFindViewById8.getClass();
        ButtonBannerView buttonBannerView = (ButtonBannerView) viewFindViewById8;
        this.postbackBannerView = buttonBannerView;
        connectionBannerView.bringToFront();
        buttonBannerView.bringToFront();
        render(new o(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationScreenRendering _init_$lambda$24(ConversationScreenRendering conversationScreenRendering) {
        conversationScreenRendering.getClass();
        return conversationScreenRendering;
    }

    private final void applyWindowInsetsToScreenContent() {
        SystemWindowInsetsKt.applyWindowInsets(this, InsetType.BOTTOM);
        ConnectionBannerView connectionBannerView = this.connectionBannerView;
        InsetType insetType = InsetType.HORIZONTAL;
        SystemWindowInsetsKt.applyWindowInsets(connectionBannerView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.messageLogView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.messageComposerView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.loadingIndicatorView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.retryErrorView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.postbackBannerView, insetType);
        SystemWindowInsetsKt.applyWindowInsets(this.waitTimeBannerView, insetType);
    }

    private final int composerVisibility(boolean isFormFocused) {
        return isFormFocused ? 8 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionBannerRendering connectionBannerRenderingUpdate$lambda$3(ConversationScreenView conversationScreenView, ConnectionBannerRendering connectionBannerRendering) {
        connectionBannerRendering.getClass();
        return connectionBannerRendering.toBuilder().onRetryClicked(conversationScreenView.rendering.getOnRetryConnectionClicked$zendesk_messaging_messaging_android()).state(new q(conversationScreenView, 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionBannerState connectionBannerRenderingUpdate$lambda$3$lambda$2(ConversationScreenView conversationScreenView, ConnectionBannerState connectionBannerState) {
        connectionBannerState.getClass();
        ConnectionStatus connectionStatus = conversationScreenView.rendering.getState().getConnectionStatus();
        int i11 = connectionStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[connectionStatus.ordinal()];
        return connectionBannerState.copy(i11 != 1 ? i11 != 2 ? i11 != 3 ? ConnectionBannerState.ConnectionState.Connected.INSTANCE : ConnectionBannerState.ConnectionState.Reconnected.INSTANCE : ConnectionBannerState.ConnectionState.Reconnecting.INSTANCE : ConnectionBannerState.ConnectionState.Disconnected.INSTANCE, conversationScreenView.rendering.getState().getMessagingTheme().getBackgroundColor(), conversationScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor(), conversationScreenView.rendering.getState().getMessagingTheme().getSuccessColor(), conversationScreenView.rendering.getState().getMessagingTheme().getOnSuccessColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationHeaderRendering conversationHeaderRenderingUpdate$lambda$1(ConversationScreenView conversationScreenView, ConversationHeaderRendering conversationHeaderRendering) {
        conversationHeaderRendering.getClass();
        return conversationHeaderRendering.toBuilder().state(new q(conversationScreenView, 2)).onBackButtonClicked(conversationScreenView.rendering.getOnBackButtonClicked$zendesk_messaging_messaging_android()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationHeaderState conversationHeaderRenderingUpdate$lambda$1$lambda$0(ConversationScreenView conversationScreenView, ConversationHeaderState conversationHeaderState) {
        conversationHeaderState.getClass();
        return conversationHeaderState.copy(conversationScreenView.rendering.getState().getTitle(), conversationScreenView.rendering.getState().getDescription(), Uri.parse(conversationScreenView.rendering.getState().getToolbarImageUrl()), conversationScreenView.rendering.getState().getAccessibilityTitle(), Integer.valueOf(conversationScreenView.rendering.getState().getMessagingTheme().getPrimaryColor()), Integer.valueOf(conversationScreenView.rendering.getState().getMessagingTheme().getPrimaryColor()), Integer.valueOf(conversationScreenView.rendering.getState().getMessagingTheme().getOnPrimaryColor()), Integer.valueOf(conversationScreenView.rendering.getState().getMessagingTheme().getOnPrimaryColor()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetRendering deniedPermissionBottomSheetRenderingUpdate$lambda$13(ConversationScreenView conversationScreenView, Context context, BottomSheetRendering bottomSheetRendering) {
        bottomSheetRendering.getClass();
        return bottomSheetRendering.toBuilder().onBottomSheetActionClicked(conversationScreenView.rendering.getOnDeniedPermissionActionClicked$zendesk_messaging_messaging_android()).onBottomSheetDismissed(conversationScreenView.rendering.getOnDeniedPermissionDismissed$zendesk_messaging_messaging_android()).state(new r(context, conversationScreenView, 0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetState deniedPermissionBottomSheetRenderingUpdate$lambda$13$lambda$12(Context context, ConversationScreenView conversationScreenView, BottomSheetState bottomSheetState) {
        bottomSheetState.getClass();
        String string = context.getString(R.string.zuia_attachment_permissions_rationale);
        string.getClass();
        String string2 = context.getString(R.string.zuia_settings);
        string2.getClass();
        return BottomSheetState.copy$default(bottomSheetState, string, string2, 0L, conversationScreenView.rendering.getState().getShowDeniedPermission(), Integer.valueOf(context.getColor(R.color.zma_color_bottom_sheet_background)), Integer.valueOf(context.getColor(R.color.zma_color_bottom_sheet_error_text)), Integer.valueOf(context.getColor(R.color.zma_color_bottom_sheet_action_text)), 4, null);
    }

    private final void loadMoreMessages(Conversation conversation) {
        this.rendering.getOnLoadMoreMessages$zendesk_messaging_messaging_android().invoke(Double.valueOf(((Message) CollectionsKt.O(conversation.getMessages())).getBeforeTimestamp()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingIndicatorRendering loadingIndicatorRenderingUpdate$lambda$15(ConversationScreenView conversationScreenView, LoadingIndicatorRendering loadingIndicatorRendering) {
        loadingIndicatorRendering.getClass();
        return loadingIndicatorRendering.toBuilder().state(new m(2, conversationScreenView.rendering.getState().getStatus(), conversationScreenView)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingIndicatorState loadingIndicatorRenderingUpdate$lambda$15$lambda$14(ConversationScreenStatus conversationScreenStatus, ConversationScreenView conversationScreenView, LoadingIndicatorState loadingIndicatorState) {
        loadingIndicatorState.getClass();
        return loadingIndicatorState.copy(conversationScreenStatus == ConversationScreenStatus.LOADING, conversationScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageComposerRendering messageComposerRenderingUpdate$lambda$11(ConversationScreenView conversationScreenView, MessageComposerRendering messageComposerRendering) {
        messageComposerRendering.getClass();
        return messageComposerRendering.toBuilder().onSendButtonClicked(conversationScreenView.rendering.getOnSendButtonClicked$zendesk_messaging_messaging_android()).onAttachButtonClicked(conversationScreenView.rendering.getOnAttachButtonClicked$zendesk_messaging_messaging_android()).onTyping(conversationScreenView.rendering.getOnTyping$zendesk_messaging_messaging_android()).onTextChanged(conversationScreenView.rendering.getOnMessageComposerTextChanged$zendesk_messaging_messaging_android()).state(new q(conversationScreenView, 7)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageComposerState messageComposerRenderingUpdate$lambda$11$lambda$10(ConversationScreenView conversationScreenView, MessageComposerState messageComposerState) {
        messageComposerState.getClass();
        int onSecondaryAction = conversationScreenView.rendering.getState().getMessagingTheme().getOnSecondaryAction();
        int onBackgroundColor = conversationScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor();
        int onBackgroundColor2 = conversationScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor();
        int onSecondaryAction2 = conversationScreenView.rendering.getState().getMessagingTheme().getOnSecondaryAction();
        int onBackgroundColor3 = conversationScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor();
        boolean z11 = !conversationScreenView.rendering.getState().getBlockChatInput();
        boolean zIsAttachmentsEnabled = conversationScreenView.rendering.getState().isAttachmentsEnabled();
        return messageComposerState.copy(z11, conversationScreenView.rendering.getState().getCameraSupported(), conversationScreenView.rendering.getState().getGallerySupported(), zIsAttachmentsEnabled, conversationScreenView.composerVisibility(conversationScreenView.rendering.getState().isFormFocused()), COMPOSER_MAX_LENGTH, onSecondaryAction, onBackgroundColor, onBackgroundColor2, onSecondaryAction2, onBackgroundColor3, conversationScreenView.rendering.getState().getMessagingTheme().getOnElevatedColor(), conversationScreenView.rendering.getState().getMessagingTheme().getElevatedColor(), conversationScreenView.rendering.getState().getComposerText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageLogRendering messageLogViewRenderingUpdate$lambda$9(ConversationScreenView conversationScreenView, MessageLogRendering messageLogRendering) {
        messageLogRendering.getClass();
        return messageLogRendering.toBuilder().state(new q(conversationScreenView, 4)).onReplyActionSelected(conversationScreenView.rendering.getOnReplyActionSelected$zendesk_messaging_messaging_android()).onFailedMessageClicked(conversationScreenView.rendering.getOnFailedMessageClicked$zendesk_messaging_messaging_android()).onUriClicked(conversationScreenView.rendering.getOnUriClicked()).onWebViewUriClicked(conversationScreenView.rendering.getOnWebViewUriClicked()).onCarouselAction(conversationScreenView.rendering.getOnCarouselAction$zendesk_messaging_messaging_android()).onSendPostbackMessage(conversationScreenView.rendering.getOnSendPostbackMessage$zendesk_messaging_messaging_android()).onCopyText(conversationScreenView.rendering.getOnCopyText$zendesk_messaging_messaging_android()).onFormCompleted(conversationScreenView.rendering.getOnFormCompleted$zendesk_messaging_messaging_android()).onFormFocusChanged(conversationScreenView.rendering.getOnFormFocusChanged$zendesk_messaging_messaging_android()).onFormDisplayedFieldsChanged(conversationScreenView.rendering.getOnFormDisplayedFieldsChanged$zendesk_messaging_messaging_android()).onLoadMoreListener(new q(conversationScreenView, 5)).onRetryLoadMoreClickedListener(new s(conversationScreenView, 2)).onSeeLatestClickedListener(conversationScreenView.rendering.getOnSeeLatestClickedListener$zendesk_messaging_messaging_android()).onFileAttachmentClicked(conversationScreenView.rendering.getOnFileAttachmentClicked$zendesk_messaging_messaging_android()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageLogState messageLogViewRenderingUpdate$lambda$9$lambda$4(ConversationScreenView conversationScreenView, MessageLogState messageLogState) {
        messageLogState.getClass();
        List<MessageLogEntry> messageLog = conversationScreenView.rendering.getState().getMessageLog();
        Map<String, DisplayedForm> mapOfDisplayedForms = conversationScreenView.rendering.getState().getMapOfDisplayedForms();
        boolean shouldAnnounceMessage = conversationScreenView.rendering.getState().getShouldAnnounceMessage();
        boolean shouldSeeLatestViewVisible = conversationScreenView.rendering.getState().getShouldSeeLatestViewVisible();
        return messageLogState.copy(messageLog, conversationScreenView.rendering.getState().getScrollToTheBottom(), mapOfDisplayedForms, shouldAnnounceMessage, shouldSeeLatestViewVisible, conversationScreenView.rendering.getState().getShowPostbackErrorBanner(), conversationScreenView.rendering.getState().getPostbackErrorText(), conversationScreenView.rendering.getState().getMessagingTheme(), conversationScreenView.rendering.getState().getAuthorizationToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit messageLogViewRenderingUpdate$lambda$9$lambda$6(ConversationScreenView conversationScreenView, boolean z11) {
        Conversation conversation = conversationScreenView.rendering.getState().getConversation();
        if (conversation != null && z11) {
            conversationScreenView.loadMoreMessages(conversation);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit messageLogViewRenderingUpdate$lambda$9$lambda$8(ConversationScreenView conversationScreenView) {
        Conversation conversation = conversationScreenView.rendering.getState().getConversation();
        if (conversation != null && conversation.getMessages().size() >= 100) {
            conversationScreenView.loadMoreMessages(conversation);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerRendering postbackFailureBannerRenderingUpdate$lambda$21(ConversationScreenView conversationScreenView, Context context, ButtonBannerRendering buttonBannerRendering) {
        buttonBannerRendering.getClass();
        String string = context.getString(R.string.zuia_postback_error_banner_message, a0.p("<b>", conversationScreenView.rendering.getState().getPostbackErrorText(), "</b>"));
        string.getClass();
        Spanned spannedFromHtml = Html.fromHtml(string, 63);
        spannedFromHtml.getClass();
        return buttonBannerRendering.toBuilder().state(new m(1, conversationScreenView, spannedFromHtml)).onViewDismissed(new s(conversationScreenView, 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerState postbackFailureBannerRenderingUpdate$lambda$21$lambda$19(ConversationScreenView conversationScreenView, Spanned spanned, ButtonBannerState buttonBannerState) {
        buttonBannerState.getClass();
        ButtonBannerViewType buttonBannerViewType = ButtonBannerViewType.FAILED_BANNER;
        boolean showPostbackErrorBanner = conversationScreenView.rendering.getState().getShowPostbackErrorBanner();
        int errorColor = conversationScreenView.rendering.getState().getMessagingTheme().getErrorColor();
        int onErrorColor = conversationScreenView.rendering.getState().getMessagingTheme().getOnErrorColor();
        int onErrorColor2 = conversationScreenView.rendering.getState().getMessagingTheme().getOnErrorColor();
        return ButtonBannerState.copy$default(buttonBannerState, buttonBannerViewType, null, Boolean.valueOf(showPostbackErrorBanner), Integer.valueOf(onErrorColor), null, Integer.valueOf(errorColor), Integer.valueOf(onErrorColor2), spanned, conversationScreenView.rendering.getState().getShowPostbackErrorBanner(), 18, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postbackFailureBannerRenderingUpdate$lambda$21$lambda$20(ConversationScreenView conversationScreenView) {
        conversationScreenView.rendering.getOnPostbackFailedDismissedListener$zendesk_messaging_messaging_android().invoke();
        return Unit.f26487a;
    }

    private final void renderWaitTimeBanner(WaitTimeBannerType waitTimeBannerType, boolean isFormFocused) {
        if (isFormFocused) {
            this.waitTimeBannerView.setVisibility(8);
            return;
        }
        if ((waitTimeBannerType instanceof WaitTimeBannerType.Queued) || Intrinsics.areEqual(waitTimeBannerType, WaitTimeBannerType.Assigned.INSTANCE)) {
            this.waitTimeBannerView.render(this.waitTimeBannerViewRenderingUpdate);
            this.waitTimeBannerView.setVisibility(0);
        } else if (waitTimeBannerType instanceof WaitTimeBannerType.Cleared) {
            this.waitTimeBannerView.setVisibility(8);
        } else {
            e40.a.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorRendering retryErrorViewRenderingUpdate$lambda$18(Context context, ConversationScreenView conversationScreenView, RetryErrorRendering retryErrorRendering) {
        retryErrorRendering.getClass();
        String string = context.getString(zendesk.ui.android.R.string.zuia_load_more_messages_failed_to_load);
        string.getClass();
        return retryErrorRendering.toBuilder().state(new j(conversationScreenView, context, string, 2)).onButtonClicked(new s(conversationScreenView, 0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorState retryErrorViewRenderingUpdate$lambda$18$lambda$16(ConversationScreenView conversationScreenView, Context context, String str, RetryErrorState retryErrorState) {
        retryErrorState.getClass();
        int onBackgroundColor = conversationScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor();
        String string = context.getString(R.string.zuia_conversation_message_label_tap_to_retry);
        string.getClass();
        return retryErrorState.copy(str, conversationScreenView.rendering.getState().getMessagingTheme().getOnBackgroundColor(), string, onBackgroundColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryErrorViewRenderingUpdate$lambda$18$lambda$17(ConversationScreenView conversationScreenView) {
        conversationScreenView.rendering.getOnRetryLoadConversationClicked$zendesk_messaging_messaging_android().invoke();
        return Unit.f26487a;
    }

    private final void setState(ScreenState state) {
        this.messageLogView.setVisibility(state == ScreenState.DEFAULT ? 0 : 8);
        this.loadingIndicatorView.setVisibility(state == ScreenState.LOADING ? 0 : 8);
        this.retryErrorView.setVisibility(state == ScreenState.RETRY ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaitTimeBannerRendering waitTimeBannerViewRenderingUpdate$lambda$23(ConversationScreenView conversationScreenView, WaitTimeBannerRendering waitTimeBannerRendering) {
        waitTimeBannerRendering.getClass();
        return waitTimeBannerRendering.toBuilder().state(new q(conversationScreenView, 3)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaitTimeBannerState waitTimeBannerViewRenderingUpdate$lambda$23$lambda$22(ConversationScreenView conversationScreenView, WaitTimeBannerState waitTimeBannerState) {
        waitTimeBannerState.getClass();
        return waitTimeBannerState.copy(conversationScreenView.rendering.getState().getWaitTimeBannerType(), conversationScreenView.rendering.getState().getMessagingTheme().getCardColor(), conversationScreenView.rendering.getState().getMessagingTheme().getOnCardColor(), conversationScreenView.rendering.getState().getMessagingTheme().getOnSecondaryAction());
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ConversationScreenRendering, ? extends ConversationScreenRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ConversationScreenRendering conversationScreenRendering = (ConversationScreenRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = conversationScreenRendering;
        Logger.i(LOG_TAG, "Updating the Conversation Screen with " + conversationScreenRendering.getState(), new Object[0]);
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.rendering.getState().getStatus().ordinal()];
        if (i11 == 1) {
            setState(ScreenState.DEFAULT);
        } else if (i11 != 2) {
            setState(ScreenState.LOADING);
        } else {
            setState(ScreenState.RETRY);
        }
        setBackgroundColor(this.rendering.getState().getMessagingTheme().getBackgroundColor());
        this.conversationHeaderView.render(this.conversationHeaderRenderingUpdate);
        this.connectionBannerView.render(this.connectionBannerRenderingUpdate);
        this.messageLogView.render(this.messageLogViewRenderingUpdate);
        this.messageComposerView.render(this.messageComposerRenderingUpdate);
        renderWaitTimeBanner(this.rendering.getState().getWaitTimeBannerType(), this.rendering.getState().isFormFocused());
        this.deniedPermissionBottomSheetView.render(this.deniedPermissionBottomSheetRenderingUpdate);
        this.loadingIndicatorView.render(this.loadingIndicatorRenderingUpdate);
        if (this.retryErrorView.getVisibility() == 0) {
            this.retryErrorView.render(this.retryErrorViewRenderingUpdate);
        }
        this.postbackBannerView.render(this.postbackFailureBannerRenderingUpdate);
        applyWindowInsetsToScreenContent();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ConversationScreenView$Companion;", "", "<init>", "()V", "LOG_TAG", "", "COMPOSER_MAX_LENGTH", "", "MAX_CONVERSATION_LIST_NUM", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationScreenView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ConversationScreenView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationScreenView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
