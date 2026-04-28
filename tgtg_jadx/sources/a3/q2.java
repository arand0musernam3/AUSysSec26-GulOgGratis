package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f533c;

    public /* synthetic */ q2(Function0 function0, Function0 function02, int i11) {
        this.f531a = i11;
        this.f532b = function0;
        this.f533c = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p2.g gVar = (p2.g) obj;
        switch (this.f531a) {
            case 0:
                this.f532b.invoke();
                Function0 function0 = this.f533c;
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                break;
            default:
                this.f532b.invoke();
                Function0 function02 = this.f533c;
                if (function02 != null ? ((Boolean) function02.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                break;
        }
        return Unit.f26487a;
    }
}
