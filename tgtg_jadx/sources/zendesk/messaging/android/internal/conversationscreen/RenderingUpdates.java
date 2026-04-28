package zendesk.messaging.android.internal.conversationscreen;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.FieldOption;
import zendesk.ui.android.conversation.form.DisplayedField;
import zendesk.ui.android.conversation.form.DisplayedForm;
import zendesk.ui.android.conversation.form.FieldRendering;
import zendesk.ui.android.conversation.form.FieldState;
import zendesk.ui.android.conversation.form.FormRendering;
import zendesk.ui.android.conversation.form.FormResponseRendering;
import zendesk.ui.android.conversation.form.FormResponseState;
import zendesk.ui.android.conversation.form.FormState;
import zendesk.ui.android.conversation.form.SelectOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0098\u0002\u0010\u0004\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n\u0012\u0004\u0012\u00020\f0\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0013j\u0002`\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00152\b\b\u0001\u0010\u001b\u001a\u00020\u00102\b\b\u0001\u0010\u001c\u001a\u00020\u00102\b\b\u0001\u0010\u001d\u001a\u00020\u00102\b\b\u0001\u0010\u001e\u001a\u00020\u00102\b\b\u0001\u0010\u001f\u001a\u00020\u00102\b\b\u0001\u0010 \u001a\u00020\u00102\b\b\u0001\u0010!\u001a\u00020\u00102\b\b\u0001\u0010\"\u001a\u00020\u00102\b\b\u0001\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u000eJH\u0010%\u001a\u0018\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0\u0005j\b\u0012\u0004\u0012\u00020&`\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\b\b\u0001\u0010'\u001a\u00020\u00102\b\b\u0001\u0010\"\u001a\u00020\u00102\b\b\u0001\u0010(\u001a\u00020\u0010¨\u0006)"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/RenderingUpdates;", "", "<init>", "()V", "formRenderingUpdate", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/form/FormRendering;", "Lzendesk/conversationkit/android/model/Field;", "Lzendesk/messaging/android/internal/conversationscreen/RenderingUpdate;", "fields", "", "onFormCompleted", "", "onFormFocusChanged", "", "colorAccent", "", StatusResponseUtils.RESULT_PENDING, "onFormDisplayedFieldsChanged", "Lkotlin/Function2;", "Lzendesk/ui/android/conversation/form/DisplayedField;", "", "Lzendesk/messaging/android/internal/conversationscreen/messagelog/OnFormDisplayedFieldsChanged;", "mapOfDisplayedForm", "", "Lzendesk/ui/android/conversation/form/DisplayedForm;", "formId", "onActionColor", "onErrorColor", "focusedFieldBorderColor", "fieldBorderColor", "fieldBackgroundColor", "inputTextColor", "labelTextColor", "backgroundColor", "selectOptionTextColor", "hasFailed", "formResponseRenderingUpdate", "Lzendesk/ui/android/conversation/form/FormResponseRendering;", "borderColor", "textColor", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRenderingUpdates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUpdates.kt\nzendesk/messaging/android/internal/conversationscreen/RenderingUpdates\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n774#2:205\n865#2:206\n1563#2:207\n1634#2,3:208\n866#2:211\n1563#2:212\n1634#2,2:213\n1563#2:215\n1634#2,3:216\n1563#2:219\n1634#2,3:220\n1636#2:223\n1563#2:224\n1634#2,3:225\n*S KotlinDebug\n*F\n+ 1 RenderingUpdates.kt\nzendesk/messaging/android/internal/conversationscreen/RenderingUpdates\n*L\n134#1:205\n134#1:206\n135#1:207\n135#1:208,3\n134#1:211\n76#1:212\n76#1:213,2\n117#1:215\n117#1:216,3\n124#1:219\n124#1:220,3\n76#1:223\n168#1:224\n168#1:225,3\n*E\n"})
public final class RenderingUpdates {

    @NotNull
    public static final RenderingUpdates INSTANCE = new RenderingUpdates();

