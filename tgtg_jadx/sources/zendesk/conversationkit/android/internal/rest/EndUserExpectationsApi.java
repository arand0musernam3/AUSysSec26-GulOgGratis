package zendesk.conversationkit.android.internal.rest;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra0.f;
import ra0.i;
import ra0.k;
import ra0.s;
import x70.c;
import zendesk.conversationkit.android.model.WaitTimeDataResponse;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/EndUserExpectationsApi;", "", "", "authorization", "conversationId", "Lzendesk/conversationkit/android/model/WaitTimeDataResponse;", "getWaitTimeData", "(Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EndUserExpectationsApi {

    @Deprecated
    @NotNull
    public static final String AUTHORIZATION_HEADER = "Authorization";

    @Deprecated
    @NotNull
    public static final String CONVERSATION_ID_PATH = "conversationId";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Deprecated
    @NotNull
    public static final String JSON_CONTENT_TYPE = "Content-Type:application/json";

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/EndUserExpectationsApi$Companion;", "", "<init>", "()V", "JSON_CONTENT_TYPE", "", "AUTHORIZATION_HEADER", "CONVERSATION_ID_PATH", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String AUTHORIZATION_HEADER = "Authorization";

        @NotNull
        public static final String CONVERSATION_ID_PATH = "conversationId";

        @NotNull
        public static final String JSON_CONTENT_TYPE = "Content-Type:application/json";

        private Companion() {
        }
    }

    @f("api/services/end_user_connector/wait_time/conversations/{conversationId}")
    @k({"Content-Type:application/json"})
    @Nullable
    Object getWaitTimeData(@NotNull @i("Authorization") String str, @s("conversationId") @NotNull String str2, @NotNull c<? super WaitTimeDataResponse> cVar);
}
