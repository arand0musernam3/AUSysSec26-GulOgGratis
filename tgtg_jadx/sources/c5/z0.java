package c5;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7481j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i11, x70.c cVar, int i12) {
        super(i11, cVar);
        this.f7481j = i12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f7481j) {
            case 0:
                return new z0(2, cVar, 0);
            case 1:
                return new z0(2, cVar, 1);
            case 2:
                return new z0(2, cVar, 2);
            case 3:
                return new z0(2, cVar, 3);
            case 4:
                return new z0(2, cVar, 4);
            case 5:
                return new z0(2, cVar, 5);
            case 6:
                return new z0(2, cVar, 6);
            case 7:
                return new z0(2, cVar, 7);
            case 8:
                return new z0(2, cVar, 8);
            case 9:
                return new z0(2, cVar, 9);
            case 10:
                return new z0(2, cVar, 10);
            case 11:
                return new z0(2, cVar, 11);
            case 12:
                return new z0(2, cVar, 12);
            default:
                return new z0(2, cVar, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7481j) {
            case 0:
                return ((z0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((z0) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((z0) create((y80.i) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                ((z0) create(obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
                return Boolean.TRUE;
            case 4:
                return ((z0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((z0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                if (obj == null) {
                    return ((z0) create(null, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
                }
                org.bouncycastle.jce.provider.a.c();
                return null;
            case 7:
                if (obj == null) {
                    return ((z0) create(null, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
                }
                org.bouncycastle.jce.provider.a.c();
                return null;
            case 8:
                if (obj == null) {
                    return ((z0) create(null, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
                }
                org.bouncycastle.jce.provider.a.c();
                return null;
            case 9:
                return ((z0) create((xg.a) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((z0) create((xg.c) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((z0) create((xg.d) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((z0) create((xg.e) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((z0) create((z1.q2) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7481j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mv.m0 m0Var = sa0.a.f38953a;
                m0Var.h("Authentication");
                m0Var.a("Cancel", new Object[0]);
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mv.m0 m0Var2 = sa0.a.f38953a;
                m0Var2.h("Authentication");
                m0Var2.a("Continue as Charity", new Object[0]);
                break;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mv.m0 m0Var3 = sa0.a.f38953a;
                m0Var3.h("Authentication");
                m0Var3.a("Continue as Store", new Object[0]);
                break;
            case 9:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mv.m0 m0Var4 = sa0.a.f38953a;
                m0Var4.h("Authentication");
                m0Var4.a("Continue Other", new Object[0]);
                break;
            case 10:
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mv.m0 m0Var5 = sa0.a.f38953a;
                m0Var5.h("Authentication");
                m0Var5.a("Continue with Facebook", new Object[0]);
                break;
            case 11:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mv.m0 m0Var6 = sa0.a.f38953a;
                m0Var6.h("Authentication");
                m0Var6.a("Continue with Google", new Object[0]);
                break;
            case 12:
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mv.m0 m0Var7 = sa0.a.f38953a;
                m0Var7.h("Authentication");
                m0Var7.a("Show Server List", new Object[0]);
                break;
            default:
                y70.a aVar14 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
        }
        return Unit.f26487a;
    }
}
