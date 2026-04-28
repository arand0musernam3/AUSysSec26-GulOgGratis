package z4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f47116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f47117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f47118d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47119a;

    static {
        int i11 = 1;
        f47116b = new f0(i11, 0);
        f47117c = new f0(i11, 1);
        f47118d = new f0(i11, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i11, int i12) {
        super(i11);
        this.f47119a = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47119a) {
            case 0:
                ((b5.m0) obj).F = true;
                break;
            case 1:
                break;
            default:
                break;
        }
        return Unit.f26487a;
    }
}
