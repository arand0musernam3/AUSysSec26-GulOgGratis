package com.tgtg.componentlibrary.component.p000switch;

import b4.a;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import d2.p;
import e0.f;
import gt.e;
import j5.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import r8.k;
import u3.d;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f13299c;

    public /* synthetic */ b(String str, d dVar, int i11) {
        this.f13297a = 0;
        this.f13298b = str;
        this.f13299c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f13297a) {
            case 0:
                num.getClass();
                DemoPantrySwitchKt.a(this.f13298b, this.f13299c, nVar, i.F(55));
                break;
            case 1:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = this.f13298b;
                    boolean zF = sVar.f(str);
                    Object objM = sVar.M();
                    if (zF || objM == m.f29332a) {
                        objM = new e(str, 7);
                        sVar.k0(objM);
                    }
                    t tVarC = r.c(q.f5711a, false, (Function1) objM);
                    u0 u0VarD = p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC2 = a.c(tVarC, sVar);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    i.C(u0VarD, b5.i.f5843f, sVar);
                    i.C(iVarL, b5.i.f5842e, sVar);
                    g gVar = b5.i.f5844g;
                    if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                        f.y(iHashCode, sVar, iHashCode, gVar);
                    }
                    i.C(tVarC2, b5.i.f5841d, sVar);
                    k.w(0, this.f13299c, sVar, true);
                } else {
                    sVar.U();
                }
                break;
            default:
                int iIntValue2 = num.intValue();
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str2 = this.f13298b;
                    boolean zF2 = sVar2.f(str2);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == m.f29332a) {
                        objM2 = new qb.s(str2, 26);
                        sVar2.k0(objM2);
                    }
                    t tVarC3 = r.c(q.f5711a, false, (Function1) objM2);
                    u0 u0VarD2 = p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    t tVarC4 = a.c(tVarC3, sVar2);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    i.C(u0VarD2, b5.i.f5843f, sVar2);
                    i.C(iVarL2, b5.i.f5842e, sVar2);
                    i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    i.z(sVar2, b5.i.f5845h);
                    i.C(tVarC4, b5.i.f5841d, sVar2);
                    k.w(0, this.f13299c, sVar2, true);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(String str, d dVar, int i11, byte b8) {
        this.f13297a = i11;
        this.f13298b = str;
        this.f13299c = dVar;
    }
}
