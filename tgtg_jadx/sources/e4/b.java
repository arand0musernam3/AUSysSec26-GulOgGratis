package e4;

import android.view.DragEvent;
import android.view.View;
import b5.o;
import b5.p2;
import c5.q;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnDragListener, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f15728a = new i(null, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.f f15729b = new q1.f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15730c = new a(this);

    public b(q qVar) {
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        d dVar = new d(dragEvent);
        int action = dragEvent.getAction();
        q1.f fVar = this.f15729b;
        i iVar = this.f15728a;
        switch (action) {
            case 1:
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                g gVar = new g(dVar, iVar, booleanRef);
                if (gVar.invoke(iVar) == p2.ContinueTraversal) {
                    o.r(iVar, gVar);
                }
                boolean z11 = booleanRef.element;
                fVar.getClass();
                q1.a aVar = new q1.a(fVar);
                while (aVar.hasNext()) {
                    ((k) aVar.next()).z(dVar);
                }
                break;
            case 2:
                iVar.E0(dVar);
                break;
            case 4:
                iVar.I0(dVar);
                fVar.clear();
                break;
            case 5:
                iVar.y(dVar);
                break;
            case 6:
                iVar.Q(dVar);
                break;
        }
        return false;
    }
}
