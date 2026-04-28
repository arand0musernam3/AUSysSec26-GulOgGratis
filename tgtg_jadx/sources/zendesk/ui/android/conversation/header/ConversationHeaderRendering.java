package zendesk.ui.android.conversation.header;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0003R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lzendesk/ui/android/conversation/header/ConversationHeaderRendering;", "", "builder", "Lzendesk/ui/android/conversation/header/ConversationHeaderRendering$Builder;", "<init>", "(Lzendesk/ui/android/conversation/header/ConversationHeaderRendering$Builder;)V", "()V", "onBackButtonClicked", "Lkotlin/Function0;", "", "Lzendesk/ui/android/conversation/header/OnClickLambda;", "getOnBackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "state", "Lzendesk/ui/android/conversation/header/ConversationHeaderState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/header/ConversationHeaderState;", "toBuilder", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationHeaderRendering {
    public static final int $stable = 8;

    @Nullable
    private final Function0<Unit> onBackButtonClicked;

    @NotNull
    private final ConversationHeaderState state;

    public ConversationHeaderRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onBackButtonClicked = builder.getOnBackButtonClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @Nullable
    public final Function0<Unit> getOnBackButtonClicked$zendesk_ui_ui_android() {
        return this.onBackButtonClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ConversationHeaderState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    public ConversationHeaderRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nJ\u001a\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0016J\u0006\u0010\u0017\u001a\u00020\u0005R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lzendesk/ui/android/conversation/header/ConversationHeaderRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/conversation/header/ConversationHeaderRendering;", "(Lzendesk/ui/android/conversation/header/ConversationHeaderRendering;)V", "onBackButtonClicked", "Lkotlin/Function0;", "", "Lzendesk/ui/android/conversation/header/OnClickLambda;", "getOnBackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnBackButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "state", "Lzendesk/ui/android/conversation/header/ConversationHeaderState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/header/ConversationHeaderState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/header/ConversationHeaderState;)V", "stateUpdate", "Lkotlin/Function1;", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private Function0<Unit> onBackButtonClicked;

        @NotNull
        private ConversationHeaderState state;

        public Builder() {
            this.state = new ConversationHeaderState(null, null, null, null, null, null, null, null, 255, null);
        }

        @NotNull
        public final ConversationHeaderRendering build() {
            return new ConversationHeaderRendering(this);
        }

        @Nullable
        public final Function0<Unit> getOnBackButtonClicked$zendesk_ui_ui_android() {
            return this.onBackButtonClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ConversationHeaderState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onBackButtonClicked(@Nullable Function0<Unit> onBackButtonClicked) {
            this.onBackButtonClicked = onBackButtonClicked;
            return this;
        }

        public final void setOnBackButtonClicked$zendesk_ui_ui_android(@Nullable Function0<Unit> function0) {
            this.onBackButtonClicked = function0;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ConversationHeaderState conversationHeaderState) {
            conversationHeaderState.getClass();
            this.state = conversationHeaderState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ConversationHeaderState, ConversationHeaderState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ConversationHeaderState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ConversationHeaderRendering conversationHeaderRendering) {
            this();
            conversationHeaderRendering.getClass();
            this.onBackButtonClicked = conversationHeaderRendering.getOnBackButtonClicked$zendesk_ui_ui_android();
            this.state = conversationHeaderRendering.getState();
        }

        public /* synthetic */ Builder(ConversationHeaderRendering conversationHeaderRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ConversationHeaderRendering() : conversationHeaderRendering);
        }
    }
}
