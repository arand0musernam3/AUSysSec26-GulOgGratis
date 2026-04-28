package zendesk.ui.android.conversation.form;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.conversation.form.FieldState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0011\u0012\u0013B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldRendering;", "T", "", "state", "Lzendesk/ui/android/conversation/form/FieldState;", "normalizedState", "inputType", "", "<init>", "(Lzendesk/ui/android/conversation/form/FieldState;Ljava/lang/Object;I)V", "getState", "()Lzendesk/ui/android/conversation/form/FieldState;", "getNormalizedState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getInputType", "()I", "Text", "Email", "Select", "Lzendesk/ui/android/conversation/form/FieldRendering$Email;", "Lzendesk/ui/android/conversation/form/FieldRendering$Select;", "Lzendesk/ui/android/conversation/form/FieldRendering$Text;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FieldRendering<T> {
    public static final int $stable = 0;
    private final int inputType;
    private final T normalizedState;

    @NotNull
    private final FieldState state;

    private FieldRendering(FieldState fieldState, T t9, int i11) {
        this.state = fieldState;
        this.normalizedState = t9;
        this.inputType = i11;
    }

    public int getInputType() {
        return this.inputType;
    }

    public T getNormalizedState() {
        return this.normalizedState;
    }

    @NotNull
    public FieldState getState() {
        return this.state;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006HÀ\u0003¢\u0006\u0002\b\u001dJ\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u001fJ\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006HÀ\u0003¢\u0006\u0002\b!J\t\u0010\"\u001a\u00020\u000eHÆ\u0003J{\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u000eHÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldRendering$Email;", "T", "Lzendesk/ui/android/conversation/form/FieldRendering;", "state", "Lzendesk/ui/android/conversation/form/FieldState$Email;", "onStateChanged", "Lkotlin/Function1;", "", "onEmailChanged", "", "normalize", "onFieldFocusChanged", "", "inputType", "", "<init>", "(Lzendesk/ui/android/conversation/form/FieldState$Email;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V", "getState", "()Lzendesk/ui/android/conversation/form/FieldState$Email;", "getOnStateChanged", "()Lkotlin/jvm/functions/Function1;", "getOnEmailChanged$zendesk_ui_ui_android", "getNormalize$zendesk_ui_ui_android", "getOnFieldFocusChanged$zendesk_ui_ui_android", "getInputType", "()I", "component1", "component2", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "copy", "equals", "other", "", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Email<T> extends FieldRendering<T> {
        public static final int $stable = 8;
        private final int inputType;

        @NotNull
        private final Function1<FieldState.Email, T> normalize;

        @NotNull
        private final Function1<String, Unit> onEmailChanged;

        @NotNull
        private final Function1<Boolean, Unit> onFieldFocusChanged;

        @NotNull
        private final Function1<FieldState.Email, Unit> onStateChanged;

        @NotNull
        private final FieldState.Email state;

        public /* synthetic */ Email(FieldState.Email email, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? new FieldState.Email(null, null, null, 0, 0, 0, 0, 0, 0, 511, null) : email, (i12 & 2) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(17) : function1, (i12 & 4) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(18) : function12, function13, (i12 & 16) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(19) : function14, (i12 & 32) != 0 ? 33 : i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(FieldState.Email email) {
            email.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$1(String str) {
            str.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$2(boolean z11) {
            return Unit.f26487a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Email copy$default(Email email, FieldState.Email email2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                email2 = email.state;
            }
            if ((i12 & 2) != 0) {
                function1 = email.onStateChanged;
            }
            if ((i12 & 4) != 0) {
                function12 = email.onEmailChanged;
            }
            if ((i12 & 8) != 0) {
                function13 = email.normalize;
            }
            if ((i12 & 16) != 0) {
                function14 = email.onFieldFocusChanged;
            }
            if ((i12 & 32) != 0) {
                i11 = email.inputType;
            }
            Function1 function15 = function14;
            int i13 = i11;
            return email.copy(email2, function1, function12, function13, function15, i13);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FieldState.Email getState() {
            return this.state;
        }

        @NotNull
        public final Function1<FieldState.Email, Unit> component2() {
            return this.onStateChanged;
        }

        @NotNull
        public final Function1<String, Unit> component3$zendesk_ui_ui_android() {
            return this.onEmailChanged;
        }

        @NotNull
        public final Function1<FieldState.Email, T> component4$zendesk_ui_ui_android() {
            return this.normalize;
        }

        @NotNull
        public final Function1<Boolean, Unit> component5$zendesk_ui_ui_android() {
            return this.onFieldFocusChanged;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getInputType() {
            return this.inputType;
        }

        @NotNull
        public final Email<T> copy(@NotNull FieldState.Email state, @NotNull Function1<? super FieldState.Email, Unit> onStateChanged, @NotNull Function1<? super String, Unit> onEmailChanged, @NotNull Function1<? super FieldState.Email, ? extends T> normalize, @NotNull Function1<? super Boolean, Unit> onFieldFocusChanged, int inputType) {
            state.getClass();
            onStateChanged.getClass();
            onEmailChanged.getClass();
            normalize.getClass();
            onFieldFocusChanged.getClass();
            return new Email<>(state, onStateChanged, onEmailChanged, normalize, onFieldFocusChanged, inputType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return Intrinsics.areEqual(this.state, email.state) && Intrinsics.areEqual(this.onStateChanged, email.onStateChanged) && Intrinsics.areEqual(this.onEmailChanged, email.onEmailChanged) && Intrinsics.areEqual(this.normalize, email.normalize) && Intrinsics.areEqual(this.onFieldFocusChanged, email.onFieldFocusChanged) && this.inputType == email.inputType;
        }

        @Override // zendesk.ui.android.conversation.form.FieldRendering
        public int getInputType() {
            return this.inputType;
        }

        @NotNull
        public final Function1<FieldState.Email, T> getNormalize$zendesk_ui_ui_android() {
            return this.normalize;
        }

        @NotNull
        public final Function1<String, Unit> getOnEmailChanged$zendesk_ui_ui_android() {
            return this.onEmailChanged;
        }

        @NotNull
        public final Function1<Boolean, Unit> getOnFieldFocusChanged$zendesk_ui_ui_android() {
            return this.onFieldFocusChanged;
        }

        @NotNull
        public final Function1<FieldState.Email, Unit> getOnStateChanged() {
            return this.onStateChanged;
        }

        public int hashCode() {
            return Integer.hashCode(this.inputType) + r8.k.d(r8.k.d(r8.k.d(r8.k.d(this.state.hashCode() * 31, 31, this.onStateChanged), 31, this.onEmailChanged), 31, this.normalize), 31, this.onFieldFocusChanged);
        }

        @NotNull
        public String toString() {
            return "Email(state=" + this.state + ", onStateChanged=" + this.onStateChanged + ", onEmailChanged=" + this.onEmailChanged + ", normalize=" + this.normalize + ", onFieldFocusChanged=" + this.onFieldFocusChanged + ", inputType=" + this.inputType + ")";
        }

        @Override // zendesk.ui.android.conversation.form.FieldRendering
        @NotNull
        public FieldState.Email getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Email(@NotNull FieldState.Email email, @NotNull Function1<? super FieldState.Email, Unit> function1, @NotNull Function1<? super String, Unit> function12, @NotNull Function1<? super FieldState.Email, ? extends T> function13, @NotNull Function1<? super Boolean, Unit> function14, int i11) {
            super(email, function13.invoke(email), i11, null);
            email.getClass();
            function1.getClass();
            function12.getClass();
            function13.getClass();
            function14.getClass();
            this.state = email;
            this.onStateChanged = function1;
            this.onEmailChanged = function12;
            this.normalize = function13;
            this.onFieldFocusChanged = function14;
            this.inputType = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J \u0010!\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00070\u0006HÀ\u0003¢\u0006\u0002\b\"J\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006HÀ\u0003¢\u0006\u0002\b$J\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0006HÀ\u0003¢\u0006\u0002\b&J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fHÀ\u0003¢\u0006\u0002\b(J\t\u0010)\u001a\u00020\u0011HÆ\u0003J\u0091\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00062\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0011HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R&\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldRendering$Select;", "T", "Lzendesk/ui/android/conversation/form/FieldRendering;", "state", "Lzendesk/ui/android/conversation/form/FieldState$Select;", "onStateChanged", "Lkotlin/Function1;", "", "onSelected", "", "Lzendesk/ui/android/conversation/form/SelectOption;", "normalize", "onFieldFocusChanged", "", "onCheckMarkPressed", "Lkotlin/Function0;", "inputType", "", "<init>", "(Lzendesk/ui/android/conversation/form/FieldState$Select;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V", "getState", "()Lzendesk/ui/android/conversation/form/FieldState$Select;", "getOnStateChanged", "()Lkotlin/jvm/functions/Function1;", "getOnSelected$zendesk_ui_ui_android", "getNormalize$zendesk_ui_ui_android", "getOnFieldFocusChanged$zendesk_ui_ui_android", "getOnCheckMarkPressed$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "getInputType", "()I", "component1", "component2", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "copy", "equals", "other", "", "hashCode", "toString", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Select<T> extends FieldRendering<T> {
        public static final int $stable = 8;
        private final int inputType;

        @NotNull
        private final Function1<FieldState.Select, T> normalize;

        @NotNull
        private final Function0<Unit> onCheckMarkPressed;

        @NotNull
        private final Function1<Boolean, Unit> onFieldFocusChanged;

        @NotNull
        private final Function1<List<SelectOption>, Unit> onSelected;

        @NotNull
        private final Function1<FieldState.Select, Unit> onStateChanged;

        @NotNull
        private final FieldState.Select state;

        public /* synthetic */ Select(FieldState.Select select, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? new FieldState.Select(null, null, null, null, 0, 0, 0, 0, 0, 0, 1023, null) : select, (i12 & 2) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(20) : function1, (i12 & 4) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(21) : function12, function13, (i12 & 16) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(22) : function14, (i12 & 32) != 0 ? new zendesk.ui.android.conversation.composer.b(7) : function0, (i12 & 64) != 0 ? 176 : i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(FieldState.Select select) {
            select.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$1(List list) {
            list.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$2(boolean z11) {
            return Unit.f26487a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Select copy$default(Select select, FieldState.Select select2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                select2 = select.state;
            }
            if ((i12 & 2) != 0) {
                function1 = select.onStateChanged;
            }
            if ((i12 & 4) != 0) {
                function12 = select.onSelected;
            }
            if ((i12 & 8) != 0) {
                function13 = select.normalize;
            }
            if ((i12 & 16) != 0) {
                function14 = select.onFieldFocusChanged;
            }
            if ((i12 & 32) != 0) {
                function0 = select.onCheckMarkPressed;
            }
            if ((i12 & 64) != 0) {
                i11 = select.inputType;
            }
            Function0 function02 = function0;
            int i13 = i11;
            Function1 function15 = function14;
            Function1 function16 = function12;
            return select.copy(select2, function1, function16, function13, function15, function02, i13);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FieldState.Select getState() {
            return this.state;
        }

        @NotNull
        public final Function1<FieldState.Select, Unit> component2() {
            return this.onStateChanged;
        }

        @NotNull
        public final Function1<List<SelectOption>, Unit> component3$zendesk_ui_ui_android() {
            return this.onSelected;
        }

        @NotNull
        public final Function1<FieldState.Select, T> component4$zendesk_ui_ui_android() {
            return this.normalize;
        }

        @NotNull
        public final Function1<Boolean, Unit> component5$zendesk_ui_ui_android() {
            return this.onFieldFocusChanged;
        }

        @NotNull
        public final Function0<Unit> component6$zendesk_ui_ui_android() {
            return this.onCheckMarkPressed;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getInputType() {
            return this.inputType;
        }

        @NotNull
        public final Select<T> copy(@NotNull FieldState.Select state, @NotNull Function1<? super FieldState.Select, Unit> onStateChanged, @NotNull Function1<? super List<SelectOption>, Unit> onSelected, @NotNull Function1<? super FieldState.Select, ? extends T> normalize, @NotNull Function1<? super Boolean, Unit> onFieldFocusChanged, @NotNull Function0<Unit> onCheckMarkPressed, int inputType) {
            state.getClass();
            onStateChanged.getClass();
            onSelected.getClass();
            normalize.getClass();
            onFieldFocusChanged.getClass();
            onCheckMarkPressed.getClass();
            return new Select<>(state, onStateChanged, onSelected, normalize, onFieldFocusChanged, onCheckMarkPressed, inputType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return Intrinsics.areEqual(this.state, select.state) && Intrinsics.areEqual(this.onStateChanged, select.onStateChanged) && Intrinsics.areEqual(this.onSelected, select.onSelected) && Intrinsics.areEqual(this.normalize, select.normalize) && Intrinsics.areEqual(this.onFieldFocusChanged, select.onFieldFocusChanged) && Intrinsics.areEqual(this.onCheckMarkPressed, select.onCheckMarkPressed) && this.inputType == select.inputType;
        }

        @Override // zendesk.ui.android.conversation.form.FieldRendering
        public int getInputType() {
            return this.inputType;
        }

        @NotNull
        public final Function1<FieldState.Select, T> getNormalize$zendesk_ui_ui_android() {
            return this.normalize;
        }

        @NotNull
        public final Function0<Unit> getOnCheckMarkPressed$zendesk_ui_ui_android() {
            return this.onCheckMarkPressed;
        }

        @NotNull
        public final Function1<Boolean, Unit> getOnFieldFocusChanged$zendesk_ui_ui_android() {
            return this.onFieldFocusChanged;
        }

        @NotNull
        public final Function1<List<SelectOption>, Unit> getOnSelected$zendesk_ui_ui_android() {
            return this.onSelected;
        }

        @NotNull
        public final Function1<FieldState.Select, Unit> getOnStateChanged() {
            return this.onStateChanged;
        }

        public int hashCode() {
            return Integer.hashCode(this.inputType) + ((this.onCheckMarkPressed.hashCode() + r8.k.d(r8.k.d(r8.k.d(r8.k.d(this.state.hashCode() * 31, 31, this.onStateChanged), 31, this.onSelected), 31, this.normalize), 31, this.onFieldFocusChanged)) * 31);
        }

        @NotNull
        public String toString() {
            FieldState.Select select = this.state;
            Function1<FieldState.Select, Unit> function1 = this.onStateChanged;
            Function1<List<SelectOption>, Unit> function12 = this.onSelected;
            Function1<FieldState.Select, T> function13 = this.normalize;
            Function1<Boolean, Unit> function14 = this.onFieldFocusChanged;
            Function0<Unit> function0 = this.onCheckMarkPressed;
            int i11 = this.inputType;
            StringBuilder sb2 = new StringBuilder("Select(state=");
            sb2.append(select);
            sb2.append(", onStateChanged=");
            sb2.append(function1);
            sb2.append(", onSelected=");
            sb2.append(function12);
            sb2.append(", normalize=");
            sb2.append(function13);
            sb2.append(", onFieldFocusChanged=");
            sb2.append(function14);
            sb2.append(", onCheckMarkPressed=");
            sb2.append(function0);
            sb2.append(", inputType=");
            return r8.k.i(i11, ")", sb2);
        }

        @Override // zendesk.ui.android.conversation.form.FieldRendering
        @NotNull
        public FieldState.Select getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Select(@NotNull FieldState.Select select, @NotNull Function1<? super FieldState.Select, Unit> function1, @NotNull Function1<? super List<SelectOption>, Unit> function12, @NotNull Function1<? super FieldState.Select, ? extends T> function13, @NotNull Function1<? super Boolean, Unit> function14, @NotNull Function0<Unit> function0, int i11) {
            super(select, function13.invoke(select), i11, null);
            select.getClass();
            function1.getClass();
            function12.getClass();
            function13.getClass();
            function14.getClass();
            function0.getClass();
            this.state = select;
            this.onStateChanged = function1;
            this.onSelected = function12;
            this.normalize = function13;
            this.onFieldFocusChanged = function14;
            this.onCheckMarkPressed = function0;
            this.inputType = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006HÀ\u0003¢\u0006\u0002\b\u001dJ\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006HÀ\u0003¢\u0006\u0002\b\u001fJ\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006HÀ\u0003¢\u0006\u0002\b!J\t\u0010\"\u001a\u00020\u000eHÆ\u0003J{\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u000eHÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldRendering$Text;", "T", "Lzendesk/ui/android/conversation/form/FieldRendering;", "state", "Lzendesk/ui/android/conversation/form/FieldState$Text;", "onStateChanged", "Lkotlin/Function1;", "", "onTextChanged", "", "normalize", "onFieldFocusChanged", "", "inputType", "", "<init>", "(Lzendesk/ui/android/conversation/form/FieldState$Text;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V", "getState", "()Lzendesk/ui/android/conversation/form/FieldState$Text;", "getOnStateChanged", "()Lkotlin/jvm/functions/Function1;", "getOnTextChanged$zendesk_ui_ui_android", "getNormalize$zendesk_ui_ui_android", "getOnFieldFocusChanged$zendesk_ui_ui_android", "getInputType", "()I", "component1", "component2", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "copy", "equals", "other", "", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text<T> extends FieldRendering<T> {
        public static final int $stable = 8;
        private final int inputType;

        @NotNull
        private final Function1<FieldState.Text, T> normalize;

        @NotNull
        private final Function1<Boolean, Unit> onFieldFocusChanged;

        @NotNull
        private final Function1<FieldState.Text, Unit> onStateChanged;

        @NotNull
        private final Function1<String, Unit> onTextChanged;

        @NotNull
        private final FieldState.Text state;

        public /* synthetic */ Text(FieldState.Text text, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? new FieldState.Text(null, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 2047, null) : text, (i12 & 2) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(23) : function1, (i12 & 4) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(24) : function12, function13, (i12 & 16) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(25) : function14, (i12 & 32) != 0 ? 8192 : i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(FieldState.Text text) {
            text.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$1(String str) {
            str.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$2(boolean z11) {
            return Unit.f26487a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Text copy$default(Text text, FieldState.Text text2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                text2 = text.state;
            }
            if ((i12 & 2) != 0) {
                function1 = text.onStateChanged;
            }
            if ((i12 & 4) != 0) {
                function12 = text.onTextChanged;
            }
            if ((i12 & 8) != 0) {
                function13 = text.normalize;
            }
            if ((i12 & 16) != 0) {
                function14 = text.onFieldFocusChanged;
            }
            if ((i12 & 32) != 0) {
                i11 = text.inputType;
            }
            Function1 function15 = function14;
            int i13 = i11;
            return text.copy(text2, function1, function12, function13, function15, i13);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FieldState.Text getState() {
            return this.state;
        }

        @NotNull
        public final Function1<FieldState.Text, Unit> component2() {
            return this.onStateChanged;
        }

        @NotNull
        public final Function1<String, Unit> component3$zendesk_ui_ui_android() {
            return this.onTextChanged;
        }

        @NotNull
        public final Function1<FieldState.Text, T> component4$zendesk_ui_ui_android() {
            return this.normalize;
        }

        @NotNull
        public final Function1<Boolean, Unit> component5$zendesk_ui_ui_android() {
            return this.onFieldFocusChanged;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getInputType() {
            return this.inputType;
        }

        @NotNull
        public final Text<T> copy(@NotNull FieldState.Text state, @NotNull Function1<? super FieldState.Text, Unit> onStateChanged, @NotNull Function1<? super String, Unit> onTextChanged, @NotNull Function1<? super FieldState.Text, ? extends T> normalize, @NotNull Function1<? super Boolean, Unit> onFieldFocusChanged, int inputType) {
            state.getClass();
            onStateChanged.getClass();
            onTextChanged.getClass();
            normalize.getClass();
            onFieldFocusChanged.getClass();
            return new Text<>(state, onStateChanged, onTextChanged, normalize, onFieldFocusChanged, inputType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(this.state, text.state) && Intrinsics.areEqual(this.onStateChanged, text.onStateChanged) && Intrinsics.areEqual(this.onTextChanged, text.onTextChanged) && Intrinsics.areEqual(this.normalize, text.normalize) && Intrinsics.areEqual(this.onFieldFocusChanged, text.onFieldFocusChanged) && this.inputType == text.inputType;
        }

        @Override // zendesk.ui.android.conversation.form.FieldRendering
        public int getInputType() {
            return this.inputType;
        }

        @NotNull
        public final Function1<FieldState.Text, T> getNormalize$zendesk_ui_ui_android() {
            return this.normalize;
        }

        @NotNull
        public final Function1<Boolean, Unit> getOnFieldFocusChanged$zendesk_ui_ui_android() {
            return this.onFieldFocusChanged;
        }

        @NotNull
        public final Function1<FieldState.Text, Unit> getOnStateChanged() {
            return this.onStateChanged;
        }

        @NotNull
        public final Function1<String, Unit> getOnTextChanged$zendesk_ui_ui_android() {
            return this.onTextChanged;
        }

        public int hashCode() {
            return Integer.hashCode(this.inputType) + r8.k.d(r8.k.d(r8.k.d(r8.k.d(this.state.hashCode() * 31, 31, this.onStateChanged), 31, this.onTextChanged), 31, this.normalize), 31, this.onFieldFocusChanged);
        }

        @NotNull
        public String toString() {
            return "Text(state=" + this.state + ", onStateChanged=" + this.onStateChanged + ", onTextChanged=" + this.onTextChanged + ", normalize=" + this.normalize + ", onFieldFocusChanged=" + this.onFieldFocusChanged + ", inputType=" + this.inputType + ")";
        }

        @Override // zendesk.ui.android.conversation.form.FieldRendering
        @NotNull
        public FieldState.Text getState() {
            return this.state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Text(@NotNull FieldState.Text text, @NotNull Function1<? super FieldState.Text, Unit> function1, @NotNull Function1<? super String, Unit> function12, @NotNull Function1<? super FieldState.Text, ? extends T> function13, @NotNull Function1<? super Boolean, Unit> function14, int i11) {
            super(text, function13.invoke(text), i11, null);
            text.getClass();
            function1.getClass();
            function12.getClass();
            function13.getClass();
            function14.getClass();
            this.state = text;
            this.onStateChanged = function1;
            this.onTextChanged = function12;
            this.normalize = function13;
            this.onFieldFocusChanged = function14;
            this.inputType = i11;
        }
    }

    public /* synthetic */ FieldRendering(FieldState fieldState, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldState, obj, i11);
    }
}
