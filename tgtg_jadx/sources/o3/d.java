package o3;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ListIterator, KMutableListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f31828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31829c;

    public d(List list, int i11, int i12) {
        this.f31827a = i12;
        switch (i12) {
            case 1:
                this.f31828b = list;
                this.f31829c = i11 - 1;
                break;
            default:
                this.f31828b = list;
                this.f31829c = i11;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f31827a) {
            case 0:
                this.f31828b.add(this.f31829c, obj);
                this.f31829c++;
                break;
            default:
                int i11 = this.f31829c + 1;
                this.f31829c = i11;
                this.f31828b.add(i11, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31827a) {
            case 0:
                return this.f31829c < this.f31828b.size();
            default:
                return this.f31829c < this.f31828b.size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f31827a) {
            case 0:
                if (this.f31829c > 0) {
                }
                break;
            default:
                if (this.f31829c >= 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f31827a) {
            case 0:
                int i11 = this.f31829c;
                this.f31829c = i11 + 1;
                return this.f31828b.get(i11);
            default:
                int i12 = this.f31829c + 1;
                this.f31829c = i12;
                return this.f31828b.get(i12);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f31827a) {
            case 0:
                return this.f31829c;
            default:
                return this.f31829c + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f31827a) {
            case 0:
                int i11 = this.f31829c - 1;
                this.f31829c = i11;
                return this.f31828b.get(i11);
            default:
                int i12 = this.f31829c;
                this.f31829c = i12 - 1;
                return this.f31828b.get(i12);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f31827a) {
            case 0:
                return this.f31829c - 1;
            default:
                return this.f31829c;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f31827a) {
            case 0:
                int i11 = this.f31829c - 1;
                this.f31829c = i11;
                this.f31828b.remove(i11);
                break;
            default:
                this.f31828b.remove(this.f31829c);
                this.f31829c--;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f31827a) {
            case 0:
                this.f31828b.set(this.f31829c, obj);
                break;
            default:
                this.f31828b.set(this.f31829c, obj);
                break;
        }
    }
}
