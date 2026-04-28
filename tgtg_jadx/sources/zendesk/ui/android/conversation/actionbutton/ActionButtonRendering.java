package zendesk.ui.android.conversation.actionbutton;

import a3.d0;
import i80.n;
import i80.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import tp.a;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR2\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R,\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R8\u0010\u0018\u001a \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering;", "", "Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering$Builder;", "builder", "<init>", "(Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering$Builder;", "Lkotlin/Function3;", "", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "", "onActionButtonClicked", "Li80/n;", "getOnActionButtonClicked$zendesk_ui_ui_android", "()Li80/n;", "Lkotlin/Function2;", "onPostbackButtonClicked", "Lkotlin/jvm/functions/Function2;", "getOnPostbackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/Function4;", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "onWebViewActionButtonClicked", "Li80/o;", "getOnWebViewActionButtonClicked$zendesk_ui_ui_android", "()Li80/o;", "Lzendesk/ui/android/conversation/actionbutton/ActionButtonState;", "state", "Lzendesk/ui/android/conversation/actionbutton/ActionButtonState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/actionbutton/ActionButtonState;", "Companion", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActionButtonRendering {
    public static final int $stable = 0;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ActionButtonRendering";

    @NotNull
    private final n onActionButtonClicked;

    @NotNull
    private final Function2<String, String, Unit> onPostbackButtonClicked;

    @NotNull
    private final o onWebViewActionButtonClicked;

    @NotNull
    private final ActionButtonState state;

    public ActionButtonRendering(@NotNull Builder builder) {
        builder.getClass();
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
    public final ActionButtonState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ActionButtonRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J-\u0010\u000b\u001a\u00020\u00002\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\u00002\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0012\u001a\u00020\u00002$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR@\u0010\u0012\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R4\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0017\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering$Builder;", "", "<init>", "()V", "Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering;", "rendering", "(Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering;)V", "Lkotlin/Function3;", "", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "", "onActionButtonClicked", "(Li80/n;)Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering$Builder;", "Lkotlin/Function2;", "onPostbackButtonClicked", "(Lkotlin/jvm/functions/Function2;)Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering$Builder;", "Lkotlin/Function4;", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "onWebViewActionButtonClicked", "(Li80/o;)Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering$Builder;", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/actionbutton/ActionButtonState;", "stateUpdate", "state", "(Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering$Builder;", "build", "()Lzendesk/ui/android/conversation/actionbutton/ActionButtonRendering;", "Li80/n;", "getOnActionButtonClicked$zendesk_ui_ui_android", "()Li80/n;", "setOnActionButtonClicked$zendesk_ui_ui_android", "(Li80/n;)V", "Li80/o;", "getOnWebViewActionButtonClicked$zendesk_ui_ui_android", "()Li80/o;", "setOnWebViewActionButtonClicked$zendesk_ui_ui_android", "(Li80/o;)V", "Lkotlin/jvm/functions/Function2;", "getOnPostbackButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function2;", "setOnPostbackButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function2;)V", "Lzendesk/ui/android/conversation/actionbutton/ActionButtonState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/actionbutton/ActionButtonState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/actionbutton/ActionButtonState;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private n onActionButtonClicked;

        @NotNull
        private Function2<? super String, ? super String, Unit> onPostbackButtonClicked;

        @NotNull
        private o onWebViewActionButtonClicked;

        @NotNull
        private ActionButtonState state;

        public Builder() {
            this.onActionButtonClicked = new a(19);
            this.onWebViewActionButtonClicked = new d0(8);
            this.onPostbackButtonClicked = new yn.a(24);
            this.state = new ActionButtonState(null, null, false, null, null, null, null, false, null, null, null, 2047, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onActionButtonClicked$lambda$0(String str, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            str2.getClass();
            messageSourceType.getClass();
            Logger.w(ActionButtonRendering.LOG_TAG, "ActionButtonRendering#onActionButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onPostbackButtonClicked$lambda$2(String str, String str2) {
            str.getClass();
            str2.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWebViewActionButtonClicked$lambda$1(String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType) {
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            Logger.w(ActionButtonRendering.LOG_TAG, "ActionButtonRendering#onWebViewActionButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final ActionButtonRendering build() {
            return new ActionButtonRendering(this);
        }

        @NotNull
        /* JADX INFO: renamed from: getOnActionButtonClicked$zendesk_ui_ui_android, reason: from getter */
        public final n getOnActionButtonClicked() {
            return this.onActionButtonClicked;
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
        public final ActionButtonState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onActionButtonClicked(@NotNull n onActionButtonClicked) {
            onActionButtonClicked.getClass();
            this.onActionButtonClicked = onActionButtonClicked;
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

        public final void setOnPostbackButtonClicked$zendesk_ui_ui_android(@NotNull Function2<? super String, ? super String, Unit> function2) {
            function2.getClass();
            this.onPostbackButtonClicked = function2;
        }

        public final void setOnWebViewActionButtonClicked$zendesk_ui_ui_android(@NotNull o oVar) {
            oVar.getClass();
            this.onWebViewActionButtonClicked = oVar;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ActionButtonState actionButtonState) {
            actionButtonState.getClass();
            this.state = actionButtonState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ActionButtonState, ActionButtonState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ActionButtonState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ActionButtonRendering actionButtonRendering) {
            this();
            actionButtonRendering.getClass();
            this.onActionButtonClicked = actionButtonRendering.getOnActionButtonClicked();
            this.onPostbackButtonClicked = actionButtonRendering.getOnPostbackButtonClicked$zendesk_ui_ui_android();
            this.onWebViewActionButtonClicked = actionButtonRendering.getOnWebViewActionButtonClicked();
            this.state = actionButtonRendering.getState();
        }

        public /* synthetic */ Builder(ActionButtonRendering actionButtonRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ActionButtonRendering() : actionButtonRendering);
        }
    }
}
