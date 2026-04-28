package x90;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44124a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f44125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f44127d;

    public /* synthetic */ j(n nVar, int i11, List list) {
        this.f44125b = nVar;
        this.f44126c = i11;
        this.f44127d = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f44124a) {
            case 0:
                n nVar = this.f44125b;
                int i11 = this.f44126c;
                nVar.f44142k.getClass();
                try {
                    nVar.f44153w.u(i11, b.CANCEL);
                    synchronized (nVar) {
                        nVar.f44155y.remove(Integer.valueOf(i11));
                    }
                } catch (IOException unused) {
                }
                return Unit.f26487a;
            default:
                n nVar2 = this.f44125b;
                int i12 = this.f44126c;
                nVar2.f44142k.getClass();
                try {
                    nVar2.f44153w.u(i12, b.CANCEL);
                    synchronized (nVar2) {
                        nVar2.f44155y.remove(Integer.valueOf(i12));
                    }
                } catch (IOException unused2) {
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ j(n nVar, int i11, List list, boolean z11) {
        this.f44125b = nVar;
        this.f44126c = i11;
        this.f44127d = list;
    }
}
