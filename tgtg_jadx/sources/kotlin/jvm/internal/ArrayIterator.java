package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\bF\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\f\u001a\u00020\rH\u0096\u0082\u0004J\u000f\u0010\u000e\u001a\u00028\u0000H\u0096\u0082\u0004¢\u0006\u0002\u0010\u000fR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000f\u0010\n\u001a\u00020\u000bX\u0082\u008e\b¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/jvm/internal/ArrayIterator;", "T", "", "array", "", "<init>", "([Ljava/lang/Object;)V", "getArray", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "index", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class ArrayIterator<T> implements Iterator<T>, KMappedMarker {

    @NotNull
    private final T[] array;
    private int index;

    public ArrayIterator(@NotNull T[] tArr) {
        tArr.getClass();
        this.array = tArr;
    }

    @NotNull
    public final T[] getArray() {
        return this.array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.array;
            int i11 = this.index;
            this.index = i11 + 1;
            return tArr[i11];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.index--;
            y.h(e5.getMessage());
            return null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
