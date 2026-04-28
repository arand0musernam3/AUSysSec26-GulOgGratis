package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, KMappedMarker {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f26574id;

        @NotNull
        private final KClass<? extends K> key;

        public AbstractArrayMapAccessor(@NotNull KClass<? extends K> kClass, int i11) {
            kClass.getClass();
            this.key = kClass;
            this.f26574id = i11;
        }

        @Nullable
        public final T extractValue(@NotNull AbstractArrayMapOwner<K, V> abstractArrayMapOwner) {
            abstractArrayMapOwner.getClass();
            return abstractArrayMapOwner.getArrayMap().get(this.f26574id);
        }
    }

    @NotNull
    public abstract ArrayMap<V> getArrayMap();

    @NotNull
    public abstract TypeRegistry<K, V> getTypeRegistry();

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    public abstract void registerComponent(@NotNull KClass<? extends K> kClass, @NotNull V v3);
}
