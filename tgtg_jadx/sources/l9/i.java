package l9;

import com.braze.h2;
import g9.z;
import i0.w;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;
import m0.i1;
import q1.a0;
import q1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27566a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f27568c;

    public i(w wVar) {
        this.f27568c = wVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27566a + 1 < ((l1) this.f27568c.f22747d).f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        this.f27567b = true;
        l1 l1Var = (l1) this.f27568c.f22747d;
        int i11 = this.f27566a + 1;
        this.f27566a = i11;
        return (z) l1Var.h(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f27567b) {
            h2.b("You must call next() before you can remove an element");
            return;
        }
        l1 l1Var = (l1) this.f27568c.f22747d;
        ((z) l1Var.h(this.f27566a)).f20259c = null;
        int i11 = this.f27566a;
        Object[] objArr = l1Var.f35787c;
        Object obj = objArr[i11];
        Object obj2 = a0.f35712c;
        if (obj != obj2) {
            objArr[i11] = obj2;
            l1Var.f35785a = true;
        }
        this.f27566a = i11 - 1;
        this.f27567b = false;
    }
}
