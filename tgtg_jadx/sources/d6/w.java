package d6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends Lambda implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f14530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f14531c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14532a;

    static {
        int i11 = 2;
        f14530b = new w(i11, 0);
        f14531c = new w(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i11, int i12) {
        super(i11);
        this.f14532a = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14532a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (!sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (!sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
