package a3;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.textclassifier.TextClassifier;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.remote.user.response.charity.CharityHomePartnerStore;
import com.app.tgtg.model.remote.user.response.charity.CharityUserDetails;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import g3.ea;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f628k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f627j = i11;
        this.f628k = obj;
    }

    private final Object a(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        rc.e eVar = (rc.e) this.f628k;
        synchronized (eVar) {
            if (!eVar.l || eVar.f37883m) {
                return Unit.f26487a;
            }
            try {
                eVar.G();
            } catch (IOException unused) {
                eVar.f37884n = true;
            }
            try {
                if (eVar.f37880i >= 2000) {
                    eVar.I();
                }
            } catch (IOException unused2) {
                eVar.f37885o = true;
                eVar.f37881j = new ia0.c0(new ia0.e());
            }
            return Unit.f26487a;
        }
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f627j) {
            case 0:
                return new y((b0) this.f628k, cVar, 0);
            case 1:
                return new y((at.b0) this.f628k, cVar, 1);
            case 2:
                return new y(cVar, (b0.b1) this.f628k, 2);
            case 3:
                return new y((b0.l1) this.f628k, cVar, 3);
            case 4:
                return new y(cVar, (b0.l2) this.f628k, 4);
            case 5:
                return new y((en.o) this.f628k, cVar, 5);
            case 6:
                return new y((ev.e) this.f628k, cVar, 6);
            case 7:
                return new y((f0.s2) this.f628k, cVar, 7);
            case 8:
                return new y((f50.h) this.f628k, cVar, 8);
            case 9:
                return new y((ft.o) this.f628k, cVar, 9);
            case 10:
                return new y((dn.k) this.f628k, cVar, 10);
            case 11:
                return new y((go.v) this.f628k, cVar, 11);
            case 12:
                return new y((b5.j1) this.f628k, cVar, 12);
            case 13:
                return new y((MainActivity) this.f628k, cVar, 13);
            case 14:
                return new y((ea) this.f628k, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new y((jd.e) this.f628k, cVar, 15);
            case 16:
                return new y((XmlCheckoutAddressFragment) this.f628k, cVar, 16);
            case 17:
                return new y((m3.h1) this.f628k, cVar, 17);
            case 18:
                return new y((ni.e) this.f628k, cVar, 18);
            case 19:
                return new y((f0.f2) this.f628k, cVar, 19);
            case 20:
                return new y((oi.d) this.f628k, cVar, 20);
            case 21:
                return new y((Function0) this.f628k, cVar, 21);
            case 22:
                return new y((com.google.firebase.messaging.a0) this.f628k, cVar, 22);
            case 23:
                return new y((rc.e) this.f628k, cVar, 23);
            case 24:
                return new y((t5.a) this.f628k, cVar, 24);
            case 25:
                return new y((td.t) this.f628k, cVar, 25);
            case 26:
                return new y((tf.j) this.f628k, cVar, 26);
            case 27:
                return new y((tg.i) this.f628k, cVar, 27);
            case 28:
                return new y((v1.u) this.f628k, cVar, 28);
            default:
                return new y((s0.z1) this.f628k, cVar, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f627j) {
            case 0:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((y) create((at.b) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((y) create((f50.h) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 13:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 14:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 16:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 17:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 18:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 19:
                ((y) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
                throw null;
            case 20:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 21:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 22:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 23:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 24:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 25:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 26:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 27:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 28:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((y) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        v80.i1 i1VarA;
        Object next;
        String id2;
        List<CharityHomePartnerStore> charityStores;
        s0.w1 w1Var;
        int i11 = 7;
        boolean zBooleanValue = true;
        boolean z11 = true;
        Boolean boolValueOf = null;
        boolean z12 = false;
        boolean z13 = false;
        switch (this.f627j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b0 b0Var = (b0) this.f628k;
                TextClassifier textClassifierH = a3.h(b0Var.f264b, b0Var.f265c);
                b0Var.f268f = textClassifierH;
                return textClassifierH;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((at.b0) this.f628k).f4761a.f4769a.a(new f70.a());
                return Unit.f26487a;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b0.x2 x2Var = ((b0.b1) this.f628k).f5067c;
                if (x2Var != null) {
                    x2Var.close();
                }
                return Unit.f26487a;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                y0.f fVar = ((b0.l1) this.f628k).f5290h;
                if (fVar != null) {
                    fVar.b();
                }
                if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: ScreenFlash.clear() invoked");
                }
                return Unit.f26487a;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (!((b0.l2) this.f628k).f5299h.b()) {
                    i0.b bVarA = ((b0.l2) this.f628k).f5292a.a();
                    a0.j jVar = ((b0.l2) this.f628k).f5292a;
                    jVar.f76c.f42675b = jVar.a();
                    w.o oVar = jVar.f75b;
                    i0.b bVarA2 = jVar.a();
                    synchronized (oVar.f42728a) {
                        try {
                            if (wd.a.B(3, "CXCP")) {
                                Log.d("CXCP", "Camera graph updated from " + oVar.f42731d + " to " + bVarA2);
                            }
                            s0.h0 h0Var = oVar.f42732e;
                            s0.h0 h0Var2 = s0.h0.CLOSED;
                            if (h0Var != h0Var2) {
                                oVar.c(s0.h0.CLOSING, null);
                                oVar.c(h0Var2, null);
                            }
                            oVar.f42731d = bVarA2;
                            oVar.f42732e = h0Var2;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (bVarA.f22591o.b()) {
                        qc.y.j("Cannot start ", bVarA, " after calling close()");
                        return null;
                    }
                    Trace.beginSection(bVarA + "#start");
                    StringBuilder sb2 = new StringBuilder("Starting ");
                    sb2.append(bVarA);
                    Log.i("CXCP", sb2.toString());
                    i0.v vVar = bVarA.f22579b;
                    vVar.getClass();
                    Log.d("CXCP", vVar + " onGraphStarting");
                    vVar.f22743e.j(e0.n0.f15384c);
                    for (w.e0 e0Var : vVar.f22742d) {
                        e0Var.f42674a.b(e0Var.a(), e0.n0.f15384c);
                    }
                    f0.p0 p0Var = (f0.p0) bVarA.f22582e;
                    synchronized (p0Var.f16829q) {
                        p0Var.f();
                    }
                    Trace.endSection();
                    Map map = (Map) ((b0.l2) this.f628k).f5292a.f79f.getValue();
                    b0.l2 l2Var = (b0.l2) this.f628k;
                    w.l0 l0Var = (w.l0) l2Var.f5301j.getValue();
                    s0.z1 z1Var = ((s0.y1) l0Var.f42720e.getValue()).c() ? (s0.z1) l0Var.f42721f.getValue() : null;
                    if (z1Var != null) {
                        List listUnmodifiableList = Collections.unmodifiableList(z1Var.f38494g.f38438a);
                        listUnmodifiableList.getClass();
                        List listB = z1Var.b();
                        listB.getClass();
                        Iterator it = listB.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (!listUnmodifiableList.contains((s0.x0) next)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        s0.x0 x0Var = (s0.x0) next;
                        if (x0Var != null) {
                        }
                    }
                    if (wd.a.B(3, "CXCP")) {
                        Log.d("CXCP", "Setting up Surfaces with UseCaseSurfaceManager");
                    }
                    if (((s0.y1) ((w.l0) ((b0.l2) this.f628k).f5301j.getValue()).f42720e.getValue()).c()) {
                        b0.i3 i3Var = (b0.i3) ((b0.l2) this.f628k).f5300i.getValue();
                        i3Var.getClass();
                        w.l0 l0Var2 = (w.l0) ((b0.l2) this.f628k).f5301j.getValue();
                        l0Var2.getClass();
                        map.getClass();
                        synchronized (i3Var.f5237e) {
                            try {
                                if (i3Var.f5238f != null) {
                                    throw new IllegalStateException("Surfaces should only be set up once!");
                                }
                                if (i3Var.f5241i != null) {
                                    throw new IllegalStateException("Surfaces being setup after stopped!");
                                }
                                if (i3Var.f5240h != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                Object value = l0Var2.f42722g.getValue();
                                value.getClass();
                                List list = (List) value;
                                try {
                                    nx.d.x(list);
                                    v80.j0 j0VarF = v80.f0.f(i3Var.f5233a.f5265a, null, null, new al.j(l0Var2, i3Var, list, map, bVarA, (x70.c) null, 2), 3);
                                    j0VarF.J(new b0.f3(list, i));
                                    i3Var.f5238f = j0VarF;
                                    i1VarA = j0VarF;
                                } catch (DeferrableSurface$SurfaceClosedException e5) {
                                    if (wd.a.B(5, "CXCP")) {
                                        Log.w("CXCP", "Failed to increment DeferrableSurfaces: Surfaces closed");
                                    }
                                    v80.f0.B(i3Var.f5233a.f5265a, null, null, new aa.l0((Object) l0Var2, (Object) e5, (x70.c) (z12 ? 1 : 0), i11), 3);
                                    i1VarA = v80.f0.a(Boolean.FALSE);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        i1VarA.J(b0.k2.f5264a);
                    } else if (wd.a.B(6, "CXCP")) {
                        Log.e("CXCP", "Unable to create capture session due to conflicting configurations");
                    }
                } else if (wd.a.B(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before starting the CameraGraph, skipping setup.");
                }
                return Unit.f26487a;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((en.o) this.f628k).f16184t.k(Boolean.FALSE);
                return Unit.f26487a;
            case 6:
                ev.e eVar = (ev.e) this.f628k;
                Context context = eVar.f16488a;
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                try {
                    id2 = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
                    break;
                } catch (Exception unused) {
                    id2 = null;
                }
                if (id2 == null) {
                    id2 = "00000000-0000-0000-0000-000000000000";
                }
                try {
                    boolValueOf = Boolean.valueOf(AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled());
                    break;
                } catch (Exception unused2) {
                }
                if (boolValueOf != null) {
                    try {
                        zBooleanValue = boolValueOf.booleanValue();
                    } catch (Exception e11) {
                        sa0.a.f38953a.d(e11);
                    }
                }
                eVar.e(id2, zBooleanValue);
                return Unit.f26487a;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((f0.s2) this.f628k).m(true);
                return Unit.f26487a;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                return (f50.h) this.f628k;
            case 9:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ft.o oVar2 = (ft.o) this.f628k;
                oVar2.getClass();
                v80.f0.E(kotlin.coroutines.g.f26549a, new ft.l(oVar2, z13 ? 1 : 0, 2));
                Function0 function0 = oVar2.f17954d;
                if (function0 != null) {
                    function0.invoke();
                }
                y80.a2 a2Var = oVar2.f17952b;
                Boolean bool = Boolean.FALSE;
                a2Var.getClass();
                a2Var.k(null, bool);
                return Unit.f26487a;
            case 10:
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                dn.k kVar = (dn.k) this.f628k;
                ((Function1) kVar.f15018b).invoke(Boolean.valueOf(kVar.n()));
                return Unit.f26487a;
            case 11:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((go.v) this.f628k).i(new NullPointerException("OrderId is null"));
                return Unit.f26487a;
            case 12:
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((ep.l) ((b5.j1) this.f628k).f5850d).invoke();
                return Unit.f26487a;
            case 13:
                y70.a aVar14 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                MainActivity mainActivity = (MainActivity) this.f628k;
                boolean z14 = MainActivity.f9078v;
                mainActivity.g0().f22165s.e(mainActivity, new al.c(new hm.g(mainActivity, i11), i11));
                return Unit.f26487a;
            case 14:
                y70.a aVar15 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((ea) this.f628k).a();
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                y70.a aVar16 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                jd.e eVar2 = (jd.e) this.f628k;
                synchronized (eVar2.f24973h) {
                    if (!eVar2.f24977m || eVar2.f24978n) {
                        return Unit.f26487a;
                    }
                    try {
                        eVar2.G();
                        break;
                    } catch (IOException unused3) {
                        eVar2.f24979o = true;
                    }
                    try {
                        if ((eVar2.f24975j >= 2000 ? 1 : 0) != 0) {
                            eVar2.I();
                        }
                        break;
                    } catch (IOException unused4) {
                        eVar2.f24980p = true;
                        eVar2.f24976k = new ia0.c0(new ia0.e());
                    }
                    return Unit.f26487a;
                }
            case 16:
                y70.a aVar17 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                XmlCheckoutAddressFragment xmlCheckoutAddressFragment = (XmlCheckoutAddressFragment) this.f628k;
                av.e eVar3 = (av.e) ((cj.q) xmlCheckoutAddressFragment.f8933h.getValue()).Z.getValue();
                LifecycleOwner viewLifecycleOwner = xmlCheckoutAddressFragment.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                eVar3.e(viewLifecycleOwner, new al.c(new jd.a(xmlCheckoutAddressFragment, z11 ? 1 : 0), 8));
                return Unit.f26487a;
            case 17:
                y70.a aVar18 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((m3.h1) this.f628k).i(99);
                return Unit.f26487a;
            case 18:
                y70.a aVar19 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                y80.a2 a2Var2 = ((ni.e) this.f628k).f30880f;
                Boolean bool2 = Boolean.TRUE;
                a2Var2.getClass();
                a2Var2.k(null, bool2);
                return Unit.f26487a;
            case 19:
                y70.a aVar20 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                Object obj2 = ((f0.f2) this.f628k).f16650c;
                throw null;
            case 20:
                oi.d dVar = (oi.d) this.f628k;
                y80.a2 a2Var3 = dVar.f32570d;
                y70.a aVar21 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                try {
                    CharityUserDetails charityUserDetails = dVar.f32567a.n().getCharityUserDetails();
                    if (charityUserDetails == null || (charityStores = charityUserDetails.getCharityStores()) == null) {
                        charityStores = kotlin.collections.n0.f26529a;
                    }
                    dVar.f32568b.j(charityStores);
                    Boolean bool3 = Boolean.FALSE;
                    a2Var3.getClass();
                    a2Var3.k(null, bool3);
                    break;
                } catch (Exception unused5) {
                    Boolean bool4 = Boolean.FALSE;
                    a2Var3.getClass();
                    a2Var3.k(null, bool4);
                }
                return Unit.f26487a;
            case 21:
                y70.a aVar22 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((Function0) this.f628k).invoke();
                return Unit.f26487a;
            case 22:
                y70.a aVar23 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                com.google.firebase.messaging.a0 a0Var = (com.google.firebase.messaging.a0) this.f628k;
                pm.j jVarI = a0Var.I();
                pm.j jVar2 = pm.j.Hidden;
                if (jVarI != jVar2 && ((pm.j) ((z1.r) a0Var.f12782e).f46654i.getValue()) == jVar2) {
                    ((Function0) a0Var.f12779b).invoke();
                }
                return Unit.f26487a;
            case 23:
                return a(obj);
            case 24:
                y70.a aVar24 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((ss.w) ((t5.a) this.f628k).f39791b).f39256d.i(ts.z.f40473a);
                return Unit.f26487a;
            case 25:
                y70.a aVar25 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                td.t tVar = (td.t) this.f628k;
                td.s sVar = tVar.f40055c;
                if (sVar != null) {
                    sVar.a();
                }
                tVar.f40055c = null;
                return Unit.f26487a;
            case 26:
                y70.a aVar26 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                return ((tf.j) this.f628k).f40137f.a(nf.e.REMOTE_CONFIG_TIMESTAMP);
            case 27:
                y70.a aVar27 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((tg.i) this.f628k).g(sm.b.DEFAULT);
                return Unit.f26487a;
            case 28:
                y70.a aVar28 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((v1.u) this.f628k).a(false);
                return Unit.f26487a;
            default:
                y70.a aVar29 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                s0.z1 z1Var2 = (s0.z1) this.f628k;
                if (z1Var2 != null && (w1Var = z1Var2.f38493f) != null) {
                    w1Var.a(z1Var2, s0.x1.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
                return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(x70.c cVar, Object obj, int i11) {
        super(2, cVar);
        this.f627j = i11;
        this.f628k = obj;
    }
}
