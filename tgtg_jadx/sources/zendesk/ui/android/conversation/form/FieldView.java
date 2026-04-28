package zendesk.ui.android.conversation.form;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.l0;
import bg.s;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import n20.n;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.form.FieldRendering;
import zendesk.ui.android.conversation.form.FieldState;
import zendesk.ui.android.conversation.receipt.MessageReceiptPosition;
import zendesk.ui.android.conversation.receipt.MessageReceiptRendering;
import zendesk.ui.android.conversation.receipt.MessageReceiptState;
import zendesk.ui.android.conversation.receipt.MessageReceiptView;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.Patterns;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u001a\u0010\u001f\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030 H\u0016J\u0014\u0010!\u001a\u00020\u001e2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0002J$\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0002J\u0018\u0010)\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030#2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010*\u001a\u00020\u001e2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020&H\u0002J\u0012\u0010-\u001a\u0004\u0018\u00010&*\u0006\u0012\u0002\b\u00030#H\u0002J\u0014\u0010.\u001a\u00020\u001e*\u00020(2\u0006\u0010%\u001a\u00020&H\u0002J\f\u0010/\u001a\u00020\u001e*\u00020(H\u0002J\u0014\u0010!\u001a\u00020\u001e2\n\u0010\"\u001a\u0006\u0012\u0002\b\u000300H\u0002J\u0014\u0010!\u001a\u00020\u001e2\n\u0010\"\u001a\u0006\u0012\u0002\b\u000301H\u0002J\u0012\u00102\u001a\u00020\u001e2\b\b\u0002\u00103\u001a\u00020\u0019H\u0002J\u0018\u00104\u001a\u00020\u001e2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106H\u0014J\u0018\u00108\u001a\u00020\u001e2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106H\u0014J\u0017\u00109\u001a\u00020\u00192\b\b\u0002\u0010:\u001a\u00020\u0019H\u0000¢\u0006\u0002\b;J\u0014\u00109\u001a\u00020\u0019*\u00020<2\u0006\u0010:\u001a\u00020\u0019H\u0002J\u0014\u00109\u001a\u00020\u0019*\u00020=2\u0006\u0010:\u001a\u00020\u0019H\u0002J\u0014\u00109\u001a\u00020\u0019*\u00020>2\u0006\u0010:\u001a\u00020\u0019H\u0002J\u0014\u00109\u001a\u00020\u0019*\u00020?2\u0006\u0010:\u001a\u00020\u0019H\u0002J \u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020\tH\u0002J\b\u0010E\u001a\u00020AH\u0002J\b\u0010F\u001a\u00020\u0019H\u0002J\u0010\u0010G\u001a\u00020\u00192\u0006\u0010H\u001a\u00020AH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/form/FieldRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "messageReceiptView", "Lzendesk/ui/android/conversation/receipt/MessageReceiptView;", "fieldLabel", "Landroid/widget/TextView;", "fieldLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "fieldInput", "Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;", "rendering", "textWatcher", "Landroid/text/TextWatcher;", "requestFocus", "", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "render", "", "renderingUpdate", "Lkotlin/Function1;", "renderFormField", "fieldRendering", "Lzendesk/ui/android/conversation/form/FieldRendering$Select;", "updateInputFieldOption", "selectedOption", "Lzendesk/ui/android/conversation/form/SelectOption;", "arrayAdapter", "Lzendesk/ui/android/conversation/form/FieldInputArrayAdapter;", "updateStateOnSelection", "setPrefillOrFirstOption", "fieldInputAdapter", "firstOption", "getPrefillOption", "updateCurrentSelectedOption", "updateInputFieldText", "Lzendesk/ui/android/conversation/form/FieldRendering$Text;", "Lzendesk/ui/android/conversation/form/FieldRendering$Email;", "updateBackground", "hasError", "dispatchSaveInstanceState", "container", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "dispatchRestoreInstanceState", "validate", "includeFocus", "validate$zendesk_ui_ui_android", "Lzendesk/ui/android/conversation/form/FieldState;", "Lzendesk/ui/android/conversation/form/FieldState$Text;", "Lzendesk/ui/android/conversation/form/FieldState$Email;", "Lzendesk/ui/android/conversation/form/FieldState$Select;", "resolvePluralErrorText", "", "textResourceId", AnnotatedPrivateKey.LABEL, "length", "resolveEmptyErrorText", "renderNoError", "renderError", StatusResponseUtils.RESULT_ERROR, "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldView.kt\nzendesk/ui/android/conversation/form/FieldView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 TextView.kt\nzendesk/ui/android/internal/TextViewKt\n*L\n1#1,533:1\n1#2:534\n299#3,2:535\n57#4,23:537\n92#4,2:560\n57#4,23:562\n92#4,2:585\n57#4,23:587\n92#4,2:610\n*S KotlinDebug\n*F\n+ 1 FieldView.kt\nzendesk/ui/android/conversation/form/FieldView\n*L\n101#1:535,2\n214#1:537,23\n214#1:560,2\n319#1:562,23\n319#1:585,2\n340#1:587,23\n340#1:610,2\n*E\n"})
public final class FieldView extends FrameLayout implements Renderer<FieldRendering<?>> {
    public static final int $stable = 8;

