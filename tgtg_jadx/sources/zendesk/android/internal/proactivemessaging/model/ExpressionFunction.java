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
@h(with = ExpressionFunctionSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction;", "", "<init>", "(Ljava/lang/String;I)V", "EQUALS", "NOT_EQUALS", "CONTAINS_ANY_STRING", "CONTAINS_NONE_STRING", "UNKNOWN", "ExpressionFunctionSerializer", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressionFunction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ExpressionFunction[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("equals")
    public static final ExpressionFunction EQUALS = new ExpressionFunction("EQUALS", 0);

    @g("notequals")
    public static final ExpressionFunction NOT_EQUALS = new ExpressionFunction("NOT_EQUALS", 1);

    @g("containsAnyString")
    public static final ExpressionFunction CONTAINS_ANY_STRING = new ExpressionFunction("CONTAINS_ANY_STRING", 2);

    @g("containsNoneString")
    public static final ExpressionFunction CONTAINS_NONE_STRING = new ExpressionFunction("CONTAINS_NONE_STRING", 3);
    public static final ExpressionFunction UNKNOWN = new ExpressionFunction("UNKNOWN", 4);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction$ExpressionFunctionSerializer;", "Lzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer;", "Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nExpressionFunction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionFunction.kt\nzendesk/android/internal/proactivemessaging/model/ExpressionFunction$ExpressionFunctionSerializer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,49:1\n37#2:50\n36#2,3:51\n*S KotlinDebug\n*F\n+ 1 ExpressionFunction.kt\nzendesk/android/internal/proactivemessaging/model/ExpressionFunction$ExpressionFunctionSerializer\n*L\n45#1:50\n45#1:51,3\n*E\n"})
    public static final class ExpressionFunctionSerializer extends EnumIgnoreUnknownSerializer<ExpressionFunction> {

        @NotNull
        public static final ExpressionFunctionSerializer INSTANCE = new ExpressionFunctionSerializer();

        private ExpressionFunctionSerializer() {
            super((Enum[]) ExpressionFunction.getEntries().toArray(new ExpressionFunction[0]), ExpressionFunction.UNKNOWN);
        }
    }

    private static final /* synthetic */ ExpressionFunction[] $values() {
        return new ExpressionFunction[]{EQUALS, NOT_EQUALS, CONTAINS_ANY_STRING, CONTAINS_NONE_STRING, UNKNOWN};
    }

    static {
        ExpressionFunction[] expressionFunctionArr$values = $values();
        $VALUES = expressionFunctionArr$values;
        $ENTRIES = n.w(expressionFunctionArr$values);
        INSTANCE = new Companion(null);
    }

    private ExpressionFunction(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ExpressionFunction valueOf(String str) {
        return (ExpressionFunction) Enum.valueOf(ExpressionFunction.class, str);
    }

    public static ExpressionFunction[] values() {
        return (ExpressionFunction[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/ExpressionFunction;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ExpressionFunctionSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
