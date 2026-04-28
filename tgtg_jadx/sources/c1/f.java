package c1;

import androidx.core.util.Consumer;
import java.util.ArrayList;
import q1.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6864b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f6863a = i11;
        this.f6864b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f6863a) {
            case 0:
                ((Consumer) this.f6864b).getClass();
                ((Consumer) this.f6864b).accept(obj);
                return;
            case 1:
                e7.f fVar = (e7.f) obj;
                if (fVar == null) {
                    fVar = new e7.f(-3);
                }
                ((dn.k) this.f6864b).u(fVar);
                return;
            case 2:
                e7.f fVar2 = (e7.f) obj;
                synchronized (e7.g.f15828c) {
                    try {
                        k1 k1Var = e7.g.f15829d;
                        ArrayList arrayList = (ArrayList) k1Var.get((String) this.f6864b);
                        if (arrayList == null) {
                            return;
                        }
                        k1Var.remove((String) this.f6864b);
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((Consumer) arrayList.get(i11)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
            default:
                v80.l lVar = (v80.l) this.f6864b;
                u70.o oVar = u70.q.f40850b;
                lVar.resumeWith((m0.i) obj);
                return;
        }
    }
}
