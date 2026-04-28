package n7;

import androidx.credentials.exceptions.GetCredentialException;
import java.io.IOException;
import kotlin.KotlinNullPointerException;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.DispatchException;
import oa0.n0;
import q90.g0;
import q90.p0;
import retrofit2.HttpException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements l, oa0.g, q90.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v80.l f30675a;

    public /* synthetic */ k(v80.l lVar) {
        this.f30675a = lVar;
    }

    @Override // n7.l
    public void a(Object obj) {
        GetCredentialException getCredentialException = (GetCredentialException) obj;
        getCredentialException.getClass();
        v80.l lVar = this.f30675a;
        if (lVar.g()) {
            u70.o oVar = u70.q.f40850b;
            lVar.resumeWith(new u70.p(getCredentialException));
        }
    }

    @Override // q90.i
    public void b(q90.h hVar, p0 p0Var) throws DispatchException {
        this.f30675a.k(p0Var, sd.d.f39008a);
    }

    @Override // q90.i
    public void e(q90.h hVar, IOException iOException) {
        u70.o oVar = u70.q.f40850b;
        this.f30675a.resumeWith(new u70.p(iOException));
    }

    @Override // oa0.g
    public void m(oa0.d dVar, n0 n0Var) {
        boolean z11 = n0Var.f32351a.f36597q;
        v80.l lVar = this.f30675a;
        if (!z11) {
            u70.o oVar = u70.q.f40850b;
            lVar.resumeWith(new u70.p(new HttpException(n0Var)));
            return;
        }
        Object obj = n0Var.f32352b;
        if (obj != null) {
            u70.o oVar2 = u70.q.f40850b;
            lVar.resumeWith(obj);
            return;
        }
        g0 g0VarR = dVar.r();
        g0VarR.getClass();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(oa0.q.class);
        orCreateKotlinClass.getClass();
        Object objCast = y9.w.v(orCreateKotlinClass).cast(g0VarR.f36509e.t(orCreateKotlinClass));
        objCast.getClass();
        oa0.q qVar = (oa0.q) objCast;
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + qVar.f32365a.getName() + '.' + qVar.f32367c.getName() + " was null but response body type was declared as non-null");
        u70.o oVar3 = u70.q.f40850b;
        lVar.resumeWith(new u70.p(kotlinNullPointerException));
    }

    @Override // n7.l
    public void onResult(Object obj) {
        t tVar = (t) obj;
        tVar.getClass();
        v80.l lVar = this.f30675a;
        if (lVar.g()) {
            u70.o oVar = u70.q.f40850b;
            lVar.resumeWith(tVar);
        }
    }

    @Override // oa0.g
    public void p(oa0.d dVar, Throwable th2) {
        u70.o oVar = u70.q.f40850b;
        this.f30675a.resumeWith(new u70.p(th2));
    }
}
