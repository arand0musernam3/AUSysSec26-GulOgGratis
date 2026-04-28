package zendesk.core.ui.android.internal.xml;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;
import zendesk.core.ui.android.internal.InternalZendeskUIApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/core/ui/android/internal/xml/InsetType;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "HORIZONTAL", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InternalZendeskUIApi
public final class InsetType {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ InsetType[] $VALUES;
    public static final InsetType TOP = new InsetType("TOP", 0);
    public static final InsetType BOTTOM = new InsetType("BOTTOM", 1);
    public static final InsetType HORIZONTAL = new InsetType("HORIZONTAL", 2);

    private static final /* synthetic */ InsetType[] $values() {
        return new InsetType[]{TOP, BOTTOM, HORIZONTAL};
    }

    static {
        InsetType[] insetTypeArr$values = $values();
        $VALUES = insetTypeArr$values;
        $ENTRIES = n.w(insetTypeArr$values);
    }

    private InsetType(String str, int i11) {
    }

    @NotNull
    public static a80.a getEntries() {
        return $ENTRIES;
    }

    public static InsetType valueOf(String str) {
        return (InsetType) Enum.valueOf(InsetType.class, str);
    }

    public static InsetType[] values() {
        return (InsetType[]) $VALUES.clone();
    }
}
