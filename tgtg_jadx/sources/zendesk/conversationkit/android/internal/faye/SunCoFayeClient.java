package zendesk.conversationkit.android.internal.faye;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.model.Message;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0004¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;", "", "", "connect", "()V", "disconnect", "", "messageId", "Lzendesk/conversationkit/android/model/Message;", "awaitFileUploadResult", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "awaitClientConnected", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/ConnectionStatus;", "connectionStatus", "()Lzendesk/conversationkit/android/ConnectionStatus;", "invalidate", "subscribe", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SunCoFayeClient {
    @Nullable
    Object awaitClientConnected(@NotNull c<? super Unit> cVar);

    @Nullable
    Object awaitFileUploadResult(@NotNull String str, @NotNull c<? super Message> cVar);

    void connect();

    @NotNull
    ConnectionStatus connectionStatus();

    void disconnect();

    void invalidate();

    void subscribe();
}
