package zendesk.storage.android;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0086\u0002¢\u0006\u0002\u0010\u000fJ,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lzendesk/storage/android/PersistedProperty;", "T", "", "storage", "Lzendesk/storage/android/Storage;", "key", "", "clazz", "Ljava/lang/Class;", "<init>", "(Lzendesk/storage/android/Storage;Ljava/lang/String;Ljava/lang/Class;)V", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "zendesk.storage_storage-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PersistedProperty<T> {

    @NotNull
    private final Class<T> clazz;

    @NotNull
    private final String key;

    @NotNull
    private final Storage storage;

    public PersistedProperty(@NotNull Storage storage, @NotNull String str, @NotNull Class<T> cls) {
        storage.getClass();
        str.getClass();
        cls.getClass();
        this.storage = storage;
        this.key = str;
        this.clazz = cls;
    }

    @Nullable
    public final T getValue(@NotNull Object thisRef, @NotNull KProperty<?> property) {
        thisRef.getClass();
        property.getClass();
        return (T) this.storage.get(this.key, this.clazz);
    }

    public final void setValue(@NotNull Object thisRef, @NotNull KProperty<?> property, @Nullable T value) {
        thisRef.getClass();
        property.getClass();
        this.storage.set(this.key, value, this.clazz);
    }
}
