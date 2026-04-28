package m2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.b1 f28770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f28771c;

    public /* synthetic */ b0(Function1 function1, m3.b1 b1Var, int i11) {
        this.f28769a = i11;
        this.f28771c = function1;
        this.f28770b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28769a) {
            case 0:
                m5.q0 q0Var = (m5.q0) obj;
                this.f28770b.setValue(q0Var);
                this.f28771c.invoke(q0Var);
                break;
            case 1:
                h4.b bVar = (h4.b) obj;
                m5.q0 q0Var2 = (m5.q0) this.f28770b.getValue();
                if (q0Var2 != null) {
                    this.f28771c.invoke(Integer.valueOf(q0Var2.f29618b.g(bVar.f21378a)));
                }
                break;
            case 2:
                kn.c cVar = (kn.c) obj;
                cVar.getClass();
                this.f28770b.setValue(cVar);
                this.f28771c.invoke(cVar);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                this.f28770b.setValue(str);
                this.f28771c.invoke(str);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b0(m3.b1 b1Var, Function1 function1, int i11) {
        this.f28769a = i11;
        this.f28770b = b1Var;
        this.f28771c = function1;
    }
}
