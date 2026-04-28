package sn;

import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f39071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProfileFeature f39072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f39073d;

    public /* synthetic */ g(Function1 function1, ProfileFeature profileFeature, b1 b1Var, int i11) {
        this.f39070a = i11;
        this.f39071b = function1;
        this.f39072c = profileFeature;
        this.f39073d = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39070a) {
            case 0:
                this.f39071b.invoke(this.f39072c.getFeatureState());
                this.f39073d.setValue(Boolean.TRUE);
                break;
            default:
                this.f39071b.invoke(this.f39072c.getFeatureState());
                this.f39073d.setValue(Boolean.TRUE);
                break;
        }
        return Unit.f26487a;
    }
}
