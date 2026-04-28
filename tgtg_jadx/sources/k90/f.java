package k90;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import m0.i1;
import m90.y;
import q1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26235c;

    public f(y yVar) {
        this.f26233a = 0;
        this.f26235c = yVar;
        this.f26234b = yVar.f29781c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26233a) {
            case 0:
                if (this.f26234b > 0) {
                }
                break;
            case 1:
                if (this.f26234b < ((kotlin.collections.f) this.f26235c).b()) {
                }
                break;
            case 2:
                if (this.f26234b < ((l1) this.f26235c).f()) {
                }
                break;
            case 3:
                if (this.f26234b < ((byte[]) this.f26235c).length) {
                }
                break;
            case 4:
                if (this.f26234b < ((int[]) this.f26235c).length) {
                }
                break;
            case 5:
                if (this.f26234b < ((long[]) this.f26235c).length) {
                }
                break;
            default:
                if (this.f26234b < ((short[]) this.f26235c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26233a) {
            case 0:
                y yVar = (y) this.f26235c;
                int i11 = yVar.f29781c;
                int i12 = this.f26234b;
                this.f26234b = i12 - 1;
                break;
            case 1:
                if (!hasNext()) {
                    i1.c();
                } else {
                    kotlin.collections.f fVar = (kotlin.collections.f) this.f26235c;
                    int i13 = this.f26234b;
                    this.f26234b = i13 + 1;
                }
                break;
            case 2:
                l1 l1Var = (l1) this.f26235c;
                int i14 = this.f26234b;
                this.f26234b = i14 + 1;
                break;
            case 3:
                int i15 = this.f26234b;
                byte[] bArr = (byte[]) this.f26235c;
                if (i15 >= bArr.length) {
                    qc.y.h(String.valueOf(i15));
                } else {
                    this.f26234b = i15 + 1;
                }
                break;
            case 4:
                int i16 = this.f26234b;
                int[] iArr = (int[]) this.f26235c;
                if (i16 >= iArr.length) {
                    qc.y.h(String.valueOf(i16));
                } else {
                    this.f26234b = i16 + 1;
                }
                break;
            case 5:
                int i17 = this.f26234b;
                long[] jArr = (long[]) this.f26235c;
                if (i17 >= jArr.length) {
                    qc.y.h(String.valueOf(i17));
                } else {
                    this.f26234b = i17 + 1;
                }
                break;
            default:
                int i18 = this.f26234b;
                short[] sArr = (short[]) this.f26235c;
                if (i18 >= sArr.length) {
                    qc.y.h(String.valueOf(i18));
                } else {
                    this.f26234b = i18 + 1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f26233a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ f(Object obj, int i11) {
        this.f26233a = i11;
        this.f26235c = obj;
    }
}
