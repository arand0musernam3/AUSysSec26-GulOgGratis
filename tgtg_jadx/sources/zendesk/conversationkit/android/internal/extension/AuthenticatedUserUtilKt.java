package zendesk.conversationkit.android.internal.extension;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.internal.user.Jwt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"isJwtExpired", "", "Lzendesk/conversationkit/android/internal/user/Jwt;", "currentTimeMillis", "", "MILLISECONDS_IN_SECOND", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AuthenticatedUserUtilKt {
    public static final long MILLISECONDS_IN_SECOND = 1000;

    public static final boolean isJwtExpired(@NotNull Jwt jwt, long j9) {
        jwt.getClass();
        Long exp = jwt.getExp();
        return exp != null && j9 > exp.longValue() * 1000;
    }

    public static /* synthetic */ boolean isJwtExpired$default(Jwt jwt, long j9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = System.currentTimeMillis();
        }
        return isJwtExpired(jwt, j9);
    }
}
