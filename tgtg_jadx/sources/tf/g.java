package tf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f40123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f40124c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40125a;

    static {
        int i11 = 1;
        f40123b = new g(i11, 0);
        f40124c = new g(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i11, int i12) {
        super(i11);
        this.f40125a = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40125a) {
            case 0:
                a aVar = (a) obj;
                aVar.getClass();
                return "config_keys=" + aVar.c();
            default:
                return Boolean.valueOf(!(((e) obj).f40121a.get() != null));
        }
    }
}
