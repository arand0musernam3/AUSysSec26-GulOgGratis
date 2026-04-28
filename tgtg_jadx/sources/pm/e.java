package pm;

import com.google.firebase.messaging.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.h1;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f35502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f35503k;
    public final /* synthetic */ h1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h1 f35504m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a0 a0Var, float f11, h1 h1Var, h1 h1Var2, x70.c cVar) {
        super(2, cVar);
        this.f35502j = a0Var;
        this.f35503k = f11;
        this.l = h1Var;
        this.f35504m = h1Var2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new e(this.f35502j, this.f35503k, this.l, this.f35504m, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        if (this.l.h() > 0 && this.f35504m.h() > 0) {
            a0 a0Var = this.f35502j;
            if (a0Var.I() != j.Hidden) {
                float fH = ((z1.r) a0Var.f12782e).f46655j.h();
                if (Float.isNaN(fH)) {
                    return Unit.f26487a;
                }
                ((Function1) a0Var.f12781d).invoke(Boolean.valueOf(fH <= this.f35503k));
            }
        }
        return Unit.f26487a;
    }
}
