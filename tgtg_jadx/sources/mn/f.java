package mn;

import al.a0;
import android.content.SharedPreferences;
import com.braze.h2;
import hp.e1;
import jp.q;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u70.o;
import u70.p;
import v80.b0;
import v80.f0;
import y80.a2;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f30008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30009k;
    public final /* synthetic */ l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(l lVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f30008j = i11;
        this.l = lVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f30008j) {
            case 0:
                return new f(this.l, cVar, 0);
            case 1:
                return new f(this.l, cVar, 1);
            case 2:
                return new f(this.l, cVar, 2);
            case 3:
                return new f(this.l, cVar, 3);
            case 4:
                return new f(this.l, cVar, 4);
            case 5:
                return new f(this.l, cVar, 5);
            case 6:
                return new f(this.l, cVar, 6);
            default:
                return new f(this.l, cVar, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f30008j) {
        }
        return ((f) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objK;
        int i11 = this.f30008j;
        int i12 = 2;
        l lVar = this.l;
        kn.c cVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i11) {
            case 0:
                a2 a2Var = lVar.D;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f30009k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    q qVar = lVar.f30022d;
                    this.f30009k = 1;
                    objK = qVar.k(this);
                    if (objK == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objK = ((u70.q) obj).f40851a;
                }
                o oVar = u70.q.f40850b;
                if (!(objK instanceof p)) {
                    boolean zIsEmpty = ((e1) objK).f22271b.isEmpty();
                    Boolean boolValueOf = Boolean.valueOf(!zIsEmpty);
                    a2Var.getClass();
                    a2Var.k(null, boolValueOf);
                    dv.d dVar = !((Boolean) f0.E(kotlin.coroutines.g.f26549a, new f(lVar, objArr == true ? 1 : 0, 4))).booleanValue() ? dv.d.NEW_USER : !zIsEmpty ? dv.d.RETURNING_USER_HAS_SAVED : dv.d.RETURNING_USER;
                    cv.i iVar = cv.i.SCREEN_FRIDGE_BANNER;
                    dv.a aVar2 = dv.a.SCREEN_NAME;
                    dv.d dVar2 = dv.d.SCREEN_MENU;
                    dv.b bVarE = h0.g.E(new Pair(aVar2, new dv.c(dVar2 != null ? dVar2.a() : null)), new Pair(dv.a.BANNER_TYPE, new dv.c(dVar != null ? dVar.a() : null)));
                    iVar.getClass();
                    lVar.f30024f.c(iVar, bVarE);
                }
                if (u70.q.a(objK) != null) {
                    Boolean bool = Boolean.FALSE;
                    a2Var.getClass();
                    a2Var.k(null, bool);
                }
                return Unit.f26487a;
            case 1:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f30009k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    ln.i iVar2 = lVar.f30020b;
                    this.f30009k = 1;
                    if (iVar2.b(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    ((u70.q) obj).getClass();
                }
                return Unit.f26487a;
            case 2:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f30009k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    a2 a2Var2 = lVar.f30033p;
                    lVar.f30019a.getClass();
                    SharedPreferences sharedPreferencesX = ft.c.x();
                    String strY = ft.c.y();
                    if (strY == null) {
                        strY = null;
                    }
                    String string = sharedPreferencesX.getString(strY + "_profileAvatarDesign", "");
                    string.getClass();
                    if (string.length() > 0) {
                        kn.b bVar = kn.c.Companion;
                        bVar.getClass();
                        cVar = (kn.c) kn.c.f26469d.b(bVar.serializer(), string);
                    }
                    this.f30009k = 1;
                    a2Var2.j(cVar);
                    if (Unit.f26487a == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 3:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f30009k;
                if (i16 == 0) {
                    ba0.g.M(obj);
                    a2 a2Var3 = lVar.f30035r;
                    String name = lVar.f30019a.m().getName();
                    this.f30009k = 1;
                    a2Var3.j(name);
                    if (Unit.f26487a == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 4:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f30009k;
                if (i17 == 0) {
                    ba0.g.M(obj);
                    a0 a0Var = new a0(lVar.f30029k.getData(), 29);
                    this.f30009k = 1;
                    obj = r.r(a0Var, this);
                    if (obj == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i17 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                Boolean bool2 = (Boolean) obj;
                return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
            case 5:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f30009k;
                if (i18 == 0) {
                    ba0.g.M(obj);
                    d8.f fVar = lVar.f30029k;
                    bm.o oVar2 = new bm.o(i12, objArr2 == true ? 1 : 0, 22);
                    this.f30009k = 1;
                    if (xz.b.r(fVar, oVar2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i18 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 6:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f30009k;
                if (i19 == 0) {
                    ba0.g.M(obj);
                    j jVar = new j(lVar.f30029k.getData(), 0);
                    this.f30009k = 1;
                    obj = r.r(jVar, this);
                    if (obj == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i19 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Boolean.valueOf(Intrinsics.areEqual(obj, Boolean.TRUE));
            default:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i21 = this.f30009k;
                if (i21 == 0) {
                    ba0.g.M(obj);
                    d8.f fVar2 = lVar.f30029k;
                    bm.o oVar3 = new bm.o(i12, objArr3 == true ? 1 : 0, 23);
                    this.f30009k = 1;
                    if (xz.b.r(fVar2, oVar3, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i21 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
        }
    }
}
