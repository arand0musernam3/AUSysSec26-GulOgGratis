package sn;

import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileFeatureState f39059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f39060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f39061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f39062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f39063f;

    public d(boolean z11, ProfileFeatureState profileFeatureState, Function0 function0, b1 b1Var, b1 b1Var2, b1 b1Var3) {
        this.f39058a = z11;
        this.f39059b = profileFeatureState;
        this.f39060c = function0;
        this.f39061d = b1Var;
        this.f39062e = b1Var2;
        this.f39063f = b1Var3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f39061d.setValue(Boolean.FALSE);
        this.f39062e.setValue(Boolean.TRUE);
        this.f39063f.setValue(Boolean.valueOf(this.f39058a || this.f39059b == ProfileFeatureState.CLOSE_TO_EXPIRE));
        this.f39060c.invoke();
        return Unit.f26487a;
    }
}
