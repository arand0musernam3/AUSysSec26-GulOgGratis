package e20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.braze.h2;
import com.google.android.material.chip.Chip;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import q90.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f15581e;

    public a(Context context, String str, androidx.constraintlayout.widget.z zVar, boolean z11, boolean z12) {
        context.getClass();
        zVar.getClass();
        this.f15579c = context;
        this.f15580d = str;
        this.f15581e = zVar;
        this.f15577a = z11;
        this.f15578b = z12;
    }

    public static IOException a(a aVar, boolean z11, IOException iOException, int i11) {
        boolean z12 = (i11 & 4) == 0;
        boolean z13 = (i11 & 8) == 0;
        if (iOException != null) {
            aVar.i(iOException);
        }
        return ((u90.n) aVar.f15579c).j(aVar, z13 && !z11, z12 && !z11, z12 && z11, z13 && z11, iOException);
    }

    public boolean b(Chip chip) {
        int id2 = chip.getId();
        HashSet hashSet = (HashSet) this.f15580d;
        if (hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        Chip chip2 = (Chip) ((HashMap) this.f15579c).get(Integer.valueOf(f()));
        if (chip2 != null) {
            j(chip2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id2));
        if (!chip.isChecked()) {
            chip.setChecked(true);
        }
        return zAdd;
    }

    public u90.e c(q90.g0 g0Var, boolean z11) {
        g0Var.getClass();
        this.f15577a = z11;
        q90.n0 n0Var = g0Var.f36508d;
        n0Var.getClass();
        long jContentLength = n0Var.contentLength();
        return new u90.e(this, ((v90.e) this.f15581e).c(g0Var, jContentLength), jContentLength, false);
    }

    public ArrayList d(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.f15580d);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof Chip) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public u90.o e() {
        v90.d dVarH = ((v90.e) this.f15581e).h();
        u90.o oVar = dVarH instanceof u90.o ? (u90.o) dVarH : null;
        if (oVar != null) {
            return oVar;
        }
        h2.b("no connection for CONNECT tunnels");
        return null;
    }

    public int f() {
        HashSet hashSet = (HashSet) this.f15580d;
        if (!this.f15577a || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void g() {
        t10.c cVar = (t10.c) this.f15581e;
        if (cVar != null) {
            new HashSet((HashSet) this.f15580d);
            t10.d dVar = (t10.d) cVar.f39648a;
            t10.f fVar = dVar.f39651g;
            if (fVar != null) {
                dVar.f39652h.d(dVar);
                t10.d dVar2 = (t10.d) ((m1.a) fVar).f28697a;
                if (dVar2.f39652h.f15577a) {
                    dVar2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public o0 h(boolean z11) throws IOException {
        try {
            o0 o0VarD = ((v90.e) this.f15581e).d(z11);
            if (o0VarD == null) {
                return o0VarD;
            }
            o0VarD.f36579n = this;
            return o0VarD;
        } catch (IOException e5) {
            i(e5);
            throw e5;
        }
    }

    public void i(IOException iOException) {
        this.f15578b = true;
        ((v90.e) this.f15581e).h().d((u90.n) this.f15579c, iOException);
    }

    public boolean j(Chip chip, boolean z11) {
        int id2 = chip.getId();
        HashSet hashSet = (HashSet) this.f15580d;
        if (!hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z11 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id2))) {
            chip.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id2));
        if (chip.isChecked()) {
            chip.setChecked(false);
        }
        return zRemove;
    }

    public t5.a k() throws SocketException {
        u90.n nVar = (u90.n) this.f15579c;
        if (nVar.f40932j) {
            h2.b("Check failed.");
            return null;
        }
        nVar.f40932j = true;
        nVar.f40927e.j();
        synchronized (nVar) {
            if (nVar.f40939r == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (nVar.f40935n || nVar.f40936o) {
                throw new IllegalStateException("Check failed.");
            }
            if (nVar.l) {
                throw new IllegalStateException("Check failed.");
            }
            if (!nVar.f40934m) {
                throw new IllegalStateException("Check failed.");
            }
            nVar.f40934m = false;
            nVar.f40935n = true;
            nVar.f40936o = true;
        }
        v90.d dVarH = ((v90.e) this.f15581e).h();
        dVarH.getClass();
        u90.o oVar = (u90.o) dVarH;
        oVar.f40944e.setSoTimeout(0);
        oVar.e();
        return new t5.a(this);
    }

    public a() {
        this.f15579c = new HashMap();
        this.f15580d = new HashSet();
    }

    public a(u90.n nVar, u90.g gVar, v90.e eVar) {
        gVar.getClass();
        this.f15579c = nVar;
        this.f15580d = gVar;
        this.f15581e = eVar;
    }
}
