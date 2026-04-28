package zendesk.conversationkit.android.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.internal.rest.model.UserMergeDataDTO;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toUserMerge", "Lzendesk/conversationkit/android/model/UserMerge;", "Lzendesk/conversationkit/android/internal/rest/model/UserMergeDataDTO;", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UserMergeKt {
    @NotNull
    public static final UserMerge toUserMerge(@NotNull UserMergeDataDTO userMergeDataDTO) {
        userMergeDataDTO.getClass();
        return new UserMerge(userMergeDataDTO.getSurvivingAppUser().getId(), userMergeDataDTO.getSurvivingAppUser().getUserId(), userMergeDataDTO.getReason());
    }
}
