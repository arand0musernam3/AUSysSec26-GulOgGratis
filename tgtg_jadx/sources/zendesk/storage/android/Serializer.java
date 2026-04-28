package zendesk.storage.android;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H&¢\u0006\u0002\u0010\bJ+\u0010\t\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\n\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lzendesk/storage/android/Serializer;", "", "serialize", "", "T", Bayeux.KEY_DATA, "type", "Ljava/lang/Class;", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/String;", "deserialize", "source", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Serializer {
    @Nullable
    <T> T deserialize(@NotNull String source, @NotNull Class<T> type);

    @NotNull
    <T> String serialize(T data, @NotNull Class<T> type);
}
