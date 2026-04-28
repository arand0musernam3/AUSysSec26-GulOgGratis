package zc;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import ax.g0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.n0;
import kotlin.collections.x0;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f47442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f47443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bd.b f47444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f47445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public xc.b f47446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f47447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public dd.d f47448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f47449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f47450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f47451k;
    public Boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f47452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y8.c f47453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f47454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f47455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f47456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f47457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f47458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f47459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ad.i f47460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Lifecycle f47461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ad.i f47462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ad.g f47463x;

    public i(k kVar, Context context) {
        this.f47441a = context;
        this.f47442b = kVar.H;
        this.f47443c = kVar.f47465b;
        this.f47444d = kVar.f47466c;
        this.f47445e = kVar.f47467d;
        this.f47446f = kVar.f47468e;
        d dVar = kVar.G;
        this.f47447g = kVar.f47471h;
        this.f47448h = dVar.f47434b;
        this.f47449i = kVar.f47473j.e();
        this.f47450j = x0.m(kVar.f47474k.f47516a);
        this.f47451k = kVar.l;
        this.l = dVar.f47435c;
        this.f47452m = kVar.f47477o;
        this.f47453n = new y8.c(kVar.f47488z);
        this.f47454o = kVar.A;
        this.f47455p = kVar.B;
        this.f47456q = kVar.C;
        this.f47457r = kVar.D;
        this.f47458s = kVar.E;
        this.f47459t = kVar.F;
        this.f47460u = dVar.f47433a;
        if (kVar.f47464a == context) {
            this.f47461v = kVar.f47485w;
            this.f47462w = kVar.f47486x;
            this.f47463x = kVar.f47487y;
        } else {
            this.f47461v = null;
            this.f47462w = null;
            this.f47463x = null;
        }
    }

    public final k a() {
        x xVar;
        Object obj;
        KeyEvent.Callback callback;
        ad.i fVar;
        Object obj2 = this.f47443c;
        if (obj2 == null) {
            obj2 = m.f47489a;
        }
        Object obj3 = obj2;
        bd.b bVar = this.f47444d;
        j jVar = this.f47445e;
        xc.b bVar2 = this.f47446f;
        c cVar = this.f47442b;
        Bitmap.Config config = cVar.f47428g;
        ad.d dVar = cVar.f47427f;
        List list = this.f47447g;
        dd.d dVar2 = this.f47448h;
        if (dVar2 == null) {
            dVar2 = cVar.f47426e;
        }
        dd.d dVar3 = dVar2;
        g0 g0Var = this.f47449i;
        q90.t tVarG = g0Var != null ? g0Var.g() : null;
        if (tVarG == null) {
            tVarG = ed.k.f15929c;
        } else {
            Bitmap.Config[] configArr = ed.k.f15927a;
        }
        q90.t tVar = tVarG;
        LinkedHashMap linkedHashMap = this.f47450j;
        s sVar = linkedHashMap != null ? new s(a.a.P(linkedHashMap)) : null;
        if (sVar == null) {
            sVar = s.f47515b;
        }
        s sVar2 = sVar;
        Boolean bool = this.l;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f47442b.f47429h;
        this.f47442b.getClass();
        c cVar2 = this.f47442b;
        b bVar3 = cVar2.f47430i;
        b bVar4 = cVar2.f47431j;
        b bVar5 = cVar2.f47432k;
        x xVar2 = cVar2.f47422a;
        x xVar3 = cVar2.f47423b;
        x xVar4 = cVar2.f47424c;
        x xVar5 = cVar2.f47425d;
        Lifecycle lifecycle = this.f47461v;
        Context context = this.f47441a;
        if (lifecycle == null) {
            bd.b bVar6 = this.f47444d;
            xVar = xVar4;
            Object context2 = bVar6 instanceof bd.a ? ((bd.a) bVar6).f6105b.getContext() : context;
            while (true) {
                if (context2 instanceof LifecycleOwner) {
                    lifecycle = ((LifecycleOwner) context2).getLifecycle();
                    break;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = h.f47439b;
            }
        } else {
            xVar = xVar4;
        }
        Lifecycle lifecycle2 = lifecycle;
        ad.i cVar3 = this.f47460u;
        if (cVar3 == null && (cVar3 = this.f47462w) == null) {
            bd.b bVar7 = this.f47444d;
            if (bVar7 instanceof bd.a) {
                ImageView imageView = ((bd.a) bVar7).f6105b;
                if (imageView != null) {
                    ImageView.ScaleType scaleType = imageView.getScaleType();
                    obj = obj3;
                    if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                        fVar = new ad.e(ad.h.f1226c);
                    }
                    cVar3 = fVar;
                } else {
                    obj = obj3;
                }
                fVar = new ad.f(imageView);
                cVar3 = fVar;
            } else {
                obj = obj3;
                cVar3 = new ad.c(context);
            }
        } else {
            obj = obj3;
        }
        ad.i iVar = cVar3;
        ad.g gVar = this.f47463x;
        if (gVar == null) {
            ad.i iVar2 = this.f47460u;
            ad.f fVar2 = iVar2 instanceof ad.f ? (ad.f) iVar2 : null;
            if (fVar2 == null || (callback = fVar2.f1225a) == null) {
                bd.b bVar8 = this.f47444d;
                bd.a aVar = bVar8 instanceof bd.a ? (bd.a) bVar8 : null;
                callback = aVar != null ? aVar.f6105b : null;
            }
            if (callback instanceof ImageView) {
                Bitmap.Config[] configArr2 = ed.k.f15927a;
                ImageView.ScaleType scaleType2 = ((ImageView) callback).getScaleType();
                int i11 = scaleType2 == null ? -1 : ed.j.$EnumSwitchMapping$1[scaleType2.ordinal()];
                gVar = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? ad.g.FIT : ad.g.FILL;
            } else {
                gVar = ad.g.FIT;
            }
        }
        ad.g gVar2 = gVar;
        y8.c cVar4 = this.f47453n;
        p pVar = cVar4 != null ? new p(a.a.P(cVar4.f45424a)) : null;
        if (pVar == null) {
            pVar = p.f47506b;
        }
        return new k(context, obj, bVar, jVar, bVar2, config, dVar, list, dVar3, tVar, sVar2, this.f47451k, zBooleanValue, false, this.f47452m, bVar3, bVar4, bVar5, xVar2, xVar3, xVar, xVar5, lifecycle2, iVar, gVar2, pVar, this.f47454o, this.f47455p, this.f47456q, this.f47457r, this.f47458s, this.f47459t, new d(this.f47460u, this.f47448h, this.l), this.f47442b);
    }

    public final void b(ImageView imageView) {
        this.f47444d = new bd.a(imageView);
        this.f47461v = null;
        this.f47462w = null;
        this.f47463x = null;
    }

    public i(Context context) {
        this.f47441a = context;
        this.f47442b = ed.h.f15926a;
        this.f47443c = null;
        this.f47444d = null;
        this.f47445e = null;
        this.f47446f = null;
        this.f47447g = n0.f26529a;
        this.f47448h = null;
        this.f47449i = null;
        this.f47450j = null;
        this.f47451k = true;
        this.l = null;
        this.f47452m = true;
        this.f47453n = null;
        this.f47454o = null;
        this.f47455p = null;
        this.f47456q = null;
        this.f47457r = null;
        this.f47458s = null;
        this.f47459t = null;
        this.f47460u = null;
        this.f47461v = null;
        this.f47462w = null;
        this.f47463x = null;
    }
}
