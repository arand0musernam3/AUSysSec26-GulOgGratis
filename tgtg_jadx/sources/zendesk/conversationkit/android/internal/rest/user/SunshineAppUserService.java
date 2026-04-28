package zendesk.conversationkit.android.internal.rest.user;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.a;
import ra0.i;
import ra0.k;
import ra0.o;
import ra0.s;
import x70.c;
import zendesk.conversationkit.android.internal.rest.model.AppUserResponseDto;
import zendesk.conversationkit.android.internal.rest.user.model.LoginRequestBody;
import zendesk.conversationkit.android.internal.rest.user.model.LogoutRequestBody;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J.\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ8\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/user/SunshineAppUserService;", "", "", "appId", "authorization", "Lzendesk/conversationkit/android/internal/rest/user/model/LoginRequestBody;", "loginRequestBody", "Lzendesk/conversationkit/android/internal/rest/model/AppUserResponseDto;", "loginAppUser", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/user/model/LoginRequestBody;Lx70/c;)Ljava/lang/Object;", "appUserId", "Lzendesk/conversationkit/android/internal/rest/user/model/LogoutRequestBody;", "logoutRequestBody", "", "logoutAppUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/internal/rest/user/model/LogoutRequestBody;Lx70/c;)Ljava/lang/Object;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SunshineAppUserService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Deprecated
    @NotNull
    public static final String JSON_CONTENT_TYPE = "Content-Type:application/json";

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/user/SunshineAppUserService$Companion;", "", "<init>", "()V", "JSON_CONTENT_TYPE", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String JSON_CONTENT_TYPE = "Content-Type:application/json";

        private Companion() {
        }
    }

    @k({"Content-Type:application/json"})
    @o("v2/apps/{appId}/login")
    @Nullable
    Object loginAppUser(@s("appId") @NotNull String str, @NotNull @i("Authorization") String str2, @NotNull @a LoginRequestBody loginRequestBody, @NotNull c<? super AppUserResponseDto> cVar);

    @k({"Content-Type:application/json"})
    @o("v2/apps/{appId}/appusers/{appUserId}/logout")
    @Nullable
    Object logoutAppUser(@s("appId") @NotNull String str, @s("appUserId") @NotNull String str2, @NotNull @i("Authorization") String str3, @NotNull @a LogoutRequestBody logoutRequestBody, @NotNull c<? super Unit> cVar);
}
