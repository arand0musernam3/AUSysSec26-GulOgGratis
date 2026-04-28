package fw;

import com.braze.models.response.m;
import com.braze.storage.i3;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f17973b;

    public /* synthetic */ c(m mVar, int i11) {
        this.f17972a = i11;
        this.f17973b = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17972a) {
            case 0:
                return m.a(this.f17973b);
            default:
                return i3.b(this.f17973b);
        }
    }
}
