package zendesk.android.internal.usercolors;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x70.c;
import y70.a;
import zendesk.android.messaging.model.UserColors;
import zendesk.messaging.android.internal.di.MessagingComponentKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzendesk/android/internal/usercolors/UserColorsRepository;", "", "Lzendesk/android/internal/usercolors/UserColorsStorage;", "storage", "<init>", "(Lzendesk/android/internal/usercolors/UserColorsStorage;)V", "", "clearStorage", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_LIGHT_COLORS, MessagingComponentKt.USER_DARK_COLORS, "updateUserColors", "(Lzendesk/android/messaging/model/UserColors;Lzendesk/android/messaging/model/UserColors;Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;", "getUserColors", "Lzendesk/android/internal/usercolors/UserColorsStorage;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserColorsRepository {

    @NotNull
    private final UserColorsStorage storage;

    public UserColorsRepository(@NotNull UserColorsStorage userColorsStorage) {
        userColorsStorage.getClass();
        this.storage = userColorsStorage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStorage(c<? super Unit> cVar) throws Throwable {
        Object objClear = this.storage.clear(cVar);
        return objClear == a.COROUTINE_SUSPENDED ? objClear : Unit.f26487a;
    }

    @Nullable
    public final Object getUserColors(@NotNull c<? super UserColorsSchemePersistence> cVar) {
        return this.storage.getUserColors(cVar);
    }

    @Nullable
    public final Object updateUserColors(@Nullable UserColors userColors, @Nullable UserColors userColors2, @NotNull c<? super Unit> cVar) throws Throwable {
        if (userColors == null && userColors2 == null) {
            Object objClearStorage = clearStorage(cVar);
            return objClearStorage == a.COROUTINE_SUSPENDED ? objClearStorage : Unit.f26487a;
        }
        Object userColors3 = this.storage.setUserColors(new UserColorsSchemePersistence(UserColorsPersistenceKt.toPersistence(userColors), UserColorsPersistenceKt.toPersistence(userColors2)), cVar);
        return userColors3 == a.COROUTINE_SUSPENDED ? userColors3 : Unit.f26487a;
    }
}
