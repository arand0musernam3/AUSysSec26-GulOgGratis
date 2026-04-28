package li;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import w.o0;
import w.q0;
import y3.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f27851g;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f27845a = i11;
        this.f27846b = obj;
        this.f27847c = obj2;
        this.f27848d = obj3;
        this.f27849e = obj4;
        this.f27850f = obj5;
        this.f27851g = obj6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z11;
        switch (this.f27845a) {
            case 0:
                mi.a aVar = (mi.a) this.f27846b;
                Function1 function1 = (Function1) this.f27847c;
                b1 b1Var = (b1) this.f27848d;
                b1 b1Var2 = (b1) this.f27849e;
                b1 b1Var3 = (b1) this.f27850f;
                b1 b1Var4 = (b1) this.f27851g;
                if (!((Boolean) b1Var.getValue()).booleanValue() || aVar.f29961c) {
                    function1.invoke(new mi.b(((Boolean) b1Var3.getValue()).booleanValue(), ((Boolean) b1Var.getValue()).booleanValue(), "", "", ((Boolean) b1Var4.getValue()).booleanValue()));
                } else {
                    b1Var2.setValue(Boolean.TRUE);
                }
                return Unit.f26487a;
            case 1:
                return Boolean.valueOf(((q0) this.f27846b).a((o0) this.f27847c, (ArrayList) this.f27848d, (LinkedHashMap) this.f27849e, (List) this.f27850f, (ArrayList) this.f27851g));
            default:
                y3.a aVar2 = (y3.a) this.f27846b;
                i iVar = (i) this.f27847c;
                y3.e eVar = (y3.e) this.f27848d;
                String str = (String) this.f27849e;
                Object[] objArr = (Object[]) this.f27851g;
                boolean z12 = true;
                if (aVar2.f45392b != eVar) {
                    aVar2.f45392b = eVar;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (Intrinsics.areEqual(aVar2.f45393c, str)) {
                    z12 = z11;
                } else {
                    aVar2.f45393c = str;
                }
                aVar2.f45391a = iVar;
                aVar2.f45394d = this.f27850f;
                aVar2.f45395e = objArr;
                y3.d dVar = aVar2.f45396f;
                if (dVar != null && z12) {
                    ((t5.a) dVar).L();
                    aVar2.f45396f = null;
                    aVar2.a();
                }
                return Unit.f26487a;
        }
    }
}
