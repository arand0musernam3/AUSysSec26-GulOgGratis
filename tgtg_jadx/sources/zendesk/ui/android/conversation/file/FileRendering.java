package zendesk.ui.android.conversation.file;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n90.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lzendesk/ui/android/conversation/file/FileRendering;", "", "builder", "Lzendesk/ui/android/conversation/file/FileRendering$Builder;", "<init>", "(Lzendesk/ui/android/conversation/file/FileRendering$Builder;)V", "()V", "onCellClicked", "Lkotlin/Function0;", "", "getOnCellClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "state", "Lzendesk/ui/android/conversation/file/FileState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/file/FileState;", "toBuilder", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileRendering {
    public static final int $stable = 0;

    @NotNull
    private final Function0<Unit> onCellClicked;

    @NotNull
    private final FileState state;

    public FileRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onCellClicked = builder.getOnCellClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function0<Unit> getOnCellClicked$zendesk_ui_ui_android() {
        return this.onCellClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final FileState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    public FileRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0015J\u0006\u0010\u0016\u001a\u00020\u0005R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/conversation/file/FileRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/ui/android/conversation/file/FileRendering;", "(Lzendesk/ui/android/conversation/file/FileRendering;)V", "onCellClicked", "Lkotlin/Function0;", "", "getOnCellClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnCellClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "state", "Lzendesk/ui/android/conversation/file/FileState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/file/FileState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/file/FileState;)V", "stateUpdate", "Lkotlin/Function1;", "build", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function0<Unit> onCellClicked;

        @NotNull
        private FileState state;

        public Builder() {
            this.onCellClicked = new p(14);
            this.state = new FileState(null, 0L, 0, 0, 0, null, 63, null);
        }

        @NotNull
        public final FileRendering build() {
            return new FileRendering(this);
        }

        @NotNull
        public final Function0<Unit> getOnCellClicked$zendesk_ui_ui_android() {
            return this.onCellClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final FileState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onCellClicked(@NotNull Function0<Unit> onCellClicked) {
            onCellClicked.getClass();
            this.onCellClicked = onCellClicked;
            return this;
        }

        public final void setOnCellClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onCellClicked = function0;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull FileState fileState) {
            fileState.getClass();
            this.state = fileState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super FileState, FileState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (FileState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull FileRendering fileRendering) {
            this();
            fileRendering.getClass();
            this.onCellClicked = fileRendering.getOnCellClicked$zendesk_ui_ui_android();
            this.state = fileRendering.getState();
        }

        public /* synthetic */ Builder(FileRendering fileRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new FileRendering() : fileRendering);
        }
    }
}
