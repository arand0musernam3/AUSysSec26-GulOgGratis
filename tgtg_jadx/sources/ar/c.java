package ar;

import b2.k;
import com.app.tgtg.model.remote.user.response.MonthlyMoneySaved;
import g3.c4;
import g3.d9;
import g3.g9;
import g3.na;
import i3.r;
import i4.v;
import i4.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import l3.h0;
import m3.i;
import m3.n;
import m3.s;
import s1.d1;
import t1.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4740a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4745f;

    public /* synthetic */ c(MonthlyMoneySaved monthlyMoneySaved, Function0 function0, Function0 function02, boolean z11, boolean z12, int i11) {
        this.f4743d = monthlyMoneySaved;
        this.f4744e = function0;
        this.f4745f = function02;
        this.f4741b = z11;
        this.f4742c = z12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4740a) {
            case 0:
                ((Integer) obj2).getClass();
                a.b((MonthlyMoneySaved) this.f4743d, (Function0) this.f4744e, (Function0) this.f4745f, this.f4741b, this.f4742c, (n) obj, i.F(1));
                break;
            case 1:
                c4 c4Var = (c4) this.f4743d;
                b1 b1Var = (b1) this.f4744e;
                Function2 function2 = (Function2) this.f4745f;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r.d(((v) d1.a(!this.f4742c ? c4Var.f18414g : this.f4741b ? c4Var.f18409b : c4Var.f18412e, b1Var, null, sVar, 0, 12).getValue()).f23317a, na.a(h0.f26973h, sVar), function2, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                k kVar = (k) this.f4743d;
                d9 d9Var = (d9) this.f4744e;
                v0 v0Var = (v0) this.f4745f;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g9.f18691a.a(this.f4741b, this.f4742c, kVar, d9Var, v0Var, sVar2, 114822144);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(c4 c4Var, boolean z11, boolean z12, b1 b1Var, Function2 function2) {
        this.f4743d = c4Var;
        this.f4741b = z11;
        this.f4742c = z12;
        this.f4744e = b1Var;
        this.f4745f = function2;
    }

    public /* synthetic */ c(boolean z11, boolean z12, k kVar, d9 d9Var, v0 v0Var) {
        this.f4741b = z11;
        this.f4742c = z12;
        this.f4743d = kVar;
        this.f4744e = d9Var;
        this.f4745f = v0Var;
    }
}
