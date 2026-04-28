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
@h(with = ExpressionTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\b"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ExpressionType;", "", "<init>", "(Ljava/lang/String;I)V", "CALL", "UNKNOWN", "ExpressionTypeSerializer", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ExpressionType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("call")
    public static final ExpressionType CALL = new ExpressionType("CALL", 0);
    public static final ExpressionType UNKNOWN = new ExpressionType("UNKNOWN", 1);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ExpressionType$ExpressionTypeSerializer;", "Lzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer;", "Lzendesk/android/internal/proactivemessaging/model/ExpressionType;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nExpressionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionType.kt\nzendesk/android/internal/proactivemessaging/model/ExpressionType$ExpressionTypeSerializer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,31:1\n37#2:32\n36#2,3:33\n*S KotlinDebug\n*F\n+ 1 ExpressionType.kt\nzendesk/android/internal/proactivemessaging/model/ExpressionType$ExpressionTypeSerializer\n*L\n27#1:32\n27#1:33,3\n*E\n"})
    public static final class ExpressionTypeSerializer extends EnumIgnoreUnknownSerializer<ExpressionType> {

        @NotNull
        public static final ExpressionTypeSerializer INSTANCE = new ExpressionTypeSerializer();

        private ExpressionTypeSerializer() {
            super((Enum[]) ExpressionType.getEntries().toArray(new ExpressionType[0]), ExpressionType.UNKNOWN);
        }
    }

    private static final /* synthetic */ ExpressionType[] $values() {
        return new ExpressionType[]{CALL, UNKNOWN};
    }

    static {
        ExpressionType[] expressionTypeArr$values = $values();
        $VALUES = expressionTypeArr$values;
        $ENTRIES = n.w(expressionTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private ExpressionType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ExpressionType valueOf(String str) {
        return (ExpressionType) Enum.valueOf(ExpressionType.class, str);
    }

    public static ExpressionType[] values() {
        return (ExpressionType[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ExpressionType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/ExpressionType;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ExpressionTypeSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
