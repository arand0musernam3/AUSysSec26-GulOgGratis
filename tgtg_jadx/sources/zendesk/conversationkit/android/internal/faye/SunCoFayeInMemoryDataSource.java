package zendesk.conversationkit.android.internal.faye;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource;
import zendesk.conversationkit.android.model.User;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/SunCoFayeInMemoryDataSource;", "", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource;", "userActionProcessorInMemoryDataSource", "<init>", "(Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource;)V", "Lzendesk/conversationkit/android/model/User;", "getUser", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SunCoFayeInMemoryDataSource {

    @NotNull
    private final UserActionProcessorInMemoryDataSource userActionProcessorInMemoryDataSource;

    public SunCoFayeInMemoryDataSource(@NotNull UserActionProcessorInMemoryDataSource userActionProcessorInMemoryDataSource) {
        userActionProcessorInMemoryDataSource.getClass();
        this.userActionProcessorInMemoryDataSource = userActionProcessorInMemoryDataSource;
    }

    @Nullable
    public final Object getUser(@NotNull c<? super User> cVar) {
        return this.userActionProcessorInMemoryDataSource.getUser(cVar);
    }
}
