package zendesk.ui.android.internal;

import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzendesk/ui/android/internal/Patterns;", "", "<init>", "()V", "EMAIL_REGEX", "Lkotlin/text/Regex;", "getEMAIL_REGEX$annotations", "getEMAIL_REGEX", "()Lkotlin/text/Regex;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Patterns {

    @NotNull
    public static final Patterns INSTANCE = new Patterns();

    @NotNull
    private static final Regex EMAIL_REGEX = new Regex("((\"[^\"\\f\\n\\r\\t\\cK\b]+\")|([.\\w=!#$%&'*+\\-~/^`|{}]+))@((\\[(((25[0-5])|(2[0-4][0-9])|([0-1]?[0-9]?[0-9]))\\.((25[0-5])|(2[0-4][0-9])|([0-1]?[0-9]?[0-9]))\\.((25[0-5])|(2[0-4][0-9])|([0-1]?[0-9]?[0-9]))\\.((25[0-5])|(2[0-4][0-9])|([0-1]?[0-9]?[0-9])))])|(((25[0-5])|(2[0-4][0-9])|([0-1]?[0-9]?[0-9]))\\.((25[0-5])|(2[0-4][0-9])|([0-1]?[0-9]?[0-9]))\\.((25[0-5])|(2[0-4][0-9])|([0-1]?[0-9]?[0-9]))\\.((25[0-5])|(2[0-4][0-9])|([0-1]?[0-9]?[0-9])))|((([A-Za-z0-9\\-])+\\.)+[A-Za-z\\-]+))");
    public static final int $stable = 8;

    private Patterns() {
    }

    @NotNull
    public final Regex getEMAIL_REGEX() {
        return EMAIL_REGEX;
    }

    public static /* synthetic */ void getEMAIL_REGEX$annotations() {
    }
}
