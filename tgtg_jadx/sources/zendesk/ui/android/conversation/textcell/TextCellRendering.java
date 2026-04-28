package zendesk.ui.android.conversation.textcell;

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
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR2\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000fR8\u0010!\u001a \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lzendesk/ui/android/conversation/textcell/TextCellRendering;", "", "Lzendesk/ui/android/conversation/textcell/TextCellRendering$Builder;", "builder", "<init>", "(Lzendesk/ui/android/conversation/textcell/TextCellRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/ui/android/conversation/textcell/TextCellRendering$Builder;", "Lkotlin/Function1;", "", "", "onCellClicked", "Lkotlin/jvm/functions/Function1;", "getOnCellClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "onCellTextClicked", "getOnCellTextClicked$zendesk_ui_ui_android", "Lkotlin/Function3;", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "onActionButtonClicked", "Li80/n;", "getOnActionButtonClicked$zendesk_ui_ui_android", "()Li80/n;", "Lkotlin/Function2;", "onPostbackButtonClicked", "Lkotlin/jvm/functions/Function2;", "getOnPostbackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function2;", "onCopyTextMenuItemClicked", "getOnCopyTextMenuItemClicked$zendesk_ui_ui_android", "Lkotlin/Function4;", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "onWebViewActionButtonClicked", "Li80/o;", "getOnWebViewActionButtonClicked$zendesk_ui_ui_android", "()Li80/o;", "Lzendesk/ui/android/conversation/textcell/TextCellState;", "state", "Lzendesk/ui/android/conversation/textcell/TextCellState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/textcell/TextCellState;", "Companion", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextCellRendering {

    @NotNull
    private static final String LOG_TAG = "TextCellRendering";

    @NotNull
    private final n onActionButtonClicked;

    @NotNull
    private final Function1<String, Unit> onCellClicked;

    @Nullable
    private final Function1<String, Unit> onCellTextClicked;

    @NotNull
    private final Function1<String, Unit> onCopyTextMenuItemClicked;

    @NotNull
    private final Function2<String, String, Unit> onPostbackButtonClicked;

    @NotNull
    private final o onWebViewActionButtonClicked;

    @NotNull
    private final TextCellState state;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public TextCellRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onCellClicked = builder.getOnCellClicked$zendesk_ui_ui_android();
        this.onCellTextClicked = builder.getOnCellTextClicked$zendesk_ui_ui_android();
        this.onActionButtonClicked = builder.getOnActionButtonClicked();
        this.onPostbackButtonClicked = builder.getOnPostbackButtonClicked$zendesk_ui_ui_android();
        this.onCopyTextMenuItemClicked = builder.getOnCopyTextMenuItemClicked$zendesk_ui_ui_android();
        this.onWebViewActionButtonClicked = builder.getOnWebViewActionButtonClicked();
        this.state = builder.getState();
    }

    @NotNull
    /* JADX INFO: renamed from: getOnActionButtonClicked$zendesk_ui_ui_android, reason: from getter */
    public final n getOnActionButtonClicked() {
        return this.onActionButtonClicked;
    }

    @NotNull
    public final Function1<String, Unit> getOnCellClicked$zendesk_ui_ui_android() {
        return this.onCellClicked;
    }

    @Nullable
    public final Function1<String, Unit> getOnCellTextClicked$zendesk_ui_ui_android() {
        return this.onCellTextClicked;
    }

    @NotNull
    public final Function1<String, Unit> getOnCopyTextMenuItemClicked$zendesk_ui_ui_android() {
        return this.onCopyTextMenuItemClicked;
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
    public final TextCellState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/textcell/TextCellRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TextCellRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u000f\u001a\u00020\u00002\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0014\u0010\u000bJ3\u0010\u0018\u001a\u00020\u00002$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0007¢\u0006\u0004\b\u001c\u0010\u000bJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eR.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R:\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R4\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R@\u0010\u0018\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u001c\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lzendesk/ui/android/conversation/textcell/TextCellRendering$Builder;", "", "<init>", "()V", "Lzendesk/ui/android/conversation/textcell/TextCellRendering;", "rendering", "(Lzendesk/ui/android/conversation/textcell/TextCellRendering;)V", "Lkotlin/Function1;", "", "", "onCellClicked", "(Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/textcell/TextCellRendering$Builder;", "onCellTextClicked", "Lkotlin/Function3;", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "onActionButtonClicked", "(Li80/n;)Lzendesk/ui/android/conversation/textcell/TextCellRendering$Builder;", "Lkotlin/Function2;", "onPostbackButtonClicked", "(Lkotlin/jvm/functions/Function2;)Lzendesk/ui/android/conversation/textcell/TextCellRendering$Builder;", "onCopyTextMenuItemClicked", "Lkotlin/Function4;", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "onWebViewMenuItemClicked", "onWebViewActionButtonClicked", "(Li80/o;)Lzendesk/ui/android/conversation/textcell/TextCellRendering$Builder;", "Lzendesk/ui/android/conversation/textcell/TextCellState;", "stateUpdate", "state", "build", "()Lzendesk/ui/android/conversation/textcell/TextCellRendering;", "Lkotlin/jvm/functions/Function1;", "getOnCellClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "setOnCellClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function1;)V", "getOnCellTextClicked$zendesk_ui_ui_android", "setOnCellTextClicked$zendesk_ui_ui_android", "Li80/n;", "getOnActionButtonClicked$zendesk_ui_ui_android", "()Li80/n;", "setOnActionButtonClicked$zendesk_ui_ui_android", "(Li80/n;)V", "Lkotlin/jvm/functions/Function2;", "getOnPostbackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function2;", "setOnPostbackButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function2;)V", "getOnCopyTextMenuItemClicked$zendesk_ui_ui_android", "setOnCopyTextMenuItemClicked$zendesk_ui_ui_android", "Li80/o;", "getOnWebViewActionButtonClicked$zendesk_ui_ui_android", "()Li80/o;", "setOnWebViewActionButtonClicked$zendesk_ui_ui_android", "(Li80/o;)V", "Lzendesk/ui/android/conversation/textcell/TextCellState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/textcell/TextCellState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/textcell/TextCellState;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private n onActionButtonClicked;

        @NotNull
        private Function1<? super String, Unit> onCellClicked;

        @Nullable
        private Function1<? super String, Unit> onCellTextClicked;

        @NotNull
        private Function1<? super String, Unit> onCopyTextMenuItemClicked;

        @NotNull
        private Function2<? super String, ? super String, Unit> onPostbackButtonClicked;

        @NotNull
        private o onWebViewActionButtonClicked;

        @NotNull
        private TextCellState state;

        public Builder() {
            this.onCellClicked = new zendesk.ui.android.conversation.form.e(6);
            this.onActionButtonClicked = new tp.a(21);
            this.onPostbackButtonClicked = new yn.a(27);
            this.onCopyTextMenuItemClicked = new zendesk.ui.android.conversation.form.e(7);
            this.onWebViewActionButtonClicked = new d0(10);
            this.state = new TextCellState(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onActionButtonClicked$lambda$1(String str, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            str2.getClass();
            messageSourceType.getClass();
            Logger.w(TextCellRendering.LOG_TAG, "TextCellRendering#onActionButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCellClicked$lambda$0(String str) {
            str.getClass();
            Logger.w(TextCellRendering.LOG_TAG, "TextCellRendering#onCellClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCopyTextMenuItemClicked$lambda$3(String str) {
            str.getClass();
            Logger.w(TextCellRendering.LOG_TAG, "TextCellRendering#onCopyTextMenuItemClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onPostbackButtonClicked$lambda$2(String str, String str2) {
            str.getClass();
            str2.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWebViewActionButtonClicked$lambda$4(String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            Logger.w(TextCellRendering.LOG_TAG, "TextCellRendering#onWebViewActionButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final TextCellRendering build() {
            return new TextCellRendering(this);
        }

        @NotNull
        /* JADX INFO: renamed from: getOnActionButtonClicked$zendesk_ui_ui_android, reason: from getter */
        public final n getOnActionButtonClicked() {
            return this.onActionButtonClicked;
        }

        @NotNull
        public final Function1<String, Unit> getOnCellClicked$zendesk_ui_ui_android() {
            return this.onCellClicked;
        }

        @Nullable
        public final Function1<String, Unit> getOnCellTextClicked$zendesk_ui_ui_android() {
            return this.onCellTextClicked;
        }

        @NotNull
        public final Function1<String, Unit> getOnCopyTextMenuItemClicked$zendesk_ui_ui_android() {
            return this.onCopyTextMenuItemClicked;
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
        public final TextCellState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onActionButtonClicked(@NotNull n onActionButtonClicked) {
            onActionButtonClicked.getClass();
            this.onActionButtonClicked = onActionButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onCellClicked(@NotNull Function1<? super String, Unit> onCellClicked) {
            onCellClicked.getClass();
            this.onCellClicked = onCellClicked;
            return this;
        }

        @NotNull
        public final Builder onCellTextClicked(@NotNull Function1<? super String, Unit> onCellTextClicked) {
            onCellTextClicked.getClass();
            this.onCellTextClicked = onCellTextClicked;
            return this;
        }

        @NotNull
        public final Builder onCopyTextMenuItemClicked(@NotNull Function1<? super String, Unit> onCopyTextMenuItemClicked) {
            onCopyTextMenuItemClicked.getClass();
            this.onCopyTextMenuItemClicked = onCopyTextMenuItemClicked;
            return this;
        }

        @NotNull
        public final Builder onPostbackButtonClicked(@NotNull Function2<? super String, ? super String, Unit> onPostbackButtonClicked) {
            onPostbackButtonClicked.getClass();
            this.onPostbackButtonClicked = onPostbackButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onWebViewActionButtonClicked(@NotNull o onWebViewMenuItemClicked) {
            onWebViewMenuItemClicked.getClass();
            this.onWebViewActionButtonClicked = onWebViewMenuItemClicked;
            return this;
        }

        public final void setOnActionButtonClicked$zendesk_ui_ui_android(@NotNull n nVar) {
            nVar.getClass();
            this.onActionButtonClicked = nVar;
        }

        public final void setOnCellClicked$zendesk_ui_ui_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onCellClicked = function1;
        }

        public final void setOnCellTextClicked$zendesk_ui_ui_android(@Nullable Function1<? super String, Unit> function1) {
            this.onCellTextClicked = function1;
        }

        public final void setOnCopyTextMenuItemClicked$zendesk_ui_ui_android(@NotNull Function1<? super String, Unit> function1) {
            function1.getClass();
            this.onCopyTextMenuItemClicked = function1;
        }

        public final void setOnPostbackButtonClicked$zendesk_ui_ui_android(@NotNull Function2<? super String, ? super String, Unit> function2) {
            function2.getClass();
            this.onPostbackButtonClicked = function2;
        }

        public final void setOnWebViewActionButtonClicked$zendesk_ui_ui_android(@NotNull o oVar) {
            oVar.getClass();
            this.onWebViewActionButtonClicked = oVar;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull TextCellState textCellState) {
            textCellState.getClass();
            this.state = textCellState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super TextCellState, TextCellState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (TextCellState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull TextCellRendering textCellRendering) {
            this();
            textCellRendering.getClass();
            this.onCellClicked = textCellRendering.getOnCellClicked$zendesk_ui_ui_android();
            this.state = textCellRendering.getState();
        }

        public /* synthetic */ Builder(TextCellRendering textCellRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new TextCellRendering() : textCellRendering);
        }
    }
}
