package zendesk.messaging.android.internal.rest.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.validation.model.ConversationField;
import zendesk.messaging.android.internal.validation.model.FieldType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toConversationField", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "Lzendesk/messaging/android/internal/rest/model/ConversationFieldDto;", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ConversationFieldDtoKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldType.values().length];
            try {
                iArr[FieldType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldType.CHECKBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldType.MULTI_LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldType.DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FieldType.REGEXP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FieldType.NUMBER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FieldType.DECIMAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FieldType.DROP_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FieldType.MULTI_SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final ConversationField toConversationField(@NotNull ConversationFieldDto conversationFieldDto) {
        conversationFieldDto.getClass();
        FieldType fieldTypeFindByValue = FieldType.INSTANCE.findByValue(conversationFieldDto.getType());
        switch (fieldTypeFindByValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldTypeFindByValue.ordinal()]) {
            case 1:
                return new ConversationField.Text(String.valueOf(conversationFieldDto.getId()));
            case 2:
                return new ConversationField.CheckBox(String.valueOf(conversationFieldDto.getId()));
            case 3:
                return new ConversationField.TextArea(String.valueOf(conversationFieldDto.getId()));
            case 4:
                return new ConversationField.Date(String.valueOf(conversationFieldDto.getId()), conversationFieldDto.getRegexp());
            case 5:
                return new ConversationField.Regex(String.valueOf(conversationFieldDto.getId()), conversationFieldDto.getRegexp());
            case 6:
                return new ConversationField.Number(String.valueOf(conversationFieldDto.getId()), conversationFieldDto.getRegexp());
            case 7:
                return new ConversationField.Decimal(String.valueOf(conversationFieldDto.getId()), conversationFieldDto.getRegexp());
            case 8:
                return new ConversationField.Tagger(String.valueOf(conversationFieldDto.getId()), conversationFieldDto.getOptions());
            case 9:
                return new ConversationField.MultiSelect(String.valueOf(conversationFieldDto.getId()), conversationFieldDto.getOptions());
            default:
                Logger.w(Reflection.getOrCreateKotlinClass(FieldType.class).getSimpleName(), k.l(conversationFieldDto.getType(), " is currently not supported"), new Object[0]);
                return null;
        }
    }
}
