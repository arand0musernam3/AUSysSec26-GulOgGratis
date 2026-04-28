package m0;

import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import s0.u1;
import s0.w1;
import s0.x1;
import s0.y1;
import s0.z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28511b;

    public /* synthetic */ g0(Object obj, int i11) {
        this.f28510a = i11;
        this.f28511b = obj;
    }

    @Override // s0.w1
    public final void a(z1 z1Var, x1 x1Var) {
        switch (this.f28510a) {
            case 0:
                j0 j0Var = (j0) this.f28511b;
                if (j0Var.d() != null) {
                    r0.q qVar = j0Var.f28544z;
                    qVar.getClass();
                    a.a.t();
                    qVar.f37510f = true;
                    r0.o oVar = qVar.f37508d;
                    if (oVar != null) {
                        a.a.t();
                        if (!oVar.f37497d.f15782b.isDone()) {
                            ImageCaptureException imageCaptureException = new ImageCaptureException(3, "The request is aborted silently and retried.", null);
                            a.a.t();
                            oVar.f37500g = true;
                            x0.b bVar = oVar.f37502i;
                            Objects.requireNonNull(bVar);
                            bVar.cancel(true);
                            oVar.f37498e.d(imageCaptureException);
                            oVar.f37499f.b(null);
                            r0.q qVar2 = oVar.f37495b;
                            r0.f fVar = oVar.f37494a;
                            a.a.t();
                            wd.a.p("TakePictureManagerImpl", "Add a new request for retrying.");
                            qVar2.f37505a.addFirst(fVar);
                            qVar2.b();
                        }
                    }
                    j0Var.D(true);
                    String strF = j0Var.f();
                    s0.b1 b1Var = (s0.b1) j0Var.f28560i;
                    s0.n nVar = j0Var.f28561j;
                    nVar.getClass();
                    u1 u1VarE = j0Var.E(strF, b1Var, nVar);
                    j0Var.f28542x = u1VarE;
                    Object[] objArr = {u1VarE.c()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    j0Var.B(Collections.unmodifiableList(arrayList));
                    j0Var.p();
                    r0.q qVar3 = j0Var.f28544z;
                    qVar3.getClass();
                    a.a.t();
                    qVar3.f37510f = false;
                    qVar3.b();
                    break;
                }
                break;
            case 1:
                s0 s0Var = (s0) this.f28511b;
                if (s0Var.d() != null) {
                    s0Var.F((s0.m1) s0Var.f28560i, s0Var.f28561j);
                    s0Var.p();
                    break;
                }
                break;
            default:
                Iterator it = ((y1) this.f28511b).f38479n.iterator();
                while (it.hasNext()) {
                    ((w1) it.next()).a(z1Var, x1Var);
                }
                break;
        }
    }
}
