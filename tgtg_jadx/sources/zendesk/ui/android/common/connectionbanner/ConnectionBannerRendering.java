package zendesk.ui.android.common.connectionbanner;

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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering;", "", "builder", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering$Builder;", "<init>", "(Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering$Builder;)V", "()V", "onRetryClicked", "Lkotlin/Function0;", "", "getOnRetryClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "showRetry", "", "getShowRetry$zendesk_ui_ui_android", "()Z", "state", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState;", "toBuilder", "Builder", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectionBannerRendering {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ConnectionBannerRendering";

    @NotNull
    private final Function0<Unit> onRetryClicked;
    private final boolean showRetry;

    @NotNull
    private final ConnectionBannerState state;

    public ConnectionBannerRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onRetryClicked = builder.getOnRetryClicked$zendesk_ui_ui_android();
        this.showRetry = builder.getShowRetry();
        this.state = builder.getState();
    }

    @NotNull
    public final Function0<Unit> getOnRetryClicked$zendesk_ui_ui_android() {
        return this.onRetryClicked;
    }

    /* JADX INFO: renamed from: getShowRetry$zendesk_ui_ui_android, reason: from getter */
    public final boolean getShowRetry() {
        return this.showRetry;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ConnectionBannerState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ConnectionBannerRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001bJ\u0006\u0010\u001c\u001a\u00020\u0005R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering;", "(Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering;)V", "onRetryClicked", "Lkotlin/Function0;", "", "getOnRetryClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnRetryClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "state", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState;)V", "showRetry", "", "getShowRetry$zendesk_ui_ui_android", "()Z", "setShowRetry$zendesk_ui_ui_android", "(Z)V", "stateUpdate", "Lkotlin/Function1;", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function0<Unit> onRetryClicked;
        private boolean showRetry;

        @NotNull
        private ConnectionBannerState state;

        public Builder() {
            this.onRetryClicked = new n(23);
            this.state = new ConnectionBannerState(null, 0, 0, 0, 0, 31, null);
            this.showRetry = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onRetryClicked$lambda$0() {
            Logger.w(ConnectionBannerRendering.LOG_TAG, "ConnectionBannerRendering#onRetryClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final ConnectionBannerRendering build() {
            return new ConnectionBannerRendering(this);
        }

        @NotNull
        public final Function0<Unit> getOnRetryClicked$zendesk_ui_ui_android() {
            return this.onRetryClicked;
        }

        /* JADX INFO: renamed from: getShowRetry$zendesk_ui_ui_android, reason: from getter */
        public final boolean getShowRetry() {
            return this.showRetry;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ConnectionBannerState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onRetryClicked(@NotNull Function0<Unit> onRetryClicked) {
            onRetryClicked.getClass();
            this.onRetryClicked = onRetryClicked;
            return this;
        }

        public final void setOnRetryClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onRetryClicked = function0;
        }

        public final void setShowRetry$zendesk_ui_ui_android(boolean z11) {
            this.showRetry = z11;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ConnectionBannerState connectionBannerState) {
            connectionBannerState.getClass();
            this.state = connectionBannerState;
        }

        @NotNull
        public final Builder showRetry(boolean showRetry) {
            this.showRetry = showRetry;
            return this;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ConnectionBannerState, ConnectionBannerState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ConnectionBannerState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ConnectionBannerRendering connectionBannerRendering) {
            this();
            connectionBannerRendering.getClass();
            this.onRetryClicked = connectionBannerRendering.getOnRetryClicked$zendesk_ui_ui_android();
            this.state = connectionBannerRendering.getState();
        }

        public /* synthetic */ Builder(ConnectionBannerRendering connectionBannerRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ConnectionBannerRendering() : connectionBannerRendering);
        }
    }
}
