package m3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kotlin.coroutines.f, v2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0.i1 f29270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f f29271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f29272d = new f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f29273e = new f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f29274f = new f(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f29275g = new f(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29276a;

    static {
        int i11 = 1;
        f29270b = new m0.i1(i11);
        f29271c = new f(i11);
    }

    public /* synthetic */ f(int i11) {
        this.f29276a = i11;
    }

    @Override // m3.v2
    public boolean a(Object obj, Object obj2) {
        switch (this.f29276a) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return Intrinsics.areEqual(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f29276a) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
