package c1;

import android.animation.Animator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.Consumer;
import androidx.lifecycle.m1;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.user.response.Address;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m2.b2;
import pg.v;
import v80.f0;
import x80.t;
import x80.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6922b;

    public /* synthetic */ q(uk.r rVar, q qVar) {
        this.f6921a = 10;
        this.f6922b = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i11 = this.f6921a;
        uk.q qVar = 0;
        Object obj2 = null;
        Object obj3 = this.f6922b;
        switch (i11) {
            case 0:
                m0.j jVar = (m0.j) obj;
                for (Map.Entry entry : ((Map) obj3).entrySet()) {
                    int i12 = jVar.f28531b - ((e1.c) entry.getKey()).f15442f;
                    if (((e1.c) entry.getKey()).f15443g) {
                        i12 = -i12;
                    }
                    int iJ = v0.o.j(i12);
                    n nVar = (n) entry.getValue();
                    nVar.getClass();
                    a.a.K(new l(nVar, iJ, -1));
                }
                break;
            case 1:
                ((t) ((u) obj3)).h((cb.h) obj);
                break;
            case 2:
                FlashSalesItem flashSalesItem = (FlashSalesItem) obj;
                int i13 = FlashSalesListActivity.f8995p;
                flashSalesItem.getClass();
                dk.f fVar = (dk.f) ((FlashSalesListActivity) obj3).f8998h.getValue();
                f0.B(m1.d(fVar), null, null, new d8.c(fVar, flashSalesItem, qVar, 6), 3);
                break;
            case 3:
                ((Animator) obj).getClass();
                ((ConstraintLayout) ((v) obj3).f35202c).setVisibility(8);
                break;
            case 4:
                FlashSalesItem flashSalesItem2 = (FlashSalesItem) obj;
                int i14 = hq.o.f22390h;
                flashSalesItem2.getClass();
                Consumer consumer = ((hq.o) obj3).f22392e;
                if (consumer != null) {
                    consumer.accept(flashSalesItem2);
                }
                break;
            case 5:
                ((Animator) obj).getClass();
                ((View) obj3).setVisibility(0);
                break;
            case 6:
                ((Animator) obj).getClass();
                ((b2) obj3).invoke();
                break;
            case 7:
                LatLngInfo latLngInfo = (LatLngInfo) obj;
                latLngInfo.getClass();
                ((tg.i) obj3).j(vg.f.CURRENT_LOCATION, new LatLngInfo(latLngInfo.getLatitude(), latLngInfo.getLongitude()));
                break;
            case 8:
                LatLngInfo latLngInfo2 = (LatLngInfo) obj;
                latLngInfo2.getClass();
                ((tm.e) obj3).f40326v.i(new qt.a(new st.b(latLngInfo2.getLatitude(), latLngInfo2.getLongitude())));
                break;
            case 9:
                uk.c cVar = (uk.c) obj3;
                xk.a aVar = (xk.a) obj;
                aVar.getClass();
                uk.q qVar2 = cVar.f41322n;
                if (qVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                    qVar2 = null;
                }
                qVar2.setupMap(aVar);
                uk.q qVar3 = cVar.f41322n;
                if (qVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                } else {
                    qVar = qVar3;
                }
                qVar.setupListeners();
                break;
            case 10:
                LatLngInfo latLngInfo3 = (LatLngInfo) obj;
                latLngInfo3.getClass();
                ft.c.k0(latLngInfo3);
                ((q) obj3).accept(new xk.a(latLngInfo3, null, null, null, 14));
                break;
            default:
                yk.h hVar = (yk.h) obj3;
                LatLngInfo latLngInfo4 = (LatLngInfo) obj;
                latLngInfo4.getClass();
                Address address = new Address("", new LatLngInfo(latLngInfo4.getLatitude(), latLngInfo4.getLongitude()), (String) null, 4, (DefaultConstructorMarker) null);
                tg.c cVar2 = hVar.f46128a;
                Iterator it = ((Iterable) cVar2.f40149d.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((jl.c) next).f25299a == jl.b.GPS) {
                            obj2 = next;
                        }
                    }
                }
                jl.c cVar3 = (jl.c) obj2;
                if (cVar3 != null) {
                    jl.b bVar = cVar3.f25299a;
                    hVar.f46131d.getClass();
                    if (bVar == ft.c.t()) {
                        cVar2.e(jl.c.a(cVar3, null, address, false, false, false, null, null, 503));
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q(Object obj, int i11) {
        this.f6921a = i11;
        this.f6922b = obj;
    }
}
