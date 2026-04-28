package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.j1;
import kotlin.collections.l0;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.collections.t0;
import kotlin.collections.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0015\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\n\u001a\u0015\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\u0003\u0010\r\u001a\u0015\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000e¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0015\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0011¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0015\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u0014¢\u0006\u0004\b\u0003\u0010\u0016\u001a\u0015\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u0017¢\u0006\u0004\b\u0003\u0010\u0019¨\u0006\u001a"}, d2 = {"", "array", "Lkotlin/collections/a0;", "iterator", "([B)Lkotlin/collections/a0;", "", "Lkotlin/collections/b0;", "([C)Lkotlin/collections/b0;", "", "Lkotlin/collections/j1;", "([S)Lkotlin/collections/j1;", "", "Lkotlin/collections/s0;", "([I)Lkotlin/collections/s0;", "", "Lkotlin/collections/t0;", "([J)Lkotlin/collections/t0;", "", "Lkotlin/collections/q0;", "([F)Lkotlin/collections/q0;", "", "Lkotlin/collections/l0;", "([D)Lkotlin/collections/l0;", "", "Lkotlin/collections/z;", "([Z)Lkotlin/collections/z;", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class ArrayIteratorsKt {
    @NotNull
    public static final a0 iterator(@NotNull byte[] bArr) {
        bArr.getClass();
        return new ArrayByteIterator(bArr);
    }

    @NotNull
    public static final b0 iterator(@NotNull char[] cArr) {
        cArr.getClass();
        return new ArrayCharIterator(cArr);
    }

    @NotNull
    public static final j1 iterator(@NotNull short[] sArr) {
        sArr.getClass();
        return new ArrayShortIterator(sArr);
    }

    @NotNull
    public static final s0 iterator(@NotNull int[] iArr) {
        iArr.getClass();
        return new ArrayIntIterator(iArr);
    }

    @NotNull
    public static final t0 iterator(@NotNull long[] jArr) {
        jArr.getClass();
        return new ArrayLongIterator(jArr);
    }

    @NotNull
    public static final q0 iterator(@NotNull float[] fArr) {
        fArr.getClass();
        return new ArrayFloatIterator(fArr);
    }

    @NotNull
    public static final l0 iterator(@NotNull double[] dArr) {
        dArr.getClass();
        return new ArrayDoubleIterator(dArr);
    }

    @NotNull
    public static final z iterator(@NotNull boolean[] zArr) {
        zArr.getClass();
        return new ArrayBooleanIterator(zArr);
    }
}
