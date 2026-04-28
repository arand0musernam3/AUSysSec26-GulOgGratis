package at;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4806k;
    public final /* synthetic */ b0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(b0 b0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f4805j = i11;
        this.l = b0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f4805j) {
            case 0:
                r rVar = new r(this.l, cVar, 0);
                rVar.f4806k = obj;
                return rVar;
            case 1:
                r rVar2 = new r(this.l, cVar, 1);
                rVar2.f4806k = obj;
                return rVar2;
            default:
                r rVar3 = new r(this.l, cVar, 2);
                rVar3.f4806k = obj;
                return rVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4805j) {
            case 0:
                return ((r) create((d) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((r) create((e) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((r) create((h0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4805j;
        b0 b0Var = this.l;
        switch (i11) {
            case 0:
                d dVar = (d) this.f4806k;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b0Var.f4761a.a(dVar.f4770j);
                break;
            case 1:
                e eVar = (e) this.f4806k;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                c0 c0Var = b0Var.f4761a;
                Uri uri = eVar.f4772j;
                c0Var.getClass();
                uri.getClass();
                c0Var.f4769a.a(new f70.n(uri));
                break;
            default:
                h0 h0Var = (h0) this.f4806k;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b0Var.f4763c.j(h0Var);
                break;
        }
        return Unit.f26487a;
    }
}
