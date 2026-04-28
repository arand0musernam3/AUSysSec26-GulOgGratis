package os;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5.h f33755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f33756c;

    public /* synthetic */ j(m5.h hVar, Function1 function1, int i11) {
        this.f33754a = i11;
        this.f33755b = hVar;
        this.f33756c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function12;
        int i11 = this.f33754a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i11) {
            case 0:
                m5.f fVar = (m5.f) CollectionsKt.firstOrNull(this.f33755b.b(iIntValue, iIntValue, "URL"));
                if (fVar != null) {
                    this.f33756c.invoke(fVar.f29529a);
                }
                break;
            case 1:
                m5.f fVar2 = (m5.f) CollectionsKt.firstOrNull(this.f33755b.b(iIntValue, iIntValue, "URL"));
                if (fVar2 != null && (function1 = this.f33756c) != null) {
                    function1.invoke(fVar2.f29529a);
                }
                break;
            default:
                m5.f fVar3 = (m5.f) CollectionsKt.firstOrNull(this.f33755b.b(iIntValue, iIntValue, "URL"));
                if (fVar3 != null && (function12 = this.f33756c) != null) {
                    function12.invoke(fVar3.f29529a);
                }
                break;
        }
        return Unit.f26487a;
    }
}
