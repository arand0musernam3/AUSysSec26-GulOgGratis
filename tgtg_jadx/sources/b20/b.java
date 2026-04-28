package b20;

import androidx.appcompat.widget.ActionBarContextView;
import com.adyen.checkout.components.core.Address;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h7.d1;
import i0.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import n90.b0;
import n90.g0;
import n90.j;
import n90.n;
import n90.v;
import n90.y;
import o90.k;
import o90.s;
import u70.c;
import u70.o;
import u70.p;
import u70.q;
import y70.d;
import y70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5569c;

    public b(MessageDigest messageDigest, int i11) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f5569c = messageDigest;
        this.f5567a = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(b20.b r13, u70.b r14, z70.a r15) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b20.b.d(b20.b, u70.b, z70.a):java.lang.Object");
    }

    @Override // h7.d1
    public void a() {
        this.f5568b = true;
    }

    @Override // h7.d1
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f5568b = false;
    }

    @Override // h7.d1
    public void c() {
        if (this.f5568b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f5569c;
        actionBarContextView.f1947f = null;
        super/*android.view.View*/.setVisibility(this.f5567a);
    }

    public n e() {
        n b0Var;
        Object obj;
        Object objInvoke;
        w wVar = (w) this.f5569c;
        byte bC = wVar.C();
        if (bC == 1) {
            return g(true);
        }
        if (bC == 0) {
            return g(false);
        }
        if (bC != 6) {
            if (bC == 8) {
                return f();
            }
            w.t(wVar, "Cannot read Json element because of unexpected ".concat(k.s(bC)), 0, null, 6);
            throw null;
        }
        int i11 = this.f5567a + 1;
        this.f5567a = i11;
        if (i11 == 200) {
            s sVar = new s(this, null);
            Unit unit = Unit.f26487a;
            y70.a aVar = u70.a.f40827a;
            c cVar = new c(null);
            cVar.f40829a = sVar;
            cVar.f40830b = unit;
            cVar.f40831c = cVar;
            y70.a aVar2 = u70.a.f40827a;
            cVar.f40832d = aVar2;
            while (true) {
                obj = cVar.f40832d;
                x70.c cVar2 = cVar.f40831c;
                if (cVar2 == null) {
                    break;
                }
                o oVar = q.f40850b;
                if (Intrinsics.areEqual(aVar2, obj)) {
                    try {
                        s sVar2 = cVar.f40829a;
                        Unit unit2 = cVar.f40830b;
                        if (sVar2 == null) {
                            sVar2.getClass();
                            CoroutineContext context = cVar2.getContext();
                            objInvoke = ((i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(sVar2, 3)).invoke(cVar, unit2, context == g.f26549a ? new d(cVar2) : new e(context, cVar2));
                        } else {
                            objInvoke = ((i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(sVar2, 3)).invoke(cVar, unit2, cVar2);
                        }
                        if (objInvoke != y70.a.COROUTINE_SUSPENDED) {
                            cVar2.resumeWith(objInvoke);
                        }
                    } catch (Throwable th2) {
                        o oVar2 = q.f40850b;
                        cVar2.resumeWith(new p(th2));
                    }
                } else {
                    cVar.f40832d = aVar2;
                    cVar2.resumeWith(obj);
                }
            }
            ba0.g.M(obj);
            b0Var = (n) obj;
        } else {
            byte bM = wVar.m((byte) 6);
            if (wVar.C() == 4) {
                w.t(wVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!wVar.i()) {
                    break;
                }
                String strQ = this.f5568b ? wVar.q() : wVar.p();
                wVar.m((byte) 5);
                linkedHashMap.put(strQ, e());
                bM = wVar.l();
                if (bM != 4) {
                    if (bM != 7) {
                        w.t(wVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bM == 6) {
                wVar.m((byte) 7);
            } else if (bM == 4) {
                k.m(wVar, "object");
                throw null;
            }
            b0Var = new b0(linkedHashMap);
        }
        this.f5567a--;
        return b0Var;
    }

    public n90.e f() {
        w wVar = (w) this.f5569c;
        byte bL = wVar.l();
        if (wVar.C() == 4) {
            w.t(wVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (wVar.i()) {
            arrayList.add(e());
            bL = wVar.l();
            if (bL != 4) {
                boolean z11 = bL == 9;
                int i11 = wVar.f22745b;
                if (!z11) {
                    w.t(wVar, "Expected end of the array or comma", i11, null, 4);
                    throw null;
                }
            }
        }
        if (bL == 8) {
            wVar.m((byte) 9);
        } else if (bL == 4) {
            k.m(wVar, "array");
            throw null;
        }
        return new n90.e(arrayList);
    }

    public g0 g(boolean z11) {
        w wVar = (w) this.f5569c;
        String strQ = (this.f5568b || !z11) ? wVar.q() : wVar.p();
        return (z11 || !Intrinsics.areEqual(strQ, Address.ADDRESS_NULL_PLACEHOLDER)) ? new v(strQ, z11, null) : y.INSTANCE;
    }

    public b(j jVar, w wVar) {
        this.f5569c = wVar;
        this.f5568b = jVar.f30773c;
    }

    public b(FloatingActionButton floatingActionButton) {
        this.f5568b = false;
        this.f5567a = 0;
        this.f5569c = floatingActionButton;
    }

    public b(ActionBarContextView actionBarContextView) {
        this.f5569c = actionBarContextView;
        this.f5568b = false;
    }
}
