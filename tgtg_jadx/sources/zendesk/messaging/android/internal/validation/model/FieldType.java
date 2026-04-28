package zendesk.messaging.android.internal.validation.model;

import a80.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/FieldType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TEXT", "DECIMAL", "NUMBER", "DATE", "CHECKBOX", "DROP_DOWN", "REGEXP", "MULTI_LINE", "MULTI_SELECT", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FieldType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FieldType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final FieldType TEXT = new FieldType("TEXT", 0, TextBundle.TEXT_ENTRY);
    public static final FieldType DECIMAL = new FieldType("DECIMAL", 1, "decimal");
    public static final FieldType NUMBER = new FieldType("NUMBER", 2, "integer");
    public static final FieldType DATE = new FieldType("DATE", 3, "date");
    public static final FieldType CHECKBOX = new FieldType("CHECKBOX", 4, "checkbox");
    public static final FieldType DROP_DOWN = new FieldType("DROP_DOWN", 5, "tagger");
    public static final FieldType REGEXP = new FieldType("REGEXP", 6, "regexp");
    public static final FieldType MULTI_LINE = new FieldType("MULTI_LINE", 7, "textarea");
    public static final FieldType MULTI_SELECT = new FieldType("MULTI_SELECT", 8, "multiselect");

    private static final /* synthetic */ FieldType[] $values() {
        return new FieldType[]{TEXT, DECIMAL, NUMBER, DATE, CHECKBOX, DROP_DOWN, REGEXP, MULTI_LINE, MULTI_SELECT};
    }

    static {
        FieldType[] fieldTypeArr$values = $values();
        $VALUES = fieldTypeArr$values;
        $ENTRIES = n.w(fieldTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private FieldType(String str, int i11, String str2) {
        this.value = str2;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lzendesk/messaging/android/internal/validation/model/FieldType$Companion;", "", "<init>", "()V", "findByValue", "Lzendesk/messaging/android/internal/validation/model/FieldType;", "value", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConversationField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationField.kt\nzendesk/messaging/android/internal/validation/model/FieldType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,293:1\n1#2:294\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final FieldType findByValue(@NotNull String value) {
            value.getClass();
            for (FieldType fieldType : FieldType.values()) {
                if (Intrinsics.areEqual(fieldType.getValue(), value)) {
                    return fieldType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
