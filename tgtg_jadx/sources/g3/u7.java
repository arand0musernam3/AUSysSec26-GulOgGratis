package g3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.r f19587a;

    public u7(v7 v7Var, z5.c cVar, Function1 function1, Function1 function12) {
        t1.u1 u1Var = z1.a.f46388a;
        t1.s sVar = z1.a.f46390c;
        t7 t7Var = new t7(cVar, 0);
        z1.r rVar = new z1.r(v7Var, function1);
        rVar.f46647b = function12;
        rVar.f46648c = t7Var;
        rVar.f46649d = u1Var;
        rVar.f46650e = sVar;
        this.f19587a = rVar;
    }

    public final v7 a() {
        z1.r rVar = this.f19587a;
        return (rVar.f46655j.h() == 0.0f || Float.isNaN(rVar.f46655j.h())) ? v7.Settled : rVar.f46655j.h() > 0.0f ? v7.StartToEnd : v7.EndToStart;
    }
}
