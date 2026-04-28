package hw;

import com.braze.requests.w;
import com.braze.requests.x;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.models.response.d f22552b;

    public /* synthetic */ d(com.braze.models.response.d dVar, int i11) {
        this.f22551a = i11;
        this.f22552b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22551a) {
            case 0:
                return com.braze.requests.e.b(this.f22552b);
            case 1:
                return w.a(this.f22552b);
            default:
                return x.a(this.f22552b);
        }
    }
}
