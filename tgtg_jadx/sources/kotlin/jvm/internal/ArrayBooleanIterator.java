package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.z;
import org.jetbrains.annotations.NotNull;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/jvm/internal/ArrayBooleanIterator;", "Lkotlin/collections/z;", "", "array", "<init>", "([Z)V", "", "hasNext", "()Z", "nextBoolean", "[Z", "", "index", "I", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class ArrayBooleanIterator extends z {

    @NotNull
    private final boolean[] array;
    private int index;

    public ArrayBooleanIterator(@NotNull boolean[] zArr) {
        zArr.getClass();
        this.array = zArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // kotlin.collections.z
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.array;
            int i11 = this.index;
            this.index = i11 + 1;
            return zArr[i11];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.index--;
            y.h(e5.getMessage());
            return false;
        }
    }
}
