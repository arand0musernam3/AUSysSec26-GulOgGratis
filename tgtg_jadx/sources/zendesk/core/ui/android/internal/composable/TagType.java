package zendesk.core.ui.android.internal.composable;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzendesk/core/ui/android/internal/composable/TagType;", "", "<init>", "(Ljava/lang/String;I)V", "URL", "EMAIL", "PHONE", "zendesk.core.ui_core-ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TagType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TagType[] $VALUES;
    public static final TagType URL = new TagType("URL", 0);
    public static final TagType EMAIL = new TagType("EMAIL", 1);
    public static final TagType PHONE = new TagType("PHONE", 2);

    private static final /* synthetic */ TagType[] $values() {
        return new TagType[]{URL, EMAIL, PHONE};
    }

    static {
        TagType[] tagTypeArr$values = $values();
        $VALUES = tagTypeArr$values;
        $ENTRIES = n.w(tagTypeArr$values);
    }

    private TagType(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TagType valueOf(String str) {
        return (TagType) Enum.valueOf(TagType.class, str);
    }

    public static TagType[] values() {
        return (TagType[]) $VALUES.clone();
    }
}
