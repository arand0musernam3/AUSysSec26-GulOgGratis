package v80;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends k1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f42156f;

    public /* synthetic */ s0(Object obj, int i11) {
        this.f42155e = i11;
        this.f42156f = obj;
    }

    @Override // v80.k1
    public final boolean k() {
        switch (this.f42155e) {
        }
        return false;
    }

    @Override // v80.k1
    public final void l(Throwable th2) {
        int i11 = this.f42155e;
        Object obj = this.f42156f;
        switch (i11) {
            case 0:
                ((r0) obj).a();
                break;
            case 1:
                ((Function1) obj).invoke(th2);
                break;
            default:
                s1 s1VarJ = j();
                s1VarJ.getClass();
                Object obj2 = s1.f42157a.get(s1VarJ);
                l1 l1Var = (l1) obj;
                if (!(obj2 instanceof t)) {
                    u70.o oVar = u70.q.f40850b;
                    l1Var.resumeWith(f0.J(obj2));
                } else {
                    u70.o oVar2 = u70.q.f40850b;
                    l1Var.resumeWith(ba0.g.j(((t) obj2).f42160a));
                }
                break;
        }
    }
}
