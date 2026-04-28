package r2;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.textclassifier.TextClassification;
import b4.q;
import b4.t;
import c5.v0;
import d2.m2;
import go.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m2.b2;
import m3.w1;
import m90.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f37572a = new n();

    public static void c(y1.e eVar, Context context, p2.h hVar) {
        if (context == null) {
            return;
        }
        int i11 = hVar.f34141c;
        TextClassification textClassification = hVar.f34140b;
        if (i11 < 0) {
            pm.m mVar = new pm.m(textClassification, 3);
            Drawable icon = textClassification.getIcon();
            y1.e.b(eVar, mVar, icon != null ? new u3.d(new s(icon, 5), true, -1123224187) : null, new qw.b(6, context, textClassification), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i11);
            y1.e.b(eVar, new pm.m(remoteAction, 4), ((i11 == 0) || remoteAction.shouldShowIcon()) ? new u3.d(new s(remoteAction, 6), true, -1261173016) : null, new b2(remoteAction, 27), 6);
        }
    }

    public final void a(Drawable drawable, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(257732500);
        int i12 = (sVar.h(drawable) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            t tVarM = m2.m(q.f5711a, y1.f.f45364j);
            boolean zH = sVar.h(drawable);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new z0(drawable, 18);
                sVar.k0(objM);
            }
            d2.p.a(f4.g.d(tVarM, (Function1) objM), sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(this, drawable, i11, 26);
        }
    }

    public final void b(final Icon icon, m3.n nVar, final int i11) {
        w1 w1VarS;
        Function2 function2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2116504409);
        int i12 = (sVar.h(icon) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Context context = (Context) sVar.j(v0.f7390b);
            boolean zF = sVar.f(icon) | sVar.f(context);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                objM = icon.loadDrawable(context);
                sVar.k0(objM);
            }
            Drawable drawable = (Drawable) objM;
            if (drawable == null) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    final int i13 = 0;
                    function2 = new Function2(this, icon, i11, i13) { // from class: r2.m

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f37569a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n f37570b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Icon f37571c;

                        {
                            this.f37569a = i13;
                            this.f37570b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = this.f37569a;
                            m3.n nVar2 = (m3.n) obj;
                            ((Integer) obj2).getClass();
                            switch (i14) {
                                case 0:
                                    this.f37570b.b(this.f37571c, nVar2, m3.i.F(49));
                                    break;
                                default:
                                    this.f37570b.b(this.f37571c, nVar2, m3.i.F(49));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    w1VarS.f29476d = function2;
                }
                return;
            }
            a(drawable, sVar, 48);
        } else {
            sVar.U();
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            final int i14 = 1;
            function2 = new Function2(this, icon, i11, i14) { // from class: r2.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f37569a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f37570b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Icon f37571c;

                {
                    this.f37569a = i14;
                    this.f37570b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = this.f37569a;
                    m3.n nVar2 = (m3.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i142) {
                        case 0:
                            this.f37570b.b(this.f37571c, nVar2, m3.i.F(49));
                            break;
                        default:
                            this.f37570b.b(this.f37571c, nVar2, m3.i.F(49));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
            w1VarS.f29476d = function2;
        }
    }
}
