package zendesk.ui.android.conversation.form;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qc.y;
import zendesk.core.ui.android.internal.xml.AccessibilityExtKt;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.common.button.ButtonRendering;
import zendesk.ui.android.common.button.ButtonState;
import zendesk.ui.android.common.button.ButtonView;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 :*\u0004\b\u0000\u0010\u00012\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001:B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u001c\u001a\u00020\u001d2\u001e\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J$\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\nH\u0002J\u001e\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0*H\u0002J\b\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020,H\u0002J\b\u0010/\u001a\u00020\u001dH\u0002J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\n2\u0006\u00101\u001a\u00020\nH\u0002J\u001e\u00102\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0*H\u0002J\u001e\u00104\u001a\u00020\u001d*\u0004\u0018\u00010%2\u0006\u0010#\u001a\u00020\n2\u0006\u00105\u001a\u000206H\u0002J\f\u00107\u001a\u00020\u001d*\u00020\u0017H\u0002J\b\u00108\u001a\u00020,H\u0002J\b\u00109\u001a\u00020\u001dH\u0002R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lzendesk/ui/android/conversation/form/FormView;", "T", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/form/FormRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "rendering", "submitButton", "Lzendesk/ui/android/common/button/ButtonView;", "fieldsContainer", "Landroid/widget/LinearLayout;", "formLayout", "fieldStates", "", "fieldViews", "Lzendesk/ui/android/conversation/form/FieldView;", "fieldCounterLabel", "Landroid/widget/TextView;", "borderAlpha", "", "render", "", "renderingUpdate", "Lkotlin/Function1;", "formViewRenderingUpdate", "addFormFieldsFromStorage", "addFieldView", "currentIndex", "displayedField", "Lzendesk/ui/android/conversation/form/DisplayedField;", "numberOfFields", "nextActionButtonClicked", "index", "progressToNextFieldView", "Lkotlin/Function0;", "arePreviousFieldsValid", "", "sendActionButtonClicked", "enableSendActionButton", "setDoneActionListener", "updateFieldCounterLabel", "size", "displayNextFieldView", "displayFieldView", "addToListOfDisplayedFormIfNull", "formId", "", "requestViewFocus", "isCurrentFormStored", "getTheFormBorderAlpha", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFormView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormView.kt\nzendesk/ui/android/conversation/form/FormView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,512:1\n1563#2:513\n1634#2,3:514\n1869#2,2:521\n774#2:523\n865#2,2:524\n774#2:526\n865#2,2:527\n1869#2,2:529\n230#2,2:531\n216#3:517\n216#3,2:518\n217#3:520\n*S KotlinDebug\n*F\n+ 1 FormView.kt\nzendesk/ui/android/conversation/form/FormView\n*L\n93#1:513\n93#1:514,3\n132#1:521,2\n243#1:523\n243#1:524,2\n252#1:526\n252#1:527,2\n254#1:529,2\n260#1:531,2\n119#1:517\n122#1:518,2\n119#1:520\n*E\n"})
public final class FormView<T> extends FrameLayout implements Renderer<FormRendering<T>> {
    private static final long ACCESSIBILITY_EVENT_DELAY = 500;

    @Deprecated
    public static final float FIELD_COUNTER_ALPHA = 0.65f;
    private float borderAlpha;

    @NotNull
    private final TextView fieldCounterLabel;

    @NotNull
    private final List<T> fieldStates;

    @NotNull
    private final List<FieldView> fieldViews;

    @NotNull
    private final LinearLayout fieldsContainer;

    @NotNull
    private final LinearLayout formLayout;

    @NotNull
    private FormRendering<T> rendering;

