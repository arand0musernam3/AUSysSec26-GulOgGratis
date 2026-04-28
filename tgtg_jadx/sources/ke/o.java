package ke;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f26331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f26332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f26333k;
    public final i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ub.a f26334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ub.a f26335n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.f26331i = new PointF();
        this.f26332j = new PointF();
        this.f26333k = iVar;
        this.l = iVar2;
        j(this.f26304d);
    }

    @Override // ke.e
    public final Object f() {
        return m();
    }

    @Override // ke.e
    public final /* bridge */ /* synthetic */ Object g(we.a aVar, float f11) {
        return m();
    }

    @Override // ke.e
    public final void j(float f11) {
        i iVar = this.f26333k;
        iVar.j(f11);
        i iVar2 = this.l;
        iVar2.j(f11);
        this.f26331i.set(((Float) iVar.f()).floatValue(), ((Float) iVar2.f()).floatValue());
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f26301a;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i11)).a();
            i11++;
        }
    }

    public final PointF m() {
        Float f11;
        i iVar;
        we.a aVarB;
        i iVar2;
        we.a aVarB2;
        Float f12 = null;
        if (this.f26334m == null || (aVarB2 = (iVar2 = this.f26333k).b()) == null) {
            f11 = null;
        } else {
            Float f13 = aVarB2.f43394h;
            ub.a aVar = this.f26334m;
            float f14 = aVarB2.f43393g;
            f11 = (Float) aVar.x(f14, f13 == null ? f14 : f13.floatValue(), (Float) aVarB2.f43388b, (Float) aVarB2.f43389c, iVar2.d(), iVar2.e(), iVar2.f26304d);
        }
        if (this.f26335n != null && (aVarB = (iVar = this.l).b()) != null) {
            Float f15 = aVarB.f43394h;
            ub.a aVar2 = this.f26335n;
            float f16 = aVarB.f43393g;
            f12 = (Float) aVar2.x(f16, f15 == null ? f16 : f15.floatValue(), (Float) aVarB.f43388b, (Float) aVarB.f43389c, iVar.d(), iVar.e(), iVar.f26304d);
        }
        PointF pointF = this.f26331i;
        PointF pointF2 = this.f26332j;
        if (f11 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f12.floatValue());
        return pointF2;
    }
}
