package zendesk.android.internal.usercolors;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import zendesk.android.messaging.model.UserColors;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, d2 = {"toPersistence", "Lzendesk/android/internal/usercolors/UserColorsPersistence;", "Lzendesk/android/messaging/model/UserColors;", "toUserColors", "zendesk_zendesk-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UserColorsPersistenceKt {
    @Nullable
    public static final UserColorsPersistence toPersistence(@Nullable UserColors userColors) {
        if (userColors == null) {
            return null;
        }
        return new UserColorsPersistence(userColors.getOnMessage(), userColors.getMessage(), userColors.getAction(), userColors.getOnAction(), userColors.getPrimary(), userColors.getOnPrimary(), userColors.getOnBusinessMessage(), userColors.getBusinessMessage(), userColors.getBackground(), userColors.getOnBackground(), userColors.getOnSecondaryAction(), userColors.getError(), userColors.getOnError(), userColors.getNotify(), userColors.getOnNotify());
    }

    @Nullable
    public static final UserColors toUserColors(@Nullable UserColorsPersistence userColorsPersistence) {
        if (userColorsPersistence == null) {
            return null;
        }
        return new UserColors(userColorsPersistence.getOnMessage(), userColorsPersistence.getMessage(), userColorsPersistence.getAction(), userColorsPersistence.getOnAction(), userColorsPersistence.getPrimary(), userColorsPersistence.getOnPrimary(), userColorsPersistence.getOnBusinessMessage(), userColorsPersistence.getBusinessMessage(), userColorsPersistence.getBackground(), userColorsPersistence.getOnBackground(), userColorsPersistence.getSecondaryAction(), userColorsPersistence.getError(), userColorsPersistence.getOnError(), userColorsPersistence.getNotify(), userColorsPersistence.getOnNotify());
    }
}
