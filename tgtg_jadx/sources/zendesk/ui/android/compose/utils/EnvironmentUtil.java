package zendesk.ui.android.compose.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/compose/utils/EnvironmentUtil;", "", "<init>", "()V", "isUnderTest", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnvironmentUtil {
    public static final int $stable = 0;

    @NotNull
    public static final EnvironmentUtil INSTANCE = new EnvironmentUtil();

    private EnvironmentUtil() {
    }

    public final boolean isUnderTest() {
        try {
            Class.forName("org.robolectric.Robolectric");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
