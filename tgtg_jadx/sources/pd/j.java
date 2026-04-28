package pd;

import android.content.Context;
import fd.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements kd.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u70.t f34676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u70.t f34677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oz.m f34678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f34679d;

    public j(Function0 function0) {
        p9.a aVar = new p9.a(3);
        i iVar = i.f34675a;
        p9.a aVar2 = new p9.a(4);
        this.f34676a = u70.l.b(function0);
        this.f34677b = u70.l.b(aVar);
        oz.m mVar = new oz.m(8, false);
        mVar.f33836b = iVar;
        mVar.f33837c = qd.b.f36946a;
        this.f34678c = mVar;
        this.f34679d = u70.l.b(aVar2);
    }

    @Override // kd.h
    public final kd.i a(Object obj, td.o oVar, fd.t tVar) {
        z zVar = (z) obj;
        if (!Intrinsics.areEqual(zVar.f17606c, "http") && !Intrinsics.areEqual(zVar.f17606c, "https")) {
            return null;
        }
        String str = zVar.f17604a;
        u70.t tVar2 = this.f34676a;
        u70.t tVarB = u70.l.b(new b2(tVar, 11));
        u70.t tVar3 = this.f34677b;
        oz.m mVar = this.f34678c;
        Context context = oVar.f40030a;
        Object obj2 = mVar.f33837c;
        qd.b bVar = qd.b.f36946a;
        if (obj2 == bVar) {
            synchronized (mVar) {
                obj2 = mVar.f33837c;
                if (obj2 == bVar) {
                    Function1 function1 = (Function1) mVar.f33836b;
                    function1.getClass();
                    Object objInvoke = function1.invoke(context);
                    mVar.f33837c = objInvoke;
                    mVar.f33836b = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new o(str, oVar, tVar2, tVarB, tVar3, new u70.g(obj2), this.f34679d);
    }
}
