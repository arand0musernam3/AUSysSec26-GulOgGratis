package c6;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7676e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7677a;

    static {
        int i11 = 1;
        f7673b = new b(i11, 0);
        f7674c = new b(i11, 1);
        f7675d = new b(i11, 2);
        f7676e = new b(i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12) {
        super(i11);
        this.f7677a = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7677a) {
            case 0:
                j jVar = (j) obj;
                jVar.getHandler().post(new b4.b(3, jVar.f7715r));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return Unit.f26487a;
    }
}
