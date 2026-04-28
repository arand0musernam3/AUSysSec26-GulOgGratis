package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z4.m1 f13765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13767d;

    public /* synthetic */ c1(int i11, int i12, z4.m1 m1Var) {
        this.f13764a = 2;
        this.f13766c = i11;
        this.f13765b = m1Var;
        this.f13767d = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13764a) {
            case 0:
                ((z4.l1) obj).j(this.f13765b, this.f13766c, this.f13767d, 0.0f);
                break;
            case 1:
                ((z4.l1) obj).j(this.f13765b, this.f13766c, this.f13767d, 0.0f);
                break;
            default:
                ((z4.l1) obj).j(this.f13765b, j80.c.b((this.f13766c - r0.f47183a) / 2.0f), j80.c.b((this.f13767d - r0.f47184b) / 2.0f), 0.0f);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c1(z4.m1 m1Var, int i11, int i12, int i13) {
        this.f13764a = i13;
        this.f13765b = m1Var;
        this.f13766c = i11;
        this.f13767d = i12;
    }
}
