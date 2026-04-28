package a3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import g3.ea;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f297k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(Object obj, x70.c cVar, int i11) {
        super(1, cVar);
        this.f296j = i11;
        this.l = obj;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        switch (this.f296j) {
            case 0:
                return new c2((j2) this.l, cVar, 0);
            case 1:
                return new c2((l3) this.l, cVar, 1);
            case 2:
                return new c2((b0.r0) this.l, cVar, 2);
            case 3:
                return new c2((b0.x2) this.l, cVar, 3);
            case 4:
                return new c2((f8.b) this.l, cVar, 4);
            case 5:
                return new c2((d8.v) this.l, cVar, 5);
            case 6:
                return new c2((f0.w0) this.l, cVar, 6);
            case 7:
                return new c2((ea) this.l, cVar, 7);
            case 8:
                return new c2((gt.n) this.l, cVar, 8);
            case 9:
                return new c2((v1.u) this.l, cVar, 9);
            default:
                return new c2((w2.v0) this.l, cVar, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x70.c cVar = (x70.c) obj;
        switch (this.f296j) {
        }
        return ((c2) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Context context;
        String str;
        switch (this.f296j) {
            case 0:
                j2 j2Var = (j2) this.l;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f297k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    Pair pairD = j2Var.d();
                    if (pairD != null) {
                        m5.h hVar = (m5.h) pairD.f26485a;
                        long j9 = ((m5.t0) pairD.f26486b).f29650a;
                        u uVar = j2Var.f423w;
                        if (uVar != null) {
                            this.f297k = 1;
                            Object objD = ((b0) uVar).d(hVar, j9, this);
                            if (objD != aVar) {
                                objD = Unit.f26487a;
                            }
                            if (objD == aVar) {
                                return aVar;
                            }
                        }
                    }
                } else {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 1:
                l3 l3Var = (l3) this.l;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f297k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    this.f297k = 1;
                    if (l3Var.s(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                        l3Var.A = true;
                        return Unit.f26487a;
                    }
                    ba0.g.M(obj);
                }
                Pair pairA = l3.a(l3Var);
                if (pairA != null) {
                    String str2 = (String) pairA.f26485a;
                    long j11 = ((m5.t0) pairA.f26486b).f29650a;
                    u uVar2 = l3Var.f456i;
                    if (uVar2 != null) {
                        this.f297k = 2;
                        Object objD2 = ((b0) uVar2).d(str2, j11, this);
                        if (objD2 != aVar2) {
                            objD2 = Unit.f26487a;
                        }
                        if (objD2 == aVar2) {
                            return aVar2;
                        }
                    }
                }
                l3Var.A = true;
                return Unit.f26487a;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f297k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                b0.r0 r0Var = (b0.r0) this.l;
                this.f297k = 1;
                Object objI = r0Var.i(this);
                return objI == aVar3 ? aVar3 : objI;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f297k;
                try {
                    if (i14 == 0) {
                        ba0.g.M(obj);
                        if (wd.a.B(3, "CXCP")) {
                            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOnAsync");
                        }
                        i0.b bVarA = ((b0.x2) this.l).f5493c.a();
                        this.f297k = 1;
                        obj = bVarA.e(this);
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i14 != 1) {
                            com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                    }
                    AutoCloseable autoCloseable = (AutoCloseable) obj;
                    try {
                        v80.q qVarG = ((i0.c) autoCloseable).g();
                        w.b.y(autoCloseable, null);
                        return qVarG;
                    } finally {
                    }
                } catch (CancellationException e5) {
                    if (wd.a.B(3, "CXCP")) {
                        Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e5);
                    }
                    return b0.x2.l;
                }
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f297k;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ba0.g.M(obj);
                        return Unit.f26487a;
                    }
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                f8.b bVar = (f8.b) this.l;
                this.f297k = 1;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) bVar.f17510e.getValue()).edit();
                LinkedHashSet linkedHashSet = bVar.f17511f;
                if (linkedHashSet == null) {
                    editorEdit.clear();
                } else {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        editorEdit.remove((String) it.next());
                    }
                }
                if (!editorEdit.commit()) {
                    i4.a.k("Unable to delete migrated keys from SharedPreferences.");
                    return null;
                }
                if (((SharedPreferences) bVar.f17510e.getValue()).getAll().isEmpty() && (context = bVar.f17508c) != null && (str = bVar.f17509d) != null) {
                    context.deleteSharedPreferences(str);
                }
                if (linkedHashSet != null) {
                    linkedHashSet.clear();
                }
                if (Unit.f26487a == aVar5) {
                    return aVar5;
                }
                return Unit.f26487a;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f297k;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                d8.v vVar = (d8.v) this.l;
                this.f297k = 1;
                Object objInvoke = vVar.invoke(this);
                return objInvoke == aVar6 ? aVar6 : objInvoke;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f297k;
                if (i17 == 0) {
                    ba0.g.M(obj);
                    f0.w0 w0Var = (f0.w0) this.l;
                    this.f297k = 1;
                    Object objM = w0Var.l.m(this);
                    if (objM != aVar7) {
                        objM = Unit.f26487a;
                    }
                    if (objM == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i17 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f297k;
                if (i18 == 0) {
                    ba0.g.M(obj);
                    ea eaVar = (ea) this.l;
                    this.f297k = 1;
                    v80.l lVar = new v80.l(1, y70.f.b(this));
                    lVar.t();
                    eaVar.f18568b.f39472d.setValue(Boolean.TRUE);
                    eaVar.f18569c = lVar;
                    if (lVar.s() == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i18 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f297k;
                if (i19 != 0) {
                    if (i19 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
                gt.n nVar = (gt.n) this.l;
                this.f297k = 1;
                Object objA = gt.n.a(nVar, 500, this);
                return objA == aVar9 ? aVar9 : objA;
            case 9:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                int i21 = this.f297k;
                if (i21 == 0) {
                    ba0.g.M(obj);
                    v1.u uVar3 = (v1.u) this.l;
                    this.f297k = 1;
                    v80.l lVar2 = new v80.l(1, y70.f.b(this));
                    lVar2.t();
                    uVar3.a(true);
                    uVar3.f41848c = lVar2;
                    if (lVar2.s() == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i21 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            default:
                w2.v0 v0Var = (w2.v0) this.l;
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                int i22 = this.f297k;
                if (i22 == 0) {
                    ba0.g.M(obj);
                    x2.w wVar = v0Var.f43058u;
                    this.f297k = 1;
                    if (wVar.y() == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ba0.g.M(obj);
                        v0Var.f43058u.f43799t.setValue(Boolean.TRUE);
                        return Unit.f26487a;
                    }
                    ba0.g.M(obj);
                }
                u uVar4 = v0Var.A;
                if (uVar4 != null) {
                    CharSequence charSequence = v0Var.f43058u.f43781a.d().f41928c;
                    long j12 = v0Var.f43058u.f43781a.d().f41929d;
                    this.f297k = 2;
                    Object objD3 = ((b0) uVar4).d(charSequence, j12, this);
                    if (objD3 != aVar11) {
                        objD3 = Unit.f26487a;
                    }
                    if (objD3 == aVar11) {
                        return aVar11;
                    }
                }
                v0Var.f43058u.f43799t.setValue(Boolean.TRUE);
                return Unit.f26487a;
        }
    }
}
