package zendesk.ui.android.conversation.avatar;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/avatar/AvatarMask;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "CIRCLE", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvatarMask {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvatarMask[] $VALUES;
    public static final AvatarMask NONE = new AvatarMask("NONE", 0);
    public static final AvatarMask CIRCLE = new AvatarMask("CIRCLE", 1);

    private static final /* synthetic */ AvatarMask[] $values() {
        return new AvatarMask[]{NONE, CIRCLE};
    }

    static {
        AvatarMask[] avatarMaskArr$values = $values();
        $VALUES = avatarMaskArr$values;
        $ENTRIES = n.w(avatarMaskArr$values);
    }

    private AvatarMask(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AvatarMask valueOf(String str) {
        return (AvatarMask) Enum.valueOf(AvatarMask.class, str);
    }

    public static AvatarMask[] values() {
        return (AvatarMask[]) $VALUES.clone();
    }
}
