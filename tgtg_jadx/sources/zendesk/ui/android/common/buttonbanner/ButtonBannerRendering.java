package zendesk.ui.android.common.buttonbanner;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lzendesk/ui/android/common/buttonbanner/ButtonBannerRendering;", "", "builder", "Lzendesk/ui/android/common/buttonbanner/ButtonBannerRendering$Builder;", "<init>", "(Lzendesk/ui/android/common/buttonbanner/ButtonBannerRendering$Builder;)V", "()V", "onViewClicked", "Lkotlin/Function0;", "", "getOnViewClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "onViewDismissed", "getOnViewDismissed$zendesk_ui_ui_android", "state", "Lzendesk/ui/android/common/buttonbanner/ButtonBannerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/common/buttonbanner/ButtonBannerState;", "toBuilder", "Builder", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ButtonBannerRendering {

    @NotNull
    private static final String LOG_TAG = "UnreadMessagesRendering";

    @NotNull
    private final Function0<Unit> onViewClicked;

    @NotNull
    private final Function0<Unit> onViewDismissed;

    @NotNull
    private final ButtonBannerState state;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ButtonBannerRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onViewClicked = builder.getOnViewClicked$zendesk_ui_ui_android();
        this.onViewDismissed = builder.getOnViewDismissed$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function0<Unit> getOnViewClicked$zendesk_ui_ui_android() {
        return this.onViewClicked;
    }

    @NotNull
    public final Function0<Unit> getOnViewDismissed$zendesk_ui_ui_android() {
        return this.onViewDismissed;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ButtonBannerState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/common/buttonbanner/ButtonBannerRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ButtonBannerRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0018J\u0006\u0010\u0019\u001a\u00020\u0005R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lzendesk/ui/android/common/buttonbanner/ButtonBannerRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/common/buttonbanner/ButtonBannerRendering;", "(Lzendesk/ui/android/common/buttonbanner/ButtonBannerRendering;)V", "onViewClicked", "Lkotlin/Function0;", "", "getOnViewClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnViewClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "onViewDismissed", "getOnViewDismissed$zendesk_ui_ui_android", "setOnViewDismissed$zendesk_ui_ui_android", "state", "Lzendesk/ui/android/common/buttonbanner/ButtonBannerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/common/buttonbanner/ButtonBannerState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/common/buttonbanner/ButtonBannerState;)V", "stateUpdate", "Lkotlin/Function1;", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function0<Unit> onViewClicked;

        @NotNull
        private Function0<Unit> onViewDismissed;

        @NotNull
        private ButtonBannerState state;

        public Builder() {
            this.onViewClicked = new n(21);
            this.onViewDismissed = new n(22);
            this.state = new ButtonBannerState(null, null, null, null, null, null, null, null, false, 511, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onViewClicked$lambda$0() {
            Logger.w(ButtonBannerRendering.LOG_TAG, "UnreadMessagesRendering#onViewClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onViewDismissed$lambda$1() {
            Logger.w(ButtonBannerRendering.LOG_TAG, "UnreadMessagesRendering#onViewDismissed == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final ButtonBannerRendering build() {
            return new ButtonBannerRendering(this);
        }

        @NotNull
        public final Function0<Unit> getOnViewClicked$zendesk_ui_ui_android() {
            return this.onViewClicked;
        }

        @NotNull
        public final Function0<Unit> getOnViewDismissed$zendesk_ui_ui_android() {
            return this.onViewDismissed;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ButtonBannerState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onViewClicked(@NotNull Function0<Unit> onViewClicked) {
            onViewClicked.getClass();
            this.onViewClicked = onViewClicked;
            return this;
        }

        @NotNull
        public final Builder onViewDismissed(@NotNull Function0<Unit> onViewDismissed) {
            onViewDismissed.getClass();
            this.onViewDismissed = onViewDismissed;
            return this;
        }

        public final void setOnViewClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onViewClicked = function0;
        }

        public final void setOnViewDismissed$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onViewDismissed = function0;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ButtonBannerState buttonBannerState) {
            buttonBannerState.getClass();
            this.state = buttonBannerState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ButtonBannerState, ButtonBannerState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ButtonBannerState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ButtonBannerRendering buttonBannerRendering) {
            this();
            buttonBannerRendering.getClass();
            this.onViewClicked = buttonBannerRendering.getOnViewClicked$zendesk_ui_ui_android();
            this.onViewDismissed = buttonBannerRendering.getOnViewDismissed$zendesk_ui_ui_android();
            this.state = buttonBannerRendering.getState();
        }

        public /* synthetic */ Builder(ButtonBannerRendering buttonBannerRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ButtonBannerRendering() : buttonBannerRendering);
        }
    }
}
