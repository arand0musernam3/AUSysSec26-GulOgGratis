package kotlin.ranges;

import b80.c;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import n80.g;
import n80.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final g f26552d = new g(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26555c;

    public a(int i11, int i12, int i13) {
        if (i13 == 0) {
            i4.a.f("Step must be non-zero.");
            throw null;
        }
        if (i13 == Integer.MIN_VALUE) {
            i4.a.f("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f26553a = i11;
        this.f26554b = c.a(i11, i12, i13);
        this.f26555c = i13;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f26553a == aVar.f26553a && this.f26554b == aVar.f26554b && this.f26555c == aVar.f26555c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f26553a * 31) + this.f26554b) * 31) + this.f26555c;
    }

    public boolean isEmpty() {
        int i11 = this.f26554b;
        int i12 = this.f26555c;
        int i13 = this.f26553a;
        return i12 > 0 ? i13 > i11 : i13 < i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this.f26553a, this.f26554b, this.f26555c);
    }

    public String toString() {
        StringBuilder sb2;
        int i11 = this.f26554b;
        int i12 = this.f26555c;
        int i13 = this.f26553a;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i13);
            sb2.append("..");
            sb2.append(i11);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i13);
            sb2.append(" downTo ");
            sb2.append(i11);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
