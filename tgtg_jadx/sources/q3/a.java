package q3;

import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35954c;

    public /* synthetic */ a(int i11, int i12, int i13) {
        this.f35952a = i13;
        this.f35953b = i11;
        this.f35954c = i12;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.f35952a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f35952a) {
            case 0:
                if (this.f35953b < this.f35954c) {
                }
                break;
            default:
                if (this.f35953b < this.f35954c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f35952a) {
            case 0:
                if (this.f35953b > 0) {
                }
                break;
            default:
                if (this.f35953b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f35952a) {
        }
        return this.f35953b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i11;
        switch (this.f35952a) {
            case 0:
                i11 = this.f35953b;
                break;
            default:
                i11 = this.f35953b;
                break;
        }
        return i11 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.f35952a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.f35952a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
