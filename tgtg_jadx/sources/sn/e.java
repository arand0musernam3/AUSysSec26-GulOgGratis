package sn;

import b2.l;
import b4.t;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import i80.n;
import kotlin.jvm.functions.Function0;
import m3.b1;
import m3.m;
import m3.s;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileFeatureState f39065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f39066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f39067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f39068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f39069f;

    public e(boolean z11, ProfileFeatureState profileFeatureState, Function0 function0, b1 b1Var, b1 b1Var2, b1 b1Var3) {
        this.f39064a = z11;
        this.f39065b = profileFeatureState;
        this.f39066c = function0;
        this.f39067d = b1Var;
        this.f39068e = b1Var2;
        this.f39069f = b1Var3;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        ((Number) obj3).intValue();
        tVar.getClass();
        s sVar = (s) ((m3.n) obj2);
        sVar.a0(1702118549);
        Object objM = sVar.M();
        if (objM == m.f29332a) {
            objM = a0.g(sVar);
        }
        t tVarB = androidx.compose.foundation.b.b(tVar, (l) objM, null, false, null, null, new d(this.f39064a, this.f39065b, this.f39066c, this.f39067d, this.f39068e, this.f39069f), 28);
        sVar.q(false);
        return tVarB;
    }
}
