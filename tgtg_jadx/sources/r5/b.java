package r5;

import i4.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f37628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f37629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f37630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f37631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f37632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f37633g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37634a;

    static {
        int i11 = 1;
        f37628b = new b(i11, 0);
        f37629c = new b(i11, 1);
        f37630d = new b(i11, 2);
        f37631e = new b(i11, 3);
        f37632f = new b(i11, 4);
        f37633g = new b(i11, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12) {
        super(i11);
        this.f37634a = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f37634a) {
            case 0:
                float[] fArr = ((l0) obj).f23269a;
                break;
            case 1:
                float[] fArr2 = ((l0) obj).f23269a;
                break;
            case 2:
                break;
            case 3:
                int i11 = ((l) obj).f37687a;
                break;
            case 4:
                break;
            default:
                int i12 = ((l) obj).f37687a;
                break;
        }
        return Unit.f26487a;
    }
}
