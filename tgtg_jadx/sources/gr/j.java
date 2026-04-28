package gr;

import androidx.lifecycle.c1;
import ao.g3;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f20816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20817k;
    public final /* synthetic */ k l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f20816j = i11;
        this.l = kVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f20816j) {
            case 0:
                return new j(this.l, cVar, 0);
            case 1:
                return new j(this.l, cVar, 1);
            default:
                return new j(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f20816j) {
        }
        return ((j) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f20816j) {
            case 0:
                k kVar = this.l;
                c1 c1Var = kVar.f20818a;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f20817k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    g3 g3Var = kVar.f20819b;
                    String str = kVar.f20823f;
                    String str2 = kVar.f20824g;
                    Boolean bool = (Boolean) c1Var.a("IS_LOGGED_IN");
                    Boolean bool2 = (Boolean) c1Var.a("IS_FROM_DEEPLINK");
                    this.f20817k = 1;
                    if (g3Var.a(str, str2, bool, bool2, this) == aVar) {
                    }
                }
                break;
            case 1:
                k kVar2 = this.l;
                c1 c1Var2 = kVar2.f20818a;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f20817k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    g3 g3Var2 = kVar2.f20819b;
                    String str3 = kVar2.f20823f;
                    String str4 = kVar2.f20824g;
                    Boolean bool3 = (Boolean) c1Var2.a("IS_LOGGED_IN");
                    Boolean bool4 = (Boolean) c1Var2.a("IS_FROM_DEEPLINK");
                    this.f20817k = 1;
                    if (g3Var2.b(str3, str4, bool3, bool4, this) == aVar2) {
                    }
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f20817k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    k kVar3 = this.l;
                    g3 g3Var3 = kVar3.f20819b;
                    boolean zA = kVar3.f20821d.a();
                    this.f20817k = 1;
                    if (g3Var3.E(zA, this) == aVar3) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
