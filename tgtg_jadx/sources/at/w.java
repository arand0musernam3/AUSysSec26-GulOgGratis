package at;

import a3.w1;
import kotlin.Unit;
import y80.d1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4817c;

    public /* synthetic */ w(int i11, Object obj, Object obj2) {
        this.f4815a = i11;
        this.f4817c = obj;
        this.f4816b = obj2;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) {
        switch (this.f4815a) {
            case 0:
                Object objCollect = ((al.a0) this.f4817c).collect(new k(jVar, (b0) this.f4816b, 3), cVar);
                if (objCollect != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((al.a0) this.f4817c).collect(new k(jVar, (b0) this.f4816b, 4), cVar);
                if (objCollect2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((al.a0) this.f4817c).collect(new k(jVar, (b0) this.f4816b, 5), cVar);
                if (objCollect3 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((o) this.f4817c).collect(new w1(1, jVar, (bs.o) this.f4816b), cVar);
                if (objCollect4 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((y80.i) this.f4817c).collect(new al.z(jVar, (ft.s) this.f4816b, 17), cVar);
                if (objCollect5 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((aa.n) this.f4817c).collect(new al.z(jVar, (hm.v) this.f4816b, 21), cVar);
                if (objCollect6 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((y80.i) this.f4817c).collect(new w1(6, jVar, (i3.a0) this.f4816b), cVar);
                if (objCollect7 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((al.a0) this.f4817c).collect(new lh.l(jVar, (lh.w) this.f4816b, 1), cVar);
                if (objCollect8 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((y80.i) this.f4817c).collect(new lh.l(jVar, (lh.w) this.f4816b, 3), cVar);
                if (objCollect9 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((o) this.f4817c).collect(new w1(15, jVar, (ss.w) this.f4816b), cVar);
                if (objCollect10 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objA = z80.b.a(new a70.b((x70.c) null, (cj.l) this.f4816b), d1.f45465a, cVar, jVar, (y80.i[]) this.f4817c);
                if (objA != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect11 = ((o) this.f4817c).collect(new w1(19, jVar, (zp.g) this.f4816b), cVar);
                if (objCollect11 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
