package l4;

import i4.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f27271c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27272a;

    static {
        int i11 = 1;
        f27270b = new a(i11, 0);
        f27271c = new a(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, int i12) {
        super(i11);
        this.f27272a = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27272a) {
            case 0:
                break;
            default:
                k4.d.B0((k4.d) obj, v.f23314g, 0L, 0L, 0.0f, 126);
                break;
        }
        return Unit.f26487a;
    }
}
