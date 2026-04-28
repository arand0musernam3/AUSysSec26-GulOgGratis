package zendesk.ui.android.conversation.imagecell;

import a3.d0;
import i80.n;
import i80.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R2\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR8\u0010\u001e\u001a \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageCellRendering;", "", "Lzendesk/ui/android/conversation/imagecell/ImageCellRendering$Builder;", "builder", "<init>", "(Lzendesk/ui/android/conversation/imagecell/ImageCellRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/ui/android/conversation/imagecell/ImageCellRendering$Builder;", "Lkotlin/Function1;", "", "", "Lzendesk/ui/android/conversation/imagecell/OnClickLambda;", "onImageCellClicked", "Lkotlin/jvm/functions/Function1;", "getOnImageCellClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function3;", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "onActionButtonClicked", "Li80/n;", "getOnActionButtonClicked$zendesk_ui_ui_android", "()Li80/n;", "Lkotlin/Function2;", "onPostbackButtonClicked", "Lkotlin/jvm/functions/Function2;", "getOnPostbackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/Function4;", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "onWebViewActionButtonClicked", "Li80/o;", "getOnWebViewActionButtonClicked$zendesk_ui_ui_android", "()Li80/o;", "Lzendesk/ui/android/conversation/imagecell/ImageCellState;", "state", "Lzendesk/ui/android/conversation/imagecell/ImageCellState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/imagecell/ImageCellState;", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageCellRendering {
    public static final int $stable = 8;

    @NotNull
    private final n onActionButtonClicked;

    @Nullable
    private final Function1<String, Unit> onImageCellClicked;

    @NotNull
    private final Function2<String, String, Unit> onPostbackButtonClicked;

    @NotNull
    private final o onWebViewActionButtonClicked;

    @NotNull
    private final ImageCellState state;

    public ImageCellRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onImageCellClicked = builder.getOnImageCellClicked$zendesk_ui_ui_android();
        this.onActionButtonClicked = builder.getOnActionButtonClicked();
        this.onPostbackButtonClicked = builder.getOnPostbackButtonClicked$zendesk_ui_ui_android();
        this.onWebViewActionButtonClicked = builder.getOnWebViewActionButtonClicked();
        this.state = builder.getState();
    }

    @NotNull
    /* JADX INFO: renamed from: getOnActionButtonClicked$zendesk_ui_ui_android, reason: from getter */
    public final n getOnActionButtonClicked() {
        return this.onActionButtonClicked;
    }

    @Nullable
    public final Function1<String, Unit> getOnImageCellClicked$zendesk_ui_ui_android() {
        return this.onImageCellClicked;
    }

    @NotNull
    public final Function2<String, String, Unit> getOnPostbackButtonClicked$zendesk_ui_ui_android() {
        return this.onPostbackButtonClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getOnWebViewActionButtonClicked$zendesk_ui_ui_android, reason: from getter */
    public final o getOnWebViewActionButtonClicked() {
        return this.onWebViewActionButtonClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ImageCellState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    public ImageCellRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J)\u0010\u000b\u001a\u00020\u00002\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\u00002\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u00002$\u0010\u0013\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00002\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0007¢\u0006\u0004\b\u001a\u0010\fJ\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cR6\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R:\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R4\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R@\u0010\u0013\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u001a\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, d2 = {"Lzendesk/ui/android/conversation/imagecell/ImageCellRendering$Builder;", "", "<init>", "()V", "Lzendesk/ui/android/conversation/imagecell/ImageCellRendering;", "rendering", "(Lzendesk/ui/android/conversation/imagecell/ImageCellRendering;)V", "Lkotlin/Function1;", "", "", "Lzendesk/ui/android/conversation/imagecell/OnClickLambda;", "onImageCellClicked", "(Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/imagecell/ImageCellRendering$Builder;", "Lkotlin/Function3;", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "onActionButtonClicked", "(Li80/n;)Lzendesk/ui/android/conversation/imagecell/ImageCellRendering$Builder;", "Lkotlin/Function4;", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "onWebViewActionButtonClicked", "(Li80/o;)Lzendesk/ui/android/conversation/imagecell/ImageCellRendering$Builder;", "Lkotlin/Function2;", "onPostbackButtonClicked", "(Lkotlin/jvm/functions/Function2;)Lzendesk/ui/android/conversation/imagecell/ImageCellRendering$Builder;", "Lzendesk/ui/android/conversation/imagecell/ImageCellState;", "stateUpdate", "state", "build", "()Lzendesk/ui/android/conversation/imagecell/ImageCellRendering;", "Lkotlin/jvm/functions/Function1;", "getOnImageCellClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "setOnImageCellClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function1;)V", "Li80/n;", "getOnActionButtonClicked$zendesk_ui_ui_android", "()Li80/n;", "setOnActionButtonClicked$zendesk_ui_ui_android", "(Li80/n;)V", "Lkotlin/jvm/functions/Function2;", "getOnPostbackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function2;", "setOnPostbackButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function2;)V", "Li80/o;", "getOnWebViewActionButtonClicked$zendesk_ui_ui_android", "()Li80/o;", "setOnWebViewActionButtonClicked$zendesk_ui_ui_android", "(Li80/o;)V", "Lzendesk/ui/android/conversation/imagecell/ImageCellState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/imagecell/ImageCellState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/imagecell/ImageCellState;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private n onActionButtonClicked;

        @Nullable
        private Function1<? super String, Unit> onImageCellClicked;

        @NotNull
        private Function2<? super String, ? super String, Unit> onPostbackButtonClicked;

        @NotNull
        private o onWebViewActionButtonClicked;

        @NotNull
        private ImageCellState state;

        public Builder() {
            this.onActionButtonClicked = new tp.a(20);
            this.onPostbackButtonClicked = new yn.a(26);
            this.onWebViewActionButtonClicked = new d0(9);
            this.state = new ImageCellState(null, null, null, null, null, false, false, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, 1048575, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onActionButtonClicked$lambda$0(String str, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            str2.getClass();
            messageSourceType.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onPostbackButtonClicked$lambda$1(String str, String str2) {
            str.getClass();
            str2.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWebViewActionButtonClicked$lambda$2(String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            return Unit.f26487a;
        }

        @NotNull
        public final ImageCellRendering build() {
            return new ImageCellRendering(this);
        }

        @NotNull
        /* JADX INFO: renamed from: getOnActionButtonClicked$zendesk_ui_ui_android, reason: from getter */
        public final n getOnActionButtonClicked() {
            return this.onActionButtonClicked;
        }

        @Nullable
        public final Function1<String, Unit> getOnImageCellClicked$zendesk_ui_ui_android() {
            return this.onImageCellClicked;
        }

        @NotNull
        public final Function2<String, String, Unit> getOnPostbackButtonClicked$zendesk_ui_ui_android() {
            return this.onPostbackButtonClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getOnWebViewActionButtonClicked$zendesk_ui_ui_android, reason: from getter */
        public final o getOnWebViewActionButtonClicked() {
            return this.onWebViewActionButtonClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ImageCellState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onActionButtonClicked(@NotNull n onActionButtonClicked) {
            onActionButtonClicked.getClass();
            this.onActionButtonClicked = onActionButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onImageCellClicked(@Nullable Function1<? super String, Unit> onImageCellClicked) {
            this.onImageCellClicked = onImageCellClicked;
            return this;
        }

        @NotNull
        public final Builder onPostbackButtonClicked(@NotNull Function2<? super String, ? super String, Unit> onPostbackButtonClicked) {
            onPostbackButtonClicked.getClass();
            this.onPostbackButtonClicked = onPostbackButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onWebViewActionButtonClicked(@NotNull o onWebViewActionButtonClicked) {
            onWebViewActionButtonClicked.getClass();
            this.onWebViewActionButtonClicked = onWebViewActionButtonClicked;
            return this;
        }

        public final void setOnActionButtonClicked$zendesk_ui_ui_android(@NotNull n nVar) {
            nVar.getClass();
            this.onActionButtonClicked = nVar;
        }

        public final void setOnImageCellClicked$zendesk_ui_ui_android(@Nullable Function1<? super String, Unit> function1) {
            this.onImageCellClicked = function1;
        }

        public final void setOnPostbackButtonClicked$zendesk_ui_ui_android(@NotNull Function2<? super String, ? super String, Unit> function2) {
            function2.getClass();
            this.onPostbackButtonClicked = function2;
        }

        public final void setOnWebViewActionButtonClicked$zendesk_ui_ui_android(@NotNull o oVar) {
            oVar.getClass();
            this.onWebViewActionButtonClicked = oVar;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ImageCellState imageCellState) {
            imageCellState.getClass();
            this.state = imageCellState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ImageCellState, ImageCellState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ImageCellState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ImageCellRendering imageCellRendering) {
            this();
            imageCellRendering.getClass();
            this.onImageCellClicked = imageCellRendering.getOnImageCellClicked$zendesk_ui_ui_android();
            this.onPostbackButtonClicked = imageCellRendering.getOnPostbackButtonClicked$zendesk_ui_ui_android();
            this.state = imageCellRendering.getState();
        }

        public /* synthetic */ Builder(ImageCellRendering imageCellRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ImageCellRendering() : imageCellRendering);
        }
    }
}
