package w2;

import android.content.ClipData;
import android.view.DragEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements e4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f42890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pm.m f42891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f42892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f42893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f42894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0 f42895f;

    public f1(z0 z0Var, pm.m mVar, z0 z0Var2, z0 z0Var3, z0 z0Var4, z0 z0Var5) {
        this.f42890a = z0Var;
        this.f42891b = mVar;
        this.f42892c = z0Var2;
        this.f42893d = z0Var3;
        this.f42894e = z0Var4;
        this.f42895f = z0Var5;
    }

    @Override // e4.k
    public final boolean D(e4.d dVar) {
        String string;
        this.f42890a.invoke(dVar);
        DragEvent dragEvent = dVar.f15734a;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        e1 e1Var = (e1) this.f42891b.f35523b;
        e1Var.Q0();
        e1Var.f42880s.d();
        int itemCount = clipData.getItemCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < itemCount; i11++) {
            z11 = z11 || clipData.getItemAt(i11).getText() != null;
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z12 = false;
            for (int i12 = 0; i12 < itemCount2; i12++) {
                CharSequence text = clipData.getItemAt(i12).getText();
                if (text != null) {
                    if (z12) {
                        sb2.append("\n");
                    }
                    sb2.append(text);
                    z12 = true;
                }
            }
            string = sb2.toString();
        } else {
            string = null;
        }
        x1.a.a(e1Var);
        if (string != null) {
            s1.h(e1Var.f42878q, string, null, false, 14);
        }
        return true;
    }

    @Override // e4.k
    public final void E0(e4.d dVar) {
        DragEvent dragEvent = dVar.f15734a;
        float x11 = dragEvent.getX();
        float y5 = dragEvent.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x11)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L);
        e1 e1Var = this.f42893d.f43086b;
        z4.z zVarB = e1Var.f42879r.b();
        if (zVarB != null && zVarB.n()) {
            jFloatToRawIntBits = zVarB.F(jFloatToRawIntBits);
        }
        int iC = e1Var.f42879r.c(jFloatToRawIntBits, true);
        if (iC >= 0) {
            e1Var.f42878q.j(m5.k0.b(iC, iC));
        }
        e1Var.f42880s.z(m2.t0.Cursor, jFloatToRawIntBits);
    }

    @Override // e4.k
    public final void I0(e4.d dVar) {
        this.f42895f.invoke(dVar);
    }

    @Override // e4.k
    public final void Q(e4.d dVar) {
        this.f42894e.invoke(dVar);
    }

    @Override // e4.k
    public final void y(e4.d dVar) {
        this.f42892c.invoke(dVar);
    }

    @Override // e4.k
    public final void z(e4.d dVar) {
    }
}
