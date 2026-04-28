package r2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m2.b2;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f37540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2.d f37541c;

    public /* synthetic */ b(f fVar, t2.d dVar, int i11) {
        this.f37539a = i11;
        this.f37540b = fVar;
        this.f37541c = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37539a) {
            case 0:
                f fVar = this.f37540b;
                a aVar = fVar.f37555f;
                b2 b2Var = new b2(this.f37541c, 25);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                fVar.f37554e.d("dataBuilder", aVar, new qw.b(3, objectRef, b2Var));
                Object obj = objectRef.element;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("result");
                    obj = Unit.f26487a;
                }
                return (p2.c) obj;
            case 1:
                f fVar2 = this.f37540b;
                a aVar2 = fVar2.f37556g;
                b bVar = new b(fVar2, this.f37541c, 2);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                fVar2.f37554e.d("positioner", aVar2, new qw.b(3, objectRef2, bVar));
                Object obj2 = objectRef2.element;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("result");
                    obj2 = Unit.f26487a;
                }
                return (h4.c) obj2;
            default:
                Object objInvoke = this.f37540b.f37552c.invoke();
                if (!((z) objInvoke).n()) {
                    objInvoke = null;
                }
                z zVar = (z) objInvoke;
                return zVar == null ? h4.c.f21379e : this.f37541c.C0(zVar).k(zVar.S(0L));
        }
    }
}
