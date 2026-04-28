package zendesk.ui.android.conversation.form;

import com.app.tgtg.model.local.AppConstants;
import d2.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import t1.h1;
import zendesk.ui.android.conversation.form.FieldRendering;
import zendesk.ui.android.conversation.form.FieldState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a8\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004H\u0002\u001a,\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002\u001a2\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0004H\u0002\u001aH\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0013H\u0002\u001a\\\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0002\u001aZ\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0001\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\u0019\u001a\u00020\u000f2\b\b\u0001\u0010\u001a\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u000f2\b\b\u0001\u0010\u001c\u001a\u00020\u000fH\u0002\u001a<\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0002¨\u0006\u001f"}, d2 = {"withSelectChangedInterceptor", "Lzendesk/ui/android/conversation/form/FieldRendering;", "T", "interceptor", "Lkotlin/Function1;", "", "Lzendesk/ui/android/conversation/form/SelectOption;", "", "withSelectCheckMarkActionInterceptor", "Lkotlin/Function0;", "withStateFocusChanged", "onFieldFocusChanged", "", "withFieldTextPrefilled", "currentIndex", "", "formId", "", "onFormDisplayedFieldsChanged", "Lkotlin/Function2;", "Lzendesk/ui/android/conversation/form/DisplayedField;", "withStateChangedInterceptor", "withBorderColorOverride", "inputTextColor", "labelTextColor", "onErrorColor", "borderColor", "focusedBorderColor", "inputBackgroundColor", "withStateInputCached", "displayedField", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFormView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormView.kt\nzendesk/ui/android/conversation/form/FormViewKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n774#2:513\n865#2,2:514\n*S KotlinDebug\n*F\n+ 1 FormView.kt\nzendesk/ui/android/conversation/form/FormViewKt\n*L\n506#1:513\n506#1:514,2\n*E\n"})
public final class FormViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> FieldRendering<T> withBorderColorOverride(FieldRendering<T> fieldRendering, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (fieldRendering instanceof FieldRendering.Text) {
            FieldRendering.Text text = (FieldRendering.Text) fieldRendering;
            return FieldRendering.Text.copy$default(text, FieldState.Text.copy$default(text.getState(), null, 0, 0, null, null, i13, i14, i15, i11, i12, i16, 31, null), null, null, null, null, 0, 62, null);
        }
        if (fieldRendering instanceof FieldRendering.Email) {
            FieldRendering.Email email = (FieldRendering.Email) fieldRendering;
            return FieldRendering.Email.copy$default(email, FieldState.Email.copy$default(email.getState(), null, null, null, i13, i14, i15, i11, i12, i16, 7, null), null, null, null, null, 0, 62, null);
        }
        if (fieldRendering instanceof FieldRendering.Select) {
            FieldRendering.Select select = (FieldRendering.Select) fieldRendering;
            return FieldRendering.Select.copy$default(select, FieldState.Select.copy$default(select.getState(), null, null, null, null, i13, i14, i15, i11, i12, i16, 15, null), null, null, null, null, null, 0, 126, null);
        }
        e40.a.f();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> FieldRendering<T> withFieldTextPrefilled(FieldRendering<T> fieldRendering, int i11, String str, Function2<? super DisplayedField, ? super String, Unit> function2) {
        if (fieldRendering instanceof FieldRendering.Text) {
            FieldRendering.Text text = (FieldRendering.Text) fieldRendering;
            String text2 = text.getState().getText();
            if (text2 != null && text2.length() != 0) {
                function2.invoke(new DisplayedField(i11, text.getState().getText()), str);
            }
        }
        return fieldRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> FieldRendering<T> withSelectChangedInterceptor(FieldRendering<T> fieldRendering, Function1<? super List<SelectOption>, Unit> function1) {
        if (!(fieldRendering instanceof FieldRendering.Select)) {
            return fieldRendering;
        }
        FieldRendering.Select select = (FieldRendering.Select) fieldRendering;
        return FieldRendering.Select.copy$default(select, null, null, new xq.a(20, function1, select), null, null, null, 0, AppConstants.RESULT_CODE_ORDER_CANCELLED, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withSelectChangedInterceptor$lambda$0(Function1 function1, FieldRendering fieldRendering, List list) {
        list.getClass();
        function1.invoke(list);
        ((FieldRendering.Select) fieldRendering).getOnSelected$zendesk_ui_ui_android().invoke(list);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> FieldRendering<T> withSelectCheckMarkActionInterceptor(FieldRendering<T> fieldRendering, Function0<Unit> function0) {
        return !(fieldRendering instanceof FieldRendering.Select) ? fieldRendering : FieldRendering.Select.copy$default((FieldRendering.Select) fieldRendering, null, null, null, null, null, new yk.d(2, function0), 0, 95, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withSelectCheckMarkActionInterceptor$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> FieldRendering<T> withStateChangedInterceptor(FieldRendering<T> fieldRendering, int i11, Function2<? super DisplayedField, ? super String, Unit> function2, String str, Function1<? super T, Unit> function1) {
        if (fieldRendering instanceof FieldRendering.Text) {
            FieldRendering.Text text = (FieldRendering.Text) fieldRendering;
            return FieldRendering.Text.copy$default(text, null, new x(function1, text, function2, i11, str, 8), null, null, null, 0, 61, null);
        }
        if (fieldRendering instanceof FieldRendering.Email) {
            FieldRendering.Email email = (FieldRendering.Email) fieldRendering;
            return FieldRendering.Email.copy$default(email, null, new x(function1, email, function2, i11, str, 9), null, null, null, 0, 61, null);
        }
        if (fieldRendering instanceof FieldRendering.Select) {
            FieldRendering.Select select = (FieldRendering.Select) fieldRendering;
            return FieldRendering.Select.copy$default(select, null, new x(function1, select, function2, i11, str, 10), null, null, null, null, 0, 125, null);
        }
        e40.a.f();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withStateChangedInterceptor$lambda$5(Function1 function1, FieldRendering fieldRendering, Function2 function2, int i11, String str, FieldState.Text text) {
        text.getClass();
        FieldRendering.Text text2 = (FieldRendering.Text) fieldRendering;
        function1.invoke(text2.getNormalize$zendesk_ui_ui_android().invoke(text));
        text2.getOnStateChanged().invoke(text);
        function2.invoke(new DisplayedField(i11, text.getText()), str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withStateChangedInterceptor$lambda$6(Function1 function1, FieldRendering fieldRendering, Function2 function2, int i11, String str, FieldState.Email email) {
        email.getClass();
        FieldRendering.Email email2 = (FieldRendering.Email) fieldRendering;
        function1.invoke(email2.getNormalize$zendesk_ui_ui_android().invoke(email));
        email2.getOnStateChanged().invoke(email);
        function2.invoke(new DisplayedField(i11, email.getEmail()), str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withStateChangedInterceptor$lambda$7(Function1 function1, FieldRendering fieldRendering, Function2 function2, int i11, String str, FieldState.Select select) {
        select.getClass();
        FieldRendering.Select select2 = (FieldRendering.Select) fieldRendering;
        function1.invoke(select2.getNormalize$zendesk_ui_ui_android().invoke(select));
        select2.getOnStateChanged().invoke(select);
        function2.invoke(new DisplayedField(i11, ((SelectOption) CollectionsKt.O(select.getSelect())).getId()), str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> FieldRendering<T> withStateFocusChanged(FieldRendering<T> fieldRendering, Function1<? super Boolean, Unit> function1) {
        if (fieldRendering instanceof FieldRendering.Text) {
            return FieldRendering.Text.copy$default((FieldRendering.Text) fieldRendering, null, null, null, null, new h1(function1, 8), 0, 47, null);
        }
        if (fieldRendering instanceof FieldRendering.Email) {
            return FieldRendering.Email.copy$default((FieldRendering.Email) fieldRendering, null, null, null, null, new h1(function1, 9), 0, 47, null);
        }
        if (fieldRendering instanceof FieldRendering.Select) {
            return FieldRendering.Select.copy$default((FieldRendering.Select) fieldRendering, null, null, null, null, new h1(function1, 10), null, 0, 111, null);
        }
        e40.a.f();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withStateFocusChanged$lambda$2(Function1 function1, boolean z11) {
        function1.invoke(Boolean.valueOf(z11));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withStateFocusChanged$lambda$3(Function1 function1, boolean z11) {
        function1.invoke(Boolean.valueOf(z11));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withStateFocusChanged$lambda$4(Function1 function1, boolean z11) {
        function1.invoke(Boolean.valueOf(z11));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> FieldRendering<T> withStateInputCached(FieldRendering<T> fieldRendering, DisplayedField displayedField, Function1<? super T, Unit> function1) {
        if (displayedField == null || displayedField.getValue() == null) {
            return fieldRendering;
        }
        if (fieldRendering instanceof FieldRendering.Text) {
            FieldRendering.Text text = (FieldRendering.Text) fieldRendering;
            FieldRendering.Text textCopy$default = FieldRendering.Text.copy$default(text, FieldState.Text.copy$default(text.getState(), displayedField.getValue(), 0, 0, null, null, 0, 0, 0, 0, 0, 0, 2046, null), null, null, null, null, 0, 62, null);
            function1.invoke(text.getNormalize$zendesk_ui_ui_android().invoke(textCopy$default.getState()));
            return textCopy$default;
        }
        if (fieldRendering instanceof FieldRendering.Email) {
            FieldRendering.Email email = (FieldRendering.Email) fieldRendering;
            FieldRendering.Email emailCopy$default = FieldRendering.Email.copy$default(email, FieldState.Email.copy$default(email.getState(), displayedField.getValue(), null, null, 0, 0, 0, 0, 0, 0, 510, null), null, null, null, null, 0, 62, null);
            function1.invoke(email.getNormalize$zendesk_ui_ui_android().invoke(emailCopy$default.getState()));
            return emailCopy$default;
        }
        if (!(fieldRendering instanceof FieldRendering.Select)) {
            e40.a.f();
            return null;
        }
        FieldRendering.Select select = (FieldRendering.Select) fieldRendering;
        FieldState.Select state = select.getState();
        List<SelectOption> options = select.getState().getOptions();
        ArrayList arrayList = new ArrayList();
        for (T t9 : options) {
            if (Intrinsics.areEqual(((SelectOption) t9).getId(), displayedField.getValue())) {
                arrayList.add(t9);
            }
        }
        FieldRendering.Select selectCopy$default = FieldRendering.Select.copy$default(select, FieldState.Select.copy$default(state, null, arrayList, null, null, 0, 0, 0, 0, 0, 0, 1021, null), null, null, null, null, null, 0, 126, null);
        function1.invoke(select.getNormalize$zendesk_ui_ui_android().invoke(selectCopy$default.getState()));
        return selectCopy$default;
    }
}
