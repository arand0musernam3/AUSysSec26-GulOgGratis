package bg;

import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.braze.Braze;
import g3.q1;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m3.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6121d;

    public /* synthetic */ b(Object obj, Object obj2, boolean z11, int i11) {
        this.f6118a = i11;
        this.f6120c = obj;
        this.f6121d = obj2;
        this.f6119b = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6118a) {
            case 0:
                Function0 function0 = (Function0) this.f6120c;
                Function0 function02 = (Function0) this.f6121d;
                if (this.f6119b) {
                    function0.invoke();
                } else {
                    function02.invoke();
                }
                return Unit.f26487a;
            case 1:
                h1 h1Var = (h1) this.f6120c;
                Function1 function1 = (Function1) this.f6121d;
                if (this.f6119b) {
                    h1Var.i(h1Var.h() + 1);
                    if (function1 != null) {
                        function1.invoke(1);
                    }
                } else if (function1 != null) {
                    function1.invoke(-749);
                }
                return Unit.f26487a;
            case 2:
                return Braze.isEphemeralEventKey$lambda$211((String) this.f6120c, (Set) this.f6121d, this.f6119b);
            case 3:
                return Braze.setGoogleAdvertisingId$lambda$156((Braze) this.f6120c, (String) this.f6121d, this.f6119b);
            case 4:
                return com.braze.models.outgoing.event.a.b((Throwable) this.f6120c, (com.braze.models.q) this.f6121d, this.f6119b);
            case 5:
                m3.b1 b1Var = (m3.b1) this.f6120c;
                Function1 function12 = (Function1) this.f6121d;
                b1Var.setValue(new q1());
                function12.invoke(Boolean.valueOf(!this.f6119b));
                return Unit.f26487a;
            case 6:
                BasketResponse basketResponse = (BasketResponse) this.f6120c;
                um.u uVar = (um.u) this.f6121d;
                if (this.f6119b && basketResponse.getCanCheckout()) {
                    uVar.c();
                }
                return Unit.f26487a;
            default:
                return com.braze.managers.g0.a(this.f6119b, (String) this.f6120c, (String) this.f6121d);
        }
    }

    public /* synthetic */ b(boolean z11, Object obj, Object obj2, int i11) {
        this.f6118a = i11;
        this.f6119b = z11;
        this.f6120c = obj;
        this.f6121d = obj2;
    }
}
