package iw;

import com.braze.events.internal.o;
import com.braze.managers.g0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f24223b;

    public /* synthetic */ f(o oVar, int i11) {
        this.f24222a = i11;
        this.f24223b = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24222a) {
            case 0:
                return com.braze.requests.framework.g.a(this.f24223b);
            default:
                return g0.a(this.f24223b);
        }
    }
}
