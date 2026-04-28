package qw;

import com.braze.managers.s;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f37286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f37288d;

    public /* synthetic */ f(int i11, long j9, long j11, long j12) {
        this.f37285a = i11;
        this.f37286b = j9;
        this.f37287c = j11;
        this.f37288d = j12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f37285a;
        long j9 = this.f37287c;
        long j11 = this.f37288d;
        long j12 = this.f37286b;
        switch (i11) {
            case 0:
                return com.braze.triggers.managers.c.a(j12, j9, j11);
            default:
                return s.a(j12, j9, j11);
        }
    }
}
