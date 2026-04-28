package kotlin.ranges;

import kotlin.Metadata;
import n80.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", "", "", "e", "n80/i", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IntRange extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final i f26550e = new i(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final IntRange f26551f = new IntRange(1, 0, 1);

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.f26553a == intRange.f26553a && this.f26554b == intRange.f26554b;
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f26553a * 31) + this.f26554b;
    }

    @Override // kotlin.ranges.a
    public final boolean isEmpty() {
        return this.f26553a > this.f26554b;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.f26553a + ".." + this.f26554b;
    }
}
