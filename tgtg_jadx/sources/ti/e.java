package ti;

import ao.e1;
import g3.d7;
import g3.g7;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.i1;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import m3.b1;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f40217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f40218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40220e;

    public /* synthetic */ e(Object obj, Object obj2, b1 b1Var, b1 b1Var2, int i11) {
        this.f40216a = i11;
        this.f40219d = obj;
        this.f40220e = obj2;
        this.f40217b = b1Var;
        this.f40218c = b1Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40216a) {
            case 0:
                b1 b1Var = this.f40217b;
                Set set = (Set) b1Var.getValue();
                b1 b1Var2 = this.f40218c;
                b1Var.setValue(i1.g(set, (Set) b1Var2.getValue()));
                b1Var2.setValue(p0.f26531a);
                d7 d7VarA = ((g7) this.f40219d).a();
                if (d7VarA != null) {
                    d7VarA.a();
                }
                v80.i1 i1Var = (v80.i1) ((Ref.ObjectRef) this.f40220e).element;
                if (i1Var != null) {
                    i1Var.a(null);
                }
                break;
            default:
                f0.B((b0) this.f40219d, null, null, new e1((Function1) this.f40220e, this.f40217b, this.f40218c, null, 17), 3);
                break;
        }
        return Unit.f26487a;
    }
}
