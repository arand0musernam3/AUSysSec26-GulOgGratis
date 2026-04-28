package h7;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f21515b;

    public a1(ViewGroup viewGroup) {
        this.f21515b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21514a < this.f21515b.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup = this.f21515b;
        int i11 = this.f21514a;
        this.f21514a = i11 + 1;
        View childAt = viewGroup.getChildAt(i11);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.f21515b;
        int i11 = this.f21514a - 1;
        this.f21514a = i11;
        viewGroup.removeViewAt(i11);
    }
}
