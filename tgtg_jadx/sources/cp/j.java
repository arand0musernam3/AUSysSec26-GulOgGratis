package cp;

import ek.q;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m3.b1;
import m90.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13391d;

    public /* synthetic */ j(int i11, String str, y yVar) {
        this.f13388a = 2;
        this.f13389b = i11;
        this.f13390c = str;
        this.f13391d = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13388a) {
            case 0:
                Function1 function1 = (Function1) this.f13390c;
                ((b1) this.f13391d).setValue(Boolean.TRUE);
                function1.invoke(Integer.valueOf(this.f13389b + 1));
                return Unit.f26487a;
            case 1:
                q qVar = (q) this.f13390c;
                Object obj = ((hk.c) this.f13391d).f22091c.get(this.f13389b);
                obj.getClass();
                hk.d dVar = (hk.d) obj;
                qVar.getClass();
                hk.b bVar = dVar.f22101i;
                if (bVar == hk.b.WEBVIEW_JOIN_AS_A_STORE) {
                    qVar.c(ek.l.f16062e);
                } else if (bVar == hk.b.CONTACT_US_SUGGEST_STORE) {
                    qVar.c(ek.l.f16060c);
                } else {
                    qVar.f16075k = dVar;
                    qVar.c(new ek.f());
                }
                return Unit.f26487a;
            case 2:
                String str = (String) this.f13390c;
                y yVar = (y) this.f13391d;
                int i11 = this.f13389b;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    serialDescriptorArr[i12] = ox.h.p(str + '.' + yVar.f29783e[i12], k90.j.f26242m, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            default:
                x90.n nVar = (x90.n) this.f13390c;
                int i13 = this.f13389b;
                x90.b bVar2 = (x90.b) this.f13391d;
                try {
                    bVar2.getClass();
                    nVar.f44153w.u(i13, bVar2);
                    break;
                } catch (IOException e5) {
                    x90.b bVar3 = x90.b.PROTOCOL_ERROR;
                    nVar.a(bVar3, bVar3, e5);
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ j(q qVar, hk.c cVar, int i11) {
        this.f13388a = 1;
        this.f13390c = qVar;
        this.f13391d = cVar;
        this.f13389b = i11;
    }

    public /* synthetic */ j(Object obj, int i11, Object obj2, int i12) {
        this.f13388a = i12;
        this.f13390c = obj;
        this.f13389b = i11;
        this.f13391d = obj2;
    }
}
