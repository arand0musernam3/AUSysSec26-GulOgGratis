package dp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f6.d f15067b;

    public /* synthetic */ f(f6.d dVar, int i11) {
        this.f15066a = i11;
        this.f15067b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15066a) {
            case 0:
                f6.c cVar = (f6.c) obj;
                cVar.getClass();
                f6.e eVar = cVar.f17377e;
                f6.d dVar = cVar.f17375c;
                f6.e.a(eVar, dVar.f17385d);
                f6.e.a(cVar.f17379g, this.f15067b.f17385d);
                f6.e.b(cVar.f17376d, dVar.f17384c, 0.0f, 6);
                f6.e.b(cVar.f17378f, dVar.f17386e, 0.0f, 6);
                cVar.f17381i.setValue(cVar, f6.c.f17372j[0], new f6.o("spread"));
                break;
            case 1:
                f6.c cVar2 = (f6.c) obj;
                cVar2.getClass();
                f6.e eVar2 = cVar2.f17377e;
                f6.d dVar2 = cVar2.f17375c;
                f6.e.a(eVar2, dVar2.f17385d);
                f6.e.a(cVar2.f17379g, this.f15067b.f17385d);
                f6.e.b(cVar2.f17376d, dVar2.f17384c, 0.0f, 6);
                f6.e.b(cVar2.f17378f, dVar2.f17386e, 0.0f, 6);
                cVar2.f17381i.setValue(cVar2, f6.c.f17372j[0], new f6.o("spread"));
                break;
            case 2:
                f6.c cVar3 = (f6.c) obj;
                cVar3.getClass();
                f6.e eVar3 = cVar3.f17376d;
                f6.d dVar3 = this.f15067b;
                f6.e.b(eVar3, dVar3.f17386e, 4, 4);
                se.d dVar4 = cVar3.f17380h;
                f6.f fVar = dVar3.f17388g;
                float f11 = 0;
                dVar4.getClass();
                j6.a aVar = new j6.a(new char[0]);
                aVar.j(j6.g.j(fVar.f17391a.toString()));
                aVar.j(j6.g.j("baseline"));
                aVar.j(new j6.e(f11));
                aVar.j(new j6.e(f11));
                ((j6.f) dVar4.f39013b).A("baseline", aVar);
                break;
            case 3:
                f6.c cVar4 = (f6.c) obj;
                cVar4.getClass();
                f6.e eVar4 = cVar4.f17377e;
                f6.d dVar5 = cVar4.f17375c;
                f6.e.a(eVar4, dVar5.f17385d);
                f6.e.a(cVar4.f17379g, this.f15067b.f17385d);
                f6.e.b(cVar4.f17376d, dVar5.f17384c, 0.0f, 6);
                f6.e.b(cVar4.f17378f, dVar5.f17386e, 0.0f, 6);
                cVar4.f17381i.setValue(cVar4, f6.c.f17372j[0], new f6.o("spread"));
                break;
            default:
                f6.c cVar5 = (f6.c) obj;
                cVar5.getClass();
                f6.e eVar5 = cVar5.f17377e;
                f6.d dVar6 = cVar5.f17375c;
                f6.e.a(eVar5, dVar6.f17385d);
                f6.e.a(cVar5.f17379g, this.f15067b.f17385d);
                f6.e.b(cVar5.f17376d, dVar6.f17384c, 0.0f, 6);
                f6.e.b(cVar5.f17378f, dVar6.f17386e, 0.0f, 6);
                cVar5.f17381i.setValue(cVar5, f6.c.f17372j[0], new f6.o("spread"));
                break;
        }
        return Unit.f26487a;
    }
}
