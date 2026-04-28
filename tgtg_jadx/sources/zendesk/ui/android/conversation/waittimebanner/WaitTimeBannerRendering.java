package zendesk.ui.android.conversation.waittimebanner;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerRendering;", "", "builder", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerRendering$Builder;", "<init>", "(Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerRendering$Builder;)V", "()V", "state", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerState;", "toBuilder", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WaitTimeBannerRendering {
    public static final int $stable = 0;

    @NotNull
    private final WaitTimeBannerState state;

    public WaitTimeBannerRendering(@NotNull Builder builder) {
        builder.getClass();
        this.state = builder.getState();
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final WaitTimeBannerState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    public WaitTimeBannerRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eJ\u0006\u0010\u000f\u001a\u00020\u0005R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerRendering;", "(Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerRendering;)V", "state", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerState;)V", "stateUpdate", "Lkotlin/Function1;", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private WaitTimeBannerState state;

        public Builder() {
            this.state = new WaitTimeBannerState(null, 0, 0, 0, 15, null);
        }

        @NotNull
        public final WaitTimeBannerRendering build() {
            return new WaitTimeBannerRendering(this);
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final WaitTimeBannerState getState() {
            return this.state;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull WaitTimeBannerState waitTimeBannerState) {
            waitTimeBannerState.getClass();
            this.state = waitTimeBannerState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super WaitTimeBannerState, WaitTimeBannerState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (WaitTimeBannerState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull WaitTimeBannerRendering waitTimeBannerRendering) {
            this();
            waitTimeBannerRendering.getClass();
            this.state = waitTimeBannerRendering.getState();
        }

        public /* synthetic */ Builder(WaitTimeBannerRendering waitTimeBannerRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new WaitTimeBannerRendering() : waitTimeBannerRendering);
        }
    }
}
