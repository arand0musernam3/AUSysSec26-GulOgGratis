package y9;

import android.database.SQLException;
import com.braze.h2;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f45690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45691k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p0 f45692m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(p0 p0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f45690j = i11;
        this.f45692m = p0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f45690j) {
            case 0:
                k0 k0Var = new k0(this.f45692m, cVar, 0);
                k0Var.l = obj;
                return k0Var;
            default:
                k0 k0Var2 = new k0(this.f45692m, cVar, 1);
                k0Var2.l = obj;
                return k0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45690j) {
            case 0:
                return ((k0) create((aa.o) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((k0) create((e0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        switch (this.f45690j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f45691k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                aa.o oVar = (aa.o) this.l;
                this.f45691k = 1;
                Object objA = p0.a(this.f45692m, oVar, this);
                return objA == aVar ? aVar : objA;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f45691k;
                try {
                    if (i12 == 0) {
                        ba0.g.M(obj);
                        e0Var = (e0) this.l;
                        this.l = e0Var;
                        this.f45691k = 1;
                        obj = e0Var.d(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                ba0.g.M(obj);
                                return (Set) obj;
                            }
                            h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        e0Var = (e0) this.l;
                        ba0.g.M(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return kotlin.collections.p0.f26531a;
                    }
                    d0 d0Var = d0.IMMEDIATE;
                    k0 k0Var = new k0(this.f45692m, null, 0);
                    this.l = null;
                    this.f45691k = 2;
                    obj = e0Var.a(d0Var, k0Var, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    return (Set) obj;
                } catch (SQLException unused) {
                    return kotlin.collections.p0.f26531a;
                }
        }
    }
}
