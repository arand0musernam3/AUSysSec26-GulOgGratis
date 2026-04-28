package zendesk.messaging.android.internal.validation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.faye.internal.Bayeux;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.messaging.android.internal.validation.model.FieldData;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0002¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/validation/ValidationRules;", "", "<init>", "()V", "forText", "", Bayeux.KEY_DATA, "Lzendesk/messaging/android/internal/validation/model/FieldData;", "forText$zendesk_messaging_messaging_android", "forRegex", "forRegex$zendesk_messaging_messaging_android", "forCheckBox", "forCheckBox$zendesk_messaging_messaging_android", "forTagger", "forTagger$zendesk_messaging_messaging_android", "forMultiSelect", "forMultiSelect$zendesk_messaging_messaging_android", "convertValueToList", "", "value", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationFieldValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationFieldValidator.kt\nzendesk/messaging/android/internal/validation/ValidationRules\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n1563#2:215\n1634#2,3:216\n*S KotlinDebug\n*F\n+ 1 ConversationFieldValidator.kt\nzendesk/messaging/android/internal/validation/ValidationRules\n*L\n181#1:215\n181#1:216,3\n*E\n"})
public final class ValidationRules {

    @NotNull
    private static final String COMMON_MESSAGE_ERROR = "The value provided for the Conversation Field: %s is not correct. ";

    @NotNull
    public static final String FIELD_ID_NOT_FOUND_ERROR = "Conversation Field: %s can not be validated. Please ensure that the provided ID is correct and the field is customer editable";

    @NotNull
    public static final String NOT_EMPTY_VALUE = "Conversation Field: %s value can not be empty";

    @NotNull
    public static final String PROVIDED_VALUE_NOT_CORRECT_ERROR = "The value provided for the Conversation Field: %s is not correct. Expected value of type %s for a field of type %s.";

    @NotNull
    public static final String REGEX_VALUE_NOT_CORRECT = "The value provided for the Conversation Field: %s is not correct. Expected value did not pass the regular expression validation for a field of type %s";

    @NotNull
    public static final String TAGGER_VALUE_NOT_CORRECT = "The value provided for the Conversation Field: %s is not correct. Available options are: %s for a field of type %s";

    @NotNull
    public static final String UNABLE_VALIDATE_ERROR = "We were not able to validate your conversation fields at the moment. Ensure you have stable internet connection and try again.";

    private final List<String> convertValueToList(String value) {
        List listSplit$default = StringsKt__StringsKt.split$default(value, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(e0.o(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.e0((String) it.next()).toString());
        }
        return CollectionsKt.r0(arrayList);
    }

    @Nullable
    public final String forCheckBox$zendesk_messaging_messaging_android(@NotNull FieldData data) {
        data.getClass();
        if (data.getValue() instanceof Boolean) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(PROVIDED_VALUE_NOT_CORRECT_ERROR, Arrays.copyOf(new Object[]{data.getId(), Reflection.getOrCreateKotlinClass(Boolean.TYPE).getSimpleName(), data.getType()}, 3));
    }

    @Nullable
    public final String forMultiSelect$zendesk_messaging_messaging_android(@NotNull FieldData data) {
        data.getClass();
        if (!(data.getValue() instanceof String)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(PROVIDED_VALUE_NOT_CORRECT_ERROR, Arrays.copyOf(new Object[]{data.getId(), Reflection.getOrCreateKotlinClass(String.class).getSimpleName(), data.getType()}, 3));
        }
        List<String> options = data.getOptions();
        if (options != null && options.containsAll(convertValueToList((String) data.getValue()))) {
            return null;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String id2 = data.getId();
        List<String> options2 = data.getOptions();
        return String.format(TAGGER_VALUE_NOT_CORRECT, Arrays.copyOf(new Object[]{id2, options2 != null ? CollectionsKt.U(options2, ", ", null, null, null, 62) : null, data.getType()}, 3));
    }

    @Nullable
    public final String forRegex$zendesk_messaging_messaging_android(@NotNull FieldData data) {
        data.getClass();
        String regex = data.getRegex();
        if (regex == null || new Regex(regex).e(data.getValue().toString())) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(REGEX_VALUE_NOT_CORRECT, Arrays.copyOf(new Object[]{data.getId(), data.getType()}, 2));
    }

    @Nullable
    public final String forTagger$zendesk_messaging_messaging_android(@NotNull FieldData data) {
        data.getClass();
        if (!(data.getValue() instanceof String)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(PROVIDED_VALUE_NOT_CORRECT_ERROR, Arrays.copyOf(new Object[]{data.getId(), Reflection.getOrCreateKotlinClass(String.class).getSimpleName(), data.getType()}, 3));
        }
        List<String> options = data.getOptions();
        if (options != null && options.contains(data.getValue())) {
            return null;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String id2 = data.getId();
        List<String> options2 = data.getOptions();
        return String.format(TAGGER_VALUE_NOT_CORRECT, Arrays.copyOf(new Object[]{id2, options2 != null ? CollectionsKt.U(options2, ", ", null, null, null, 62) : null, data.getType()}, 3));
    }

    @Nullable
    public final String forText$zendesk_messaging_messaging_android(@NotNull FieldData data) {
        data.getClass();
        if (!(data.getValue() instanceof String)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format(PROVIDED_VALUE_NOT_CORRECT_ERROR, Arrays.copyOf(new Object[]{data.getId(), Reflection.getOrCreateKotlinClass(String.class).getSimpleName(), data.getType()}, 3));
        }
        if (((CharSequence) data.getValue()).length() != 0) {
            return null;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return String.format(NOT_EMPTY_VALUE, Arrays.copyOf(new Object[]{data.getId()}, 1));
    }
}
