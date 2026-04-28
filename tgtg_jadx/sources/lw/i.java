package lw;

import com.braze.storage.a0;
import com.braze.storage.f0;
import com.braze.storage.u;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h8.e f28316b;

    public /* synthetic */ i(h8.e eVar, int i11) {
        this.f28315a = i11;
        this.f28316b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28315a) {
            case 0:
                return a0.a(this.f28316b);
            case 1:
                return f0.a(this.f28316b);
            default:
                return u.a(this.f28316b);
        }
    }
}
