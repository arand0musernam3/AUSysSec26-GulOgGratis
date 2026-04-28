package qv;

import com.braze.communication.dust.i;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f37273b;

    public /* synthetic */ a(i iVar, int i11) {
        this.f37272a = i11;
        this.f37273b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37272a) {
            case 0:
                return i.c(this.f37273b);
            case 1:
                return i.d(this.f37273b);
            case 2:
                return i.a(this.f37273b);
            default:
                return i.b(this.f37273b);
        }
    }
}
