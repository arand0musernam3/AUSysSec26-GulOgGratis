package androidx.recyclerview.widget;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3764b;

    public /* synthetic */ h2(Object obj, int i11) {
        this.f3763a = i11;
        this.f3764b = obj;
    }

    @Override // androidx.recyclerview.widget.n1
    public final void a() {
        switch (this.f3763a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f3764b;
                recyclerView.l(null);
                recyclerView.f3599n1.f3831f = true;
                recyclerView.a0(true);
                if (!recyclerView.f3581e.g()) {
                    recyclerView.requestLayout();
                }
                break;
            case 1:
                ((ae.c) this.f3764b).e();
                break;
            default:
                ((va.c) this.f3764b).b(true);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.n1
    public final void b(int i11, int i12, Object obj) {
        switch (this.f3763a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f3764b;
                recyclerView.l(null);
                b bVar = recyclerView.f3581e;
                ArrayList arrayList = (ArrayList) bVar.f3665c;
                if (i12 >= 1) {
                    arrayList.add(bVar.h(obj, 4, i11, i12));
                    bVar.f3663a |= 4;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
            case 1:
                ((ae.c) this.f3764b).e();
                break;
            default:
                a();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.n1
    public final void c(int i11, int i12) {
        switch (this.f3763a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f3764b;
                recyclerView.l(null);
                b bVar = recyclerView.f3581e;
                ArrayList arrayList = (ArrayList) bVar.f3665c;
                if (i12 >= 1) {
                    arrayList.add(bVar.h(null, 1, i11, i12));
                    bVar.f3663a |= 1;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
            case 1:
                ((ae.c) this.f3764b).e();
                break;
            default:
                a();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.n1
    public final void d(int i11, int i12) {
        switch (this.f3763a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f3764b;
                recyclerView.l(null);
                b bVar = recyclerView.f3581e;
                ArrayList arrayList = (ArrayList) bVar.f3665c;
                if (i11 != i12) {
                    arrayList.add(bVar.h(null, 8, i11, i12));
                    bVar.f3663a |= 8;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
            case 1:
                ((ae.c) this.f3764b).e();
                break;
            default:
                a();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.n1
    public final void e(int i11, int i12) {
        switch (this.f3763a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f3764b;
                recyclerView.l(null);
                b bVar = recyclerView.f3581e;
                ArrayList arrayList = (ArrayList) bVar.f3665c;
                if (i12 >= 1) {
                    arrayList.add(bVar.h(null, 2, i11, i12));
                    bVar.f3663a |= 2;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
            case 1:
                ((ae.c) this.f3764b).e();
                break;
            default:
                a();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.n1
    public void f() {
        l1 l1Var;
        switch (this.f3763a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f3764b;
                if (recyclerView.f3580d != null && (l1Var = recyclerView.f3596m) != null && l1Var.canRestoreState()) {
                    recyclerView.requestLayout();
                }
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.f3764b;
        if (recyclerView.f3610t && recyclerView.f3608s) {
            ViewCompat.U(recyclerView, recyclerView.f3589i);
        } else {
            recyclerView.A = true;
            recyclerView.requestLayout();
        }
    }
}
