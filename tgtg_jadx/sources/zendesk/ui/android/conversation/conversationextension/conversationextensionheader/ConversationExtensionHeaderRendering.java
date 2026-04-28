package zendesk.ui.android.conversation.conversationextension.conversationextensionheader;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;
import zendesk.ui.android.conversation.articleviewer.b;
import zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering;", "", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering$Builder;", "builder", "<init>", "(Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering$Builder;", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState$ButtonName;", "", "onMenuItemClicked", "Lkotlin/jvm/functions/Function1;", "getOnMenuItemClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState;", "state", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState;", "Companion", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationExtensionHeaderRendering {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ConversationExtensionHeaderRendering";

    @NotNull
    private final Function1<ConversationExtensionHeaderState.ButtonName, Unit> onMenuItemClicked;

    @NotNull
    private final ConversationExtensionHeaderState state;

    public ConversationExtensionHeaderRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onMenuItemClicked = builder.getOnMenuItemClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function1<ConversationExtensionHeaderState.ButtonName, Unit> getOnMenuItemClicked$zendesk_ui_ui_android() {
        return this.onMenuItemClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ConversationExtensionHeaderState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ConversationExtensionHeaderRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u000e\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering$Builder;", "", "<init>", "()V", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering;", "rendering", "(Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering;)V", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState$ButtonName;", "", "onMenuItemClicked", "(Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering$Builder;", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState;", "stateUpdate", "state", "build", "()Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderRendering;", "Lkotlin/jvm/functions/Function1;", "getOnMenuItemClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "setOnMenuItemClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function1;)V", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderState;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function1<? super ConversationExtensionHeaderState.ButtonName, Unit> onMenuItemClicked;

        @NotNull
        private ConversationExtensionHeaderState state;

        public Builder() {
            this.onMenuItemClicked = new b(16);
            this.state = new ConversationExtensionHeaderState(0, 0, 0, 0, false, null, 0, 127, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onMenuItemClicked$lambda$0(ConversationExtensionHeaderState.ButtonName buttonName) {
            buttonName.getClass();
            Logger.w(ConversationExtensionHeaderRendering.LOG_TAG, "onMenuItemClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final ConversationExtensionHeaderRendering build() {
            return new ConversationExtensionHeaderRendering(this);
        }

        @NotNull
        public final Function1<ConversationExtensionHeaderState.ButtonName, Unit> getOnMenuItemClicked$zendesk_ui_ui_android() {
            return this.onMenuItemClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ConversationExtensionHeaderState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onMenuItemClicked(@NotNull Function1<? super ConversationExtensionHeaderState.ButtonName, Unit> onMenuItemClicked) {
            onMenuItemClicked.getClass();
            this.onMenuItemClicked = onMenuItemClicked;
            return this;
        }

        public final void setOnMenuItemClicked$zendesk_ui_ui_android(@NotNull Function1<? super ConversationExtensionHeaderState.ButtonName, Unit> function1) {
            function1.getClass();
            this.onMenuItemClicked = function1;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ConversationExtensionHeaderState conversationExtensionHeaderState) {
            conversationExtensionHeaderState.getClass();
            this.state = conversationExtensionHeaderState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ConversationExtensionHeaderState, ConversationExtensionHeaderState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ConversationExtensionHeaderState) stateUpdate.invoke(this.state);
            return this;
        }

        public /* synthetic */ Builder(ConversationExtensionHeaderRendering conversationExtensionHeaderRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ConversationExtensionHeaderRendering() : conversationExtensionHeaderRendering);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ConversationExtensionHeaderRendering conversationExtensionHeaderRendering) {
            this();
            conversationExtensionHeaderRendering.getClass();
            this.onMenuItemClicked = conversationExtensionHeaderRendering.getOnMenuItemClicked$zendesk_ui_ui_android();
            this.state = conversationExtensionHeaderRendering.getState();
        }
    }
}
