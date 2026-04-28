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
@h(with = FrequencySerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0081\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Frequency;", "", "<init>", "(Ljava/lang/String;I)V", "SEND_ONCE", "ONCE_PER_SESSION", "SEND_EVERYTIME", "UNKNOWN", "FrequencySerializer", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Frequency {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Frequency[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("mobile_once_per_device")
    public static final Frequency SEND_ONCE = new Frequency("SEND_ONCE", 0);

    @g("mobile_once_per_app_session")
    public static final Frequency ONCE_PER_SESSION = new Frequency("ONCE_PER_SESSION", 1);

    @g("mobile_every_time")
    public static final Frequency SEND_EVERYTIME = new Frequency("SEND_EVERYTIME", 2);
    public static final Frequency UNKNOWN = new Frequency("UNKNOWN", 3);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Frequency$FrequencySerializer;", "Lzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer;", "Lzendesk/android/internal/proactivemessaging/model/Frequency;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFrequency.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Frequency.kt\nzendesk/android/internal/proactivemessaging/model/Frequency$FrequencySerializer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,43:1\n37#2:44\n36#2,3:45\n*S KotlinDebug\n*F\n+ 1 Frequency.kt\nzendesk/android/internal/proactivemessaging/model/Frequency$FrequencySerializer\n*L\n39#1:44\n39#1:45,3\n*E\n"})
    public static final class FrequencySerializer extends EnumIgnoreUnknownSerializer<Frequency> {

        @NotNull
        public static final FrequencySerializer INSTANCE = new FrequencySerializer();

        private FrequencySerializer() {
            super((Enum[]) Frequency.getEntries().toArray(new Frequency[0]), Frequency.UNKNOWN);
        }
    }

    private static final /* synthetic */ Frequency[] $values() {
        return new Frequency[]{SEND_ONCE, ONCE_PER_SESSION, SEND_EVERYTIME, UNKNOWN};
    }

    static {
        Frequency[] frequencyArr$values = $values();
        $VALUES = frequencyArr$values;
        $ENTRIES = n.w(frequencyArr$values);
        INSTANCE = new Companion(null);
    }

    private Frequency(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static Frequency valueOf(String str) {
        return (Frequency) Enum.valueOf(Frequency.class, str);
    }

    public static Frequency[] values() {
        return (Frequency[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Frequency$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/Frequency;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return FrequencySerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