    @NotNull
    private final ButtonView submitButton;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new FormRendering<>(null, null, null, null, null, null, null, null, 255, null);
        this.fieldStates = new ArrayList();
        this.fieldViews = new ArrayList();
        View.inflate(context, R.layout.zuia_view_form, this);
        View viewFindViewById = findViewById(R.id.zuia_form_fields_container);
        viewFindViewById.getClass();
        this.fieldsContainer = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_submit_button);
        viewFindViewById2.getClass();
        this.submitButton = (ButtonView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_form_layout);
        viewFindViewById3.getClass();
        this.formLayout = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.zuia_form_field_counter_label);
        viewFindViewById4.getClass();
        this.fieldCounterLabel = (TextView) viewFindViewById4;
    }

    private final void addFieldView(final int currentIndex, final DisplayedField displayedField, final int numberOfFields) {
        if (CollectionsKt.Q(currentIndex, this.fieldViews) == null && currentIndex < numberOfFields) {
            final int i11 = currentIndex + 1;
            final boolean z11 = currentIndex == numberOfFields + (-1);
            LinearLayout linearLayout = this.fieldsContainer;
            Context context = getContext();
            context.getClass();
            FieldView fieldView = new FieldView(context, null, 0, 0, 14, null);
            fieldView.render(new Function1() { // from class: zendesk.ui.android.conversation.form.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FormView.addFieldView$lambda$12$lambda$11(this.f47870a, currentIndex, displayedField, i11, z11, numberOfFields, (FieldRendering) obj);
                }
            });
            this.fieldViews.add(fieldView);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.zuia_vertical_spacing_xlarge);
            linearLayout.addView(fieldView, layoutParams);
            nextActionButtonClicked(currentIndex, new x90.i(this, i11, displayedField, numberOfFields));
            sendActionButtonClicked(z11);
            updateFieldCounterLabel(currentIndex, numberOfFields);
        }
    }

    public static /* synthetic */ void addFieldView$default(FormView formView, int i11, DisplayedField displayedField, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            displayedField = null;
        }
        formView.addFieldView(i11, displayedField, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldRendering addFieldView$lambda$12$lambda$11(final FormView formView, final int i11, DisplayedField displayedField, final int i12, final boolean z11, final int i13, FieldRendering fieldRendering) {
        fieldRendering.getClass();
        final int i14 = 2;
        final int i15 = 0;
        FieldRendering fieldRenderingWithStateFocusChanged = FormViewKt.withStateFocusChanged(FormViewKt.withSelectChangedInterceptor(FormViewKt.withStateChangedInterceptor(FormViewKt.withBorderColorOverride(FormViewKt.withFieldTextPrefilled(formView.rendering.getFieldRenderings$zendesk_ui_ui_android().get(i11), i11, formView.rendering.getFormId$zendesk_ui_ui_android(), formView.rendering.getOnFormDisplayedFieldsChanged$zendesk_ui_ui_android()), formView.rendering.getState().getInputTextColor$zendesk_ui_ui_android(), formView.rendering.getState().getLabelTextColor$zendesk_ui_ui_android(), formView.rendering.getState().getOnErrorColor$zendesk_ui_ui_android(), formView.rendering.getState().getFieldBorderColor$zendesk_ui_ui_android(), formView.rendering.getState().getFocusedFieldBorderColor$zendesk_ui_ui_android(), formView.rendering.getState().getFieldBackgroundColor$zendesk_ui_ui_android()), i11, formView.rendering.getOnFormDisplayedFieldsChanged$zendesk_ui_ui_android(), formView.rendering.getFormId$zendesk_ui_ui_android(), new Function1(formView) { // from class: zendesk.ui.android.conversation.form.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormView f47857b;

            {
                this.f47857b = formView;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return FormView.addFieldView$lambda$12$lambda$11$lambda$7(this.f47857b, i11, (List) obj);
                    case 1:
                        return FormView.addFieldView$lambda$12$lambda$11$lambda$8(this.f47857b, i11, obj);
                    default:
                        return FormView.addFieldView$lambda$12$lambda$11$lambda$6(this.f47857b, i11, obj);
                }
            }
        }), new Function1(formView) { // from class: zendesk.ui.android.conversation.form.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormView f47857b;

            {
                this.f47857b = formView;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return FormView.addFieldView$lambda$12$lambda$11$lambda$7(this.f47857b, i12, (List) obj);
                    case 1:
                        return FormView.addFieldView$lambda$12$lambda$11$lambda$8(this.f47857b, i12, obj);
                    default:
                        return FormView.addFieldView$lambda$12$lambda$11$lambda$6(this.f47857b, i12, obj);
                }
            }
        }), formView.rendering.getOnFormFocusChanged$zendesk_ui_ui_android());
        final int i16 = 1;
        return FormViewKt.withSelectCheckMarkActionInterceptor(FormViewKt.withStateInputCached(fieldRenderingWithStateFocusChanged, displayedField, new Function1(formView) { // from class: zendesk.ui.android.conversation.form.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormView f47857b;

            {
                this.f47857b = formView;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return FormView.addFieldView$lambda$12$lambda$11$lambda$7(this.f47857b, i11, (List) obj);
                    case 1:
                        return FormView.addFieldView$lambda$12$lambda$11$lambda$8(this.f47857b, i11, obj);
                    default:
                        return FormView.addFieldView$lambda$12$lambda$11$lambda$6(this.f47857b, i11, obj);
                }
            }
        }), new Function0() { // from class: zendesk.ui.android.conversation.form.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FormView.addFieldView$lambda$12$lambda$11$lambda$10(z11, formView, i11, i12, i13);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFieldView$lambda$12$lambda$11$lambda$10(boolean z11, FormView formView, int i11, int i12, int i13) {
        FieldView fieldView;
        if (z11 && (fieldView = (FieldView) CollectionsKt.Q(i11, formView.fieldViews)) != null) {
            fieldView.clearFocus();
        }
        formView.displayNextFieldView(i12, new j(formView, i12, i13, 0));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFieldView$lambda$12$lambda$11$lambda$10$lambda$9(FormView formView, int i11, int i12) {
        addFieldView$default(formView, i11, null, i12, 2, null);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFieldView$lambda$12$lambda$11$lambda$6(FormView formView, int i11, Object obj) {
        formView.fieldStates.set(i11, obj);
        formView.rendering.getOnFormChanged$zendesk_ui_ui_android().invoke(formView.fieldStates);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFieldView$lambda$12$lambda$11$lambda$7(FormView formView, int i11, List list) {
        list.getClass();
        FieldView fieldView = (FieldView) CollectionsKt.Q(i11, formView.fieldViews);
        if (fieldView != null) {
            formView.requestViewFocus(fieldView);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFieldView$lambda$12$lambda$11$lambda$8(FormView formView, int i11, Object obj) {
        formView.fieldStates.set(i11, obj);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFieldView$lambda$15(FormView formView, int i11, DisplayedField displayedField, int i12) {
        formView.displayNextFieldView(i11, new j(formView, i11, i12, 1));
        formView.addToListOfDisplayedFormIfNull(displayedField, i11, formView.rendering.getFormId$zendesk_ui_ui_android());
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFieldView$lambda$15$lambda$14(FormView formView, int i11, int i12) {
        addFieldView$default(formView, i11, null, i12, 2, null);
        return Unit.f26487a;
    }

    private final void addFormFieldsFromStorage() {
        Iterator<Map.Entry<String, DisplayedForm>> it = this.rendering.getMapOfDisplayedForm$zendesk_ui_ui_android().entrySet().iterator();
        while (it.hasNext()) {
            DisplayedForm value = it.next().getValue();
            if (Intrinsics.areEqual(value.getFormId(), this.rendering.getFormId$zendesk_ui_ui_android())) {
                for (Map.Entry<Integer, DisplayedField> entry : value.getFields().entrySet()) {
                    addFieldView(entry.getValue().getIndex(), entry.getValue(), this.rendering.getFieldRenderings$zendesk_ui_ui_android().size());
                }
            }
        }
        Iterator<T> it2 = this.fieldViews.iterator();
        while (it2.hasNext()) {
            FieldView.validate$zendesk_ui_ui_android$default((FieldView) it2.next(), false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addToListOfDisplayedFormIfNull(DisplayedField displayedField, int i11, String str) {
        if (displayedField == null) {
            this.rendering.getOnFormDisplayedFieldsChanged$zendesk_ui_ui_android().invoke(new DisplayedField(i11, null, 2, 0 == true ? 1 : 0), str);
        }
    }

    private final boolean arePreviousFieldsValid() {
        List<FieldView> list = this.fieldViews;
        ArrayList arrayList = new ArrayList();
        for (T t9 : list) {
            if (FieldView.validate$zendesk_ui_ui_android$default((FieldView) t9, false, 1, null)) {
                arrayList.add(t9);
            }
        }
        return arrayList.containsAll(this.fieldViews);
    }

    private final void displayNextFieldView(int index, Function0<Unit> displayFieldView) {
        displayFieldView.invoke();
        FieldView fieldView = (FieldView) CollectionsKt.Q(index, this.fieldViews);
        if (fieldView != null) {
            requestViewFocus(fieldView);
        }
    }

    private final void formViewRenderingUpdate() {
        FormView<T> formView;
        TextView textView;
        if (!isCurrentFormStored() || this.rendering.getState().getHasFailed$zendesk_ui_ui_android()) {
            formView = this;
            addFieldView$default(formView, 0, null, this.rendering.getFieldRenderings$zendesk_ui_ui_android().size(), 2, null);
        } else {
            addFormFieldsFromStorage();
            formView = this;
        }
        FieldView fieldView = (FieldView) CollectionsKt.firstOrNull(formView.fieldViews);
        if (fieldView == null || (textView = (TextView) fieldView.findViewById(R.id.zuia_field_label)) == null) {
            return;
        }
        Context context = getContext();
        context.getClass();
        AccessibilityExtKt.postDelayRequestFocusByAccessibilityEventWhenAccessibilityRunning(textView, context, ACCESSIBILITY_EVENT_DELAY);
    }

    private final void getTheFormBorderAlpha() {
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.zuia_form_border_alpha, typedValue, true);
        this.borderAlpha = typedValue.getFloat();
    }

    private final boolean isCurrentFormStored() {
        DisplayedForm displayedForm;
        Map<Integer, DisplayedField> fields;
        Map<String, DisplayedForm> mapOfDisplayedForm$zendesk_ui_ui_android = this.rendering.getMapOfDisplayedForm$zendesk_ui_ui_android();
        return mapOfDisplayedForm$zendesk_ui_ui_android.containsKey(this.rendering.getFormId$zendesk_ui_ui_android()) && (displayedForm = mapOfDisplayedForm$zendesk_ui_ui_android.get(this.rendering.getFormId$zendesk_ui_ui_android())) != null && (fields = displayedForm.getFields()) != null && (fields.isEmpty() ^ true);
    }

    private final void nextActionButtonClicked(int index, Function0<Unit> progressToNextFieldView) {
        EditText editText;
        FieldView fieldView = (FieldView) CollectionsKt.Q(index, this.fieldViews);
        if (fieldView != null && (editText = (EditText) fieldView.findViewById(R.id.zuia_field_input)) != null && editText.getInputType() != 176) {
            editText.setImeOptions(5);
            editText.setOnEditorActionListener(new fl.e(this, progressToNextFieldView, 1));
        }
        this.submitButton.render(new xq.a(19, this, progressToNextFieldView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nextActionButtonClicked$lambda$17$lambda$16(FormView formView, Function0 function0, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 5 && formView.arePreviousFieldsValid()) {
            function0.invoke();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonRendering nextActionButtonClicked$lambda$19(FormView formView, Function0 function0, ButtonRendering buttonRendering) {
        buttonRendering.getClass();
        return buttonRendering.toBuilder().onButtonClicked(new yl.e(9, formView, function0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nextActionButtonClicked$lambda$19$lambda$18(FormView formView, Function0 function0) {
        if (formView.arePreviousFieldsValid()) {
            function0.invoke();
        }
        formView.requestViewFocus((FieldView) CollectionsKt.W(formView.fieldViews));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonRendering render$lambda$1(FormView formView, ButtonRendering buttonRendering) {
        buttonRendering.getClass();
        return buttonRendering.toBuilder().state(new i(formView, 2)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonState render$lambda$1$lambda$0(FormView formView, ButtonState buttonState) {
        buttonState.getClass();
        boolean pending$zendesk_ui_ui_android = formView.rendering.getState().getPending$zendesk_ui_ui_android();
        int colorAccent$zendesk_ui_ui_android = formView.rendering.getState().getColorAccent$zendesk_ui_ui_android();
        String string = formView.getResources().getString(R.string.zuia_form_next_button);
        string.getClass();
        return ButtonState.copy$default(buttonState, string, pending$zendesk_ui_ui_android, Integer.valueOf(colorAccent$zendesk_ui_ui_android), Integer.valueOf(formView.rendering.getState().getOnActionColor$zendesk_ui_ui_android()), Integer.valueOf(formView.rendering.getState().getOnActionColor$zendesk_ui_ui_android()), false, 32, null);
    }

    private final void requestViewFocus(FieldView fieldView) {
        EditText editText = (EditText) fieldView.findViewById(R.id.zuia_field_input);
        if (editText != null) {
            ViewKt.focusAndShowKeyboard(editText);
        }
    }

    private final void sendActionButtonClicked(boolean enableSendActionButton) {
        if (enableSendActionButton) {
            this.submitButton.render(new i(this, 0));
            setDoneActionListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonRendering sendActionButtonClicked$lambda$26(FormView formView, ButtonRendering buttonRendering) {
        buttonRendering.getClass();
        return buttonRendering.toBuilder().onButtonClicked(new y.a(formView, 29)).state(new i(formView, 3)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendActionButtonClicked$lambda$26$lambda$24(FormView formView) {
        List<FieldView> list = formView.fieldViews;
        ArrayList arrayList = new ArrayList();
        for (T t9 : list) {
            if (FieldView.validate$zendesk_ui_ui_android$default((FieldView) t9, false, 1, null)) {
                arrayList.add(t9);
            }
        }
        boolean zContainsAll = arrayList.containsAll(formView.fieldViews);
        FormRendering<T> formRendering = formView.rendering;
        if (zContainsAll) {
            formRendering.getOnFormCompleted$zendesk_ui_ui_android().invoke(CollectionsKt.r0(formView.fieldStates));
            Iterator<T> it = formView.fieldViews.iterator();
            while (it.hasNext()) {
                ((FieldView) it.next()).clearFocus();
            }
            return Unit.f26487a;
        }
        if (!formRendering.getState().getPending$zendesk_ui_ui_android()) {
            for (FieldView fieldView : formView.fieldViews) {
                if (!FieldView.validate$zendesk_ui_ui_android$default(fieldView, false, 1, null)) {
                    formView.requestViewFocus(fieldView);
                }
            }
            y.h("Collection contains no element matching the predicate.");
            return null;
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonState sendActionButtonClicked$lambda$26$lambda$25(FormView formView, ButtonState buttonState) {
        buttonState.getClass();
        boolean pending$zendesk_ui_ui_android = formView.rendering.getState().getPending$zendesk_ui_ui_android();
        String string = formView.getResources().getString(R.string.zuia_form_send_button);
        string.getClass();
        return ButtonState.copy$default(buttonState, string, pending$zendesk_ui_ui_android, null, null, null, false, 60, null);
    }

    private final void setDoneActionListener() {
        EditText editText = (EditText) ((FieldView) CollectionsKt.W(this.fieldViews)).findViewById(R.id.zuia_field_input);
        editText.setImeOptions(4);
        editText.setOnEditorActionListener(new m0(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDoneActionListener$lambda$28$lambda$27(FormView formView, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return false;
        }
        formView.submitButton.performClick();
        return true;
    }

    private final void updateFieldCounterLabel(int index, int size) {
        this.fieldCounterLabel.setTextColor(ColorExtKt.adjustAlpha(this.rendering.getState().getLabelTextColor$zendesk_ui_ui_android(), 0.65f));
        this.fieldCounterLabel.setText(getResources().getString(R.string.zuia_form_field_counter_label, Integer.valueOf(index + 1), Integer.valueOf(size)));
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super FormRendering<T>, FormRendering<T>> renderingUpdate) {
        renderingUpdate.getClass();
        this.rendering = (FormRendering) renderingUpdate.invoke(this.rendering);
        this.submitButton.render(new i(this, 1));
        getTheFormBorderAlpha();
        LinearLayout linearLayout = this.formLayout;
        Context context = getContext();
        context.getClass();
        ViewKt.outlinedBoxBackground$default(linearLayout, ColorExtKt.adjustAlpha(ColorExtKt.resolveColorAttr(context, com.app.tgtg.R.attr.colorOnSurface), this.borderAlpha), 0.0f, 0.0f, this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android(), 6, null);
        this.fieldsContainer.removeAllViews();
        this.fieldViews.clear();
        this.fieldStates.clear();
        List<T> list = this.fieldStates;
        List<FieldRendering<T>> fieldRenderings$zendesk_ui_ui_android = this.rendering.getFieldRenderings$zendesk_ui_ui_android();
        ArrayList arrayList = new ArrayList(e0.o(fieldRenderings$zendesk_ui_ui_android, 10));
        Iterator<T> it = fieldRenderings$zendesk_ui_ui_android.iterator();
        while (it.hasNext()) {
            arrayList.add(((FieldRendering) it.next()).getNormalizedState());
        }
        list.addAll(arrayList);
        formViewRenderingUpdate();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lzendesk/ui/android/conversation/form/FormView$Companion;", "", "<init>", "()V", "ACCESSIBILITY_EVENT_DELAY", "", "FIELD_COUNTER_ALPHA", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ FormView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
