package zendesk.conversationkit.android.model;

import e40.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.internal.rest.model.MessageFieldDto;
import zendesk.conversationkit.android.internal.rest.model.MessageFieldOptionDto;
import zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto;
import zendesk.conversationkit.android.internal.rest.model.SendFieldSelectDto;
import zendesk.conversationkit.android.model.Field;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"toField", "Lzendesk/conversationkit/android/model/Field;", "Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto;", "toSendFieldResponseDto", "Lzendesk/conversationkit/android/internal/rest/model/SendFieldResponseDto;", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Field.kt\nzendesk/conversationkit/android/model/FieldKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1563#2:227\n1634#2,3:228\n1563#2:231\n1634#2,3:232\n1563#2:235\n1634#2,3:236\n*S KotlinDebug\n*F\n+ 1 Field.kt\nzendesk/conversationkit/android/model/FieldKt\n*L\n193#1:227\n193#1:228,3\n195#1:231\n195#1:232,3\n223#1:235\n223#1:236,3\n*E\n"})
public final class FieldKt {

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
                iArr[FieldType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldType.SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final Field toField(@NotNull MessageFieldDto messageFieldDto) {
        messageFieldDto.getClass();
        FieldType fieldTypeFindByValue = FieldType.INSTANCE.findByValue(messageFieldDto.getType());
        int i11 = fieldTypeFindByValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldTypeFindByValue.ordinal()];
        if (i11 == 1) {
            String id2 = messageFieldDto.getId();
            String name = messageFieldDto.getName();
            String label = messageFieldDto.getLabel();
            String placeholder = messageFieldDto.getPlaceholder();
            if (placeholder == null) {
                placeholder = "";
            }
            Integer minSize = messageFieldDto.getMinSize();
            int iIntValue = minSize != null ? minSize.intValue() : 1;
            Integer maxSize = messageFieldDto.getMaxSize();
            int iIntValue2 = maxSize != null ? maxSize.intValue() : 128;
            String text = messageFieldDto.getText();
            return new Field.Text(id2, name, label, placeholder, iIntValue, iIntValue2, text == null ? "" : text);
        }
        if (i11 == 2) {
            String id3 = messageFieldDto.getId();
            String name2 = messageFieldDto.getName();
            String label2 = messageFieldDto.getLabel();
            String placeholder2 = messageFieldDto.getPlaceholder();
            if (placeholder2 == null) {
                placeholder2 = "";
            }
            String email = messageFieldDto.getEmail();
            return new Field.Email(id3, name2, label2, placeholder2, email == null ? "" : email);
        }
        if (i11 != 3) {
            return null;
        }
        String id4 = messageFieldDto.getId();
        String name3 = messageFieldDto.getName();
        String label3 = messageFieldDto.getLabel();
        String placeholder3 = messageFieldDto.getPlaceholder();
        String str = placeholder3 != null ? placeholder3 : "";
        List<MessageFieldOptionDto> options = messageFieldDto.getOptions();
        if (options == null) {
            options = n0.f26529a;
        }
        ArrayList arrayList = new ArrayList(e0.o(options, 10));
        for (MessageFieldOptionDto messageFieldOptionDto : options) {
            arrayList.add(new FieldOption(messageFieldOptionDto.getName(), messageFieldOptionDto.getLabel()));
        }
        Integer selectSize = messageFieldDto.getSelectSize();
        int iIntValue3 = selectSize != null ? selectSize.intValue() : 1;
        List<MessageFieldOptionDto> select = messageFieldDto.getSelect();
        if (select == null) {
            select = n0.f26529a;
        }
        ArrayList arrayList2 = new ArrayList(e0.o(select, 10));
        for (MessageFieldOptionDto messageFieldOptionDto2 : select) {
            arrayList2.add(new FieldOption(messageFieldOptionDto2.getName(), messageFieldOptionDto2.getLabel()));
        }
        return new Field.Select(id4, name3, label3, str, arrayList, iIntValue3, arrayList2);
    }

    @NotNull
    public static final SendFieldResponseDto toSendFieldResponseDto(@NotNull Field field) {
        field.getClass();
        if (field instanceof Field.Text) {
            Field.Text text = (Field.Text) field;
            return new SendFieldResponseDto.Text(text.getId(), text.getName(), text.getLabel(), text.getText());
        }
        if (field instanceof Field.Email) {
            Field.Email email = (Field.Email) field;
            return new SendFieldResponseDto.Email(email.getId(), email.getName(), email.getLabel(), email.getEmail());
        }
        if (!(field instanceof Field.Select)) {
            a.f();
            return null;
        }
        Field.Select select = (Field.Select) field;
        String id2 = select.getId();
        String name = select.getName();
        String label = select.getLabel();
        List<FieldOption> select2 = select.getSelect();
        ArrayList arrayList = new ArrayList(e0.o(select2, 10));
        for (FieldOption fieldOption : select2) {
            arrayList.add(new SendFieldSelectDto(fieldOption.getName(), fieldOption.getLabel()));
        }
        return new SendFieldResponseDto.Select(id2, name, label, arrayList);
    }
}
