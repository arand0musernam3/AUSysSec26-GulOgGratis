package zendesk.messaging.android.internal.validation.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import zendesk.messaging.android.internal.validation.ValidationRules;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\t\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField;", "", "type", "Lzendesk/messaging/android/internal/validation/model/FieldType;", "<init>", "(Lzendesk/messaging/android/internal/validation/model/FieldType;)V", "getType", "()Lzendesk/messaging/android/internal/validation/model/FieldType;", "id", "", "getId", "()Ljava/lang/String;", "validate", "value", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "Text", "Decimal", "Number", "Tagger", "Date", "Regex", "CheckBox", "TextArea", "MultiSelect", "Lzendesk/messaging/android/internal/validation/model/ConversationField$CheckBox;", "Lzendesk/messaging/android/internal/validation/model/ConversationField$Date;", "Lzendesk/messaging/android/internal/validation/model/ConversationField$Decimal;", "Lzendesk/messaging/android/internal/validation/model/ConversationField$MultiSelect;", "Lzendesk/messaging/android/internal/validation/model/ConversationField$Number;", "Lzendesk/messaging/android/internal/validation/model/ConversationField$Regex;", "Lzendesk/messaging/android/internal/validation/model/ConversationField$Tagger;", "Lzendesk/messaging/android/internal/validation/model/ConversationField$Text;", "Lzendesk/messaging/android/internal/validation/model/ConversationField$TextArea;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConversationField {

    @NotNull
    private final FieldType type;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField$CheckBox;", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "validate", "value", "", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckBox extends ConversationField {

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckBox(@NotNull String str) {
            super(FieldType.CHECKBOX, null);
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ CheckBox copy$default(CheckBox checkBox, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = checkBox.id;
            }
            return checkBox.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final CheckBox copy(@NotNull String id2) {
            id2.getClass();
            return new CheckBox(id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckBox) && Intrinsics.areEqual(this.id, ((CheckBox) other).id);
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("CheckBox(id=", this.id, ")");
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @Nullable
        public String validate(@NotNull Object value, @NotNull ValidationRules rules) {
            value.getClass();
            rules.getClass();
            return rules.forCheckBox$zendesk_messaging_messaging_android(new FieldData(getId(), value, null, null, getType().name(), 12, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField$Date;", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "id", "", "regex", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRegex", "validate", "value", "", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Date extends ConversationField {

        @NotNull
        private final String id;

        @Nullable
        private final String regex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Date(@NotNull String str, @Nullable String str2) {
            super(FieldType.DATE, null);
            str.getClass();
            this.id = str;
            this.regex = str2;
        }

        public static /* synthetic */ Date copy$default(Date date, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = date.id;
            }
            if ((i11 & 2) != 0) {
                str2 = date.regex;
            }
            return date.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        @NotNull
        public final Date copy(@NotNull String id2, @Nullable String regex) {
            id2.getClass();
            return new Date(id2, regex);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Date)) {
                return false;
            }
            Date date = (Date) other;
            return Intrinsics.areEqual(this.id, date.id) && Intrinsics.areEqual(this.regex, date.regex);
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getRegex() {
            return this.regex;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.regex;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return a.d("Date(id=", this.id, ", regex=", this.regex, ")");
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @Nullable
        public String validate(@NotNull Object value, @NotNull ValidationRules rules) {
            value.getClass();
            rules.getClass();
            return rules.forRegex$zendesk_messaging_messaging_android(new FieldData(getId(), value, this.regex, null, getType().name(), 8, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField$Decimal;", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "id", "", "regex", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRegex", "validate", "value", "", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Decimal extends ConversationField {

        @NotNull
        private final String id;

        @Nullable
        private final String regex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Decimal(@NotNull String str, @Nullable String str2) {
            super(FieldType.DECIMAL, null);
            str.getClass();
            this.id = str;
            this.regex = str2;
        }

        public static /* synthetic */ Decimal copy$default(Decimal decimal, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = decimal.id;
            }
            if ((i11 & 2) != 0) {
                str2 = decimal.regex;
            }
            return decimal.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        @NotNull
        public final Decimal copy(@NotNull String id2, @Nullable String regex) {
            id2.getClass();
            return new Decimal(id2, regex);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Decimal)) {
                return false;
            }
            Decimal decimal = (Decimal) other;
            return Intrinsics.areEqual(this.id, decimal.id) && Intrinsics.areEqual(this.regex, decimal.regex);
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getRegex() {
            return this.regex;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.regex;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return a.d("Decimal(id=", this.id, ", regex=", this.regex, ")");
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @Nullable
        public String validate(@NotNull Object value, @NotNull ValidationRules rules) {
            value.getClass();
            rules.getClass();
            return rules.forRegex$zendesk_messaging_messaging_android(new FieldData(getId(), value, this.regex, null, getType().name(), 8, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField$MultiSelect;", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "id", "", "options", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "validate", "value", "", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MultiSelect extends ConversationField {

        @NotNull
        private final String id;

        @Nullable
        private final List<String> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiSelect(@NotNull String str, @Nullable List<String> list) {
            super(FieldType.MULTI_SELECT, null);
            str.getClass();
            this.id = str;
            this.options = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiSelect copy$default(MultiSelect multiSelect, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = multiSelect.id;
            }
            if ((i11 & 2) != 0) {
                list = multiSelect.options;
            }
            return multiSelect.copy(str, list);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final List<String> component2() {
            return this.options;
        }

        @NotNull
        public final MultiSelect copy(@NotNull String id2, @Nullable List<String> options) {
            id2.getClass();
            return new MultiSelect(id2, options);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiSelect)) {
                return false;
            }
            MultiSelect multiSelect = (MultiSelect) other;
            return Intrinsics.areEqual(this.id, multiSelect.id) && Intrinsics.areEqual(this.options, multiSelect.options);
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final List<String> getOptions() {
            return this.options;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            List<String> list = this.options;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "MultiSelect(id=" + this.id + ", options=" + this.options + ")";
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @Nullable
        public String validate(@NotNull Object value, @NotNull ValidationRules rules) {
            value.getClass();
            rules.getClass();
            return rules.forMultiSelect$zendesk_messaging_messaging_android(new FieldData(getId(), value, null, this.options, getType().name(), 4, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField$Number;", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "id", "", "regex", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRegex", "validate", "value", "", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Number extends ConversationField {

        @NotNull
        private final String id;

        @Nullable
        private final String regex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Number(@NotNull String str, @Nullable String str2) {
            super(FieldType.NUMBER, null);
            str.getClass();
            this.id = str;
            this.regex = str2;
        }

        public static /* synthetic */ Number copy$default(Number number, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = number.id;
            }
            if ((i11 & 2) != 0) {
                str2 = number.regex;
            }
            return number.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        @NotNull
        public final Number copy(@NotNull String id2, @Nullable String regex) {
            id2.getClass();
            return new Number(id2, regex);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Number)) {
                return false;
            }
            Number number = (Number) other;
            return Intrinsics.areEqual(this.id, number.id) && Intrinsics.areEqual(this.regex, number.regex);
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getRegex() {
            return this.regex;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.regex;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return a.d("Number(id=", this.id, ", regex=", this.regex, ")");
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @Nullable
        public String validate(@NotNull Object value, @NotNull ValidationRules rules) {
            value.getClass();
            rules.getClass();
            return rules.forRegex$zendesk_messaging_messaging_android(new FieldData(getId(), value, this.regex, null, getType().name(), 8, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField$Regex;", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "id", "", "regex", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRegex", "validate", "value", "", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Regex extends ConversationField {

        @NotNull
        private final String id;

        @Nullable
        private final String regex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Regex(@NotNull String str, @Nullable String str2) {
            super(FieldType.REGEXP, null);
            str.getClass();
            this.id = str;
            this.regex = str2;
        }

        public static /* synthetic */ Regex copy$default(Regex regex, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = regex.id;
            }
            if ((i11 & 2) != 0) {
                str2 = regex.regex;
            }
            return regex.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        @NotNull
        public final Regex copy(@NotNull String id2, @Nullable String regex) {
            id2.getClass();
            return new Regex(id2, regex);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Regex)) {
                return false;
            }
            Regex regex = (Regex) other;
            return Intrinsics.areEqual(this.id, regex.id) && Intrinsics.areEqual(this.regex, regex.regex);
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getRegex() {
            return this.regex;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.regex;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return a.d("Regex(id=", this.id, ", regex=", this.regex, ")");
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @Nullable
        public String validate(@NotNull Object value, @NotNull ValidationRules rules) {
            value.getClass();
            rules.getClass();
            return rules.forRegex$zendesk_messaging_messaging_android(new FieldData(getId(), value, this.regex, null, getType().name(), 8, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField$Tagger;", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "id", "", "options", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "validate", "value", "", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tagger extends ConversationField {

        @NotNull
        private final String id;

        @Nullable
        private final List<String> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tagger(@NotNull String str, @Nullable List<String> list) {
            super(FieldType.DROP_DOWN, null);
            str.getClass();
            this.id = str;
            this.options = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tagger copy$default(Tagger tagger, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tagger.id;
            }
            if ((i11 & 2) != 0) {
                list = tagger.options;
            }
            return tagger.copy(str, list);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final List<String> component2() {
            return this.options;
        }

        @NotNull
        public final Tagger copy(@NotNull String id2, @Nullable List<String> options) {
            id2.getClass();
            return new Tagger(id2, options);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tagger)) {
                return false;
            }
            Tagger tagger = (Tagger) other;
            return Intrinsics.areEqual(this.id, tagger.id) && Intrinsics.areEqual(this.options, tagger.options);
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final List<String> getOptions() {
            return this.options;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            List<String> list = this.options;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "Tagger(id=" + this.id + ", options=" + this.options + ")";
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @Nullable
        public String validate(@NotNull Object value, @NotNull ValidationRules rules) {
            value.getClass();
            rules.getClass();
            return rules.forTagger$zendesk_messaging_messaging_android(new FieldData(getId(), value, null, this.options, getType().name(), 4, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField$Text;", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "validate", "value", "", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text extends ConversationField {

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(@NotNull String str) {
            super(FieldType.TEXT, null);
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = text.id;
            }
            return text.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Text copy(@NotNull String id2) {
            id2.getClass();
            return new Text(id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && Intrinsics.areEqual(this.id, ((Text) other).id);
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Text(id=", this.id, ")");
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @Nullable
        public String validate(@NotNull Object value, @NotNull ValidationRules rules) {
            value.getClass();
            rules.getClass();
            return rules.forText$zendesk_messaging_messaging_android(new FieldData(getId(), value, null, null, getType().name(), 12, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/ConversationField$TextArea;", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "validate", "value", "", "rules", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TextArea extends ConversationField {

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextArea(@NotNull String str) {
            super(FieldType.MULTI_LINE, null);
            str.getClass();
            this.id = str;
        }

        public static /* synthetic */ TextArea copy$default(TextArea textArea, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textArea.id;
            }
            return textArea.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final TextArea copy(@NotNull String id2) {
            id2.getClass();
            return new TextArea(id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextArea) && Intrinsics.areEqual(this.id, ((TextArea) other).id);
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("TextArea(id=", this.id, ")");
        }

        @Override // zendesk.messaging.android.internal.validation.model.ConversationField
        @Nullable
        public String validate(@NotNull Object value, @NotNull ValidationRules rules) {
            value.getClass();
            rules.getClass();
            return rules.forText$zendesk_messaging_messaging_android(new FieldData(getId(), value, null, null, getType().name(), 12, null));
        }
    }

    private ConversationField(FieldType fieldType) {
        this.type = fieldType;
    }

    @NotNull
    public abstract String getId();

    @NotNull
    public final FieldType getType() {
        return this.type;
    }

    @Nullable
    public abstract String validate(@NotNull Object value, @NotNull ValidationRules rules);

    public /* synthetic */ ConversationField(FieldType fieldType, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldType);
    }
}
