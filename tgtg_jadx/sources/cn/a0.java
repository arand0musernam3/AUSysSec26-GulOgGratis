package cn;

import android.os.Parcelable;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import d2.j2;
import g3.f6;
import g3.r9;
import kotlin.Unit;
import m3.c3;
import z4.m1;
import z4.t0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0 implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8472c;

    public /* synthetic */ a0(Parcelable parcelable, boolean z11, int i11) {
        this.f8470a = i11;
        this.f8472c = parcelable;
        this.f8471b = z11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f8470a) {
            case 0:
                SortingChoice sortingChoice = (SortingChoice) this.f8472c;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j2) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    r9.d(String.valueOf(sortingChoice.getTitle()), null, this.f8471b ? lv.s.J : lv.s.f28215a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28282v, sVar, 0, 12582912, 131066);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            default:
                c3 c3Var = (c3) this.f8472c;
                m1 m1VarD = ((t0) obj2).D(((z5.a) obj3).f47271a);
                return w0.f((w0) obj, m1VarD.f47183a, m1VarD.f47184b, new f6(c3Var, this.f8471b, m1VarD, 0));
        }
    }
}
