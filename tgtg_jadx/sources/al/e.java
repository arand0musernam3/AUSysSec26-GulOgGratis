package al;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import w2.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e extends AdaptedFunctionReference implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1535a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, obj, cls, str, str2, i12);
        this.f1535a = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1535a) {
            case 0:
                cv.i iVar = (cv.i) obj;
                iVar.getClass();
                p.g((p) this.receiver, iVar);
                break;
            case 1:
                cv.i iVar2 = (cv.i) obj;
                iVar2.getClass();
                cm.d dVar = (cm.d) this.receiver;
                dVar.getClass();
                dVar.f8463a.c(iVar2, null);
                break;
            case 2:
                ((o3.e) this.receiver).b((i5.i) obj);
                break;
            case 3:
                ((e1) this.receiver).O0(((r5.l) obj).f37687a);
                break;
            default:
                cv.i iVar3 = (cv.i) obj;
                iVar3.getClass();
                yl.i iVar4 = (yl.i) this.receiver;
                iVar4.getClass();
                iVar4.f46162e.c(iVar3, null);
                break;
        }
        return Unit.f26487a;
    }
}
