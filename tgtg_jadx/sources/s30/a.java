package s30;

import k30.d;
import k30.h;
import k30.m;
import k30.x;
import m0.c;
import y00.c2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f38830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f38831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f38832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f38833d;

    static {
        int i11 = m.f25911c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f38830a = m.l(15, objArr);
        d dVar = h.f25901b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        c.T(7, objArr2);
        f38831b = h.j(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        c.T(3, objArr3);
        f38832c = h.j(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        c.T(2, objArr4);
        f38833d = h.j(2, objArr4);
        k30.c cVar = new k30.c(4);
        cVar.b(c2.l);
        cVar.b(c2.f44658m);
        cVar.e();
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        c.T(2, objArr5);
        h.j(2, objArr5);
    }
}
