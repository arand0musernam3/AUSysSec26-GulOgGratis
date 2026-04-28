package zendesk.ui.android.common.button;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lzendesk/ui/android/common/button/ButtonRendering;", "", "builder", "Lzendesk/ui/android/common/button/ButtonRendering$Builder;", "<init>", "(Lzendesk/ui/android/common/button/ButtonRendering$Builder;)V", "()V", "onButtonClicked", "Lkotlin/Function0;", "", "getOnButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "state", "Lzendesk/ui/android/common/button/ButtonState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/common/button/ButtonState;", "toBuilder", "Builder", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ButtonRendering {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "FormButtonRendering";

    @NotNull
    private final Function0<Unit> onButtonClicked;

    @NotNull
    private final ButtonState state;

    public ButtonRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onButtonClicked = builder.getOnButtonClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function0<Unit> getOnButtonClicked$zendesk_ui_ui_android() {
        return this.onButtonClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ButtonState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/common/button/ButtonRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ButtonRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0015J\u0006\u0010\u0016\u001a\u00020\u0005R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/common/button/ButtonRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/common/button/ButtonRendering;", "(Lzendesk/ui/android/common/button/ButtonRendering;)V", "onButtonClicked", "Lkotlin/Function0;", "", "getOnButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "state", "Lzendesk/ui/android/common/button/ButtonState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/common/button/ButtonState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/common/button/ButtonState;)V", "stateUpdate", "Lkotlin/Function1;", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function0<Unit> onButtonClicked;

        @NotNull
        private ButtonState state;

        public Builder() {
            this.onButtonClicked = new n(20);
            this.state = new ButtonState(null, false, null, null, null, false, 63, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onButtonClicked$lambda$0() {
            Logger.w(ButtonRendering.LOG_TAG, "FormButtonRendering#onButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final ButtonRendering build() {
            return new ButtonRendering(this);
        }

        @NotNull
        public final Function0<Unit> getOnButtonClicked$zendesk_ui_ui_android() {
            return this.onButtonClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ButtonState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onButtonClicked(@NotNull Function0<Unit> onButtonClicked) {
            onButtonClicked.getClass();
            this.onButtonClicked = onButtonClicked;
            return this;
        }

        public final void setOnButtonClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onButtonClicked = function0;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ButtonState buttonState) {
            buttonState.getClass();
            this.state = buttonState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ButtonState, ButtonState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ButtonState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ButtonRendering buttonRendering) {
            this();
            buttonRendering.getClass();
            this.onButtonClicked = buttonRendering.getOnButtonClicked$zendesk_ui_ui_android();
            this.state = buttonRendering.getState();
        }

        public /* synthetic */ Builder(ButtonRendering buttonRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ButtonRendering() : buttonRendering);
        }
    }
}