    private RenderingUpdates() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final FormRendering formRenderingUpdate$lambda$8(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, boolean z12, List list, Function1 function1, Function1 function12, Function2 function2, Map map, String str, int i21, FormRendering formRendering) {
        Object select;
        formRendering.getClass();
        FormState formState = new FormState(i11, i12, i13, i14, i15, i16, i17, i18, i19, z11, z12);
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if (field instanceof Field.Text) {
                Field.Text text = (Field.Text) field;
                select = new FieldRendering.Text(new FieldState.Text(text.getText(), text.getMinSize(), text.getMaxSize(), text.getPlaceholder(), text.getLabel(), 0, 0, 0, 0, 0, 0, 2016, null), null, null, new i(text, 2), null, Intrinsics.areEqual(text.getName(), Field.SYSTEM_FIELD_NAME) ? 532481 : 16385, 22, null);
            } else if (field instanceof Field.Email) {
                Field.Email email = (Field.Email) field;
                String label = email.getLabel();
                int i22 = 0;
                select = new FieldRendering.Email(new FieldState.Email(email.getEmail(), email.getPlaceholder(), label, i22, 0, 0, 0, 0, 0, 504, null), null, null, new i(email, 3), 0 == true ? 1 : 0, i22, 54, null);
            } else {
                if (!(field instanceof Field.Select)) {
                    e40.a.f();
                    return null;
                }
                Field.Select select2 = (Field.Select) field;
                String label2 = select2.getLabel();
                String placeholder = select2.getPlaceholder();
                List<FieldOption> options = select2.getOptions();
                ArrayList arrayList2 = new ArrayList(e0.o(options, 10));
                for (FieldOption fieldOption : options) {
                    arrayList2.add(new SelectOption(fieldOption.getName(), fieldOption.getLabel(), i21));
                }
                List<FieldOption> select3 = select2.getSelect();
                ArrayList arrayList3 = new ArrayList(e0.o(select3, 10));
                for (FieldOption fieldOption2 : select3) {
                    arrayList3.add(new SelectOption(fieldOption2.getName(), fieldOption2.getLabel(), i21));
                }
                select = new FieldRendering.Select(new FieldState.Select(arrayList2, arrayList3, placeholder, label2, 0, 0, 0, 0, 0, 0, 1008, null), null, null, new i(select2, 4), null, null, 0, 118, null);
            }
            arrayList.add(select);
        }
        return new FormRendering(formState, arrayList, function1, null, function12, function2, map, str, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field formRenderingUpdate$lambda$8$lambda$7$lambda$0(Field field, FieldState.Text text) {
        text.getClass();
        Field.Text text2 = (Field.Text) field;
        String text3 = text.getText();
        if (text3 == null) {
            text3 = "";
        }
        return Field.Text.copy$default(text2, null, null, null, null, 0, 0, text3, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field formRenderingUpdate$lambda$8$lambda$7$lambda$1(Field field, FieldState.Email email) {
        email.getClass();
        Field.Email email2 = (Field.Email) field;
        String email3 = email.getEmail();
        if (email3 == null) {
            email3 = "";
        }
        return Field.Email.copy$default(email2, null, null, null, null, email3, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field formRenderingUpdate$lambda$8$lambda$7$lambda$6(Field field, FieldState.Select select) {
        select.getClass();
        Field.Select select2 = (Field.Select) field;
        List<FieldOption> options = select2.getOptions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : options) {
            FieldOption fieldOption = (FieldOption) obj;
            List<SelectOption> select3 = select.getSelect();
            ArrayList arrayList2 = new ArrayList(e0.o(select3, 10));
            Iterator<T> it = select3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SelectOption) it.next()).getId());
            }
            if (arrayList2.contains(fieldOption.getName())) {
                arrayList.add(obj);
            }
        }
        return Field.Select.copy$default(select2, null, null, null, null, null, 0, arrayList, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormResponseRendering formResponseRenderingUpdate$lambda$11(List list, int i11, int i12, int i13, FormResponseRendering formResponseRendering) {
        formResponseRendering.getClass();
        return new FormResponseRendering.Builder().state(new v(list, i11, i12, i13, 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormResponseState formResponseRenderingUpdate$lambda$11$lambda$10(List list, int i11, int i12, int i13, FormResponseState formResponseState) {
        formResponseState.getClass();
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(RenderingUpdatesKt.toFieldResponseState((Field) it.next()));
        }
        return formResponseState.copy(i11, i12, i13, arrayList);
    }

    @NotNull
    public final Function1<FormRendering<Field>, FormRendering<Field>> formRenderingUpdate(@NotNull final List<? extends Field> fields, @NotNull final Function1<? super List<? extends Field>, Unit> onFormCompleted, @NotNull final Function1<? super Boolean, Unit> onFormFocusChanged, final int colorAccent, final boolean pending, @NotNull final Function2<? super DisplayedField, ? super String, Unit> onFormDisplayedFieldsChanged, @NotNull final Map<String, DisplayedForm> mapOfDisplayedForm, @NotNull final String formId, final int onActionColor, final int onErrorColor, final int focusedFieldBorderColor, final int fieldBorderColor, final int fieldBackgroundColor, final int inputTextColor, final int labelTextColor, final int backgroundColor, final int selectOptionTextColor, final boolean hasFailed) {
        fields.getClass();
        onFormCompleted.getClass();
        onFormFocusChanged.getClass();
        onFormDisplayedFieldsChanged.getClass();
        mapOfDisplayedForm.getClass();
        formId.getClass();
        return new Function1() { // from class: zendesk.messaging.android.internal.conversationscreen.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RenderingUpdates.formRenderingUpdate$lambda$8(colorAccent, onErrorColor, focusedFieldBorderColor, fieldBorderColor, fieldBackgroundColor, onActionColor, inputTextColor, labelTextColor, backgroundColor, pending, hasFailed, fields, onFormCompleted, onFormFocusChanged, onFormDisplayedFieldsChanged, mapOfDisplayedForm, formId, selectOptionTextColor, (FormRendering) obj);
            }
        };
    }

    @NotNull
    public final Function1<FormResponseRendering, FormResponseRendering> formResponseRenderingUpdate(@NotNull List<? extends Field> fields, int borderColor, int backgroundColor, int textColor) {
        fields.getClass();
        return new v(fields, textColor, backgroundColor, borderColor, 0);
    }
}
