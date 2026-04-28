package s1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f38605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f38606c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38607a;

    static {
        int i11 = 2;
        f38605b = new h(i11, 0);
        f38606c = new h(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i11, int i12) {
        super(i11);
        this.f38607a = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38607a) {
            case 0:
                long j9 = ((z5.l) obj).f47286a;
                long j11 = ((z5.l) obj2).f47286a;
                long j12 = 1;
                return t1.c.j(0.0f, 400.0f, new z5.l((j12 & 4294967295L) | (j12 << 32)), 1);
            default:
                h0 h0Var = (h0) obj2;
                return Boolean.valueOf(((h0) obj) == h0Var && h0Var == h0.PostExit);
        }
    }
}
