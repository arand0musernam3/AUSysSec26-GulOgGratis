package c5;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f7113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7114b;

    public b(int i11, boolean z11) {
        switch (i11) {
            case 3:
                this.f7113a = w.b.q(1);
                this.f7114b = new v80.q();
                break;
            default:
                this.f7114b = new int[2];
                break;
        }
    }

    public static float i(int i11, int i12, int i13) {
        return xz.b.n((i11 - i12) / i13, 0.0f, 1.0f);
    }

    public abstract void d();

    public void e() {
        tx.d dVar = (tx.d) this.f7113a;
        if (dVar != null) {
            try {
                ((androidx.appcompat.app.a) this.f7114b).f1787k.unregisterReceiver(dVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f7113a = null;
        }
    }

    public abstract IntentFilter f();

    public abstract int[] g(int i11);

    public abstract int h();

    public MenuItem j(MenuItem menuItem) {
        if (!(menuItem instanceof a7.a)) {
            return menuItem;
        }
        a7.a aVar = (a7.a) menuItem;
        if (((q1.k1) this.f7114b) == null) {
            this.f7114b = new q1.k1(0);
        }
        MenuItem menuItem2 = (MenuItem) ((q1.k1) this.f7114b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        o.s sVar = new o.s((Context) this.f7113a, aVar);
        ((q1.k1) this.f7114b).put(aVar, sVar);
        return sVar;
    }

    public int[] k(int i11, int i12) {
        if (i11 < 0 || i12 < 0 || i11 == i12) {
            return null;
        }
        int[] iArr = (int[]) this.f7114b;
        iArr[0] = i11;
        iArr[1] = i12;
        return iArr;
    }

    public String l() {
        String str = (String) this.f7113a;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(TextBundle.TEXT_ENTRY);
        return null;
    }

    public abstract void m();

    public boolean n() {
        return ((androidx.activity.e0) this.f7113a).isEnabled() && ((f.a) this.f7114b).f36373e;
    }

    public abstract void p();

    public abstract void s();

    public abstract int[] t(int i11);

    public abstract void u(i20.c cVar);

    public abstract void v();

    public void w() {
        e();
        IntentFilter intentFilterF = f();
        if (intentFilterF.countActions() == 0) {
            return;
        }
        if (((tx.d) this.f7113a) == null) {
            this.f7113a = new tx.d(this, 5);
        }
        ((androidx.appcompat.app.a) this.f7114b).f1787k.registerReceiver((tx.d) this.f7113a, intentFilterF);
    }

    public abstract void x();

    public abstract void y();

    public void o() {
    }

    public void r() {
    }

    public void q(androidx.activity.b bVar) {
    }

    public b(Context context) {
        this.f7113a = context;
    }

    public b(int i11) {
        this.f7114b = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            ((ArrayList) this.f7114b).add(new i20.o());
        }
    }

    public b(q9.g gVar) {
        this.f7113a = new androidx.activity.e0(this, false, 11);
        this.f7114b = new f.a(this, gVar);
    }

    public b(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        this.f7113a = str;
        this.f7114b = bundle;
    }

    public b(androidx.appcompat.app.a aVar) {
        this.f7114b = aVar;
    }
}
