package zendesk.ui.android.conversation.quickreply;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR4\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering;", "", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering$Builder;", "builder", "<init>", "(Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering$Builder;", "Lkotlin/Function2;", "", "", "Lzendesk/ui/android/conversation/quickreply/OnQuickReplyOptionClickLambda;", "onOptionClicked", "Lkotlin/jvm/functions/Function2;", "getOnOptionClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function2;", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionState;", "state", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionState;", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuickReplyOptionRendering {
    public static final int $stable = 0;

    @Nullable
    private final Function2<String, String, Unit> onOptionClicked;

    @NotNull
    private final QuickReplyOptionState state;

    public QuickReplyOptionRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onOptionClicked = builder.getOnOptionClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @Nullable
    public final Function2<String, String, Unit> getOnOptionClicked$zendesk_ui_ui_android() {
        return this.onOptionClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final QuickReplyOptionState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J/\u0010\u000b\u001a\u00020\u00002 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R<\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0010\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering$Builder;", "", "<init>", "()V", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering;", "rendering", "(Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering;)V", "Lkotlin/Function2;", "", "", "Lzendesk/ui/android/conversation/quickreply/OnQuickReplyOptionClickLambda;", "onOptionClicked", "(Lkotlin/jvm/functions/Function2;)Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering$Builder;", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionState;", "stateUpdate", "state", "(Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering$Builder;", "build", "()Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering;", "Lkotlin/jvm/functions/Function2;", "getOnOptionClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function2;", "setOnOptionClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function2;)V", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionState;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private Function2<? super String, ? super String, Unit> onOptionClicked;

        @NotNull
        private QuickReplyOptionState state;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull QuickReplyOptionRendering quickReplyOptionRendering) {
            this();
            quickReplyOptionRendering.getClass();
            this.onOptionClicked = quickReplyOptionRendering.getOnOptionClicked$zendesk_ui_ui_android();
            this.state = quickReplyOptionRendering.getState();
        }

        @NotNull
        public final QuickReplyOptionRendering build() {
            return new QuickReplyOptionRendering(this);
        }

        @Nullable
        public final Function2<String, String, Unit> getOnOptionClicked$zendesk_ui_ui_android() {
            return this.onOptionClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final QuickReplyOptionState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onOptionClicked(@Nullable Function2<? super String, ? super String, Unit> onOptionClicked) {
            this.onOptionClicked = onOptionClicked;
            return this;
        }

        public final void setOnOptionClicked$zendesk_ui_ui_android(@Nullable Function2<? super String, ? super String, Unit> function2) {
            this.onOptionClicked = function2;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull QuickReplyOptionState quickReplyOptionState) {
            quickReplyOptionState.getClass();
            this.state = quickReplyOptionState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super QuickReplyOptionState, QuickReplyOptionState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (QuickReplyOptionState) stateUpdate.invoke(this.state);
            return this;
        }

        public Builder() {
            this.state = new QuickReplyOptionState(null, null, 0, 0, 15, null);
        }

        public /* synthetic */ Builder(QuickReplyOptionRendering quickReplyOptionRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new QuickReplyOptionRendering() : quickReplyOptionRendering);
        }
    }

    public QuickReplyOptionRendering() {
        this(new Builder());
    }
}
