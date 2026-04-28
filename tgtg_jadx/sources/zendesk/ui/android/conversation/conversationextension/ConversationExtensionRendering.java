package zendesk.ui.android.conversation.conversationextension;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR(\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\n0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u001a\u0010\"\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering;", "", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering$Builder;", "builder", "<init>", "(Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering$Builder;", "Lkotlin/Function0;", "", "onRetryButtonClicked", "Lkotlin/jvm/functions/Function0;", "getOnRetryButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "onCloseButtonClicked", "getOnCloseButtonClicked$zendesk_ui_ui_android", "onWebSdkClose", "getOnWebSdkClose$zendesk_ui_ui_android", "Lkotlin/Function1;", "", "onWebSdkUpdateTitle", "Lkotlin/jvm/functions/Function1;", "getOnWebSdkUpdateTitle$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "onWebViewError", "getOnWebViewError$zendesk_ui_ui_android", "onUrlUpdated", "getOnUrlUpdated$zendesk_ui_ui_android", "onPageLoadingComplete", "getOnPageLoadingComplete$zendesk_ui_ui_android", "onBackButtonClicked", "getOnBackButtonClicked$zendesk_ui_ui_android", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionState;", "state", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionState;", "Companion", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationExtensionRendering {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ConversationExtensionRendering";

    @NotNull
    private final Function0<Unit> onBackButtonClicked;

    @NotNull
    private final Function0<Unit> onCloseButtonClicked;

    @NotNull
    private final Function0<Unit> onPageLoadingComplete;

    @NotNull
    private final Function0<Unit> onRetryButtonClicked;

    @NotNull
    private final Function1<String, Unit> onUrlUpdated;

    @NotNull
    private final Function0<Unit> onWebSdkClose;

    @NotNull
    private final Function1<String, Unit> onWebSdkUpdateTitle;

    @NotNull
    private final Function0<Unit> onWebViewError;

    @NotNull
    private final ConversationExtensionState state;

    public ConversationExtensionRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onRetryButtonClicked = builder.getOnRetryButtonClicked$zendesk_ui_ui_android();
        this.onCloseButtonClicked = builder.getOnCloseButtonClicked$zendesk_ui_ui_android();
        this.onWebSdkClose = builder.getOnWebSdkClose$zendesk_ui_ui_android();
        this.onWebSdkUpdateTitle = builder.getOnWebSdkUpdateTitle$zendesk_ui_ui_android();
        this.onWebViewError = builder.getOnWebViewError$zendesk_ui_ui_android();
        this.onUrlUpdated = builder.getOnUrlUpdated$zendesk_ui_ui_android();
        this.onPageLoadingComplete = builder.getOnPageLoadingComplete$zendesk_ui_ui_android();
        this.onBackButtonClicked = builder.getOnBackButtonClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function0<Unit> getOnBackButtonClicked$zendesk_ui_ui_android() {
        return this.onBackButtonClicked;
    }

    @NotNull
    public final Function0<Unit> getOnCloseButtonClicked$zendesk_ui_ui_android() {
        return this.onCloseButtonClicked;
    }

    @NotNull
    public final Function0<Unit> getOnPageLoadingComplete$zendesk_ui_ui_android() {
        return this.onPageLoadingComplete;
    }

    @NotNull
    public final Function0<Unit> getOnRetryButtonClicked$zendesk_ui_ui_android() {
        return this.onRetryButtonClicked;
    }

    @NotNull
    public final Function1<String, Unit> getOnUrlUpdated$zendesk_ui_ui_android() {
        return this.onUrlUpdated;
    }

    @NotNull
    public final Function0<Unit> getOnWebSdkClose$zendesk_ui_ui_android() {
        return this.onWebSdkClose;
    }

    @NotNull
    public final Function1<String, Unit> getOnWebSdkUpdateTitle$zendesk_ui_ui_android() {
        return this.onWebSdkUpdateTitle;
    }

    @NotNull
    public final Function0<Unit> getOnWebViewError$zendesk_ui_ui_android() {
        return this.onWebViewError;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ConversationExtensionState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ConversationExtensionRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\nJ#\u0010\u0010\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0013\u0010\nJ\u001b\u0010\u0014\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0014\u0010\nJ!\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u000e¢\u0006\u0004\b\u0017\u0010\u0011J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR0\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\"\u0010\u0017\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00065"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering$Builder;", "", "<init>", "()V", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering;", "rendering", "(Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering;)V", "Lkotlin/Function0;", "", "onRetryButtonClicked", "(Lkotlin/jvm/functions/Function0;)Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering$Builder;", "onCloseButtonClicked", "onWebSdkClose", "onWebViewError", "Lkotlin/Function1;", "", "onWebSdkUpdateTitle", "(Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering$Builder;", "onUrlUpdated", "onPageLoadingComplete", "onBackButtonClicked", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionState;", "stateUpdate", "state", "build", "()Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering;", "Lkotlin/jvm/functions/Function0;", "getOnRetryButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnRetryButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "getOnCloseButtonClicked$zendesk_ui_ui_android", "setOnCloseButtonClicked$zendesk_ui_ui_android", "getOnWebSdkClose$zendesk_ui_ui_android", "setOnWebSdkClose$zendesk_ui_ui_android", "getOnWebViewError$zendesk_ui_ui_android", "setOnWebViewError$zendesk_ui_ui_android", "Lkotlin/jvm/functions/Function1;", "getOnWebSdkUpdateTitle$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "setOnWebSdkUpdateTitle$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function1;)V", "getOnUrlUpdated$zendesk_ui_ui_android", "setOnUrlUpdated$zendesk_ui_ui_android", "getOnPageLoadingComplete$zendesk_ui_ui_android", "setOnPageLoadingComplete$zendesk_ui_ui_android", "getOnBackButtonClicked$zendesk_ui_ui_android", "setOnBackButtonClicked$zendesk_ui_ui_android", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionState;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function0<Unit> onBackButtonClicked;

        @NotNull
        private Function0<Unit> onCloseButtonClicked;

        @NotNull
        private Function0<Unit> onPageLoadingComplete;

        @NotNull
        private Function0<Unit> onRetryButtonClicked;

        @NotNull
        private Function1<? super String, Unit> onUrlUpdated;

        @NotNull
        private Function0<Unit> onWebSdkClose;

        @NotNull
        private Function1<? super String, Unit> onWebSdkUpdateTitle;

        @NotNull
        private Function0<Unit> onWebViewError;

        @NotNull
        private ConversationExtensionState state;

        public Builder() {
            this.onRetryButtonClicked = new zendesk.ui.android.conversation.composer.b(1);
            this.onCloseButtonClicked = new zendesk.ui.android.conversation.composer.b(2);
            this.onWebSdkClose = new zendesk.ui.android.conversation.composer.b(3);
            this.onWebViewError = new zendesk.ui.android.conversation.composer.b(4);
            this.onWebSdkUpdateTitle = new zendesk.ui.android.conversation.articleviewer.b(14);
            this.onUrlUpdated = new zendesk.ui.android.conversation.articleviewer.b(15);
            this.onPageLoadingComplete = new zendesk.ui.android.conversation.composer.b(5);
            this.onBackButtonClicked = new zendesk.ui.android.conversation.composer.b(6);
            this.state = new ConversationExtensionState(null, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, false, 8191, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBackButtonClicked$lambda$7() {
            Logger.w(ConversationExtensionRendering.LOG_TAG, "onBackButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCloseButtonClicked$lambda$1() {
            Logger.w(ConversationExtensionRendering.LOG_TAG, "onCloseButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onPageLoadingComplete$lambda$6() {
            Logger.w(ConversationExtensionRendering.LOG_TAG, "onPageLoadingComplete == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onRetryButtonClicked$lambda$0() {
            Logger.w(ConversationExtensionRendering.LOG_TAG, "onRetryButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onUrlUpdated$lambda$5(String str) {
            str.getClass();
            Logger.w(ConversationExtensionRendering.LOG_TAG, "onUrlUpdated == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWebSdkClose$lambda$2() {
            Logger.w(ConversationExtensionRendering.LOG_TAG, "onWebSdkClose == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWebSdkUpdateTitle$lambda$4(String str) {
            Logger.w(ConversationExtensionRendering.LOG_TAG, "onWebSdkUpdateTitle == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWebViewError$lambda$3() {
            Logger.w(ConversationExtensionRendering.LOG_TAG, "onWebViewError == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final ConversationExtensionRendering build() {
            return new ConversationExtensionRendering(this);
        }

        @NotNull
        public final Function0<Unit> getOnBackButtonClicked$zendesk_ui_ui_android() {
            return this.onBackButtonClicked;
        }

        @NotNull
        public final Function0<Unit> getOnCloseButtonClicked$zendesk_ui_ui_android() {
            return this.onCloseButtonClicked;
        }

        @NotNull
        public final Function0<Unit> getOnPageLoadingComplete$zendesk_ui_ui_android() {
            return this.onPageLoadingComplete;
        }

        @NotNull
        public final Function0<Unit> getOnRetryButtonClicked$zendesk_ui_ui_android() {
            return this.onRetryButtonClicked;
        }

        @NotNull
        public final Function1<String, Unit> getOnUrlUpdated$zendesk_ui_ui_android() {
            return this.onUrlUpdated;
        }

        @NotNull
        public final Function0<Unit> getOnWebSdkClose$zendesk_ui_ui_android() {
            return this.onWebSdkClose;
        }

        @NotNull
        public final Function1<String, Unit> getOnWebSdkUpdateTitle$zendesk_ui_ui_android() {
            return this.onWebSdkUpdateTitle;
        }

        @NotNull
        public final Function0<Unit> getOnWebViewError$zendesk_ui_ui_android() {
            return this.onWebViewError;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ConversationExtensionState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onBackButtonClicked(@NotNull Function0<Unit> onBackButtonClicked) {
            onBackButtonClicked.getClass();
            this.onBackButtonClicked = onBackButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onCloseButtonClicked(@NotNull Function0<Unit> onCloseButtonClicked) {
            onCloseButtonClicked.getClass();
            this.onCloseButtonClicked = onCloseButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onPageLoadingComplete(@NotNull Function0<Unit> onPageLoadingComplete) {
            onPageLoadingComplete.getClass();
            this.onPageLoadingComplete = onPageLoadingComplete;
            return this;
        }

        @NotNull
        public final Builder onRetryButtonClicked(@NotNull Function0<Unit> onRetryButtonClicked) {
            onRetryButtonClicked.getClass();
            this.onRetryButtonClicked = onRetryButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onUrlUpdated(@NotNull Function1<? super String, Unit> onUrlUpdated) {
            onUrlUpdated.getClass();
            this.onUrlUpdated = onUrlUpdated;
            return this;
        }

        @NotNull
        public final Builder onWebSdkClose(@NotNull Function0<Unit> onWebSdkClose) {
            onWebSdkClose.getClass();
            this.onWebSdkClose = onWebSdkClose;
            return this;
        }

        @NotNull
        public final Builder onWebSdkUpdateTitle(@NotNull Function1<? super String, Unit> onWebSdkUpdateTitle) {
            onWebSdkUpdateTitle.getClass();
            this.onWebSdkUpdateTitle = onWebSdkUpdateTitle;
            return this;
        }

        @NotNull
        public final Builder onWebViewError(@NotNull Function0<Unit> onWebViewError) {
            onWebViewError.getClass();
            this.onWebViewError = onWebViewError;
            return this;
        }

        public final void setOnBackButtonClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onBackButtonClicked = function0;
        }

        public final void setOnCloseButtonClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onCloseButtonClicked = function0;
        }

        public final void setOnPageLoadingComplete$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onPageLoadingComplete = function0;
        }

        public final void setOnRetryButtonClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onRetryButtonClicked = function0;
        }

        public final void setOnUrlUpdated$zendesk_ui_ui_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onUrlUpdated = function1;
        }

        public final void setOnWebSdkClose$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onWebSdkClose = function0;
        }

        public final void setOnWebSdkUpdateTitle$zendesk_ui_ui_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onWebSdkUpdateTitle = function1;
        }

        public final void setOnWebViewError$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onWebViewError = function0;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ConversationExtensionState conversationExtensionState) {
            conversationExtensionState.getClass();
            this.state = conversationExtensionState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ConversationExtensionState, ConversationExtensionState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ConversationExtensionState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ConversationExtensionRendering conversationExtensionRendering) {
            this();
            conversationExtensionRendering.getClass();
            this.state = conversationExtensionRendering.getState();
        }

        public /* synthetic */ Builder(ConversationExtensionRendering conversationExtensionRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ConversationExtensionRendering() : conversationExtensionRendering);
        }
    }
}
