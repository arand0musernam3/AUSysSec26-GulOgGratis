package zendesk.ui.android.conversation.bottomsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.conversationscreen.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering;", "", "builder", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering$Builder;", "<init>", "(Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering$Builder;)V", "()V", "onBottomSheetActionClicked", "Lkotlin/Function0;", "", "getOnBottomSheetActionClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "onBottomSheetDismissed", "getOnBottomSheetDismissed$zendesk_ui_ui_android", "state", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/bottomsheet/BottomSheetState;", "toBuilder", "Builder", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BottomSheetRendering {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "BottomSheetRendering";

    @NotNull
    private final Function0<Unit> onBottomSheetActionClicked;

    @NotNull
    private final Function0<Unit> onBottomSheetDismissed;

    @NotNull
    private final BottomSheetState state;

    public BottomSheetRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onBottomSheetActionClicked = builder.getOnBottomSheetActionClicked$zendesk_ui_ui_android();
        this.onBottomSheetDismissed = builder.getOnBottomSheetDismissed$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function0<Unit> getOnBottomSheetActionClicked$zendesk_ui_ui_android() {
        return this.onBottomSheetActionClicked;
    }

    @NotNull
    public final Function0<Unit> getOnBottomSheetDismissed$zendesk_ui_ui_android() {
        return this.onBottomSheetDismissed;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final BottomSheetState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BottomSheetRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0018J\u0006\u0010\u0019\u001a\u00020\u0005R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering;", "(Lzendesk/ui/android/conversation/bottomsheet/BottomSheetRendering;)V", "onBottomSheetActionClicked", "Lkotlin/Function0;", "", "getOnBottomSheetActionClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnBottomSheetActionClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "onBottomSheetDismissed", "getOnBottomSheetDismissed$zendesk_ui_ui_android", "setOnBottomSheetDismissed$zendesk_ui_ui_android", "state", "Lzendesk/ui/android/conversation/bottomsheet/BottomSheetState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/bottomsheet/BottomSheetState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/bottomsheet/BottomSheetState;)V", "stateUpdate", "Lkotlin/Function1;", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function0<Unit> onBottomSheetActionClicked;

        @NotNull
        private Function0<Unit> onBottomSheetDismissed;

        @NotNull
        private BottomSheetState state;

        public Builder() {
            this.onBottomSheetActionClicked = new n(28);
            this.onBottomSheetDismissed = new n(29);
            this.state = new BottomSheetState(null, null, 0L, false, null, null, null, 127, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBottomSheetActionClicked$lambda$0() {
            Logger.w(BottomSheetRendering.LOG_TAG, "BottomSheetRendering#onBottomSheetActionClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBottomSheetDismissed$lambda$1() {
            Logger.w(BottomSheetRendering.LOG_TAG, "BottomSheetRendering#onBottomSheetDismissed == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final BottomSheetRendering build() {
            return new BottomSheetRendering(this);
        }

        @NotNull
        public final Function0<Unit> getOnBottomSheetActionClicked$zendesk_ui_ui_android() {
            return this.onBottomSheetActionClicked;
        }

        @NotNull
        public final Function0<Unit> getOnBottomSheetDismissed$zendesk_ui_ui_android() {
            return this.onBottomSheetDismissed;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final BottomSheetState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onBottomSheetActionClicked(@NotNull Function0<Unit> onBottomSheetActionClicked) {
            onBottomSheetActionClicked.getClass();
            this.onBottomSheetActionClicked = onBottomSheetActionClicked;
            return this;
        }

        @NotNull
        public final Builder onBottomSheetDismissed(@NotNull Function0<Unit> onBottomSheetDismissed) {
            onBottomSheetDismissed.getClass();
            this.onBottomSheetDismissed = onBottomSheetDismissed;
            return this;
        }

        public final void setOnBottomSheetActionClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onBottomSheetActionClicked = function0;
        }

        public final void setOnBottomSheetDismissed$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onBottomSheetDismissed = function0;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull BottomSheetState bottomSheetState) {
            bottomSheetState.getClass();
            this.state = bottomSheetState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super BottomSheetState, BottomSheetState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (BottomSheetState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull BottomSheetRendering bottomSheetRendering) {
            this();
            bottomSheetRendering.getClass();
            this.onBottomSheetActionClicked = bottomSheetRendering.getOnBottomSheetActionClicked$zendesk_ui_ui_android();
            this.onBottomSheetDismissed = bottomSheetRendering.getOnBottomSheetDismissed$zendesk_ui_ui_android();
            this.state = bottomSheetRendering.getState();
        }

        public /* synthetic */ Builder(BottomSheetRendering bottomSheetRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new BottomSheetRendering() : bottomSheetRendering);
        }
    }
}
