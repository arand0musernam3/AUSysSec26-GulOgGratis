package g4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f19971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f19972c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19973a;

    static {
        int i11 = 1;
        f19971b = new s(i11, 0);
        f19972c = new s(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i11, int i12) {
        super(i11);
        this.f19973a = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f19973a) {
            case 0:
                break;
            default:
                break;
        }
        return Unit.f26487a;
    }
}
