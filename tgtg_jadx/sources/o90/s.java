package o90;

import com.braze.h2;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends z70.h implements i80.n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32196k;
    public /* synthetic */ u70.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b20.b f32197m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b20.b bVar, x70.c cVar) {
        super(3, cVar);
        this.f32197m = bVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s sVar = new s(this.f32197m, (x70.c) obj3);
        sVar.l = (u70.b) obj;
        return sVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        b20.b bVar = this.f32197m;
        i0.w wVar = (i0.w) bVar.f5569c;
        u70.b bVar2 = this.l;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f32196k;
        if (i11 == 0) {
            ba0.g.M(obj);
            byte bC = wVar.C();
            if (bC == 1) {
                return bVar.g(true);
            }
            if (bC == 0) {
                return bVar.g(false);
            }
            if (bC != 6) {
                if (bC == 8) {
                    return bVar.f();
                }
                i0.w.t(wVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.l = null;
            this.f32196k = 1;
            obj = b20.b.d(bVar, bVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return (n90.n) obj;
    }
}
