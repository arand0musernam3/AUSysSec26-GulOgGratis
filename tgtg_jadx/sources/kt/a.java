package kt;

import com.app.tgtg.model.remote.AppSettings;
import com.app.tgtg.model.remote.EnvironmentListResult;
import com.app.tgtg.model.remote.UserSettings;
import com.app.tgtg.model.remote.token.PushToken;
import com.app.tgtg.model.remote.user.response.StartupResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.r0;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lkt/a;", "", "Lu70/q;", "Lcom/app/tgtg/model/remote/AppSettings;", "c", "(Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/UserSettings;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/app/tgtg/model/remote/user/response/StartupResponse;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Lcom/app/tgtg/model/remote/token/PushToken;", "pushToken", "Lq90/r0;", "b", "(Lcom/app/tgtg/model/remote/token/PushToken;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/EnvironmentListResult;", "e", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @ra0.o("api/app/v1/user_settings")
    @Nullable
    Object a(@NotNull x70.c<? super q<UserSettings>> cVar);

    @ra0.o("api/app/v1/savePushToken")
    @Nullable
    Object b(@NotNull @ra0.a PushToken pushToken, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.k({"withoutAuthorization: true"})
    @ra0.o("api/app/v1/app_settings")
    @Nullable
    Object c(@NotNull x70.c<? super q<AppSettings>> cVar);

    @ra0.o("api/app/v1/onStartup")
    @Nullable
    Object d(@NotNull x70.c<? super q<StartupResponse>> cVar);

    @ra0.f("https://meta.toogoodtogo.com/env/v1/list.json")
    @Nullable
    Object e(@NotNull x70.c<? super q<EnvironmentListResult>> cVar);
}
