package fw;

import com.braze.models.response.g;
import com.braze.requests.framework.f;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f17970b;

    public /* synthetic */ a(g gVar, int i11) {
        this.f17969a = i11;
        this.f17970b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17969a) {
            case 0:
                return g.a(this.f17970b);
            case 1:
                return g.b(this.f17970b);
            default:
                return f.b(this.f17970b);
        }
    }
}
