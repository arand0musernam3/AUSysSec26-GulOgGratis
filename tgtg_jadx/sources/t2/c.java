package t2;

import b0.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.k1;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import v1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3.d f39662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f39663b = new l1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f39664c = i.w(null);

    public c(u3.d dVar) {
        this.f39662a = dVar;
    }

    @Override // t2.e
    public final Object a(d dVar, z70.i iVar) {
        Object objB = l1.b(this.f39663b, new r2(this, new b(dVar), null, 6), iVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }

    public final void b(final Function0 function0, n nVar, final int i11) {
        final Function0 function02;
        s sVar = (s) nVar;
        sVar.c0(723898654);
        int i12 = (sVar.f(this) ? 32 : 16) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b bVar = (b) this.f39664c.getValue();
            if (bVar == null) {
                w1 w1VarS = sVar.s();
                if (w1VarS != null) {
                    final int i13 = 0;
                    w1VarS.f29476d = new Function2(this, function0, i11, i13) { // from class: t2.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f39657a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c f39658b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Function0 f39659c;

                        {
                            this.f39657a = i13;
                            this.f39658b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = this.f39657a;
                            n nVar2 = (n) obj;
                            ((Integer) obj2).getClass();
                            switch (i14) {
                                case 0:
                                    this.f39658b.b(this.f39659c, nVar2, i.F(7));
                                    break;
                                default:
                                    this.f39658b.b(this.f39659c, nVar2, i.F(7));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    return;
                }
                return;
            }
            function02 = function0;
            this.f39662a.invoke(bVar, bVar.f39660a, function02, sVar, Integer.valueOf(MLKEMEngine.KyberPolyBytes));
        } else {
            function02 = function0;
            sVar.U();
        }
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            final int i14 = 1;
            w1VarS2.f29476d = new Function2(this, function02, i11, i14) { // from class: t2.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f39657a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f39658b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function0 f39659c;

                {
                    this.f39657a = i14;
                    this.f39658b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = this.f39657a;
                    n nVar2 = (n) obj;
                    ((Integer) obj2).getClass();
                    switch (i142) {
                        case 0:
                            this.f39658b.b(this.f39659c, nVar2, i.F(7));
                            break;
                        default:
                            this.f39658b.b(this.f39659c, nVar2, i.F(7));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
        }
    }
}