    @NotNull
    private final MaterialAutoCompleteTextView fieldInput;

    @NotNull
    private final TextView fieldLabel;

    @NotNull
    private final TextInputLayout fieldLayout;

    @NotNull
    private final MessageReceiptView messageReceiptView;

    @NotNull
    private FieldRendering<?> rendering;

    @Nullable
    private TextWatcher textWatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        Function1 function1 = null;
        Function1 function12 = null;
        int i13 = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        this.rendering = new FieldRendering.Text(new FieldState.Text(null, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 2047, null), function1, function12, new zendesk.ui.android.conversation.articleviewer.b(27), objArr, i13, 54, null);
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_Field, false);
        View.inflate(context, R.layout.zuia_view_field, this);
        setClipToPadding(false);
        setClipChildren(false);
        View viewFindViewById = findViewById(R.id.zuia_error_indicator);
        viewFindViewById.getClass();
        this.messageReceiptView = (MessageReceiptView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_field_layout);
        viewFindViewById2.getClass();
        TextInputLayout textInputLayout = (TextInputLayout) viewFindViewById2;
        this.fieldLayout = textInputLayout;
        textInputLayout.setBoxStrokeWidthFocused((int) getResources().getDimension(R.dimen.zuia_border_width));
        View viewFindViewById3 = findViewById(R.id.zuia_field_label);
        viewFindViewById3.getClass();
        this.fieldLabel = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.zuia_field_input);
        viewFindViewById4.getClass();
        this.fieldInput = (MaterialAutoCompleteTextView) viewFindViewById4;
        View viewFindViewById5 = textInputLayout.findViewById(com.app.tgtg.R.id.text_input_end_icon);
        int dimensionPixelSize = viewFindViewById5.getResources().getDimensionPixelSize(R.dimen.zuia_control_min_size);
        viewFindViewById5.setMinimumWidth(dimensionPixelSize);
        viewFindViewById5.setMinimumHeight(dimensionPixelSize);
        viewFindViewById5.requestLayout();
        this.textWatcher = null;
        render(new zendesk.core.android.internal.a(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldRendering _init_$lambda$2(FieldView fieldView, FieldRendering fieldRendering) {
        fieldRendering.getClass();
        return fieldView.rendering;
    }

    private final SelectOption getPrefillOption(FieldRendering.Select<?> select) {
        String placeholder = select.getState().getPlaceholder();
        Object obj = null;
        if (placeholder == null || placeholder.length() == 0) {
            return null;
        }
        Iterator<T> it = select.getState().getOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((SelectOption) next).getId(), select.getState().getPlaceholder())) {
                obj = next;
                break;
            }
        }
        return (SelectOption) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$4(FieldView fieldView, View view, boolean z11) {
        fieldView.validate(fieldView.rendering.getState(), true);
        updateBackground$default(fieldView, false, 1, null);
    }

    private final boolean renderError(String error) {
        this.messageReceiptView.render(new b(error, this, 1));
        updateBackground(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageReceiptRendering renderError$lambda$21(String str, FieldView fieldView, MessageReceiptRendering messageReceiptRendering) {
        messageReceiptRendering.getClass();
        return new MessageReceiptRendering.Builder().state(new b(str, fieldView, 0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageReceiptState renderError$lambda$21$lambda$20(String str, FieldView fieldView, MessageReceiptState messageReceiptState) {
        messageReceiptState.getClass();
        return new MessageReceiptState.Builder().label(str).iconColor(fieldView.rendering.getState().getOnErrorColor()).labelColor(fieldView.rendering.getState().getOnErrorColor()).messageReceiptPosition(MessageReceiptPosition.INBOUND_FAILED).getState();
    }

    private final void renderFormField(final FieldRendering.Select<?> fieldRendering) {
        this.fieldInput.setImeOptions(6);
        this.fieldLayout.setEndIconMode(3);
        ViewKt.outlinedBoxBackground$default(this.fieldLayout, ColorExtKt.adjustAlpha(this.rendering.getState().getBorderColor(), 0.55f), 0.0f, 0.0f, this.rendering.getState().getInputFieldBackgroundColor(), 6, null);
        this.fieldLayout.setEndIconTintList(ColorStateList.valueOf(this.rendering.getState().getLabelTextColor()));
        this.fieldLayout.setEndIconCheckable(false);
        this.fieldLayout.setEndIconContentDescription(getResources().getString(R.string.zuia_form_dropdown_menu_accessibility_label, this.fieldLabel.getText()));
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.fieldInput;
        n20.j jVarE = n20.j.e(getContext(), 0.0f, null);
        jVarE.A(getResources().getDimension(R.dimen.zuia_divider_size));
        jVarE.z(ColorStateList.valueOf(this.rendering.getState().getBorderColor()));
        float dimension = getResources().getDimension(R.dimen.zuia_message_cell_radius);
        n nVarH = jVarE.f30345b.f30318a.h();
        nVarH.b(dimension);
        jVarE.setShapeAppearanceModel(nVarH.a());
        materialAutoCompleteTextView.setDropDownBackgroundDrawable(jVarE);
        Context context = getContext();
        context.getClass();
        final FieldInputArrayAdapter fieldInputArrayAdapter = new FieldInputArrayAdapter(context, R.layout.zuia_item_field_option, fieldRendering.getState().getOptions(), Integer.valueOf(this.rendering.getState().getFocusedBorderColor()));
        this.fieldInput.setAdapter(fieldInputArrayAdapter);
        setPrefillOrFirstOption(fieldRendering, fieldInputArrayAdapter, fieldRendering.getState().getSelect().isEmpty() ? fieldRendering.getState().getOptions().get(0) : (SelectOption) CollectionsKt.O(fieldRendering.getState().getSelect()));
        this.fieldInput.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: zendesk.ui.android.conversation.form.c
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
                FieldView.renderFormField$lambda$6(fieldInputArrayAdapter, this, fieldRendering, adapterView, view, i11, j9);
            }
        });
        this.fieldInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zendesk.ui.android.conversation.form.d
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                FieldView.renderFormField$lambda$8(fieldRendering, this, fieldInputArrayAdapter, view, z11);
            }
        });
        this.fieldInput.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: zendesk.ui.android.conversation.form.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                return FieldView.renderFormField$lambda$9(this, fieldInputArrayAdapter, fieldRendering, textView, i11, keyEvent);
            }
        });
        MaterialAutoCompleteTextView materialAutoCompleteTextView2 = this.fieldInput;
        TextWatcher textWatcher = new TextWatcher() { // from class: zendesk.ui.android.conversation.form.FieldView$renderFormField$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s7) {
                if (s7 == null || s7.length() == 0) {
                    fieldInputArrayAdapter.resetInvalidTypedTextQuery$zendesk_ui_ui_android();
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        };
        materialAutoCompleteTextView2.addTextChangedListener(textWatcher);
        this.textWatcher = textWatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderFormField$lambda$15(FieldRendering.Text text, FieldView fieldView, View view, boolean z11) {
        text.getOnFieldFocusChanged$zendesk_ui_ui_android().invoke(Boolean.valueOf(z11));
        updateBackground$default(fieldView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderFormField$lambda$18(FieldRendering.Email email, FieldView fieldView, View view, boolean z11) {
        email.getOnFieldFocusChanged$zendesk_ui_ui_android().invoke(Boolean.valueOf(z11));
        updateBackground$default(fieldView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderFormField$lambda$6(FieldInputArrayAdapter fieldInputArrayAdapter, FieldView fieldView, FieldRendering.Select select, AdapterView adapterView, View view, int i11, long j9) {
        fieldView.updateInputFieldOption(fieldInputArrayAdapter.getItem(i11), fieldInputArrayAdapter, select);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderFormField$lambda$8(FieldRendering.Select select, FieldView fieldView, FieldInputArrayAdapter fieldInputArrayAdapter, View view, boolean z11) {
        select.getOnFieldFocusChanged$zendesk_ui_ui_android().invoke(Boolean.valueOf(z11));
        fieldView.validate$zendesk_ui_ui_android(true);
        updateBackground$default(fieldView, false, 1, null);
        fieldView.updateInputFieldText(fieldInputArrayAdapter);
        if (z11) {
            if (fieldView.getPrefillOption(select) != null) {
                fieldView.updateInputFieldOption(fieldInputArrayAdapter.getCurrentSelectedOption$zendesk_ui_ui_android(), fieldInputArrayAdapter, select);
            }
            fieldView.fieldInput.showDropDown();
            ViewKt.requestLayoutOnKeyBoardShown(fieldView.fieldInput);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean renderFormField$lambda$9(FieldView fieldView, FieldInputArrayAdapter fieldInputArrayAdapter, FieldRendering.Select select, TextView textView, int i11, KeyEvent keyEvent) {
        Editable text = fieldView.fieldInput.getText();
        if (text != null && text.length() != 0 && fieldView.fieldInput.isPopupShowing() && fieldInputArrayAdapter.hasValidSuggestions$zendesk_ui_ui_android()) {
            fieldView.setPrefillOrFirstOption(select, fieldInputArrayAdapter, fieldInputArrayAdapter.getItem(0));
        }
        select.getOnCheckMarkPressed$zendesk_ui_ui_android().invoke();
        return false;
    }

    private final boolean renderNoError() {
        this.messageReceiptView.render(new zendesk.ui.android.conversation.articleviewer.b(28));
        updateBackground(false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageReceiptRendering renderNoError$lambda$19(MessageReceiptRendering messageReceiptRendering) {
        messageReceiptRendering.getClass();
        return new MessageReceiptRendering.Builder().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldState.Text rendering$lambda$0(FieldState.Text text) {
        text.getClass();
        return text;
    }

    private final String resolveEmptyErrorText() {
        String string = getResources().getString(R.string.zuia_form_field_required_with_name_label, this.fieldLabel.getText());
        string.getClass();
        return string;
    }

    private final String resolvePluralErrorText(int textResourceId, String label, int length) {
        String string = getResources().getString(textResourceId, label, Integer.valueOf(length));
        string.getClass();
        return string;
    }

    private final void setPrefillOrFirstOption(FieldRendering.Select<?> fieldRendering, FieldInputArrayAdapter fieldInputAdapter, SelectOption firstOption) {
        SelectOption prefillOption = getPrefillOption(fieldRendering);
        if (prefillOption != null) {
            firstOption = prefillOption;
        }
        updateInputFieldOption(firstOption, fieldInputAdapter, fieldRendering);
    }

    private final void updateBackground(boolean hasError) {
        if (hasError) {
            ViewKt.outlinedBoxBackground$default(this.fieldLayout, this.rendering.getState().getOnErrorColor(), 0.0f, 0.0f, this.rendering.getState().getInputFieldBackgroundColor(), 6, null);
            return;
        }
        boolean zHasFocus = this.fieldInput.hasFocus();
        TextInputLayout textInputLayout = this.fieldLayout;
        if (zHasFocus) {
            textInputLayout.setBoxStrokeColor(this.rendering.getState().getFocusedBorderColor());
            this.fieldLayout.setEndIconTintList(ColorStateList.valueOf(this.rendering.getState().getFocusedBorderColor()));
        } else {
            ViewKt.outlinedBoxBackground$default(textInputLayout, ColorExtKt.adjustAlpha(this.rendering.getState().getBorderColor(), 0.55f), 0.0f, 0.0f, this.rendering.getState().getInputFieldBackgroundColor(), 6, null);
            this.fieldLayout.setEndIconTintList(ColorStateList.valueOf(this.rendering.getState().getLabelTextColor()));
        }
    }

    public static /* synthetic */ void updateBackground$default(FieldView fieldView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = !fieldView.validate$zendesk_ui_ui_android(true);
        }
        fieldView.updateBackground(z11);
    }

    private final void updateCurrentSelectedOption(FieldInputArrayAdapter fieldInputArrayAdapter, SelectOption selectOption) {
        fieldInputArrayAdapter.setCurrentSelectedOption$zendesk_ui_ui_android(selectOption);
        fieldInputArrayAdapter.resetInvalidTypedTextQuery$zendesk_ui_ui_android();
        fieldInputArrayAdapter.resetSuggestions$zendesk_ui_ui_android();
    }

    private final void updateInputFieldOption(SelectOption selectedOption, FieldInputArrayAdapter arrayAdapter, FieldRendering.Select<?> fieldRendering) {
        updateCurrentSelectedOption(arrayAdapter, selectedOption);
        updateStateOnSelection(fieldRendering, selectedOption);
        this.fieldInput.setText((CharSequence) selectedOption.getLabel(), false);
        this.fieldInput.setSelection(selectedOption.getLabel().length());
    }

    private final void updateInputFieldText(FieldInputArrayAdapter fieldInputArrayAdapter) {
        if (!this.fieldInput.hasFocus()) {
            this.fieldInput.setText((CharSequence) fieldInputArrayAdapter.getCurrentSelectedOption$zendesk_ui_ui_android().getLabel(), false);
            fieldInputArrayAdapter.resetSuggestions$zendesk_ui_ui_android();
        } else {
            String invalidTypedTextQuery$zendesk_ui_ui_android = fieldInputArrayAdapter.getInvalidTypedTextQuery();
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.fieldInput;
            if (invalidTypedTextQuery$zendesk_ui_ui_android == null) {
                invalidTypedTextQuery$zendesk_ui_ui_android = "";
            }
            materialAutoCompleteTextView.setText((CharSequence) invalidTypedTextQuery$zendesk_ui_ui_android, false);
            fieldInputArrayAdapter.performFilterOnInvalidTypedQuery$zendesk_ui_ui_android();
        }
    }

    private final void updateStateOnSelection(FieldRendering.Select<?> select, SelectOption selectOption) {
        FieldRendering.Select selectCopy$default = FieldRendering.Select.copy$default(select, FieldState.Select.copy$default(select.getState(), null, c0.c(selectOption), null, null, 0, 0, 0, 0, 0, 0, 1021, null), null, null, null, null, null, 0, 126, null);
        this.rendering = selectCopy$default;
        validate(selectCopy$default.getState(), true);
        selectCopy$default.getOnStateChanged().invoke(selectCopy$default.getState());
    }

    private final boolean validate(FieldState.Text text, boolean z11) {
        boolean zHasFocus = this.fieldInput.hasFocus();
        String text2 = text.getText();
        if (text2 == null) {
            text2 = "";
        }
        int length = text2.length();
        if (length > text.getMaxLength$zendesk_ui_ui_android()) {
            return renderError(resolvePluralErrorText(R.string.zuia_form_field_max_character_error_with_name_label, this.fieldLabel.getText().toString(), text.getMaxLength$zendesk_ui_ui_android()));
        }
        if (z11 && zHasFocus) {
            return renderNoError();
        }
        String text3 = text.getText();
        return (text3 == null || StringsKt.H(text3)) ? renderError(resolveEmptyErrorText()) : length < text.getMinLength$zendesk_ui_ui_android() ? renderError(resolvePluralErrorText(R.string.zuia_form_field_min_character_error_with_name_label, this.fieldLabel.getText().toString(), text.getMinLength$zendesk_ui_ui_android())) : renderNoError();
    }

    public static /* synthetic */ boolean validate$zendesk_ui_ui_android$default(FieldView fieldView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return fieldView.validate$zendesk_ui_ui_android(z11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@Nullable SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(@Nullable SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super FieldRendering<?>, ? extends FieldRendering<?>> renderingUpdate) {
        renderingUpdate.getClass();
        FieldRendering<?> fieldRendering = (FieldRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = fieldRendering;
        this.fieldLayout.setBoxStrokeColor(fieldRendering.getState().getBorderColor());
        this.fieldLayout.setErrorIconDrawable((Drawable) null);
        this.fieldLabel.setTextColor(this.rendering.getState().getLabelTextColor());
        this.fieldLabel.setText(this.rendering.getState().getLabel());
        TextView textView = this.fieldLabel;
        String label = this.rendering.getState().getLabel();
        int dimensionPixelSize = 0;
        textView.setVisibility((label == null || StringsKt.H(label)) ? 8 : 0);
        this.fieldLabel.setContentDescription(getResources().getString(R.string.zuia_form_field_required_accessibility_label, this.fieldLabel.getText()));
        ViewGroup.LayoutParams layoutParams = this.fieldLabel.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        String label2 = this.rendering.getState().getLabel();
        if (label2 != null && !StringsKt.H(label2)) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.zuia_spacing_xsmall);
        }
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        this.fieldLabel.setLayoutParams(marginLayoutParams);
        this.fieldInput.removeTextChangedListener(this.textWatcher);
        this.fieldInput.setTextColor(this.rendering.getState().getInputTextColor());
        this.fieldInput.setOnFocusChangeListener(new s(this, 8));
        this.fieldInput.setInputType(this.rendering.getInputType());
        FieldRendering<?> fieldRendering2 = this.rendering;
        if (fieldRendering2 instanceof FieldRendering.Text) {
            renderFormField((FieldRendering.Text<?>) fieldRendering2);
        } else if (fieldRendering2 instanceof FieldRendering.Email) {
            renderFormField((FieldRendering.Email<?>) fieldRendering2);
        } else {
            if (!(fieldRendering2 instanceof FieldRendering.Select)) {
                e40.a.f();
                return;
            }
            renderFormField((FieldRendering.Select<?>) fieldRendering2);
        }
        if (this.rendering instanceof FieldRendering.Select) {
            ViewKt.requestLayoutOnKeyBoardShown(this.fieldInput);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, @Nullable Rect previouslyFocusedRect) {
        if (previouslyFocusedRect != null) {
            return this.fieldInput.requestFocus(direction, previouslyFocusedRect);
        }
        return false;
    }

    public final boolean validate$zendesk_ui_ui_android(boolean includeFocus) {
        return validate(this.rendering.getState(), includeFocus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean validate(FieldState fieldState, boolean z11) {
        if (fieldState instanceof FieldState.Text) {
            return validate((FieldState.Text) fieldState, z11);
        }
        if (fieldState instanceof FieldState.Email) {
            return validate((FieldState.Email) fieldState, z11);
        }
        if (fieldState instanceof FieldState.Select) {
            return validate((FieldState.Select) fieldState, z11);
        }
        e40.a.f();
        return false;
    }

    private final boolean validate(FieldState.Email email, boolean z11) {
        boolean zHasFocus = this.fieldInput.hasFocus();
        if (z11 && zHasFocus) {
            return renderNoError();
        }
        Regex email_regex = Patterns.INSTANCE.getEMAIL_REGEX();
        String email2 = email.getEmail();
        if (email2 == null) {
            email2 = "";
        }
        if (email_regex.e(email2)) {
            return renderNoError();
        }
        String email3 = email.getEmail();
        if (email3 != null && !StringsKt.H(email3)) {
            String string = getResources().getString(R.string.zuia_form_field_invalid_email_error);
            string.getClass();
            return renderError(string);
        }
        return renderError(resolveEmptyErrorText());
    }

    private final boolean validate(FieldState.Select select, boolean z11) {
        boolean zHasFocus = this.fieldInput.hasFocus();
        if (z11 && zHasFocus) {
            return renderNoError();
        }
        if (select.getSelect().isEmpty()) {
            return renderError(resolveEmptyErrorText());
        }
        return renderNoError();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ FieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    private final void renderFormField(final FieldRendering.Text<?> fieldRendering) {
        this.fieldInput.setText(fieldRendering.getState().getText());
        this.fieldLayout.setEndIconVisible(false);
        ViewKt.outlinedBoxBackground$default(this.fieldLayout, ColorExtKt.adjustAlpha(this.rendering.getState().getBorderColor(), 0.55f), 0.0f, 0.0f, this.rendering.getState().getInputFieldBackgroundColor(), 6, null);
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.fieldInput;
        TextWatcher textWatcher = new TextWatcher() { // from class: zendesk.ui.android.conversation.form.FieldView$renderFormField$$inlined$doAfterTextChanged$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s7) {
                FieldRendering.Text text = fieldRendering;
                FieldRendering.Text textCopy$default = FieldRendering.Text.copy$default(text, FieldState.Text.copy$default(text.getState(), String.valueOf(s7), 0, 0, null, null, 0, 0, 0, 0, 0, 0, 2046, null), null, null, null, null, 0, 62, null);
                this.rendering = textCopy$default;
                FieldView fieldView = this;
                fieldView.validate(fieldView.rendering.getState(), true);
                Function1<String, Unit> onTextChanged$zendesk_ui_ui_android = fieldRendering.getOnTextChanged$zendesk_ui_ui_android();
                String text2 = textCopy$default.getState().getText();
                if (text2 == null) {
                    text2 = "";
                }
                onTextChanged$zendesk_ui_ui_android.invoke(text2);
                fieldRendering.getOnStateChanged().invoke(textCopy$default.getState());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        };
        materialAutoCompleteTextView.addTextChangedListener(textWatcher);
        this.textWatcher = textWatcher;
        this.fieldInput.setOnFocusChangeListener(new l0(2, fieldRendering, this));
    }

    private final void renderFormField(final FieldRendering.Email<?> fieldRendering) {
        this.fieldInput.setText(fieldRendering.getState().getEmail());
        this.fieldLayout.setEndIconVisible(false);
        ViewKt.outlinedBoxBackground$default(this.fieldLayout, ColorExtKt.adjustAlpha(this.rendering.getState().getBorderColor(), 0.55f), 0.0f, 0.0f, this.rendering.getState().getInputFieldBackgroundColor(), 6, null);
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.fieldInput;
        TextWatcher textWatcher = new TextWatcher() { // from class: zendesk.ui.android.conversation.form.FieldView$renderFormField$$inlined$doAfterTextChanged$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s7) {
                FieldRendering.Email email = fieldRendering;
                FieldRendering.Email emailCopy$default = FieldRendering.Email.copy$default(email, FieldState.Email.copy$default(email.getState(), String.valueOf(s7), null, null, 0, 0, 0, 0, 0, 0, 510, null), null, null, null, null, 0, 62, null);
                this.rendering = emailCopy$default;
                FieldView fieldView = this;
                fieldView.validate(fieldView.rendering.getState(), true);
                Function1<String, Unit> onEmailChanged$zendesk_ui_ui_android = fieldRendering.getOnEmailChanged$zendesk_ui_ui_android();
                String email2 = emailCopy$default.getState().getEmail();
                if (email2 == null) {
                    email2 = "";
                }
                onEmailChanged$zendesk_ui_ui_android.invoke(email2);
                fieldRendering.getOnStateChanged().invoke(emailCopy$default.getState());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        };
        materialAutoCompleteTextView.addTextChangedListener(textWatcher);
        this.textWatcher = textWatcher;
        this.fieldInput.setOnFocusChangeListener(new l0(3, fieldRendering, this));
    }
}
