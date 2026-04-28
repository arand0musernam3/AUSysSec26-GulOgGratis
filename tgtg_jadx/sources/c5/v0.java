package c5;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.savedstate.SavedStateRegistry;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.e0 f7389a = new m3.e0(q0.f7322b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m3.d3 f7390b = new m3.d3(q0.f7323c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m3.e0 f7391c = new m3.e0(s.f7367h);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m3.d3 f7392d = new m3.d3(q0.f7324d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m3.d3 f7393e = new m3.d3(q0.f7325e);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m3.d3 f7394f = new m3.d3(q0.f7326f);

    public static final void a(y yVar, Function2 function2, m3.n nVar, int i11) {
        boolean z11;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-520299287);
        int i12 = (sVar.h(yVar) ? 4 : 2) | i11 | (sVar.h(function2) ? 32 : 16);
        int i13 = 1;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Context context = yVar.getContext();
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new f1(context);
                sVar.k0(objM);
            }
            f1 f1Var = (f1) objM;
            n viewTreeOwners = yVar.getViewTreeOwners();
            if (viewTreeOwners == null) {
                com.braze.h2.b("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            ea.f fVar2 = viewTreeOwners.f7295b;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                Object parent = yVar.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = y3.e.class.getSimpleName() + ':' + strValueOf;
                SavedStateRegistry savedStateRegistry = fVar2.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                s sVar2 = s.f7368i;
                m3.d3 d3Var = y3.g.f45406a;
                y3.f fVar3 = new y3.f(linkedHashMap, sVar2);
                try {
                    savedStateRegistry.c(str, new androidx.activity.g(fVar3, i13));
                    z11 = true;
                } catch (IllegalArgumentException unused) {
                    z11 = false;
                }
                b2 b2Var = new b2(fVar3, new c2(z11, savedStateRegistry, str));
                sVar.k0(b2Var);
                objM2 = b2Var;
            }
            b2 b2Var2 = (b2) objM2;
            Unit unit = Unit.f26487a;
            boolean zH = sVar.h(b2Var2);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                objM3 = new androidx.fragment.app.r(b2Var2, 6);
                sVar.k0(objM3);
            }
            m3.i.d(unit, (Function1) objM3, sVar);
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = g2.a(context) ? new y1(0, yVar.getView()) : new w2();
                sVar.k0(objM4);
            }
            r4.a aVar = (r4.a) objM4;
            Configuration configuration = yVar.getConfiguration();
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new h5.c();
                sVar.k0(objM5);
            }
            h5.c cVar = (h5.c) objM5;
            Object objM6 = sVar.M();
            Object obj = objM6;
            if (objM6 == fVar) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                sVar.k0(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = new t0(configuration3, cVar);
                sVar.k0(objM7);
            }
            t0 t0Var = (t0) objM7;
            boolean zH2 = sVar.h(context);
            Object objM8 = sVar.M();
            if (zH2 || objM8 == fVar) {
                objM8 = new b4.x(i13, context, t0Var);
                sVar.k0(objM8);
            }
            m3.i.d(cVar, (Function1) objM8, sVar);
            Object objM9 = sVar.M();
            if (objM9 == fVar) {
                objM9 = new h5.d();
                sVar.k0(objM9);
            }
            h5.d dVar = (h5.d) objM9;
            Object objM10 = sVar.M();
            if (objM10 == fVar) {
                objM10 = new u0(dVar);
                sVar.k0(objM10);
            }
            u0 u0Var = (u0) objM10;
            boolean zH3 = sVar.h(context);
            Object objM11 = sVar.M();
            if (zH3 || objM11 == fVar) {
                objM11 = new b4.x(2, context, u0Var);
                sVar.k0(objM11);
            }
            m3.i.d(dVar, (Function1) objM11, sVar);
            m3.e0 e0Var = x1.f7429v;
            m3.i.b(new m3.v1[]{f7389a.a(yVar.getConfiguration()), f7390b.a(context), w8.g.f43289a.a(viewTreeOwners.f7294a), fa.a.f17529a.a(fVar2), y3.g.f45406a.a(b2Var2), f7394f.a(yVar.getView()), f7392d.a(cVar), f7393e.a(dVar), e0Var.a(Boolean.valueOf(((Boolean) sVar.j(e0Var)).booleanValue() | yVar.getScrollCaptureInProgress$ui())), x1.l.a(aVar)}, u3.e.e(1059770793, sVar, new r0(yVar, f1Var, function2)), sVar, 56);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b5.n1(yVar, function2, i11);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
