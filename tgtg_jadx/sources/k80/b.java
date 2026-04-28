package k80;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements d {
    private Object value;

    public b(Object obj) {
        this.value = obj;
    }

    public void afterChange(@NotNull KProperty<?> kProperty, Object obj, Object obj2) {
        kProperty.getClass();
    }

    public boolean beforeChange(KProperty kProperty, Object obj, Object obj2) {
        kProperty.getClass();
        return true;
    }

    @Override // k80.c
    public Object getValue(@Nullable Object obj, @NotNull KProperty<?> kProperty) {
        kProperty.getClass();
        return this.value;
    }

    @Override // k80.d
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> kProperty, Object obj2) {
        kProperty.getClass();
        Object obj3 = this.value;
        if (beforeChange(kProperty, obj3, obj2)) {
            this.value = obj2;
            afterChange(kProperty, obj3, obj2);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
