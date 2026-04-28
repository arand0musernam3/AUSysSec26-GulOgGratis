package zendesk.messaging.android.internal.validation;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.android.internal.validation.ValidationError;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¨\u0006\u0007"}, d2 = {"getOnlyValidFields", "", "", "", "", "Lzendesk/messaging/android/internal/validation/ValidationError;", "fieldsToValidate", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationFieldValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationFieldValidator.kt\nzendesk/messaging/android/internal/validation/ConversationFieldValidatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n1869#2,2:215\n*S KotlinDebug\n*F\n+ 1 ConversationFieldValidator.kt\nzendesk/messaging/android/internal/validation/ConversationFieldValidatorKt\n*L\n207#1:215,2\n*E\n"})
public final class ConversationFieldValidatorKt {
    @NotNull
    public static final Map<String, Object> getOnlyValidFields(@NotNull List<? extends ValidationError> list, @NotNull Map<String, ? extends Object> map) {
        list.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (ValidationError validationError : list) {
            if (validationError instanceof ValidationError.FieldValidationFailed) {
                linkedHashMap.remove(((ValidationError.FieldValidationFailed) validationError).getId());
            }
        }
        return linkedHashMap;
    }
}
