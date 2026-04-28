package bm;

import com.app.tgtg.feature.logincharity.ui.model.Country;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.b1;
import r5.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f6366c;

    public /* synthetic */ k(b1 b1Var, Function1 function1) {
        this.f6364a = 5;
        this.f6366c = b1Var;
        this.f6365b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6364a) {
            case 0:
                this.f6365b.invoke(cv.i.CHARITY_LOGIN_DIDNT_RECEIVE_EMAIL);
                this.f6366c.setValue(Boolean.TRUE);
                break;
            case 1:
                this.f6365b.invoke(Boolean.TRUE);
                this.f6366c.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f6366c.setValue(Boolean.FALSE);
                this.f6365b.invoke(cl.a.f8442d);
                break;
            case 3:
                this.f6366c.setValue(Boolean.FALSE);
                this.f6365b.invoke(cl.a.f8440b);
                break;
            case 4:
                this.f6365b.invoke(((y) this.f6366c.getValue()).f37714a.f29538b);
                break;
            default:
                Country country = (Country) this.f6366c.getValue();
                if (country != null) {
                    this.f6365b.invoke(country);
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ k(Function1 function1, b1 b1Var, int i11) {
        this.f6364a = i11;
        this.f6365b = function1;
        this.f6366c = b1Var;
    }
}
