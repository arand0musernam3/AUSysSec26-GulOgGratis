package zendesk.conversationkit.android.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.internal.user.UserActionProcessor;
import zendesk.conversationkit.android.model.User;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/AccessLevel;", "", "", "logName", "<init>", "(Ljava/lang/String;)V", "getClientId", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/User;", "getCurrentUser", "", "invalidate", "()V", "Ljava/lang/String;", "getLogName", "()Ljava/lang/String;", "Lzendesk/conversationkit/android/internal/AppAccess;", "Lzendesk/conversationkit/android/internal/UserAccess;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AccessLevel {

    @NotNull
    private final String logName;

    private AccessLevel(String str) {
        this.logName = str;
    }

    @Nullable
    public final Object getClientId(@NotNull x70.c<? super String> cVar) {
        if (this instanceof AppAccess) {
            return ((AppAccess) this).getConversationKitStorage().getClientId(cVar);
        }
        if (this instanceof UserAccess) {
            return ((UserAccess) this).getConversationKitStorage().getClientId(cVar);
        }
        e40.a.f();
        return null;
    }

    @Nullable
    public final Object getCurrentUser(@NotNull x70.c<? super User> cVar) {
        UserActionProcessor userProcessor;
        UserAccess userAccess = this instanceof UserAccess ? (UserAccess) this : null;
        if (userAccess == null || (userProcessor = userAccess.getUserProcessor()) == null) {
            return null;
        }
        Object user = userProcessor.getUser(cVar);
        return user == y70.a.COROUTINE_SUSPENDED ? user : (User) user;
    }

    @NotNull
    public final String getLogName() {
        return this.logName;
    }

    public final void invalidate() {
        if (this instanceof AppAccess) {
            ((AppAccess) this).getAppProcessor().invalidate();
        } else if (this instanceof UserAccess) {
            ((UserAccess) this).getUserProcessor().invalidate();
        } else {
            e40.a.f();
        }
    }

    public /* synthetic */ AccessLevel(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
