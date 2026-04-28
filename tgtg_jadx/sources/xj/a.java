package xj;

import androidx.lifecycle.m1;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.m;
import m3.n;
import m3.s;
import yj.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f44369b;

    public /* synthetic */ a(d dVar, int i11) {
        this.f44368a = i11;
        this.f44369b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44368a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final d dVar = this.f44369b;
                    boolean zH = sVar.h(dVar);
                    Object objM = sVar.M();
                    m3.f fVar = m.f29332a;
                    if (zH || objM == fVar) {
                        final int i11 = 0;
                        objM = new Function1() { // from class: xj.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                BasicItem basicItem = (BasicItem) obj3;
                                switch (i11) {
                                    case 0:
                                        basicItem.getClass();
                                        k kVarQ = dVar.q();
                                        f70.i iVar = f70.i.SCREEN_FAVORITES;
                                        iVar.getClass();
                                        uj.a aVar = kVarQ.f44412g;
                                        aVar.getClass();
                                        f70.g gVar = aVar.f41307a;
                                        mk.c cVar = new mk.c(basicItem.getInformation().mo340getItemIdFvU5WIY(), mv.d.s(basicItem));
                                        cVar.f29986i = iVar;
                                        gVar.a(cVar.a());
                                        break;
                                    default:
                                        basicItem.getClass();
                                        k kVarQ2 = dVar.q();
                                        mv.d.u(m1.d(kVarQ2), new j(kVarQ2, basicItem, true, null));
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(objM);
                    }
                    Function1 function1 = (Function1) objM;
                    boolean zH2 = sVar.h(dVar);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        final int i12 = 1;
                        objM2 = new Function1() { // from class: xj.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                BasicItem basicItem = (BasicItem) obj3;
                                switch (i12) {
                                    case 0:
                                        basicItem.getClass();
                                        k kVarQ = dVar.q();
                                        f70.i iVar = f70.i.SCREEN_FAVORITES;
                                        iVar.getClass();
                                        uj.a aVar = kVarQ.f44412g;
                                        aVar.getClass();
                                        f70.g gVar = aVar.f41307a;
                                        mk.c cVar = new mk.c(basicItem.getInformation().mo340getItemIdFvU5WIY(), mv.d.s(basicItem));
                                        cVar.f29986i = iVar;
                                        gVar.a(cVar.a());
                                        break;
                                    default:
                                        basicItem.getClass();
                                        k kVarQ2 = dVar.q();
                                        mv.d.u(m1.d(kVarQ2), new j(kVarQ2, basicItem, true, null));
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(objM2);
                    }
                    Function1 function12 = (Function1) objM2;
                    boolean zH3 = sVar.h(dVar);
                    Object objM3 = sVar.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new a(dVar, 1);
                        sVar.k0(objM3);
                    }
                    Function2 function2 = (Function2) objM3;
                    boolean zH4 = sVar.h(dVar);
                    Object objM4 = sVar.M();
                    if (zH4 || objM4 == fVar) {
                        objM4 = new rv.a(dVar, 29);
                        sVar.k0(objM4);
                    }
                    q.a(null, function1, function12, function2, (Function0) objM4, dVar.f44375h, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                BasicItem basicItem = (BasicItem) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                basicItem.getClass();
                k kVarQ = this.f44369b.q();
                mv.d.u(m1.d(kVarQ), new j(kVarQ, basicItem, zBooleanValue, null));
                break;
        }
        return Unit.f26487a;
    }
}
