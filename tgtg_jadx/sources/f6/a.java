package f6;

import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17368a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f17369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, float f11) {
        super(new z5.f(f11));
        this.f17369b = cVar;
    }

    @Override // k80.b
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        j6.c cVarA;
        switch (this.f17368a) {
            case 0:
                o oVar = (o) obj2;
                j6.f fVar = this.f17369b.f17374b;
                String name = kProperty.getName();
                oVar.getClass();
                p pVar = oVar.f17416a;
                p pVar2 = oVar.f17418c;
                String str = pVar2.f17420b;
                p pVar3 = oVar.f17417b;
                String str2 = pVar3.f17420b;
                if (str2 == null && str == null) {
                    cVarA = pVar.a();
                } else {
                    j6.f fVar2 = new j6.f(new char[0]);
                    if (str2 != null) {
                        fVar2.A("min", pVar3.a());
                    }
                    if (str != null) {
                        fVar2.A("max", pVar2.a());
                    }
                    fVar2.A("value", pVar.a());
                    cVarA = fVar2;
                }
                fVar.A(name, cVarA);
                break;
            default:
                float f11 = ((z5.f) obj).f47277a;
                float f12 = ((z5.f) obj2).f47277a;
                if (!Float.isNaN(f12)) {
                    this.f17369b.f17374b.A(kProperty.getName(), new j6.e(f12));
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, o oVar) {
        super(oVar);
        this.f17369b = cVar;
    }
}
