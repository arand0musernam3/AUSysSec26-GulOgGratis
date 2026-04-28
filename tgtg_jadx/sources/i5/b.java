package i5;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f23362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f23363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f23364d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23365a;

    static {
        int i11 = 1;
        f23362b = new b(i11, 0);
        f23363c = new b(i11, 1);
        f23364d = new b(i11, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12) {
        super(i11);
        this.f23365a = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23365a) {
            case 0:
                ((Number) obj).longValue();
                return Unit.f26487a;
            case 1:
                return Integer.valueOf(((i) obj).f23384b);
            default:
                return Integer.valueOf(((i) obj).f23385c.b());
        }
    }
}
