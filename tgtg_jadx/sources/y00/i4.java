package y00;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i4 implements q4, d6.i0, r5.g0, a30.c, bg.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44863b;

    public i4(long[] jArr) {
        q1.j0 j0Var;
        this.f44862a = 6;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            j0Var = new q1.j0(jArrCopyOf.length);
            int i11 = j0Var.f35832b;
            if (i11 < 0) {
                org.bouncycastle.jce.provider.a.v("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i11;
                long[] jArr2 = j0Var.f35831a;
                if (jArr2.length < length) {
                    j0Var.f35831a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                }
                long[] jArr3 = j0Var.f35831a;
                int i12 = j0Var.f35832b;
                if (i11 != i12) {
                    kotlin.collections.x.g(jArrCopyOf.length + i11, jArr3, i11, jArr3, i12);
                }
                kotlin.collections.x.g(i11, jArrCopyOf, 0, jArr3, jArrCopyOf.length);
                j0Var.f35832b += jArrCopyOf.length;
            }
        } else {
            j0Var = new q1.j0(16);
        }
        this.f44863b = j0Var;
    }

    @Override // a30.c
    public Object a() {
        z20.e eVar = (z20.e) ((a30.c) this.f44863b).a();
        if (eVar != null) {
            return eVar;
        }
        c50.w.l("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    @Override // y00.q4
    public void b(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        l4 l4Var = (l4) this.f44863b;
        if (!zIsEmpty) {
            l4Var.d().y(new h7.h1(this, str, str2, bundle, false, 10));
            return;
        }
        n1 n1Var = l4Var.l;
        if (n1Var != null) {
            w0 w0Var = n1Var.f44987f;
            n1.m(w0Var);
            w0Var.f45260g.b(str2, "AppId not known when logging event");
        }
    }

    @Override // r5.g0
    public r5.e0 c(m5.h hVar) {
        String str;
        hVar.getClass();
        if (hVar.f29538b.length() > 0) {
            str = "+" + ((Object) hVar);
        } else {
            str = "";
        }
        return new r5.e0(new m5.h(str), (c0) this.f44863b);
    }

    public void d(zw.o oVar) {
        if (((ArrayList) this.f44863b) == null) {
            this.f44863b = new ArrayList();
        }
        int i11 = 0;
        while (true) {
            int size = ((ArrayList) this.f44863b).size();
            ArrayList arrayList = (ArrayList) this.f44863b;
            if (i11 >= size) {
                arrayList.add(oVar);
                return;
            } else {
                if (((zw.o) arrayList.get(i11)).f48304a.f48320b > oVar.f48304a.f48320b) {
                    ((ArrayList) this.f44863b).add(i11, oVar);
                    return;
                }
                i11++;
            }
        }
    }

    @Override // d6.i0
    public long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        long j12 = ((z5.j) ((Function0) this.f44863b).invoke()).f47280a;
        return (((long) y1.b.a(kVar.f47282a + ((int) (j12 >> 32)), (int) (j11 >> 32), (int) (j9 >> 32), mVar == z5.m.Ltr)) << 32) | (((long) y1.b.a(kVar.f47283b + ((int) (j12 & 4294967295L)), (int) (j11 & 4294967295L), (int) (j9 & 4294967295L), true)) & 4294967295L);
    }

    public void f(i4 i4Var) {
        if (((ArrayList) i4Var.f44863b) == null) {
            return;
        }
        if (((ArrayList) this.f44863b) == null) {
            this.f44863b = new ArrayList(((ArrayList) i4Var.f44863b).size());
        }
        Iterator it = ((ArrayList) i4Var.f44863b).iterator();
        while (it.hasNext()) {
            d((zw.o) it.next());
        }
    }

    @Override // bg.c0
    public void h(String str) {
        str.getClass();
        RecommendStoreFragment recommendStoreFragment = (RecommendStoreFragment) this.f44863b;
        recommendStoreFragment.u().f48070i = kotlin.text.y.n(str, "+", "", false);
        RecommendStoreFragment.t(recommendStoreFragment);
    }

    public String toString() {
        switch (this.f44862a) {
            case 8:
                if (((ArrayList) this.f44863b) == null) {
                    return "";
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = ((ArrayList) this.f44863b).iterator();
                while (it.hasNext()) {
                    sb2.append(((zw.o) it.next()).toString());
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public i4(int i11) {
        this.f44862a = i11;
        switch (i11) {
            case 3:
                s0.r1 r1Var = y.c.f44524a;
                this.f44863b = (CloseCameraDeviceOnCameraGraphCloseQuirk) y.c.a().b(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                break;
            case 8:
                this.f44863b = null;
                break;
            default:
                this.f44863b = new c0(9);
                break;
        }
    }

    public /* synthetic */ i4(Object obj, int i11) {
        this.f44862a = i11;
        this.f44863b = obj;
    }
}
