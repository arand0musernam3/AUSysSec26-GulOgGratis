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
@h(with = TriggerTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/TriggerType;", "", "<init>", "(Ljava/lang/String;I)V", "ON_PAGE", "LOAD_PAGE", "UNKNOWN", "TriggerTypeSerializer", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TriggerType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TriggerType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("on_page")
    public static final TriggerType ON_PAGE = new TriggerType("ON_PAGE", 0);

    @g("load_page")
    public static final TriggerType LOAD_PAGE = new TriggerType("LOAD_PAGE", 1);
    public static final TriggerType UNKNOWN = new TriggerType("UNKNOWN", 2);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/TriggerType$TriggerTypeSerializer;", "Lzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer;", "Lzendesk/android/internal/proactivemessaging/model/TriggerType;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTriggerType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TriggerType.kt\nzendesk/android/internal/proactivemessaging/model/TriggerType$TriggerTypeSerializer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n37#2:40\n36#2,3:41\n*S KotlinDebug\n*F\n+ 1 TriggerType.kt\nzendesk/android/internal/proactivemessaging/model/TriggerType$TriggerTypeSerializer\n*L\n35#1:40\n35#1:41,3\n*E\n"})
    public static final class TriggerTypeSerializer extends EnumIgnoreUnknownSerializer<TriggerType> {

        @NotNull
        public static final TriggerTypeSerializer INSTANCE = new TriggerTypeSerializer();

        private TriggerTypeSerializer() {
            super((Enum[]) TriggerType.getEntries().toArray(new TriggerType[0]), TriggerType.UNKNOWN);
        }
    }

    private static final /* synthetic */ TriggerType[] $values() {
        return new TriggerType[]{ON_PAGE, LOAD_PAGE, UNKNOWN};
    }

    static {
        TriggerType[] triggerTypeArr$values = $values();
        $VALUES = triggerTypeArr$values;
        $ENTRIES = n.w(triggerTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private TriggerType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TriggerType valueOf(String str) {
        return (TriggerType) Enum.valueOf(TriggerType.class, str);
    }

    public static TriggerType[] values() {
        return (TriggerType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/TriggerType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/TriggerType;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return TriggerTypeSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
