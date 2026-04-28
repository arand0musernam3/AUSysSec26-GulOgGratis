package dp;

import j5.b0;
import j5.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f15077b = new i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f15078c = new i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f15079d = new i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f15080e = new i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f15081f = new i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f15082g = new i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f15083h = new i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15084a;

    public /* synthetic */ i(int i11) {
        this.f15084a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15084a) {
            case 0:
                f6.c cVar = (f6.c) obj;
                cVar.getClass();
                f6.e eVar = cVar.f17379g;
                f6.d dVar = cVar.f17375c;
                f6.e.a(eVar, dVar.f17387f);
                f6.e.b(cVar.f17376d, dVar.f17384c, 0.0f, 6);
                f6.e.b(cVar.f17378f, dVar.f17386e, 0.0f, 6);
                cVar.a();
                break;
            case 1:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                z.r(b0Var, -1.0f);
                z.k(b0Var, 0);
                break;
            case 2:
                f6.c cVar2 = (f6.c) obj;
                cVar2.getClass();
                f6.e eVar2 = cVar2.f17376d;
                f6.d dVar2 = cVar2.f17375c;
                f6.e.b(eVar2, dVar2.f17384c, 0.0f, 6);
                f6.e.b(cVar2.f17378f, dVar2.f17386e, 0.0f, 6);
                break;
            case 3:
                k4.d dVar3 = (k4.d) obj;
                dVar3.getClass();
                float fC0 = dVar3.c0(2);
                float fC02 = dVar3.c0(4) + Float.intBitsToFloat((int) (dVar3.d() & 4294967295L));
                dVar3.H(lv.s.C, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fC02)) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fC02))) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar3.d() >> 32))) << 32), fC0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                break;
            case 4:
                f6.c cVar3 = (f6.c) obj;
                cVar3.getClass();
                f6.e eVar3 = cVar3.f17379g;
                f6.d dVar4 = cVar3.f17375c;
                f6.e.a(eVar3, dVar4.f17387f);
                f6.e.b(cVar3.f17376d, dVar4.f17384c, 0.0f, 6);
                f6.e.b(cVar3.f17378f, dVar4.f17386e, 0.0f, 6);
                cVar3.a();
                break;
            case 5:
                f6.c cVar4 = (f6.c) obj;
                cVar4.getClass();
                f6.e eVar4 = cVar4.f17379g;
                f6.d dVar5 = cVar4.f17375c;
                f6.e.a(eVar4, dVar5.f17387f);
                f6.e.b(cVar4.f17376d, dVar5.f17384c, 0.0f, 6);
                f6.e.b(cVar4.f17378f, dVar5.f17386e, 0.0f, 6);
                cVar4.a();
                break;
            default:
                f6.c cVar5 = (f6.c) obj;
                cVar5.getClass();
                f6.e eVar5 = cVar5.f17379g;
                f6.d dVar6 = cVar5.f17375c;
                f6.e.a(eVar5, dVar6.f17387f);
                f6.e.b(cVar5.f17376d, dVar6.f17384c, 0.0f, 6);
                f6.e.b(cVar5.f17378f, dVar6.f17386e, 0.0f, 6);
                cVar5.a();
                break;
        }
        return Unit.f26487a;
    }
}
