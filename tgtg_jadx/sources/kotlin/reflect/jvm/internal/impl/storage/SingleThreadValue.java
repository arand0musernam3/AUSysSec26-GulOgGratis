package kotlin.reflect.jvm.internal.impl.storage;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
class SingleThreadValue<T> {
    private final Thread thread = Thread.currentThread();
    private final T value;

    public SingleThreadValue(T t9) {
        this.value = t9;
    }

    public T getValue() {
        if (hasValue()) {
            return this.value;
        }
        h2.b("No value in this thread (hasValue should be checked before)");
        return null;
    }

    public boolean hasValue() {
        return this.thread == Thread.currentThread();
    }
}
