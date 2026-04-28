package i30;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import kotlin.Unit;
import n7.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23220a;

    public g(Context context, int i11) {
        switch (i11) {
            case 1:
                context.getClass();
                this.f23220a = context;
                break;
            default:
                this.f23220a = context;
                break;
        }
    }

    public static Object c(Context context, s sVar, jv.d dVar) {
        v80.l lVar = new v80.l(1, y70.f.b(dVar));
        lVar.t();
        CancellationSignal cancellationSignal = new CancellationSignal();
        lVar.v(new n7.j(cancellationSignal, 1));
        n7.k kVar = new n7.k(lVar);
        l0.b bVar = new l0.b(0);
        context.getClass();
        sVar.getClass();
        n7.n nVarC = ky.b.c(new ky.b(context, 2), sVar);
        if (nVarC == null) {
            kVar.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            nVarC.onGetCredential(context, sVar, cancellationSignal, bVar, kVar);
        }
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    @Override // i30.h
    public Object a() {
        return this.f23220a;
    }

    public Object b(n7.a aVar, jv.c cVar) {
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        CancellationSignal cancellationSignal = new CancellationSignal();
        lVar.v(new n7.j(cancellationSignal, 0));
        f90.b bVar = new f90.b(lVar);
        l0.b bVar2 = new l0.b(0);
        n7.n nVarC = ky.b.c(new ky.b(this.f23220a, 2), aVar.f30671a);
        if (nVarC == null) {
            bVar.a(new ClearCredentialProviderConfigurationException());
        } else {
            nVarC.onClearCredential(aVar, cancellationSignal, bVar2, bVar);
        }
        Object objS = lVar.s();
        return objS == y70.a.COROUTINE_SUSPENDED ? objS : Unit.f26487a;
    }
}
