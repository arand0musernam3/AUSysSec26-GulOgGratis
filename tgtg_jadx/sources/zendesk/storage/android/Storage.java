package zendesk.storage.android;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH&¢\u0006\u0002\u0010\u000bJ3\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u0001H\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH&¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"Lzendesk/storage/android/Storage;", "", "namespace", "", "getNamespace", "()Ljava/lang/String;", "get", "T", "key", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)V", "remove", "clear", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Storage {
    void clear();

    @Nullable
    <T> T get(@NotNull String key, @NotNull Class<T> type);

    @NotNull
    String getNamespace();

    void remove(@NotNull String key);

    <T> void set(@NotNull String key, @Nullable T value, @NotNull Class<T> type);
}
