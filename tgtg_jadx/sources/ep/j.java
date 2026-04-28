package ep;

import hp.f1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f16293b;

    public /* synthetic */ j(d0 d0Var, int i11) {
        this.f16292a = i11;
        this.f16293b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16292a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                d0 d0Var = this.f16293b;
                d0Var.getClass();
                a2 a2Var = d0Var.f16250j;
                Iterable<f1> iterable = (Iterable) a2Var.getValue();
                ArrayList arrayList = new ArrayList(e0.o(iterable, 10));
                for (f1 f1Var : iterable) {
                    if (Intrinsics.areEqual(f1Var.f22273a.f22328b, str)) {
                        f1Var = new f1(f1Var.f22273a, !f1Var.f22274b);
                    }
                    arrayList.add(f1Var);
                }
                a2Var.k(null, arrayList);
                break;
            case 1:
                hp.g gVar = (hp.g) obj;
                gVar.getClass();
                this.f16293b.q(gVar, hp.u.INSTANCE.f22335a);
                break;
            case 2:
                hp.g gVar2 = (hp.g) obj;
                gVar2.getClass();
                this.f16293b.q(gVar2, hp.t.INSTANCE.f22335a);
                break;
            case 3:
                hp.g gVar3 = (hp.g) obj;
                gVar3.getClass();
                this.f16293b.q(gVar3, hp.x.INSTANCE.f22335a);
                break;
            default:
                hp.g gVar4 = (hp.g) obj;
                gVar4.getClass();
                this.f16293b.q(gVar4, hp.v.INSTANCE.f22335a);
                break;
        }
        return Unit.f26487a;
    }
}
