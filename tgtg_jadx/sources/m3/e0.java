package m3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29266b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29267c;

    public e0(Function1 function1) {
        super(new lw.p(26));
        this.f29267c = new f0(function1);
    }

    @Override // m3.u1
    public final v1 a(Object obj) {
        switch (this.f29266b) {
            case 0:
                return new v1(this, obj, obj == null, null, true);
            default:
                return new v1(this, obj, obj == null, (v2) this.f29267c, true);
        }
    }

    @Override // m3.u1
    public f3 b() {
        switch (this.f29266b) {
            case 0:
                return (f0) this.f29267c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Function0 function0) {
        super(function0);
        f fVar = f.f29275g;
        this.f29267c = fVar;
    }
}
