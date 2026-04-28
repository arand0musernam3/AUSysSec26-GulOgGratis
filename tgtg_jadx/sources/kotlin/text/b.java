package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26588a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IntRange f26591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f26593f;

    public b(c cVar) {
        this.f26593f = cVar;
        int iC = n80.p.c(0, 0, cVar.f26594a.length());
        this.f26589b = iC;
        this.f26590c = iC;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            kotlin.text.c r0 = r8.f26593f
            java.lang.CharSequence r1 = r0.f26594a
            int r2 = r8.f26590c
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.f26588a = r3
            r0 = 0
            r8.f26591d = r0
            return
        Lf:
            int r4 = r0.f26595b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.f26592e
            int r7 = r7 + r6
            r8.f26592e = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r2 = r8.f26589b
            int r1 = kotlin.text.StringsKt.D(r1)
            r0.<init>(r2, r1, r6)
            r8.f26591d = r0
            r8.f26590c = r5
            goto L73
        L32:
            kotlin.jvm.functions.Function2 r0 = r0.f26596c
            int r2 = r8.f26590c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L52
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r2 = r8.f26589b
            int r1 = kotlin.text.StringsKt.D(r1)
            r0.<init>(r2, r1, r6)
            r8.f26591d = r0
            r8.f26590c = r5
            goto L73
        L52:
            java.lang.Object r1 = r0.f26485a
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.f26486b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.f26589b
            kotlin.ranges.IntRange r2 = n80.p.j(r2, r1)
            r8.f26591d = r2
            int r1 = r1 + r0
            r8.f26589b = r1
            if (r0 != 0) goto L70
            r3 = r6
        L70:
            int r1 = r1 + r3
            r8.f26590c = r1
        L73:
            r8.f26588a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f26588a == -1) {
            a();
        }
        return this.f26588a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f26588a == -1) {
            a();
        }
        if (this.f26588a == 0) {
            i1.c();
            return null;
        }
        IntRange intRange = this.f26591d;
        intRange.getClass();
        this.f26591d = null;
        this.f26588a = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
