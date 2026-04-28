package df;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import bx.k;
import gf.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.x0;
import v80.b2;
import ye.n;
import ye.o;
import ye.p;
import ye.q;
import ye.r;
import ye.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gf.e f14888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f14889j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Window.Callback callback, View view, String str, h hVar, List list, kf.b bVar, gf.e eVar, q qVar) {
        super(callback, view, str, hVar, list, bVar, eVar);
        view.getClass();
        list.getClass();
        bVar.getClass();
        this.f14888i = eVar;
        this.f14889j = qVar;
    }

    @Override // df.b, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        q qVar;
        boolean z11;
        r rVar;
        gf.e eVar;
        gf.e eVar2;
        String str;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent != null && (qVar = this.f14889j) != null) {
            gf.e eVar3 = qVar.f45933c;
            ConcurrentHashMap concurrentHashMap = qVar.f45936f;
            if (motionEvent.getAction() == 1) {
                ye.f fVarC = this.f14888i.f20413b.c();
                List list = fVarC.f45885e;
                t tVar = t.f45939a;
                boolean zContains = list.contains(tVar);
                r rVar2 = r.f45937a;
                if (!zContains && !fVarC.f45885e.contains(rVar2)) {
                    this.f14887h = null;
                    return zDispatchTouchEvent;
                }
                View view = (View) this.f14886g.get();
                kf.b bVar = this.f14883d;
                if (view == null) {
                    bVar.a("DecorView is null in handleFrustrationInteraction()");
                    return zDispatchTouchEvent;
                }
                af.e eVarB = this.f14887h;
                if (eVarB != null) {
                    this.f14887h = null;
                } else {
                    eVarB = af.c.b(af.d.Clickable, view, this.f14882c, bVar, new Pair(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())));
                    if (eVarB == null) {
                        bVar.b("Unable to find click target for frustration interaction");
                        return zDispatchTouchEvent;
                    }
                }
                boolean z12 = eVarB.f1284j;
                boolean z13 = eVarB.f1283i;
                if (z13 && z12) {
                    bVar.b("Ignoring all frustration interactions for target: " + eVarB.f1276b);
                    return zDispatchTouchEvent;
                }
                float x11 = motionEvent.getX();
                float y5 = motionEvent.getY();
                System.currentTimeMillis();
                String str2 = eVarB.f1276b;
                p pVar = new p(str2, eVarB.f1277c, eVarB.f1278d, eVarB.f1279e, eVarB.f1281g, eVarB.f1282h);
                String str3 = str2;
                kf.b bVar2 = qVar.f45932b;
                String str4 = this.f14881b;
                str4.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                System.currentTimeMillis();
                if (eVar3.f20413b.c().f45885e.contains(tVar)) {
                    if (z13) {
                        eVar2 = eVar3;
                        z11 = z12;
                        rVar = rVar2;
                        StringBuilder sb2 = new StringBuilder("Skipping rage click processing for ignored target: ");
                        str3 = str3;
                        sb2.append(str3);
                        bVar2.b(sb2.toString());
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str3);
                        sb3.append('_');
                        float f11 = qVar.f45934d;
                        sb3.append((int) (x11 / f11));
                        sb3.append('_');
                        sb3.append((int) (y5 / f11));
                        String string = sb3.toString();
                        o oVar = (o) concurrentHashMap.get(string);
                        if (oVar != null) {
                            z11 = z12;
                            ArrayList arrayList = oVar.f45924g;
                            float f12 = oVar.f45922e;
                            rVar = rVar2;
                            float f13 = oVar.f45921d;
                            str = str3;
                            long j9 = oVar.f45918a;
                            if (jCurrentTimeMillis - j9 <= 1000) {
                                PointF pointF = new PointF(x11, y5);
                                PointF pointF2 = new PointF(f13, f12);
                                eVar2 = eVar3;
                                if (PointF.length(pointF.x - pointF2.x, pointF.y - pointF2.y) <= f11) {
                                    oVar.f45920c++;
                                    oVar.f45919b = jCurrentTimeMillis;
                                    arrayList.add(new n(x11, y5, jCurrentTimeMillis));
                                    if (oVar.f45920c >= 4) {
                                        Map mapP = k.p(eVarB, str4);
                                        Pair pair = new Pair("[Amplitude] Begin Time", Long.valueOf(j9));
                                        Pair pair2 = new Pair("[Amplitude] End Time", Long.valueOf(oVar.f45919b));
                                        Pair pair3 = new Pair("[Amplitude] Duration", Long.valueOf(oVar.f45919b - j9));
                                        String str5 = "[Amplitude] X";
                                        Pair pair4 = new Pair("[Amplitude] X", Integer.valueOf((int) f13));
                                        Pair pair5 = new Pair("[Amplitude] Y", Integer.valueOf((int) f12));
                                        Pair pair6 = new Pair("[Amplitude] Click Count", Integer.valueOf(oVar.f45920c));
                                        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            n nVar = (n) it.next();
                                            arrayList2.add(x0.e(new Pair(str5, Integer.valueOf((int) nVar.f45915a)), new Pair("[Amplitude] Y", Integer.valueOf((int) nVar.f45916b)), new Pair("timestamp", Long.valueOf(nVar.f45917c))));
                                            pair = pair;
                                            it = it;
                                            pair6 = pair6;
                                            str5 = str5;
                                            pair2 = pair2;
                                        }
                                        ye.b.k(qVar.f45931a, "[Amplitude] Rage Click", x0.g(mapP, x0.e(pair, pair2, pair3, pair4, pair5, pair6, new Pair("[Amplitude] Clicks", arrayList2))), 4);
                                        bVar2.b("Rage click detected with " + oVar.f45920c + " clicks");
                                        concurrentHashMap.remove(string);
                                    }
                                } else {
                                    concurrentHashMap.put(string, new o(jCurrentTimeMillis, jCurrentTimeMillis, x11, y5, pVar, d0.j(new n(x11, y5, jCurrentTimeMillis))));
                                }
                            } else {
                                eVar2 = eVar3;
                                concurrentHashMap.put(string, new o(jCurrentTimeMillis, jCurrentTimeMillis, x11, y5, pVar, d0.j(new n(x11, y5, jCurrentTimeMillis))));
                            }
                        } else {
                            str = str3;
                            eVar2 = eVar3;
                            z11 = z12;
                            rVar = rVar2;
                            concurrentHashMap.put(string, new o(jCurrentTimeMillis, jCurrentTimeMillis, x11, y5, pVar, d0.j(new n(x11, y5, jCurrentTimeMillis))));
                        }
                        str3 = str;
                    }
                    eVar = eVar2;
                } else {
                    z11 = z12;
                    rVar = rVar2;
                    eVar = eVar3;
                }
                if (!eVar.f20413b.c().f45885e.contains(rVar)) {
                    return zDispatchTouchEvent;
                }
                if (z11) {
                    bVar2.b("Skipping dead click processing for ignored target: " + str3);
                    return zDispatchTouchEvent;
                }
                b2 b2Var = qVar.f45935e;
                if (b2Var == null || !b2Var.g()) {
                    bVar2.a("Dead click detection is disabled - call start() to enable.");
                    return zDispatchTouchEvent;
                }
                bVar2.a("Dead click detection is disabled - no UI change signals observed yet. Ensure SessionReplay plugin is active.");
                return zDispatchTouchEvent;
            }
        }
        return zDispatchTouchEvent;
    }
}
