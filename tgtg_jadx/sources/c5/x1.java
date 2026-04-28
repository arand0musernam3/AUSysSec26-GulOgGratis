package c5;

import androidx.compose.ui.node.Owner;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.d3 f7409a = new m3.d3(q0.f7328h);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m3.d3 f7410b = new m3.d3(q0.f7329i);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m3.d3 f7411c = new m3.d3(q0.f7331k);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m3.d3 f7412d = new m3.d3(q0.f7330j);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m3.d3 f7413e = new m3.d3(q0.f7332m);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m3.d3 f7414f = new m3.d3(q0.l);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m3.d3 f7415g = new m3.d3(q0.f7338s);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m3.d3 f7416h = new m3.d3(q0.f7334o);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m3.d3 f7417i = new m3.d3(q0.f7335p);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m3.d3 f7418j = new m3.d3(q0.f7337r);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m3.d3 f7419k = new m3.d3(q0.f7336q);
    public static final m3.d3 l = new m3.d3(q0.f7339t);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m3.d3 f7420m = new m3.d3(q0.f7340u);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m3.d3 f7421n = new m3.d3(q0.f7341v);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m3.d3 f7422o = new m3.d3(q0.f7345z);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m3.d3 f7423p = new m3.d3(q0.f7344y);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m3.d3 f7424q = new m3.d3(q0.A);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m3.d3 f7425r = new m3.d3(q0.B);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m3.d3 f7426s = new m3.d3(q0.C);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m3.d3 f7427t = new m3.d3(q0.D);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m3.d3 f7428u = new m3.d3(q0.f7342w);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m3.e0 f7429v = new m3.e0(q0.f7343x);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m3.d3 f7430w = new m3.d3(q0.f7333n);

    public static final void a(Owner owner, f1 f1Var, Function2 function2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1925803616);
        int i12 = i11 | (sVar.f(owner) ? 4 : 2) | (sVar.f(f1Var) ? 32 : 16) | (sVar.h(function2) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            y yVar = (y) owner;
            m3.v1 v1VarA = f7409a.a(yVar.getAccessibilityManager());
            m3.v1 v1VarA2 = f7410b.a(yVar.getAutofill());
            m3.v1 v1VarA3 = f7412d.a(yVar.getAutofillManager());
            m3.v1 v1VarA4 = f7411c.a(yVar.getAutofillTree());
            m3.v1 v1VarA5 = f7413e.a(yVar.m66getClipboardManager());
            m3.v1 v1VarA6 = f7414f.a(yVar.m65getClipboard());
            m3.v1 v1VarA7 = f7416h.a(yVar.getDensity());
            m3.v1 v1VarA8 = f7417i.a(yVar.getFocusOwner());
            m3.v1 v1VarA9 = f7418j.a(yVar.getFontLoader());
            v1VarA9.f29468c = false;
            m3.v1 v1VarA10 = f7419k.a(yVar.getFontFamilyResolver());
            v1VarA10.f29468c = false;
            m3.i.b(new m3.v1[]{v1VarA, v1VarA2, v1VarA3, v1VarA4, v1VarA5, v1VarA6, v1VarA7, v1VarA8, v1VarA9, v1VarA10, l.a(yVar.getHapticFeedBack()), f7420m.a(yVar.getInputModeManager()), f7421n.a(yVar.getLayoutDirection()), f7422o.a(yVar.getTextInputService()), f7423p.a(yVar.getSoftwareKeyboardController()), f7424q.a(yVar.getTextToolbar()), f7425r.a(f1Var), f7426s.a(yVar.getViewConfiguration()), f7427t.a(yVar.getWindowInfo()), f7428u.a(yVar.getPointerIconService()), f7415g.a(yVar.getGraphicsContext()), w3.b.f43093a.a(yVar.getRetainedValuesStore())}, function2, sVar, ((i12 >> 3) & 112) | 8);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r0(owner, f1Var, function2, i11, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
