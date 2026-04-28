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
@h(with = ExpressionTargetSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget;", "", "<init>", "(Ljava/lang/String;I)V", "PATH", "PAGE_TITLE", "USER_TYPE", "LANGUAGE", "UNKNOWN", "ExpressionTargetSerializer", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressionTarget {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ExpressionTarget[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @g("/visitor/path")
    public static final ExpressionTarget PATH = new ExpressionTarget("PATH", 0);

    @g("/visitor/page_title")
    public static final ExpressionTarget PAGE_TITLE = new ExpressionTarget("PAGE_TITLE", 1);

    @g("/visitor/type")
    public static final ExpressionTarget USER_TYPE = new ExpressionTarget("USER_TYPE", 2);

    @g("/device/language")
    public static final ExpressionTarget LANGUAGE = new ExpressionTarget("LANGUAGE", 3);
    public static final ExpressionTarget UNKNOWN = new ExpressionTarget("UNKNOWN", 4);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget$ExpressionTargetSerializer;", "Lzendesk/core/android/internal/serializer/EnumIgnoreUnknownSerializer;", "Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget;", "<init>", "()V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nExpressionTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionTarget.kt\nzendesk/android/internal/proactivemessaging/model/ExpressionTarget$ExpressionTargetSerializer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,48:1\n37#2:49\n36#2,3:50\n*S KotlinDebug\n*F\n+ 1 ExpressionTarget.kt\nzendesk/android/internal/proactivemessaging/model/ExpressionTarget$ExpressionTargetSerializer\n*L\n44#1:49\n44#1:50,3\n*E\n"})
    public static final class ExpressionTargetSerializer extends EnumIgnoreUnknownSerializer<ExpressionTarget> {

        @NotNull
        public static final ExpressionTargetSerializer INSTANCE = new ExpressionTargetSerializer();

        private ExpressionTargetSerializer() {
            super((Enum[]) ExpressionTarget.getEntries().toArray(new ExpressionTarget[0]), ExpressionTarget.UNKNOWN);
        }
    }

    private static final /* synthetic */ ExpressionTarget[] $values() {
        return new ExpressionTarget[]{PATH, PAGE_TITLE, USER_TYPE, LANGUAGE, UNKNOWN};
    }

    static {
        ExpressionTarget[] expressionTargetArr$values = $values();
        $VALUES = expressionTargetArr$values;
        $ENTRIES = n.w(expressionTargetArr$values);
        INSTANCE = new Companion(null);
    }

    private ExpressionTarget(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static ExpressionTarget valueOf(String str) {
        return (ExpressionTarget) Enum.valueOf(ExpressionTarget.class, str);
    }

    public static ExpressionTarget[] values() {
        return (ExpressionTarget[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/ExpressionTarget;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ExpressionTargetSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
