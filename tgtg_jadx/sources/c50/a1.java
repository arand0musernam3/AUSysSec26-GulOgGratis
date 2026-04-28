package c50;

import android.util.Log;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7495k;
    public final /* synthetic */ f1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(f1 f1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f7494j = i11;
        this.l = f1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f7494j) {
            case 0:
                return new a1(this.l, cVar, 0);
            default:
                return new a1(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f7494j) {
        }
        return ((a1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7494j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f7495k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    f1 f1Var = this.l;
                    y80.w wVar = new y80.w(f1Var.f7537e.getData(), new a70.b(f1Var, null, 1));
                    androidx.lifecycle.m mVar = new androidx.lifecycle.m(f1Var, 4);
                    this.f7495k = 1;
                    if (wVar.collect(mVar, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f7495k;
                x70.c cVar = null;
                f1 f1Var2 = this.l;
                try {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            h2.b("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ba0.g.M(obj);
                        }
                        break;
                    } else {
                        ba0.g.M(obj);
                        d8.f fVar = f1Var2.f7537e;
                        d1 d1Var = new d1(f1Var2, cVar, 0);
                        this.f7495k = 1;
                        if (fVar.a(d1Var, this) == aVar2) {
                        }
                    }
                } catch (Exception e5) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e5.getMessage());
                    l0 l0Var = f1Var2.f7540h;
                    if (l0Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("localSessionData");
                        l0Var = null;
                    }
                    f1Var2.f7536d.getClass();
                    f1Var2.f7540h = l0.a(l0Var, null, k1.a(), null, 5);
                }
                break;
        }
        return Unit.f26487a;
    }
}
