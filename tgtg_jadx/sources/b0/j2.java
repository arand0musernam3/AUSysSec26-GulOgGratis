package b0;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import g3.ea;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f5256k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(mp.c cVar, boolean z11, x70.c cVar2) {
        super(2, cVar2);
        this.f5255j = 5;
        this.l = cVar;
        this.f5256k = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5255j) {
            case 0:
                return new j2(cVar, (l2) this.l, this.f5256k);
            case 1:
                j2 j2Var = new j2(this.f5256k, cVar);
                j2Var.l = obj;
                return j2Var;
            case 2:
                return new j2(this.f5256k, (Function0) this.l, cVar);
            case 3:
                j2 j2Var2 = new j2((ea) this.l, cVar, 3);
                j2Var2.f5256k = ((Boolean) obj).booleanValue();
                return j2Var2;
            case 4:
                j2 j2Var3 = new j2((Context) this.l, cVar, 4);
                j2Var3.f5256k = ((Boolean) obj).booleanValue();
                return j2Var3;
            default:
                return new j2((mp.c) this.l, this.f5256k, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5255j) {
            case 0:
                return ((j2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((j2) create((h8.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((j2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((j2) create(bool, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((j2) create(bool2, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((j2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        g1.j jVar;
        switch (this.f5255j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (!((l2) this.l).f5299h.b()) {
                    i0.b bVarA = ((l2) this.l).f5292a.a();
                    boolean z11 = this.f5256k;
                    f0.p0 p0Var = (f0.p0) bVarA.f22582e;
                    synchronized (p0Var.f16829q) {
                        p0Var.f16830r = z11;
                    }
                } else if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
                }
                return Unit.f26487a;
            case 1:
                h8.a aVar2 = (h8.a) this.l;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h8.e eVar = ft.s.f17964b;
                aVar2.f(ft.s.f17964b, Boolean.valueOf(this.f5256k));
                return Unit.f26487a;
            case 2:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (this.f5256k) {
                    ((Function0) this.l).invoke();
                }
                return Unit.f26487a;
            case 3:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (!this.f5256k) {
                    ((ea) this.l).a();
                }
                return Unit.f26487a;
            case 4:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                rb.i.a((Context) this.l, RescheduleReceiver.class, this.f5256k);
                return Unit.f26487a;
            default:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mp.c cVar = (mp.c) this.l;
                boolean z12 = this.f5256k;
                m0.j0 j0Var = cVar.f30070e;
                int i11 = z12 ? 1 : 2;
                j0Var.getClass();
                wd.a.p("ImageCapture", "setFlashMode: flashMode = " + i11);
                if (i11 != 1 && i11 != 2) {
                    i4.a.f(j4.s.f(i11, "Invalid flash mode: "));
                    return null;
                }
                synchronized (j0Var.f28537s) {
                    j0Var.f28539u = i11;
                    j0Var.I();
                    break;
                }
                i1.b bVar = cVar.f30071f;
                if (bVar != null && (jVar = bVar.f22758c.f44540a.f38312c) != null) {
                    jVar.e(z12);
                }
                return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5255j = i11;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(x70.c cVar, l2 l2Var, boolean z11) {
        super(2, cVar);
        this.f5255j = 0;
        this.l = l2Var;
        this.f5256k = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(boolean z11, Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.f5255j = 2;
        this.f5256k = z11;
        this.l = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f5255j = 1;
        this.f5256k = z11;
    }
}
