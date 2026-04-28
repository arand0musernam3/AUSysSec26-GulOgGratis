package zendesk.ui.android.conversation.composer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lzendesk/ui/android/conversation/composer/MessageComposerRendering;", "", "builder", "Lzendesk/ui/android/conversation/composer/MessageComposerRendering$Builder;", "<init>", "(Lzendesk/ui/android/conversation/composer/MessageComposerRendering$Builder;)V", "()V", "onSendButtonClicked", "Lkotlin/Function1;", "", "", "getOnSendButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "onAttachButtonClicked", "", "getOnAttachButtonClicked$zendesk_ui_ui_android", "onTyping", "Lkotlin/Function0;", "getOnTyping$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "onTextChanged", "getOnTextChanged$zendesk_ui_ui_android", "state", "Lzendesk/ui/android/conversation/composer/MessageComposerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/composer/MessageComposerState;", "toBuilder", "Builder", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageComposerRendering {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "MessageComposerRendering";

    @NotNull
    private final Function1<Integer, Unit> onAttachButtonClicked;

    @NotNull
    private final Function1<String, Unit> onSendButtonClicked;

    @NotNull
    private final Function1<String, Unit> onTextChanged;

    @NotNull
    private final Function0<Unit> onTyping;

    @NotNull
    private final MessageComposerState state;

    public MessageComposerRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onSendButtonClicked = builder.getOnSendButtonClicked$zendesk_ui_ui_android();
        this.onAttachButtonClicked = builder.getOnAttachButtonClicked$zendesk_ui_ui_android();
        this.onTyping = builder.getOnTyping$zendesk_ui_ui_android();
        this.onTextChanged = builder.getOnTextChanged$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function1<Integer, Unit> getOnAttachButtonClicked$zendesk_ui_ui_android() {
        return this.onAttachButtonClicked;
    }

    @NotNull
    public final Function1<String, Unit> getOnSendButtonClicked$zendesk_ui_ui_android() {
        return this.onSendButtonClicked;
    }

    @NotNull
    public final Function1<String, Unit> getOnTextChanged$zendesk_ui_ui_android() {
        return this.onTextChanged;
    }

    @NotNull
    public final Function0<Unit> getOnTyping$zendesk_ui_ui_android() {
        return this.onTyping;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final MessageComposerState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/composer/MessageComposerRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MessageComposerRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\u001a\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\bJ\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014J\u001a\u0010\u0019\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\u001a\u0010\u001c\u001a\u00020\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\bJ\u0006\u0010$\u001a\u00020\u0005R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lzendesk/ui/android/conversation/composer/MessageComposerRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/conversation/composer/MessageComposerRendering;", "(Lzendesk/ui/android/conversation/composer/MessageComposerRendering;)V", "onSendButtonClicked", "Lkotlin/Function1;", "", "", "getOnSendButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "setOnSendButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function1;)V", "onAttachButtonClicked", "", "getOnAttachButtonClicked$zendesk_ui_ui_android", "setOnAttachButtonClicked$zendesk_ui_ui_android", "onTyping", "Lkotlin/Function0;", "getOnTyping$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnTyping$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "onTextChanged", "getOnTextChanged$zendesk_ui_ui_android", "setOnTextChanged$zendesk_ui_ui_android", "state", "Lzendesk/ui/android/conversation/composer/MessageComposerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/composer/MessageComposerState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/composer/MessageComposerState;)V", "onTextChanges", "stateUpdate", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function1<? super Integer, Unit> onAttachButtonClicked;

        @NotNull
        private Function1<? super String, Unit> onSendButtonClicked;

        @NotNull
        private Function1<? super String, Unit> onTextChanged;

        @NotNull
        private Function0<Unit> onTyping;

        @NotNull
        private MessageComposerState state;

        public Builder() {
            this.onSendButtonClicked = new zendesk.ui.android.conversation.articleviewer.b(10);
            this.onAttachButtonClicked = new zendesk.ui.android.conversation.articleviewer.b(11);
            this.onTyping = new b(0);
            this.onTextChanged = new zendesk.ui.android.conversation.articleviewer.b(12);
            this.state = new MessageComposerState(false, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 16383, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAttachButtonClicked$lambda$1(int i11) {
            Logger.w(MessageComposerRendering.LOG_TAG, "MessageComposerRendering#onAttachButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onSendButtonClicked$lambda$0(String str) {
            str.getClass();
            Logger.w(MessageComposerRendering.LOG_TAG, "MessageComposerRendering#onSendButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onTextChanged$lambda$3(String str) {
            str.getClass();
            Logger.w(MessageComposerRendering.LOG_TAG, "MessageComposerRendering#onTextChanged == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onTyping$lambda$2() {
            Logger.w(MessageComposerRendering.LOG_TAG, "MessageComposerRendering#onTyping == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final MessageComposerRendering build() {
            return new MessageComposerRendering(this);
        }

        @NotNull
        public final Function1<Integer, Unit> getOnAttachButtonClicked$zendesk_ui_ui_android() {
            return this.onAttachButtonClicked;
        }

        @NotNull
        public final Function1<String, Unit> getOnSendButtonClicked$zendesk_ui_ui_android() {
            return this.onSendButtonClicked;
        }

        @NotNull
        public final Function1<String, Unit> getOnTextChanged$zendesk_ui_ui_android() {
            return this.onTextChanged;
        }

        @NotNull
        public final Function0<Unit> getOnTyping$zendesk_ui_ui_android() {
            return this.onTyping;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final MessageComposerState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onAttachButtonClicked(@NotNull Function1<? super Integer, Unit> onAttachButtonClicked) {
            onAttachButtonClicked.getClass();
            this.onAttachButtonClicked = onAttachButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onSendButtonClicked(@NotNull Function1<? super String, Unit> onSendButtonClicked) {
            onSendButtonClicked.getClass();
            this.onSendButtonClicked = onSendButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onTextChanged(@NotNull Function1<? super String, Unit> onTextChanges) {
            onTextChanges.getClass();
            this.onTextChanged = onTextChanges;
            return this;
        }

        @NotNull
        public final Builder onTyping(@NotNull Function0<Unit> onTyping) {
            onTyping.getClass();
            this.onTyping = onTyping;
            return this;
        }

        public final void setOnAttachButtonClicked$zendesk_ui_ui_android(@NotNull Function1<? super Integer, Unit> function1) {
            function1.getClass();
            this.onAttachButtonClicked = function1;
        }

        public final void setOnSendButtonClicked$zendesk_ui_ui_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onSendButtonClicked = function1;
        }

        public final void setOnTextChanged$zendesk_ui_ui_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onTextChanged = function1;
        }

        public final void setOnTyping$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onTyping = function0;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull MessageComposerState messageComposerState) {
            messageComposerState.getClass();
            this.state = messageComposerState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super MessageComposerState, MessageComposerState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (MessageComposerState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull MessageComposerRendering messageComposerRendering) {
            this();
            messageComposerRendering.getClass();
            this.onSendButtonClicked = messageComposerRendering.getOnSendButtonClicked$zendesk_ui_ui_android();
            this.onTyping = messageComposerRendering.getOnTyping$zendesk_ui_ui_android();
            this.onTextChanged = messageComposerRendering.getOnTextChanged$zendesk_ui_ui_android();
            this.state = messageComposerRendering.getState();
        }

        public /* synthetic */ Builder(MessageComposerRendering messageComposerRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new MessageComposerRendering() : messageComposerRendering);
        }
    }
}
