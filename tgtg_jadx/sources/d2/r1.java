package d2;

import c5.l3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f13909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f13910c;

    public /* synthetic */ r1(float f11, float f12, int i11) {
        this.f13908a = i11;
        this.f13909b = f11;
        this.f13910c = f12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13908a) {
            case 0:
                c5.o2 o2Var = (c5.o2) obj;
                o2Var.f7307a = "absoluteOffset";
                l3 l3Var = o2Var.f7309c;
                l3Var.b(new z5.f(this.f13909b), "x");
                l3Var.b(new z5.f(this.f13910c), "y");
                break;
            case 1:
                c5.o2 o2Var2 = (c5.o2) obj;
                o2Var2.f7307a = "offset";
                l3 l3Var2 = o2Var2.f7309c;
                l3Var2.b(new z5.f(this.f13909b), "x");
                l3Var2.b(new z5.f(this.f13910c), "y");
                break;
            case 2:
                c5.o2 o2Var3 = (c5.o2) obj;
                o2Var3.f7307a = "padding";
                l3 l3Var3 = o2Var3.f7309c;
                l3Var3.b(new z5.f(this.f13909b), "horizontal");
                l3Var3.b(new z5.f(this.f13910c), "vertical");
                break;
            default:
                i4.s0 s0Var = (i4.s0) obj;
                s0Var.getClass();
                s0Var.x(this.f13909b);
                s0Var.y(this.f13910c);
                break;
        }
        return Unit.f26487a;
    }
}
