package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.FieldOption;
import zendesk.ui.android.conversation.form.FieldResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003H\u0002**\b\u0000\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u00062\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0006*\f\b\u0002\u0010\u0007\"\u00020\u00012\u00020\u0001¨\u0006\b"}, d2 = {"toFieldResponseState", "Lzendesk/ui/android/conversation/form/FieldResponse;", "Lzendesk/messaging/android/internal/conversationscreen/FieldResponseState;", "Lzendesk/conversationkit/android/model/Field;", "RenderingUpdate", "T", "Lkotlin/Function1;", "FieldResponseState", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RenderingUpdatesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldResponse toFieldResponseState(Field field) {
        String label;
        String label2 = field.getLabel();
        if (field instanceof Field.Text) {
            label = ((Field.Text) field).getText();
        } else if (field instanceof Field.Email) {
            label = ((Field.Email) field).getEmail();
        } else {
            if (!(field instanceof Field.Select)) {
                e40.a.f();
                return null;
            }
            FieldOption fieldOption = (FieldOption) CollectionsKt.firstOrNull(((Field.Select) field).getSelect());
            label = fieldOption != null ? fieldOption.getLabel() : null;
            if (label == null) {
                label = "";
            }
        }
        return new FieldResponse(label2, label);
    }
}
