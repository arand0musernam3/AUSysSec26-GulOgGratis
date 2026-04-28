package t90;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39867e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f39868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Function0 function0) {
        super(str, true);
        this.f39868f = function0;
    }

    @Override // t90.a
    public final long a() {
        switch (this.f39867e) {
            case 0:
                this.f39868f.invoke();
                return -1L;
            default:
                return ((Number) this.f39868f.invoke()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Function0 function0, boolean z11) {
        super(str, z11);
        this.f39868f = function0;
    }
}
