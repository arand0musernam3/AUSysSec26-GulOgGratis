package h7;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f21557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21558c;

    public h0(o80.s sVar) {
        this.f21556a = 1;
        this.f21558c = sVar;
        this.f21557b = sVar.f32132a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21556a) {
        }
        return this.f21557b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f21556a) {
            case 0:
                Object next = this.f21557b.next();
                ArrayList arrayList = (ArrayList) this.f21558c;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                a1 a1Var = viewGroup != null ? new a1(viewGroup) : null;
                if (a1Var == null || !a1Var.hasNext()) {
                    while (!this.f21557b.hasNext() && !arrayList.isEmpty()) {
                        this.f21557b = (Iterator) CollectionsKt.W(arrayList);
                        kotlin.collections.i0.x(arrayList);
                    }
                } else {
                    arrayList.add(this.f21557b);
                    this.f21557b = a1Var;
                }
                return next;
            default:
                return ((o80.s) this.f21558c).f32133b.invoke(this.f21557b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f21556a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h0(a1 a1Var) {
        this.f21556a = 0;
        this.f21558c = new ArrayList();
        this.f21557b = a1Var;
    }
}
