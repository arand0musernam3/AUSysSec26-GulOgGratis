package zendesk.android.internal.proactivemessaging.model;

import a80.a;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;
import zendesk.core.android.internal.serializer.EnumIgnoreUnknownSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h(with = ConditionTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\b"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ConditionType;", "", "<init>", "(Ljava/lang/String;I)V", "CALL", "UNKNOWN", "ConditionTypeSerializer", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConditionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConditionType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("call")
    public static final ConditionType CALL = new ConditionType("CALL", 0);
    public static final ConditionType UNKNOWN = new ConditionType("UNKNOWN", 1);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ConditionType$ConditionTypeSerializer;", "Lzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer;", "Lzendesk/android/internal/proactivemessaging/model/ConditionType;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConditionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConditionType.kt\nzendesk/android/internal/proactivemessaging/model/ConditionType$ConditionTypeSerializer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,31:1\n37#2:32\n36#2,3:33\n*S KotlinDebug\n*F\n+ 1 ConditionType.kt\nzendesk/android/internal/proactivemessaging/model/ConditionType$ConditionTypeSerializer\n*L\n27#1:32\n27#1:33,3\n*E\n"})
    public static final class ConditionTypeSerializer extends EnumIgnoreUnknownSerializer<ConditionType> {

        @NotNull
        public static final ConditionTypeSerializer INSTANCE = new ConditionTypeSerializer();

        private ConditionTypeSerializer() {
            super((Enum[]) ConditionType.getEntries().toArray(new ConditionType[0]), ConditionType.UNKNOWN);
        }
    }

    private static final /* synthetic */ ConditionType[] $values() {
        return new ConditionType[]{CALL, UNKNOWN};
    }

    static {
        ConditionType[] conditionTypeArr$values = $values();
        $VALUES = conditionTypeArr$values;
        $ENTRIES = n.w(conditionTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private ConditionType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ConditionType valueOf(String str) {
        return (ConditionType) Enum.valueOf(ConditionType.class, str);
    }

    public static ConditionType[] values() {
        return (ConditionType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ConditionType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/ConditionType;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ConditionTypeSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
