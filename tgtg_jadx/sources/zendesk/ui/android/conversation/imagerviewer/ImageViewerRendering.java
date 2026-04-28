package zendesk.ui.android.conversation.imagerviewer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p9.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0003R\u001e\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lzendesk/ui/android/conversation/imagerviewer/ImageViewerRendering;", "", "builder", "Lzendesk/ui/android/conversation/imagerviewer/ImageViewerRendering$Builder;", "<init>", "(Lzendesk/ui/android/conversation/imagerviewer/ImageViewerRendering$Builder;)V", "()V", "onBackButtonClicked", "Lkotlin/Function0;", "", "Lzendesk/ui/android/conversation/imagerviewer/OnClickLambda;", "getOnBackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "state", "Lzendesk/ui/android/conversation/imagerviewer/ImageViewerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/imagerviewer/ImageViewerState;", "toBuilder", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageViewerRendering {
    public static final int $stable = 8;

    @NotNull
    private final Function0<Unit> onBackButtonClicked;

    @NotNull
    private final ImageViewerState state;

    public ImageViewerRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onBackButtonClicked = builder.getOnBackButtonClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function0<Unit> getOnBackButtonClicked$zendesk_ui_ui_android() {
        return this.onBackButtonClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ImageViewerState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    public ImageViewerRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00002\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nJ\u001a\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0016J\u0006\u0010\u0017\u001a\u00020\u0005R$\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lzendesk/ui/android/conversation/imagerviewer/ImageViewerRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/conversation/imagerviewer/ImageViewerRendering;", "(Lzendesk/ui/android/conversation/imagerviewer/ImageViewerRendering;)V", "onBackButtonClicked", "Lkotlin/Function0;", "", "Lzendesk/ui/android/conversation/imagerviewer/OnClickLambda;", "getOnBackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnBackButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "state", "Lzendesk/ui/android/conversation/imagerviewer/ImageViewerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/imagerviewer/ImageViewerState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/imagerviewer/ImageViewerState;)V", "stateUpdate", "Lkotlin/Function1;", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function0<Unit> onBackButtonClicked;

        @NotNull
        private ImageViewerState state;

        public Builder() {
            this.onBackButtonClicked = new a(1);
            this.state = new ImageViewerState(null, null, null, null, null, null, null, 127, null);
        }

        @NotNull
        public final ImageViewerRendering build() {
            return new ImageViewerRendering(this);
        }

        @NotNull
        public final Function0<Unit> getOnBackButtonClicked$zendesk_ui_ui_android() {
            return this.onBackButtonClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ImageViewerState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onBackButtonClicked(@NotNull Function0<Unit> onBackButtonClicked) {
            onBackButtonClicked.getClass();
            this.onBackButtonClicked = onBackButtonClicked;
            return this;
        }

        public final void setOnBackButtonClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onBackButtonClicked = function0;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ImageViewerState imageViewerState) {
            imageViewerState.getClass();
            this.state = imageViewerState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ImageViewerState, ImageViewerState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ImageViewerState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ImageViewerRendering imageViewerRendering) {
            this();
            imageViewerRendering.getClass();
            this.onBackButtonClicked = imageViewerRendering.getOnBackButtonClicked$zendesk_ui_ui_android();
            this.state = imageViewerRendering.getState();
        }

        public /* synthetic */ Builder(ImageViewerRendering imageViewerRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ImageViewerRendering() : imageViewerRendering);
        }
    }
}
