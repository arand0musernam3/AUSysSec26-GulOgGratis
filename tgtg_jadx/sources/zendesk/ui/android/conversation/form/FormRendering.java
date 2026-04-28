package zendesk.ui.android.conversation.form;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\n0\t\u0012\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\t\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000f\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006HÀ\u0003¢\u0006\u0002\b(J \u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\n0\tHÀ\u0003¢\u0006\u0002\b*J \u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\n0\tHÀ\u0003¢\u0006\u0002\b,J\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\tHÀ\u0003¢\u0006\u0002\b.J \u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000fHÀ\u0003¢\u0006\u0002\b0J\u001a\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0013HÀ\u0003¢\u0006\u0002\b2J\u000e\u00103\u001a\u00020\u0011HÀ\u0003¢\u0006\u0002\b4J¹\u0001\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\n0\t2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\t2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000f2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0011HÆ\u0001J\u0013\u00106\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR&\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR&\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0015\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006;"}, d2 = {"Lzendesk/ui/android/conversation/form/FormRendering;", "T", "", "state", "Lzendesk/ui/android/conversation/form/FormState;", "fieldRenderings", "", "Lzendesk/ui/android/conversation/form/FieldRendering;", "onFormCompleted", "Lkotlin/Function1;", "", "onFormChanged", "onFormFocusChanged", "", "onFormDisplayedFieldsChanged", "Lkotlin/Function2;", "Lzendesk/ui/android/conversation/form/DisplayedField;", "", "mapOfDisplayedForm", "", "Lzendesk/ui/android/conversation/form/DisplayedForm;", "formId", "<init>", "(Lzendesk/ui/android/conversation/form/FormState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/util/Map;Ljava/lang/String;)V", "getState", "()Lzendesk/ui/android/conversation/form/FormState;", "getFieldRenderings$zendesk_ui_ui_android", "()Ljava/util/List;", "getOnFormCompleted$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "getOnFormChanged$zendesk_ui_ui_android", "getOnFormFocusChanged$zendesk_ui_ui_android", "getOnFormDisplayedFieldsChanged$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function2;", "getMapOfDisplayedForm$zendesk_ui_ui_android", "()Ljava/util/Map;", "getFormId$zendesk_ui_ui_android", "()Ljava/lang/String;", "component1", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "copy", "equals", "other", "hashCode", "", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FormRendering<T> {
    public static final int $stable = 8;

    @NotNull
    private final List<FieldRendering<T>> fieldRenderings;

    @NotNull
    private final String formId;

    @NotNull
    private final Map<String, DisplayedForm> mapOfDisplayedForm;

    @NotNull
    private final Function1<List<? extends T>, Unit> onFormChanged;

    @NotNull
    private final Function1<List<? extends T>, Unit> onFormCompleted;

    @NotNull
    private final Function2<DisplayedField, String, Unit> onFormDisplayedFieldsChanged;

    @NotNull
    private final Function1<Boolean, Unit> onFormFocusChanged;

    @NotNull
    private final FormState state;

    public FormRendering(FormState formState, List list, Function1 function1, Function1 function12, Function1 function13, Function2 function2, Map map, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new FormState(0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 2047, null) : formState, (i11 & 2) != 0 ? n0.f26529a : list, (i11 & 4) != 0 ? new zendesk.ui.android.conversation.articleviewer.b(29) : function1, (i11 & 8) != 0 ? new e(0) : function12, (i11 & 16) != 0 ? new e(1) : function13, (i11 & 32) != 0 ? new yn.a(25) : function2, (i11 & 64) != 0 ? new HashMap() : map, (i11 & 128) != 0 ? "" : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(List list) {
        list.getClass();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(DisplayedField displayedField, String str) {
        displayedField.getClass();
        str.getClass();
        return Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormRendering copy$default(FormRendering formRendering, FormState formState, List list, Function1 function1, Function1 function12, Function1 function13, Function2 function2, Map map, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            formState = formRendering.state;
        }
        if ((i11 & 2) != 0) {
            list = formRendering.fieldRenderings;
        }
        if ((i11 & 4) != 0) {
            function1 = formRendering.onFormCompleted;
        }
        if ((i11 & 8) != 0) {
            function12 = formRendering.onFormChanged;
        }
        if ((i11 & 16) != 0) {
            function13 = formRendering.onFormFocusChanged;
        }
        if ((i11 & 32) != 0) {
            function2 = formRendering.onFormDisplayedFieldsChanged;
        }
        if ((i11 & 64) != 0) {
            map = formRendering.mapOfDisplayedForm;
        }
        if ((i11 & 128) != 0) {
            str = formRendering.formId;
        }
        Map map2 = map;
        String str2 = str;
        Function1 function14 = function13;
        Function2 function22 = function2;
        return formRendering.copy(formState, list, function1, function12, function14, function22, map2, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FormState getState() {
        return this.state;
    }

    @NotNull
    public final List<FieldRendering<T>> component2$zendesk_ui_ui_android() {
        return this.fieldRenderings;
    }

    @NotNull
    public final Function1<List<? extends T>, Unit> component3$zendesk_ui_ui_android() {
        return this.onFormCompleted;
    }

    @NotNull
    public final Function1<List<? extends T>, Unit> component4$zendesk_ui_ui_android() {
        return this.onFormChanged;
    }

    @NotNull
    public final Function1<Boolean, Unit> component5$zendesk_ui_ui_android() {
        return this.onFormFocusChanged;
    }

    @NotNull
    public final Function2<DisplayedField, String, Unit> component6$zendesk_ui_ui_android() {
        return this.onFormDisplayedFieldsChanged;
    }

    @NotNull
    public final Map<String, DisplayedForm> component7$zendesk_ui_ui_android() {
        return this.mapOfDisplayedForm;
    }

    @NotNull
    /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    @NotNull
    public final FormRendering<T> copy(@NotNull FormState state, @NotNull List<? extends FieldRendering<T>> fieldRenderings, @NotNull Function1<? super List<? extends T>, Unit> onFormCompleted, @NotNull Function1<? super List<? extends T>, Unit> onFormChanged, @NotNull Function1<? super Boolean, Unit> onFormFocusChanged, @NotNull Function2<? super DisplayedField, ? super String, Unit> onFormDisplayedFieldsChanged, @NotNull Map<String, DisplayedForm> mapOfDisplayedForm, @NotNull String formId) {
        state.getClass();
        fieldRenderings.getClass();
        onFormCompleted.getClass();
        onFormChanged.getClass();
        onFormFocusChanged.getClass();
        onFormDisplayedFieldsChanged.getClass();
        mapOfDisplayedForm.getClass();
        formId.getClass();
        return new FormRendering<>(state, fieldRenderings, onFormCompleted, onFormChanged, onFormFocusChanged, onFormDisplayedFieldsChanged, mapOfDisplayedForm, formId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormRendering)) {
            return false;
        }
        FormRendering formRendering = (FormRendering) other;
        return Intrinsics.areEqual(this.state, formRendering.state) && Intrinsics.areEqual(this.fieldRenderings, formRendering.fieldRenderings) && Intrinsics.areEqual(this.onFormCompleted, formRendering.onFormCompleted) && Intrinsics.areEqual(this.onFormChanged, formRendering.onFormChanged) && Intrinsics.areEqual(this.onFormFocusChanged, formRendering.onFormFocusChanged) && Intrinsics.areEqual(this.onFormDisplayedFieldsChanged, formRendering.onFormDisplayedFieldsChanged) && Intrinsics.areEqual(this.mapOfDisplayedForm, formRendering.mapOfDisplayedForm) && Intrinsics.areEqual(this.formId, formRendering.formId);
    }

    @NotNull
    public final List<FieldRendering<T>> getFieldRenderings$zendesk_ui_ui_android() {
        return this.fieldRenderings;
    }

    @NotNull
    public final String getFormId$zendesk_ui_ui_android() {
        return this.formId;
    }

    @NotNull
    public final Map<String, DisplayedForm> getMapOfDisplayedForm$zendesk_ui_ui_android() {
        return this.mapOfDisplayedForm;
    }

    @NotNull
    public final Function1<List<? extends T>, Unit> getOnFormChanged$zendesk_ui_ui_android() {
        return this.onFormChanged;
    }

    @NotNull
    public final Function1<List<? extends T>, Unit> getOnFormCompleted$zendesk_ui_ui_android() {
        return this.onFormCompleted;
    }

    @NotNull
    public final Function2<DisplayedField, String, Unit> getOnFormDisplayedFieldsChanged$zendesk_ui_ui_android() {
        return this.onFormDisplayedFieldsChanged;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFormFocusChanged$zendesk_ui_ui_android() {
        return this.onFormFocusChanged;
    }

    @NotNull
    public final FormState getState() {
        return this.state;
    }

    public int hashCode() {
        return this.formId.hashCode() + a0.f(this.mapOfDisplayedForm, (this.onFormDisplayedFieldsChanged.hashCode() + r8.k.d(r8.k.d(r8.k.d(e0.f.c(this.fieldRenderings, this.state.hashCode() * 31, 31), 31, this.onFormCompleted), 31, this.onFormChanged), 31, this.onFormFocusChanged)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "FormRendering(state=" + this.state + ", fieldRenderings=" + this.fieldRenderings + ", onFormCompleted=" + this.onFormCompleted + ", onFormChanged=" + this.onFormChanged + ", onFormFocusChanged=" + this.onFormFocusChanged + ", onFormDisplayedFieldsChanged=" + this.onFormDisplayedFieldsChanged + ", mapOfDisplayedForm=" + this.mapOfDisplayedForm + ", formId=" + this.formId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormRendering(@NotNull FormState formState, @NotNull List<? extends FieldRendering<T>> list, @NotNull Function1<? super List<? extends T>, Unit> function1, @NotNull Function1<? super List<? extends T>, Unit> function12, @NotNull Function1<? super Boolean, Unit> function13, @NotNull Function2<? super DisplayedField, ? super String, Unit> function2, @NotNull Map<String, DisplayedForm> map, @NotNull String str) {
        formState.getClass();
        list.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function2.getClass();
        map.getClass();
        str.getClass();
        this.state = formState;
        this.fieldRenderings = list;
        this.onFormCompleted = function1;
        this.onFormChanged = function12;
        this.onFormFocusChanged = function13;
        this.onFormDisplayedFieldsChanged = function2;
        this.mapOfDisplayedForm = map;
        this.formId = str;
    }

    public FormRendering() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
