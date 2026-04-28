package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z5.c f502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3.b1 f503c;

    public /* synthetic */ o2(z5.c cVar, m3.b1 b1Var) {
        this.f501a = 7;
        float f11 = lv.t.f28247a;
        this.f502b = cVar;
        this.f503c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f501a) {
            case 0:
                p2 p2Var = new p2(0, (Function0) obj);
                o2 o2Var = new o2(this.f502b, this.f503c, 1);
                if (!v1.i1.a()) {
                    com.braze.h2.a("Magnifier is only supported on API level 28 and higher.");
                }
                break;
            case 1:
                z5.h hVar = (z5.h) obj;
                float fB = z5.h.b(hVar.f47279a);
                z5.c cVar = this.f502b;
                this.f503c.setValue(new z5.l((((long) cVar.q0(fB)) << 32) | (((long) cVar.q0(z5.h.a(hVar.f47279a))) & 4294967295L)));
                break;
            case 2:
                z5.h hVar2 = (z5.h) obj;
                float fB2 = z5.h.b(hVar2.f47279a);
                z5.c cVar2 = this.f502b;
                this.f503c.setValue(new z5.l((((long) cVar2.q0(fB2)) << 32) | (((long) cVar2.q0(z5.h.a(hVar2.f47279a))) & 4294967295L)));
                break;
            case 3:
                p2 p2Var2 = new p2(1, (Function0) obj);
                o2 o2Var2 = new o2(this.f502b, this.f503c, 2);
                if (!v1.i1.a()) {
                    com.braze.h2.a("Magnifier is only supported on API level 28 and higher.");
                }
                break;
            case 4:
                z4.z zVar = (z4.z) obj;
                zVar.getClass();
                float fO = this.f502b.O((int) (zVar.u() >> 32));
                m3.b1 b1Var = this.f503c;
                b1Var.setValue(new z5.f(Math.max(((z5.f) b1Var.getValue()).f47277a, fO)));
                break;
            case 5:
                z4.z zVar2 = (z4.z) obj;
                zVar2.getClass();
                float fO2 = this.f502b.O((int) (zVar2.u() >> 32));
                m3.b1 b1Var2 = this.f503c;
                b1Var2.setValue(new z5.f(Math.max(((z5.f) b1Var2.getValue()).f47277a, fO2)));
                break;
            case 6:
                z4.z zVar3 = (z4.z) obj;
                zVar3.getClass();
                this.f503c.setValue(new z5.f(this.f502b.O((int) (zVar3.u() & 4294967295L))));
                break;
            case 7:
                float f11 = lv.t.f28255i;
                z4.z zVar4 = (z4.z) obj;
                zVar4.getClass();
                this.f503c.setValue(new z5.f(this.f502b.O((int) (zVar4.u() & 4294967295L)) + f11));
                break;
            case 8:
                z4.z zVar5 = (z4.z) obj;
                zVar5.getClass();
                this.f503c.setValue(new z5.f(this.f502b.O((int) (zVar5.u() & 4294967295L))));
                break;
            default:
                z4.z zVar6 = (z4.z) obj;
                zVar6.getClass();
                this.f503c.setValue(new z5.f(this.f502b.O((int) (zVar6.u() & 4294967295L))));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ o2(z5.c cVar, m3.b1 b1Var, int i11) {
        this.f501a = i11;
        this.f502b = cVar;
        this.f503c = b1Var;
    }
}
